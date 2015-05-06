package edu.sr.board.generated.model.command;


/**
* edu/sr/board/generated/model/command/_ScaleFigureCommandStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

public class _ScaleFigureCommandStub extends org.omg.CORBA.portable.ObjectImpl implements edu.sr.board.generated.model.command.ScaleFigureCommand
{

  public String figureId ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_figureId", true);
                $in = _invoke ($out);
                String $result = edu.sr.board.generated.model.figure.FigureIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return figureId (        );
            } finally {
                _releaseReply ($in);
            }
  } // figureId

  public double scaleFactor ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_scaleFactor", true);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return scaleFactor (        );
            } finally {
                _releaseReply ($in);
            }
  } // scaleFactor

  public String principal ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_principal", true);
                $in = _invoke ($out);
                String $result = edu.sr.board.generated.model.UserIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return principal (        );
            } finally {
                _releaseReply ($in);
            }
  } // principal

  public void apply (String boardId) throws edu.sr.board.generated.model.exceptions.CommandExecutionException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("apply", true);
                edu.sr.board.generated.model.BoardIdHelper.write ($out, boardId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:board/model/exceptions/CommandExecutionException:1.0"))
                    throw edu.sr.board.generated.model.exceptions.CommandExecutionExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                apply (boardId        );
            } finally {
                _releaseReply ($in);
            }
  } // apply

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:board/model/command/ScaleFigureCommand:1.0", 
    "IDL:board/model/command/Command:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ScaleFigureCommandStub
