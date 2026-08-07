package io.ktor.utils.io;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/j;", "", "src", "Ljn0/h0;", "b", "(Lio/ktor/utils/io/j;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lio/ktor/utils/io/j;)Z", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final boolean a(j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        return jVar.close(null);
    }

    public static final Object b(j jVar, byte[] bArr, Continuation<? super h0> continuation) {
        Object objL = jVar.l(bArr, 0, bArr.length, continuation);
        return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : h0.f84049a;
    }
}
