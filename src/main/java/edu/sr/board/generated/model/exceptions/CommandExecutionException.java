package edu.sr.board.generated.model.exceptions;


/**
* edu/sr/board/generated/model/exceptions/CommandExecutionException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public final class CommandExecutionException extends org.omg.CORBA.UserException
{

  public CommandExecutionException ()
  {
    super(CommandExecutionExceptionHelper.id());
  } // ctor


  public CommandExecutionException (String $reason)
  {
    super(CommandExecutionExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class CommandExecutionException
