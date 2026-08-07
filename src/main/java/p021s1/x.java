package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import q1.h0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Ls1/x;", "", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", DateTokenConverter.CONVERTER_KEY, "(F)F", "", "a", "()Z", "isScrollInProgress", "c", "canScrollForward", "e", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x {
    static /* synthetic */ Object f(x xVar, h0 h0Var, p pVar, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i11 & 1) != 0) {
            h0Var = h0.Default;
        }
        return xVar.b(h0Var, pVar, continuation);
    }

    boolean a();

    Object b(h0 h0Var, p<? super u, ? super Continuation<? super jn0.h0>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation);

    default boolean c() {
        return true;
    }

    float d(float delta);

    default boolean e() {
        return true;
    }
}
