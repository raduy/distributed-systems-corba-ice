package edu.sr.board.generated.model.figure;


/**
* edu/sr/board/generated/model/figure/FigureType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Figures.idl
* Wednesday, May 6, 2015 6:05:42 PM CEST
*/

public class FigureType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static edu.sr.board.generated.model.figure.FigureType[] __array = new edu.sr.board.generated.model.figure.FigureType [__size];

  public static final int _ELLIPSE = 0;
  public static final edu.sr.board.generated.model.figure.FigureType ELLIPSE = new edu.sr.board.generated.model.figure.FigureType(_ELLIPSE);
  public static final int _RECTANGLE = 1;
  public static final edu.sr.board.generated.model.figure.FigureType RECTANGLE = new edu.sr.board.generated.model.figure.FigureType(_RECTANGLE);
  public static final int _LINE = 2;
  public static final edu.sr.board.generated.model.figure.FigureType LINE = new edu.sr.board.generated.model.figure.FigureType(_LINE);
  public static final int _CURSOR = 3;
  public static final edu.sr.board.generated.model.figure.FigureType CURSOR = new edu.sr.board.generated.model.figure.FigureType(_CURSOR);

  public int value ()
  {
    return __value;
  }

  public static edu.sr.board.generated.model.figure.FigureType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected FigureType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class FigureType
