package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Set<Product> listProduct = new HashSet<>();
        Product product1 = new Product(1, "Samsung");
        Product product2 = new Product(2, "Iphone");
        Product product3 = new Product(3, "OPPO");
        Product product4 =new Product(4, "NOKIA");
        Product product5 =new Product(5, "Xiaomi");

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product5);

        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName().toUpperCase() + " "); }

        /*LinkedList<Product> listProduct = new LinkedList<>();
        Product product1 = new Product(1, "Samsung");
        Product product2 = new Product(2, "Iphone");
        Product product3 = new Product(3, "OPPO");
        Product product4 =new Product(4, "NOKIA");
        Product product5 =new Product(5, "Xiaomi");

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product5);




        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).getName().toUpperCase() + " ");
        }
*/



        /*ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product(1, "Samsung"));
        listProduct.add(new Product(2, "Iphone"));
        listProduct.add(new Product(3, "OPPO"));
        listProduct.add(new Product(4, "NOKIA"));
        listProduct.add(new Product(5, "Xiaomi"));

        Product product = listProduct.get(2);
        System.out.println(product.getName().toUpperCase());*/

        /*Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName().toUpperCase() + " "); }*/

        /*for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((listProduct).get(i).getName().toUpperCase()+" ");
        }*/

        /*for (Product product : listProduct) {
            System.out.print(product.getName().toUpperCase() + " ");
        }*/


    }
}
