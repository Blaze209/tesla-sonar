package kotlin;

import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.z0;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import i4.s0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p020r2.l;
import p020r2.o;
import p020r2.y3;
import w4.b;
import w4.r;
import w4.t;
import wn0.q;
import z3.h0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Li4/r0;", "style", "a", "(Landroidx/compose/ui/d;Li4/r0;)Landroidx/compose/ui/d;", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a1 {

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<d, l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f15331c;

        /* JADX INFO: renamed from: b2.a1$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/k0;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
        static final class C0277a extends u implements q<k0, h0, b, j0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0 f15332c;

            /* JADX INFO: renamed from: b2.a1$a$a$a, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0278a extends u implements wn0.l<w0.a, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ w0 f15333c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0278a(w0 w0Var) {
                    super(1);
                    this.f15333c = w0Var;
                }

                public final void a(w0.a aVar) {
                    w0.a.l(aVar, this.f15333c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
                    a(aVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0277a(z0 z0Var) {
                super(3);
                this.f15332c = z0Var;
            }

            public final j0 a(k0 k0Var, h0 h0Var, long j11) {
                long minSize = this.f15332c.getMinSize();
                w0 w0VarX0 = h0Var.x0(b.d(j11, n.n(r.g(minSize), b.n(j11), b.l(j11)), 0, n.n(r.f(minSize), b.m(j11), b.k(j11)), 0, 10, null));
                return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new C0278a(w0VarX0), 4, null);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ j0 invoke(k0 k0Var, h0 h0Var, b bVar) {
                return a(k0Var, h0Var, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextStyle textStyle) {
            super(3);
            this.f15331c = textStyle;
        }

        private static final Object b(y3<? extends Object> y3Var) {
            return y3Var.getValue();
        }

        public final d a(d dVar, l lVar, int i11) {
            lVar.o(1582736677);
            if (o.J()) {
                o.S(1582736677, i11, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
            }
            w4.d dVar2 = (w4.d) lVar.U(z0.g());
            n4.q.b bVar = (n4.q.b) lVar.U(z0.i());
            t tVar = (t) lVar.U(z0.m());
            boolean zN = lVar.n(this.f15331c) | lVar.n(tVar);
            TextStyle textStyle = this.f15331c;
            Object objI = lVar.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = s0.d(textStyle, tVar);
                lVar.B(objI);
            }
            TextStyle textStyle2 = (TextStyle) objI;
            boolean zN2 = lVar.n(bVar) | lVar.n(textStyle2);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == l.INSTANCE.a()) {
                p014n4.q qVarL = textStyle2.l();
                FontWeight fontWeightQ = textStyle2.q();
                if (fontWeightQ == null) {
                    fontWeightQ = FontWeight.INSTANCE.d();
                }
                b0 b0VarO = textStyle2.o();
                int value = b0VarO != null ? b0VarO.getValue() : b0.INSTANCE.b();
                c0 c0VarP = textStyle2.p();
                objI2 = bVar.a(qVarL, fontWeightQ, value, c0VarP != null ? c0VarP.getValue() : c0.INSTANCE.a());
                lVar.B(objI2);
            }
            y3 y3Var = (y3) objI2;
            TextStyle textStyle3 = this.f15331c;
            Object objI3 = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI3 == companion.a()) {
                objI3 = new z0(tVar, dVar2, bVar, textStyle3, b(y3Var));
                lVar.B(objI3);
            }
            z0 z0Var = (z0) objI3;
            z0Var.c(tVar, dVar2, bVar, textStyle2, b(y3Var));
            d.Companion companion2 = d.INSTANCE;
            boolean zK = lVar.K(z0Var);
            Object objI4 = lVar.I();
            if (zK || objI4 == companion.a()) {
                objI4 = new C0277a(z0Var);
                lVar.B(objI4);
            }
            d dVarA = androidx.compose.ui.layout.b.a(companion2, (q) objI4);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final d a(d dVar, TextStyle textStyle) {
        return c.c(dVar, null, new a(textStyle), 1, null);
    }
}
