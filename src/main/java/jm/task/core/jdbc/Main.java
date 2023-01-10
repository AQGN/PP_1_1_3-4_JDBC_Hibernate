package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Albert", "Isaev", (byte) 27);
        userDao.saveUser("Ivan", "Ivanov", (byte) 20);
        userDao.saveUser("Petr", "Petrov", (byte) 40);
        userDao.saveUser("Nikolay", "Nikolaev", (byte) 17);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
