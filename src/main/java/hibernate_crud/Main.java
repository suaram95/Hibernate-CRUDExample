package hibernate_crud;

import hibernate_crud.model.User;
import hibernate_crud.service.UserCRUD;

public class Main {
    public static void main(String[] args) {
        UserCRUD userCRUD=new UserCRUD();

        User user= User.builder()
                .name("gfhfgh")
                .surname("fghfgh")
                .email("fghfgh")
                .password("fghfgh")
                .build();
        userCRUD.save(user);
    }
}
