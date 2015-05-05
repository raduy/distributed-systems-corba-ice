package edu.sr.server;

import edu.sr.impl.I1Impl;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Server {

    private ORB orb;
    private POA rootPoa;

    public void base(String[] args) throws InvalidName, AdapterInactive {
        // create and initialize the ORB
        orb = ORB.init(args, null);

        // get reference to rootPoa & activate the POAManager
        rootPoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

        rootPoa.the_POAManager().activate();
    }

    public void instantiateWithFile()
            throws InvalidName, ServantAlreadyActive, WrongPolicy, ServantNotActive, IOException {
        org.omg.CORBA.Object ref = createServant();

        // export object reference to a file
        PrintWriter pw = new PrintWriter(new FileWriter("ref1.ior"));
        pw.print(orb.object_to_string(ref));
        pw.close();
    }

    private org.omg.CORBA.Object createServant() throws ServantAlreadyActive, WrongPolicy, ServantNotActive {
        // create servant
        I1Impl servant = new I1Impl(rootPoa);

        // register it with the POA and get the object reference
        rootPoa.activate_object(servant);

        return rootPoa.servant_to_reference(servant);
    }

    public void instantiateWithNameService() throws InvalidName, ServantNotActive, WrongPolicy, IOException, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound, CannotProceed, ServantAlreadyActive, ObjectAlreadyActive {
        // create servants
        org.omg.CORBA.Object ref1 = createServant();
        org.omg.CORBA.Object ref2 = createServant();

        org.omg.CORBA.Object nsRef;

        nsRef = orb.resolve_initial_references("NameService");
//        nsRef = orb.string_to_object("corbaloc:iiop:127.0.0.1:23232");
//        nsRef = orb.string_to_object("corbaloc:iiop:149.156.97.155:23232");

        //narrow NS reference
        NamingContextExt ncRef = NamingContextExtHelper.narrow(nsRef);

        // bind the Object Reference in Naming
        NameComponent[] path1 = ncRef.to_name("ala_i tomek1");
        NameComponent[] path2 = ncRef.to_name("ala_i tomek2");

        ncRef.rebind(path1, ref1);
        ncRef.rebind(path2, ref2);
    }


    private void runOrb() {
        // wait for invocations from clients
        System.out.println("Entering event processing loop...");
        orb.run();
    }

    public static void main(String[] args) throws InvalidName, AdapterInactive, ServantNotActive, WrongPolicy, IOException, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound, CannotProceed, ServantAlreadyActive, ObjectAlreadyActive {
        Server s = new Server();
        s.base(args);

        s.instantiateWithFile();
        s.instantiateWithNameService();

        s.runOrb();
    }

}
