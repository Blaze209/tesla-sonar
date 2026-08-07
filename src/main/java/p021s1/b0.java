package p021s1;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ls1/b0;", "Ls1/m;", "Ls1/u;", "", "initialVelocity", "Lkotlin/Function1;", "Ljn0/h0;", "onRemainingDistanceUpdated", "b", "(Ls1/u;FLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ls1/u;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b0 extends m {
    static /* synthetic */ Object c(b0 b0Var, u uVar, float f11, Continuation<? super Float> continuation) {
        return b0Var.b(uVar, f11, Function1.f109452a, continuation);
    }

    @Override // p021s1.m
    default Object a(u uVar, float f11, Continuation<? super Float> continuation) {
        return c(this, uVar, f11, continuation);
    }

    Object b(u uVar, float f11, l<? super Float, h0> lVar, Continuation<? super Float> continuation);
}
