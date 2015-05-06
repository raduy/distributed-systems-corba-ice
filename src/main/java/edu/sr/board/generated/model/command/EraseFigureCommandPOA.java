package edu.sr.board.generated.model.command;


/**
* edu/sr/board/generated/model/command/EraseFigureCommandPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public abstract class EraseFigureCommandPOA extends org.omg.PortableServer.Servant
 implements edu.sr.board.generated.model.command.EraseFigureCommandOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_figureId", new java.lang.Integer (0));
    _methods.put ("_get_principal", new java.lang.Integer (1));
    _methods.put ("apply", new java.lang.Integer (2));
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
       case 0:  // board/model/command/EraseFigureCommand/_get_figureId
       {
         String $result = null;
         $result = this.figureId ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // board/model/command/Command/_get_principal
       {
         String $result = null;
         $result = this.principal ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // board/model/command/Command/apply
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
    "IDL:board/model/command/EraseFigureCommand:1.0", 
    "IDL:board/model/command/Command:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EraseFigureCommand _this() 
  {
    return EraseFigureCommandHelper.narrow(
    super._this_object());
  }

  public EraseFigureCommand _this(org.omg.CORBA.ORB orb) 
  {
    return EraseFigureCommandHelper.narrow(
    super._this_object(orb));
  }


} // class EraseFigureCommandPOA
