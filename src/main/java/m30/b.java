package m30;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4.f;
import jn0.h0;
import n70.t;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lr2/l;II)V", "Lk3/p1;", "color", "b", "(Landroidx/compose/ui/d;JLr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f90989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f90990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f90991e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, int i11, int i12) {
            super(2);
            this.f90989c = dVar;
            this.f90990d = i11;
            this.f90991e = i12;
        }

        public final void a(l lVar, int i11) {
            b.a(this.f90989c, lVar, k2.a(this.f90990d | 1), this.f90991e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: m30.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C1936b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f90992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f90993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f90994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f90995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1936b(d dVar, long j11, int i11, int i12) {
            super(2);
            this.f90992c = dVar;
            this.f90993d = j11;
            this.f90994e = i11;
            this.f90995f = i12;
        }

        public final void a(l lVar, int i11) {
            b.b(this.f90992c, this.f90993d, lVar, k2.a(this.f90994e | 1), this.f90995f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(-1171193611);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = d.INSTANCE;
            }
            if (o.J()) {
                o.S(-1171193611, i13, -1, "com.stripe.android.common.ui.BottomSheetLoadingIndicator (LoadingIndicator.kt:18)");
            }
            b(x.i(x.h(dVar, BitmapDescriptorFactory.HUE_RED, 1, null), f.a(t.f93462b, lVarV, 0)), 0L, lVarV, 0, 2);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar, i11, i12));
        }
    }

    public static final void b(d dVar, long j11, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        long jI;
        d dVar3;
        long j12;
        d dVar4;
        l lVarV = lVar.v(1933914630);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = i11 | (lVarV.n(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                jI = j11;
                int i15 = lVarV.s(jI) ? 32 : 16;
                i13 |= i15;
            } else {
                jI = j11;
            }
            i13 |= i15;
        } else {
            jI = j11;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            dVar4 = dVar2;
            j12 = jI;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                d dVar5 = i14 != 0 ? d.INSTANCE : dVar2;
                if ((i12 & 2) != 0) {
                    jI = j1.f74525a.a(lVarV, j1.f74526b).i();
                    i13 &= -113;
                }
                dVar3 = dVar5;
            } else {
                lVarV.j();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                dVar3 = dVar2;
            }
            int i16 = i13;
            long j13 = jI;
            lVarV.C();
            if (o.J()) {
                o.S(1933914630, i16, -1, "com.stripe.android.common.ui.LoadingIndicator (LoadingIndicator.kt:31)");
            }
            float fA = f.a(t.f93463c, lVarV, 0);
            float fA2 = f.a(t.f93464d, lVarV, 0);
            d3.c cVarE = d3.c.INSTANCE.e();
            lVarV.H(733328855);
            i0 i0VarJ = g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVar3);
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
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            i iVar = i.f4585a;
            w80.d.a(x.q(d.INSTANCE, fA), j13, fA2, 0L, 0, lVarV, i16 & 112, 24);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            j12 = j13;
            dVar4 = dVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C1936b(dVar4, j12, i11, i12));
        }
    }
}
