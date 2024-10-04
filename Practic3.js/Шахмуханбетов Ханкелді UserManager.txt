package Practic3.js;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
    }

    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                user.setRole(newRole);
                return;
            }
        }
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}

//YAGNI реализовал только методы добавление, удаление и обновление!
//KISS у каждого метода есть одно предназначение
//DRY вместо написания отдельных кодов для изменение имени и роли, объединили в один метод

//Шахмуханбетов Ханкелді