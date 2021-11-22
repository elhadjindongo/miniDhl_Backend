/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/22/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.repositories;

import com.ndongoel.myDHL.entities.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpeditionRepository extends JpaRepository<Expedition,Long> {
}
