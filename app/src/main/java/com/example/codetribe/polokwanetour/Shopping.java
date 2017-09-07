package com.example.codetribe.polokwanetour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Shopping extends AppCompatActivity {
    private final String name[] = {
            "ThornHill",
            "Mall Of North",
            "Savannah Mall",
            "Flora Park Centre",
            "Limpopo Mall",
            "Cycad center"


    };

    private final String url[] = {
            "http://www.thornhillshoppingcentre.co.za/data1/images/banner1.jpg",
            "http://www.fgprop.com/images/gallery/mall-north/mall-of-the-north-big-05.jpg?width=550&height=363",
            "http://2.bp.blogspot.com/_UJQzmnjudgM/Swl3RjMEhoI/AAAAAAAACeE/8LikHBYPRHU/s1600/svhmall_8.jpg",
            "https://s-media-cache-ak0.pinimg.com/236x/8d/9e/cf/8d9ecf3c68e5e108c74b63cc941f3478--shopping-center-wuhan.jpg",
            "https://photo1.hotelsclick.com/dubai/45292/wide/flora-park-deluxe-apartments-entrance.22.jpg",
            "https://igx.4sqi.net/img/general/width960/3230113_fEitKYSesSWxjMJhunHiafWcaKEovF4nbCLLsknTOgE.jpg",
            "http://www.cmsignition.co.za/uploadimages/images_1045/_MG_1410_1_2_3_4_5_thumbnail.jpg",


    };
    private final String description[] = {
            "Thornhill Shopping Centre is aimed at convenience for you - our customer! We boast a wide selection of fine stores to suit all your requirements.",
            "The Mall of the North in Polokwane has become an icon of Limpopo's thriving capital city.\n" +
                    "\n" +
                    "The Mall of the North offers shoppers the largest and most comprehensive selection of shops, restaurants and cinemas under one massive roof.\n" +
                    "\n" +
                    "The Mall of the North is Limpopo's biggest property development to date. Set on a huge 27ha site on the outskirts of the city, the Mall of the North offers easy access to public transport in a city that has grown rapidly as a result of being a host city for the 2010 FIFA World Cup.The 75 000 square metre shopping mall's anchor tenants include several national supermarkets, various leading brand chain stores as well as a state-of-the-art entertainment complex.\n" +
                    "\n" +
                    "The entertainment complex boasts six cinemas, all with digital surround sound, and three of the cinemas offer 3D, a first for the province. Together, the cinemas have seating capacity for 1 000, adding an exciting new edge to entertainment options in Polokwane.\n" +
                    "\n" +
                    "The Mall of the North also leads the way in environmentally friendly and green shopping mall design. Designed to blend in with the warm climate and wilderness areas for which Limpopo is famous, the Mall of the North has taken environmental issues into careful account. Reducing their carbon footprint is part of the centre's ethos.",
            "Savannah Mall is the pride of Polokwane.\n" +
                    "\n" +
                    "With more than 100 shops to choose from, the mall has served the people of Polokwane for years and plans on doing so for years to come.\n" +
                    "\n" +
                    "Shops housed in Savannah Mall include: Dis-Chem, Baby City, Toys R Us, KFC Drive-Thru, all the major anchor tenants and an elegant Banking Mall.",
            "Flora park shopping centre is next to Pietersburg Civil and is located in Capricorn District Municipality, Limpopo, South Africa. Flora park shopping centre has a length of 0.38 kilometres.",
            "Limpopo Mall is the main shopping area within the city and has a Pick 'n Pay, clothing stores, fast food restaurants, and an FNB bank with ATM.\n" +
                    "\n" +
                    "Tags: bank account, clothing stores, fast food, restaurants, shopping, shopping area, shopping center, shops, stores, supermarket",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be."
    };

    public final String address[] = {
            "ADDRESS\n" +
                    "Shop 61\n" +
                    "Thornhill Shopping Centre\n" +
                    "Cnr Veldspaat & Munnik Avenue\n" +
                    "Polokwane\n" +
                    "0700\n" +
                    "Polokwane\n" +
                    "South Africa\n",
            "ADDRESS\n" +
                    " Cnr R81 and N1 interchange \n" +
                    "Bendor, Polokwane\n",
            "ADDRESS\n" +
                    "Thabo Mbeki St & Grimm Street \n" +
                    "Fauna Park \n" +
                    "Polokwane, 0699\n",
            "ADDRESS\n" +
                    "Flora Park Centre \n" +
                    "293 Marshall Street, Florapark /n" +
                    "Polokwane, 0699\n",
            "ADDRESS\n" +
                    "Limpopo Mall, Rissik St\n" +
                    " Polokwane 0699 \n" +
                    "South Africa\n",

            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n"
    };
    public final String contacts[] = {
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "(015) 296 0889\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "polokwane@swh.co.za\n" ,
            "CONTACT DETAILS\n" +
                    "The Mall of the North\n" +
                    "TEL\n" +
                    "+27 (0)15 265 1026/45\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "info@mallofthenorth.co.za\n",

            "CONTACT DETAILS\n" +
                    "Savanna Mall\n" +
                    "TEL\n" +
                    "015 296 1401\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "nfo@savannahcentre.co.za\n" +
                    "GPS COORDINATES\n" +
                    "-23.904708, 29.485951\n",

            "CONTACT DETAILS\n" +
                    "Flora Park Centre\n" +
                    "TEL\n" +
                    " 015 296 3314\n" +
                    "CONTACT DETAILS Fax\n" +
                    "015 297 1695\n" +
                    "GPS COORDINATES\n" +
                    " -23°54'38.88,  29°29'8.88\n",

            "CONTACT DETAILS\n" +
                    "Limpopo Mall\n" +
                    "TEL\n" +
                    "015 297 1383\n" +
                    "CONTACT DETAILS Fax\n" +
                    "015 297 1695\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inforlist);

        initViews();
    }
    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        List<Information> hotels = prepareData();
        InformationAdapter adapter = new InformationAdapter(Shopping.this,hotels);
        recyclerView.setAdapter(adapter);

    }
    private List prepareData(){
        List<Information> hotelses = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            Information information = new Information();
            information.setName(name[i]);
            information.setDescription(description[i]);
            information.setAddress(address[i]);
            information.setContacts(contacts[i]);
            information.setUrl(url[i]);
            hotelses.add(information);
        }
        return hotelses;
    }
}
