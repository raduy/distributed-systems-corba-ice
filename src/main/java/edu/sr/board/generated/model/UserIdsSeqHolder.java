package edu.sr.board.generated.model;


/**
* edu/sr/board/generated/model/UserIdsSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Model.idl
* Wednesday, May 6, 2015 6:05:53 PM CEST
*/

public final class UserIdsSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public UserIdsSeqHolder ()
  {
  }

  public UserIdsSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.UserIdsSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.UserIdsSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.UserIdsSeqHelper.type ();
  }

}
