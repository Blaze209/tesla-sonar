package p020r2;

import java.util.Arrays;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0014\u001a\u00020\u00122\u001a\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\"\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0017\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lr2/m3;", "policy", "Lkotlin/Function0;", "defaultFactory", "Lr2/g2;", "c", "(Lr2/m3;Lwn0/a;)Lr2/g2;", "f", "(Lwn0/a;)Lr2/g2;", "Lkotlin/Function1;", "Lr2/v;", "defaultComputation", "e", "(Lwn0/l;)Lr2/g2;", "", "Lr2/h2;", "values", "Ljn0/h0;", "content", "b", "([Lr2/h2;Lwn0/p;Lr2/l;I)V", "value", "a", "(Lr2/h2;Lwn0/p;Lr2/l;I)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h2<?>[] f106850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f106851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f106852e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h2<?>[] h2VarArr, p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f106850c = h2VarArr;
            this.f106851d = pVar;
            this.f106852e = i11;
        }

        public final void a(l lVar, int i11) {
            h2<?>[] h2VarArr = this.f106850c;
            w.b((h2[]) Arrays.copyOf(h2VarArr, h2VarArr.length), this.f106851d, lVar, k2.a(this.f106852e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h2<?> f106853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f106854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f106855e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h2<?> h2Var, p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f106853c = h2Var;
            this.f106854d = pVar;
            this.f106855e = i11;
        }

        public final void a(l lVar, int i11) {
            w.a(this.f106853c, this.f106854d, lVar, k2.a(this.f106855e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(h2<?> h2Var, p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        l lVarV = lVar.v(-1350970552);
        if (o.J()) {
            o.S(-1350970552, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        lVarV.O(h2Var);
        pVar.invoke(lVarV, Integer.valueOf((i11 >> 3) & 14));
        lVarV.e();
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(h2Var, pVar, i11));
        }
    }

    public static final void b(h2<?>[] h2VarArr, p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        l lVarV = lVar.v(-1390796515);
        if (o.J()) {
            o.S(-1390796515, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        lVarV.N(h2VarArr);
        pVar.invoke(lVarV, Integer.valueOf((i11 >> 3) & 14));
        lVarV.Q();
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(h2VarArr, pVar, i11));
        }
    }

    public static final <T> g2<T> c(m3<T> m3Var, wn0.a<? extends T> aVar) {
        return new m0(m3Var, aVar);
    }

    public static /* synthetic */ g2 d(m3 m3Var, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            m3Var = n3.q();
        }
        return c(m3Var, aVar);
    }

    public static final <T> g2<T> e(l<? super v, ? extends T> lVar) {
        return new c0(lVar);
    }

    public static final <T> g2<T> f(wn0.a<? extends T> aVar) {
        return new z3(aVar);
    }
}
