/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajoscouts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ADRIAN LUACES
 */
public class TrabajoScouts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("com.mycompany_TrabajoScouts_jar_1.0-SNAPSHOTPU");
        EntityManager em = enf.createEntityManager();
        em.close();
        enf.close();
    }
    
}
