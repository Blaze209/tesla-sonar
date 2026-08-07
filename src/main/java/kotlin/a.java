package kotlin;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import g4.y;
import j3.m;
import jn0.h0;
import k3.i3;
import k3.q1;
import m3.f;
import m3.h;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p007h2.SelectionColors;
import p007h2.SelectionHandleInfo;
import p007h2.m0;
import p007h2.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import w4.k;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lh2/j;", "offsetProvider", "Landroidx/compose/ui/d;", "modifier", "Lw4/k;", "minTouchTargetSize", "Ljn0/h0;", "a", "(Lh2/j;Landroidx/compose/ui/d;JLr2/l;II)V", "b", "(Landroidx/compose/ui/d;Lr2/l;II)V", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Lw4/h;", Gender.FEMALE, "getCursorHandleHeight", "()F", "CursorHandleHeight", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f15305b;

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class C0274a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15307d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0274a(long j11, androidx.compose.ui.d dVar) {
            super(2);
            this.f15306c = j11;
            this.f15307d = dVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1653527038, i11, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            if (this.f15306c != 9205357640488583168L) {
                lVar.o(1828881000);
                androidx.compose.ui.d dVarO = x.o(this.f15307d, k.h(this.f15306c), k.g(this.f15306c), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
                i0 i0VarH = g.h(d3.c.INSTANCE.m(), false);
                int iA = j.a(lVar, 0);
                p020r2.x xVarC = lVar.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarO);
                b4.g.Companion companion = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA = companion.a();
                if (lVar.w() == null) {
                    j.c();
                }
                lVar.h();
                if (lVar.getInserting()) {
                    lVar.z(aVarA);
                } else {
                    lVar.d();
                }
                l lVarA = d4.a(lVar);
                d4.b(lVarA, i0VarH, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                p<b4.g, Integer, h0> pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion.d());
                i iVar = i.f4585a;
                a.b(null, lVar, 0, 1);
                lVar.g();
                lVar.l();
            } else {
                lVar.o(1829217412);
                a.b(this.f15307d, lVar, 0, 0);
                lVar.l();
            }
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p007h2.j f15308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15312g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p007h2.j jVar, androidx.compose.ui.d dVar, long j11, int i11, int i12) {
            super(2);
            this.f15308c = jVar;
            this.f15309d = dVar;
            this.f15310e = j11;
            this.f15311f = i11;
            this.f15312g = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f15308c, this.f15309d, this.f15310e, lVar, k2.a(this.f15311f | 1), this.f15312g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p007h2.j f15313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p007h2.j jVar) {
            super(1);
            this.f15313c = jVar;
        }

        public final void a(y yVar) {
            yVar.b(p007h2.x.d(), new SelectionHandleInfo(m.Cursor, this.f15313c.a(), v.Middle, true, null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15316e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f15314c = dVar;
            this.f15315d = i11;
            this.f15316e = i12;
        }

        public final void a(l lVar, int i11) {
            a.b(this.f15314c, lVar, k2.a(this.f15315d | 1), this.f15316e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f15317c = new e();

        /* JADX INFO: renamed from: b2.a$e$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh3/d;", "Lh3/i;", "a", "(Lh3/d;)Lh3/i;"}, k = 3, mv = {1, 8, 0})
        static final class C0275a extends u implements wn0.l<h3.d, h3.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f15318c;

            /* JADX INFO: renamed from: b2.a$e$a$a, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0276a extends u implements wn0.l<m3.c, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f15319c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ i3 f15320d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ q1 f15321e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0276a(float f11, i3 i3Var, q1 q1Var) {
                    super(1);
                    this.f15319c = f11;
                    this.f15320d = i3Var;
                    this.f15321e = q1Var;
                }

                public final void a(m3.c cVar) {
                    cVar.M0();
                    float f11 = this.f15319c;
                    i3 i3Var = this.f15320d;
                    q1 q1Var = this.f15321e;
                    m3.d drawContext = cVar.getDrawContext();
                    long jB = drawContext.b();
                    drawContext.a().u();
                    try {
                        h transform = drawContext.getTransform();
                        h.h(transform, f11, BitmapDescriptorFactory.HUE_RED, 2, null);
                        transform.g(45.0f, j3.g.INSTANCE.c());
                        f.j0(cVar, i3Var, 0L, BitmapDescriptorFactory.HUE_RED, null, q1Var, 0, 46, null);
                    } finally {
                        drawContext.a().o();
                        drawContext.f(jB);
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(m3.c cVar) {
                    a(cVar);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0275a(long j11) {
                super(1);
                this.f15318c = j11;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h3.i invoke(h3.d dVar) {
                float fK = m.k(dVar.b()) / 2.0f;
                return dVar.q(new C0276a(fK, p007h2.a.d(dVar, fK), q1.Companion.b(q1.INSTANCE, this.f15318c, 0, 2, null)));
            }
        }

        e() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            lVar.o(-2126899193);
            if (o.J()) {
                o.S(-2126899193, i11, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long selectionHandleColor = ((SelectionColors) lVar.U(m0.b())).getSelectionHandleColor();
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            boolean zS = lVar.s(selectionHandleColor);
            Object objI = lVar.I();
            if (zS || objI == l.INSTANCE.a()) {
                objI = new C0275a(selectionHandleColor);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarG = dVar.g(androidx.compose.ui.draw.b.c(companion, (wn0.l) objI));
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    static {
        float fG = w4.h.g(25);
        f15304a = fG;
        f15305b = w4.h.g(w4.h.g(fG * 2.0f) / 2.4142137f);
    }

    public static final void a(p007h2.j jVar, androidx.compose.ui.d dVar, long j11, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(1776202187);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(jVar) : lVarV.K(jVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && lVarV.s(j11)) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else if ((i12 & 4) != 0) {
                j11 = k.INSTANCE.a();
                i13 &= -897;
            }
            lVarV.C();
            if (o.J()) {
                o.S(1776202187, i13, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i14 = i13 & 14;
            boolean z11 = i14 == 4 || ((i13 & 8) != 0 && lVarV.K(jVar));
            Object objI = lVarV.I();
            if (z11 || objI == l.INSTANCE.a()) {
                objI = new c(jVar);
                lVarV.B(objI);
            }
            p007h2.a.a(jVar, d3.c.INSTANCE.m(), z2.c.e(-1653527038, true, new C0274a(j11, g4.o.d(dVar, false, (wn0.l) objI, 1, null)), lVarV, 54), lVarV, i14 | 432);
            if (o.J()) {
                o.R();
            }
        }
        long j12 = j11;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(jVar, dVar, j12, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(694251107);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (o.J()) {
                o.S(694251107, i13, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            v1.i0.a(d(x.s(dVar, f15305b, f15304a)), lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(dVar, i11, i12));
        }
    }

    private static final androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.c(dVar, null, e.f15317c, 1, null);
    }
}
