package edu.sr.board.generated.model.figure;


/**
* edu/sr/board/generated/model/figure/IRectanglePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Figures.idl
* Wednesday, May 6, 2015 6:05:42 PM CEST
*/

public abstract class IRectanglePOA extends org.omg.PortableServer.Servant
 implements edu.sr.board.generated.model.figure.IRectangleOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getWidth", new java.lang.Integer (0));
    _methods.put ("getHeight", new java.lang.Integer (1));
    _methods.put ("_get_figureType", new java.lang.Integer (2));
    _methods.put ("_get_figureId", new java.lang.Integer (3));
    _methods.put ("getCharacteristicPoint", new java.lang.Integer (4));
    _methods.put ("getRotationAngle", new java.lang.Integer (5));
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
       case 0:  // board/model/figure/IRectangle/getWidth
       {
         double $result = (double)0;
         $result = this.getWidth ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // board/model/figure/IRectangle/getHeight
       {
         double $result = (double)0;
         $result = this.getHeight ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 2:  // board/model/figure/IFigure/_get_figureType
       {
         edu.sr.board.generated.model.figure.FigureType $result = null;
         $result = this.figureType ();
         out = $rh.createReply();
         edu.sr.board.generated.model.figure.FigureTypeHelper.write (out, $result);
         break;
       }

       case 3:  // board/model/figure/IFigure/_get_figureId
       {
         String $result = null;
         $result = this.figureId ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }


  //                void draw(Boardd);
       case 4:  // board/model/figure/IFigure/getCharacteristicPoint
       {
         edu.sr.board.generated.model.figure.Point $result = null;
         $result = this.getCharacteristicPoint ();
         out = $rh.createReply();
         edu.sr.board.generated.model.figure.PointHelper.write (out, $result);
         break;
       }

       case 5:  // board/model/figure/IRotateable/getRotationAngle
       {
         double $result = (double)0;
         $result = this.getRotationAngle ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:board/model/figure/IRectangle:1.0", 
    "IDL:board/model/figure/IFigure:1.0", 
    "IDL:board/model/figure/IRotateable:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IRectangle _this() 
  {
    return IRectangleHelper.narrow(
    super._this_object());
  }

  public IRectangle _this(org.omg.CORBA.ORB orb) 
  {
    return IRectangleHelper.narrow(
    super._this_object(orb));
  }


} // class IRectanglePOA
