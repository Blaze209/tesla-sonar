package o40;

import androidx.compose.foundation.layout.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.h1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import p022s40.Function1;
import w4.h;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f96678a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<h1, l, Integer, h0> f96679b = z2.c.c(229709570, false, a.f96681c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r<w1.c, Integer, l, Integer, h0> f96680c = z2.c.c(1423572609, false, b.f96682c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "it", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<h1, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96681c = new a();

        a() {
            super(3);
        }

        public final void a(h1 it, l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(229709570, i11, -1, "com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt.lambda-1.<anonymous> (AccountPickerScreen.kt:223)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(x.i(x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), h.g(72)), a2.g.c(h.g(16))), it, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements r<w1.c, Integer, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96682c = new b();

        b() {
            super(4);
        }

        public final void a(w1.c items, int i11, l lVar, int i12) {
            s.k(items, "$this$items");
            if ((i12 & 641) == 128 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1423572609, i12, -1, "com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt.lambda-2.<anonymous> (AccountPickerScreen.kt:222)");
            }
            Function1.f(g.f96678a.a(), lVar, 6);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, Integer num, l lVar, Integer num2) {
            a(cVar, num.intValue(), lVar, num2.intValue());
            return h0.f84049a;
        }
    }

    public final q<h1, l, Integer, h0> a() {
        return f96679b;
    }

    public final r<w1.c, Integer, l, Integer, h0> b() {
        return f96680c;
    }
}
