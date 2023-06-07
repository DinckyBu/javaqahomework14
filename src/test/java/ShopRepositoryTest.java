import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.AlreadyExistsException;
import ru.netology.javaqa.NotFoundException;
import ru.netology.javaqa.Product;
import ru.netology.javaqa.ShopRepository;

public class ShopRepositoryTest {


    Product item1 = new Product(11, "хлеб", 40);
    Product item2 = new Product(222, "булка", 30);
    Product item3 = new Product(3, "картошка", 20);
    Product item4 = new Product(11, "яйцо", 12);


    //Выпадение NotFoundException
    @Test
    public void shouldRemoveProduct() throws Exception {
        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        try {
            repo.removeById(5);
        } catch (NotFoundException s) {
            System.out.println("Element with id: " + s + "is not found");
        }
    }

    //Удаление имеющегося продукта
    @Test
    public void shouldNotRemoveProduct() throws Exception {
        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        try {
            repo.removeById(3);
        } catch (NotFoundException s) {
            System.out.println("Element with id: " + s + "is not found");
        }
    }
}
