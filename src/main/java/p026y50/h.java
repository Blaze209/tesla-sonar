package p026y50;

import f90.g;
import i40.i;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 y50.h, still in use, count: 1, list:
  (r0v0 y50.h) from 0x0028: SPUT (r0v0 y50.h) (LINE:41) y50.h.default y50.h
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Ly50/h;", "", "<init>", "(Ljava/lang/String;I)V", "Ly50/b;", "getColors", "()Ly50/b;", "colors", "", "getIcon", "()I", "icon", "Companion", "a", "DefaultLight", "LinkLight", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {
    DefaultLight,
    LinkLight;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final h f4default = new h();

    /* JADX INFO: renamed from: y50.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly50/h$a;", "", "<init>", "()V", "Ly50/h;", "default", "Ly50/h;", "a", "()Ly50/h;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f4default;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125128a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.DefaultLight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.LinkLight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125128a = iArr;
        }
    }

    static {
    }

    private h() {
        super(str, i);
    }

    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final FinancialConnectionsColors getColors() {
        int i11 = b.f125128a[ordinal()];
        if (i11 == 1) {
            return i.f125129a;
        }
        if (i11 == 2) {
            return i.f125130b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getIcon() {
        int i11 = b.f125128a[ordinal()];
        if (i11 == 1) {
            return i.f75844j;
        }
        if (i11 == 2) {
            return g.f64612c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
