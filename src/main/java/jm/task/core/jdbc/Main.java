package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Роберт",  "Левандовский", (byte) 32);
        userService.saveUser("Лионель",  "Месси", (byte) 33);
        userService.saveUser("Кевин",  "Де Брёйне", (byte) 29);
        userService.saveUser("Криштиану",  "Роналду", (byte) 36);
        userService.getAllUsers();
        userService.removeUserById(3);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
