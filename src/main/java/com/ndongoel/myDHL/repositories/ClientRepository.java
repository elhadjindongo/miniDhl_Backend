/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/20/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.repositories;


import com.ndongoel.myDHL.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
