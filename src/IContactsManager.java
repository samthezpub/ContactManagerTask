public interface IContactsManager {
    void addContact(Contact contact);
    Contact getContactById(int id) throws NotFoundException;
    void removeContact(Contact contact);
}
