package com.casinoguru.utils.enums;

import lombok.Getter;

@Getter
public enum Players {
    EXISTING_Player("cleanbeat.ent@gmail.com","superman2022");

    public final String email;
    public final String password;

  Players( String email, String password){
     this.email= email;
     this.password = password;
  }
}
