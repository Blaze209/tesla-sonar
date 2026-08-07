package ja0;

import ii.n;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lja0/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "ACCESS_TYPE_INVALID", "ACCESS_TYPE_PUBLIC", "ACCESS_TYPE_PRIVATE", "ACCESS_TYPE_ENGINEERING", "ACCESS_TYPE_MANUFACTURING", "ACCESS_TYPE_SERVICE", "UNKNOWN__", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a {
    ACCESS_TYPE_INVALID("ACCESS_TYPE_INVALID"),
    ACCESS_TYPE_PUBLIC("ACCESS_TYPE_PUBLIC"),
    ACCESS_TYPE_PRIVATE("ACCESS_TYPE_PRIVATE"),
    ACCESS_TYPE_ENGINEERING("ACCESS_TYPE_ENGINEERING"),
    ACCESS_TYPE_MANUFACTURING("ACCESS_TYPE_MANUFACTURING"),
    ACCESS_TYPE_SERVICE("ACCESS_TYPE_SERVICE"),
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final n type = new n("ChargerAccessTypeEnum", v.p("ACCESS_TYPE_INVALID", "ACCESS_TYPE_PUBLIC", "ACCESS_TYPE_PRIVATE", "ACCESS_TYPE_ENGINEERING", "ACCESS_TYPE_MANUFACTURING", "ACCESS_TYPE_SERVICE"));

    /* JADX INFO: renamed from: ja0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lja0/a$a;", "", "<init>", "()V", "", "rawValue", "Lja0/a;", "a", "(Ljava/lang/String;)Lja0/a;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        public final a a(String rawValue) {
            s.k(rawValue, "rawValue");
            for (a aVar : a.values()) {
                if (s.f(aVar.getRawValue(), rawValue)) {
                    if (aVar == null) {
                        return a.UNKNOWN__;
                    }
                    return aVar;
                }
            }
            aVar = null;
            if (aVar == null) {
                return a.UNKNOWN__;
            }
            return aVar;
        }

        private Companion() {
        }
    }

    a(String str) {
        this.rawValue = str;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
