

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits 'and it will affect your score
 */
public class Phonebook_Test {

    Phonebook obj = new Phonebook();

    @Test
    public void addContact_Test() {
        Phonebook phonebook = new Phonebook();

        Person person = new Person("Amir", "09118782919");
        Person person1 = new Person("Hasan", "09123422132");

        phonebook.addContact(person1);
        phonebook.addContact(person);

        assertEquals("09118782919", phonebook.getPhoneNumber("Amir"));
        assertEquals("09123422132", phonebook.getPhoneNumber("Hasan"));


    }


    @Test
    public void getPhoneNumber_Test(){
        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Var","09894532131");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        String name1= person.getName();
        String name2= person1.getName();

        assertEquals("09118782919",phonebook.getPhoneNumber(name1));
        assertEquals("09894532131",phonebook.getPhoneNumber(name2));

    }


    @Test
    public void getContact_Test(){
        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09906672414");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        String name1=person.getName();
        String name2=person1.getName();

        assertEquals(1,phonebook.getContact("Amir"));
        assertEquals(1,phonebook.getContact("Ali"));
        assertEquals(0,phonebook.getContact(" "));
    }


    @Test
    public void updateContactName_Test(){
        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        assertEquals(1,phonebook.updateContactName("Amir","Hasan"));
        assertEquals(1,phonebook.updateContactName("Ali","Morad"));
        assertEquals(0,phonebook.updateContactName("",""));
    }


    @Test
    public void updateContactPhoneNumber_Test(){
        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        assertEquals(0,phonebook.updateContactPhoneNumber("Amir","09118782919"));
        assertEquals(1,phonebook.updateContactPhoneNumber("Amir","09118782910"));

    }

    @Test
    public void deleteContact_Test(){
        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        assertEquals(1,phonebook.deleteContact("Amir"));
        assertEquals(0,phonebook.deleteContact(""));
        assertEquals(1,phonebook.deleteContact("Ali"));
    }

    @Test
    public void getAllContacts_Test(){

        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        ArrayList<Person> contact2=new ArrayList<>();

        contact2.add(person);
        contact2.add(person1);

        assertEquals(contact2,phonebook.getAllContacts());
    }

    @Test
    public void setAllContactsHidden_Test(){

        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        assertEquals(false,person1.isHidden());

        phonebook.setAllContactsHidden();

        assertEquals(true,person.isHidden());


    }

    @Test
    public void setAllContactsUnHidden_Test(){

        Phonebook phonebook=new Phonebook();

        Person person=new Person("Amir","09118782919");
        Person person1=new Person("Ali","09904567667");

        phonebook.addContact(person);
        phonebook.addContact(person1);

        assertEquals(false,person.isHidden());
        phonebook.setAllContactsHidden();
        assertEquals(true,person.isHidden());
        phonebook.setAllContactsUnHidden();
        assertEquals(false,person.isHidden());
        assertEquals(false,person1.isHidden());

    }


}

