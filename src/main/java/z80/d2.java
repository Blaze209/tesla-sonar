package z80;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import p009i2.v2;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.w2;
import p020r2.y2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "enabled", "Lkotlin/Function1;", "Landroid/content/Intent;", "Ljn0/h0;", "onResult", "a", "(ZLwn0/l;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d2 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.h<Intent, h.a> f127433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f127434d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.h<Intent, h.a> hVar, Context context) {
            super(0);
            this.f127433c = hVar;
            this.f127434d = context;
        }

        public final void b() {
            this.f127433c.b(new Intent(this.f127434d, (Class<?>) CardScanActivity.class));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f127435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Intent, jn0.h0> f127436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f127437e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, wn0.l<? super Intent, jn0.h0> lVar, int i11) {
            super(2);
            this.f127435c = z11;
            this.f127436d = lVar;
            this.f127437e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            d2.a(this.f127435c, this.f127436d, lVar, p020r2.k2.a(this.f127437e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh/a;", "it", "Ljn0/h0;", "a", "(Lh/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<h.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Intent, jn0.h0> f127438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super Intent, jn0.h0> lVar) {
            super(1);
            this.f127438c = lVar;
        }

        public final void a(h.a it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            Intent data = it.getData();
            if (data != null) {
                this.f127438c.invoke(data);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(h.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    public static final void a(boolean z11, wn0.l<? super Intent, jn0.h0> onResult, p020r2.l lVar, int i11) {
        int i12;
        boolean z12;
        p020r2.l lVar2;
        p013kotlin.jvm.internal.s.k(onResult, "onResult");
        p020r2.l lVarV = lVar.v(1242685780);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onResult) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            z12 = z11;
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1242685780, i12, -1, "com.stripe.android.ui.core.elements.ScanCardButtonUI (ScanCardButtonUI.kt:30)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            lVarV.H(1696785139);
            boolean z13 = (i12 & 112) == 32;
            Object objI = lVarV.I();
            if (z13 || objI == p020r2.l.INSTANCE.a()) {
                objI = new c(onResult);
                lVarV.B(objI);
            }
            lVarV.T();
            f.h hVarA = f.c.a(activityResultContracts$StartActivityForResult, (wn0.l) objI, lVarV, 8);
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            lVarV.H(1696792073);
            Object objI2 = lVarV.I();
            if (objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = u1.k.a();
                lVarV.B(objI2);
            }
            lVarV.T();
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(companion, (u1.l) objI2, null, z11, null, null, new a(hVarA, context), 24, null);
            z12 = z11;
            lVarV.H(693286680);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarB);
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
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(w80.k.L, lVarV, 0);
            String strC = e4.i.c(w80.n.A0, lVarV, 0);
            k3.q1.Companion companion3 = k3.q1.INSTANCE;
            p009i2.j1 j1Var = p009i2.j1.f74525a;
            int i13 = p009i2.j1.f74526b;
            float f11 = 18;
            q1.b0.a(bVarC, strC, androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.v(companion, w4.h.g(f11)), w4.h.g(f11)), null, null, BitmapDescriptorFactory.HUE_RED, k3.q1.Companion.b(companion3, j1Var.a(lVarV, i13).j(), 0, 2, null), lVarV, 392, 56);
            lVar2 = lVarV;
            v2.b(e4.i.c(w80.n.A0, lVarV, 0), androidx.compose.foundation.layout.t.m(companion, w4.h.g(4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j1Var.a(lVarV, i13).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i13).getH6(), lVar2, 48, 0, 65528);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z12, onResult, i11));
        }
    }
}
