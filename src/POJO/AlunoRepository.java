/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import br.com.PI2.view.HistoricoEscolarView;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jvazu
 */
public class AlunoRepository {
    private static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    
    
        public static ArrayList<Aluno> listarAlunos(){
        return listaAlunos;
        }
    
        public static void adicionarAluno(Aluno aluno){
            listaAlunos.add(aluno);
        }
        
        public void removerAluno(Aluno aluno){
            listaAlunos.remove(aluno);
        }
        public Aluno buscarAlunoPorCodigoMatricula(String codigoMatricula) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCodigoMatricula().equals(codigoMatricula)) {
                return aluno;
            }
        }
        return null;
    }
        
        public void atualizarAluno(Aluno alunoAtualizado) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            if (aluno.getCodigoMatricula().equals(alunoAtualizado.getCodigoMatricula())) {
                // Atualiza as informações do aluno na lista
                listaAlunos.set(i, alunoAtualizado);
                return; // Encerra o loop assim que o aluno é encontrado e atualizado
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno não encontrado para atualização.");
    }
}
