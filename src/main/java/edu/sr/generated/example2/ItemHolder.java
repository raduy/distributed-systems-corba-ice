package edu.sr.generated.example2;

/**
* edu/sr/generated/example2/ItemHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sr.idl
* Tuesday, May 5, 2015 11:02:59 PM CEST
*/

public final class ItemHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.generated.example2.Item value = null;

  public ItemHolder ()
  {
  }

  public ItemHolder (edu.sr.generated.example2.Item initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.generated.example2.ItemHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.generated.example2.ItemHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.generated.example2.ItemHelper.type ();
  }

}