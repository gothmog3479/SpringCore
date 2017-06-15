package ru.gothmog.spring.core.impl;

/**
 * @author d.grushetskiy
 */
public class Database {

    public Database() {
        testConnection();
    }

    private void testConnection() {
        System.out.println("Test connection!");
    }
}
