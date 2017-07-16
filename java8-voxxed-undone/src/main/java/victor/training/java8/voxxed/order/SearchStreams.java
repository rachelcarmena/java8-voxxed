package victor.training.java8.voxxed.order;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import victor.training.java8.voxxed.order.entity.Customer;
import victor.training.java8.voxxed.order.entity.Order;
import victor.training.java8.voxxed.order.entity.Order.Status;

public class SearchStreams {
	
	public List<Order> p1_getActiveOrders(Customer customer) {
		return customer.getOrders().stream()
				.filter(order -> order.getStatus() == Status.ACTIVE)
				.collect(toList());
	}
	
	/**
	 * @return the Order in the list with the given id  
	 * - ...Any or ...First ?
	 * - what do you do when you don't find it ? null/throw/Optional ?
	 */
	public Order p2_getOrderById(List<Order> orders, long orderId) {
		return null; // orders.stream()
	}
	
	/**
	 * @return true if customer has at least one order with status ACTIVE
	 */
	public boolean p3_hasActiveOrders(Customer customer) {
		return true; 
	}

	/**
	 * An Order can be returned if it doesn't contain 
	 * any OrderLine with isSpecialOffer()==true
	 */
	public boolean p4_canBeReturned(Order order) {
		return true; // order.getOrderLines().stream() 
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
