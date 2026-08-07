package p008h80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import n2.RippleAlpha;
import n2.m;
import p009i2.j1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lh80/q;", "Ln2/m;", "<init>", "()V", "Lk3/p1;", "b", "(Lr2/l;I)J", "Ln2/d;", "a", "(Lr2/l;I)Ln2/d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class q implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f71303b = new q();

    private q() {
    }

    @Override // n2.m
    public RippleAlpha a(l lVar, int i11) {
        lVar.H(-1935762054);
        if (o.J()) {
            o.S(-1935762054, i11, -1, "com.stripe.android.paymentsheet.ui.ErrorRippleTheme.rippleAlpha (EditPaymentMethod.kt:304)");
        }
        m.Companion companion = m.INSTANCE;
        j1 j1Var = j1.f74525a;
        int i12 = j1.f74526b;
        RippleAlpha rippleAlphaA = companion.a(p1.p(j1Var.a(lVar, i12).d(), 0.25f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j1Var.a(lVar, i12).o());
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return rippleAlphaA;
    }

    @Override // n2.m
    public long b(l lVar, int i11) {
        lVar.H(1543783583);
        if (o.J()) {
            o.S(1543783583, i11, -1, "com.stripe.android.paymentsheet.ui.ErrorRippleTheme.defaultColor (EditPaymentMethod.kt:296)");
        }
        m.Companion companion = m.INSTANCE;
        j1 j1Var = j1.f74525a;
        int i12 = j1.f74526b;
        long jB = companion.b(j1Var.a(lVar, i12).d(), j1Var.a(lVar, i12).o());
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return jB;
    }
}
