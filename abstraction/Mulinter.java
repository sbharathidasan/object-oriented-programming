class Mulinter{
public static void main(String[] args){
    Cal x=new Cal();
    x.add(1,2);
    x.sub(3,6);
}    
}
interface Add{
    void add(int a,int b);
}
interface Sub{
    void sub(int a,int b);
}
class Cal implements Add,Sub {
public void add(int a,int b){
    System.out.println(a+b);
}
public void sub(int a,int b){//here the implementation must be public because an interface defines a public contract meaning it specifies the method that any class implementing the interface must provide access to from outside the class 
    System.out.println(a-b);
}
} 
