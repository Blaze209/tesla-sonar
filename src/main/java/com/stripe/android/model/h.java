package com.stripe.android.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AmericanExpress' uses external variables
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\b\u0086\u0081\u0002\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00013B\u0099\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0011\u00101\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u0010'j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<¨\u0006="}, d2 = {"Lcom/stripe/android/model/h;", "", "", "code", "displayName", "", "icon", "cvcIcon", "errorIcon", "", "cvcLength", "defaultMaxLength", "Ljava/util/regex/Pattern;", "pattern", "", "partialPatterns", "variantMaxLength", "", "shouldRender", "renderingOrder", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;ZI)V", "cardNumber", "getPatternForLength", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", "isValidCardNumberLength", "(Ljava/lang/String;)Z", "cvc", "isValidCvc", "cvcText", "isMaxCvc", "getMaxLengthForCardNumber", "(Ljava/lang/String;)I", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getDisplayName", "I", "getIcon", "()I", "getCvcIcon", "getErrorIcon", "Ljava/util/Set;", "getCvcLength", "()Ljava/util/Set;", "Ljava/util/regex/Pattern;", "Ljava/util/Map;", "Z", "getMaxCvcLength", "maxCvcLength", "Companion", "a", "Visa", "MasterCard", "AmericanExpress", "Discover", "JCB", "DinersClub", "UnionPay", "CartesBancaires", "Unknown", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AmericanExpress;
    private static final int CVC_COMMON_LENGTH = 3;
    public static final h CartesBancaires;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final h DinersClub;
    public static final h Discover;
    public static final h JCB;
    public static final h UnionPay;
    public static final h Unknown;
    private static final List<h> orderedBrands;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final int renderingOrder;
    private final boolean shouldRender;
    private final Map<Pattern, Integer> variantMaxLength;
    public static final h Visa = new h("Visa", 0, "visa", "Visa", v90.a.f118496s, 0, 0, null, 0, Pattern.compile("^(4)[0-9]*$"), p013kotlin.collections.v0.f(jn0.x.a(1, Pattern.compile("^4$"))), null, false, 1, 1656, null);
    public static final h MasterCard = new h("MasterCard", 1, "mastercard", "Mastercard", v90.a.f118491n, 0, 0, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), p013kotlin.collections.v0.m(jn0.x.a(1, Pattern.compile("^2|5|6$")), jn0.x.a(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 2, 1656, null);

    /* JADX INFO: renamed from: com.stripe.android.model.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/h$a;", "", "<init>", "()V", "", "cardNumber", "", "Lcom/stripe/android/model/h;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/util/List;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/h;", "c", "code", "b", "orderedBrands", "Ljava/util/List;", "e", "()Ljava/util/List;", "", "CVC_COMMON_LENGTH", "I", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<h> d(String cardNumber) {
            Matcher matcher;
            EnumEntries<h> entries = h.getEntries();
            ArrayList arrayList = new ArrayList();
            for (h hVar : entries) {
                Pattern patternForLength = hVar.getPatternForLength(cardNumber);
                if (patternForLength != null && (matcher = patternForLength.matcher(cardNumber)) != null && matcher.matches()) {
                    arrayList.add(hVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((h) obj).shouldRender) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        public final h a(String cardNumber) {
            if (cardNumber == null || p013kotlin.text.t.y0(cardNumber)) {
                return h.Unknown;
            }
            List<h> listD = d(cardNumber);
            if (listD.size() != 1) {
                listD = null;
            }
            if (listD == null) {
                listD = p013kotlin.collections.v.e(h.Unknown);
            }
            return (h) p013kotlin.collections.v.o0(listD);
        }

        public final h b(String code) {
            h next;
            Iterator<h> it = h.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.text.t.M(next.getCode(), code, true));
            h hVar = next;
            return hVar == null ? h.Unknown : hVar;
        }

        public final List<h> c(String cardNumber) {
            if (cardNumber == null || p013kotlin.text.t.y0(cardNumber)) {
                return e();
            }
            List<h> listD = d(cardNumber);
            if (listD.isEmpty()) {
                listD = null;
            }
            return listD == null ? p013kotlin.collections.v.e(h.Unknown) : listD;
        }

        public final List<h> e() {
            return h.orderedBrands;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ h[] $values() {
        return new h[]{Visa, MasterCard, AmericanExpress, Discover, JCB, DinersClub, UnionPay, CartesBancaires, Unknown};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11 = 0;
        AmericanExpress = new h("AmericanExpress", 2, "amex", "American Express", v90.a.f118478a, v90.a.f118483f, i11, p013kotlin.collections.d1.i(3, 4), 15, Pattern.compile("^(34|37)[0-9]*$"), p013kotlin.collections.v0.f(jn0.x.a(1, Pattern.compile("^3$"))), null, false, 3, 1552, null);
        int i12 = 0;
        Discover = new h("Discover", 3, "discover", "Discover", v90.a.f118486i, i11, i12, null, 0, Pattern.compile("^(60|64|65)[0-9]*$"), p013kotlin.collections.v0.f(jn0.x.a(1, Pattern.compile("^6$"))), null, false, 4, 1656, null);
        int i13 = 0;
        JCB = new h("JCB", 4, "jcb", "JCB", v90.a.f118489l, i12, i13, null, 0, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), p013kotlin.collections.v0.m(jn0.x.a(1, Pattern.compile("^3$")), jn0.x.a(2, Pattern.compile("^(35)$")), jn0.x.a(3, Pattern.compile("^(35[2-8])$"))), null, false, 5, 1656, null);
        int i14 = 0;
        DinersClub = new h("DinersClub", 5, "diners", "Diners Club", v90.a.f118484g, i13, i14, null, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), p013kotlin.collections.v0.f(jn0.x.a(1, Pattern.compile("^3$"))), p013kotlin.collections.v0.f(jn0.x.a(Pattern.compile("^(36)[0-9]*$"), 14)), false, 6, 1080, null);
        int i15 = 0;
        UnionPay = new h("UnionPay", 6, "unionpay", "UnionPay", v90.a.f118493p, i14, i15, null, 0, Pattern.compile("^(62|81)[0-9]*$"), p013kotlin.collections.v0.f(jn0.x.a(1, Pattern.compile("^6|8$"))), null, false, 7, 1656, null);
        CartesBancaires = new h("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", v90.a.f118480c, i15, 0, null, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), p013kotlin.collections.v0.m(jn0.x.a(1, Pattern.compile("^4$")), jn0.x.a(2, Pattern.compile("^2|5|6$")), jn0.x.a(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 8, 632, null);
        Object[] objArr = null == true ? 1 : 0;
        Unknown = new h("Unknown", 8, "unknown", "Unknown", v90.a.f118495r, 0, null == true ? 1 : 0, p013kotlin.collections.d1.i(3, 4), 0, objArr, p013kotlin.collections.v0.i(), null, false, -1, 1752, null);
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = on0.a.a(hVarArr$values);
        INSTANCE = new Companion(null);
        EnumEntries<h> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (h hVar : entries) {
            if (hVar.shouldRender) {
                arrayList.add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).renderingOrder > 0) {
                arrayList2.add(obj);
            }
        }
        orderedBrands = p013kotlin.collections.v.a1(arrayList2, new Comparator() { // from class: com.stripe.android.model.h.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Integer.valueOf(((h) t11).renderingOrder), Integer.valueOf(((h) t12).renderingOrder));
            }
        });
    }

    private h(String str, int i11, String str2, String str3, int i12, int i13, int i14, Set set, int i15, Pattern pattern, Map map, Map map2, boolean z11, int i16) {
        super(str, i11);
        this.code = str2;
        this.displayName = str3;
        this.icon = i12;
        this.cvcIcon = i13;
        this.errorIcon = i14;
        this.cvcLength = set;
        this.defaultMaxLength = i15;
        this.pattern = pattern;
        this.partialPatterns = map;
        this.variantMaxLength = map2;
        this.shouldRender = z11;
        this.renderingOrder = i16;
    }

    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern getPatternForLength(String cardNumber) {
        Pattern pattern = this.partialPatterns.get(Integer.valueOf(cardNumber.length()));
        return pattern == null ? this.pattern : pattern;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCvcIcon() {
        return this.cvcIcon;
    }

    public final Set<Integer> getCvcLength() {
        return this.cvcLength;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getMaxCvcLength() {
        Integer num = (Integer) p013kotlin.collections.v.E0(this.cvcLength);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int getMaxLengthForCardNumber(String cardNumber) {
        Object next;
        p013kotlin.jvm.internal.s.k(cardNumber, "cardNumber");
        String strG = new h30.f.Unvalidated(cardNumber).getNormalized();
        Iterator<T> it = this.variantMaxLength.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Pattern) ((Map.Entry) next).getKey()).matcher(strG).matches());
        Map.Entry entry = (Map.Entry) next;
        return entry != null ? ((Number) entry.getValue()).intValue() : this.defaultMaxLength;
    }

    public final boolean isMaxCvc(String cvcText) {
        String string;
        return getMaxCvcLength() == ((cvcText == null || (string = p013kotlin.text.t.F1(cvcText).toString()) == null) ? 0 : string.length());
    }

    public final boolean isValidCardNumberLength(String cardNumber) {
        return (cardNumber == null || Unknown == this || cardNumber.length() != getMaxLengthForCardNumber(cardNumber)) ? false : true;
    }

    public final boolean isValidCvc(String cvc) {
        p013kotlin.jvm.internal.s.k(cvc, "cvc");
        return this.cvcLength.contains(Integer.valueOf(cvc.length()));
    }

    /* synthetic */ h(String str, int i11, String str2, String str3, int i12, int i13, int i14, Set set, int i15, Pattern pattern, Map map, Map map2, boolean z11, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2, str3, i12, (i17 & 8) != 0 ? v90.a.f118482e : i13, (i17 & 16) != 0 ? v90.a.f118488k : i14, (i17 & 32) != 0 ? p013kotlin.collections.d1.c(3) : set, (i17 & 64) != 0 ? 16 : i15, (i17 & 128) != 0 ? null : pattern, map, (i17 & 512) != 0 ? p013kotlin.collections.v0.i() : map2, (i17 & 1024) != 0 ? true : z11, i16);
    }
}
