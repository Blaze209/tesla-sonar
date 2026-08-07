package w1;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.d0;
import p020r2.n3;
import p020r2.y3;
import p024x1.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw1/a0;", "state", "Lkotlin/Function1;", "Lw1/x;", "Ljn0/h0;", "content", "Lkotlin/Function0;", "Lw1/l;", "a", "(Lw1/a0;Lwn0/l;Lr2/l;I)Lwn0/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw1/j;", "b", "()Lw1/j;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<j> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<wn0.l<x, h0>> f120364c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y3<? extends wn0.l<? super x, h0>> y3Var) {
            super(0);
            this.f120364c = y3Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(this.f120364c.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw1/m;", "b", "()Lw1/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<j> f120365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0 f120366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.a f120367e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y3<j> y3Var, a0 a0Var, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f120365c = y3Var;
            this.f120366d = a0Var;
            this.f120367e = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            j value = this.f120365c.getValue();
            return new m(this.f120366d, value, this.f120367e, new k0(this.f120366d.z(), value));
        }
    }

    public static final wn0.a<l> a(a0 a0Var, wn0.l<? super x, h0> lVar, p020r2.l lVar2, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-343736148, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        y3 y3VarO = n3.o(lVar, lVar2, (i11 >> 3) & 14);
        boolean z11 = (((i11 & 14) ^ 6) > 4 && lVar2.n(a0Var)) || (i11 & 6) == 4;
        Object objI = lVar2.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new d0(n3.d(n3.n(), new c(n3.d(n3.n(), new b(y3VarO)), a0Var, new androidx.compose.foundation.lazy.a()))) { // from class: w1.n.a
                @Override // p013kotlin.jvm.internal.d0, co0.n
                public Object get() {
                    return ((y3) this.receiver).getValue();
                }
            };
            lVar2.B(objI);
        }
        co0.n nVar = (co0.n) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return nVar;
    }
}
