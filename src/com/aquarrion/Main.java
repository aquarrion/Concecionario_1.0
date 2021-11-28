package com.aquarrion;

import com.aquarrion.dao.ClienteDAO;
import com.aquarrion.model.Cliente;
import com.aquarrion.util.ConectorBD;
import com.mysql.cj.xdevapi.Client;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1450","Juan Aguilar","Cochabamba","Av. Ayacucho s/n",78450215);
        //Cliente Sara = new Cliente("1451","Sara Ralde","Cochabamba","Av. Ayacucho s/n",78450215);
        //Cliente Romulo = new Cliente("1452","Romulo Duran","Cochabamba","Av. Beijing s/n",75066542);
        //Cliente Arturo = new Cliente("1453","Arturo Vidal","Cochabamba","Av. America s/n",79851231);
        //Cliente Gary = new Cliente("1454.1B","Gary Aguilar","Cochabamba","Av. Aroma s/n",76326546);
        //Cliente Karina = new Cliente("1455","Karina Condori","Cochabamba","Av. Blanco Galindo s/n",75752169);

        //CRUD tabla clientes
        ClienteDAO clienteDAO = new ClienteDAO();

        //Crear usuarios
        /*clienteDAO.addCliente(Sara);
        clienteDAO.addCliente(Romulo);
        clienteDAO.addCliente(Arturo);
        clienteDAO.addCliente(Gary);
        clienteDAO.addCliente(Karina);*/

        //READ
        /*
        List<Cliente> clientes = clienteDAO.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }*/

        //UPDATE
        //Cliente cliente = new Cliente("1450","Juan Aguilar","Cochabamba","Av. suticollo s/n",78450215);
        //clienteDAO.updateCliente(cliente);

        //DELETE
        clienteDAO.deleteCliente("1450");
        clienteDAO.deleteCliente("1454.1B");
    }
}
