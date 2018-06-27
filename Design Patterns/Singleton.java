/* General Implementation that is thread safe but low on performance due to all calls being synchronized */
class Singleton{
  private static Singleton instance;

  private Singleton(){
    //do something
  }

  public static synchronized getInstance(){
    if(instance == null){
      instance = new Singleton();
    }

    return instance;
  }

}

/*Lazy Instantiation using double locking mechanism*/

class Singleton{
  private static Singleton instance;

  private Singleton(){
    //do something
  }

  public static getInstance(){
    if(instance == null){
      synchronized(Singleton.class){
        if(instance == null)
          instance = new Singleton();
      }
    }
    return instance;
  }
}

/* Early Instantitaion */
/*In the following implementattion the singleton object is instantiated when the class is loaded and
not when it is first used, due to the fact that the instance member is declared static.
This is why in we don't need to synchronize any portion of the code in this case.
The class is loaded once this guarantee the uniquity of the object.*/

class Singleton{
  private static Singleton instance = new Singleton();

  private Singleton(){
    //do something
  }

  public static getInstance(){
    return instance;
  }

}
