class Programmer{
    private String name;
    Programmer(String name){
        this.name=name;
    }
    public void getname(){
        System.out.println(name);
    }
}
class encap{
    public static void main(String[] args){ 
    Programmer p=new Programmer("manofjustice");
    p.getname();
    //p.name; will through an error because it (name) is private in 
    // the programmer class accessing it with the member inside the class 
    // is possible but not possible outside the class 
    }
}