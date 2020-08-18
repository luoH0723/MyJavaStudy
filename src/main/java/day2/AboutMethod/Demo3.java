package day2.AboutMethod;

public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.couldChange(1);
    }


    public void couldChange(int x,int... i){
        System.out.println(i[0]);
    }

    /**
     * 一个方法中只能制定一个可变参数，必须是方法的最后一个参数。任何普通参数都必须在它之前声明。
     */
}
