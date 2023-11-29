/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovoUsuario;

/**
 *
 * @author breno
 */
public class NovoCadastro {
    private String Login;
    private int Senha;
    public String setSenha;

    public NovoCadastro(String Login, int Senha) {
        this.Login = Login;
        this.Senha = Senha;
    }
    public NovoCadastro(){
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public boolean salvar(NovoCadastro NovoCadastro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
