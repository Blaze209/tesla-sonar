package u3;

import j3.g;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import w4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lu3/a;", "", "Lj3/g;", "available", "Lu3/e;", "source", "L1", "(JI)J", "consumed", "n0", "(JJI)J", "Lw4/y;", "E0", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object j1(a aVar, long j11, long j12, Continuation<? super y> continuation) {
        return y.b(y.INSTANCE.a());
    }

    static /* synthetic */ Object n1(a aVar, long j11, Continuation<? super y> continuation) {
        return y.b(y.INSTANCE.a());
    }

    default Object E0(long j11, Continuation<? super y> continuation) {
        return n1(this, j11, continuation);
    }

    default long L1(long available, int source) {
        return g.INSTANCE.c();
    }

    default Object V(long j11, long j12, Continuation<? super y> continuation) {
        return j1(this, j11, j12, continuation);
    }

    default long n0(long consumed, long available, int source) {
        return g.INSTANCE.c();
    }
}
