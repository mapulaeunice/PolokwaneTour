package com.example.codetribe.polokwanetour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Attraction extends AppCompatActivity {
    private final String name[] = {
            "Mapungubwe World Heritage Site",
            "Polokwane Game Reserve",
            "Bakone Malapa Museum",
            "Makapan Valley",
            "Polokwane Bird and Reptile Park",
            "Lelo"


    };

    private final String url[] = {
            "http://www.southafrica.net/cache/ce_cache/made/389468e0daf8b02f/Mapungubwe_1_453_300_80auto_s.jpg",
            "https://i.ytimg.com/vi/5-YOmV9Y7NE/maxresdefault.jpg",
            "http://www.roomsforafrica.com/images/limpopo_polokwane_bakone_malapa_open-air_museum_hut_drrissandmarrionn.jpg",
            "http://www.southafrica.net/cache/ce_cache/made/389468e0daf8b02f/Maropeng_1_960_472_80auto_s_c1_center_bottom.jpg  ",
            "https://sncdn.com/db/id/686786/go163033.jpg",
            "https://exp.cdn-hotels.com/hotels/4000000/3930000/3928400/3928356/3928356_72_z.jpg",



    };

    private final String description[] = {
            "Situated in the north of the Limpopo Province, Mapungubwe National Park is a magnificent game reserve and a World Heritage Site that is famed for being the home of the most socially advanced African society, one that then moved and later formed the empire known as Greater Zimbabwe.\n" +
                    "Visitors to Mapugubwe can spend time game viewing and exploring the extensive savannah landscape where Elephant, Buffalo, White Rhino and other wildlife all roam. One can also take a tour to the Mapungubwe Cultural Landscape to learn about the history of the area and view the virtually untouched remains of the settlement area and other historical landmarks. ",
            "Polokwane Game Reserve guarantees a high-quality, low-cost wildlife experience where you can see plenty of game, forests of aloes and unusual birds.\n" +
                    "\n" +
                    "In fact, Polokwane Game Reserve is something of an open secret among the birding fraternity. This is probably the easiest place to spot South African specials like the short-clawed lark as well as the Kalahari scrub-robin, ashy tit, zitting cisticola and burnt-neck eremomela. You might also see the unreasonably beautiful violet-backed starling.\n" +
                    "\n" +
                    "Most of the rich grasslands around the city of Polokwane in Limpopo have been converted to agriculture. This reserve is one of the last places you’ll find particular kinds of vegetation like the fertile Pietersberg Plateau False Grassland habitat.\n" +
                    "\n" +
                    "That’s because the fertile soils it grows on have mostly been snapped up by surrounding agriculture. But the nutritious grasses support some very rare species, like sable and tsessebe antelope. You could also see less finicky creatures like the white rhino. There are also giraffe, zebra, impala and more than a dozen more mammal species.\n" +
                    "\n" +
                    "Polokwane Game Reserve is 3 200 hectares in size and is one of the largest municipal reserves in the country. It has an excellent network of roads, so you can easily drive yourself around for game viewing. If you prefer your wildlife experiences on foot, there’s a 21km long hiking route. If you’re really energetic, you can do it in a day, but there are overnight facilities too. ",
            "The Bakone Malapa African Museum in Polokwane is an open-air mock up of a traditional Northern Sotho Bakone village from 250 years ago.\n" +
                    "This ‘living museum’ comes complete with thatch huts and communal areas with grinding stones, calabashes and other traditional implements and structures that were used 250 years ago in the daily life of the Bakone people.\n" +
                    "Exhibits in the homesteads show how the Bakone made fire, brewed traditional beer and ground maize.\n" +
                    "Women sit in the village and demonstrate arts and crafts such as basket making and bead work, which can be purchased at a small shop.\n" +
                    "The Museum is not open on Sundays except by special arrangement, but the grounds have a picnic and braai area and walking trails.",
            "Makapan is a paleontological site of international significance and is also part of the World Heritage Site of the Cradle of Humankind. Situated in the Waterberg northeast of Mokopane in the Limpopo Province, the site plays an important role in our understanding of human evolution. The network of limestone caves have yielded thousands of fossil bones, including A.africanus and other mammals. It also contains a remarkable unbroken sequence of archaeological remains from the Early Stone Age through to the recent Iron Age, and some of the earliest evidence of the controlled use of fire by our ancestors. The caves are also the site of the clash between the Boers and Kekana people in 1854. After attacks on the Voortrekkers at Moorsdrift, Chief Mokopane (Makapan) and his people, 3 together with their herds of cattle, were besieged in one of the caves. The siege lasted almost a month with thousands dying from starvation and dehydration",
            "A great attraction in the city is the Polokwane Bird and Reptile Park. It is one of the largest municipal reserves in the country and is a show piece of colour and bird-song. Over 280 bird species can be viewed, both indigenous and exotic. Aquariums are a delight and home to snakes and lizards and dark pools showcase an array of crocodiles and water birds. Well developed viewing hides and attractive picnic spots make this a tranquil and restful venue, enjoyable for the whole family.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be."
    };
    public final String address[] = {
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
                    "R37,\n" +
                    "Chuenespoort Road,\n" +
                    "Polokwane,\n" +
                    "0700,\n" +
                    "South Africa",
            "ADDRESS\n" +
                    "Lordten road, 118 Ivydale, Polokwane",
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
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 (0) 15 290 2331/3\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    " naturesway@telkomsa.net\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    " 015 295 2432\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 (0)15 292-1719",
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
        InformationAdapter adapter = new InformationAdapter(Attraction.this,hotels);
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
