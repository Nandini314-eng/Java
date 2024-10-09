class Lava{
    private int x;
    private int y;
     
    void entere()
    {
         x = 24;
         y = 77;
    }
    void display2()
    {
        System.out.println(x);
        System.out.println(x);
    }
    void fun3()
    {
        y=98;
    }
}
class abc {
     public static void main(String [] args){
        Lava a1 = new Lava();
       a1. display2();
       a1.entere();
       a1. display2();
     }
}
//in this we does not use static keyword so we have to make object
//Lava a1 = new Lava();
  //     a1. display2();
  //     a1.entere();
  //     a1. display2();
