public class Main {
    public static void main(String[] args){
        // if we want to use Container class
        Container myContainer = new Container("Jose");
        System.out.println(myContainer.getContent());
    }

    /*Use Generic Container
    public static void main(String[] args) {
        Container<String> myAContainer = new Container<>("jose");
        Container<Integer> myBContainter = new Container<>(999);
        System.out.println(myAContainer.getContent());
        System.out.println(myBContainter.getContent());
    }

     */
}
