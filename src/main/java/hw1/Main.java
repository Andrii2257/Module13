package hw1;


import hw1.models.PostEntity;
import hw1.models.UserEntity;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("createUser: \n" + UserCrudApp.createUser());
        System.out.println("updateUser: \n" + UserCrudApp.updateUser(1));
        System.out.println("deleteUser: \n" + UserCrudApp.deleteUser(1));
        System.out.println("getUsers: \n" + UserCrudApp.getUsers());
        System.out.println("getUserById(2): \n" + UserCrudApp.getUserById(2));
        System.out.println("getUserByUsername(\"Karianne\"): \n" + UserCrudApp.getUserByUsername("Karianne"));
        System.out.println("getCommentsLastPostByUserId(6): \n" + UserCrudApp.getCommentsLastPostByUserId(6));
        System.out.println("getOpenTodosByUserId(3): \n" + UserCrudApp.getOpenTodosByUserId(3));

    }
}

//
