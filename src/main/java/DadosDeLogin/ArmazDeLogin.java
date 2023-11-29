/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DadosDeLogin;

import NovoUsuario.NovoCadastro;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class ArmazDeLogin {
    
    private ArrayList<NovoCadastro> NovoCadastro = new ArrayList<>();
    
    public boolean salvar (NovoCadastro v){
        if (v != null){
            NovoCadastro.add(v);
            return true;
        }else{
            return false;
        }
            
    }
    public ArrayList<NovoCadastro> retornaTodos (){
        return NovoCadastro;
    }
    
}
