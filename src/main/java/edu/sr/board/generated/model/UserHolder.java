package edu.sr.board.generated.model;

/**
* edu/sr/board/generated/model/UserHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Model.idl
* Wednesday, May 6, 2015 6:05:53 PM CEST
*/

public final class UserHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.board.generated.model.User value = null;

  public UserHolder ()
  {
  }

  public UserHolder (edu.sr.board.generated.model.User initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.UserHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.UserHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.UserHelper.type ();
  }

}
