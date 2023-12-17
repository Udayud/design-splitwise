package org.example.model.expense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.User;
import org.example.model.split.Split;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Expense {
    private String id;
    private double amount;
    private User paidBy;
    private List<Split> splits;
    private ExpenseMetadata metadata;

    public Expense(double amount, User paidBy, List<Split> splits, ExpenseMetadata metadata) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
        this.metadata = metadata;
    }

    public abstract boolean validate();

}
