package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3312gp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, d3.c.b bVar, C3320gx c3320gx, wn0.q qVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, bVar, c3320gx, qVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(androidx.compose.ui.d dVar, d3.c.b bVar, C3320gx c3320gx, final wn0.q content, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(207066220);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(bVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && lVarV.n(c3320gx)) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(content) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                if (i14 != 0) {
                    dVar = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    bVar = d3.c.INSTANCE.k();
                }
                if ((i12 & 4) != 0) {
                    c3320gx = new C3320gx(null, null, 3, null);
                    i13 &= -897;
                }
            } else {
                lVarV.j();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(207066220, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScrollableColumn (OrcaScrollableColumn.kt:29)");
            }
            p020r2.w.a(q1.m0.a().d(null), z2.c.e(-2018445396, true, new a(dVar, c3320gx, bVar, content), lVarV, 54), lVarV, p020r2.h2.f106566i | 48);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        final androidx.compose.ui.d dVar2 = dVar;
        final d3.c.b bVar2 = bVar;
        final C3320gx c3320gx2 = c3320gx;
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.n21
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3312gp.a(dVar2, bVar2, c3320gx2, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gp$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f32068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3320gx f32069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3.c.b f32070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.q f32071d;

        a(androidx.compose.ui.d dVar, C3320gx c3320gx, d3.c.b bVar, wn0.q qVar) {
            this.f32068a = dVar;
            this.f32069b = c3320gx;
            this.f32070c = bVar;
            this.f32071d = qVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2018445396, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaScrollableColumn.<anonymous> (OrcaScrollableColumn.kt:33)");
            }
            final androidx.compose.foundation.o oVarA = androidx.compose.foundation.m.a(0, lVar, 0, 1);
            androidx.compose.ui.d dVar = this.f32068a;
            lVar.o(-1633100904);
            boolean zN = lVar.n(oVarA) | lVar.n(this.f32069b);
            final C3320gx c3320gx = this.f32069b;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.o21
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3312gp.a.a(oVarA, c3320gx, (m3.c) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            androidx.compose.ui.d dVarD = androidx.compose.ui.draw.b.d(dVar, (wn0.l) objI);
            d3.c.b bVar = this.f32070c;
            wn0.q qVar = this.f32071d;
            C3320gx c3320gx2 = this.f32069b;
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA, i0VarH, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.m.d(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), oVarA, false, null, false, 14, null);
            z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), bVar, lVar, 0);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar, dVarD2);
            wn0.a<b4.g> aVarA2 = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA2);
            } else {
                lVar.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA2, i0VarA, companion.c());
            p020r2.d4.b(lVarA2, xVarC2, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion.d());
            qVar.invoke(v1.j.f117505a, lVar, 6);
            lVar.g();
            AbstractC3234ex.a(oVarA, c3320gx2.b(), lVar, 0);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(androidx.compose.foundation.o oVar, C3320gx c3320gx, m3.c drawWithContent) {
            p013kotlin.jvm.internal.s.k(drawWithContent, "$this$drawWithContent");
            drawWithContent.M0();
            AbstractC3234ex.a(drawWithContent, oVar, c3320gx.a());
            return jn0.h0.f84049a;
        }
    }
}
