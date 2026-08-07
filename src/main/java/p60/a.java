package p60;

import jn0.h0;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: p60.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2149a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2149a(int i11) {
            super(2);
            this.f101176c = i11;
        }

        public final void a(l lVar, int i11) {
            a.a(lVar, k2.a(this.f101176c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(l lVar, int i11) {
        l lVarV = lVar.v(-1855412368);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1855412368, i11, -1, "com.stripe.android.link.ui.verification.VerificationScreen (VerificationScreen.kt:6)");
            }
            v2.b("VerificationScreen", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVarV, 6, 0, 131070);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C2149a(i11));
        }
    }
}
