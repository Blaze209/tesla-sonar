package n2;

import k3.p1;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0015\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Ln2/m;", "", "Lk3/p1;", "b", "(Lr2/l;I)J", "Ln2/d;", "a", "(Lr2/l;I)Ln2/d;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f92716a;

    /* JADX INFO: renamed from: n2.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Ln2/m$a;", "", "<init>", "()V", "Lk3/p1;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Ln2/d;", "a", "(JZ)Ln2/d;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f92716a = new Companion();

        private Companion() {
        }

        @jn0.e
        public final RippleAlpha a(long contentColor, boolean lightTheme) {
            if (lightTheme) {
                return ((double) r1.j(contentColor)) > 0.5d ? n.f92718b : n.f92719c;
            }
            return n.f92720d;
        }

        @jn0.e
        public final long b(long contentColor, boolean lightTheme) {
            return (lightTheme || ((double) r1.j(contentColor)) >= 0.5d) ? contentColor : p1.INSTANCE.k();
        }
    }

    @jn0.e
    RippleAlpha a(p020r2.l lVar, int i11);

    @jn0.e
    long b(p020r2.l lVar, int i11);
}
