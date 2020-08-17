package day1.AboutFor;

public class ForDemo {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for (int x:numbers){
            System.out.println(x);
        }
    }
}
