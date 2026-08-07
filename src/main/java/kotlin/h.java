package kotlin;

import jn0.h0;
import p007h2.j0;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r1.ContextMenuState;
import r1.j;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh2/h0;", "manager", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lh2/h0;Lwn0/p;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f15589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContextMenuState contextMenuState) {
            super(0);
            this.f15589c = contextMenuState;
        }

        public final void b() {
            j.a(this.f15589c);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p007h2.h0 f15590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f15591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15592e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p007h2.h0 h0Var, p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f15590c = h0Var;
            this.f15591d = pVar;
            this.f15592e = i11;
        }

        public final void a(l lVar, int i11) {
            h.a(this.f15590c, this.f15591d, lVar, k2.a(this.f15592e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p007h2.h0 h0Var, p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        int i12;
        p<? super l, ? super Integer, h0> pVar2;
        l lVarV = lVar.v(-1985516685);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(h0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
            pVar2 = pVar;
        } else {
            if (o.J()) {
                o.S(-1985516685, i12, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object objI = lVarV.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new ContextMenuState(null, 1, null);
                lVarV.B(objI);
            }
            ContextMenuState contextMenuState = (ContextMenuState) objI;
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new a(contextMenuState);
                lVarV.B(objI2);
            }
            pVar2 = pVar;
            r1.a.b(contextMenuState, (wn0.a) objI2, j0.a(h0Var, contextMenuState), null, h0Var.E(), pVar2, lVarV, ((i12 << 12) & 458752) | 54, 8);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(h0Var, pVar2, i11));
        }
    }
}
