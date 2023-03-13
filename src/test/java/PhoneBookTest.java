import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PhoneBookTest {

    @Test
    public void testAddForNumberOfContacts() {
        // given:
        String name = "Коля";
        String number = "89994017090";
        String nameTwo = "Вова";
        String numberTwo = "89994017090";
        PhoneBook phoneBook = new PhoneBook();
        // when:
        int addNumberOne = phoneBook.add(name,number);
        int addNumberTwo = phoneBook.add(nameTwo,numberTwo);

        // then:
        Assertions.assertEquals(1, addNumberTwo - addNumberOne);
    }

    @Test
    public void testAddForDuplicateNames() {
        // given:
        String name = "Вова";
        String number = "89994017090";
        String nameTwo = "Вова";
        String numberTwo = "89994022917";
        PhoneBook phoneBook = new PhoneBook();
        // when:
        int addNumberOne = phoneBook.add(name,number);
        int addNumberTwo = phoneBook.add(nameTwo,numberTwo);

        // then:
        Assertions.assertEquals(0, addNumberTwo - addNumberOne);


    }

}
