package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private final String date;
    private final double amount;

    public Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public double getAmount() {
        return amount;
    }
}

public class TransactionSum {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2025-04-20", 100.50),
                new Transaction("2025-05-20", 200.11),
                new Transaction("2025-03-20", 500.5),
                new Transaction("2025-04-20", 5.5)
        );

        Map<String, Double> dailysum =
                transactions.stream()
                .collect(Collectors
                        .groupingBy(Transaction::getDate,
                                Collectors.summingDouble(Transaction::getAmount)));

        dailysum.forEach((day, amount) -> System.out.println("Date is : "+ day+" amount is: "+amount   ));
    }
}
