package p009i2;

import androidx.compose.foundation.j;
import androidx.compose.material.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import n2.n;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p007h2.m0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li2/r;", "colors", "Li2/w2;", "typography", "Li2/c2;", "shapes", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Li2/r;Li2/w2;Li2/c2;Lwn0/p;Lr2/l;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k1 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typography f74590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74591d;

        /* JADX INFO: renamed from: i2.k1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C1559a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<l, Integer, h0> f74592c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1559a(p<? super l, ? super Integer, h0> pVar) {
                super(2);
                this.f74592c = pVar;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(181426554, i11, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:79)");
                }
                C4673l1.a(this.f74592c, lVar, 0);
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
        a(Typography typography, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f74590c = typography;
            this.f74591d = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1740102967, i11, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:78)");
            }
            v2.a(this.f74590c.getBody1(), c.e(181426554, true, new C1559a(this.f74591d), lVar, 54), lVar, 48);
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
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Colors f74593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typography f74594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Shapes f74595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74598h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Colors colors, Typography typography, Shapes shapes, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f74593c = colors;
            this.f74594d = typography;
            this.f74595e = shapes;
            this.f74596f = pVar;
            this.f74597g = i11;
            this.f74598h = i12;
        }

        public final void a(l lVar, int i11) {
            k1.a(this.f74593c, this.f74594d, this.f74595e, this.f74596f, lVar, k2.a(this.f74597g | 1), this.f74598h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(Colors colors, Typography typography, Shapes shapes, p<? super l, ? super Integer, h0> pVar, l lVar, int i11, int i12) {
        Colors colorsA;
        int i13;
        Typography typographyC;
        Shapes shapesB;
        Typography typography2;
        Shapes shapes2;
        l lVarV = lVar.v(-891417079);
        if ((i11 & 6) == 0) {
            if ((i12 & 1) == 0) {
                colorsA = colors;
                int i14 = lVarV.n(colorsA) ? 4 : 2;
                i13 = i14 | i11;
            } else {
                colorsA = colors;
            }
            i13 = i14 | i11;
        } else {
            colorsA = colors;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                typographyC = typography;
                int i15 = lVarV.n(typographyC) ? 32 : 16;
                i13 |= i15;
            } else {
                typographyC = typography;
            }
            i13 |= i15;
        } else {
            typographyC = typography;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if ((i12 & 4) == 0) {
                shapesB = shapes;
                int i16 = lVarV.n(shapesB) ? 256 : 128;
                i13 |= i16;
            } else {
                shapesB = shapes;
            }
            i13 |= i16;
        } else {
            shapesB = shapes;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(pVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            typography2 = typographyC;
            shapes2 = shapesB;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                if ((i12 & 1) != 0) {
                    colorsA = j1.f74525a.a(lVarV, 6);
                    i13 &= -15;
                }
                if ((i12 & 2) != 0) {
                    typographyC = j1.f74525a.c(lVarV, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    shapesB = j1.f74525a.b(lVarV, 6);
                    i13 &= -897;
                }
            } else {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            }
            Colors colors2 = colorsA;
            Shapes shapes3 = shapesB;
            lVarV.C();
            if (o.J()) {
                o.S(-891417079, i13, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:59)");
            }
            Object objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = colors2.a((8191 & 1) != 0 ? colors2.j() : 0L, (8191 & 2) != 0 ? colors2.k() : 0L, (8191 & 4) != 0 ? colors2.l() : 0L, (8191 & 8) != 0 ? colors2.m() : 0L, (8191 & 16) != 0 ? colors2.c() : 0L, (8191 & 32) != 0 ? colors2.n() : 0L, (8191 & 64) != 0 ? colors2.d() : 0L, (8191 & 128) != 0 ? colors2.g() : 0L, (8191 & 256) != 0 ? colors2.h() : 0L, (8191 & 512) != 0 ? colors2.e() : 0L, (8191 & 1024) != 0 ? colors2.i() : 0L, (8191 & 2048) != 0 ? colors2.f() : 0L, (8191 & 4096) != 0 ? colors2.o() : false);
                lVarV.B(objI);
            }
            Colors colors3 = (Colors) objI;
            s.i(colors3, colors2);
            w.b(new h2[]{s.e().d(colors3), y.a().d(Float.valueOf(x.f75438a.c(lVarV, 6))), j.a().d(d.g(false, BitmapDescriptorFactory.HUE_RED, 0L, lVarV, 0, 7)), n.d().d(t.f75185b), d2.a().d(shapes3), m0.b().d(i1.e(colors3, lVarV, 0)), x2.c().d(typographyC)}, c.e(-1740102967, true, new a(typographyC, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
            typography2 = typographyC;
            shapes2 = shapes3;
            colorsA = colors2;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(colorsA, typography2, shapes2, pVar, i11, i12));
        }
    }
}
