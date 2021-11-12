/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/12/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.repositories;

import com.ndongoel.myDHL.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
