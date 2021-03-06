package edu.sr.board.generated.model.command;


/**
* edu/sr/board/generated/model/command/CommandPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public abstract class CommandPOA extends org.omg.PortableServer.Servant
 implements edu.sr.board.generated.model.command.CommandOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_principal", new java.lang.Integer (0));
    _methods.put ("apply", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // board/model/command/Command/_get_principal
       {
         String $result = null;
         $result = this.principal ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // board/model/command/Command/apply
       {
         try {
           String boardId = edu.sr.board.generated.model.BoardIdHelper.read (in);
           this.apply (boardId);
           out = $rh.createReply();
         } catch (edu.sr.board.generated.model.exceptions.CommandExecutionException $ex) {
           out = $rh.createExceptionReply ();
           edu.sr.board.generated.model.exceptions.CommandExecutionExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:board/model/command/Command:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Command _this() 
  {
    return CommandHelper.narrow(
    super._this_object());
  }

  public Command _this(org.omg.CORBA.ORB orb) 
  {
    return CommandHelper.narrow(
    super._this_object(orb));
  }


} // class CommandPOA
