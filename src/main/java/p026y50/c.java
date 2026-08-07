package p026y50;

import n2.RippleAlpha;
import n2.m;
import p009i2.j1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Ly50/c;", "Ln2/m;", "<init>", "()V", "Lk3/p1;", "b", "(Lr2/l;I)J", "Ln2/d;", "a", "(Lr2/l;I)Ln2/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class c implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f125063b = new c();

    private c() {
    }

    @Override // n2.m
    public RippleAlpha a(l lVar, int i11) {
        lVar.H(1931126216);
        if (o.J()) {
            o.S(1931126216, i11, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsRippleTheme.rippleAlpha (Theme.kt:202)");
        }
        RippleAlpha rippleAlphaA = m.INSTANCE.a(d.f125064a.a(lVar, 6).getTextBrand(), j1.f74525a.a(lVar, j1.f74526b).o());
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return rippleAlphaA;
    }

    @Override // n2.m
    public long b(l lVar, int i11) {
        lVar.H(1307413827);
        if (o.J()) {
            o.S(1307413827, i11, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsRippleTheme.defaultColor (Theme.kt:196)");
        }
        long jB = m.INSTANCE.b(d.f125064a.a(lVar, 6).getTextBrand(), j1.f74525a.a(lVar, j1.f74526b).o());
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return jB;
    }
}
