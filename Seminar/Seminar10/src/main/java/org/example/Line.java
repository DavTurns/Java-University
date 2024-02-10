package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Line {

    private String name;
    private int count;

    private int pricePerArticle;

    private int totalPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPricePerArticle() {
        return pricePerArticle;
    }

    public void setPricePerArticle(int pricePerArticle) {
        this.pricePerArticle = pricePerArticle;
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", pricePerArticle=" + pricePerArticle +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Line(String name, int count, int pricePerArticle) {
        this.name = name;
        this.count = count;
        this.pricePerArticle = pricePerArticle;
        this.totalPrice = pricePerArticle * count;
    }

    public static Line parseFromCSVLine(String line){
        List<String> args = Arrays.stream( line.split(";")).toList();

        int count =  Integer.parseInt(args.get(1));
        int pricePerArticle = Integer.parseInt(args.get(2));
        return new Line(args.get(0), count, pricePerArticle);
    }
}
