package com.pucprojperiodo2.farmacia.Repository;

import com.pucprojperiodo2.farmacia.Model.MedicamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentosRepository extends JpaRepository<MedicamentosModel, String> {
}
