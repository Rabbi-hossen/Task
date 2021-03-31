public class Human {
    Human(String a,int id){
        System.out.println("good afterternoon -"+a);
        System.out.println("my nation identity number is "+id);
}
public  void dosum(int c, int b,int e){
        //int e=c+b;
    System.out.println("the sum of "+c+" , "+e+ " and "+b+" is ="+(b+c+e));
}
public static void deg(int p){
        int kalvin=p+273;
    System.out.println(p+"degree celcus valu in kevin ="+kalvin+"k");
    double fh=1.8d*p+32;
    System.out.println(p+"degree celcus valu in Farenhid ="+fh+"F");
}
    public static void main(String[] args) {
        Human h=new Human("Tonmoy",123356);
        h.dosum(2,3,5);
        deg(1);
    }
}
