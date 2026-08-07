package androidx.room;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/u;", "", "sql", "Ljn0/h0;", "b", "(Landroidx/room/u;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u0 {
    public static final Object b(u uVar, String str, Continuation<? super jn0.h0> continuation) {
        Object objD = uVar.d(str, new wn0.l() { // from class: androidx.room.t0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u0.c((ya.d) obj));
            }
        }, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(ya.d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.I1();
    }
}
