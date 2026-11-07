package com.crunchshift.model;


public class Supervisor extends Karyawan {

    private int idSupervisor;
    private String areaTanggungJawab; 
    private String shiftSupervisi; 

    public Supervisor() {
        super();
        setPeran("Supervisor");
    }

    public Supervisor(int idKaryawan, String nama, String email, String password,
                      String noTelepon, boolean statusAktif, int idSupervisor, String areaTanggungJawab) {
        super(idKaryawan, nama, email, password, noTelepon, "Supervisor", statusAktif);
        this.idSupervisor = (idSupervisor > 0) ? idSupervisor : idKaryawan;
        this.areaTanggungJawab = areaTanggungJawab;
    }

    @Override
    public String getDeskripsiPeran() {
        return "Supervisor " + (areaTanggungJawab != null ? areaTanggungJawab : "-")
                + (shiftSupervisi != null ? " (Shift " + shiftSupervisi + ")" : "");
    }

    public int getIdSupervisor() {
        return idSupervisor > 0 ? idSupervisor : getIdKaryawan();
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getAreaTanggungJawab() {
        return areaTanggungJawab;
    }

    public void setAreaTanggungJawab(String areaTanggungJawab) {
        this.areaTanggungJawab = areaTanggungJawab;
    }

    public String getAreaSupervisi() {
        return areaTanggungJawab;
    }

    public void setAreaSupervisi(String areaSupervisi) {
        this.areaTanggungJawab = areaSupervisi;
    }

    public String getShiftSupervisi() {
        return shiftSupervisi;
    }

    public void setShiftSupervisi(String shiftSupervisi) {
        this.shiftSupervisi = shiftSupervisi;
    }
}
