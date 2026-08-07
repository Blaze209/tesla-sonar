package io.ktor.utils.io;

import java.nio.ByteBuffer;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u001bH¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lio/ktor/utils/io/j;", "", "", "src", "", "offset", "length", "Ljn0/h0;", "l", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "block", "f", "(ILwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lll0/k;", "packet", "j", "(Lll0/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "flush", "()V", "Lll0/a;", "k", "(Lll0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "()Z", "autoFlush", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(j jVar, int i11, wn0.l lVar, Continuation continuation, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i12 & 1) != 0) {
                i11 = 1;
            }
            return jVar.f(i11, lVar, continuation);
        }
    }

    boolean close(Throwable cause);

    boolean e();

    Object f(int i11, wn0.l<? super ByteBuffer, h0> lVar, Continuation<? super h0> continuation);

    void flush();

    Object j(ll0.k kVar, Continuation<? super h0> continuation);

    Object k(ll0.a aVar, Continuation<? super h0> continuation);

    Object l(byte[] bArr, int i11, int i12, Continuation<? super h0> continuation);
}
