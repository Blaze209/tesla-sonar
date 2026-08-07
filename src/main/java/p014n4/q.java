package p014n4;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ln4/q;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "a", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "b", "Ln4/o;", "Ln4/k0;", "Ln4/t0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t0 f93005c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j0 f93006d = new j0("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f93007e = new j0("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j0 f93008f = new j0("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j0 f93009g = new j0("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* JADX INFO: renamed from: n4.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln4/q$a;", "", "<init>", "()V", "Ln4/t0;", "Default", "Ln4/t0;", "a", "()Ln4/t0;", "Ln4/j0;", "SansSerif", "Ln4/j0;", "b", "()Ln4/j0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t0 a() {
            return q.f93005c;
        }

        public final j0 b() {
            return q.f93006d;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Ln4/q$b;", "", "Ln4/q;", "fontFamily", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Lr2/y3;", "a", "(Ln4/q;Ln4/f0;II)Lr2/y3;", "Ln4/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        static /* synthetic */ y3 b(b bVar, q qVar, FontWeight f0Var, int i11, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i13 & 1) != 0) {
                qVar = null;
            }
            if ((i13 & 2) != 0) {
                f0Var = FontWeight.INSTANCE.d();
            }
            if ((i13 & 4) != 0) {
                i11 = b0.INSTANCE.b();
            }
            if ((i13 & 8) != 0) {
                i12 = c0.INSTANCE.a();
            }
            return bVar.a(qVar, f0Var, i11, i12);
        }

        y3<Object> a(q fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ q(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    private q(boolean z11) {
        this.canLoadSynchronously = z11;
    }
}
