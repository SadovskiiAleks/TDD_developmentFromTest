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

    @Test
    public void testFindByNumber(){
        // given:
        PhoneBook phoneBook = new PhoneBook();
        // when:
        phoneBook.add("Вова","89994017090");
        phoneBook.add("Олег","89994017090");
        phoneBook.add("Вова","89003037090");
        phoneBook.add("Вова","89003012090");
        String name = phoneBook.findByNumber("89994017090");

        // then:
        Assertions.assertEquals("Вова", name);

    }

}
