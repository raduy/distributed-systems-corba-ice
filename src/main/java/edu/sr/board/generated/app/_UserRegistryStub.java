package edu.sr.board.generated.app;


/**
* edu/sr/board/generated/app/_UserRegistryStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoardApp.idl
* Wednesday, May 6, 2015 6:04:38 PM CEST
*/

public class _UserRegistryStub extends org.omg.CORBA.portable.ObjectImpl implements edu.sr.board.generated.app.UserRegistry
{

  public String[] getAllUsers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAllUsers", true);
                $in = _invoke ($out);
                String $result[] = edu.sr.board.generated.app.userIdsSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAllUsers (        );
            } finally {
                _releaseReply ($in);
            }
  } // getAllUsers

  public edu.sr.board.generated.model.User getUserDetails (String userId) throws edu.sr.board.generated.app.exceptions.NoSuchUserRegisteredException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getUserDetails", true);
                edu.sr.board.generated.model.UserIdHelper.write ($out, userId);
                $in = _invoke ($out);
                edu.sr.board.generated.model.User $result = edu.sr.board.generated.model.UserHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:board/app/exceptions/NoSuchUserRegisteredException:1.0"))
                    throw edu.sr.board.generated.app.exceptions.NoSuchUserRegisteredExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getUserDetails (userId        );
            } finally {
                _releaseReply ($in);
            }
  } // getUserDetails

  public String registerUser (String name) throws edu.sr.board.generated.app.exceptions.UserAlreadyRegisteredException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerUser", true);
                $out.write_string (name);
                $in = _invoke ($out);
                String $result = edu.sr.board.generated.model.UserIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:board/app/exceptions/UserAlreadyRegisteredException:1.0"))
                    throw edu.sr.board.generated.app.exceptions.UserAlreadyRegisteredExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registerUser (name        );
            } finally {
                _releaseReply ($in);
            }
  } // registerUser

  public void unregisterUser (String UserId) throws edu.sr.board.generated.app.exceptions.NoSuchUserRegisteredException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unregisterUser", true);
                edu.sr.board.generated.model.UserIdHelper.write ($out, UserId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:board/app/exceptions/NoSuchUserRegisteredException:1.0"))
                    throw edu.sr.board.generated.app.exceptions.NoSuchUserRegisteredExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                unregisterUser (UserId        );
            } finally {
                _releaseReply ($in);
            }
  } // unregisterUser

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:board/app/UserRegistry:1.0"};

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
} // class _UserRegistryStub
