package com.baothy.tightcoupling;

public class MainTightCoupling {
    public static void main(String[] args) {
        //class này đóng vai UI Cointroller , gọi đk ~ CLASS Ở TẦNG DƯỚI : SERVICE, REPO,

        UserService userService = new UserService();
        userService.registerAccount(new Account());
    }
}
