package com.saumya;

import java.util.HashMap;

public class LoginForm_usingGUI_PasswordandIDS {
    HashMap<String,String> map = new HashMap<String,String>();

    LoginForm_usingGUI_PasswordandIDS(){
        map.put("Saumya@2004","123456");
        map.put("Saurabh@2003","654321");
        map.put("Saurav@2002","135246");
    }
    public HashMap getlogininfo(){
        return map;
    }

    public static void main(String[] args) {
        new LoginForm_usingGUI_PasswordandIDS();
    }
}

