package edu.sr.client;

import edu.sr.generated.example1.*;
import org.omg.CORBA.ORB;
import org.omg.CORBA.StringHolder;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Client {
    private I1 i1;
    private ORB orb;

    public Client(String[] args) {
        initOrb(args);
    }

    private void initOrb(String[] args) {
        // create and initialize the ORB
        orb = ORB.init(args, null);
    }

    // Get the reference to the object based on its IOR and narrow it appropriately
    public void getReferenceFromFile() throws InvalidName, NotFound, CannotProceed, org.omg.CORBA.ORBPackage.InvalidName {
        // get the object reference from IOR
        System.out.println("Getting reference from file:");
        String ref = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("ref1.ior"));
            ref = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        org.omg.CORBA.Object objRef = orb.string_to_object(ref);

        System.out.println(objRef);
        // narrow the reference
        i1 = I1Helper.narrow(objRef);
    }


    // Get the reference to the object using NS and narrow it appropriately
    public void getReferenceFromNameService() throws InvalidName, NotFound, CannotProceed, org.omg.CORBA.ORBPackage.InvalidName {
        System.out.println("Getting reference from NameService:");
        org.omg.CORBA.Object nsRef;

        // get the reference from IOR (it points to NS Object (NS is a CORBA Object, too!)

        nsRef = orb.resolve_initial_references("NameService");
//        nsRef = orb.string_to_object("corbaloc:iiop:127.0.0.1:23232");
//        nsRef = orb.string_to_object("corbaloc:iiop:149.156.97.155:23232");
        //nsRef = orb.string_to_object("IOR:000000000000002b494

        // narrow the reference appropriately
        NamingContextExt ncRef = NamingContextExtHelper.narrow(nsRef);

        // use the reference calling the object's operations

        // get the Object Reference from NS
        org.omg.CORBA.Object objRef = ncRef.resolve_str("ala_i tomek1");

        System.out.println(objRef);

        // narrow the reference appropriately
        i1 = I1Helper.narrow(objRef);
    }


    void callInterface1() {
        StringHolder text2 = new StringHolder("bolek");
        StringHolder text3 = new StringHolder();
        S1 s1 = new S1();
        s1.a = 77;
        s1.b = 'r';

        i1.op1(123);
        String res = i1.op2("zenek", text2, text3, s1);

        System.out.println("I1::op2 returned: " + text2.value + " " + text3.value + " " + res);
    }


    void callFactory() {
        I2 i21 = i1.getI2();
        System.out.println("I2::op returned: " + i21.op());
        System.out.println("i21 = " + orb.object_to_string(i21));

        I2 i22 = i1.getI2();
        System.out.println("I2::op returned: " + i22.op());
        if (i22._is_a("IDL:example1/I2Ext:1.0")) {
            I2Ext i22e = I2ExtHelper.narrow(i1.getI2());
            System.out.println("I2Ext::opExt returned: " + i22e.opExt());
        }
        System.out.println("i22 = " + orb.object_to_string(i22));
    }


    void callDII() {
        org.omg.CORBA.Request r = i1._request("op1");
        r.add_in_arg().insert_long(77);
        r.set_return_type(orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_short));

        r.invoke();

        if (r.env().exception() == null) {
            System.out.println("I1::op1 (DII request) returned: " + r.return_value().extract_short());
        }
    }

    public void callExtraMethod() {
        Random random = new Random(currentTimeMillis());
        int first = random.nextInt(100);
        int second = random.nextInt(100);

        int sum = i1.add(first, second);
        System.out.printf("Server claims that %d plus %d is %d\n", first, second, sum);
    }

    public static void main(String[] args)
            throws InvalidName, NotFound, CannotProceed, org.omg.CORBA.ORBPackage.InvalidName {

        testOnRefFromFile(args);
        testOnRefFromNameService(args);
    }

    private static void testOnRefFromNameService(String[] args) throws InvalidName, NotFound, CannotProceed, org.omg.CORBA.ORBPackage.InvalidName {
        Client c2 = new Client(args);

        c2.getReferenceFromNameService();

        c2.callInterface1();
        c2.callFactory();
        c2.callDII();
        c2.callExtraMethod();
    }

    private static void testOnRefFromFile(String[] args) throws InvalidName, NotFound, CannotProceed, org.omg.CORBA.ORBPackage.InvalidName {
        Client c1 = new Client(args);

        c1.getReferenceFromFile();

        c1.callInterface1();
        c1.callFactory();
        c1.callDII();
        c1.callExtraMethod();
    }

}
