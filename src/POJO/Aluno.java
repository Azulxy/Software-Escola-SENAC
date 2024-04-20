package POJO;

public class Aluno {
    private String codigoMatricula;
    private String nome;
    private String telefone;
    private String serie;
    private float notaMatematica;
    private float notaPortugues;
    private float notaCiencias;
    private float notaHistoria;
    
    
    public Aluno(){
        
    }
    
    // Construtor
    public Aluno(String codigoMatricula, String nome, String telefone, String serie) {
        this.codigoMatricula = codigoMatricula;
        this.nome = nome;
        this.telefone = telefone;
        this.serie = serie;
    }

    // Getters e Setters
    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNotaMatematica(float notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public void setNotaPortugues(float notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public void setNotaCiencias(float notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public void setNotaHistoria(float notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
    
    public float getNotaMatematica() {
        return this.notaMatematica;
    }

    public float getNotaPortugues() {
        return this.notaPortugues;
    }

    public float getNotaCiencias() {
        return this.notaCiencias;
    }

    public float getNotaHistoria() {
        return this.notaHistoria;
    }
}
