package com.example.codetribe.polokwanetour;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class Entertainment extends AppCompatActivity {

    private final String name[] = {
            "Meropa Casino",
            "Limpopo Golf Courses",
            "L'Orange Bleue Restaurant",
            "Tambati Overnight ",
            "Jembe Tavern",
            "Meropa Spa - Mangwanani",
            "Meropa Family Entertainment & Kids"


    };

    private final String url[] = {
            "http://www.casino.co.za/img/land-casino/graceland-casino.jpg",
            "http://media5.picsearch.com/is?QoNmFPYi9g8cuI7pecoZXvoVwgZXnhRXEM4UksJEvtE&height=255",
            "https://scontent-jnb1-1.xx.fbcdn.net/v/t1.0-9/14938311_1163410747086449_5414179189396645890_n.jpg?oh=f0550b28759f6c38ae2b126c75e76b88&oe=59EE678E",
            "https://igx.4sqi.net/img/general/200x200/wUiNebrIpcTDkH12cZCS6uBz-1kXIUSCoxTss0iV3J4.jpg",
            "http://www.wininganddining.co.za/gallery/4357-16009-gallery.jpg",
            "http://media3.picsearch.com/is?3VU5I-leOeID6OMVa8WQrcVI6qhDr10BhIfnC2AhYTU&height=227",
            "http://media2.picsearch.com/is?3bJcwobMrEIZWYDOW-AyTBCbRs_2f4JiGPqFS_AIb9E&height=223"



    };
    private final String description[] = {
            "Meropa Casino and Entertainment World is located on Sterkloop Roodepoort Road just  minutes from the capital, Polokwane, in Limpopo, Limpopo, South Africa. The casino and hotel represent a Moroccan style gaming mecca with a 24 hour casino and a strong emphasis on outdoor activities and family entertainment.\n" +
                    "\n" +
                    "WIth over 400 slot machines, 16 table games, weekend poker tournaments, and nightlife the grown-ups will have plenty of gaming action. Romantic dinner venues abound as well as family eateries. Family outings can include mini golf, go-karting, and wildlife park excursions.\n" +
                    "\n" +
                    "The Town Lodge Polokwane is a 3-star hotel with 102 guestrooms and suites offering all of the amenities you have come to expect at a Sun International property. The Moroccan theme carries over magnificently to the lodge for a well integrated resort experience in Limpopo.",
            "Limpopo is a land of legend and ruins that abounds in ancient forests, sparkling trout waters, mineral springs and waterfalls. Much of Limpopo has remained unchanged for centuries, offering unlimited opportunities for the enjoyment of untamed Africa and a unique destination for your golfing safari.",
            "TL'Orange Bleue is the renowned restaurant at Thaba Pitsi Nature Reserve, surrounded by wild terrain, African skies and wildlife. Housed in a rescued farmhouse, the restaurant and menu combine the simplicity of the surrounds, with the richness of Belgian-influenced cuisine, paired with French accents. The result is a delectably different Afro-European experience in gourmet cuisine.\n" +
                    "\n" +
                    "Awarded 'Best Restaurant in Limpopo' and graded 4 stars in the 2003 edition of the Top 100 South African restaurants, L'Orange Bleue is firmly entrenched in the Province's culinary map. Expect a sensational experience, from start to finish, with dishes such as the duck carpaccio with flakes of foie gras, and the fillet sauce du chef. Settle in for a long night and savour every delicious morsel on your plate, create by a passionate and accomplished team.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "The Jembe Tavern is an entertainment venue where you can taste traditional African delicacies while enjoying stand-up comedy, cabaret, live music and other great live performances. There are cleverly-designed braai tables in the outside area where you can sit around the table and take in the delicious braai aromas.The Jembe Tavern at Meropa Casino provides entertainment until 3am Wednesday, Friday, and Saturday and until 11pm other nights. Enjoy stand-up comedy, live music, cabaret performances and more while enjoying your favorite cocktails, or sample traditional African delicacies. The outside braai tables provide hours of barbecue fun and leisure party time.",
            "Mangwanani African Day Spa at Meropa Casino and Entertainment World is one of the most sought after spa experiences in the country with a host of 45 minute a la carte treatments as well as customized packages for any visitor's needs. The setting is intimate and Moroccan and the therapists offer such pleasures as Moroccan floor massage,Traditional Izimanga full body hot stone massage, Molala head neck, and shoulder massage, and a bevy of other intimate treatments sure to become your indulgence of choice as well.",
            "While most people think the focus of this Polokwane entertainment complex might be its casino, it's pretty clear that Meropa was built for family fun! Take a walk through the Meropa building and you'll find a bunch of fantastic things to do with the kids that won't leave you tearing your hair out or wondering where all your vacation money went!\n" +
                    "\n" +
                    "Zoom around the winding, open-air go-kart tracks with the kids. For the smaller people, a slower, less hair-raising track is available and, for the older adrenalin junkies, there's a faster racing track, perfect for high-speed moves. Or, if teeing off is more your family's vibe, take in a couple of holes on the Mini Golf course. It's okay - you don't need to have a handicap or any special gloves!\n" +
                    "\n" +
                    "For avid gamers and spinning winners, the arcade games will keep them winning! Using a token and card system, kids can win tickets to exchange for great prizes when they're done playing at each of their game stations in the arcade.",

    };
    public final String address[] = {
            "ADDRESS\n" +
                    "Meropa Casino and Entertainment World\n" +
                    "Prov Roodepoort Street, Polokwane, South Africa",
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
                    "0699 Church Street\n" +
                    "Polokwane",
            "ADDRESS\n" +
                    "Meropa Casino and Entertainment World\n" +
                    "Prov Roodepoort Street, Polokwane, South Africa",
            "ADDRESS\n" +
                    "Meropa Casino and Entertainment World\n" +
                    "Prov Roodepoort Street, Polokwane, South Africa",
            "ADDRESS\n" +
                    "Meropa Casino and Entertainment World\n" +
                    "Prov Roodepoort Street, Polokwane, South Africa"






    };
    public final String contacts[] = {
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 15 290 5400\n" +
                    "CONTACT DETAILS Fax\n" +
                    " +27 15 290 5401\n" +
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
                    "TEL\n" +
                    "(071) 879 1197 / (083) 780 4988\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "info@tambati.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23*56’11.20” E 29*27’00.26”\n",
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 15 290 5400\n" +
                    "CONTACT DETAILS Fax\n" +
                    " +27 15 290 5401\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",

            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 15 290 5400\n" +
                    "CONTACT DETAILS Fax\n" +
                    " +27 15 290 5401\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "TEL\n" +
                    "+27 15 290 5400\n" +
                    "CONTACT DETAILS Fax\n" +
                    " +27 15 290 5401\n" +
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
        InformationAdapter adapter = new InformationAdapter(Entertainment.this,hotels);
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
