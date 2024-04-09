package br.com.PI2.controller;

import br.com.PI2.view.CadastroView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoginController {

    public static boolean verificarCredenciais(String email, String senha) {
        String caminhoArquivo = "C:\\Users\\jvazu\\OneDrive\\Documentos\\NetBeansProjects\\PI2Atv4\\usuarios.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            String emailArmazenado = null;
            String senhaArmazenada = null;
            
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("Email: ")) {
                    emailArmazenado = linha.substring(7);
                } else if (linha.startsWith("Senha: ")) {
                    senhaArmazenada = linha.substring(7);
                }
                
                if (emailArmazenado != null && senhaArmazenada != null) {
                    if (emailArmazenado.equals(email) && senhaArmazenada.equals(senha)) {
                        return true;
                    } else {
                        emailArmazenado = null;
                        senhaArmazenada = null;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler informações do arquivo: " + e.getMessage());
        }
        return false;
    }
    
    public void cadastroUsuario(CadastroView view) {
        cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    
    public static void cadastrarUsuario(String nome, String email, String senha) {
        String caminhoArquivo = "C:\\Users\\jvazu\\OneDrive\\Documentos\\NetBeansProjects\\Login\\usuarios.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("Senha: " + senha);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever informações no arquivo: " + e.getMessage());
        }
    }
}
