package sf;

import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.ConvenienceStoresJPPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.OnlineBankingJPPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.PayEasyPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.SevenElevenPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BOLETO' uses external variables
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lsf/c;", "", "Lrf/b;", "viewType", "", "introductionTextResource", "<init>", "(Ljava/lang/String;ILrf/b;Ljava/lang/Integer;)V", "Lrf/b;", "getViewType", "()Lrf/b;", "Ljava/lang/Integer;", "getIntroductionTextResource", "()Ljava/lang/Integer;", "Companion", "a", "BACS", "BOLETO", "ECONTEXT", "MULTIBANCO", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BACS = new c("BACS", 0, rf.b.SIMPLE_VOUCHER, Integer.valueOf(of.c.f97265h));
    public static final c BOLETO;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final c ECONTEXT;
    public static final c MULTIBANCO;
    private final Integer introductionTextResource;
    private final rf.b viewType;

    /* JADX INFO: renamed from: sf.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf/c$a;", "", "<init>", "()V", "", Action.PAYMENT_METHOD_TYPE, "Lsf/c;", "a", "(Ljava/lang/String;)Lsf/c;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final c a(String paymentMethodType) {
            if (paymentMethodType == null) {
                return null;
            }
            switch (paymentMethodType.hashCode()) {
                case -2077503496:
                    if (!paymentMethodType.equals("boletobancario_bancodobrasil")) {
                        return null;
                    }
                    return c.BOLETO;
                case -1561075715:
                    if (!paymentMethodType.equals("boletobancario_santander")) {
                        return null;
                    }
                    return c.BOLETO;
                case -152837216:
                    if (!paymentMethodType.equals("boletobancario_bradesco")) {
                        return null;
                    }
                    return c.BOLETO;
                case -141944024:
                    if (!paymentMethodType.equals(SevenElevenPaymentMethod.PAYMENT_METHOD_TYPE)) {
                        return null;
                    }
                    return c.ECONTEXT;
                case 19088375:
                    if (paymentMethodType.equals(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE)) {
                        return c.BACS;
                    }
                    return null;
                case 49917573:
                    if (!paymentMethodType.equals(PayEasyPaymentMethod.PAYMENT_METHOD_TYPE)) {
                        return null;
                    }
                    return c.ECONTEXT;
                case 364045247:
                    if (!paymentMethodType.equals("primeiropay_boleto")) {
                        return null;
                    }
                    return c.BOLETO;
                case 870510367:
                    if (!paymentMethodType.equals("boletobancario_hsbc")) {
                        return null;
                    }
                    return c.BOLETO;
                case 870541106:
                    if (!paymentMethodType.equals("boletobancario_itau")) {
                        return null;
                    }
                    return c.BOLETO;
                case 1251821346:
                    if (paymentMethodType.equals("multibanco")) {
                        return c.MULTIBANCO;
                    }
                    return null;
                case 1431074440:
                    if (!paymentMethodType.equals(OnlineBankingJPPaymentMethod.PAYMENT_METHOD_TYPE)) {
                        return null;
                    }
                    return c.ECONTEXT;
                case 1551229927:
                    if (!paymentMethodType.equals(ConvenienceStoresJPPaymentMethod.PAYMENT_METHOD_TYPE)) {
                        return null;
                    }
                    return c.ECONTEXT;
                case 1788627916:
                    if (!paymentMethodType.equals("boletobancario")) {
                        return null;
                    }
                    return c.BOLETO;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{BACS, BOLETO, ECONTEXT, MULTIBANCO};
    }

    static {
        rf.b bVar = rf.b.FULL_VOUCHER;
        BOLETO = new c("BOLETO", 1, bVar, Integer.valueOf(of.c.f97264g));
        ECONTEXT = new c("ECONTEXT", 2, bVar, Integer.valueOf(of.c.f97266i));
        MULTIBANCO = new c("MULTIBANCO", 3, bVar, Integer.valueOf(of.c.f97264g));
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = on0.a.a(cVarArr$values);
        INSTANCE = new Companion(null);
    }

    private c(String str, int i11, rf.b bVar, Integer num) {
        super(str, i11);
        this.viewType = bVar;
        this.introductionTextResource = num;
    }

    public static EnumEntries<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final Integer getIntroductionTextResource() {
        return this.introductionTextResource;
    }

    public final rf.b getViewType() {
        return this.viewType;
    }
}
