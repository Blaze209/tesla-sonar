package p017o70;

import e4.i;
import f90.m;
import i4.TextStyle;
import i4.d;
import jn0.h0;
import kotlin.e;
import n70.x;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import wn0.l;
import wn0.p;

/* JADX INFO: renamed from: o70.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onClick", "a", "(Lwn0/a;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: o70.g$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f96803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar) {
            super(1);
            this.f96803c = aVar;
        }

        public final void a(int i11) {
            this.f96803c.invoke();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Integer num) {
            a(num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: o70.g$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f96804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96805d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.a<h0> aVar, int i11) {
            super(2);
            this.f96804c = aVar;
            this.f96805d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function0.a(this.f96804c, lVar, k2.a(this.f96805d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(wn0.a<h0> onClick, p020r2.l lVar, int i11) {
        int i12;
        s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-776723448);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.K(onClick) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-776723448, i12, -1, "com.stripe.android.paymentsheet.addresselement.EnterManuallyText (EnterManuallyText.kt:13)");
            }
            lVarV.H(-1477616075);
            d.a aVar = new d.a(0, 1, null);
            aVar.i(i.c(x.I, lVarV, 0));
            d dVarO = aVar.o();
            lVarV.T();
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            TextStyle textStyleE = TextStyle.e(j1Var.c(lVarV, i13).getBody1(), j1Var.a(lVarV, i13).j(), m.f64661a.f().getLargeFontSize(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777212, null);
            lVarV.H(-1477604019);
            boolean z11 = (i12 & 14) == 4;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(onClick);
                lVarV.B(objI);
            }
            lVarV.T();
            e.a(dVarO, null, textStyleE, false, 0, 0, null, (l) objI, lVarV, 0, 122);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(onClick, i11));
        }
    }
}
