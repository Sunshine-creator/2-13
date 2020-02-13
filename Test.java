import  java.util.Random;
import javax.swing.*;
import  java.io.IOException;
import java.util.Scanner;
public class Test {
    //    int num =1;
////    while (num<=10){
////        System.out.println(num);
////        num++;
////    }
//    int res =0;
//    while(num < 101)
//    {
//        res+=num;
//        num++;
//    }
//    System.out.println(num)
//    int num =1;
//    int sum =0;
//    while(num<6){
//        int res = 1;
//        int tem =1;
//        while(tem < num){
//            res *=tem;
//            tem++;
//        }
//        sum+=res;
//        num++;
//    }
//    System.out.println("sum=" + sum);
//
//    for (int i =1;i<11; i++){
////        System.out.println(i);
////    }
//    int sum =0;
//    for(int i =1;i<6;i++){
//        int temp =1;
//        for(int j =1;j<=i;j++){
//            temp *= j;
//        }
//        sum +=temp;
//    }
//    System.out.println("sum =" +sum);
//}
//      try{
//        System.out.println("Enter a char:");
//        char i = (char) System.in.read();
//        System.out.println("your char is :" +i);
//    } catch (IOException e ){
//        System.out.println("exception");
//    }
//    Scanner sc =  new Scanner(System.in);
//    System.out.println("请输入你的姓名");
//    String name  =  sc.nextLine();
//    System.out.println("请输入你的年龄：");
//    int age = sc.nextInt();
//    System.out.println("请输入你的工资：");
//    float salary = sc.nextFloat();
//    System.out.println("你的信息如下：");
//    System.out.println("姓名：" +name + "\n" + "年龄："+ age + "\n"+"工资："+salary);
//    sc.close();
//      public static void main(String[] args) {
//          Random random = new Random();
//          Scanner sc =  new Scanner(System.in);
//          int toGuess =  random.nextInt(100);
//          System.out.println("toGuess :" + toGuess);
//          while (true){
//              System.out.println("请输入要输入的数字：(1-100)");
//              int num = sc.nextInt();
//              if(num < toGuess){
//                  System.out.println("低了");
//              } else if (num > toGuess){
//                  System.out.println("高了");
//              }else{
//                  System.out.println("猜对了");
//                  break;
//              }
//              sc.close();
//          }
//
//}
//public static void main(String[] args) {
//    int a =9527;
//    print(a);
//}
//public  static  void print (int a){
//    if(a>9){
//        print(a/10);
//    }
//    System.out.println(a%10 + "");
//}
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int ret = mul(a, b);
        System.out.println("ret =" + ret);
    }

    public static int mul(int x, int y) {
        return x * y;
    }
}

