package pack.ex.com.helloshop.order;

import pack.ex.com.helloshop.product.Product;
import pack.ex.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
