public class Collectionchallanges {
    public static void main(String[] args) {
        String ss = var("this ","is ","my ","codebase");
        System.out.println(ss);

    }
    public static String var(String...str){
        String strrr="";
        for(String strr:str){
            strrr =strrr+strr;
        }
        return strrr;
    }
}
