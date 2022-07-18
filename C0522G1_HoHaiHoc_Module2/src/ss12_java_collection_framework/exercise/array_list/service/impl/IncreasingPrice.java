package ss12_java_collection_framework.exercise.array_list.service.impl;

import ss12_java_collection_framework.exercise.array_list.model.Product;

import java.util.Comparator;

public class IncreasingPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice());
    }
}
