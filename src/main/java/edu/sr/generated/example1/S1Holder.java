package edu.sr.generated.example1;

/**
* edu/sr/generated/example1/S1Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sr.idl
* Tuesday, May 5, 2015 11:02:59 PM CEST
*/

public final class S1Holder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.generated.example1.S1 value = null;

  public S1Holder ()
  {
  }

  public S1Holder (edu.sr.generated.example1.S1 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.generated.example1.S1Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.generated.example1.S1Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.generated.example1.S1Helper.type ();
  }

}
