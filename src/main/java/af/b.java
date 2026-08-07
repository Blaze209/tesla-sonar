package af;

import com.adyen.checkout.components.core.action.Action;
import io0.d;
import io0.e;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ve.f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT' uses external variables
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Laf/b;", "", "", Action.PAYMENT_METHOD_TYPE, "", "maxPollingDurationMillis", "Lze/c;", "viewType", "", "messageTextResource", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLze/c;Ljava/lang/Integer;)V", "Ljava/lang/String;", "J", "getMaxPollingDurationMillis", "()J", "Lze/c;", "getViewType", "()Lze/c;", "Ljava/lang/Integer;", "getMessageTextResource", "()Ljava/lang/Integer;", "Companion", "a", "DEFAULT", "DUIT_NOW", "PAY_NOW", "PROMPT_PAY", "UPI_QR", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final b DEFAULT;
    public static final b DUIT_NOW;
    public static final b PAY_NOW;
    public static final b PROMPT_PAY;
    public static final b UPI_QR;
    private final long maxPollingDurationMillis;
    private final Integer messageTextResource;
    private final String paymentMethodType;
    private final ze.c viewType;

    /* JADX INFO: renamed from: af.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/b$a;", "", "<init>", "()V", "", Action.PAYMENT_METHOD_TYPE, "Laf/b;", "a", "(Ljava/lang/String;)Laf/b;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String paymentMethodType) {
            b next;
            s.k(paymentMethodType, "paymentMethodType");
            Iterator<b> it = b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(next.paymentMethodType, paymentMethodType));
            b bVar = next;
            return bVar == null ? b.DEFAULT : bVar;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ b[] $values() {
        return new b[]{DEFAULT, DUIT_NOW, PAY_NOW, PROMPT_PAY, UPI_QR};
    }

    static {
        io0.b.Companion companion = io0.b.INSTANCE;
        e eVar = e.MINUTES;
        DEFAULT = new b("DEFAULT", 0, "", io0.b.p(d.s(15, eVar)), ze.c.SIMPLE_QR_CODE, null);
        e eVar2 = e.SECONDS;
        long jP = io0.b.p(d.s(90, eVar2));
        ze.c cVar = ze.c.FULL_QR_CODE;
        DUIT_NOW = new b("DUIT_NOW", 1, "duitnow", jP, cVar, Integer.valueOf(f.f119070d));
        PAY_NOW = new b("PAY_NOW", 2, "paynow", io0.b.p(d.s(3, eVar)), cVar, Integer.valueOf(f.f119071e));
        PROMPT_PAY = new b("PROMPT_PAY", 3, "promptpay", io0.b.p(d.s(90, eVar2)), cVar, Integer.valueOf(f.f119075i));
        UPI_QR = new b("UPI_QR", 4, "upi_qr", io0.b.p(d.s(5, eVar)), cVar, Integer.valueOf(f.f119078l));
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = on0.a.a(bVarArr$values);
        INSTANCE = new Companion(null);
    }

    private b(String str, int i11, String str2, long j11, ze.c cVar, Integer num) {
        super(str, i11);
        this.paymentMethodType = str2;
        this.maxPollingDurationMillis = j11;
        this.viewType = cVar;
        this.messageTextResource = num;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final long getMaxPollingDurationMillis() {
        return this.maxPollingDurationMillis;
    }

    public final Integer getMessageTextResource() {
        return this.messageTextResource;
    }

    public final ze.c getViewType() {
        return this.viewType;
    }
}
