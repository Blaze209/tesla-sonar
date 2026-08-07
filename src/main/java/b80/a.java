package b80;

import androidx.compose.foundation.layout.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.p1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p009i2.C4672l;
import p009i2.j;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import v1.g0;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb80/b;", "type", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "a", "(Lb80/b;Ljava/lang/String;Lwn0/a;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C0334a extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0334a(String str) {
            super(3);
            this.f16861c = str;
        }

        public final void a(g0 TextButton, l lVar, int i11) {
            s.k(TextButton, "$this$TextButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-336976269, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateButton.<anonymous> (BacsMandateButton.kt:29)");
            }
            v2.b(this.f16861c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b80.b f16862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f16863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f16864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f16865f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b80.b bVar, String str, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f16862c = bVar;
            this.f16863d = str;
            this.f16864e = aVar;
            this.f16865f = i11;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f16862c, this.f16863d, this.f16864e, lVar, k2.a(this.f16865f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16866a;

        static {
            int[] iArr = new int[b80.b.values().length];
            try {
                iArr[b80.b.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b80.b.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16866a = iArr;
        }
    }

    public static final void a(b80.b type, String label, wn0.a<h0> aVar, l lVar, int i11) {
        int i12;
        wn0.a<h0> onClick = aVar;
        s.k(type, "type");
        s.k(label, "label");
        s.k(onClick, "onClick");
        l lVarV = lVar.v(-1081806703);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(type) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.n(label) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(onClick) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1081806703, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateButton (BacsMandateButton.kt:13)");
            }
            int i13 = c.f16866a[type.ordinal()];
            if (i13 == 1) {
                lVarV.H(69337443);
                m30.c.a(label, true, aVar, null, false, false, lVarV, ((i12 >> 3) & 14) | 48 | (i12 & 896), 56);
                onClick = aVar;
                lVarV.T();
            } else if (i13 != 2) {
                lVarV.H(-2144979468);
                lVarV.T();
            } else {
                lVarV.H(-2145339068);
                androidx.compose.ui.d dVarH = x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                j1 j1Var = j1.f74525a;
                int i14 = j1.f74526b;
                C4672l.c(onClick, dVarH, false, null, null, j1Var.b(lVarV, i14).getSmall(), null, j.f74513a.a(p1.INSTANCE.i(), j1Var.a(lVarV, i14).j(), 0L, 0L, lVarV, (j.f74524l << 12) | 6, 12), null, z2.c.b(lVarV, -336976269, true, new C0334a(label)), lVarV, ((i12 >> 6) & 14) | 805306416, 348);
                lVarV.T();
                onClick = aVar;
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(type, label, onClick, i11));
        }
    }
}
