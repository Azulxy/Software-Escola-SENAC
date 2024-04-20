package br.com.PI2.controller;

import POJO.Usuario;
import br.com.PI2.view.CadastroView;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    private static List<Usuario> usuarios = new ArrayList<>();

    public static boolean verificarCredenciais(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public void cadastroUsuario(CadastroView view) {
        cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    
    public static void cadastrarUsuario(String nome, String email, String senha) {
        usuarios.add(new Usuario(nome, email, senha));
    }
}
