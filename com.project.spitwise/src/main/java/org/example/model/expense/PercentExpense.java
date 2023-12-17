package org.example.model.expense;

import org.example.model.User;
import org.example.model.split.PercentSplit;
import org.example.model.split.Split;

import java.util.List;

public class PercentExpense extends Expense{

    public PercentExpense(double amount, User paidBy, List<Split> split, ExpenseMetadata expenseMetadata){
        super(amount,paidBy,split,expenseMetadata);
    }
    @Override
    public boolean validate() {
        for(Split split: getSplits()){
            if(!(split instanceof PercentSplit))
                return false;
        }
        double percentSplitSum = 0;
        for(Split split : getSplits()){
            PercentSplit percentSplit = (PercentSplit) split;
            percentSplitSum += percentSplit.getPercent();
        }
        if(percentSplitSum != 100)
            return false;
        return true;
    }
}
