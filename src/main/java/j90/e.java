package j90;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f90.n;
import p009i2.j1;
import p009i2.o1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Lw4/h;", "cornerRadius", "Lk3/p1;", "sheetBackgroundColor", "scrimColor", "Lj90/d;", "a", "(FJJLr2/l;II)Lj90/d;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    public static final StripeBottomSheetLayoutInfo a(float f11, long j11, long j12, l lVar, int i11, int i12) {
        lVar.H(769413883);
        if ((i12 & 1) != 0) {
            f11 = w4.h.g(n.o(j1.f74525a, lVar, j1.f74526b).getCornerRadius());
        }
        float f12 = f11;
        if ((i12 & 2) != 0) {
            j11 = j1.f74525a.a(lVar, j1.f74526b).n();
        }
        long jC = (i12 & 4) != 0 ? o1.f74773a.c(lVar, o1.f74776d) : j12;
        if (o.J()) {
            o.S(769413883, i11, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetLayoutInfo (StripeBottomSheetLayoutInfo.kt:26)");
        }
        lVar.H(-392359182);
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = new StripeBottomSheetLayoutInfo(a2.g.e(f12, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), j11, jC, null);
            lVar.B(objI);
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = (StripeBottomSheetLayoutInfo) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return stripeBottomSheetLayoutInfo;
    }
}
