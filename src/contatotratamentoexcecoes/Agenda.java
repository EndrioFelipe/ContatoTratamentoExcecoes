/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatotratamentoexcecoes;

import java.util.Scanner;

/**
 *
 * @author endrio
 */
public class Agenda {
    private Contato[] contatos;
   

    /**
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    Scanner digita = new Scanner(System.in);
    
    
    public void adicionaContato(Contato c){
        for (int i=0; i<contatos.length; i++){
            if(contatos[i]!=null){
                contatos[i]=c;
            }
        }
    }

    @Override
    public String toString() {
        String s ="\n";
        for(Contato c :contatos){
            s+=c.toString();
        }
        return s;
    }
    
    
    
    
}
