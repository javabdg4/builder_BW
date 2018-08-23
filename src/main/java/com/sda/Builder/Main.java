package com.sda.Builder;

public class Main {
    public static void main(String[] args) {

        User user = User.UserBuilder.anUser()
                .age(21)
                .email("szogun@cdprojekt.com")
                .build();

        System.out.println(user.getAge());
    }
}
