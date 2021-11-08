/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/5/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import com.ndongoel.myDHL.models.Decoupage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Embeddable
public class SousDivision {
    @Enumerated(EnumType.STRING)
    private Decoupage decoupage;
    @Column(length = 120)
    private String nom;
    @Column(length = 15)
    private String code;
}
