/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/5/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.config;

import com.ndongoel.myDHL.entities.*;
import com.ndongoel.myDHL.models.Decoupage;
import com.ndongoel.myDHL.models.Genre;
import com.ndongoel.myDHL.models.Region;
import com.ndongoel.myDHL.repositories.ClientRepository;
import com.ndongoel.myDHL.repositories.EmployeRepository;
import com.ndongoel.myDHL.repositories.EntrepotRepository;
import com.ndongoel.myDHL.repositories.ExpeditionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDB {
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner init(EntrepotRepository entrepotRepository, EmployeRepository employeRepository, ClientRepository clientRepository, ExpeditionRepository expeditionRepository) {

        return args -> {

            Pays sen = new Pays("Senegal", "SEN", Region.OUEST_EUROPE);
            Pays usa = new Pays("Etats Unies d'Amerique ", "USA", Region.NORT_AMERIQUE);
            Pays can = new Pays("Canada", "CAN", Region.NORT_AMERIQUE);

            SousDivision regionDk = new SousDivision(Decoupage.REGION, "Dakar", "DK");
            SousDivision etatCal = new SousDivision(Decoupage.ETAT, "Californie", "CA");
            SousDivision provinceOn = new SousDivision(Decoupage.PROVINCE, "Ontario", "ON");

            Ville dk = new Ville("Dakar", "20213");
            Ville red = new Ville("Redding", "96001");
            Ville ot = new Ville("Ottowa", "K1Z 7B5");

            Adresse adresse1 = new Adresse(null, "Parcelles Assainies, Unité 14 N° 357", dk, regionDk, sen);
            Adresse adresse2 = new Adresse(null, "3332 Riverwood Drive", red, etatCal, usa);
            Adresse adresse3 = new Adresse(null, "4804 Quiet Valley Lane", ot, provinceOn, can);
            Adresse adresse4 = new Adresse(null, "Medina, rue N° 35 X 22", dk, regionDk, sen);
            Adresse adresse5 = new Adresse(null, "1636 Mesa Vista Drive", red, etatCal, usa);
            Adresse adresse6 = new Adresse(null, "3566 Baker Street", ot, provinceOn, can);
            Adresse adresse7 = new Adresse(null, "Pikine, Rue 10", dk, regionDk, sen);
            Adresse adresse8 = new Adresse(null, "450 Lauzon Parkway", red, etatCal, usa);
            Adresse adresse9 = new Adresse(null, "4000 Carling Avenue", ot, provinceOn, can);
            Adresse adresse10 = new Adresse(null, "Mermoze, Villa N° 37", dk, regionDk, sen);
            Adresse adresse11 = new Adresse(null, "1193 Locust Court", red, etatCal, usa);
            Adresse adresse12 = new Adresse(null, "357 Byers Lane", ot, provinceOn, can);
            Adresse adresseClient13 = new Adresse(null, "37 High Hill", ot, provinceOn, can);
            Adresse adresseClient14 = new Adresse(null, "8 Prince Eduard street", ot, provinceOn, can);
            Adresse adresseClient15 = new Adresse(null, "98 McArthy Residence ", ot, provinceOn, can);

            Entrepot entrepot1 = new Entrepot(null, "Diayma", 1000, adresse1, null);
            Entrepot entrepot2 = new Entrepot(null, "Buy more", 5200, adresse2, null);
            Entrepot entrepot3 = new Entrepot(null, "Best meilleurs", 3250, adresse3, null);

            entrepotRepository.save(entrepot1);
            entrepotRepository.save(entrepot2);
            entrepotRepository.save(entrepot3);

            Employe employe1 = new Employe(null, "Ndongo", "Elhadji", "77-519-45-94", "elhadji.ndongo@dhl-sen.com", "Manager General", sen, adresse4, entrepot1);
            Employe employe2 = new Employe(null, "Fall", "Fatima", "76-987-56-39", "fatima.fall@dhl-sen.com", "Assistante manager", sen, adresse10, entrepot1);
            Employe employe3 = new Employe(null, "Sarr", "Mamadou", "78-547-89-03", "mamadou.sarr@dhl-sen.com", "Caissier", sen, adresse7, entrepot1);
            Employe employe4 = new Employe(null, "Walker", "Sara", "530-813-8902", "sara.walker@dhl-usa.com", "Manager General", usa, adresse5, entrepot2);
            Employe employe5 = new Employe(null, "Dale", "John", "305-745-654", "john.dale@dhl-usa.com", "Accountant", usa, adresse8, entrepot2);
            Employe employe6 = new Employe(null, "Smith", "Danny", "657-098-8902", "danny.smith@dhl-usa.com", "Assistant manager", usa, adresse11, entrepot2);
            Employe employe7 = new Employe(null, "Hiks", "Paul", "249-457-9065", "paul.hiks@dhl-can.com", "Security", can, adresse6, entrepot3);
            Employe employe8 = new Employe(null, "Martin", "Melissa", "109-876-8461", "melissa.martin@dhl-can.com", "General Manager", can, adresse9, entrepot3);
            Employe employe9 = new Employe(null, "graham", "Gerald", "250-568-2890", "gerald.graham@dhl-can.com", "Logistic supervisor ", can, adresse12, entrepot3);

            employeRepository.save(employe1);
            employeRepository.save(employe2);
            employeRepository.save(employe3);
            employeRepository.save(employe4);
            employeRepository.save(employe5);
            employeRepository.save(employe6);
            employeRepository.save(employe7);
            employeRepository.save(employe8);
            employeRepository.save(employe9);

            Personne personne1 = new Personne();
            personne1.setNom("Steller");
            personne1.setPrenom("Patricia");
            personne1.setNumeroSecu(897654112);
            personne1.setGenre(Genre.FEMME);
            personne1.setAdresse(adresseClient13);
            personne1.setEmail("patSteller2020@gmail.com");
            personne1.setTelephone("986-346-2006");

            Personne personne2 = new Personne();
            personne2.setNom("Baldwin");
            personne2.setPrenom("Jonathan");
            personne2.setGenre(Genre.HOMME);
            personne2.setNumeroSecu(348901923);
            personne2.setAdresse(adresseClient14);
            personne2.setEmail("jhanty234@gmail.com");
            personne2.setTelephone("519-646-2486");

            Personne personne3 = new Personne();
            personne3.setNom("Smallwood");
            personne3.setPrenom("Amanda");
            personne3.setGenre(Genre.FEMME);
            personne3.setNumeroSecu(998556234);
            personne3.setAdresse(adresseClient15);
            personne3.setEmail("marrymarvin34@gmail.com");
            personne3.setTelephone("789-345-2489");

            clientRepository.save(personne1);
            clientRepository.save(personne2);
            clientRepository.save(personne3);

            //Expedition
            Courrier courrier1 = new Courrier();
            courrier1.setPoidsEnKg(0.3);
            courrier1.setDateDeDepot(new Date());
            courrier1.setStatut(Statut.EXPEDITION_EN_COURS);
            courrier1.setDestinataire(personne1);
            courrier1.setEntrepotDeDepot(entrepot3);
            courrier1.setEntrepotDeDestination(entrepot1);

            Colis colis1 = new Colis();
            colis1.setPoidsEnKg(3.34);
            colis1.setDateDeDepot(new Date());
            colis1.setStatut(Statut.EXPEDITION_EN_COURS);
            colis1.setDestinataire(personne2);
            colis1.setEntrepotDeDepot(entrepot3);
            colis1.setEntrepotDeDestination(entrepot2);
            colis1.setHauteurEnMetre(2.9);
            colis1.setLargeurEnMetre(2.5);
            colis1.setLongueurEnMetre(1.5);

            expeditionRepository.save(courrier1);
            expeditionRepository.save(colis1);
        };
    }

}
