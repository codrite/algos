package com.codrite;

import java.util.HashSet;
import java.util.Set;

public class GoodStringSplit {

    public static void main(String[] args) {
        System.out.println(numSplits("icahdfbifaefihedbhcibeiigihiggdfcccdbhgeaedggddfdfceachbcehiaidfihagbdbhhciabadifadeceabdchhacfhgecaecifcbhhihcbfddeddheahcaiacgciiicgaficehbicidgchdgiiciidccgheechihbbihhfacabhgfbdgcefehfedcegdbggcgbdihdffdehdhchgcgaabebfdaihhieffbbeedgidcbiachedebgbahgafbbeighggcgdfbbhhdebiefcffacacaibfagbibcegdccahfbbehiiieddibdaedibaecbcgfehffaeccgfdfgbgffgdefhbgbafbhcffbefabeagbcacecbdaicahfehaigegcadfdibheiahcfbehdidbiciegbfefcgdfhibgggdddfifacbaaahggadbibdgfegeebeddechghdgiedbfcfciddhggifaiddbcdgibidhhgiagebeifdcacbigigbicghachcedaaicaiafgbdediibdggaggafahihbhddbhecbffhhhibbhecdbgiefcaiibeagbgafedeechbbifddhgcdcfafgieecfehdaedegdihdbibhficgiaeheecaegcbhcighfdiecficcgfheifbghdgbhfcbfdciffiiggaffbgfddcicgagggfgfaecfdheiafhhabebadhcgccafibaagheaibdigbbfggfiicfighefhfbdehfaiiiacchcfegiiecaaibecebgiefeedgccfcbhchhgieddbeaffgeeeaeifbhicdcfgbeadfeaifcbeahgfcceabagbaediegeaieaiabgdahgbeiebadhchieggcfbffcadebehcdcahaceiaaiaaigacefecdgiadabfiggiabahfeagdgcefahchceggiebaddbifichcibhhbgbadbgcdaegheefffadadbhbifidfdedabaagddbcbifahgbfeehbgbibgabcigcbehbedabfcfiefacdhbahagfaceadegicgbadhffecicgfcffbbiefbegbhddhehggghfegabigiihdfbbehiaaeihdeafcigacefgfigdcdfdhehdgebabfidbhcibiicggcechdaadfccbgfcgdcgedhdebhbceieffegbbhibegegfcicfaggdiihhibeaegeghieiehbebefdhcdbeiibiecddafhaaeaagidiiageccaaaadcebefhbedbicegeeiacfaibaihchgfdiabgchcfagfbefaccedbdihhieehghdgaaiedbdecciiffcdffiafiiidbhccaihbdhefhabgieegficbdfcbcbfebgghhibedbegeegigaddegfhdhbiahhiffbbcdffbfbbdibhgfbbfaheihceadiacchgbhfehhigacgdededdehaiddadihfbiiahhdbaefhhibgibcdedfeggiebdchdbbcehihahcdeddghgiaeghaebigbggfcbcdcgbccbgidaebccffeegicibgdahgdfechiahciadafcfbhdfcebagfbiadaheifbagbbgggcifecegfefibbibdegfhchiaegagegchaecffhgciaadhgiidhhbdcedeeecabaefhebaccdcagcbigedhbhceegdiecdgagdbbegceiiibiaciafffiadccaeabhecaidfbcbccihbgafghfebfeahacgbbhddchhafehaccgdgcegdbabcbiabihbihcfebeaffcggfcbiiaacfegdagfefbaeggheheceeeaiagfbiffdhgagegfcibbghdbfaicaiihcegcdabdcfefhgbagfaffahgeghgccacehbbbbbbhieehhhciehhbgabgdbgahfehidiibihgagfdfiggdafedciaegeeehabfhdghiaigabfdabhgihhbddaacgfedaddfdcheegbcfddifbebbiachcdfddehaehchbaiefcdfgeggeecfdbbgfhbcghddeaeeefaihbdeeeeefiggdgiabadfgiegefibagccaggacedegfggegdebgbgibdfghdidcihfcbcbbhhdbicciabfhiaigfcfcaficgbhidbdfhadgfehhcfdhefigafhfbdcddbbbecfiefecgcgiiifciddcdiidcicbcfgfhaegacahfcdfbcgbedgiehefbddibeefddgdhhiffhhgihhhdcbgehgiecgggecfehiiebdiibabfbchiaifgdddihghcfacgfgcefdeedibfccifaeideceifdhadehdabcfagfccgdgihacaghgdifahehgceebeeaifbhdaihibbifhgcbddabadfaaahifedhgfaaccbhhicccchdgffegaeaaaeaehgacihebecfgagaegbbidfddhagfcaifhgicdfbcaghcgbdhbcahebfdfifageeheggbgfahhifdciicchgeciabhgcgcbdfahfeibbiggaaiadhhedcifidiefihfbfegdbhieghbdacdddbcgbfebfccehccigbcbebdedgdgaahfhfddghfeabadfbgiidgfiifhiafhiedhdhagcfffgeidfhfhabcbcbdcdhbdcgdbefgchahcagfbgcbbeggadfeegccifdfiibcdgdbigbidgegaaccbgdgggcihfiacgiacigeehfdfcedfhhedhbdidegccbcgaadacihcgfcibheiaedefcfdbhcbbcbgcgcabgeiegafgghehcdedigfdhhfaceegbbdeheagheddhbceffhbhhfdhaddcdibbbgegcagdihhhbbifaeciabcggihifbachciaffgaddccdebechhbdceafigfegifggadgdbfgeaghabhidbcbhafhgcghfgbcihifdgdcebhegbffacbcheabidebgaddafihaiaheififgbfgcbicfiaaghbahdgadabfcbibahddechdhddadgaefefbgiahgcefhffehhhhgahihhdcbbcfhiggcbcfbegecfbbdbghbahceaffcbfehifagefcbcdaiaiaaeahiccbghchicaafcbdigbbfaeeaiddbhcdebcdhhbiddhffhhaededgcdaaigfccaddchgfichfeccafgfbadhbdffgcgfffcceefebehcedgfddegidhbfifbidcfffhbegfggfbfbhbfehgghfiigcbfccebddahbagdefidffchaibegigciiiegecchdadieggebchdgifghihfgefhdbegfghbecdfccdffefggbdaiagfbaaahfcicbahaabdiabahgcbcgicgcafccieebceeaihcefgaahegchedceifdbbhdbaheeefffbgedffchiaiaihaafggddebacdihabdfbccfgbhafhiggcabahggehghiceedbebfbceeefhfhaigadafcfgiiiadgeebaeeigibdafcgahhfeahhcghfadiadbbdidcgeghfhbfaicicgafhbeahccdiaidffeiahbgcgdccbhafhiciehgedbabifgciaieehhddefaaicahcfggdidcehfgigdccieahdhfbaefeiieecebbdchdhgcebfeceidcfdfidhhaigfhigadecagffegcabbgiffbfhbhiddchieheaibgagehbigdadhfabegfahagfdbccdggbbdiaeeaebccighcagafdgbfggdhhdchagddcighihefdgbeidiahebiiehdhccbcgdaccgfbahihbcadfgcbcabccdfccaddhdghbffgaebddhicebbefibaeigfagiiafhdbbiffagahiahhegeieeadcecfecbadecdbadigiffbgdehdcbedbiigfidcegfhahchabeidefbadcfbcgdhcfdeeffgdifigcfebgdiaccibbbehadcgieheghebahhiafbbdfehgaiiaadgcaabbdeaacbbfbgigbibeabbfcccgdghabeicdgiecahgahbbfecfbhaeifgdigeeaddggbiffidebfihaecaadcgafaaeehbghbehbgefaibcifbhhgbfcagcdgdgcgieigdahhgcaichaagidfadihhfadgfggfhcaahgggcdhibhcbfdbdecggbffhgdicgeicefiegaccaebccibidfcddibbfdfdebibghbhdccebidifheigabaecicebiffhedgfadcfbbdhhhdbicbchgbffcghdbahbhbegebiccdcdhhgbiciicaebbeccebcddfdefbhiifeecfhdhficdcdhcdaeidifabbaigcbhicaeibfafefchgchchagcagbahghcgaehficeabdieidbifacagcfeefdehiagecaahbahiggahfgageagdecihbedghcegdegfbbiiiigihhgiaaabdidiafdehhiebdcbggihbggiiiafhabaeiceigeebaccbdgdicffefefedghebcgheaidheidifbffaifdddhhccdfciaahaddcdbbdacgfagadiceebfbhihefbcdfhhggdedhiaecdgcebbiibadegccigdhbdeeebbfebgaedcfbfgidgbcfhigahacecdaacihhfcafhfbdadgdgbcggdfcacgbdeaebdafgihaeicaeeiagagcciehdbabchfafahecehbdfcachfabehaaiefdbbaehcigiehbghcdeedbcfcdfgechcgfiiadgdfcideebchcicgdidccgfiaaghhaibeiebfhabhdeeacehgghfaefbhaiefaahibdcagiabgegdeffcdbachdbgdhhbhgfeafdihidhgibihhficabhfeicihebaacbbhicbidiabgaaefgdibhgchdaghagfgiaibedeidbhafiiigibadiccabccecghehdfcfdfgbihiedicadeghbbcaheaiacbbadfcfhgegfihbbgfbhbiihhahfbhfffbihfbbiddifechbahidfiigaifcdfihgacgaebhgeeiigddcheeddcigadcdbibegfcafcdgfibeedicfffaicabggchbibebaidbafhhcgdbdiggigggedheiccbifedgeicfahfdfgeicdgfhedaeicgcfgehibbgaifdgfhaecghhfidhegeihahbghfecagdfcacgfahahhcdcifegfgfcfdbeafbhecfbihecehichheiggaiigeeaeeehagghhafhibibcgdbchiecfheehgcabbbeegibhfddhhcfeeafhchbgcchdfhgcihdggfibdbdidgighichfeiabfggfaggfiddidcahaaaagahdadgegcggicdhahggfbbacaeigfaacfhhebehihbfaedcdbebcagafagbhcfbfaidhgdhefhbieffbaifgabfeacdhbiaggageiiahgiiafhebbbdefebiicbiiggagdcddbcfaafabdfgbchffhdbbeacihehbihgbeihhfdiiedadhfgcccibchdhcefafdggbdhgcccfggbdbbicbbdacdcfccfcfddidcgfbibfighihfafaaghbgbdcacheifgbchagfdcihfhcfacefafhegiagbidcdbbdgcccbabdeaddagcciffgbcbgighbfbaaiahcbefaadffaggicicceedbhbaaeggbibdeegbcdhihhhdgdchdgdiffhfibdbcadecciabagdihgfhgcgadfacgdegafighfhffagghaiifhiiaibffhbhfgdafahiaabaeaaheifgegfffaegbbefacbhchbdifdgcgiacdbffhdbfchbicchcegebefgccedfccdfaegfdhhhefhchehfdfdhaafiifdgddhddadeghhebhidfebhigfbheahcbagcdbhegfadiachdgiahihcfidbceibccafihahdehadcdfcbgdghdbehediiffdbeiiidacfidiififcfcahbdbdfeiddedaedhihdbfabebfgheeghfeaefhgdahiigbcbaehdgedaiedffbehbdfigeiccgcgdifbihdiibgigediehiahfgdhebaghfbgcichfdbeagdbigifbeddihbbgdgaeecidbfgfgfeifbgbcbhdhahdeheaaacbhiceegefidhcdidhiaidhfcbcegccbiidbgafedfaffeiigefifaicagedffefehhahffgaghaeabiaffgdgcdchecebdiddcbgffdgbechbceifiicadbhedaicdcdfhffcaiigfcdeafifbefdgbdfbgdaeigbcfhgibigdcgghdgbhgcbdgfcgfigdifchffcaeahbgcgafhfeeidbdaigciifdgdcgaegdaieiidfhfaecffeacgahfagbbcgbfgghaahfheihdaheihgfiifgeabfbhhagbbaididgbicegdbahbgeffifhdfddeheifhaidcdihfchdaccigffiicdebdgdfdhcfdieghdibaifbddbgfcidaibaeageggfidacfacfgfaeiaifgabddgcfbhacbiaaabcfachgiicfedaeadecdhgabaadgdedfcgiddghaegacddagihbehehhhcfdehehiagcegehighicdbaddhceidihfaihicbdiedgfiecbiieibabbfdhabbcebeadhhbhiaabbcbfehcigcdgaffeifiaccgaichadfifeecdabihfhfhibibeigdiabeibiaacgcdiifefciegigibgbhbdedifccdacdgehhfcdbicgdhafhcfcbegechddieegfghidcgbihcgahficfbdbhcgfgfddaebehgcgfeefcaacbeebhccgcdabaefdichedeeghaidhdiafbaheadccbeigdeeagbbeiiaedifhfcdabfaeicbifagibedaciggcaeahedfbgdcdibbiegbecdcfegbfibgbghbfifdiiafecdhdgaaaibdabbccfdfiaiacgdhchhhahfhicfbaaebefdaegeadecahdcdbahdaibagbehggedhddchgabaigdidedfacdabeedgdfedbffdcidfdehfeffgccagchidaigihgcfcbddbbaccahfdhehdccdcedfeebgfcebgaiahcecddcehgebibieidfecheigecehbfbfefcifbcaeaihbgbgbddceggbihfhfdefhcgaiighbcacfgacagdcchdgaebabcgfehiaehhebbcfbbgcaaihbdhgfbedbiifidfhcdhbdagdihghbehghgidbadebaebachfaeghcadffibiheibeeagdgbceiebfciigighcibdfaeidgbfbiibffabefageeifacaggdgiggfbcagiffhcgiceecfidgfdiihcgahffdhibigafebdhddghagbecgfghcfigdibibiadghgeddichighbciibfbdeieifihcaiibbabghibihhchidcghiabgdehideciechcehaagbgbdchbbafhcdeigdedaafhiiebheehdffaggcgdhececaabbciidhcdbdgcheidbgddbebiieiifcahgfcbdbbachbhihbbiaagfbeheehbffhihiddgggcbciebhcgdaceiaihdgifbcdeciccbfbdcghfeceafhachihcgdaiigccciaegggfbcfdfafidedcdhaaeifhcgfhccbdfcabcigigigggegbdehcfdaiabhabbdbfbaadebgbbehgfbdaghhgiigigdfeecbdhhigdbeiicfefcfeddbeafdicciigcifhfafdbbeibcdghagefaeebgifibaadhaabfaefcegddcabgcbfcfgiehhfgdhdfefgfebiafeeehhadiafaehchccheibcdhiachcciccccdfefhhbiebbcegechcbhahfifbcihbeabicabgeibccgigdidfcedfcfeigiibcdigfecbahgcifgabacgdbcifbeegaeiafagecbcdgdgfigfhheeheefdhaefahbagiifghbicgfhhdaadagfcghdefbdggbaaddhaecdifddiahebaacieiefaahbfifbfgffhdagcihhifcfhdedcgbaacfdhhahhdahhbecceabaedhfaaabdbhfbahbdciiebhdhgcchccieafcgdgefdbfhgicbchiddacdigaddadidegfhggiiddfcfidhgicibdieghchfhecifhafhdefebeidceehddegcicfbdahdcdihbbdghiaecggbbfiegfeehbdcdceddiifgciacaehhdhigfdidbiaheifihffdbaegebhgiggghifhaegefhegbbdhhhidecdbafecgfabdhcabhcgghagfhffifafegdibaaebcegdgciaedfacdgghiihaifaidegcbehhfafgcidbaegcchabhfabdbhifbfhagiidbabiifibfhadeiiiicigigcbbdieafgdcbeiedfdecbaagbiaibhbaheeeceggecbfdieaegccgbfcfceifhhgeadcdhfaecbfbcgfhehdgccgdhhifbbeiedfbhfcfigifhggaffaibaadhbcheiahieaidbhheiecfebiebaicddggibaabeefceggacfdcggebfhghhdbaefdaeggcdbfeeheggigcffcidagehgificbfiededfbhadcdfcabdgcbfbfhiiaidbgbgdifgfdaieiaccafhdfgggbfhehadeddiddadfiigchhhiicfechidiadiffhieghbggfcfaaaacgdgdfbebhecbgdhfcbfcbdgaiaifedfccceacghhefcciahbhbgfdicdhhdeeiadfadfebcbgbhfdhhfifdafibbahacaeheeahaegfadeaigiedcegfdefhhehibhacdgcdceceaaihahfbgadfbaiaedcaedfcgefgaaccahiaebagehiccegfacdeebgdfhbiafechdfeceggdffecafbecfhggcacbebbfbhiieaeieghdcdefegiadhgfdedhaefdadiihichhiacgihfbdhgchgeibfcaacigdeahdcbbciibabbbiifgacfefebicidhbifagadgedaeifciahebcgiddfehgbeidiichaehbgcheifadeicgibbeabcgchgeifegaeagbdffagchaiaecabcfibgahihbicbdgfihedfahibfdicgefbagaghgaghdaiibcfiacdfiaiaecgcgbfdibbcdheccggcggdfghihhhghdbfhaacbfibgehgchgdaeibdiadbicchdcaicfddaciaacdbaadigfadcghcedbbeifaebdafgeechadhfbgagceebacceccffaceghacchgaiicfaaicgiibfdahccidaigcgdiehhcifchabchacfghachicgaifiigcccfcgibfhaihagfddhdgaidchic"));
    }

    static public int numSplits(String s) {
        int d = (int)Math.pow(10,9)+7;
        int[] rhsd = new int[100005];
        int[] lhsd = new int[100005];
        int n = s.length();
        Set<Character> ss = new HashSet<>();
        lhsd[0] = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < n; i++) {
            ss.add(c[i]);
            lhsd[i+1] = ss.size();
        }
        ss.clear();

        rhsd[0] = 0;
        for(int i = 0; i < n; i++) {
            ss.add(c[n-1-i]);
            rhsd[i+1] = ss.size();
        }

        int ret = 0;
        for(int i = 1; i < n; i++) {
            ret += (lhsd[i] == rhsd[n-i] ? 1 : 0);
        }

        return ret%d;
    }

    static public int distinct(String s){
        Set<Character> set = new HashSet<>();
        for(Character c : s.toCharArray())
            set.add(c);
        return set.size();
    }

}
