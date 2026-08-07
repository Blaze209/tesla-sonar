package nf0;

import ch.qos.logback.classic.Level;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import v5.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnf0/d;", "", "a", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f94922b = new m(0, 0, Level.INFO_INT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m f94923c = new m(1, 0, Level.INFO_INT);

    /* JADX INFO: renamed from: nf0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lnf0/d$a;", "", "<init>", "()V", "Lnf0/c;", "id", "Lv5/m;", "b", "(Lnf0/c;)Lv5/m;", "Lnf0/a;", "", "a", "(Lnf0/a;)Z", "disableConfig", "Lv5/m;", "enableConfig", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: nf0.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C2017a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f94924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f94925b;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.DISABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.ENABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f94924a = iArr;
                int[] iArr2 = new int[a.values().length];
                try {
                    iArr2[a.ENABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[a.DISABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f94925b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(a id2) {
            s.k(id2, "id");
            int i11 = C2017a.f94925b[id2.ordinal()];
            if (i11 == 1) {
                return true;
            }
            if (i11 == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final m b(c id2) {
            s.k(id2, "id");
            int i11 = C2017a.f94924a[id2.ordinal()];
            if (i11 == 1) {
                return d.f94922b;
            }
            if (i11 == 2) {
                return d.f94923c;
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }
}
