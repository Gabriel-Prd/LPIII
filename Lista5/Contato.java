package Lista5;
import java.util.*;

public class Contato{
    private String nome, email, telefone, dataNacimento;

    Contato(String nome, String email, String telefone, String dataNacimento){
       if(validaNome(nome))
           this.nome = nome;
       else
           this.nome = "";
       if(validaEmail(email))
           this.email = email;
       else
           this.email = "";
       if(validDate(dataNacimento))
           this.dataNacimento = dataNacimento;
       else
           this.dataNacimento = "";
       if(validaNumero(telefone))
           this.telefone = telefone;
       else
           this.telefone = "";
    }

    public void inicializaContato(){
        email = "NONE";
        telefone = "NONE";
        nome = "NONE";
        dataNacimento = "00/00/0000";
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTel(String telefone){
        this.telefone = telefone;
    }
    public void setDataNasc(String dataNacimento){
        this.dataNacimento = dataNacimento;
    }

    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getTel(){return telefone;}
    public String getDataNasc(){return dataNacimento;}
    private boolean validaEmail(String email){
        return email.contains("@") && (email.contains(".com") || email.contains(".br"));
    }
    private boolean validaNome(String nome){
       return nome.matches("[A-Z][a-z]{1,}");
    }

    public static boolean validaNumero(String tel)
    {
        if(tel.length() == 11){

            for (int i = 0; i < tel.length(); i++) {
                char c = tel.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    private boolean validDate(String dataN){
        String[] dt = dataN.split("/");
        if(dt.length != 3)
            return false;

        int day = Integer.parseInt(dt[0]);
        int month = Integer.parseInt(dt[1]);
        int year = Integer.parseInt(dt[2]);

        if(validDateValue(day, month, year))
            return true;
        return false;

    }
    public void imprimeContato(){
        System.out.println("Contatos:\n\tEmail: " + email + "\n\tTelefone: " + telefone);
    }

    public int calcularIdade(){
        String[] birth = dataNacimento.split("/");
        if(birth.length != 3)
            return -1; 
        int diaNasc = Integer.parseInt(birth[0]);
        int mesNasc = Integer.parseInt(birth[1]);
        int anoNasc = Integer.parseInt(birth[2]);

        Calendar today = Calendar.getInstance();

        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1;
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        int idade = currentYear - anoNasc;

        if(currentMonth < mesNasc || (currentMonth == mesNasc && currentDay < diaNasc)){
            idade--;
        }
        return idade;
    }

    private boolean leapYear(int a){
        return(a%400==0 || (a%4==0 && !(a%100==0)));
    }


    private boolean validDateValue(int d, int m, int a){
        if((d >= 1 && d <= 31) && (m >= 1 && m <= 12)){
            if(m==2){
                if(leapYear(a) && d<=29)
                    return true;
                else return !(!leapYear(a) && d > 28);
            }
            return true;
        }
        return false;
    }
}