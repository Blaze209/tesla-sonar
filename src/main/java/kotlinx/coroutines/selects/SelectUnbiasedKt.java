package kotlinx.coroutines.selects;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Ljn0/h0;", "builder", "selectUnbiased", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(continuation.get$context());
        lVar.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(continuation);
    }

    private static final <R> Object selectUnbiased$$forInline(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        q.c(3);
        throw null;
    }
}
