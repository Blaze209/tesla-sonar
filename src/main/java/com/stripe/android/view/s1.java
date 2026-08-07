package com.stripe.android.view;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BandhanBank' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bd\b\u0080\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B-\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bj¨\u0006k"}, d2 = {"Lcom/stripe/android/view/s1;", "", "Lcom/stripe/android/view/p;", "", "id", "code", "displayName", "", "brandIconResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getCode", "getDisplayName", "Ljava/lang/Integer;", "getBrandIconResId", "()Ljava/lang/Integer;", "Companion", "a", "KotakBank", "AndraBank", "AllahabadBank", "AndhraPragathiBank", "AirtelBank", "AUSmallFinanceBank", "BankOfBahrainAndKuwait", "BankOfBaroda", "BasseinCatholicBank", "BandhanBank", "BankOfIndia", "BankofMaharashtra", "CentralBankOfIndia", "CanaraBank", "CosmosBank", "CorporationBank", "CatholicSyrianBank", "CityUnionBank", "DeutscheBank", "Digibank", "DevelopmentCreditBank", "DenaBank", "DhanlakshmiBank", "EquitasSmallFinanceBank", "ESAFBank", "FederalBank", "FincareBank", "HDFCBank", "ICICIBank", "IDBIBank", "IDFCBank", "IndusIndBank", "IndianBank", "IndianOverseasBank", "JammuKashmirBank", "JanaBank", "JanataSahakariBank", "KarnatakaBank", "KalyanJanataBank", "KalpurBank", "KarurVysyaBank", "KarnatakaVikasGrameenaBank", "LaxmiVilasBank", "MehsanaBank", "NEBank", "NKGSBBank", "OBCBank", "PunjabNationalBank", "PunjabAndSindBank", "RBLBank", "SBI", "StandardCharteredBank", "ShivalikMercantileBank", "SouthIndianBank", "SuryodayBank", "SaraswatBank", "SyndicateBank", "ThaneBharatBank", "TJSBBank", "TamilnadMercantileBank", "TamilNaduStateBank", "UBI", "UNIBank", "AxisBank", "VijayaBank", "VarachhaBank", "YesBank", "ZoroastrianBank", "KarnatakaGraminBank", "ShamraoVithalBank", "NutanNagrikBank", "BOBBank", "PunjabNationalCorpBank", "ShamraoVithalCorpBank", "BNPParibas", "RBLCorpBank", "ICICICorpBank", "IDBICorpBank", "AxisCorpBank", "AndhraCorpBank", "DhanlaxmiCorpBank", "AllahabadCorpBank", "HFDCCorpBank", "YesCorpBank", "CorporationBankCorporate", "BarclaysCorpBank", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s1 implements p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 AndhraCorpBank;
    public static final s1 BandhanBank;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final s1 Digibank;
    public static final s1 IDBIBank;
    public static final s1 KalpurBank;
    public static final s1 RBLBank;
    public static final s1 ShamraoVithalBank;
    public static final s1 TamilnadMercantileBank;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;
    public static final s1 KotakBank = new s1("KotakBank", 0, "162", "kotak", "Kotak Bank", null, 8, null);
    public static final s1 AndraBank = new s1("AndraBank", 1, "ADB", "andhra", "Andhra Bank", null, 8, null);
    public static final s1 AllahabadBank = new s1("AllahabadBank", 2, "ALB", "allahabad", "Allahabad Bank", null, 8, null);
    public static final s1 AndhraPragathiBank = new s1("AndhraPragathiBank", 3, "APG", "andhra_pragathi", "Andhra Pragathi Grameena Bank", null, 8, null);
    public static final s1 AirtelBank = new s1("AirtelBank", 4, "ATP", "airtel", "Airtel Payment Bank", null, 8, null);
    public static final s1 AUSmallFinanceBank = new s1("AUSmallFinanceBank", 5, "AUB", "au_small_finance", "AU Small Finance Bank", null, 8, null);
    public static final s1 BankOfBahrainAndKuwait = new s1("BankOfBahrainAndKuwait", 6, "BBK", "bank_of_bahrain_and_kuwait", "Bank of Bahrain and Kuwait", null, 8, null);
    public static final s1 BankOfBaroda = new s1("BankOfBaroda", 7, "BBR", "bob", "Bank of Baroda - Retail Banking", null, 8, null);
    public static final s1 BasseinCatholicBank = new s1("BasseinCatholicBank", 8, "BCB", "bassein_catholic", "Bassein Catholic Co-operative Bank", null, 8, null);
    public static final s1 BankOfIndia = new s1("BankOfIndia", 10, "BOI", "bank_of_india", "Bank of India", null, 8, null);
    public static final s1 BankofMaharashtra = new s1("BankofMaharashtra", 11, "BOM", "bank_of_maharashtra", "Bank of Maharashtra", null, 8, null);
    public static final s1 CentralBankOfIndia = new s1("CentralBankOfIndia", 12, "cbi001", "central_bank_of_india", "Central Bank of India", null, 8, null);
    public static final s1 CanaraBank = new s1("CanaraBank", 13, "CNB", "canara", "Canara Bank", null, 8, null);
    public static final s1 CosmosBank = new s1("CosmosBank", 14, "COB", "cosmos", "Cosmos Bank", null, 8, null);
    public static final s1 CorporationBank = new s1("CorporationBank", 15, "CRP", "corporation_bank", "Corporation Bank", null, 8, null);
    public static final s1 CatholicSyrianBank = new s1("CatholicSyrianBank", 16, "CSB", "catholic_syrian", "Catholic Syrian Bank", null, 8, null);
    public static final s1 CityUnionBank = new s1("CityUnionBank", 17, "CUB", "city_union", "City Union Bank", null, 8, 0 == true ? 1 : 0);
    public static final s1 DeutscheBank = new s1("DeutscheBank", 18, "DBK", "deutsche", "Deutsche Bank", null, 8, null);
    public static final s1 DevelopmentCreditBank = new s1("DevelopmentCreditBank", 20, "DCB", "development_credit_bank", "Development Credit Bank", null, 8, null);
    public static final s1 DenaBank = new s1("DenaBank", 21, "DEN", "dena", "Dena Bank", null, 8, null);
    public static final s1 DhanlakshmiBank = new s1("DhanlakshmiBank", 22, "DLB", "dhanlakshmi", "Dhanlakshmi Bank", null, 8, null);
    public static final s1 EquitasSmallFinanceBank = new s1("EquitasSmallFinanceBank", 23, "EQB", "equitas_small_finance", "Equitas Small Finance Bank", null, 8, null);
    public static final s1 ESAFBank = new s1("ESAFBank", 24, "ESF", "esaf", "ESAF Small Finance Bank", null, 8, null);
    public static final s1 FederalBank = new s1("FederalBank", 25, "FBK", "federal_bank", "Federal Bank", null, 8, null);
    public static final s1 FincareBank = new s1("FincareBank", 26, "FNC", "fincare", "Fincare Bank", null, 8, null);
    public static final s1 HDFCBank = new s1("HDFCBank", 27, "HDF", "hdfc", "HDFC Bank", null, 8, 0 == true ? 1 : 0);
    public static final s1 ICICIBank = new s1("ICICIBank", 28, "ICI", "icici", "ICICI Bank", null, 8, null);
    public static final s1 IDFCBank = new s1("IDFCBank", 30, "IDN", "idfc_first", "IDFC FIRST Bank", null, 8, null);
    public static final s1 IndusIndBank = new s1("IndusIndBank", 31, "IDS", "indusind", "IndusInd Bank", null, 8, null);
    public static final s1 IndianBank = new s1("IndianBank", 32, "INB", "indian_bank", "Indian Bank", null, 8, null);
    public static final s1 IndianOverseasBank = new s1("IndianOverseasBank", 33, "IOB", "indian_overseas", "Indian Overseas Bank", null, 8, null);
    public static final s1 JammuKashmirBank = new s1("JammuKashmirBank", 34, "JKB", "jnk", "Jammu & Kashmir Bank", null, 8, null);
    public static final s1 JanaBank = new s1("JanaBank", 35, "JNB", "jana_small_finance", "Jana Small Finance Bank", null, 8, null);
    public static final s1 JanataSahakariBank = new s1("JanataSahakariBank", 36, "JSB", "janata_sahakari_bank", "Janata Sahakari Bank Ltd Pune", null, 8, null);
    public static final s1 KarnatakaBank = new s1("KarnatakaBank", 37, "KBL", "karnataka_bank", "Karnataka Bank Limited", null, 8, 0 == true ? 1 : 0);
    public static final s1 KalyanJanataBank = new s1("KalyanJanataBank", 38, "KJB", "kalyan_janata", "Kalyan Janata Sahakari Bank", null, 8, null);
    public static final s1 KarurVysyaBank = new s1("KarurVysyaBank", 40, "KVB", "karur_vysya", "Karur Vysya Bank", null, 8, null);
    public static final s1 KarnatakaVikasGrameenaBank = new s1("KarnatakaVikasGrameenaBank", 41, "KVG", "kvg", "Karnataka Vikas Grameena Bank", null, 8, null);
    public static final s1 LaxmiVilasBank = new s1("LaxmiVilasBank", 42, "LVR", "kvg", "Laxmi Vilas Bank", null, 8, null);
    public static final s1 MehsanaBank = new s1("MehsanaBank", 43, "MSB", "mehsana", "Mehsana urban Co-operative Bank", null, 8, null);
    public static final s1 NEBank = new s1("NEBank", 44, "NEB", "ne_small_finance", "North East Small Finance Bank", null, 8, null);
    public static final s1 NKGSBBank = new s1("NKGSBBank", 45, "NKB", "nkgsb", "NKGSB Co-op Bank", null, 8, null);
    public static final s1 OBCBank = new s1("OBCBank", 46, "OBC", "obc", "PNB (Erstwhile-Oriental Bank of Commerce)", null, 8, null);
    public static final s1 PunjabNationalBank = new s1("PunjabNationalBank", 47, "PNB", "pnb", "Punjab National Bank - Retail Banking", null, 8, 0 == true ? 1 : 0);
    public static final s1 PunjabAndSindBank = new s1("PunjabAndSindBank", 48, "PSB", "punjab_and_sind", "Punjab & Sind Bank", null, 8, null);
    public static final s1 SBI = new s1("SBI", 50, "SBI", "sbi", "State Bank of India", null, 8, null);
    public static final s1 StandardCharteredBank = new s1("StandardCharteredBank", 51, "SCB", "scb", "Standard Chartered Bank", null, 8, null);
    public static final s1 ShivalikMercantileBank = new s1("ShivalikMercantileBank", 52, "SHB", "shivalik", "Shivalik Mercantile Cooperative Bank Ltd", null, 8, null);
    public static final s1 SouthIndianBank = new s1("SouthIndianBank", 53, "SIB", "south_indian_bank", "South Indian Bank", null, 8, null);
    public static final s1 SuryodayBank = new s1("SuryodayBank", 54, "SRB", "suryoday", "Suryoday Small Finance Bank", null, 8, null);
    public static final s1 SaraswatBank = new s1("SaraswatBank", 55, "SWB", "saraswat", "Saraswat Bank", null, 8, null);
    public static final s1 SyndicateBank = new s1("SyndicateBank", 56, "SYD", "syndicate", "Syndicate Bank", null, 8, null);
    public static final s1 ThaneBharatBank = new s1("ThaneBharatBank", 57, "TBB", "thane_bharat", "Thane Bharat Sahakari Bank Ltd", null, 8, 0 == true ? 1 : 0);
    public static final s1 TJSBBank = new s1("TJSBBank", 58, "TJB", "tjsb", "TJSB Bank", null, 8, null);
    public static final s1 TamilNaduStateBank = new s1("TamilNaduStateBank", 60, "TNC", "tnc", "Tamil Nadu State Co-operative Bank", null, 8, null);
    public static final s1 UBI = new s1("UBI", 61, "UBI", "ubi", "Union Bank of India", null, 8, null);
    public static final s1 UNIBank = new s1("UNIBank", 62, "UNI", "united_bank_of_india", "PNB (Erstwhile-United Bank of India)", null, 8, null);
    public static final s1 AxisBank = new s1("AxisBank", 63, "UTI", "axis", "Axis Bank", null, 8, null);
    public static final s1 VijayaBank = new s1("VijayaBank", 64, "VJB", "vijaya", "Vijaya Bank", null, 8, null);
    public static final s1 VarachhaBank = new s1("VarachhaBank", 65, "VRB", "varachha", "Varachha Co-operative Bank Limited", null, 8, null);
    public static final s1 YesBank = new s1("YesBank", 66, "YBK", "yes", "Yes Bank", null, 8, null);
    public static final s1 ZoroastrianBank = new s1("ZoroastrianBank", 67, "ZOB", "zoroastrian", "Zoroastrian Co-operative Bank Limited", null, 8, 0 == true ? 1 : 0);
    public static final s1 KarnatakaGraminBank = new s1("KarnatakaGraminBank", 68, "PKB", "karnataka_gramin", "Karnataka Gramin Bank", null, 8, null);
    public static final s1 NutanNagrikBank = new s1("NutanNagrikBank", 70, "NUT", "nutan_nagrik", "Nutan Nagrik Bank", null, 8, null);
    public static final s1 BOBBank = new s1("BOBBank", 71, "BBC", "bob_corp", "Bank of Baroda - Corporate Banking", null, 8, null);
    public static final s1 PunjabNationalCorpBank = new s1("PunjabNationalCorpBank", 72, "CPN", "pnb_corp", "Punjab National Bank - Corporate Banking", null, 8, null);
    public static final s1 ShamraoVithalCorpBank = new s1("ShamraoVithalCorpBank", 73, "SV2", "shamrao_vithal_corp", "Shamrao Vithal Co-op Bank - Corporate", null, 8, null);
    public static final s1 BNPParibas = new s1("BNPParibas", 74, "BNP", "bnp_paribas", "BNP Paribas", null, 8, null);
    public static final s1 RBLCorpBank = new s1("RBLCorpBank", 75, "RTC", "rbl_corp", "RBL Bank Limited - Corporate Banking", null, 8, null);
    public static final s1 ICICICorpBank = new s1("ICICICorpBank", 76, "ICO", "icici_corp", "ICICI Corporate Netbanking", null, 8, null);
    public static final s1 IDBICorpBank = new s1("IDBICorpBank", 77, "IDC", "idbi_corp", "IDBI Corporate", null, 8, 0 == true ? 1 : 0);
    public static final s1 AxisCorpBank = new s1("AxisCorpBank", 78, "AXC", "axis_corp", "Axis Bank Corporate", null, 8, null);
    public static final s1 DhanlaxmiCorpBank = new s1("DhanlaxmiCorpBank", 80, "DL2", "dhanlaxmi_corp", "Dhanlaxmi Bank Corporate", null, 8, null);
    public static final s1 AllahabadCorpBank = new s1("AllahabadCorpBank", 81, "ALC", "allahabad_corp", "Allahabad Bank Corporate", null, 8, null);
    public static final s1 HFDCCorpBank = new s1("HFDCCorpBank", 82, "CH3", "hdfc_corp", "HDFC Bank Corporate", null, 8, null);
    public static final s1 YesCorpBank = new s1("YesCorpBank", 83, "YBC", "yes_corp", "Yes Bank Corporate", null, 8, null);
    public static final s1 CorporationBankCorporate = new s1("CorporationBankCorporate", 84, "CR2", "corporation_bank_corp", "Corporation Bank - Corporate", null, 8, null);
    public static final s1 BarclaysCorpBank = new s1("BarclaysCorpBank", 85, "BRL", "barclays_corp", "Barclays Bank - Corporate Net Banking", null, 8, null);

    /* JADX INFO: renamed from: com.stripe.android.view.s1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/s1$a;", "", "<init>", "()V", "", "bankCode", "Lcom/stripe/android/view/s1;", "a", "(Ljava/lang/String;)Lcom/stripe/android/view/s1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s1 a(String bankCode) {
            s1 next;
            Iterator<s1> it = s1.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (p013kotlin.jvm.internal.s.f(next.getCode(), bankCode)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ s1[] $values() {
        return new s1[]{KotakBank, AndraBank, AllahabadBank, AndhraPragathiBank, AirtelBank, AUSmallFinanceBank, BankOfBahrainAndKuwait, BankOfBaroda, BasseinCatholicBank, BandhanBank, BankOfIndia, BankofMaharashtra, CentralBankOfIndia, CanaraBank, CosmosBank, CorporationBank, CatholicSyrianBank, CityUnionBank, DeutscheBank, Digibank, DevelopmentCreditBank, DenaBank, DhanlakshmiBank, EquitasSmallFinanceBank, ESAFBank, FederalBank, FincareBank, HDFCBank, ICICIBank, IDBIBank, IDFCBank, IndusIndBank, IndianBank, IndianOverseasBank, JammuKashmirBank, JanaBank, JanataSahakariBank, KarnatakaBank, KalyanJanataBank, KalpurBank, KarurVysyaBank, KarnatakaVikasGrameenaBank, LaxmiVilasBank, MehsanaBank, NEBank, NKGSBBank, OBCBank, PunjabNationalBank, PunjabAndSindBank, RBLBank, SBI, StandardCharteredBank, ShivalikMercantileBank, SouthIndianBank, SuryodayBank, SaraswatBank, SyndicateBank, ThaneBharatBank, TJSBBank, TamilnadMercantileBank, TamilNaduStateBank, UBI, UNIBank, AxisBank, VijayaBank, VarachhaBank, YesBank, ZoroastrianBank, KarnatakaGraminBank, ShamraoVithalBank, NutanNagrikBank, BOBBank, PunjabNationalCorpBank, ShamraoVithalCorpBank, BNPParibas, RBLCorpBank, ICICICorpBank, IDBICorpBank, AxisCorpBank, AndhraCorpBank, DhanlaxmiCorpBank, AllahabadCorpBank, HFDCCorpBank, YesCorpBank, CorporationBankCorporate, BarclaysCorpBank};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        BandhanBank = new s1("BandhanBank", 9, "BDN", "bandhan", "Bandhan Bank", null, 8, defaultConstructorMarker);
        Digibank = new s1("Digibank", 19, "DBS", "digibank_dbs", "Digibank by DBS", null, 8, defaultConstructorMarker);
        IDBIBank = new s1("IDBIBank", 29, "IDB", "idbi", "IDBI Bank", null, 8, defaultConstructorMarker);
        KalpurBank = new s1("KalpurBank", 39, "KLB", "The Kalupur Commercial Co-operative Bank", "kalupur", null, 8, defaultConstructorMarker);
        RBLBank = new s1("RBLBank", 49, "RBL", "rbl", "RBL Bank Limited", null, 8, defaultConstructorMarker);
        TamilnadMercantileBank = new s1("TamilnadMercantileBank", 59, "TMB", "tamilnad_mercantile", "Tamilnad Mercantile Bank Limited", null, 8, defaultConstructorMarker);
        ShamraoVithalBank = new s1("ShamraoVithalBank", 69, "SVC", "shamrao_vithal", "Shamrao Vithal Co-op Bank", null, 8, defaultConstructorMarker);
        AndhraCorpBank = new s1("AndhraCorpBank", 79, "ADC", "andhra_corp", "Andhra Bank Corporate", null, 8, defaultConstructorMarker);
        s1[] s1VarArr$values = $values();
        $VALUES = s1VarArr$values;
        $ENTRIES = on0.a.a(s1VarArr$values);
        INSTANCE = new Companion(null);
    }

    private s1(String str, int i11, String str2, String str3, String str4, Integer num) {
        super(str, i11);
        this.id = str2;
        this.code = str3;
        this.displayName = str4;
        this.brandIconResId = num;
    }

    public static final s1 get(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<s1> getEntries() {
        return $ENTRIES;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) $VALUES.clone();
    }

    @Override // com.stripe.android.view.p
    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    public String getCode() {
        return this.code;
    }

    @Override // com.stripe.android.view.p
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.view.p
    public String getId() {
        return this.id;
    }

    /* synthetic */ s1(String str, int i11, String str2, String str3, String str4, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2, str3, str4, (i12 & 8) != 0 ? null : num);
    }
}
