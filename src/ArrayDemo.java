public class ArrayDemo {
    public static void main (String[] args){
        int[] marks = new int[10];
        StudentMarks obj = new StudentMarks();
        obj.giveMarks(marks);
        System.out.println(marks);
        System.out.println(obj.marks);
        for (int i=0;i<=marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
