/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_program;

/**
 *
 * @author Sebenele
 */
public class Socket_Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           server Server = new server(5000);
        client_02 client_01 = new client_02("127.0.0.1", 5000);  
        client_02 client_02 = new client_02("127.0.0.1", 5090);
    }
    
}
