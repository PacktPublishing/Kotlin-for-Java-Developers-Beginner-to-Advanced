class CollectionsFunctions{

    public static void main(String[] args){

        //Java Filter example
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //List<Integer> evenNumbers = numbers.stream() .filter(n -> n % 2 == 0) .collect(Collectors.toList());


        //Java without Streams
        /*List<Integer> evenNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }

        }*/

        //Kotlin code
        /*
        val numbers = listOf(1, 2, 3, 4, 5)
        val evenNumbers = numbers.filter { it % 2 == 0 }
         */



        //FOLD EXAMPLE
        /*public class FoldExample {

            public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                int initial = 10;
                int sum = numbers.stream()
                        .reduce(initial, (acc, num) -> acc + num);

                System.out.println(sum);

            }

        }*/

        //Kotlin code
        /*val numbers = listOf(1, 2, 3, 4, 5)

        val sum = numbers.fold(10) { acc, num ->
                acc + num
        }
        println(sum)
        */


    }
}