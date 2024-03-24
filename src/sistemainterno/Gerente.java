package sistemainterno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
public class Gerente extends Funcionario implements IAutenticavel {
    
    private int senha;

    public Gerente(String login, int senha) {
        super(login, senha);
    }

     
    
    //outros atributos e métodos.
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
    }
}
    
