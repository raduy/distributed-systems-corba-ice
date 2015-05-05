package edu.sr.impl;

import edu.sr.generated.example1.I1POA;
import edu.sr.generated.example1.I2;
import edu.sr.generated.example1.I2Helper;
import edu.sr.generated.example1.S1;
import org.omg.CORBA.StringHolder;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class I1Impl extends I1POA {

    private POA poa;

    public I1Impl(POA poa) {
        this.poa = poa;
    }

    @Override
    public I2 getI2() {
        I2ExtImpl i2Impl = new I2ExtImpl();

        try {
            return I2Helper.narrow(poa.servant_to_reference(i2Impl));

            //} catch (ServantNotActive e) {
            //e.printStackTrace();
        } catch (WrongPolicy e) {
            e.printStackTrace();
            //} catch (ServantAlreadyActive e) {
            //e.printStackTrace();
            //} catch (ObjectNotActive e) {
            //e.printStackTrace();
            //} catch (ObjectAlreadyActive e) {
            //e.printStackTrace();
        } catch (ServantNotActive e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int add(int first, int second) {
        return first + second;
    }


    @Override
    public short op1(int abc) {
        // TODO Auto-generated method stub
        System.out.println("OP1 " + abc);
        return 0;
    }


    @Override
    public String op2(String text, StringHolder text2, StringHolder text3,
                      S1 struct1) {
        // TODO Auto-generated method stub
        text3.value = "super buper content";
        return text3.value;
    }

}
