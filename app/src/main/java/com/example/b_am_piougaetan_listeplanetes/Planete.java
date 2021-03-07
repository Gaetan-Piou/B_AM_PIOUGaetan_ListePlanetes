package com.example.b_am_piougaetan_listeplanetes;

public class Planete {
    private String planeteName;
    private String planeteDesc;
    private int planeteId;


    //Constructeur
    public Planete(String planeteName, String planeteDescription, int planeteId) {
        this.planeteName = planeteName;
        this.planeteDesc = planeteDescription;
        this.planeteId = planeteId;
    }

    public Planete() {
        planeteName = null;
        planeteDesc = null;
        planeteId = 0;
    }


    //Assesseurs
    public String getPlaneteName() {
        return planeteName;
    }

    public String getplaneteDesc() {
        return planeteDesc;
    }

    public int getplaneteId() {
        return planeteId;
    }


    //Mutateurs
    public void setPlaneteName(String planeteName) {
        this.planeteName = planeteName;
    }

    public void setPlaneteDesc(String planeteDescription) {
        this.planeteDesc = planeteDescription;
    }

    public void setplaneteId(int planeteId) {
        this.planeteId = planeteId;
    }
}
