package p009i2;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.y3;
import q1.BorderStroke;
import u1.k;
import v1.e0;
import v1.g0;
import w4.h;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: renamed from: i2.l, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "Lu1/l;", "interactionSource", "Li2/k;", "elevation", "Lk3/g4;", "shape", "Lq1/g;", "border", "Li2/i;", "colors", "Lv1/y;", "contentPadding", "Lkotlin/Function1;", "Lv1/g0;", "content", "a", "(Lwn0/a;Landroidx/compose/ui/d;ZLu1/l;Li2/k;Lk3/g4;Lq1/g;Li2/i;Lv1/y;Lwn0/q;Lr2/l;II)V", "c", "Lk3/p1;", "contentColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C4672l {

    /* JADX INFO: renamed from: i2.l$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f74607c = new a();

        a() {
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

    /* JADX INFO: renamed from: i2.l$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<p1> f74608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1.y f74609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<g0, p020r2.l, Integer, h0> f74610e;

        /* JADX INFO: renamed from: i2.l$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v1.y f74611c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q<g0, p020r2.l, Integer, h0> f74612d;

            /* JADX INFO: renamed from: i2.l$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class C1560a extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ v1.y f74613c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ q<g0, p020r2.l, Integer, h0> f74614d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1560a(v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar) {
                    super(2);
                    this.f74613c = yVar;
                    this.f74614d = qVar;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-630330208, i11, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                    }
                    d.Companion companion = d.INSTANCE;
                    j jVar = j.f74513a;
                    d dVarH = t.h(x.a(companion, jVar.e(), jVar.d()), this.f74613c);
                    v1.b.f fVarB = v1.b.f117444a.b();
                    d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
                    q<g0, p020r2.l, Integer, h0> qVar = this.f74614d;
                    i0 i0VarB = e0.b(fVarB, interfaceC1212cI, lVar, 54);
                    int iA = j.a(lVar, 0);
                    p020r2.x xVarC = lVar.c();
                    d dVarE = androidx.compose.ui.c.e(lVar, dVarH);
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
                    p020r2.l lVarA = d4.a(lVar);
                    d4.b(lVarA, i0VarB, companion2.c());
                    d4.b(lVarA, xVarC, companion2.e());
                    p<g, Integer, h0> pVarB = companion2.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, companion2.d());
                    qVar.invoke(v1.h0.f117504a, lVar, 6);
                    lVar.g();
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar) {
                super(2);
                this.f74611c = yVar;
                this.f74612d = qVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-1699085201, i11, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:119)");
                }
                v2.a(j1.f74525a.c(lVar, 6).getButton(), z2.c.e(-630330208, true, new C1560a(this.f74611c, this.f74612d), lVar, 54), lVar, 48);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y3<p1> y3Var, v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar) {
            super(2);
            this.f74608c = y3Var;
            this.f74609d = yVar;
            this.f74610e = qVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(7524271, i11, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:118)");
            }
            w.a(y.a().d(Float.valueOf(p1.s(C4672l.b(this.f74608c)))), z2.c.e(-1699085201, true, new a(this.f74609d, this.f74610e), lVar, 54), lVar, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.l$c */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f74616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u1.l f74618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f74619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g4 f74620h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ BorderStroke f74621i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i f74622j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ v1.y f74623k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q<g0, p020r2.l, Integer, h0> f74624l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f74625m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f74626n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.a<h0> aVar, d dVar, boolean z11, u1.l lVar, k kVar, g4 g4Var, BorderStroke borderStroke, i iVar, v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f74615c = aVar;
            this.f74616d = dVar;
            this.f74617e = z11;
            this.f74618f = lVar;
            this.f74619g = kVar;
            this.f74620h = g4Var;
            this.f74621i = borderStroke;
            this.f74622j = iVar;
            this.f74623k = yVar;
            this.f74624l = qVar;
            this.f74625m = i11;
            this.f74626n = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            C4672l.a(this.f74615c, this.f74616d, this.f74617e, this.f74618f, this.f74619g, this.f74620h, this.f74621i, this.f74622j, this.f74623k, this.f74624l, lVar, k2.a(this.f74625m | 1), this.f74626n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x011e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x0127  */
    /* JADX WARN: Code duplicated, block: B:113:0x0136  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:133:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x0194  */
    /* JADX WARN: Code duplicated, block: B:138:0x0197  */
    /* JADX WARN: Code duplicated, block: B:140:0x019b  */
    /* JADX WARN: Code duplicated, block: B:141:0x019e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01be  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0210  */
    /* JADX WARN: Code duplicated, block: B:163:0x021c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0227  */
    /* JADX WARN: Code duplicated, block: B:167:0x0239  */
    /* JADX WARN: Code duplicated, block: B:169:0x0246  */
    /* JADX WARN: Code duplicated, block: B:172:0x028b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0295  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:185:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static final void a(wn0.a<h0> aVar, d dVar, boolean z11, u1.l lVar, k kVar, g4 g4Var, BorderStroke borderStroke, i iVar, v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar2, int i11, int i12) {
        int i13;
        d dVar2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        u1.l lVar3;
        int i17;
        k kVarB;
        int i18;
        int i19;
        int i21;
        v1.y yVar2;
        int i22;
        int i23;
        int i24;
        d dVar3;
        boolean z13;
        u1.l lVar4;
        int i25;
        g4 small;
        BorderStroke borderStroke2;
        i iVarA;
        v1.y yVarC;
        g4 g4Var2;
        BorderStroke borderStroke3;
        boolean z14;
        int i26;
        u1.l lVar5;
        int i27;
        y3<h> y3VarA;
        float fG;
        v1.y yVar3;
        k kVar2;
        u1.l lVar6;
        d dVar4;
        i iVar2;
        boolean z15;
        g4 g4Var3;
        BorderStroke borderStroke4;
        Object objI;
        w2 w2VarX;
        int i28;
        p020r2.l lVarV = lVar2.v(-2116133464);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i29 = i12 & 2;
        if (i29 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        lVar3 = lVar;
                        if (lVarV.n(lVar3)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i11 & 24576) == 0) {
                        if ((i12 & 16) == 0) {
                            kVarB = kVar;
                            if (lVarV.n(kVarB)) {
                                i28 = 16384;
                            }
                            i13 |= i28;
                        } else {
                            kVarB = kVar;
                        }
                        i28 = PKIFailureInfo.certRevoked;
                        i13 |= i28;
                    } else {
                        kVarB = kVar;
                    }
                    if ((196608 & i11) != 0) {
                        i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (lVarV.n(borderStroke)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i19;
                    }
                    if ((i11 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i11 & 100663296) == 0) {
                            yVar2 = yVar;
                            if (lVarV.n(yVar2)) {
                                i22 = 67108864;
                            } else {
                                i22 = 33554432;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i11 & 805306368) == 0) {
                            if (lVarV.K(qVar)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        i24 = i13;
                        if ((306783379 & i24) == 306783378 || !lVarV.b()) {
                            lVarV.L();
                            ?? r14 = 1;
                            if ((i11 & 1) != 0 || lVarV.k()) {
                                if (i29 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (i14 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                if (i16 != 0) {
                                    lVar4 = null;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if ((i12 & 16) != 0) {
                                    i25 = i24 & (-57345);
                                    kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                                } else {
                                    i25 = i24;
                                }
                                if ((i12 & 32) != 0) {
                                    small = j1.f74525a.b(lVarV, 6).getSmall();
                                    i25 &= -458753;
                                } else {
                                    small = g4Var;
                                }
                                if (i18 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i12 & 128) != 0) {
                                    iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                    i25 &= -29360129;
                                } else {
                                    iVarA = iVar;
                                }
                                if (i21 != 0) {
                                    yVarC = j.f74513a.c();
                                } else {
                                    yVarC = yVar;
                                }
                                g4Var2 = small;
                                borderStroke3 = borderStroke2;
                                z14 = z13;
                                lVar3 = lVar4;
                                dVar2 = dVar3;
                                i26 = i25;
                            } else {
                                lVarV.j();
                                i26 = (i12 & 16) != 0 ? i24 & (-57345) : i24;
                                if ((i12 & 32) != 0) {
                                    i26 &= -458753;
                                }
                                if ((i12 & 128) != 0) {
                                    i26 &= -29360129;
                                }
                                g4Var2 = g4Var;
                                borderStroke3 = borderStroke;
                                iVarA = iVar;
                                z14 = z12;
                                r14 = 1;
                                yVarC = yVar;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                            }
                            if (lVar3 == null) {
                                lVarV.o(1050577827);
                                objI = lVarV.I();
                                if (objI == p020r2.l.INSTANCE.a()) {
                                    objI = k.a();
                                    lVarV.B(objI);
                                }
                                lVar5 = (u1.l) objI;
                                lVarV.l();
                            } else {
                                lVarV.o(-243205708);
                                lVarV.l();
                                lVar5 = lVar3;
                            }
                            i27 = i26 >> 6;
                            int i31 = (i27 & 14) | ((i26 >> 18) & 112);
                            y3<p1> y3VarB = iVarA.b(z14, lVarV, i31);
                            u1.l lVar7 = lVar3;
                            y3VarA = null;
                            d dVarD = g4.o.d(dVar2, false, a.f74607c, r14, null);
                            long value = iVarA.a(z14, lVarV, i31).getValue().getValue();
                            long jP = p1.p(b(y3VarB), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            if (kVarB == null) {
                                lVarV.o(1050984484);
                            } else {
                                lVarV.o(-243191939);
                                y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                            }
                            lVarV.l();
                            if (y3VarA != null) {
                                fG = y3VarA.getValue().getValue();
                            } else {
                                fG = h.g(0);
                            }
                            m2.b(aVar, dVarD, z14, g4Var2, value, jP, borderStroke3, fG, lVar5, z2.c.e(7524271, r14, new b(y3VarB, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                            if (o.J()) {
                                o.R();
                            }
                            k kVar3 = kVarB;
                            yVar3 = yVarC;
                            kVar2 = kVar3;
                            lVar6 = lVar7;
                            dVar4 = dVar2;
                            iVar2 = iVarA;
                            z15 = z14;
                            g4Var3 = g4Var2;
                            borderStroke4 = borderStroke3;
                        } else {
                            lVarV.j();
                            g4Var3 = g4Var;
                            dVar4 = dVar2;
                            z15 = z12;
                            lVar6 = lVar3;
                            kVar2 = kVarB;
                            yVar3 = yVar2;
                            borderStroke4 = borderStroke;
                            iVar2 = iVar;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                        }
                    }
                    i13 |= 100663296;
                    yVar2 = yVar;
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    i24 = i13;
                    if ((306783379 & i24) == 306783378) {
                        lVarV.L();
                        ?? r15 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i32 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB2 = iVarA.b(z14, lVarV, i32);
                        u1.l lVar8 = lVar3;
                        y3VarA = null;
                        d dVarD2 = g4.o.d(dVar2, false, a.f74607c, r15, null);
                        long value2 = iVarA.a(z14, lVarV, i32).getValue().getValue();
                        long jP2 = p1.p(b(y3VarB2), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD2, z14, g4Var2, value2, jP2, borderStroke3, fG, lVar5, z2.c.e(7524271, r15, new b(y3VarB2, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar4 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar4;
                        lVar6 = lVar8;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    } else {
                        lVarV.L();
                        ?? r16 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i33 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB3 = iVarA.b(z14, lVarV, i33);
                        u1.l lVar9 = lVar3;
                        y3VarA = null;
                        d dVarD3 = g4.o.d(dVar2, false, a.f74607c, r16, null);
                        long value3 = iVarA.a(z14, lVarV, i33).getValue().getValue();
                        long jP3 = p1.p(b(y3VarB3), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD3, z14, g4Var2, value3, jP3, borderStroke3, fG, lVar5, z2.c.e(7524271, r16, new b(y3VarB3, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar5 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar5;
                        lVar6 = lVar9;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                lVar3 = lVar;
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        kVarB = kVar;
                        if (lVarV.n(kVarB)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        kVarB = kVar;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                if ((196608 & i11) != 0) {
                    i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i11 & 100663296) == 0) {
                        yVar2 = yVar;
                        if (lVarV.n(yVar2)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    i24 = i13;
                    if ((306783379 & i24) == 306783378) {
                        lVarV.L();
                        ?? r17 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i34 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB4 = iVarA.b(z14, lVarV, i34);
                        u1.l lVar10 = lVar3;
                        y3VarA = null;
                        d dVarD4 = g4.o.d(dVar2, false, a.f74607c, r17, null);
                        long value4 = iVarA.a(z14, lVarV, i34).getValue().getValue();
                        long jP4 = p1.p(b(y3VarB4), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD4, z14, g4Var2, value4, jP4, borderStroke3, fG, lVar5, z2.c.e(7524271, r17, new b(y3VarB4, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar6 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar6;
                        lVar6 = lVar10;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    } else {
                        lVarV.L();
                        ?? r18 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i35 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB5 = iVarA.b(z14, lVarV, i35);
                        u1.l lVar11 = lVar3;
                        y3VarA = null;
                        d dVarD5 = g4.o.d(dVar2, false, a.f74607c, r18, null);
                        long value5 = iVarA.a(z14, lVarV, i35).getValue().getValue();
                        long jP5 = p1.p(b(y3VarB5), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD5, z14, g4Var2, value5, jP5, borderStroke3, fG, lVar5, z2.c.e(7524271, r18, new b(y3VarB5, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar7 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar7;
                        lVar6 = lVar11;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                    }
                }
                i13 |= 100663296;
                yVar2 = yVar;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r19 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i36 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB6 = iVarA.b(z14, lVarV, i36);
                    u1.l lVar12 = lVar3;
                    y3VarA = null;
                    d dVarD6 = g4.o.d(dVar2, false, a.f74607c, r19, null);
                    long value6 = iVarA.a(z14, lVarV, i36).getValue().getValue();
                    long jP6 = p1.p(b(y3VarB6), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD6, z14, g4Var2, value6, jP6, borderStroke3, fG, lVar5, z2.c.e(7524271, r19, new b(y3VarB6, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar8 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar8;
                    lVar6 = lVar12;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r110 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i37 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB7 = iVarA.b(z14, lVarV, i37);
                    u1.l lVar13 = lVar3;
                    y3VarA = null;
                    d dVarD7 = g4.o.d(dVar2, false, a.f74607c, r110, null);
                    long value7 = iVarA.a(z14, lVarV, i37).getValue().getValue();
                    long jP7 = p1.p(b(y3VarB7), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD7, z14, g4Var2, value7, jP7, borderStroke3, fG, lVar5, z2.c.e(7524271, r110, new b(y3VarB7, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar9 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar9;
                    lVar6 = lVar13;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        kVarB = kVar;
                        if (lVarV.n(kVarB)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        kVarB = kVar;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                if ((196608 & i11) != 0) {
                    i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i11 & 100663296) == 0) {
                        yVar2 = yVar;
                        if (lVarV.n(yVar2)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    i24 = i13;
                    if ((306783379 & i24) == 306783378) {
                        lVarV.L();
                        ?? r111 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i38 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB8 = iVarA.b(z14, lVarV, i38);
                        u1.l lVar14 = lVar3;
                        y3VarA = null;
                        d dVarD8 = g4.o.d(dVar2, false, a.f74607c, r111, null);
                        long value8 = iVarA.a(z14, lVarV, i38).getValue().getValue();
                        long jP8 = p1.p(b(y3VarB8), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD8, z14, g4Var2, value8, jP8, borderStroke3, fG, lVar5, z2.c.e(7524271, r111, new b(y3VarB8, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar10 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar10;
                        lVar6 = lVar14;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    } else {
                        lVarV.L();
                        ?? r112 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i39 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB9 = iVarA.b(z14, lVarV, i39);
                        u1.l lVar15 = lVar3;
                        y3VarA = null;
                        d dVarD9 = g4.o.d(dVar2, false, a.f74607c, r112, null);
                        long value9 = iVarA.a(z14, lVarV, i39).getValue().getValue();
                        long jP9 = p1.p(b(y3VarB9), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD9, z14, g4Var2, value9, jP9, borderStroke3, fG, lVar5, z2.c.e(7524271, r112, new b(y3VarB9, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar11 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar11;
                        lVar6 = lVar15;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                    }
                }
                i13 |= 100663296;
                yVar2 = yVar;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r113 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i310 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB10 = iVarA.b(z14, lVarV, i310);
                    u1.l lVar16 = lVar3;
                    y3VarA = null;
                    d dVarD10 = g4.o.d(dVar2, false, a.f74607c, r113, null);
                    long value10 = iVarA.a(z14, lVarV, i310).getValue().getValue();
                    long jP10 = p1.p(b(y3VarB10), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD10, z14, g4Var2, value10, jP10, borderStroke3, fG, lVar5, z2.c.e(7524271, r113, new b(y3VarB10, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar12 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar12;
                    lVar6 = lVar16;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r114 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i311 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB11 = iVarA.b(z14, lVarV, i311);
                    u1.l lVar17 = lVar3;
                    y3VarA = null;
                    d dVarD11 = g4.o.d(dVar2, false, a.f74607c, r114, null);
                    long value11 = iVarA.a(z14, lVarV, i311).getValue().getValue();
                    long jP11 = p1.p(b(y3VarB11), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD11, z14, g4Var2, value11, jP11, borderStroke3, fG, lVar5, z2.c.e(7524271, r114, new b(y3VarB11, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar13 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar13;
                    lVar6 = lVar17;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    kVarB = kVar;
                    if (lVarV.n(kVarB)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                kVarB = kVar;
            }
            if ((196608 & i11) != 0) {
                i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i11 & 100663296) == 0) {
                    yVar2 = yVar;
                    if (lVarV.n(yVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r115 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i312 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB12 = iVarA.b(z14, lVarV, i312);
                    u1.l lVar18 = lVar3;
                    y3VarA = null;
                    d dVarD12 = g4.o.d(dVar2, false, a.f74607c, r115, null);
                    long value12 = iVarA.a(z14, lVarV, i312).getValue().getValue();
                    long jP12 = p1.p(b(y3VarB12), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD12, z14, g4Var2, value12, jP12, borderStroke3, fG, lVar5, z2.c.e(7524271, r115, new b(y3VarB12, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar14 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar14;
                    lVar6 = lVar18;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r116 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i313 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB13 = iVarA.b(z14, lVarV, i313);
                    u1.l lVar19 = lVar3;
                    y3VarA = null;
                    d dVarD13 = g4.o.d(dVar2, false, a.f74607c, r116, null);
                    long value13 = iVarA.a(z14, lVarV, i313).getValue().getValue();
                    long jP13 = p1.p(b(y3VarB13), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD13, z14, g4Var2, value13, jP13, borderStroke3, fG, lVar5, z2.c.e(7524271, r116, new b(y3VarB13, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar15 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar15;
                    lVar6 = lVar19;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= 100663296;
            yVar2 = yVar;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (lVarV.K(qVar)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i13;
            if ((306783379 & i24) == 306783378) {
                lVarV.L();
                ?? r117 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i314 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB14 = iVarA.b(z14, lVarV, i314);
                u1.l lVar110 = lVar3;
                y3VarA = null;
                d dVarD14 = g4.o.d(dVar2, false, a.f74607c, r117, null);
                long value14 = iVarA.a(z14, lVarV, i314).getValue().getValue();
                long jP14 = p1.p(b(y3VarB14), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD14, z14, g4Var2, value14, jP14, borderStroke3, fG, lVar5, z2.c.e(7524271, r117, new b(y3VarB14, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar16 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar16;
                lVar6 = lVar110;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            } else {
                lVarV.L();
                ?? r118 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i315 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB15 = iVarA.b(z14, lVarV, i315);
                u1.l lVar111 = lVar3;
                y3VarA = null;
                d dVarD15 = g4.o.d(dVar2, false, a.f74607c, r118, null);
                long value15 = iVarA.a(z14, lVarV, i315).getValue().getValue();
                long jP15 = p1.p(b(y3VarB15), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD15, z14, g4Var2, value15, jP15, borderStroke3, fG, lVar5, z2.c.e(7524271, r118, new b(y3VarB15, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar17 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar17;
                lVar6 = lVar111;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        kVarB = kVar;
                        if (lVarV.n(kVarB)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        kVarB = kVar;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                if ((196608 & i11) != 0) {
                    i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i11 & 100663296) == 0) {
                        yVar2 = yVar;
                        if (lVarV.n(yVar2)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    i24 = i13;
                    if ((306783379 & i24) == 306783378) {
                        lVarV.L();
                        ?? r119 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i316 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB16 = iVarA.b(z14, lVarV, i316);
                        u1.l lVar112 = lVar3;
                        y3VarA = null;
                        d dVarD16 = g4.o.d(dVar2, false, a.f74607c, r119, null);
                        long value16 = iVarA.a(z14, lVarV, i316).getValue().getValue();
                        long jP16 = p1.p(b(y3VarB16), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD16, z14, g4Var2, value16, jP16, borderStroke3, fG, lVar5, z2.c.e(7524271, r119, new b(y3VarB16, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar18 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar18;
                        lVar6 = lVar112;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    } else {
                        lVarV.L();
                        ?? r1110 = 1;
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        } else {
                            if (i29 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 16) != 0) {
                                i25 = i24 & (-57345);
                                kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                            } else {
                                i25 = i24;
                            }
                            if ((i12 & 32) != 0) {
                                small = j1.f74525a.b(lVarV, 6).getSmall();
                                i25 &= -458753;
                            } else {
                                small = g4Var;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 128) != 0) {
                                iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                                i25 &= -29360129;
                            } else {
                                iVarA = iVar;
                            }
                            if (i21 != 0) {
                                yVarC = j.f74513a.c();
                            } else {
                                yVarC = yVar;
                            }
                            g4Var2 = small;
                            borderStroke3 = borderStroke2;
                            z14 = z13;
                            lVar3 = lVar4;
                            dVar2 = dVar3;
                            i26 = i25;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                        }
                        if (lVar3 == null) {
                            lVarV.o(1050577827);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = k.a();
                                lVarV.B(objI);
                            }
                            lVar5 = (u1.l) objI;
                            lVarV.l();
                        } else {
                            lVarV.o(-243205708);
                            lVarV.l();
                            lVar5 = lVar3;
                        }
                        i27 = i26 >> 6;
                        int i317 = (i27 & 14) | ((i26 >> 18) & 112);
                        y3<p1> y3VarB17 = iVarA.b(z14, lVarV, i317);
                        u1.l lVar113 = lVar3;
                        y3VarA = null;
                        d dVarD17 = g4.o.d(dVar2, false, a.f74607c, r1110, null);
                        long value17 = iVarA.a(z14, lVarV, i317).getValue().getValue();
                        long jP17 = p1.p(b(y3VarB17), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        if (kVarB == null) {
                            lVarV.o(1050984484);
                        } else {
                            lVarV.o(-243191939);
                            y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                        }
                        lVarV.l();
                        if (y3VarA != null) {
                            fG = y3VarA.getValue().getValue();
                        } else {
                            fG = h.g(0);
                        }
                        m2.b(aVar, dVarD17, z14, g4Var2, value17, jP17, borderStroke3, fG, lVar5, z2.c.e(7524271, r1110, new b(y3VarB17, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                        if (o.J()) {
                            o.R();
                        }
                        k kVar19 = kVarB;
                        yVar3 = yVarC;
                        kVar2 = kVar19;
                        lVar6 = lVar113;
                        dVar4 = dVar2;
                        iVar2 = iVarA;
                        z15 = z14;
                        g4Var3 = g4Var2;
                        borderStroke4 = borderStroke3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                    }
                }
                i13 |= 100663296;
                yVar2 = yVar;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r1111 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i318 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB18 = iVarA.b(z14, lVarV, i318);
                    u1.l lVar114 = lVar3;
                    y3VarA = null;
                    d dVarD18 = g4.o.d(dVar2, false, a.f74607c, r1111, null);
                    long value18 = iVarA.a(z14, lVarV, i318).getValue().getValue();
                    long jP18 = p1.p(b(y3VarB18), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD18, z14, g4Var2, value18, jP18, borderStroke3, fG, lVar5, z2.c.e(7524271, r1111, new b(y3VarB18, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar110 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar110;
                    lVar6 = lVar114;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r1112 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i319 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB19 = iVarA.b(z14, lVarV, i319);
                    u1.l lVar115 = lVar3;
                    y3VarA = null;
                    d dVarD19 = g4.o.d(dVar2, false, a.f74607c, r1112, null);
                    long value19 = iVarA.a(z14, lVarV, i319).getValue().getValue();
                    long jP19 = p1.p(b(y3VarB19), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD19, z14, g4Var2, value19, jP19, borderStroke3, fG, lVar5, z2.c.e(7524271, r1112, new b(y3VarB19, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar111 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar111;
                    lVar6 = lVar115;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    kVarB = kVar;
                    if (lVarV.n(kVarB)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                kVarB = kVar;
            }
            if ((196608 & i11) != 0) {
                i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i11 & 100663296) == 0) {
                    yVar2 = yVar;
                    if (lVarV.n(yVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r1113 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i3110 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB110 = iVarA.b(z14, lVarV, i3110);
                    u1.l lVar116 = lVar3;
                    y3VarA = null;
                    d dVarD110 = g4.o.d(dVar2, false, a.f74607c, r1113, null);
                    long value110 = iVarA.a(z14, lVarV, i3110).getValue().getValue();
                    long jP110 = p1.p(b(y3VarB110), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD110, z14, g4Var2, value110, jP110, borderStroke3, fG, lVar5, z2.c.e(7524271, r1113, new b(y3VarB110, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar112 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar112;
                    lVar6 = lVar116;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r1114 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i3111 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB111 = iVarA.b(z14, lVarV, i3111);
                    u1.l lVar117 = lVar3;
                    y3VarA = null;
                    d dVarD111 = g4.o.d(dVar2, false, a.f74607c, r1114, null);
                    long value111 = iVarA.a(z14, lVarV, i3111).getValue().getValue();
                    long jP111 = p1.p(b(y3VarB111), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD111, z14, g4Var2, value111, jP111, borderStroke3, fG, lVar5, z2.c.e(7524271, r1114, new b(y3VarB111, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar113 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar113;
                    lVar6 = lVar117;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= 100663296;
            yVar2 = yVar;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (lVarV.K(qVar)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i13;
            if ((306783379 & i24) == 306783378) {
                lVarV.L();
                ?? r1115 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3112 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB112 = iVarA.b(z14, lVarV, i3112);
                u1.l lVar118 = lVar3;
                y3VarA = null;
                d dVarD112 = g4.o.d(dVar2, false, a.f74607c, r1115, null);
                long value112 = iVarA.a(z14, lVarV, i3112).getValue().getValue();
                long jP112 = p1.p(b(y3VarB112), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD112, z14, g4Var2, value112, jP112, borderStroke3, fG, lVar5, z2.c.e(7524271, r1115, new b(y3VarB112, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar114 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar114;
                lVar6 = lVar118;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            } else {
                lVarV.L();
                ?? r1116 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3113 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB113 = iVarA.b(z14, lVarV, i3113);
                u1.l lVar119 = lVar3;
                y3VarA = null;
                d dVarD113 = g4.o.d(dVar2, false, a.f74607c, r1116, null);
                long value113 = iVarA.a(z14, lVarV, i3113).getValue().getValue();
                long jP113 = p1.p(b(y3VarB113), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD113, z14, g4Var2, value113, jP113, borderStroke3, fG, lVar5, z2.c.e(7524271, r1116, new b(y3VarB113, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar115 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar115;
                lVar6 = lVar119;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                lVar3 = lVar;
                if (lVarV.n(lVar3)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    kVarB = kVar;
                    if (lVarV.n(kVarB)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    kVarB = kVar;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                kVarB = kVar;
            }
            if ((196608 & i11) != 0) {
                i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i11 & 100663296) == 0) {
                    yVar2 = yVar;
                    if (lVarV.n(yVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i13;
                if ((306783379 & i24) == 306783378) {
                    lVarV.L();
                    ?? r1117 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i3114 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB114 = iVarA.b(z14, lVarV, i3114);
                    u1.l lVar1110 = lVar3;
                    y3VarA = null;
                    d dVarD114 = g4.o.d(dVar2, false, a.f74607c, r1117, null);
                    long value114 = iVarA.a(z14, lVarV, i3114).getValue().getValue();
                    long jP114 = p1.p(b(y3VarB114), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD114, z14, g4Var2, value114, jP114, borderStroke3, fG, lVar5, z2.c.e(7524271, r1117, new b(y3VarB114, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar116 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar116;
                    lVar6 = lVar1110;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                } else {
                    lVarV.L();
                    ?? r1118 = 1;
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    } else {
                        if (i29 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 16) != 0) {
                            i25 = i24 & (-57345);
                            kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                        } else {
                            i25 = i24;
                        }
                        if ((i12 & 32) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i25 &= -458753;
                        } else {
                            small = g4Var;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 128) != 0) {
                            iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                            i25 &= -29360129;
                        } else {
                            iVarA = iVar;
                        }
                        if (i21 != 0) {
                            yVarC = j.f74513a.c();
                        } else {
                            yVarC = yVar;
                        }
                        g4Var2 = small;
                        borderStroke3 = borderStroke2;
                        z14 = z13;
                        lVar3 = lVar4;
                        dVar2 = dVar3;
                        i26 = i25;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                    }
                    if (lVar3 == null) {
                        lVarV.o(1050577827);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = k.a();
                            lVarV.B(objI);
                        }
                        lVar5 = (u1.l) objI;
                        lVarV.l();
                    } else {
                        lVarV.o(-243205708);
                        lVarV.l();
                        lVar5 = lVar3;
                    }
                    i27 = i26 >> 6;
                    int i3115 = (i27 & 14) | ((i26 >> 18) & 112);
                    y3<p1> y3VarB115 = iVarA.b(z14, lVarV, i3115);
                    u1.l lVar1111 = lVar3;
                    y3VarA = null;
                    d dVarD115 = g4.o.d(dVar2, false, a.f74607c, r1118, null);
                    long value115 = iVarA.a(z14, lVarV, i3115).getValue().getValue();
                    long jP115 = p1.p(b(y3VarB115), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    if (kVarB == null) {
                        lVarV.o(1050984484);
                    } else {
                        lVarV.o(-243191939);
                        y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                    }
                    lVarV.l();
                    if (y3VarA != null) {
                        fG = y3VarA.getValue().getValue();
                    } else {
                        fG = h.g(0);
                    }
                    m2.b(aVar, dVarD115, z14, g4Var2, value115, jP115, borderStroke3, fG, lVar5, z2.c.e(7524271, r1118, new b(y3VarB115, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    k kVar117 = kVarB;
                    yVar3 = yVarC;
                    kVar2 = kVar117;
                    lVar6 = lVar1111;
                    dVar4 = dVar2;
                    iVar2 = iVarA;
                    z15 = z14;
                    g4Var3 = g4Var2;
                    borderStroke4 = borderStroke3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
                }
            }
            i13 |= 100663296;
            yVar2 = yVar;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (lVarV.K(qVar)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i13;
            if ((306783379 & i24) == 306783378) {
                lVarV.L();
                ?? r1119 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3116 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB116 = iVarA.b(z14, lVarV, i3116);
                u1.l lVar1112 = lVar3;
                y3VarA = null;
                d dVarD116 = g4.o.d(dVar2, false, a.f74607c, r1119, null);
                long value116 = iVarA.a(z14, lVarV, i3116).getValue().getValue();
                long jP116 = p1.p(b(y3VarB116), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD116, z14, g4Var2, value116, jP116, borderStroke3, fG, lVar5, z2.c.e(7524271, r1119, new b(y3VarB116, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar118 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar118;
                lVar6 = lVar1112;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            } else {
                lVarV.L();
                ?? r11110 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3117 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB117 = iVarA.b(z14, lVarV, i3117);
                u1.l lVar1113 = lVar3;
                y3VarA = null;
                d dVarD117 = g4.o.d(dVar2, false, a.f74607c, r11110, null);
                long value117 = iVarA.a(z14, lVarV, i3117).getValue().getValue();
                long jP117 = p1.p(b(y3VarB117), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD117, z14, g4Var2, value117, jP117, borderStroke3, fG, lVar5, z2.c.e(7524271, r11110, new b(y3VarB117, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar119 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar119;
                lVar6 = lVar1113;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        lVar3 = lVar;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                kVarB = kVar;
                if (lVarV.n(kVarB)) {
                    i28 = 16384;
                }
                i13 |= i28;
            } else {
                kVarB = kVar;
            }
            i28 = PKIFailureInfo.certRevoked;
            i13 |= i28;
        } else {
            kVarB = kVar;
        }
        if ((196608 & i11) != 0) {
            i13 |= ((i12 & 32) == 0 || !lVarV.n(g4Var)) ? 65536 : 131072;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.n(borderStroke)) {
                i19 = PKIFailureInfo.badCertTemplate;
            } else {
                i19 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i19;
        }
        if ((i11 & 12582912) != 0) {
            i13 |= ((i12 & 128) == 0 || !lVarV.n(iVar)) ? 4194304 : 8388608;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            if ((i11 & 100663296) == 0) {
                yVar2 = yVar;
                if (lVarV.n(yVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (lVarV.K(qVar)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i13;
            if ((306783379 & i24) == 306783378) {
                lVarV.L();
                ?? r11111 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3118 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB118 = iVarA.b(z14, lVarV, i3118);
                u1.l lVar1114 = lVar3;
                y3VarA = null;
                d dVarD118 = g4.o.d(dVar2, false, a.f74607c, r11111, null);
                long value118 = iVarA.a(z14, lVarV, i3118).getValue().getValue();
                long jP118 = p1.p(b(y3VarB118), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD118, z14, g4Var2, value118, jP118, borderStroke3, fG, lVar5, z2.c.e(7524271, r11111, new b(y3VarB118, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar1110 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar1110;
                lVar6 = lVar1114;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            } else {
                lVarV.L();
                ?? r11112 = 1;
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                } else {
                    if (i29 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i25 = i24 & (-57345);
                        kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                    } else {
                        i25 = i24;
                    }
                    if ((i12 & 32) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i25 &= -458753;
                    } else {
                        small = g4Var;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 128) != 0) {
                        iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                        i25 &= -29360129;
                    } else {
                        iVarA = iVar;
                    }
                    if (i21 != 0) {
                        yVarC = j.f74513a.c();
                    } else {
                        yVarC = yVar;
                    }
                    g4Var2 = small;
                    borderStroke3 = borderStroke2;
                    z14 = z13;
                    lVar3 = lVar4;
                    dVar2 = dVar3;
                    i26 = i25;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
                }
                if (lVar3 == null) {
                    lVarV.o(1050577827);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = k.a();
                        lVarV.B(objI);
                    }
                    lVar5 = (u1.l) objI;
                    lVarV.l();
                } else {
                    lVarV.o(-243205708);
                    lVarV.l();
                    lVar5 = lVar3;
                }
                i27 = i26 >> 6;
                int i3119 = (i27 & 14) | ((i26 >> 18) & 112);
                y3<p1> y3VarB119 = iVarA.b(z14, lVarV, i3119);
                u1.l lVar1115 = lVar3;
                y3VarA = null;
                d dVarD119 = g4.o.d(dVar2, false, a.f74607c, r11112, null);
                long value119 = iVarA.a(z14, lVarV, i3119).getValue().getValue();
                long jP119 = p1.p(b(y3VarB119), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                if (kVarB == null) {
                    lVarV.o(1050984484);
                } else {
                    lVarV.o(-243191939);
                    y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
                }
                lVarV.l();
                if (y3VarA != null) {
                    fG = y3VarA.getValue().getValue();
                } else {
                    fG = h.g(0);
                }
                m2.b(aVar, dVarD119, z14, g4Var2, value119, jP119, borderStroke3, fG, lVar5, z2.c.e(7524271, r11112, new b(y3VarB119, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                k kVar1111 = kVarB;
                yVar3 = yVarC;
                kVar2 = kVar1111;
                lVar6 = lVar1115;
                dVar4 = dVar2;
                iVar2 = iVarA;
                z15 = z14;
                g4Var3 = g4Var2;
                borderStroke4 = borderStroke3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
            }
        }
        i13 |= 100663296;
        yVar2 = yVar;
        if ((i12 & 512) != 0) {
            i13 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (lVarV.K(qVar)) {
                i23 = PKIFailureInfo.duplicateCertReq;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        i24 = i13;
        if ((306783379 & i24) == 306783378) {
            lVarV.L();
            ?? r11113 = 1;
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 16) != 0) {
                    i25 = i24 & (-57345);
                    kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                } else {
                    i25 = i24;
                }
                if ((i12 & 32) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i25 &= -458753;
                } else {
                    small = g4Var;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 128) != 0) {
                    iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                    i25 &= -29360129;
                } else {
                    iVarA = iVar;
                }
                if (i21 != 0) {
                    yVarC = j.f74513a.c();
                } else {
                    yVarC = yVar;
                }
                g4Var2 = small;
                borderStroke3 = borderStroke2;
                z14 = z13;
                lVar3 = lVar4;
                dVar2 = dVar3;
                i26 = i25;
            } else {
                if (i29 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 16) != 0) {
                    i25 = i24 & (-57345);
                    kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                } else {
                    i25 = i24;
                }
                if ((i12 & 32) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i25 &= -458753;
                } else {
                    small = g4Var;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 128) != 0) {
                    iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                    i25 &= -29360129;
                } else {
                    iVarA = iVar;
                }
                if (i21 != 0) {
                    yVarC = j.f74513a.c();
                } else {
                    yVarC = yVar;
                }
                g4Var2 = small;
                borderStroke3 = borderStroke2;
                z14 = z13;
                lVar3 = lVar4;
                dVar2 = dVar3;
                i26 = i25;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
            }
            if (lVar3 == null) {
                lVarV.o(1050577827);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = k.a();
                    lVarV.B(objI);
                }
                lVar5 = (u1.l) objI;
                lVarV.l();
            } else {
                lVarV.o(-243205708);
                lVarV.l();
                lVar5 = lVar3;
            }
            i27 = i26 >> 6;
            int i31110 = (i27 & 14) | ((i26 >> 18) & 112);
            y3<p1> y3VarB1110 = iVarA.b(z14, lVarV, i31110);
            u1.l lVar1116 = lVar3;
            y3VarA = null;
            d dVarD1110 = g4.o.d(dVar2, false, a.f74607c, r11113, null);
            long value1110 = iVarA.a(z14, lVarV, i31110).getValue().getValue();
            long jP1110 = p1.p(b(y3VarB1110), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            if (kVarB == null) {
                lVarV.o(1050984484);
            } else {
                lVarV.o(-243191939);
                y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
            }
            lVarV.l();
            if (y3VarA != null) {
                fG = y3VarA.getValue().getValue();
            } else {
                fG = h.g(0);
            }
            m2.b(aVar, dVarD1110, z14, g4Var2, value1110, jP1110, borderStroke3, fG, lVar5, z2.c.e(7524271, r11113, new b(y3VarB1110, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            k kVar1112 = kVarB;
            yVar3 = yVarC;
            kVar2 = kVar1112;
            lVar6 = lVar1116;
            dVar4 = dVar2;
            iVar2 = iVarA;
            z15 = z14;
            g4Var3 = g4Var2;
            borderStroke4 = borderStroke3;
        } else {
            lVarV.L();
            ?? r11114 = 1;
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 16) != 0) {
                    i25 = i24 & (-57345);
                    kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                } else {
                    i25 = i24;
                }
                if ((i12 & 32) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i25 &= -458753;
                } else {
                    small = g4Var;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 128) != 0) {
                    iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                    i25 &= -29360129;
                } else {
                    iVarA = iVar;
                }
                if (i21 != 0) {
                    yVarC = j.f74513a.c();
                } else {
                    yVarC = yVar;
                }
                g4Var2 = small;
                borderStroke3 = borderStroke2;
                z14 = z13;
                lVar3 = lVar4;
                dVar2 = dVar3;
                i26 = i25;
            } else {
                if (i29 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 16) != 0) {
                    i25 = i24 & (-57345);
                    kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 196608, 31);
                } else {
                    i25 = i24;
                }
                if ((i12 & 32) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i25 &= -458753;
                } else {
                    small = g4Var;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 128) != 0) {
                    iVarA = j.f74513a.a(0L, 0L, 0L, 0L, lVarV, 24576, 15);
                    i25 &= -29360129;
                } else {
                    iVarA = iVar;
                }
                if (i21 != 0) {
                    yVarC = j.f74513a.c();
                } else {
                    yVarC = yVar;
                }
                g4Var2 = small;
                borderStroke3 = borderStroke2;
                z14 = z13;
                lVar3 = lVar4;
                dVar2 = dVar3;
                i26 = i25;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2116133464, i26, -1, "androidx.compose.material.Button (Button.kt:103)");
            }
            if (lVar3 == null) {
                lVarV.o(1050577827);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = k.a();
                    lVarV.B(objI);
                }
                lVar5 = (u1.l) objI;
                lVarV.l();
            } else {
                lVarV.o(-243205708);
                lVarV.l();
                lVar5 = lVar3;
            }
            i27 = i26 >> 6;
            int i31111 = (i27 & 14) | ((i26 >> 18) & 112);
            y3<p1> y3VarB1111 = iVarA.b(z14, lVarV, i31111);
            u1.l lVar1117 = lVar3;
            y3VarA = null;
            d dVarD1111 = g4.o.d(dVar2, false, a.f74607c, r11114, null);
            long value1111 = iVarA.a(z14, lVarV, i31111).getValue().getValue();
            long jP1111 = p1.p(b(y3VarB1111), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            if (kVarB == null) {
                lVarV.o(1050984484);
            } else {
                lVarV.o(-243191939);
                y3VarA = kVarB.a(z14, lVar5, lVarV, i27 & 910);
            }
            lVarV.l();
            if (y3VarA != null) {
                fG = y3VarA.getValue().getValue();
            } else {
                fG = h.g(0);
            }
            m2.b(aVar, dVarD1111, z14, g4Var2, value1111, jP1111, borderStroke3, fG, lVar5, z2.c.e(7524271, r11114, new b(y3VarB1111, yVarC, qVar), lVarV, 54), lVarV, (i27 & 7168) | (i26 & 14) | 805306368 | (i26 & 896) | (i26 & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            k kVar1113 = kVarB;
            yVar3 = yVarC;
            kVar2 = kVar1113;
            lVar6 = lVar1117;
            dVar4 = dVar2;
            iVar2 = iVarA;
            z15 = z14;
            g4Var3 = g4Var2;
            borderStroke4 = borderStroke3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(aVar, dVar4, z15, lVar6, kVar2, g4Var3, borderStroke4, iVar2, yVar3, qVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    public static final void c(wn0.a<h0> aVar, d dVar, boolean z11, u1.l lVar, k kVar, g4 g4Var, BorderStroke borderStroke, i iVar, v1.y yVar, q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar2, int i11, int i12) {
        d dVar2 = (i12 & 2) != 0 ? d.INSTANCE : dVar;
        boolean z12 = (i12 & 4) != 0 ? true : z11;
        u1.l lVar3 = (i12 & 8) != 0 ? null : lVar;
        k kVar2 = (i12 & 16) != 0 ? null : kVar;
        g4 small = (i12 & 32) != 0 ? j1.f74525a.b(lVar2, 6).getSmall() : g4Var;
        BorderStroke borderStroke2 = (i12 & 64) == 0 ? borderStroke : null;
        i iVarG = (i12 & 128) != 0 ? j.f74513a.g(0L, 0L, 0L, lVar2, 3072, 7) : iVar;
        v1.y yVarF = (i12 & 256) != 0 ? j.f74513a.f() : yVar;
        if (o.J()) {
            o.S(288797557, i11, -1, "androidx.compose.material.TextButton (Button.kt:233)");
        }
        a(aVar, dVar2, z12, lVar3, kVar2, small, borderStroke2, iVarG, yVarF, qVar, lVar2, i11 & 2147483646, 0);
        if (o.J()) {
            o.R();
        }
    }
}
