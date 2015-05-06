package edu.sr.board.generated.model.command;


/**
* edu/sr/board/generated/model/command/DrawFigureCommandHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Commands.idl
* Wednesday, May 6, 2015 6:05:36 PM CEST
*/

abstract public class DrawFigureCommandHelper
{
  private static String  _id = "IDL:board/model/command/DrawFigureCommand:1.0";

  public static void insert (org.omg.CORBA.Any a, edu.sr.board.generated.model.command.DrawFigureCommand that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static edu.sr.board.generated.model.command.DrawFigureCommand extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (edu.sr.board.generated.model.command.DrawFigureCommandHelper.id (), "DrawFigureCommand");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static edu.sr.board.generated.model.command.DrawFigureCommand read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DrawFigureCommandStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, edu.sr.board.generated.model.command.DrawFigureCommand value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static edu.sr.board.generated.model.command.DrawFigureCommand narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.sr.board.generated.model.command.DrawFigureCommand)
      return (edu.sr.board.generated.model.command.DrawFigureCommand)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.sr.board.generated.model.command._DrawFigureCommandStub stub = new edu.sr.board.generated.model.command._DrawFigureCommandStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static edu.sr.board.generated.model.command.DrawFigureCommand unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.sr.board.generated.model.command.DrawFigureCommand)
      return (edu.sr.board.generated.model.command.DrawFigureCommand)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.sr.board.generated.model.command._DrawFigureCommandStub stub = new edu.sr.board.generated.model.command._DrawFigureCommandStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
