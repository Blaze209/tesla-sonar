package be;

import com.adyen.checkout.core.exception.CheckoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0003\b\u0096\u0001\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001¨\u0006\u0098\u0001"}, d2 = {"Lbe/e;", "", "", "fractionDigits", "<init>", "(Ljava/lang/String;II)V", "I", "getFractionDigits", "()I", "Companion", "a", "AED", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BMD", "BND", "BOB", "BRL", "BSD", "BWP", "BYN", "BZD", "CAD", "CHF", "CLP", "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LYD", "MAD", "MDL", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SEK", "SGD", "SHP", "SLL", "SLE", "SOS", "SRD", "STN", "SVC", "SZL", "THB", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XOF", "XPF", "YER", "ZAR", "ZMW", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum e {
    AED(2),
    ALL(2),
    AMD(2),
    ANG(2),
    AOA(2),
    ARS(2),
    AUD(2),
    AWG(2),
    AZN(2),
    BAM(2),
    BBD(2),
    BDT(2),
    BGN(2),
    BHD(3),
    BMD(2),
    BND(2),
    BOB(2),
    BRL(2),
    BSD(2),
    BWP(2),
    BYN(2),
    BZD(2),
    CAD(2),
    CHF(2),
    CLP(2),
    CNY(2),
    COP(2),
    CRC(2),
    CUP(2),
    CVE(0),
    CZK(2),
    DJF(0),
    DKK(2),
    DOP(2),
    DZD(2),
    EGP(2),
    ETB(2),
    EUR(2),
    FJD(2),
    FKP(2),
    GBP(2),
    GEL(2),
    GHS(2),
    GIP(2),
    GMD(2),
    GNF(0),
    GTQ(2),
    GYD(2),
    HKD(2),
    HNL(2),
    HRK(2),
    HTG(2),
    HUF(2),
    IDR(0),
    ILS(2),
    INR(2),
    IQD(3),
    ISK(2),
    JMD(2),
    JOD(3),
    JPY(0),
    KES(2),
    KGS(2),
    KHR(2),
    KMF(0),
    KRW(0),
    KWD(3),
    KYD(2),
    KZT(2),
    LAK(2),
    LBP(2),
    LKR(2),
    LYD(3),
    MAD(2),
    MDL(2),
    MKD(2),
    MMK(2),
    MNT(2),
    MOP(2),
    MRU(2),
    MUR(2),
    MVR(2),
    MWK(2),
    MXN(2),
    MYR(2),
    MZN(2),
    NAD(2),
    NGN(2),
    NIO(2),
    NOK(2),
    NPR(2),
    NZD(2),
    OMR(3),
    PAB(2),
    PEN(2),
    PGK(2),
    PHP(2),
    PKR(2),
    PLN(2),
    PYG(0),
    QAR(2),
    RON(2),
    RSD(2),
    RUB(2),
    RWF(0),
    SAR(2),
    SBD(2),
    SCR(2),
    SEK(2),
    SGD(2),
    SHP(2),
    SLL(2),
    SLE(2),
    SOS(2),
    SRD(2),
    STN(2),
    SVC(2),
    SZL(2),
    THB(2),
    TND(3),
    TOP(2),
    TRY(2),
    TTD(2),
    TWD(2),
    TZS(2),
    UAH(2),
    UGX(0),
    USD(2),
    UYU(2),
    UZS(2),
    VEF(2),
    VND(0),
    VUV(0),
    WST(2),
    XAF(0),
    XCD(2),
    XOF(0),
    XPF(0),
    YER(2),
    ZAR(2),
    ZMW(2);

    private static final Map<String, e> CURRENCIES_HASHMAP;
    private final int fractionDigits;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: be.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbe/e$a;", "", "<init>", "()V", "", "currency", "", "b", "(Ljava/lang/String;)Z", "Lbe/e;", "a", "(Ljava/lang/String;)Lbe/e;", "", "CURRENCIES_HASHMAP", "Ljava/util/Map;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String currency) {
            s.k(currency, "currency");
            le.d.f89947a.a(currency);
            e eVar = (e) e.CURRENCIES_HASHMAP.get(currency);
            if (eVar != null) {
                return eVar;
            }
            throw new CheckoutException("Currency not found.", null, 2, null);
        }

        public final boolean b(String currency) {
            return currency != null && currency.length() > 0 && e.CURRENCIES_HASHMAP.containsKey(currency);
        }

        private Companion() {
        }
    }

    static {
        HashMap map = new HashMap();
        for (e eVar : values()) {
            map.put(eVar.name(), eVar);
        }
        Map<String, e> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        s.j(mapUnmodifiableMap, "let(...)");
        CURRENCIES_HASHMAP = mapUnmodifiableMap;
    }

    e(int i11) {
        this.fractionDigits = i11;
    }

    public static final e find(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    public static final boolean isSupported(String str) {
        return INSTANCE.b(str);
    }

    public final int getFractionDigits() {
        return this.fractionDigits;
    }
}
