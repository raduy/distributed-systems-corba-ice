package edu.sr.board.generated.model.command;


/**
* edu/sr/board/generated/model/command/CommandOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public interface CommandOperations 
{
  String principal ();
  void apply (String boardId) throws edu.sr.board.generated.model.exceptions.CommandExecutionException;
} // interface CommandOperations
