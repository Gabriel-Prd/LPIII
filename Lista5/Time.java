package Lista5;

public class Time {
    private int hora;
    private int min;
    private int seg;

    Time(int hora, int min, int seg){
        if(validateTime(hora, min, seg)){
            this.hora = hora;
            this.min = min;
            this.min = seg;
        }
    }

    private boolean validateTime(int hora, int min, int seg){
        return validateHour(hora) && 
               validateMinOrSec(min) && 
               validateMinOrSec(seg);
    }

    private boolean validateHour(int hora){
        if((hora>=0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int param){
        if((param>=0) && (param<61))
            return true;
        else
            return false;
    }

    public boolean isAm(){
        if(this.hora < 12){
            return true;
        }else{
            return false;
        }
    }

    public int cron(Time outraHora){
        int novaHora = outraHora.hora * 3600 - this.hora * 3600;
        int novoMin = outraHora.min *60 - this.min * 60;
        int novoSeg = (outraHora.seg - this.seg) + novoMin + novaHora;

        if(this.hora < outraHora.hora){
            return novoSeg;
        }else{
            return novoSeg + 86400;
        }

    }

    public void addSeconds(int secs){
        seg += secs;
        if(seg > 59){
            min += seg / 60;
            seg %= 60; 
        }
        if(min > 59){
            hora += min / 60;
            min %= 60;
        }
        if(hora > 23){
            hora %= 24;
        }
    }

    public void setTime(int hora, int min, int seg){
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime(){
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime(){
        System.out.println(getTime());
    }
}
