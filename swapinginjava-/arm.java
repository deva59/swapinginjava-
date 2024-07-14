// import java.util.Scanner;
// class arm{
//     public static void main(String[] args) {
//         int n,rem,arm=0,c;
//         System.out.println("Enter any number: ");
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         c=n;
//         while(n>0){
//             rem=n%10;
//             arm=(rem*rem*rem)+arm;
//             n=n/10;
//          }
//          if(c == arm){
//             System.out.println("Armstrong");
//          }else{
//             System.out.println("Not Armstrong");
//          }
//          }
// }

// class arm{
//     public static void main(String[] args) {
//         int n=153,temp,arm=0,rev;
//         temp = n;
//         while (n > 0) {
//             rev = n%10;
//             arm = arm+(rev*rev*rev);
//             n=n/10;
//         }
//         if(temp == arm ){
//             System.out.println(temp+ " Armstriong number ");
//         }else{
//             System.out.println(" Is Not Armstrong NUmber ");
//         }
//     }
// }

import java.util.Scanner;
class arm{
    public static void main(String[] args) {
        int n,c,r,a=0;
        System.out.println("Enter any number ");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        c=n;
        while (n>0) {
            r=n%10;
            a=a+(r*r*r);
            n=n/10;
        }
        if(c==a){
            System.out.println("print arm");
        }else{
            System.out.println("not print");
        }
}
}