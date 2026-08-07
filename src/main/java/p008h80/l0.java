package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import f90.PrimaryButtonStyle;
import f90.n;
import jn0.h0;
import k3.p1;
import k3.r1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import t4.j;
import w4.h;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", AnnotatedPrivateKey.LABEL, "", "color", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f71256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f71257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str) {
            super(2);
            this.f71256c = num;
            this.f71257d = str;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(2100448978, i11, -1, "com.stripe.android.paymentsheet.ui.LabelUI.<anonymous> (PrimaryButton.kt:287)");
            }
            int iA = j.INSTANCE.a();
            Integer num = this.f71256c;
            float f11 = 4;
            v2.b(this.f71257d, t.l(d.INSTANCE, h.g(f11), h.g(f11), h.g(f11), h.g(5)), num != null ? r1.b(num.intValue()) : p1.INSTANCE.j(), 0L, null, null, null, 0L, null, j.h(iA), 0L, 0, false, 0, 0, null, n.i(f90.l.f64654a.b(), lVar, PrimaryButtonStyle.f64601e), lVar, 0, 0, 65016);
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
        final /* synthetic */ String f71258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f71259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71260e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Integer num, int i11) {
            super(2);
            this.f71258c = str;
            this.f71259d = num;
            this.f71260e = i11;
        }

        public final void a(l lVar, int i11) {
            l0.a(this.f71258c, this.f71259d, lVar, k2.a(this.f71260e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, Integer num, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(606920128);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.n(num) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(606920128, i12, -1, "com.stripe.android.paymentsheet.ui.LabelUI (PrimaryButton.kt:285)");
            }
            n.a(null, null, null, c.b(lVarV, 2100448978, true, new a(num, str)), lVarV, 3072, 7);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(str, num, i11));
        }
    }
}
