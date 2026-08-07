package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f75381a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<e2, l, Integer, h0> f75382b = c.c(996639038, false, a.f75383c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/e2;", "it", "Ljn0/h0;", "a", "(Li2/e2;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<e2, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75383c = new a();

        a() {
            super(3);
        }

        public final void a(e2 e2Var, l lVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | ((i11 & 8) == 0 ? lVar.n(e2Var) : lVar.K(e2Var) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(996639038, i12, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            j2.d(e2Var, null, false, null, 0L, 0L, 0L, BitmapDescriptorFactory.HUE_RED, lVar, i12 & 14, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e2 e2Var, l lVar, Integer num) {
            a(e2Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<e2, l, Integer, h0> a() {
        return f75382b;
    }
}
