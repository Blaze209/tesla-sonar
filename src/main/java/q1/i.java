package q1;

import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "onDraw", "a", "(Landroidx/compose/ui/d;Lwn0/l;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f104267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<m3.f, jn0.h0> f104268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f104269e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.d dVar, wn0.l<? super m3.f, jn0.h0> lVar, int i11) {
            super(2);
            this.f104267c = dVar;
            this.f104268d = lVar;
            this.f104269e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.a(this.f104267c, this.f104268d, lVar, k2.a(this.f104269e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, wn0.l<? super m3.f, jn0.h0> lVar, p020r2.l lVar2, int i11) {
        int i12;
        p020r2.l lVarV = lVar2.v(-932836462);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(lVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-932836462, i12, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            v1.i0.a(androidx.compose.ui.draw.b.b(dVar, lVar), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar, lVar, i11));
        }
    }
}
