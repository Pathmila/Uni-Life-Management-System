/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myunilife;

/**
 *
 * @author ASUS-Asini Pathmila Silva
 */
public class Validation {
    public static boolean validPassword(char[] pass, char[] repass) {
        if(pass.length == repass.length){
            for(int i=0; i<pass.length; i++){
                if(pass[i]!= repass[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
