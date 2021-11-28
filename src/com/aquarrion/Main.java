package com.aquarrion;

import com.aquarrion.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConectorBD.getConnection();
    }
}
