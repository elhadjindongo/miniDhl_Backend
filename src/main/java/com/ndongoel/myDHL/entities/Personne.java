/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/20/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import com.ndongoel.myDHL.models.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@DiscriminatorValue("personne")
public class Personne extends Client {
    private String prenom;
    private String nom;
    private int numeroSecu;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
