package hw1;


import hw1.models.PostEntity;
import hw1.models.UserEntity;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(UserCrudApp.createUser());
        System.out.println(UserCrudApp.updateUser(1));
        System.out.println(UserCrudApp.deleteUser(1));
        System.out.println(UserCrudApp.getUsers());
        System.out.println(UserCrudApp.getUserById(2));
        System.out.println(UserCrudApp.getUserByUsername("Karianne"));
        System.out.println(UserCrudApp.getCommentsLastPostByUserId(6));
        System.out.println(UserCrudApp.getOpenTodosByUserId(3));

    }
}

//
