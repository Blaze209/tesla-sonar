package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.internal.ThreadContextKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.q;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001a\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001eH\u0080\u0010¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010&\u001a\u0004\u0018\u00010!*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "newCoroutineContext", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "hasCopyableElements", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "foldCopies", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "withCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lwn0/a;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuation", "withContinuationContext", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lwn0/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/UndispatchedCoroutine;", "updateUndispatchedCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "undispatchedCompletion", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/UndispatchedCoroutine;", "", "DEBUG_THREAD_NAME_SEPARATOR", "Ljava/lang/String;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z11) {
        boolean zHasCopyableElements = hasCopyableElements(coroutineContext);
        boolean zHasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final n0 n0Var = new n0();
        n0Var.f86529a = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new p() { // from class: kotlinx.coroutines.c
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return CoroutineContextKt.foldCopies$lambda$1(n0Var, z11, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zHasCopyableElements2) {
            n0Var.f86529a = ((CoroutineContext) n0Var.f86529a).fold(emptyCoroutineContext, new p() { // from class: kotlinx.coroutines.d
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContextKt.foldCopies$lambda$2((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) n0Var.f86529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext foldCopies$lambda$1(n0 n0Var, boolean z11, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof CopyableThreadContextElement)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) n0Var.f86529a).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z11 ? ((CopyableThreadContextElement) element).copyForChild() : (CopyableThreadContextElement) element);
        }
        n0Var.f86529a = ((CoroutineContext) n0Var.f86529a).minusKey(element.getKey());
        return coroutineContext.plus(((CopyableThreadContextElement) element).mergeForChild(element2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext foldCopies$lambda$2(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element).copyForChild()) : coroutineContext.plus(element);
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean hasCopyableElements(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new p() { // from class: kotlinx.coroutines.b
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z11, CoroutineContext.Element element) {
        return z11 || (element instanceof CopyableThreadContextElement);
    }

    @ExperimentalCoroutinesApi
    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextFoldCopies == Dispatchers.getDefault() || coroutineContextFoldCopies.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextFoldCopies : coroutineContextFoldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((CoroutineStackFrame) continuation);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[DONT_GENERATE] */
    public static final <T> T withContinuationContext(Continuation<?> continuation, Object obj, wn0.a<? extends T> aVar) {
        CoroutineContext coroutineContext = continuation.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(continuation, coroutineContext, objUpdateThreadContext) : null;
        try {
            return aVar.invoke();
        } finally {
            q.b(1);
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            }
            q.a(1);
        }
    }

    public static final <T> T withCoroutineContext(CoroutineContext coroutineContext, Object obj, wn0.a<? extends T> aVar) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return aVar.invoke();
        } finally {
            q.b(1);
            ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            q.a(1);
        }
    }

    @InternalCoroutinesApi
    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }
}
