/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/22/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@DiscriminatorValue("colis")
public class Colis extends Expedition{
    private double longueurEnMetre;
    private double largeurEnMetre;
    private double hauteurEnMetre;
}
