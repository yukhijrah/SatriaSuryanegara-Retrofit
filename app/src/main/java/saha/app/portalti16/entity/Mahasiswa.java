package saha.app.portalti16.entity;

import java.io.Serializable;

public class Mahasiswa implements Serializable{

    private String name;
    private String nim;
    private int id;

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
