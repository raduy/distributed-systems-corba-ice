package edu.sr.board.generated.model.command;

/**
* edu/sr/board/generated/model/command/DrawFigureCommandHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public final class DrawFigureCommandHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.board.generated.model.command.DrawFigureCommand value = null;

  public DrawFigureCommandHolder ()
  {
  }

  public DrawFigureCommandHolder (edu.sr.board.generated.model.command.DrawFigureCommand initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.command.DrawFigureCommandHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.command.DrawFigureCommandHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.command.DrawFigureCommandHelper.type ();
  }

}
