package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import e4.e;
import i4.TextStyle;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.e1;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import v1.b;
import v1.e0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "icon", "", "text", "Lk3/p1;", "textColor", "Landroidx/compose/ui/d;", "modifier", "", "isEnabled", "Ljn0/h0;", "a", "(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/d;ZLr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f71309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f71310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f71311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f71312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f71313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f71314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f71315i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str, long j11, d dVar, boolean z11, int i11, int i12) {
            super(2);
            this.f71309c = num;
            this.f71310d = str;
            this.f71311e = j11;
            this.f71312f = dVar;
            this.f71313g = z11;
            this.f71314h = i11;
            this.f71315i = i12;
        }

        public final void a(l lVar, int i11) {
            r.a(this.f71309c, this.f71310d, this.f71311e, this.f71312f, this.f71313g, lVar, k2.a(this.f71314h | 1), this.f71315i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(Integer num, String text, long j11, d modifier, boolean z11, l lVar, int i11, int i12) {
        Integer num2;
        int i13;
        long jP;
        Integer num3;
        s.k(text, "text");
        s.k(modifier, "modifier");
        l lVarV = lVar.v(-470687082);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            num2 = num;
        } else if ((i11 & 14) == 0) {
            num2 = num;
            i13 = (lVarV.n(num2) ? 4 : 2) | i11;
        } else {
            num2 = num;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(text) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
            jP = j11;
        } else {
            jP = j11;
            if ((i11 & 896) == 0) {
                i13 |= lVarV.s(jP) ? 256 : 128;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.n(modifier) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            i13 |= lVarV.p(z11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i15 = i13;
        if ((46811 & i15) == 9362 && lVarV.b()) {
            lVarV.j();
            num3 = num2;
        } else {
            Integer num4 = i14 != 0 ? null : num2;
            if (o.J()) {
                o.S(-470687082, i15, -1, "com.stripe.android.paymentsheet.ui.LpmSelectorText (LpmSelectorText.kt:23)");
            }
            c.InterfaceC1212c interfaceC1212cI = c.INSTANCE.i();
            lVarV.H(693286680);
            i0 i0VarB = e0.b(b.f117444a.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            g.Companion companion = g.INSTANCE;
            wn0.a<g> aVarA = companion.a();
            q<y2<g>, l, Integer, h0> qVarA = a0.a(modifier);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.H(-1309082853);
            if (num4 != null) {
                e1.a(e.c(num4.intValue(), lVarV, 0), null, t.k(d.INSTANCE, h.g(4), BitmapDescriptorFactory.HUE_RED, 2, null), j1.f74525a.a(lVarV, j1.f74526b).i(), lVarV, 440, 0);
            }
            lVarV.T();
            TextStyle caption = j1.f74525a.c(lVarV, j1.f74526b).getCaption();
            if (!z11) {
                jP = p1.p(j11, 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            v2.b(text, null, jP, 0L, null, null, null, 0L, null, null, 0L, t4.t.INSTANCE.b(), false, 1, 0, null, caption, lVarV, (i15 >> 3) & 14, 3120, 55290);
            lVarV = lVarV;
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            num3 = num4;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(num3, text, j11, modifier, z11, i11, i12));
        }
    }
}
