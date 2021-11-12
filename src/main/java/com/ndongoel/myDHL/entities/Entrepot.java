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
import java.io.Serializable;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Entrepot implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150)
    private String nom;
    private int capaciteEnMetreCarree;
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private Adresse adresse;
    @OneToMany(mappedBy = "entrepot")
    private Collection<Employe> employes;
}
