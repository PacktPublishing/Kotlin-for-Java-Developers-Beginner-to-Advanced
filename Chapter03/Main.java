// Null explanation Java
public class Main {
    public static void main(String[] args){
        String name = new String("Jose");
        name = null;
        System.out.println(name);
    }
    
    //Add 2 lines and will see an exception
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
    /*public static void main(String[] args){
        String name = new String("Jose");
        System.out.println(name.length());
        name = null;
        System.out.println(name.length());
        System.out.println(name);
    }*/


    //Considering the exception
    /*
        public static void main(String[] args){
            String name = new String("Jose");
            System.out.println(name.length());
            name = null;
            if (name != null) {
                System.out.println(name.length());
            } else {
                System.out.println("The name variable is null!");
            }
            System.out.println(name);
        }
    */

}