package com.example.codetribe.polokwanetour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Accomodation extends AppCompatActivity {

    private final String name[] = {
            "Protea Hotel",
            "Meropa Casino",
            "Ethern Service Apartment",
            "Bolivia Lodge",
            "Mavuta Manor",
            "Sleepers Villa B&B",
            "Makhadzi Cloud Lodge"


    };

    private final String url[] = {
            "http://cache.marriott.com/propertyimages/p/ptgra/ptgra_main03_r.jpg?resize=0.5x:0.5x",
            "https://imgec.trivago.com/partnerimages/21/48/214857508_x.jpeg",
            "https://imgec.trivago.com/itemimages/30/58/3058403_isq.jpeg",
            "https://imgec.trivago.com/itemimages/38/33/3833220_v1_isq.jpeg",
            "https://imgec.trivago.com/partnerimages/62/31/62319260_x.jpeg",
            "https://imgec.trivago.com/partnerimages/14/51/145171870_x.jpeg",
            "https://imgec.trivago.com/uploadimages/22/32/22324120_x.jpeg"



};

private final String description[] = {
        "Experience safari living at a 4 star Limpopo resort hotel.\n" +
                "Protea Hotel Ranch Resort is situated just 25km south of Polokwane and 2 hours north of Johannesburg. Our superior 4-star hotel is easily accessible from both the N1 highway and the R101 main road. Comprising of 1000 hectares of pristine Limpopo Province bushveld, Protea Hotel by Marriott Ranch Resort is uniquely different. Guests have the pleasure of experiencing viewing of 25 species of antelope including the rare and endangered sable antelope, hyenas, giraffes, zebra, wildebeest, impala, nyala, buffalo, lion sanctuary and over 200 species of birds, as well as the Kolobe Tented Bush Camp which includes team building facilities and tented accommodation ideal for groups seeking a true African bush environment.terberg Mountains.",
        "The Meropa Casino & Entertainment World rises up like an ancient African palace under modern skies. Palm trees wave as you enter a world of fun and entertainment. This Polokwane casino and entertainment complex offers a tempting choice of clubs, conference venues, coffee shops and restaurants.\n" +
                "\n" +
                "Part of the well established Sun International group, the Meropa Casino & Entertainment World boasts a pleasant and spacious hotel set in landscaped gardens. The décor here is Afro-chic – tall pots, enormous pillars and archways, domed roofs.\n" +
                "\n" +
                "Children really love the Meropa Casino & Entertainment World's Wild World outdoor area, with WildThingZ the definite highlight.\n" +
                "\n" +
                "The first of its kind on the continent, this incredible multi-species enclosure contains a bird and reptile park as well as a butterfly park and insectarium.\n" +
                "\n" +
                "Viv Bristow, a wildlife expert and animal trainer for Hollywood movies, together with Trevor Oertel, a raptor expert, created WildThingZ. It really is mind-blowing stuff for kids and adults alike – you'll get to see everything from the daintiest, prettiest butterflies to the scariest-looking snakes, spiders and scorpions.\n" +
                "\n" +
                "If you're in the mood for music, head for Meropa's Jembe Tavern, a cosmopolitan club that hosts live comedy, cabaret and music. South African musicians ranging from kwaito king Mandoza and pop pied pipers Just Jinger, to jazz supremo Paul Hamner, have all played here.\n" +
                "\n" +
                "Meropa's small but classy casino is run with Smart Card technology. Smart Cards replace coins, providing you with hours of hassle-free fun. There are 17 table games including roulette and blackjack, and 100s of slot machines, including the ever-popular Dream Machine and Poker Magic, and a Poker Lounge.",
        "Our newly renovated guesthouse caters for the business traveller and tourist alike. All rooms have superior quality en-suite bathrooms, TV sets with DSTV Channels, Mini bar fridge and are tastefully furnished and decorated to make you feel pampered. Each room walks out onto the beautifully manicured garden where you can relax whilst sipping on an ice-cold sundowner.\n" +
                "\n" +
                "We are conveniently positioned 2 blocks away from Savanna Mall, 5 minutes away from the Polokwane Central Business District and the Magnificent Peter Mokaba Stadium. The Gateway International Airport and the Mall of the North, the biggest mall in Limpopo, are only 15km and 10km away respectively. Transport to and from these major central points is available at an additional cost.\n" +
                "\n" +
                "For the business traveller we have a 16-SEATER BOARDROOM and a business center for all your basic business needs.",
        "Bolivia Lodge is perfectly located for both business and leisure guests in Polokwane. The hotel has everything you need for a comfortable stay. To be found at the hotel are free Wi-Fi in all rooms, 24-hour front desk, facilities for disabled guests, Wi-Fi in public areas, room service. Comfortable guestrooms ensure a good night\\'s sleep with some rooms featuring facilities such as internet access– wireless (complimentary), internet access – wireless, wake-up service, private pool, non smoking rooms. Enjoy the hotel\\'s recreational facilities, including outdoor pool, massage, pool (kids), garden, before retiring to your room for a well-deserved rest. For reliable service and professionalstaff, Bolivia Lodge caters to your needs.",
        "Mavuta Manor is an elegant guesthouse situated in the heart of Polokwane's central business district. Its central location makes it easily accessible to all shopping Centre’s banks and national routes out of Polokwane heading to Musina, Phalaborwa, Tzaneen and Louis Trichard. This Modern 5 Luxury Suite property with all modern amenities was opened in October 2010 by Rivoni Group of Companies. \n" +
                "\n" +
                "Mavuta Manor boasts with sophistication and luxury from the minute you enter its secured surroundings to the \"Porte Cochere\", well manicured gardens and spacious luxurious suites. The guesthouse has a contemporary \"Afro Chique\" feel, with Persian Rugs, solid timber finishes incorporating lush, bright warm fabrics. This means you can expect nothing less than the highest level of service and enjoy a myriad of superior culinary delights in our fine dining room. Our pool side terrace with pristine gardens is an ideal location to unwind after a long day, enjoying a superlative glass of wine from our fine cellar while listening to the trickle of water from our rim flow pool and the ruffle of leaves from majestic trees surrounding the guesthouse, offering ample shade and privacy.",
        "Sleepers Villa is located in Polokwane. Centrally situated in the CBD. Close to Peter Mokaba Stadium. Offering 12 rooms, air-conditioned, en-suite bathroom or shower. Single /double beds with electric blanket. Dstv and tea/coffee station.\n" +
                "\n" +
                "Executive room equipped with hydro bath. Pickup service from airport available. Dinner/breakfast on request. Free WiFi. Executive rooms equipped with combination safe, hairdryer, bar fridge, bathrooms, underfloor heating, heated towel rails, extractor fans. Summer air-conditioning.\n" +
                "Secured parking and electric gates. Laundry service available. Disabled friendly.",
        "Makhadzi Guesthouse enjoys the finest location, sitting proudly on the outskirts the heart of a peaceful Limpopo province.We are situated 7Km away from Polokwane on one of the busiest routes to Moria .\n" +
                "Well built and comfortably positioned to provide its clients with the much needed accommodation and hospitality facility in the area is determined to be a leader in the hospitality industry. The Guesthouse provides self catering.\n" +
                "The Guesthouse is a place that combines the attractions of a guesthouse with a relaxed and personal touch. The rooms are designed to give a pleasant and comforting long and short stay for executives, families and tourists accommodation.\n" +
                "Each guest is assured of warm and professional attention. Our rooms' individually-appointed suites afford each guest the space and privacy to work and relax in peace. \n" +
                "While in the airy lounge, flanked by the euro-african styled finishing, the news of the day can be exchanged at the dining table - over an excellent breakfast or refreshments in the evening."

};
public final String address[] = {
        "ADDRESS\n" +
                "25 km South of Polokwane on the N1, R101, Farm Hollandrift, 0700, Polokwane (Pietersburg), South Africa",
        "ADDRESS\n" +
                "Plot 59 Sterkloop Roodepoort Road 0700, 0700, Polokwane (Pietersburg), South Africa",
        "ADDRESS\n" +
                "26 Springbok Street \n" +
                "Fauna Park, 0700, Polokwane (Pietersburg)\n" +
                "Limpopo, South Africa",

        "ADDRESS\n" +
                "Physical address \n" +
                "Road R81, 600m from Mall of the North, Polokwane, Limpopo Province, 0700.)\n" +
                "Postal address \n" +
                "P.O. Box 11309 Bendorpark. 0699.",
        "ADDRESS\n" +
                "94A Voortrekker Street \n" +
                "Polokwane, 0699, South Africa \n" +
                "Limpopo, South Africa",

        "ADDRESS\n" +
                "20A Bok St, Polokwane Central\n" +
                "Polokwane, 0699",
        "ADDRESS\n" +
                "21 Plot, Dalmada \n" +
                "0699, Polokwane (Pietersburg)\n" +
                "South Africa,Opposite Excel garage",





};
public final String contacts[] = {
                "CONTACT DETAILS\n" +
                "TEL\n" +
                "+27(15)2905000\n" +
                "CONTACT DETAILS Fax\n" +
                " +27(15)2905050\n" ,

        "CONTACT DETAILS\n" +
                "+27 15 290 5400\n" +
                "CONTACT DETAILS EMAIL\n" +
                "hellomeropa@suninternational.com\n"
        ,
        "CONTACT DETAILS\n" +
                "Peter Pratt\n" +
                "TEL\n" +
                "+27(15)2962303\n" +
                "CONTACT DETAILS Fax\n" +
                " Fax: +27(86)6157741\n",
        "CONTACT DETAILS\n" +
                "TEL\n" +
                " +27 15 296 0309 / 0153 / 0291 / 0297.\n" +
                "CONTACT DETAILS EMAIL\n" +
                "reservations@bolivialodge.co.za; events@bolivialodge.co.za \n" +
                "GPS COORDINATES\n" +
                " Latitude S23°52' 52.9\" Longitude E29°30' 55.4\"\n",

        "CONTACT DETAILS\n" +
                "TEL\n" +
                " +27(0)152972740 \n" +
                "CONTACT DETAILS Email\n" +
                " info@mavuta.com\n" ,
        "CONTACT DETAILS \n" +
                "TEL\n" +
                " 015 291 5285\n" +
                "CONTACT DETAILS Email\n" +
                " villa@sleepersvilla.co.za\n" ,

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
        InformationAdapter adapter = new InformationAdapter(Accomodation.this,hotels);
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
