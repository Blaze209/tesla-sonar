package ro;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lro/g;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "CREATE", "UPDATE", "DELETE", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum g {
    CREATE,
    UPDATE,
    DELETE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ro.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lro/g$a;", "", "<init>", "()V", "Lro/g;", "type", "", "a", "(Lro/g;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ro.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C2314a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f108648a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f108648a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(g type) {
            s.k(type, "type");
            int i11 = C2314a.f108648a[type.ordinal()];
            if (i11 == 1) {
                return "create";
            }
            if (i11 == 2) {
                return "update";
            }
            if (i11 == 3) {
                return "delete";
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public static final String toString(g gVar) {
        return INSTANCE.a(gVar);
    }
}
