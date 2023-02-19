public class Studentdata{
    String name;
    int math;
    int sci;
    int chem;
    Studentdata(String n,int m,int s, int c) {
        System.out.println("Constructor called ");

        this.name=n;
        this.math=m;
        this.sci=s;
        this.chem=c;
        int z = m + s + c;
        System.out.println(n + "is having total " + z + " marks");
    }
    Studentdata(String n1){
        this(n1,0,0,0);
        int r=math+chem+sci;
        System.out.println(name + "is having total " + r);

    }// if you add one constructor in program it will not use a default constructor

    public static String name(String n)
    {
        return n;
            }
            public static String phonenumber(){
        //System.out.println("Student lives in Brampton");
                return "4372432920";

    }
    public static int marks(int m,int s,int c){
        //System.out.println("Student comes to school by school bus");
        return m+s+c;
    }
    public static void percentage(int n)
    {
        int z=(n*100/50);
        System.out.println("Percentage marks of student out of 50 is " + z +"%" );
    }
    public static void id(int i){
        System.out.println("Student ID assigned is " + i);
    }
//int z=m+c+s;
  //  System.out.println(n +" is having total " + z + " marks" );*/
    //int total=this.math+this.sci+this.chem;

}
