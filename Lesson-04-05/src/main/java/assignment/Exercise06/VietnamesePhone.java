package assignment.Exercise06;

import java.util.ArrayList;
import java.util.List;

public class VietnamesePhone extends Phone {
    private List<Contacts> contactsList = new ArrayList<>();

    @Override
    public void insertContact(String name, String phone) {
        Contacts contacts = new Contacts(name, phone);
        contactsList.add(contacts);
    }

    @Override
    public void removeContact(String name) {
        System.out.println(contactsList.removeIf(contacts -> contacts.getName().equals(name)) ? "xóa thành công" : "không tìm thấy");
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contacts item : contactsList) {
            if (item.getName().equals(name)){
                item.setPhone(newPhone);
            }
        }
    }

    @Override
    public void searchContact(String name) {
        System.out.println("+--------------------+------------+");
        System.out.println("+        NAME        +    PHONE   +");
        System.out.println("+--------------------+------------+");
        for (Contacts contacts : contactsList) {
            if (contacts.getName().equals(name)){
                name = contacts.getName();
                String phone = contacts.getPhone();

                System.out.printf("|%-20s| %-10s|%n", name, phone);
            }
        }
    }

    public void show() {
        System.out.println("+--------------------+------------+");
        System.out.println("+        NAME        +    PHONE   +");
        System.out.println("+--------------------+------------+");
        for (Contacts contacts : contactsList) {
            String name = contacts.getName();
            String phone = contacts.getPhone();

            System.out.printf("|%-20s| %-10s|%n", name, phone);
        }
    }
}
