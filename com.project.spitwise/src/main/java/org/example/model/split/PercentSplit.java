package org.example.model.split;

import lombok.Data;
import org.example.model.User;

@Data
public class PercentSplit extends Split {
    private double percent;

    public PercentSplit(User user, double percentage){
        super(user);
        this.percent = percentage;
    }
}
