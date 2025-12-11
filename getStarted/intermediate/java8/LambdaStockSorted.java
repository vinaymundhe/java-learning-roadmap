package intermediate.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
You have a class:

class Stock {
    String symbol;
    double price;
}

Write a lambda Comparator to sort stocks ascending by price.
also, Sort stocks by price DESC, then by symbol ASC.

 */
public class LambdaStockSorted {
        String symbol;
        double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LambdaStockSorted(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LambdaStock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        LambdaStockSorted stock1 = new LambdaStockSorted("AAPL",330);
        LambdaStockSorted stock2 = new LambdaStockSorted("GOOGL",265);
        LambdaStockSorted stock3 = new LambdaStockSorted("NVDA",167);
        LambdaStockSorted stock4 = new LambdaStockSorted("TSLA",450);
        LambdaStockSorted stock5 = new LambdaStockSorted("AMD",221);
        LambdaStockSorted stock6 = new LambdaStockSorted("JPM",330);


        List<LambdaStockSorted> stocksList = new ArrayList<>(List.of(
                stock1, stock2, stock3, stock4, stock5, stock6));

        List<LambdaStockSorted> sortedStock = stocksList.stream()
                .sorted(Comparator.comparing(LambdaStockSorted::getPrice))
                .toList();

        sortedStock.forEach(System.out::println);
        System.out.println("----------------");

        // Now, Sort stocks by price DESC, then by symbol ASC.

        List<LambdaStockSorted> sortedStockPart2 = stocksList.stream()
                .sorted(Comparator.comparing(LambdaStockSorted::getPrice)
                        .reversed().thenComparing(LambdaStockSorted::getSymbol))
                .toList();

        sortedStockPart2.forEach(System.out::println);

    }
}
