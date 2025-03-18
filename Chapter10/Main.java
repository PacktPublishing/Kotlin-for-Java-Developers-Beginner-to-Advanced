public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Kotlin Master", "Books", 90.0),
                new Product("Phone", "Electronics", 1500.0),
                new Product("Shoes", "Clothing", 120.0),
                new Product("Jacket", "Clothing", 150.0),
                new Product("Book", "Books", 30.0)
        );

        Map<String, Double> totalsByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.summingDouble(Product::getPrice)

                ));

        System.out.println(totalsByCategory);

    }

}