public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(5,4));
 //       System.out.println(sum(new int[]{1,2,3,4}));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

    }
    public static int sum(int a ,int b){
        return a+b;
    }
//    public static int sum(int[]a){
//        int sum=0;
//        for (int i : a) {
//            sum +=i;
//        }
//        return sum;
//    }
    public static int sum(int c,int b,int...a){
        int sum=c+b;
        for (int i : a) {
            sum += i;
        }
        return sum;

    }


}
