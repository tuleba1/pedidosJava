package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date aniversario;
    public Cliente(){

    }

    public Cliente(String name, String email, Date aniversario) {
        this.name = name;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString(){
        return name + " (" + sdf.format(aniversario) + ") - "
                + email;
    }
}
