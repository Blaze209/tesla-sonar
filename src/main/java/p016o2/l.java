package p016o2;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f95976a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<g0, p020r2.l, Integer, h0> f95977b = c.c(818736383, false, a.f95978c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo2/g0;", "it", "Ljn0/h0;", "a", "(Lo2/g0;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f95978c = new a();

        a() {
            super(3);
        }

        public final void a(g0 g0Var, p020r2.l lVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (lVar.n(g0Var) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(818736383, i12, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
            }
            k0.a(g0Var, null, false, null, 0L, 0L, 0L, 0L, 0L, lVar, i12 & 14, 510);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<g0, p020r2.l, Integer, h0> a() {
        return f95977b;
    }
}
