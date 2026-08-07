package u40;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import k3.i3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import q1.b0;
import wn0.q;
import z2.c;
import z3.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115367a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<i3, l, Integer, h0> f115368b = c.c(230959578, false, C2473a.f115369c);

    /* JADX INFO: renamed from: u40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/i3;", "image", "Ljn0/h0;", "a", "(Lk3/i3;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2473a extends u implements q<i3, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2473a f115369c = new C2473a();

        C2473a() {
            super(3);
        }

        public final void a(i3 image, l lVar, int i11) {
            s.k(image, "image");
            if (o.J()) {
                o.S(230959578, i11, -1, "com.stripe.android.financialconnections.features.consent.ui.ComposableSingletons$ConsentLogoHeaderKt.lambda-1.<anonymous> (ConsentLogoHeader.kt:238)");
            }
            b0.b(image, null, x.f(d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, k.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, null, 0, lVar, 25016, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(i3 i3Var, l lVar, Integer num) {
            a(i3Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<i3, l, Integer, h0> a() {
        return f115368b;
    }
}
