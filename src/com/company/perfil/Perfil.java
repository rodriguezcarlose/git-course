package com.company.perfil;

public class Perfil {
    private Integer id;
    private String description;
    private Boolean isActive;

    public Perfil() {
    }

    public Perfil(Integer id, String description, Boolean isActive) {
        this.id = id;
        this.description = description;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
