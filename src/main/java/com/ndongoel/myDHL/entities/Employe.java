/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/12/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String nom;
    @Column(length = 175)
    private String prenom;
    @Column(length = 50)
    private String telephone;
    @Column(length = 175)
    private String email;
    @Column(length = 175)
    private String posteOccuppe;
    @Embedded
    private Pays nationalite;
    @ManyToOne(cascade = CascadeType.ALL)
    private Adresse adress;
    @ManyToOne
    Entrepot entrepot;
}
