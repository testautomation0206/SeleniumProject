package filterDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;
    public Product(int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class FilterDemo4 {

    public static void main(String[] args) {
        List <Product> ProductsList = new ArrayList<Product>();
        ProductsList.add(new Product(1,"HP Laptop",25000));
        ProductsList.add(new Product(2,"Dell Laptop",30000));
        ProductsList.add(new Product(3,"Lenova Laptop",28000));
        ProductsList.add(new Product(4,"Sony Laptop",23000));
        ProductsList.add(new Product(5,"Apple Laptop",90000));
        ProductsList.stream()
                .filter(p->p.price>25000)//Filtering the products
                .forEach(p-> System.out.println(p.name));//Iterating

    }
}
