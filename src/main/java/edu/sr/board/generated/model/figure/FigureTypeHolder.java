package edu.sr.board.generated.model.figure;

/**
* edu/sr/board/generated/model/figure/FigureTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Figures.idl
* Wednesday, May 6, 2015 6:05:42 PM CEST
*/

public final class FigureTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.board.generated.model.figure.FigureType value = null;

  public FigureTypeHolder ()
  {
  }

  public FigureTypeHolder (edu.sr.board.generated.model.figure.FigureType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.figure.FigureTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.figure.FigureTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.figure.FigureTypeHelper.type ();
  }

}
