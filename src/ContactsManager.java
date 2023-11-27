import java.nio.channels.NotYetBoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContactsManager implements IContactsManager {
    List<Contact> contactsLinkedList;
    ArrayList<Contact> contactsArrayList;

    public ContactsManager() {
        this.contactsLinkedList = new LinkedList<>();
        this.contactsArrayList = new ArrayList<>();
    }

    @Override
    public void addContact(Contact contact) {
        contactsLinkedList.add(contact);
        contactsArrayList.add(contact);
    }

    @Override
    public Contact getContactById(int id) throws NotFoundException {
        return contactsArrayList.stream().filter((contact -> contact.getId().equals(id))).findFirst().orElseThrow(()->new NotFoundException("Элемент не найден"));
    }

    @Override
    public void removeContact(Contact contact) {
        contactsLinkedList.remove(contact);
        contactsArrayList.remove(contact);
    }
}
