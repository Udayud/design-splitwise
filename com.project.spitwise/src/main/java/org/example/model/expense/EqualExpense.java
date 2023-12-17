package org.example.model.expense;

import org.example.model.User;
import org.example.model.split.EqualSplit;
import org.example.model.split.Split;

import java.util.List;

public class EqualExpense extends Expense{

    public EqualExpense(double amount, User paidBy, List<Split> split, ExpenseMetadata expenseMetadata){
        super(amount,paidBy,split,expenseMetadata);
    }
    @Override
    public boolean validate() {
        for(Split split : getSplits()){
            if(!(split instanceof EqualSplit)){
                return false;
            }
        }
        return true;
    }
}
