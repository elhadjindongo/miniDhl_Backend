/**********************************************/
/****** Created by El Hadji M. NDONGO ********/
/****** on 11/5/2021 ************************/
/****** Project: myDHL *********************/
/******************************************/

package com.ndongoel.myDHL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Adresse implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "adresse")
    private String adressLine;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(
                    name = "nom",
                    column = @Column(name = "ville")
            )
    })
    private Ville ville;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(
                    name = "nom",
                    column = @Column(name = "sous_division")
            )
    })
    private SousDivision sousDivision;
    @Embedded
    private Pays pays;
}
