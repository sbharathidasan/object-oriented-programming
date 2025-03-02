class run{
    public static void main(String[] args){
        child cd=new child();
        cd.childrens();
        cd.responsibility();//here the class child inherits the properties and attributes of the patent so can use 
                            // the member inside it but parent cannot use the members of the child class  and if we inherit it with child  it will create circular dependency 
    }
}