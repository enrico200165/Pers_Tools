package com.enrico200165.weblistscraper.configs;

import org.apache.log4j.Logger;

public class LoginConfig {

    public String user;
    public String password;
    public String loginFormURL;
    public String loginFormAction;
    public String jsoupLoginFormSelector;

    private static Logger log = Logger.getLogger(LoginConfig.class);
}
