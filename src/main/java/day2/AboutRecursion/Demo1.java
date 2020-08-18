package day2.AboutRecursion;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    //递归实现阶乘
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
