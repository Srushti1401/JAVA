package CoreJava;

class StudentStaticNonStatic {

    int id;
    String name;
    static String university="VTU";

    StudentStaticNonStatic(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name+" "+university);
    }

    public static void main(String[] args){
        StudentStaticNonStatic s1=new StudentStaticNonStatic(1,"Rahul");
        StudentStaticNonStatic s2=new StudentStaticNonStatic(2,"Anita");

        s1.display();
        s2.display();
    }
}
