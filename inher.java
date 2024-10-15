//inheritance//
// single level inheritance A --> B//
class nokia{
    int s;
    int y;
    void fun1(){
        System.out.println("fun1");
    }
    nokia(){
        System.out.println("const1");
    }
}
class nokia1 extends nokia{
    int x;
    nokia1(){
        System.out.println("const2");
    } void fun2(){
        System.out.println("fun2");
    }
}
//multi level inheritance A-->B--->C
class nokia2 extends nokia1{
    int n;
    nokia2(){
        System.out.println("const3");
    } void fun3(){
        System.out.println("fun3");
    }
}
class inher {
    public static void main(String[] args) {
        nokia2 n1 = new nokia2();
        n1.fun2();
    }
}
