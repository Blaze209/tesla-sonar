package j60;

import jn0.h0;
import p009i2.j1;
import p009i2.k1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import q1.m;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t\"\u001e\u0010\u0010\u001a\u00020\b*\u00020\u000b8AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(ZLwn0/p;Lr2/l;II)V", "Lr2/g2;", "Lj60/b;", "Lr2/g2;", "LocalColors", "Li2/j1;", "b", "(Li2/j1;Lr2/l;I)Lj60/b;", "getLinkColors$annotations", "(Li2/j1;)V", "linkColors", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<LinkColors> f82748a = w.f(c.f82755c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkColors f82749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f82750d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(LinkColors linkColors, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f82749c = linkColors;
            this.f82750d = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1467984557, i11, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:19)");
            }
            k1.a(this.f82749c.getMaterialColors(), e.a(), j1.f74525a.b(lVar, j1.f74526b), this.f82750d, lVar, 48, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f82751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f82752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f82754f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f82751c = z11;
            this.f82752d = pVar;
            this.f82753e = i11;
            this.f82754f = i12;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f82751c, this.f82752d, lVar, k2.a(this.f82753e | 1), this.f82754f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj60/b;", "b", "()Lj60/b;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<LinkColors> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f82755c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkColors invoke() {
            return j60.c.f82745a.a(false);
        }
    }

    public static final void a(boolean z11, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        int i13;
        s.k(content, "content");
        l lVarV = lVar.v(-327817747);
        if ((i11 & 14) == 0) {
            i13 = (((i12 & 1) == 0 && lVarV.p(z11)) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
            } else if ((i12 & 1) != 0) {
                z11 = m.a(lVarV, 0);
                i13 &= -15;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-327817747, i13, -1, "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:15)");
            }
            LinkColors linkColorsA = j60.c.f82745a.a(z11);
            w.b(new h2[]{f82748a.d(linkColorsA)}, z2.c.b(lVarV, 1467984557, true, new a(linkColorsA, content)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, content, i11, i12));
        }
    }

    public static final LinkColors b(j1 j1Var, l lVar, int i11) {
        s.k(j1Var, "<this>");
        if (o.J()) {
            o.S(-1842304894, i11, -1, "com.stripe.android.link.theme.<get-linkColors> (Theme.kt:32)");
        }
        LinkColors linkColors = (LinkColors) lVar.U(f82748a);
        if (o.J()) {
            o.R();
        }
        return linkColors;
    }
}
