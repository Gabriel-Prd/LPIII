package Lista4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private Date dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método para imprimir os detalhes do contato
    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Data de Nascimento: " + dateFormat.format(dataNascimento));
    }

    public int calcularIdade() {
        if (dataNascimento == null) {
            return 0;
        }
        Date dataAtual = new Date();
        long diferencaEmMilissegundos = dataAtual.getTime() - dataNascimento.getTime();
        long diferencaEmAnos = diferencaEmMilissegundos / (365 * 24 * 60 * 60 * 1000);
        return (int) diferencaEmAnos;
    }
}