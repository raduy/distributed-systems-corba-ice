package edu.sr.board.generated.model.exceptions;

/**
* edu/sr/board/generated/model/exceptions/CommandExecutionExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public final class CommandExecutionExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public edu.sr.board.generated.model.exceptions.CommandExecutionException value = null;

  public CommandExecutionExceptionHolder ()
  {
  }

  public CommandExecutionExceptionHolder (edu.sr.board.generated.model.exceptions.CommandExecutionException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = edu.sr.board.generated.model.exceptions.CommandExecutionExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    edu.sr.board.generated.model.exceptions.CommandExecutionExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return edu.sr.board.generated.model.exceptions.CommandExecutionExceptionHelper.type ();
  }

}
