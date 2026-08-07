package kotlinx.coroutines.internal;

import kotlinx.coroutines.CoroutineDispatcher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Ljn0/h0;", "checkParallelism", "(I)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "name", "namedOrThis", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i11) {
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i11).toString());
    }

    public static final CoroutineDispatcher namedOrThis(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
