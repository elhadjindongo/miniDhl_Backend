/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 11/5/2021 ************************************/
/****** Project: myDHL *********************/
/****************************************************/

package com.ndongoel.myDHL.config;

import com.ndongoel.myDHL.entities.Adresse;
import com.ndongoel.myDHL.entities.Pays;
import com.ndongoel.myDHL.entities.SousDivision;
import com.ndongoel.myDHL.entities.Ville;
import com.ndongoel.myDHL.models.Decoupage;
import com.ndongoel.myDHL.models.Region;
import com.ndongoel.myDHL.repositories.AdresseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner initDatabase(AdresseRepository adresseRepository) {

        return args -> {
            Pays sen = new Pays("Senegal","SEN", Region.OUEST_EUROPE);
            Pays usa = new Pays("Etats Unies d'Amerique ","USA", Region.NORT_AMERIQUE);
            Pays can = new Pays("Canada","CAN", Region.NORT_AMERIQUE);

            SousDivision regionDk = new SousDivision(Decoupage.REGION,"Dakar","DK");
            SousDivision etatCal = new SousDivision( Decoupage.ETAT,"Californie","CA");
            SousDivision provinceOn = new SousDivision(Decoupage.PROVINCE,"Ontario","ON");

            Ville dk = new Ville("Dakar","20213");
            Ville red = new Ville("Redding","96001");
            Ville ot = new Ville("Ottowa","K1Z 7B5");

            Adresse adresse1 = new Adresse(null,"Parcelles Assainies, Unité 14 N° 357",dk,regionDk,sen);
            Adresse adresse2 = new Adresse(null,"3332 Riverwood Drive",red,etatCal,usa);
            Adresse adresse3 = new Adresse(null,"4000 Carling Avenue",ot,provinceOn,can);


            log.info("Preloading " + adresseRepository.save(adresse1));
            log.info("Preloading " + adresseRepository.save(adresse2));
            log.info("Preloading " + adresseRepository.save(adresse3));
        };
    }
}
