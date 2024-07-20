package eu.happycoders.sorting;

import java.util.Arrays;

public class CustomerArraySortByNameDemo {

  public static void main(String[] args) {
    Customer[] customers = {
          new Customer(234, "Samuel", "Mann"),
          new Customer(271, "Philip", "Shtruggard"),
          new Customer(251, "Margaret", "Sonnenberg"),
          new Customer(283, "Marline", "Monro"),
          new Customer(234, "Asyl", "Shvartsnegger")
    };
    Arrays.sort(customers, Customer.NAME_COMPARATOR);
    System.out.println(Arrays.toString(customers));
  }
}