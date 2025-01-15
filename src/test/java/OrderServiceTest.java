import org.example.sem10bytest1.model.Order;
import org.example.sem10bytest1.repo.OrderRepository;
import org.example.sem10bytest1.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @Test
    void processOrder_shouldSaveProcessedOrder() {
        // Arrange
        Order order = new Order(1L,List.of("item1", "item2"),"New");


        Order savedOrder = new Order(1L,order.getItems(),"Processed");


        Mockito.when(orderRepository.save(any(Order.class))).thenReturn(savedOrder);

        // Act
        Order result = orderService.processOrder(order);

        // Assert
        Assertions.assertEquals("Processed", result.getStatus());
        Mockito.verify(orderRepository, Mockito.times(1)).save(order);
    }

//    @Test
//    void processOrder_shouldThrowExceptionForInvalidOrder() {
//        // Arrange
//        Order invalidOrder = new Order();
//
//        // Act & Assert
//        Assertions.assertThrows(IllegalArgumentException.class, () -> orderService.processOrder(invalidOrder));
//        Mockito.verify(orderRepository, Mockito.never()).save(any(Order.class));
//    }
}