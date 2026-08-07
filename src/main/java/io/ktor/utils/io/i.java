package io.ktor.utils.io;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/g;", "", "a", "(Lio/ktor/utils/io/g;)Z", "", "c", "(Lio/ktor/utils/io/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dst", "", DateTokenConverter.CONVERTER_KEY, "(Lio/ktor/utils/io/g;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/j;", "b", "(Lio/ktor/utils/io/g;Lio/ktor/utils/io/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final boolean a(g gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<this>");
        return gVar.cancel(null);
    }

    public static final Object b(g gVar, j jVar, Continuation<? super Long> continuation) {
        return h.b(gVar, jVar, Long.MAX_VALUE, continuation);
    }

    public static final Object c(g gVar, Continuation<? super Long> continuation) {
        return gVar.c(Long.MAX_VALUE, continuation);
    }

    public static final Object d(g gVar, byte[] bArr, Continuation<? super Integer> continuation) {
        return gVar.i(bArr, 0, bArr.length, continuation);
    }
}
