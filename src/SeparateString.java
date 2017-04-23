/**
 * Created by alex on 23.04.2017.
 */
public class SeparateString {
    static String Row = "domain giftsshoppro.com => db giftsshopp16 , user giftsshopp16 , password fYKIDa9euK9dTiQ \n" +
            "domain sunglasseseasy.com => db sunglasses52 , user sunglasses52 , password TscgHxdUo5Ra0H1 \n" +
            "domain clothesfun.com => db clothesfun32 , user clothesfun32 , password JQpcSix2EAIWvur \n" +
            "domain gadgetsfast.com => db gadgetsfas28 , user gadgetsfas28 , password CDwqBeWYEDA95Rc \n" +
            "domain accessoriesbest.com => db accessorie103 , user accessorie103 , password pf8YG674aRG2w5C \n" +
            "domain bagsfun.com => db bagsfunco49 , user bagsfunco49 , password j29vpxGfGcUwhT1 \n" +
            "domain weddingstuffnow.com => db weddingstu66 , user weddingstu66 , password 3VCjj2WSTYETq3h \n" +
            "domain weddingmartstar.com => db weddingmar80 , user weddingmar80 , password y9NSApLXuiobMxo \n" +
            "domain bedroomeasy.com => db bedroomeas83 , user bedroomeas83 , password CUB1AEmVRf7RwUu \n" +
            "domain jeansshopstar.com => db jeansshops96 , user jeansshops96 , password cm05WnjQHCjL0CK\n";

    public static void main(String[] args) {
        excludeComma();

    }


    public static void excludeComma() {
        for (String retval : Row.split(" , ")) {
            System.out.println(retval +" \n");

        }

    }
}



