package j80;

import androidx.compose.ui.platform.s2;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Lj80/e;", "paymentMethods", "", "selectedIndex", "", "isEnabled", "Lo90/f;", "imageLoader", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Ljava/util/List;IZLo90/f;Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<DisplayablePaymentMethod> f83001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f83002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f83003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o90.f f83004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f83005g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f83006h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f83007i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<DisplayablePaymentMethod> list, int i11, boolean z11, o90.f fVar, androidx.compose.ui.d dVar, int i12, int i13) {
            super(2);
            this.f83001c = list;
            this.f83002d = i11;
            this.f83003e = z11;
            this.f83004f = fVar;
            this.f83005g = dVar;
            this.f83006h = i12;
            this.f83007i = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.a(this.f83001c, this.f83002d, this.f83003e, this.f83004f, this.f83005g, lVar, k2.a(this.f83006h | 1), this.f83007i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(List<DisplayablePaymentMethod> paymentMethods, int i11, boolean z11, o90.f fVar, androidx.compose.ui.d dVar, p020r2.l lVar, int i12, int i13) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        o90.f imageLoader = fVar;
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p020r2.l lVarV = lVar.v(-317174614);
        androidx.compose.ui.d dVar2 = (i13 & 16) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-317174614, i12, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodVerticalLayoutUI (NewPaymentMethodVerticalLayoutUI.kt:19)");
        }
        androidx.compose.ui.d dVarA = s2.a(dVar2, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI");
        v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(12));
        lVarV.H(-483455358);
        i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVarV, 6);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarA);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarA, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        lVarV.H(-1479332989);
        int i14 = 0;
        for (Object obj : paymentMethods) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                v.x();
            }
            k.b(z11, i14 == i11, (DisplayablePaymentMethod) obj, imageLoader, null, lVarV, ((i12 >> 6) & 14) | 512 | (o90.f.f96995g << 9) | (i12 & 7168), 16);
            imageLoader = fVar;
            i14 = i15;
        }
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(paymentMethods, i11, z11, fVar, dVar2, i12, i13));
        }
    }
}
