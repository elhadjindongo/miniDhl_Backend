/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/22/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@ToString
@Entity
@DiscriminatorValue("courrier")
public class Courrier extends Expedition {
}
