package edu.sr.generated.example2;


/**
* edu/sr/generated/example2/AFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sr.idl
* Tuesday, May 5, 2015 11:02:59 PM CEST
*/

public interface AFactoryOperations 
{
  edu.sr.generated.example2.Item create_item (String name, String type) throws edu.sr.generated.example2.ItemAlreadyExists;
  edu.sr.generated.example2.Item take_item (String name) throws edu.sr.generated.example2.ItemNotExists, edu.sr.generated.example2.ItemBusy;
  void release_item (String name) throws edu.sr.generated.example2.ItemNotExists;
} // interface AFactoryOperations
