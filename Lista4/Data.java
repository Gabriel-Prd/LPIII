package Lista4;

public class Data {
    private int dia, mes, ano;

    public void inicializarData(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("Data invalida.");
        }
    }


    private boolean verificarData(int dia, int mes, int ano){

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        return true;

    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void imprimirData(){
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    public void imprimirDataExtenso(){
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.printf("%d de %s de %d\n", dia, meses[mes - 1], ano);
    }
}
