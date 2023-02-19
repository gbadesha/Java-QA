public class ArrayClass {
            int a;
     ArrayClass(int y){
         System.out.println("Constructor called "+ y);
     }
    ArrayClass(int y, int z){
        System.out.println("Constructor called "+ y + " " + z) ;
    }
    public void whatevermethod(){
        int[] array1=new int[a];
        int counter =0;
        for(int i=0;i<array1.length;i++){
            array1[i]=counter;
            System.out.print(array1[i]+ " ");
            counter++;
        }
    }
}
