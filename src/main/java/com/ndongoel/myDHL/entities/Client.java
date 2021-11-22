/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/20/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Inheritance
@DiscriminatorColumn(name = "type_client")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class Client implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @Column(length = 50)
    private String telephone;
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private Adresse adresse;
}
