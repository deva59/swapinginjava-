// import java.util.Scanner;
// class swap2 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);


//     System.out.println("Enter A: ");
//     int a = sc.nextInt();


//     System.out.println("Enter B: ");
//     int b = sc.nextInt();

//     int temp = a;//100
//     a = b;
//     b = temp;

//     System.out.println("After Swaping: ");
//     System.out.println("A is " + a);
//     System.out.println("B is " + b);
//     sc.close();
// }
// }


class swap2{
    public static void main(String[] args) {
        int A=100,B=300;
        System.out.println("After Swapping, A=  " + A + "And, B=" + B);
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Before Swapping, A=  " + A + "And, B=" + B);
    }
}