package p007h2;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.z0;
import b4.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.y;
import j3.h;
import j3.n;
import jn0.h0;
import k3.b1;
import k3.i3;
import k3.j1;
import k3.j3;
import k3.k3;
import k3.l1;
import k3.p1;
import k3.q1;
import k3.r1;
import kotlin.m;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import t4.i;
import v1.e0;
import w4.k;
import w4.t;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aD\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lh2/j;", "offsetProvider", "", "isStartHandle", "Lt4/i;", "direction", "handlesCrossed", "Lw4/k;", "minTouchTargetSize", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "b", "(Lh2/j;ZLt4/i;ZJLandroidx/compose/ui/d;Lr2/l;II)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "c", "(Landroidx/compose/ui/d;Lwn0/a;ZLr2/l;I)V", "e", "(Landroidx/compose/ui/d;Lwn0/a;Z)Landroidx/compose/ui/d;", "Lh3/d;", "", "radius", "Lk3/i3;", DateTokenConverter.CONVERTER_KEY, "(Lh3/d;F)Lk3/i3;", "positionProvider", "Ld3/c;", "handleReferencePoint", "content", "a", "(Lh2/j;Ld3/c;Lwn0/p;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: h2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C1448a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f70172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3.c f70173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f70174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f70175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1448a(j jVar, d3.c cVar, p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f70172c = jVar;
            this.f70173d = cVar;
            this.f70174e = pVar;
            this.f70175f = i11;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f70172c, this.f70173d, this.f70174e, lVar, k2.a(this.f70175f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e3 f70176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f70177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f70178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f70179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f70180g;

        /* JADX INFO: renamed from: h2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C1449a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f70181c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f70182d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f70183e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ j f70184f;

            /* JADX INFO: renamed from: h2.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C1450a extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f70185c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1450a(j jVar) {
                    super(0);
                    this.f70185c = jVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(h.c(this.f70185c.a()));
                }
            }

            /* JADX INFO: renamed from: h2.a$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C1451b extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f70186c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1451b(j jVar) {
                    super(0);
                    this.f70186c = jVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(h.c(this.f70186c.a()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1449a(long j11, boolean z11, androidx.compose.ui.d dVar, j jVar) {
                super(2);
                this.f70181c = j11;
                this.f70182d = z11;
                this.f70183e = dVar;
                this.f70184f = jVar;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-1426434671, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                }
                if (this.f70181c != 9205357640488583168L) {
                    lVar.o(-837727128);
                    v1.b.e eVarB = this.f70182d ? v1.b.a.f117453a.b() : v1.b.a.f117453a.a();
                    androidx.compose.ui.d dVarO = x.o(this.f70183e, k.h(this.f70181c), k.g(this.f70181c), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
                    j jVar = this.f70184f;
                    boolean z11 = this.f70182d;
                    i0 i0VarB = e0.b(eVarB, d3.c.INSTANCE.l(), lVar, 0);
                    int iA = j.a(lVar, 0);
                    p020r2.x xVarC = lVar.c();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarO);
                    g.Companion companion = g.INSTANCE;
                    wn0.a<g> aVarA = companion.a();
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
                    d4.b(lVarA, i0VarB, companion.c());
                    d4.b(lVarA, xVarC, companion.e());
                    p<g, Integer, h0> pVarB = companion.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, companion.d());
                    v1.h0 h0Var = v1.h0.f117504a;
                    androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                    boolean zK = lVar.K(jVar);
                    Object objI = lVar.I();
                    if (zK || objI == l.INSTANCE.a()) {
                        objI = new C1450a(jVar);
                        lVar.B(objI);
                    }
                    a.c(companion2, (wn0.a) objI, z11, lVar, 6);
                    lVar.g();
                    lVar.l();
                } else {
                    lVar.o(-836867312);
                    androidx.compose.ui.d dVar = this.f70183e;
                    boolean zK2 = lVar.K(this.f70184f);
                    j jVar2 = this.f70184f;
                    Object objI2 = lVar.I();
                    if (zK2 || objI2 == l.INSTANCE.a()) {
                        objI2 = new C1451b(jVar2);
                        lVar.B(objI2);
                    }
                    a.c(dVar, (wn0.a) objI2, this.f70182d, lVar, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e3 e3Var, long j11, boolean z11, androidx.compose.ui.d dVar, j jVar) {
            super(2);
            this.f70176c = e3Var;
            this.f70177d = j11;
            this.f70178e = z11;
            this.f70179f = dVar;
            this.f70180g = jVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(280174801, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            w.a(z0.u().d(this.f70176c), z2.c.e(-1426434671, true, new C1449a(this.f70177d, this.f70178e, this.f70179f, this.f70180g), lVar, 54), lVar, h2.f106566i | 48);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f70187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f70189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f70190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f70191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f70192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f70193i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f70194j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j jVar, boolean z11, i iVar, boolean z12, long j11, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f70187c = jVar;
            this.f70188d = z11;
            this.f70189e = iVar;
            this.f70190f = z12;
            this.f70191g = j11;
            this.f70192h = dVar;
            this.f70193i = i11;
            this.f70194j = i12;
        }

        public final void a(l lVar, int i11) {
            a.b(this.f70187c, this.f70188d, this.f70189e, this.f70190f, this.f70191g, this.f70192h, lVar, k2.a(this.f70193i | 1), this.f70194j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f70195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f70197e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j jVar, boolean z11, boolean z12) {
            super(1);
            this.f70195c = jVar;
            this.f70196d = z11;
            this.f70197e = z12;
        }

        public final void a(y yVar) {
            long jA = this.f70195c.a();
            yVar.b(x.d(), new SelectionHandleInfo(this.f70196d ? m.SelectionStart : m.SelectionEnd, jA, this.f70197e ? v.Left : v.Right, h.c(jA), null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f70198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<Boolean> f70199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f70200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f70201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.d dVar, wn0.a<Boolean> aVar, boolean z11, int i11) {
            super(2);
            this.f70198c = dVar;
            this.f70199d = aVar;
            this.f70200e = z11;
            this.f70201f = i11;
        }

        public final void a(l lVar, int i11) {
            a.c(this.f70198c, this.f70199d, this.f70200e, lVar, k2.a(this.f70201f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<Boolean> f70202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70203d;

        /* JADX INFO: renamed from: h2.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh3/d;", "Lh3/i;", "a", "(Lh3/d;)Lh3/i;"}, k = 3, mv = {1, 8, 0})
        static final class C1452a extends u implements wn0.l<h3.d, h3.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f70204c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.a<Boolean> f70205d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f70206e;

            /* JADX INFO: renamed from: h2.a$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
            static final class C1453a extends u implements wn0.l<m3.c, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<Boolean> f70207c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f70208d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ i3 f70209e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ q1 f70210f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1453a(wn0.a<Boolean> aVar, boolean z11, i3 i3Var, q1 q1Var) {
                    super(1);
                    this.f70207c = aVar;
                    this.f70208d = z11;
                    this.f70209e = i3Var;
                    this.f70210f = q1Var;
                }

                public final void a(m3.c cVar) {
                    cVar.M0();
                    if (this.f70207c.invoke().booleanValue()) {
                        if (!this.f70208d) {
                            m3.f.j0(cVar, this.f70209e, 0L, BitmapDescriptorFactory.HUE_RED, null, this.f70210f, 0, 46, null);
                            return;
                        }
                        i3 i3Var = this.f70209e;
                        q1 q1Var = this.f70210f;
                        long jJ0 = cVar.J0();
                        m3.d drawContext = cVar.getDrawContext();
                        long jB = drawContext.b();
                        drawContext.a().u();
                        try {
                            drawContext.getTransform().f(-1.0f, 1.0f, jJ0);
                            m3.f.j0(cVar, i3Var, 0L, BitmapDescriptorFactory.HUE_RED, null, q1Var, 0, 46, null);
                        } finally {
                            drawContext.a().o();
                            drawContext.f(jB);
                        }
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(m3.c cVar) {
                    a(cVar);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1452a(long j11, wn0.a<Boolean> aVar, boolean z11) {
                super(1);
                this.f70204c = j11;
                this.f70205d = aVar;
                this.f70206e = z11;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h3.i invoke(h3.d dVar) {
                return dVar.q(new C1453a(this.f70205d, this.f70206e, a.d(dVar, j3.m.k(dVar.b()) / 2.0f), q1.Companion.b(q1.INSTANCE, this.f70204c, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(wn0.a<Boolean> aVar, boolean z11) {
            super(3);
            this.f70202c = aVar;
            this.f70203d = z11;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            lVar.o(-196777734);
            if (o.J()) {
                o.S(-196777734, i11, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long selectionHandleColor = ((SelectionColors) lVar.U(m0.b())).getSelectionHandleColor();
            boolean zS = lVar.s(selectionHandleColor) | lVar.n(this.f70202c) | lVar.p(this.f70203d);
            wn0.a<Boolean> aVar = this.f70202c;
            boolean z11 = this.f70203d;
            Object objI = lVar.I();
            if (zS || objI == l.INSTANCE.a()) {
                objI = new C1452a(selectionHandleColor, aVar, z11);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.b.c(dVar, (wn0.l) objI);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarC;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final void a(j jVar, d3.c cVar, p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(476043083);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(jVar) : lVarV.K(jVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(cVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(476043083, i12, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            boolean z11 = false;
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && lVarV.n(jVar))) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object objI = lVarV.I();
            if (z13 || objI == l.INSTANCE.a()) {
                objI = new g(cVar, jVar);
                lVarV.B(objI);
            }
            androidx.compose.ui.window.c.a((g) objI, null, new androidx.compose.ui.window.s(false, false, false, null, true, false, 15, null), pVar, lVarV, ((i12 << 3) & 7168) | KyberEngine.KyberPolyBytes, 2);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C1448a(jVar, cVar, pVar, i11));
        }
    }

    public static final void b(j jVar, boolean z11, i iVar, boolean z12, long j11, androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        int i13;
        i iVar2;
        boolean z13;
        long jA;
        l lVarV = lVar.v(-843755800);
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
            i13 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                i13 |= lVarV.n(iVar2) ? 256 : 128;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            z13 = z12;
        } else {
            z13 = z12;
            if ((i11 & 3072) == 0) {
                i13 |= lVarV.p(z13) ? 2048 : 1024;
            }
        }
        if ((i11 & 24576) == 0) {
            jA = j11;
            i13 |= ((i12 & 16) == 0 && lVarV.s(jA)) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            jA = j11;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= lVarV.n(dVar) ? 131072 : 65536;
        }
        if ((74899 & i13) == 74898 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                }
            } else if ((i12 & 16) != 0) {
                jA = k.INSTANCE.a();
                i13 &= -57345;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-843755800, i13, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)");
            }
            boolean zF = x.f(z11, iVar, z12);
            d3.a aVar = d3.a.f59254a;
            d3.c cVarB = zF ? aVar.b() : aVar.a();
            int i14 = i13 & 14;
            boolean zP = ((i13 & 112) == 32) | (i14 == 4 || ((i13 & 8) != 0 && lVarV.K(jVar))) | lVarV.p(zF);
            Object objI = lVarV.I();
            if (zP || objI == l.INSTANCE.a()) {
                objI = new d(jVar, z11, zF);
                lVarV.B(objI);
            }
            long j12 = jA;
            a(jVar, cVarB, z2.c.e(280174801, true, new b((e3) lVarV.U(z0.u()), j12, zF, g4.o.d(dVar, false, (wn0.l) objI, 1, null), jVar), lVarV, 54), lVarV, i14 | KyberEngine.KyberPolyBytes);
            if (o.J()) {
                o.R();
            }
            jA = j12;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(jVar, z11, iVar2, z13, jA, dVar, i11, i12));
        }
    }

    public static final void c(androidx.compose.ui.d dVar, wn0.a<Boolean> aVar, boolean z11, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(2111672474);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(aVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.p(z11) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(2111672474, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            v1.i0.a(e(x.s(dVar, x.c(), x.b()), aVar, z11), lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(dVar, aVar, z11, i11));
        }
    }

    public static final i3 d(h3.d dVar, float f11) {
        int iCeil = ((int) Math.ceil(f11)) * 2;
        p007h2.f fVar = p007h2.f.f70251a;
        i3 i3VarC = fVar.c();
        j1 j1VarA = fVar.a();
        m3.a aVarB = fVar.b();
        if (i3VarC == null || j1VarA == null || iCeil > i3VarC.getWidth() || iCeil > i3VarC.getHeight()) {
            i3VarC = k3.b(iCeil, iCeil, j3.INSTANCE.a(), false, null, 24, null);
            fVar.f(i3VarC);
            j1VarA = l1.a(i3VarC);
            fVar.d(j1VarA);
        }
        i3 i3Var = i3VarC;
        j1 j1Var = j1VarA;
        if (aVarB == null) {
            aVarB = new m3.a();
            fVar.e(aVarB);
        }
        m3.a aVar = aVarB;
        t layoutDirection = dVar.getLayoutDirection();
        long jA = n.a(i3Var.getWidth(), i3Var.getHeight());
        m3.a.DrawParams drawParams = aVar.getDrawParams();
        w4.d density = drawParams.getDensity();
        t layoutDirection2 = drawParams.getLayoutDirection();
        j1 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        m3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(layoutDirection);
        drawParams2.i(j1Var);
        drawParams2.l(jA);
        j1Var.u();
        m3.f.C0(aVar, p1.INSTANCE.a(), 0L, aVar.b(), BitmapDescriptorFactory.HUE_RED, null, null, b1.INSTANCE.a(), 58, null);
        m3.f.C0(aVar, r1.d(4278190080L), j3.g.INSTANCE.c(), n.a(f11, f11), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        m3.f.Z(aVar, r1.d(4278190080L), f11, h.a(f11, f11), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        j1Var.o();
        m3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size);
        return i3Var;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, wn0.a<Boolean> aVar, boolean z11) {
        return androidx.compose.ui.c.c(dVar, null, new f(aVar, z11), 1, null);
    }
}
