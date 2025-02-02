package listaHeranca.pokemon;

public class Status {
    private String status;
    private String ok = "OK";
    private String sleeping = "dormindo";
    private String paralyzed = "paralisado";
    private String stunned = "confuso";
    private String burned = "queimado";
    private String poisoned = "envenenado";

    public String getStatus(){
        return status;
    }
    public void setStatusOk(){
        this.status = ok;
    }
    public void setStatusSleeping() {
        this.status = sleeping;
    }
    public void setStatusParalyzed() {
        this.status = paralyzed;
    }
    public void setStatusStunned() {
        this.status = stunned;
    }
    public void setStatusBurned() {
        this.status = burned;
    }
    public void setStatusPoisoned() {
        this.status = poisoned;
    }
    
}