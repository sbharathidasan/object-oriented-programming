abstract class Computer{
    void turnOn(){
        System.out.println("turn on");
    }
    abstract void turnOff();
}
class Asus extends Computer{
     void turnOff(){
        System.out.println("turning off");
    }
}
class Abstract{
    public static void main(String[] args){
        Asus comp=new Asus();
        comp.turnOn();
        comp.turnOff();
    }
}//abstraction can be done in two ways one by abstract key word and another is by interface 
//absractionis used to hide the implementation details to the users and abstact method in 
// abstract class says that there must be a specified method in the class