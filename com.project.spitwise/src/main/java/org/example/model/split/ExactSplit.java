package org.example.model.split;

import lombok.Data;
import org.example.model.User;

@Data
public class ExactSplit extends Split {

    public ExactSplit(User user, double amount){
        super(user);
        this.amount = amount;
    }

}
