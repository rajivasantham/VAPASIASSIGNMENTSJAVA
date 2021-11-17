import java.util.Scanner;

public class Ascendingorder{
        public static void main(String args[]){
            //Declaring a variable as a user input

            Scanner s=new Scanner(System.in);
            System.out.println("enter the number:" );
            int num=s.nextInt();
//converting integer in to integer array
            int []array=createArrayFromNumber(num);
            // in first iteration i will assign with first value in the array i.e o index and enters the loops ,
            for (int i=0;i< array.length;i++){
                //in first iteration j will get assign as j+1 means second value in the array i.e 1st index means comparison between
                //numbers
                for(int j=i+1;j< array.length;j++){
                    //if o index is not greater than 1st index then it will not
                    //enter the loop and j will compare with the others numbers till end.
                    if(array[i]>array[j]){
                        //if o index is greater than 1st index it will enter the condition and swap the numbers
                        //means we are moving the smallest number to zero index and greater number to 1st index
                        //next j will check the other numbers and loop iterates till comparison
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;

                    }
                }
                System.out.print(array[i]);
            }



        }
        //creating a method for converting an integer in to a String and from that String extracting
        //character


        static int[] createArrayFromNumber(int number){
            String str=String.valueOf(number);
            char[]chArr=str.toCharArray();
            int[]arr=new int[chArr.length];
            for (int i=0;i< chArr.length;i++){
                //Character is a class with method getNumericvalue(char ch);it returns
                // the int value that character represents
                arr[i]=Character.getNumericValue(chArr[i]);

            }
            return arr;


        }




    }

