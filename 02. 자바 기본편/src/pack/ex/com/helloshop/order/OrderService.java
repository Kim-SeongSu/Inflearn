package pack.ex.com.helloshop.order;

import pack.ex.com.helloshop.product.Product;
import pack.ex.com.helloshop.user.User;

public class OrderService {
    User user = new User();
    Product product = new Product();
    Order order = new Order(user, product);
}
