package spring.cheng.beans;


import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class House {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
