package eu.happycoders.sorting;

import java.util.*;

public class CustomerArraySortByNameComparingDemo {

  public static void main(String[] args) {
    Customer[] customers = {
          new Customer(43423, "Ansar", "Shangilov"),
          new Customer(10503, "Dias", "Trudkhanov"),
          new Customer(61157, "Amanngeldy", "Zhanatov"),
          new Customer(28378, "Maksat", "Maksatov"),
          new Customer(57299, "Akbergen", "Berdiyar")
    };
    Arrays.sort(customers,
          Comparator.comparing(Customer::getLastName)
                .thenComparing(Customer::getFirstName)
                .thenComparingInt(Customer::getId));
    System.out.println(Arrays.toString(customers));
  }
}