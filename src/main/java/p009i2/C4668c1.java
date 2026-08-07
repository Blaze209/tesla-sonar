package p009i2;

import androidx.compose.foundation.layout.t;
import b4.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import g4.i;
import g4.v;
import g4.y;
import jn0.h0;
import k3.g4;
import k3.p1;
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
import p020r2.x;
import u1.k;
import v1.e0;
import w4.h;
import wn0.p;
import z3.i0;

/* JADX INFO: renamed from: i2.c1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001al\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a~\u0010\u0013\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "Lu1/l;", "interactionSource", "Lk3/g4;", "shape", "Lk3/p1;", "backgroundColor", "contentColor", "Li2/a1;", "elevation", "content", "b", "(Lwn0/a;Landroidx/compose/ui/d;Lu1/l;Lk3/g4;JJLi2/a1;Lwn0/p;Lr2/l;II)V", "text", "icon", "a", "(Lwn0/p;Lwn0/a;Landroidx/compose/ui/d;Lwn0/p;Lu1/l;Lk3/g4;JJLi2/a1;Lr2/l;II)V", "Lw4/h;", Gender.FEMALE, "FabSize", "ExtendedFabSize", "c", "ExtendedFabIconPadding", DateTokenConverter.CONVERTER_KEY, "ExtendedFabTextPadding", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C4668c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74215a = h.g(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f74216b = h.g(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f74217c = h.g(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f74218d = h.g(20);

    /* JADX INFO: renamed from: i2.c1$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74220d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2) {
            super(2);
            this.f74219c = pVar;
            this.f74220d = pVar2;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1418981691, i11, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
            }
            float f11 = this.f74219c == null ? C4668c1.f74218d : C4668c1.f74217c;
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarM = t.m(companion, f11, BitmapDescriptorFactory.HUE_RED, C4668c1.f74218d, BitmapDescriptorFactory.HUE_RED, 10, null);
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            p<l, Integer, h0> pVar = this.f74219c;
            p<l, Integer, h0> pVar2 = this.f74220d;
            i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVar, 48);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarM);
            g.Companion companion2 = g.INSTANCE;
            wn0.a<g> aVarA = companion2.a();
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
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            v1.h0 h0Var = v1.h0.f117504a;
            if (pVar != null) {
                lVar.o(-565171246);
                pVar.invoke(lVar, 0);
                v1.i0.a(androidx.compose.foundation.layout.x.v(companion, C4668c1.f74217c), lVar, 6);
                lVar.l();
            } else {
                lVar.o(-565074185);
                lVar.l();
            }
            pVar2.invoke(lVar, 0);
            lVar.g();
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

    /* JADX INFO: renamed from: i2.c1$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u1.l f74225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g4 f74226h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f74227i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f74228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a1 f74229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f74230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f74231m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar, wn0.a<h0> aVar, androidx.compose.ui.d dVar, p<? super l, ? super Integer, h0> pVar2, u1.l lVar, g4 g4Var, long j11, long j12, a1 a1Var, int i11, int i12) {
            super(2);
            this.f74221c = pVar;
            this.f74222d = aVar;
            this.f74223e = dVar;
            this.f74224f = pVar2;
            this.f74225g = lVar;
            this.f74226h = g4Var;
            this.f74227i = j11;
            this.f74228j = j12;
            this.f74229k = a1Var;
            this.f74230l = i11;
            this.f74231m = i12;
        }

        public final void a(l lVar, int i11) {
            C4668c1.a(this.f74221c, this.f74222d, this.f74223e, this.f74224f, this.f74225g, this.f74226h, this.f74227i, this.f74228j, this.f74229k, lVar, k2.a(this.f74230l | 1), this.f74231m);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.c1$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f74232c = new c();

        c() {
            super(1);
        }

        public final void a(y yVar) {
            v.k0(yVar, i.INSTANCE.a());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.c1$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f74233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74234d;

        /* JADX INFO: renamed from: i2.c1$d$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<l, Integer, h0> f74235c;

            /* JADX INFO: renamed from: i2.c1$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class C1552a extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<l, Integer, h0> f74236c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1552a(p<? super l, ? super Integer, h0> pVar) {
                    super(2);
                    this.f74236c = pVar;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-1567914264, i11, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:102)");
                    }
                    androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.x.a(androidx.compose.ui.d.INSTANCE, C4668c1.f74215a, C4668c1.f74215a);
                    d3.c cVarE = d3.c.INSTANCE.e();
                    p<l, Integer, h0> pVar = this.f74236c;
                    i0 i0VarH = androidx.compose.foundation.layout.g.h(cVarE, false);
                    int iA = j.a(lVar, 0);
                    x xVarC = lVar.c();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
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
                    d4.b(lVarA, i0VarH, companion.c());
                    d4.b(lVarA, xVarC, companion.e());
                    p<g, Integer, h0> pVarB = companion.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, companion.d());
                    androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVar, 0);
                    lVar.g();
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
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super l, ? super Integer, h0> pVar) {
                super(2);
                this.f74235c = pVar;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(1867794295, i11, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                }
                v2.a(j1.f74525a.c(lVar, 6).getButton(), z2.c.e(-1567914264, true, new C1552a(this.f74235c), lVar, 54), lVar, 48);
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
        /* JADX WARN: Multi-variable type inference failed */
        d(long j11, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f74233c = j11;
            this.f74234d = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1972871863, i11, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:100)");
            }
            w.a(y.a().d(Float.valueOf(p1.s(this.f74233c))), z2.c.e(1867794295, true, new a(this.f74234d), lVar, 54), lVar, h2.f106566i | 48);
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

    /* JADX INFO: renamed from: i2.c1$e */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u1.l f74239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f74240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f74241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f74242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a1 f74243i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74245k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f74246l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(wn0.a<h0> aVar, androidx.compose.ui.d dVar, u1.l lVar, g4 g4Var, long j11, long j12, a1 a1Var, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f74237c = aVar;
            this.f74238d = dVar;
            this.f74239e = lVar;
            this.f74240f = g4Var;
            this.f74241g = j11;
            this.f74242h = j12;
            this.f74243i = a1Var;
            this.f74244j = pVar;
            this.f74245k = i11;
            this.f74246l = i12;
        }

        public final void a(l lVar, int i11) {
            C4668c1.b(this.f74237c, this.f74238d, this.f74239e, this.f74240f, this.f74241g, this.f74242h, this.f74243i, this.f74244j, lVar, k2.a(this.f74245k | 1), this.f74246l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:132:0x0176  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0253  */
    /* JADX WARN: Code duplicated, block: B:155:0x026a  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    public static final void a(p<? super l, ? super Integer, h0> pVar, wn0.a<h0> aVar, androidx.compose.ui.d dVar, p<? super l, ? super Integer, h0> pVar2, u1.l lVar, g4 g4Var, long j11, long j12, a1 a1Var, l lVar2, int i11, int i12) {
        int i13;
        wn0.a<h0> aVar2;
        androidx.compose.ui.d dVar2;
        int i14;
        p<? super l, ? super Integer, h0> pVar3;
        int i15;
        int i16;
        u1.l lVar3;
        int i17;
        g4 g4VarB;
        a1 a1Var2;
        int i18;
        long jL;
        long jB;
        l lVar4;
        a1 a1VarA;
        androidx.compose.ui.d dVar3;
        l lVar5;
        p<? super l, ? super Integer, h0> pVar4;
        u1.l lVar6;
        g4 g4Var2;
        long j13;
        long j14;
        w2 w2VarX;
        int i19;
        int i21;
        l lVarV = lVar2.v(-1555720195);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 48) == 0) {
                i13 |= lVarV.K(aVar2) ? 32 : 16;
            }
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    pVar3 = pVar2;
                    if (lVarV.K(pVar3)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        lVar3 = lVar;
                        if (lVarV.n(lVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    if ((196608 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            g4VarB = g4Var;
                            int i23 = lVarV.n(g4VarB) ? 131072 : 65536;
                            i13 |= i23;
                        } else {
                            g4VarB = g4Var;
                        }
                        i13 |= i23;
                    } else {
                        g4VarB = g4Var;
                    }
                    if ((1572864 & i11) != 0) {
                        if ((i12 & 64) == 0 || !lVarV.s(j11)) {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i21 = PKIFailureInfo.badCertTemplate;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 12582912) != 0) {
                        if ((i12 & 128) == 0 || !lVarV.s(j12)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i13 |= i19;
                    }
                    if ((100663296 & i11) == 0) {
                        if ((i12 & 256) == 0) {
                            a1Var2 = a1Var;
                            int i24 = lVarV.n(a1Var2) ? 67108864 : 33554432;
                            i13 |= i24;
                        } else {
                            a1Var2 = a1Var;
                        }
                        i13 |= i24;
                    } else {
                        a1Var2 = a1Var;
                    }
                    if ((i13 & 38347923) == 38347922 || !lVarV.b()) {
                        lVarV.L();
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                pVar3 = null;
                            }
                            if (i16 != 0) {
                                lVar3 = null;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                            }
                            if ((i12 & 64) != 0) {
                                i18 = i13 & (-3670017);
                                jL = j1.f74525a.a(lVarV, 6).l();
                            } else {
                                i18 = i13;
                                jL = j11;
                            }
                            if ((i12 & 128) != 0) {
                                jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i12 & 256) != 0) {
                                lVar4 = lVarV;
                                i18 &= -234881025;
                                a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                            } else {
                                lVar4 = lVarV;
                                a1VarA = a1Var2;
                            }
                            i13 = i18;
                        } else {
                            lVarV.j();
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            jL = j11;
                            jB = j12;
                            lVar4 = lVarV;
                            lVar3 = lVar3;
                            a1VarA = a1Var2;
                        }
                        g4 g4Var3 = g4VarB;
                        lVar4.C();
                        if (o.J()) {
                            o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                        }
                        float f11 = f74216b;
                        int i25 = i13 >> 6;
                        b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f11, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var3, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        lVar5 = lVar4;
                        pVar4 = pVar3;
                        lVar6 = lVar3;
                        g4Var2 = g4Var3;
                        j13 = jL;
                        j14 = jB;
                        a1Var2 = a1VarA;
                    } else {
                        lVarV.j();
                        lVar5 = lVarV;
                        dVar3 = dVar2;
                        pVar4 = pVar3;
                        lVar6 = lVar3;
                        g4Var2 = g4VarB;
                        j13 = j11;
                        j14 = j12;
                    }
                    w2VarX = lVar5.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
                    }
                }
                i13 |= 24576;
                lVar3 = lVar;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        g4VarB = g4Var;
                        if (lVarV.n(g4VarB)) {
                        }
                        i13 |= i23;
                    } else {
                        g4VarB = g4Var;
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                if ((1572864 & i11) != 0) {
                    if ((i12 & 64) == 0) {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        a1Var2 = a1Var;
                        if (lVarV.n(a1Var2)) {
                        }
                        i13 |= i24;
                    } else {
                        a1Var2 = a1Var;
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                if ((i13 & 38347923) == 38347922) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var4 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f12 = f74216b;
                    int i26 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f12, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var4, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var4;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var5 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f13 = f74216b;
                    int i27 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f13, f13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var5, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var5;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                }
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
                }
            }
            i13 |= 3072;
            pVar3 = pVar2;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        g4VarB = g4Var;
                        if (lVarV.n(g4VarB)) {
                        }
                        i13 |= i23;
                    } else {
                        g4VarB = g4Var;
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                if ((1572864 & i11) != 0) {
                    if ((i12 & 64) == 0) {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        a1Var2 = a1Var;
                        if (lVarV.n(a1Var2)) {
                        }
                        i13 |= i24;
                    } else {
                        a1Var2 = a1Var;
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                if ((i13 & 38347923) == 38347922) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var6 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f14 = f74216b;
                    int i28 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f14, f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var6, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var6;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var7 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f15 = f74216b;
                    int i29 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f15, f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var7, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var7;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                }
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
                }
            }
            i13 |= 24576;
            lVar3 = lVar;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    g4VarB = g4Var;
                    if (lVarV.n(g4VarB)) {
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                i13 |= i23;
            } else {
                g4VarB = g4Var;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i21;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    a1Var2 = a1Var;
                    if (lVarV.n(a1Var2)) {
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                i13 |= i24;
            } else {
                a1Var2 = a1Var;
            }
            if ((i13 & 38347923) == 38347922) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var8 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f16 = f74216b;
                int i210 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f16, f16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var8, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var8;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var9 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f17 = f74216b;
                int i211 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f17, f17, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var9, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var9;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            }
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                pVar3 = pVar2;
                if (lVarV.K(pVar3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        g4VarB = g4Var;
                        if (lVarV.n(g4VarB)) {
                        }
                        i13 |= i23;
                    } else {
                        g4VarB = g4Var;
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                if ((1572864 & i11) != 0) {
                    if ((i12 & 64) == 0) {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        a1Var2 = a1Var;
                        if (lVarV.n(a1Var2)) {
                        }
                        i13 |= i24;
                    } else {
                        a1Var2 = a1Var;
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                if ((i13 & 38347923) == 38347922) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var10 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f18 = f74216b;
                    int i212 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f18, f18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var10, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var10;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar3 = null;
                        }
                        if (i16 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 64) != 0) {
                            i18 = i13 & (-3670017);
                            jL = j1.f74525a.a(lVarV, 6).l();
                        } else {
                            i18 = i13;
                            jL = j11;
                        }
                        if ((i12 & 128) != 0) {
                            jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i12 & 256) != 0) {
                            lVar4 = lVarV;
                            i18 &= -234881025;
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        } else {
                            lVar4 = lVarV;
                            a1VarA = a1Var2;
                        }
                        i13 = i18;
                    }
                    g4 g4Var11 = g4VarB;
                    lVar4.C();
                    if (o.J()) {
                        o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                    }
                    float f19 = f74216b;
                    int i213 = i13 >> 6;
                    b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f19, f19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var11, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    lVar5 = lVar4;
                    pVar4 = pVar3;
                    lVar6 = lVar3;
                    g4Var2 = g4Var11;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1VarA;
                }
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
                }
            }
            i13 |= 24576;
            lVar3 = lVar;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    g4VarB = g4Var;
                    if (lVarV.n(g4VarB)) {
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                i13 |= i23;
            } else {
                g4VarB = g4Var;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i21;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    a1Var2 = a1Var;
                    if (lVarV.n(a1Var2)) {
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                i13 |= i24;
            } else {
                a1Var2 = a1Var;
            }
            if ((i13 & 38347923) == 38347922) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var12 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f110 = f74216b;
                int i214 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f110, f110, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var12, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i214 & 896) | (i214 & 7168) | (57344 & i214) | (458752 & i214) | (i214 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var12;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var13 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f111 = f74216b;
                int i215 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f111, f111, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var13, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var13;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            }
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
            }
        }
        i13 |= 3072;
        pVar3 = pVar2;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                lVar3 = lVar;
                if (lVarV.n(lVar3)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    g4VarB = g4Var;
                    if (lVarV.n(g4VarB)) {
                    }
                    i13 |= i23;
                } else {
                    g4VarB = g4Var;
                }
                i13 |= i23;
            } else {
                g4VarB = g4Var;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i21;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    a1Var2 = a1Var;
                    if (lVarV.n(a1Var2)) {
                    }
                    i13 |= i24;
                } else {
                    a1Var2 = a1Var;
                }
                i13 |= i24;
            } else {
                a1Var2 = a1Var;
            }
            if ((i13 & 38347923) == 38347922) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var14 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f112 = f74216b;
                int i216 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f112, f112, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var14, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i216 & 896) | (i216 & 7168) | (57344 & i216) | (458752 & i216) | (i216 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var14;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i16 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 64) != 0) {
                        i18 = i13 & (-3670017);
                        jL = j1.f74525a.a(lVarV, 6).l();
                    } else {
                        i18 = i13;
                        jL = j11;
                    }
                    if ((i12 & 128) != 0) {
                        jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i12 & 256) != 0) {
                        lVar4 = lVarV;
                        i18 &= -234881025;
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    } else {
                        lVar4 = lVarV;
                        a1VarA = a1Var2;
                    }
                    i13 = i18;
                }
                g4 g4Var15 = g4VarB;
                lVar4.C();
                if (o.J()) {
                    o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
                }
                float f113 = f74216b;
                int i217 = i13 >> 6;
                b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f113, f113, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var15, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                lVar5 = lVar4;
                pVar4 = pVar3;
                lVar6 = lVar3;
                g4Var2 = g4Var15;
                j13 = jL;
                j14 = jB;
                a1Var2 = a1VarA;
            }
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
            }
        }
        i13 |= 24576;
        lVar3 = lVar;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                g4VarB = g4Var;
                if (lVarV.n(g4VarB)) {
                }
                i13 |= i23;
            } else {
                g4VarB = g4Var;
            }
            i13 |= i23;
        } else {
            g4VarB = g4Var;
        }
        if ((1572864 & i11) != 0) {
            if ((i12 & 64) == 0) {
                i21 = PKIFailureInfo.signerNotTrusted;
            } else {
                i21 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i21;
        }
        if ((i11 & 12582912) != 0) {
            if ((i12 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        if ((100663296 & i11) == 0) {
            if ((i12 & 256) == 0) {
                a1Var2 = a1Var;
                if (lVarV.n(a1Var2)) {
                }
                i13 |= i24;
            } else {
                a1Var2 = a1Var;
            }
            i13 |= i24;
        } else {
            a1Var2 = a1Var;
        }
        if ((i13 & 38347923) == 38347922) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar3 = null;
                }
                if (i16 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 64) != 0) {
                    i18 = i13 & (-3670017);
                    jL = j1.f74525a.a(lVarV, 6).l();
                } else {
                    i18 = i13;
                    jL = j11;
                }
                if ((i12 & 128) != 0) {
                    jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i12 & 256) != 0) {
                    lVar4 = lVarV;
                    i18 &= -234881025;
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                } else {
                    lVar4 = lVarV;
                    a1VarA = a1Var2;
                }
                i13 = i18;
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar3 = null;
                }
                if (i16 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 64) != 0) {
                    i18 = i13 & (-3670017);
                    jL = j1.f74525a.a(lVarV, 6).l();
                } else {
                    i18 = i13;
                    jL = j11;
                }
                if ((i12 & 128) != 0) {
                    jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i12 & 256) != 0) {
                    lVar4 = lVarV;
                    i18 &= -234881025;
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                } else {
                    lVar4 = lVarV;
                    a1VarA = a1Var2;
                }
                i13 = i18;
            }
            g4 g4Var16 = g4VarB;
            lVar4.C();
            if (o.J()) {
                o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
            }
            float f114 = f74216b;
            int i218 = i13 >> 6;
            b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f114, f114, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var16, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i218 & 896) | (i218 & 7168) | (57344 & i218) | (458752 & i218) | (i218 & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            dVar3 = dVar2;
            lVar5 = lVar4;
            pVar4 = pVar3;
            lVar6 = lVar3;
            g4Var2 = g4Var16;
            j13 = jL;
            j14 = jB;
            a1Var2 = a1VarA;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar3 = null;
                }
                if (i16 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 64) != 0) {
                    i18 = i13 & (-3670017);
                    jL = j1.f74525a.a(lVarV, 6).l();
                } else {
                    i18 = i13;
                    jL = j11;
                }
                if ((i12 & 128) != 0) {
                    jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i12 & 256) != 0) {
                    lVar4 = lVarV;
                    i18 &= -234881025;
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                } else {
                    lVar4 = lVarV;
                    a1VarA = a1Var2;
                }
                i13 = i18;
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar3 = null;
                }
                if (i16 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 64) != 0) {
                    i18 = i13 & (-3670017);
                    jL = j1.f74525a.a(lVarV, 6).l();
                } else {
                    i18 = i13;
                    jL = j11;
                }
                if ((i12 & 128) != 0) {
                    jB = s.b(jL, lVarV, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i12 & 256) != 0) {
                    lVar4 = lVarV;
                    i18 &= -234881025;
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                } else {
                    lVar4 = lVarV;
                    a1VarA = a1Var2;
                }
                i13 = i18;
            }
            g4 g4Var17 = g4VarB;
            lVar4.C();
            if (o.J()) {
                o.S(-1555720195, i13, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:156)");
            }
            float f115 = f74216b;
            int i219 = i13 >> 6;
            b(aVar2, androidx.compose.foundation.layout.x.u(dVar2, f115, f115, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), lVar3, g4Var17, jL, jB, a1VarA, z2.c.e(1418981691, true, new a(pVar3, pVar), lVar4, 54), lVar4, 12582912 | ((i13 >> 3) & 14) | (i219 & 896) | (i219 & 7168) | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            dVar3 = dVar2;
            lVar5 = lVar4;
            pVar4 = pVar3;
            lVar6 = lVar3;
            g4Var2 = g4Var17;
            j13 = jL;
            j14 = jB;
            a1Var2 = a1VarA;
        }
        w2VarX = lVar5.x();
        if (w2VarX != null) {
            w2VarX.a(new b(pVar, aVar, dVar3, pVar4, lVar6, g4Var2, j13, j14, a1Var2, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x013b A[PHI: r2 r4 r6 r7 r8 r14
      0x013b: PHI (r2v29 int) = (r2v21 int), (r2v32 int), (r2v33 int) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r4v7 androidx.compose.ui.d) = (r4v3 androidx.compose.ui.d), (r4v2 androidx.compose.ui.d), (r4v2 androidx.compose.ui.d) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r6v6 u1.l) = (r6v3 u1.l), (r6v2 u1.l), (r6v2 u1.l) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r7v29 k3.g4) = (r7v7 k3.g4), (r7v6 k3.g4), (r7v6 k3.g4) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r8v9 long) = (r8v3 long), (r8v2 long), (r8v2 long) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r14v8 long) = (r14v4 long), (r14v3 long), (r14v3 long) binds: [B:127:0x018b, B:109:0x0137, B:110:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0153  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:140:0x023d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0250  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    public static final void b(wn0.a<h0> aVar, androidx.compose.ui.d dVar, u1.l lVar, g4 g4Var, long j11, long j12, a1 a1Var, p<? super l, ? super Integer, h0> pVar, l lVar2, int i11, int i12) {
        wn0.a<h0> aVar2;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        u1.l lVar3;
        int i15;
        g4 g4VarB;
        long jL;
        long jB;
        int i16;
        a1 a1VarA;
        u1.l lVar4;
        l lVar5;
        a1 a1Var2;
        androidx.compose.ui.d dVar3;
        u1.l lVar6;
        g4 g4Var2;
        long j13;
        long j14;
        Object objI;
        w2 w2VarX;
        int i17;
        int i18;
        l lVarV = lVar2.v(1028985328);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 6) == 0) {
                i13 = (lVarV.K(aVar2) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        g4VarB = g4Var;
                        int i21 = lVarV.n(g4VarB) ? 2048 : 1024;
                        i13 |= i21;
                    } else {
                        g4VarB = g4Var;
                    }
                    i13 |= i21;
                } else {
                    g4VarB = g4Var;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jL = j11;
                        if (lVarV.s(jL)) {
                            i18 = 16384;
                        }
                        i13 |= i18;
                    } else {
                        jL = j11;
                    }
                    i18 = PKIFailureInfo.certRevoked;
                    i13 |= i18;
                } else {
                    jL = j11;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jB = j12;
                        int i22 = lVarV.s(jB) ? 131072 : 65536;
                        i13 |= i22;
                    } else {
                        jB = j12;
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0 || !lVarV.n(a1Var)) {
                        i17 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i17 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i17;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(pVar)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i13 |= i16;
                }
                if ((4793491 & i13) == 4793490 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i19 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                        }
                        if ((i12 & 16) != 0) {
                            jL = j1.f74525a.a(lVarV, 6).l();
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                            i13 &= -3670017;
                        }
                        g4 g4Var3 = g4VarB;
                        long j15 = jL;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(-1991754265);
                            objI = lVarV.I();
                            if (objI == l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar4 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(628485872);
                            lVarV.l();
                            lVar4 = lVar3;
                        }
                        a1 a1Var3 = a1VarA;
                        long j16 = jB;
                        lVar5 = lVarV;
                        m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var3, j15, j16, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                        if (o.J()) {
                            o.R();
                        }
                        a1Var2 = a1Var3;
                        dVar3 = dVar2;
                        lVar6 = lVar3;
                        g4Var2 = g4Var3;
                        j13 = j15;
                        j14 = j16;
                    } else {
                        lVarV.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                    }
                    a1VarA = a1Var;
                    g4 g4Var4 = g4VarB;
                    long j17 = jL;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(-1991754265);
                        objI = lVarV.I();
                        if (objI == l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar4 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(628485872);
                        lVarV.l();
                        lVar4 = lVar3;
                    }
                    a1 a1Var4 = a1VarA;
                    long j18 = jB;
                    lVar5 = lVarV;
                    m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var4, j17, j18, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                    if (o.J()) {
                        o.R();
                    }
                    a1Var2 = a1Var4;
                    dVar3 = dVar2;
                    lVar6 = lVar3;
                    g4Var2 = g4Var4;
                    j13 = j17;
                    j14 = j18;
                } else {
                    lVarV.j();
                    lVar5 = lVarV;
                    dVar3 = dVar2;
                    lVar6 = lVar3;
                    g4Var2 = g4VarB;
                    j13 = jL;
                    j14 = jB;
                    a1Var2 = a1Var;
                }
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(aVar, dVar3, lVar6, g4Var2, j13, j14, a1Var2, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            lVar3 = lVar;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    g4VarB = g4Var;
                    if (lVarV.n(g4VarB)) {
                    }
                    i13 |= i21;
                } else {
                    g4VarB = g4Var;
                }
                i13 |= i21;
            } else {
                g4VarB = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jL = j11;
                    if (lVarV.s(jL)) {
                        i18 = 16384;
                    }
                    i13 |= i18;
                } else {
                    jL = j11;
                }
                i18 = PKIFailureInfo.certRevoked;
                i13 |= i18;
            } else {
                jL = j11;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jB = j12;
                    if (lVarV.s(jB)) {
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i13 |= i22;
            } else {
                jB = j12;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i17 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(pVar)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i13 |= i16;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                }
                g4 g4Var5 = g4VarB;
                long j19 = jL;
                lVarV.C();
                if (o.J()) {
                    o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                }
                if (lVar3 == null) {
                    lVarV.o(-1991754265);
                    objI = lVarV.I();
                    if (objI == l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar4 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(628485872);
                    lVarV.l();
                    lVar4 = lVar3;
                }
                a1 a1Var5 = a1VarA;
                long j110 = jB;
                lVar5 = lVarV;
                m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var5, j19, j110, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                if (o.J()) {
                    o.R();
                }
                a1Var2 = a1Var5;
                dVar3 = dVar2;
                lVar6 = lVar3;
                g4Var2 = g4Var5;
                j13 = j19;
                j14 = j110;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                }
                g4 g4Var6 = g4VarB;
                long j111 = jL;
                lVarV.C();
                if (o.J()) {
                    o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                }
                if (lVar3 == null) {
                    lVarV.o(-1991754265);
                    objI = lVarV.I();
                    if (objI == l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar4 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(628485872);
                    lVarV.l();
                    lVar4 = lVar3;
                }
                a1 a1Var6 = a1VarA;
                long j112 = jB;
                lVar5 = lVarV;
                m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var6, j111, j112, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                if (o.J()) {
                    o.R();
                }
                a1Var2 = a1Var6;
                dVar3 = dVar2;
                lVar6 = lVar3;
                g4Var2 = g4Var6;
                j13 = j111;
                j14 = j112;
            }
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new e(aVar, dVar3, lVar6, g4Var2, j13, j14, a1Var2, pVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                lVar3 = lVar;
                if (lVarV.n(lVar3)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    g4VarB = g4Var;
                    if (lVarV.n(g4VarB)) {
                    }
                    i13 |= i21;
                } else {
                    g4VarB = g4Var;
                }
                i13 |= i21;
            } else {
                g4VarB = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jL = j11;
                    if (lVarV.s(jL)) {
                        i18 = 16384;
                    }
                    i13 |= i18;
                } else {
                    jL = j11;
                }
                i18 = PKIFailureInfo.certRevoked;
                i13 |= i18;
            } else {
                jL = j11;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jB = j12;
                    if (lVarV.s(jB)) {
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i13 |= i22;
            } else {
                jB = j12;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i17 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(pVar)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i13 |= i16;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                }
                g4 g4Var7 = g4VarB;
                long j113 = jL;
                lVarV.C();
                if (o.J()) {
                    o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                }
                if (lVar3 == null) {
                    lVarV.o(-1991754265);
                    objI = lVarV.I();
                    if (objI == l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar4 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(628485872);
                    lVarV.l();
                    lVar4 = lVar3;
                }
                a1 a1Var7 = a1VarA;
                long j114 = jB;
                lVar5 = lVarV;
                m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var7, j113, j114, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                if (o.J()) {
                    o.R();
                }
                a1Var2 = a1Var7;
                dVar3 = dVar2;
                lVar6 = lVar3;
                g4Var2 = g4Var7;
                j13 = j113;
                j14 = j114;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                    }
                    if ((i12 & 16) != 0) {
                        jL = j1.f74525a.a(lVarV, 6).l();
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                        i13 &= -3670017;
                    } else {
                        a1VarA = a1Var;
                    }
                }
                g4 g4Var8 = g4VarB;
                long j115 = jL;
                lVarV.C();
                if (o.J()) {
                    o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
                }
                if (lVar3 == null) {
                    lVarV.o(-1991754265);
                    objI = lVarV.I();
                    if (objI == l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar4 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(628485872);
                    lVarV.l();
                    lVar4 = lVar3;
                }
                a1 a1Var8 = a1VarA;
                long j116 = jB;
                lVar5 = lVarV;
                m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var8, j115, j116, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
                if (o.J()) {
                    o.R();
                }
                a1Var2 = a1Var8;
                dVar3 = dVar2;
                lVar6 = lVar3;
                g4Var2 = g4Var8;
                j13 = j115;
                j14 = j116;
            }
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new e(aVar, dVar3, lVar6, g4Var2, j13, j14, a1Var2, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        lVar3 = lVar;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                g4VarB = g4Var;
                if (lVarV.n(g4VarB)) {
                }
                i13 |= i21;
            } else {
                g4VarB = g4Var;
            }
            i13 |= i21;
        } else {
            g4VarB = g4Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jL = j11;
                if (lVarV.s(jL)) {
                    i18 = 16384;
                }
                i13 |= i18;
            } else {
                jL = j11;
            }
            i18 = PKIFailureInfo.certRevoked;
            i13 |= i18;
        } else {
            jL = j11;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                jB = j12;
                if (lVarV.s(jB)) {
                }
                i13 |= i22;
            } else {
                jB = j12;
            }
            i13 |= i22;
        } else {
            jB = j12;
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i17 = PKIFailureInfo.signerNotTrusted;
            } else {
                i17 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i17;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.K(pVar)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i13 |= i16;
        }
        if ((4793491 & i13) == 4793490) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 16) != 0) {
                    jL = j1.f74525a.a(lVarV, 6).l();
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    i13 &= -3670017;
                } else {
                    a1VarA = a1Var;
                }
            } else {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 16) != 0) {
                    jL = j1.f74525a.a(lVarV, 6).l();
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    i13 &= -3670017;
                } else {
                    a1VarA = a1Var;
                }
            }
            g4 g4Var9 = g4VarB;
            long j117 = jL;
            lVarV.C();
            if (o.J()) {
                o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
            }
            if (lVar3 == null) {
                lVarV.o(-1991754265);
                objI = lVarV.I();
                if (objI == l.INSTANCE.a()) {
                    objI = k.a();
                    lVarV.B(objI);
                }
                lVar4 = (u1.l) objI;
                lVarV.l();
            } else {
                lVarV.o(628485872);
                lVarV.l();
                lVar4 = lVar3;
            }
            a1 a1Var9 = a1VarA;
            long j118 = jB;
            lVar5 = lVarV;
            m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var9, j117, j118, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
            if (o.J()) {
                o.R();
            }
            a1Var2 = a1Var9;
            dVar3 = dVar2;
            lVar6 = lVar3;
            g4Var2 = g4Var9;
            j13 = j117;
            j14 = j118;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 16) != 0) {
                    jL = j1.f74525a.a(lVarV, 6).l();
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    i13 &= -3670017;
                } else {
                    a1VarA = a1Var;
                }
            } else {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    lVar3 = null;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarB = j1.f74525a.b(lVarV, 6).getSmall().b(a2.c.a(50));
                }
                if ((i12 & 16) != 0) {
                    jL = j1.f74525a.a(lVarV, 6).l();
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jL, lVarV, (i13 >> 12) & 14);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    a1VarA = z0.f75456a.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 24576, 15);
                    i13 &= -3670017;
                } else {
                    a1VarA = a1Var;
                }
            }
            g4 g4Var10 = g4VarB;
            long j119 = jL;
            lVarV.C();
            if (o.J()) {
                o.S(1028985328, i13, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
            }
            if (lVar3 == null) {
                lVarV.o(-1991754265);
                objI = lVarV.I();
                if (objI == l.INSTANCE.a()) {
                    objI = k.a();
                    lVarV.B(objI);
                }
                lVar4 = (u1.l) objI;
                lVarV.l();
            } else {
                lVarV.o(628485872);
                lVarV.l();
                lVar4 = lVar3;
            }
            a1 a1Var10 = a1VarA;
            long j1110 = jB;
            lVar5 = lVarV;
            m2.b(aVar2, g4.o.d(dVar2, false, c.f74232c, 1, null), false, g4Var10, j119, j1110, null, a1VarA.a(lVar4, lVarV, (i13 >> 15) & 112).getValue().getValue(), lVar4, z2.c.e(1972871863, true, new d(jB, pVar), lVarV, 54), lVar5, (i13 & 14) | 805306368 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 68);
            if (o.J()) {
                o.R();
            }
            a1Var2 = a1Var10;
            dVar3 = dVar2;
            lVar6 = lVar3;
            g4Var2 = g4Var10;
            j13 = j119;
            j14 = j1110;
        }
        w2VarX = lVar5.x();
        if (w2VarX != null) {
            w2VarX.a(new e(aVar, dVar3, lVar6, g4Var2, j13, j14, a1Var2, pVar, i11, i12));
        }
    }
}
