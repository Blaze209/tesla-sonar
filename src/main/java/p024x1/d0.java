package p024x1;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.h2;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.l;
import wn0.p;
import z3.u0;
import z3.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "index", "Lx1/e0;", "pinnedItemList", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Ljava/lang/Object;ILx1/e0;Lwn0/p;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f122549c;

        /* JADX INFO: renamed from: x1.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x1/d0$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2634a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f122550a;

            public C2634a(c0 c0Var) {
                this.f122550a = c0Var;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f122550a.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var) {
            super(1);
            this.f122549c = c0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            return new C2634a(this.f122549c);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f122551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f122552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f122553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f122554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f122555g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i11, e0 e0Var, p<? super p020r2.l, ? super Integer, h0> pVar, int i12) {
            super(2);
            this.f122551c = obj;
            this.f122552d = i11;
            this.f122553e = e0Var;
            this.f122554f = pVar;
            this.f122555g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d0.a(this.f122551c, this.f122552d, this.f122553e, this.f122554f, lVar, k2.a(this.f122555g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(Object obj, int i11, e0 e0Var, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-2079116560);
        if ((i12 & 6) == 0) {
            i13 = (lVarV.K(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= lVarV.r(i11) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(e0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= lVarV.K(pVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-2079116560, i13, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zN = lVarV.n(obj) | lVarV.n(e0Var);
            Object objI = lVarV.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new c0(obj, e0Var);
                lVarV.B(objI);
            }
            c0 c0Var = (c0) objI;
            c0Var.g(i11);
            c0Var.i((u0) lVarV.U(v0.a()));
            boolean zN2 = lVarV.n(c0Var);
            Object objI2 = lVarV.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c0Var);
                lVarV.B(objI2);
            }
            Function0.c(c0Var, (l) objI2, lVarV, 0);
            w.a(v0.a().d(c0Var), pVar, lVarV, ((i13 >> 6) & 112) | h2.f106566i);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(obj, i11, e0Var, pVar, i12));
        }
    }
}
