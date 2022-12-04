package com.casinoguru.utils.enums;

import lombok.Getter;

@Getter
public enum CasinoURL {
    LOGIN_URL("https://casino.guru/"),
    PROFILE("https://casino.guru/profile");
   private final String url;
   CasinoURL(String url){
       this.url = url;
   }
}
