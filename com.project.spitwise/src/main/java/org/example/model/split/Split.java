package org.example.model.split;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.User;

@Data
@NoArgsConstructor
public abstract class Split {
    private User user;
    double amount;

    public Split(User user){
        this.user = user;
    }

}
