package com.casinoguru.utils.enums;

import lombok.Getter;

@Getter
public enum CasinoURL {
    PROFILE("https://casino.guru/profile");
   private final String url;
   CasinoURL(String url){
       this.url = url;
   }
}
