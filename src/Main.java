
public class Main {
    public static void main(String[] args) {
        ContactsManager contactsManager = new ContactsManager();
        contactsManager.addContact(new Contact(1, "Вася", "Уолл-Стрит"));
        contactsManager.addContact(new Contact(2, "Петя", "Уолл-Стрит"));
        contactsManager.addContact(new Contact(3, "Олег", "Киевская"));
        contactsManager.addContact(new Contact(4, "Женя", "Жукова"));

        System.out.println(contactsManager);
    }
}