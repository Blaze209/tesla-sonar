package ke0;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lke0/c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "getPriority", "()I", "priority", "Companion", "a", "UNKNOWN_FIELD", "MISSING_ACCOUNT_EMAIL", "MISSING_SUBSCRIBER_KEY", "FAILED_TO_DECRYPT_NEW_PII_KEY", "MISSING_PII_KEY", "PII_KEY_EXPIRED", "FAILED_TO_DECRYPT_PII_FIELDS", "NO_PAIRED_PHONE_KEY", "vehicledata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum c {
    UNKNOWN_FIELD("unknown_field"),
    MISSING_ACCOUNT_EMAIL("missing_account_email"),
    MISSING_SUBSCRIBER_KEY("missing_subscriber_key"),
    FAILED_TO_DECRYPT_NEW_PII_KEY("failed_to_decrypt_new_pii_key"),
    MISSING_PII_KEY("missing_pii_key"),
    PII_KEY_EXPIRED("pii_key_expired"),
    FAILED_TO_DECRYPT_PII_FIELDS("failed_to_decrypt_pii_fields"),
    NO_PAIRED_PHONE_KEY("no_paired_phone_key");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ke0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lke0/c$a;", "", "<init>", "()V", "", "value", "Lke0/c;", "a", "(Ljava/lang/String;)Lke0/c;", "vehicledata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(String value) {
            c next;
            s.k(value, "value");
            Iterator<c> it = c.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(next.getValue(), value));
            c cVar = next;
            return cVar == null ? c.FAILED_TO_DECRYPT_PII_FIELDS : cVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85982a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.UNKNOWN_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.NO_PAIRED_PHONE_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.MISSING_ACCOUNT_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.MISSING_SUBSCRIBER_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.FAILED_TO_DECRYPT_NEW_PII_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.MISSING_PII_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.PII_KEY_EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.FAILED_TO_DECRYPT_PII_FIELDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f85982a = iArr;
        }
    }

    c(String str) {
        this.value = str;
    }

    public static final c from(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<c> getEntries() {
        return $ENTRIES;
    }

    public final int getPriority() {
        switch (b.f85982a[ordinal()]) {
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                return 6;
            case 4:
                return 5;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 2;
            case 8:
                return 1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getValue() {
        return this.value;
    }
}
