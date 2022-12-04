package com.casinoguru.pojo;

import lombok.Data;

@Data
public class ChangePage {
    public String newPassword;
    public String confirmPassword;

    public ChangePage(String newPassword, String confirmPassword) {
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }


}
