package edu.sr.board.generated.app;


/**
* edu/sr/board/generated/app/userIdsSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoardApp.idl
* Wednesday, May 6, 2015 6:04:38 PM CEST
*/

public final class userIdsSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public userIdsSeqHolder ()
  {
  }

  public userIdsSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.app.userIdsSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.app.userIdsSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.app.userIdsSeqHelper.type ();
  }

}
