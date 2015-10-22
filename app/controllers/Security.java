/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import models.Usuario;

/**
 *
 * @author jesus
 */
public class Security extends Secure.Security{

    static boolean authenticate(String username, String password) {
        Usuario user = Usuario.find("byUsuario", username).first();
        return user != null && user.password.equals(password);
    }

    static boolean check(String profile) {
        Usuario user = Usuario.find("byUsuario", connected()).first();
        if ("administrator".equals(profile)) {
            return user.administrador;
        }
        else {
            return false;
        }
    }
}
