package com.crunchshift.model;


public class Admin extends Karyawan {

    private int idAdmin;
    private String departemen; 
    private String tingkatanAkses; 

    public Admin() {
        super();
        setPeran("Admin");
    }

    public Admin(int idKaryawan, String nama, String email, String password,
                 String noTelepon, boolean statusAktif, int idAdmin, String tingkatanAkses) {
        super(idKaryawan, nama, email, password, noTelepon, "Admin", statusAktif);
        this.idAdmin = (idAdmin > 0) ? idAdmin : idKaryawan;
        this.tingkatanAkses = tingkatanAkses;
    }

    @Override
    public String getDeskripsiPeran() {
        return "Administrator " + (tingkatanAkses != null ? tingkatanAkses : "Pusat")
                + (departemen != null ? " (" + departemen + ")" : "");
    }

    public int getIdAdmin() {
        return idAdmin > 0 ? idAdmin : getIdKaryawan();
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getTingkatanAkses() {
        return tingkatanAkses;
    }

    public void setTingkatanAkses(String tingkatanAkses) {
        this.tingkatanAkses = tingkatanAkses;
    }

    public String getTingkatAkses() {
        return tingkatanAkses;
    }

    public void setTingkatAkses(String tingkatAkses) {
        this.tingkatanAkses = tingkatAkses;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}
