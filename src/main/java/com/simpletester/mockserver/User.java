package com.simpletester.mockserver;

import lombok.Getter;
import lombok.Setter;

class User{
    @Getter
    @Setter
    String firstname;
    @Getter
    @Setter
    String lastname;

    public User(String _firstname,String _lastname){
    this.firstname=_firstname;
    this.lastname=_lastname;
    }
}