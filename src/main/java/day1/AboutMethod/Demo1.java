package day1.AboutMethod;

public class Demo1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int sum = add(a,b);
        System.out.println(sum);
    }

    public static int add(int a,int b){
        return a+b;
    }

    /**
     * 方法重载的规则：
     * 前提，在同一个类中，函数名称相同，形参不同
     * 1.方法名称必须相同；
     * 2.参数列表必须不同（个数，类型，排列顺序）；
     * 3.方法的返回值可以相同也可以不同；
     * 4.经返回类型不同不足以成为方法的重载。
     *
     * 编译器在遇到方法名称相同时，会根据调用方法的参数个数，参数类型去逐一匹配，直到找到相应的方法，匹配失败就会报错。
     */
}
