package edu.java.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class PoolConnectionBuilder {
    private DataSource dataSource;


    public PoolConnectionBuilder() {
        try{
            Context ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/textAdventure");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
