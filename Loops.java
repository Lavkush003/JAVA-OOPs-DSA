

//while loop

// public class Loops{
//     public static void main(String args[]){

//         int counter=0;
//         while(counter<5){
//             System.out.println(counter);
//             counter++;
//         }

//     }
// }


//for loop

// public class Loops{
//     public static void main(String args[]){
//         for(int i=0;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }

//do while loop

// public class Loops{
//     public static void main(String args[]){
//         int i=0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=5);
//     }
// }



//Break Statement

// public class Loops{
//     public static void main(String args[]){
//         for(int i=0;i<=5;i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//     }
// }



//Continue Statement=>to skip an iteration

public class Loops{
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            if(i==3){
                continue; //skip the iteration when i is 3
            }
            System.out.println(i);
        }
    }
}