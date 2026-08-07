package kotlin;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.z0;
import i4.TextStyle;
import i4.s0;
import jn0.h0;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p020r2.y3;
import w4.h;
import w4.r;
import w4.t;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Li4/r0;", "textStyle", "", "minLines", "maxLines", "a", "(Landroidx/compose/ui/d;Li4/r0;II)Landroidx/compose/ui/d;", "Ljn0/h0;", "b", "(II)V", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends u implements l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f15820e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, TextStyle textStyle) {
            super(1);
            this.f15818c = i11;
            this.f15819d = i12;
            this.f15820e = textStyle;
        }

        public final void a(q1 q1Var) {
            q1Var.b("heightInLines");
            q1Var.getProperties().a("minLines", Integer.valueOf(this.f15818c));
            q1Var.getProperties().a("maxLines", Integer.valueOf(this.f15819d));
            q1Var.getProperties().a("textStyle", this.f15820e);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements q<d, p020r2.l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f15823e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12, TextStyle textStyle) {
            super(3);
            this.f15821c = i11;
            this.f15822d = i12;
            this.f15823e = textStyle;
        }

        private static final Object b(y3<? extends Object> y3Var) {
            return y3Var.getValue();
        }

        public final d a(d dVar, p020r2.l lVar, int i11) {
            lVar.o(408240218);
            if (p020r2.o.J()) {
                p020r2.o.S(408240218, i11, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            o.b(this.f15821c, this.f15822d);
            if (this.f15821c == 1 && this.f15822d == Integer.MAX_VALUE) {
                d.Companion companion = d.INSTANCE;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar.l();
                return companion;
            }
            w4.d dVar2 = (w4.d) lVar.U(z0.g());
            n4.q.b bVar = (n4.q.b) lVar.U(z0.i());
            t tVar = (t) lVar.U(z0.m());
            boolean zN = lVar.n(this.f15823e) | lVar.n(tVar);
            TextStyle textStyle = this.f15823e;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = s0.d(textStyle, tVar);
                lVar.B(objI);
            }
            TextStyle textStyle2 = (TextStyle) objI;
            boolean zN2 = lVar.n(bVar) | lVar.n(textStyle2);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
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
            boolean zN3 = lVar.n(b(y3Var)) | lVar.n(dVar2) | lVar.n(bVar) | lVar.n(this.f15823e) | lVar.n(tVar);
            Object objI3 = lVar.I();
            if (zN3 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = Integer.valueOf(r.f(q0.a(textStyle2, dVar2, bVar, q0.c(), 1)));
                lVar.B(objI3);
            }
            int iIntValue = ((Number) objI3).intValue();
            boolean zN4 = lVar.n(tVar) | lVar.n(dVar2) | lVar.n(bVar) | lVar.n(this.f15823e) | lVar.n(b(y3Var));
            Object objI4 = lVar.I();
            if (zN4 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = Integer.valueOf(r.f(q0.a(textStyle2, dVar2, bVar, q0.c() + '\n' + q0.c(), 2)));
                lVar.B(objI4);
            }
            int iIntValue2 = ((Number) objI4).intValue() - iIntValue;
            int i12 = this.f15821c;
            Integer numValueOf = i12 == 1 ? null : Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue);
            int i13 = this.f15822d;
            Integer numValueOf2 = i13 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i13 - 1))) : null;
            d dVarJ = x.j(d.INSTANCE, numValueOf != null ? dVar2.w(numValueOf.intValue()) : h.INSTANCE.c(), numValueOf2 != null ? dVar2.w(numValueOf2.intValue()) : h.INSTANCE.c());
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarJ;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final d a(d dVar, TextStyle textStyle, int i11, int i12) {
        return c.b(dVar, o1.b() ? new a(i11, i12, textStyle) : o1.a(), new b(i11, i12, textStyle));
    }

    public static final void b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i11 + " and maxLines " + i12 + " must be greater than zero").toString());
        }
        if (i11 <= i12) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i11 + " must be less than or equal to maxLines " + i12).toString());
    }
}
