package eu.happycoders.sorting;

import java.util.Arrays;

public class CustomerArraySortByIdDescDemo {

  public static void main(String[] args) {
    Customer[] customers = {
          new Customer(333, "Akbergen ", "Berdiyar"),
          new Customer(323, "Nurzhigit", "Zhunis"),
          new Customer(324, "Patrick", "Bateman"),
          new Customer(321, "Mats", "Mells"),
          new Customer(352, "Ayim", "Kuanishkyzy")
    };
    Arrays.sort(customers, new CustomerByIdComparator(false));
    System.out.println(Arrays.toString(customers));
  }
}