package i80;

import androidx.compose.foundation.layout.x;
import e4.f;
import jn0.h0;
import n70.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import v1.i0;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f76215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f76215c = i11;
        }

        public final void a(l lVar, int i11) {
            b.a(lVar, k2.a(this.f76215c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(l lVar, int i11) {
        l lVarV = lVar.v(-1248477155);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1248477155, i11, -1, "com.stripe.android.paymentsheet.utils.PaymentSheetContentPadding (EdgeToEdge.kt:10)");
            }
            i0.a(x.l(androidx.compose.ui.d.INSTANCE, f.a(t.f93461a, lVarV, 0)), lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(i11));
        }
    }
}
