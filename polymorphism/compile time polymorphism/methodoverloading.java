class Operation{
static double add(double a,double b){
    return a+b;
}
static int add(int a,int b){
    return a+b;
}
}
class methodoverloading{
    public static void main(String[] args) {
        System.out.println(Operation.add(12,12));
        System.out.println(Operation.add(12.40,12.55));
        
    }
    
}