package com.company;

public class  User {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String info;

    public User() {
        this.name = null;
        this.lastName = null;
        this.email = null;
        this.password = null;
        this.info = null;
    }

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.info = info;

    }


    public User(String email) {
        this.email = email;
        info = " This is a guest account.";
        }

    public void UserFromGuest(String name, String lastName, String password) {
        if (info == "This is a guest account") {
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            info = "This is user account.";
        }
        else{
            System.out.println("This account is already in use.");
        }
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }
}



