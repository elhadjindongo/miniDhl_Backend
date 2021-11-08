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
@Embeddable
public class Ville implements Serializable {
    @Column(length = 120)
    private String nom;
    @Column(name = "code_postal", length = 15)
    private String codePostal;
}
