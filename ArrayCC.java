public class ArrayCC{
//by reference 
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){

   //int marks[]=new int[50];//size constant 
   int marks[]={97, 98, 99};
   int nonChangeble=10;
   
   //int numbers[]=new int[3];
   update(marks);
   System.out.println(nonChangeble);

   //print our marks
   for(int i=0; i<marks.length; i++){
    System.out.print(marks[i]+" ");
   }
   System.out.println();
}}