package org.example.model.expense;

import org.example.model.User;
import org.example.model.split.ExactSplit;
import org.example.model.split.Split;

import java.util.List;

public class ExactExpense extends Expense{

    public ExactExpense(double amount, User paidBy, List<Split> split, ExpenseMetadata expenseMetadata){
        super(amount,paidBy,split,expenseMetadata);
    }
    @Override
    public boolean validate() {
        for(Split split: getSplits()){
            if(!(split instanceof ExactSplit))
                return false;
        }
        double totalAmount = getAmount();
        double exactSplitSum = 0;
        for(Split split : getSplits()){
            ExactSplit exactSplit = (ExactSplit) split;
            exactSplitSum += exactSplit.getAmount();
        }
        if(exactSplitSum != totalAmount)
            return false;
        return true;
    }
}
