package edu.sr.board.generated.model.figure;

/**
* edu/sr/board/generated/model/figure/IRectangleHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Figures.idl
* Wednesday, May 6, 2015 6:05:42 PM CEST
*/

public final class IRectangleHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.board.generated.model.figure.IRectangle value = null;

  public IRectangleHolder ()
  {
  }

  public IRectangleHolder (edu.sr.board.generated.model.figure.IRectangle initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.figure.IRectangleHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.figure.IRectangleHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.figure.IRectangleHelper.type ();
  }

}