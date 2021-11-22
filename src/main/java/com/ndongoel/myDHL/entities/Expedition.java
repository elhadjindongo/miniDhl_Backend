/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/21/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_expedition")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Expedition implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDeDepot;
    private Date dateDeRetrait;
    private double poidsEnKg;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    @ManyToOne
    private Entrepot entrepotDeDepot;
    @ManyToOne
    private Entrepot entrepotDeDestination;
    @OneToOne
    private Client destinataire;
}
