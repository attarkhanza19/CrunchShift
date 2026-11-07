package com.crunchshift.dao;

import com.crunchshift.model.KategoriPoin;
import java.util.List;


public interface KategoriPoinDAO {

    List<KategoriPoin> findAll();

    KategoriPoin findById(int idKategori);

    boolean insert(KategoriPoin kategori);

    boolean update(KategoriPoin kategori);

    boolean delete(int idKategori);
}
