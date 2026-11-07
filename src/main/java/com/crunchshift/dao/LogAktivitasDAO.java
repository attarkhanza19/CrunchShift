package com.crunchshift.dao;

import com.crunchshift.model.LogAktivitas;
import java.time.LocalDate;
import java.util.List;


public interface LogAktivitasDAO {

    List<LogAktivitas> findAll();

    List<LogAktivitas> findByKaryawan(int idKaryawan);

    List<LogAktivitas> findPendingVerifikasi();

    boolean insert(LogAktivitas log);

    boolean updateVerifikasi(int idLog, String statusVerifikasi, String catatanSupervisor);


    List<LogAktivitas> cariLog(int idKaryawan);

    List<LogAktivitas> cariLog(int idKaryawan, LocalDate tanggal);
}
