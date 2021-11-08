/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/5/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import com.ndongoel.myDHL.models.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Embeddable
public class Pays {
    @Column(length = 120,name = "pays")
    private String nom;
    @Column(length = 10,name = "code_iso")
    private String codeIso; //code iso-3166-1 Alpha 3
    @Enumerated(EnumType.STRING)
    private Region region;
}
