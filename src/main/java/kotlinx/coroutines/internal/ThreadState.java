package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import kotlinx.coroutines.ThreadContextElement;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Lkotlinx/coroutines/ThreadContextElement;", "element", "value", "Ljn0/h0;", "append", "(Lkotlinx/coroutines/ThreadContextElement;Ljava/lang/Object;)V", "restore", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "", "values", "[Ljava/lang/Object;", "elements", "[Lkotlinx/coroutines/ThreadContextElement;", IntegerTokenConverter.CONVERTER_KEY, "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ThreadState {
    public final CoroutineContext context;
    private final ThreadContextElement<Object>[] elements;
    private int i;
    private final Object[] values;

    public ThreadState(CoroutineContext coroutineContext, int i11) {
        this.context = coroutineContext;
        this.values = new Object[i11];
        this.elements = new ThreadContextElement[i11];
    }

    public final void append(ThreadContextElement<?> element, Object value) {
        Object[] objArr = this.values;
        int i11 = this.i;
        objArr[i11] = value;
        ThreadContextElement<Object>[] threadContextElementArr = this.elements;
        this.i = i11 + 1;
        s.i(element, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i11] = element;
    }

    public final void restore(CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            ThreadContextElement<Object> threadContextElement = this.elements[length];
            s.h(threadContextElement);
            threadContextElement.restoreThreadContext(context, this.values[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }
}
