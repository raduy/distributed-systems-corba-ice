package edu.sr.board.generated.model.figure;


/**
* edu/sr/board/generated/model/figure/IRotateableHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Figures.idl
* Wednesday, May 6, 2015 6:05:42 PM CEST
*/

abstract public class IRotateableHelper
{
  private static String  _id = "IDL:board/model/figure/IRotateable:1.0";

  public static void insert (org.omg.CORBA.Any a, edu.sr.board.generated.model.figure.IRotateable that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static edu.sr.board.generated.model.figure.IRotateable extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (edu.sr.board.generated.model.figure.IRotateableHelper.id (), "IRotateable");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static edu.sr.board.generated.model.figure.IRotateable read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IRotateableStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, edu.sr.board.generated.model.figure.IRotateable value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static edu.sr.board.generated.model.figure.IRotateable narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.sr.board.generated.model.figure.IRotateable)
      return (edu.sr.board.generated.model.figure.IRotateable)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.sr.board.generated.model.figure._IRotateableStub stub = new edu.sr.board.generated.model.figure._IRotateableStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static edu.sr.board.generated.model.figure.IRotateable unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.sr.board.generated.model.figure.IRotateable)
      return (edu.sr.board.generated.model.figure.IRotateable)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.sr.board.generated.model.figure._IRotateableStub stub = new edu.sr.board.generated.model.figure._IRotateableStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
