package ra;

import kotlinx.coroutines.ThreadContextElementKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t*\u001c\u0010\n\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "value", "Lkotlin/coroutines/CoroutineContext$Element;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlin/coroutines/CoroutineContext$Element;", "", "b", "()J", "ThreadLocal", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final <T> CoroutineContext.Element a(ThreadLocal<T> threadLocal, T t11) {
        s.k(threadLocal, "<this>");
        return ThreadContextElementKt.asContextElement(threadLocal, t11);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }
}
