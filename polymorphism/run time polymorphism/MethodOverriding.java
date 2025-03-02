class original{
  void  print(){
    System.out.println("original text");
 }
}
class overriding1 extends original{
  void print()  {
    System.out.println("overriding in overriding1 class");
  }
}
class overriding2 extends original{
  void print(){
    System.out.println("overriding in overriding2 class ");
  }
}
class MethodOverriding{
  public static void main(String[] args){
    original text= new overriding1();
    original text1=new overriding2();
    original original=new original();
    text.print();
    text1.print();
    original.print();
    }
}