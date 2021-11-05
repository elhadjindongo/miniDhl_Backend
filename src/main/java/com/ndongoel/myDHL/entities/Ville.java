/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/5/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import com.ndongoel.myDHL.entities.SousDivision;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 120)
    private String nom;
    private int codePostal;

    @ManyToOne
    private SousDivision sousDivision;
}
