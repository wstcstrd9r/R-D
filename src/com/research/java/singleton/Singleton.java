package com.research.java.singleton;
public class Singleton {
   /**
    * The constructor could be made private
    * to prevent others from instantiating this class.
    * But this would also make it impossible to
    * create instances of Singleton subclasses.
    */
   protected Singleton() {
     // ...
   }
 

   /**
    * A handle to the unique Singleton instance.
    */
   static private Singleton instance = null;
 
   /**
    * @return The unique instance of this class.
    */
   static public Singleton getInstance() {
      if(null == instance) {
         instance = new Singleton();
      }
      return instance;
   }
}
