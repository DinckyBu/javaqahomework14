package ru.netology.javaqa;

public class Main {


    public static void main(String[] args) throws Exception {
        ShopRepository repo = new ShopRepository();


        try {
            repo.removeById(3);
        } catch (NegativeArraySizeException e) {
            System.out.println("ERROR");
        }
    }
}