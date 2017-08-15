package victor.training.java8.voxxed.order;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

import victor.training.java8.voxxed.order.entity.Customer;
import victor.training.java8.voxxed.order.entity.Order;
import victor.training.java8.voxxed.order.entity.OrderLine;

public class SearchStreams {
	
	public List<Order> p1_getActiveOrders(Customer customer) {
		return customer.getOrders().stream()
				.filter(Order::isActive)
				.collect(toList());
	}

	public Order p2_getOrderById(List<Order> orders, long orderId) {
		return orders.stream()
				.filter(order -> order.getId().equals(orderId))
				.findFirst()
				.orElse(new Order());
	}
	
	public boolean p3_hasActiveOrders(Customer customer) {
		return customer.getOrders().stream()
				.anyMatch(Order::isActive);
	}

	public boolean p4_canBeReturned(Order order) {
		return order.getOrderLines().stream()
				.noneMatch(OrderLine::isSpecialOffer);
	}
	
	// ---------- select the best ------------
	
	/**
	 * The Order with maximum getTotalPrice. 
	 * i.e. the most expensive Order, or null if no Orders
	 * - Challenge: return an Optional<creationDate>
	 */
	public Order p5_getMaxPriceOrder(Customer customer) {
		return null; 
	}
	
	/**
	 * last 3 Orders sorted descending by creationDate
	 */
	public List<Order> p6_getLast3Orders(Customer customer) {
		return null; 
	}
	
	
}
