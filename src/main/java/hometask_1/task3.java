package hometask_1;

public class task3 {
        public static void main(String[] args) {
            int a;
            int b;
            for (a = 35; a <= 87; a++){
                b = a%7;
                if(b == 1 || b == 2 || b == 5){
                    System.out.println(a);
                }
            }
        }
}
