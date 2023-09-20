package sia.tacos.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    String deliveryName;
    String deliveryStreet;
    String deliveryCity;
    String deliveryState;
    String deliveryZip;
    String ccNumber;
    String ccExperience;
    String ccCVV;

    List<Taco> tacos = new ArrayList<>();

    public void addTaco (Taco taco) {
        if (this.tacos != null) {
            this.tacos.add(taco);
        }
    }
}
