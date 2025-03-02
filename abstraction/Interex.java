class Interex{
    public static void main(String[] args){
        TestClass tc=new TestClass();
        tc.display();
        tc.a=10;
    }
}
interface testInter{
    final int a =10;
    void display();
}
class TestClass implements testInter{
    public void display(){
        System.out.println("hello");
    }
}