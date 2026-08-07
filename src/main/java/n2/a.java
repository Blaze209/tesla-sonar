package n2;

import k3.p1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Ln2/a;", "Ln2/m;", "<init>", "()V", "Lk3/p1;", "b", "(Lr2/l;I)J", "Ln2/d;", "a", "(Lr2/l;I)Ln2/d;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f92653b = new a();

    private a() {
    }

    @Override // n2.m
    @jn0.e
    public RippleAlpha a(p020r2.l lVar, int i11) {
        lVar.o(-1629816343);
        if (p020r2.o.J()) {
            p020r2.o.S(-1629816343, i11, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:243)");
        }
        RippleAlpha rippleAlphaA = m.INSTANCE.a(p1.INSTANCE.a(), true);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return rippleAlphaA;
    }

    @Override // n2.m
    @jn0.e
    public long b(p020r2.l lVar, int i11) {
        lVar.o(2042140174);
        if (p020r2.o.J()) {
            p020r2.o.S(2042140174, i11, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:239)");
        }
        long jB = m.INSTANCE.b(p1.INSTANCE.a(), true);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return jB;
    }
}
