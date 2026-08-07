package hl0;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u009b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012H\u0010\n\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "TSubject", "TContext", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkotlin/Function3;", "Lhl0/e;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "debugMode", "a", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Z)Lhl0/e;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final <TSubject, TContext> e<TSubject, TContext> a(TContext context, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object>> interceptors, TSubject subject, CoroutineContext coroutineContext, boolean z11) {
        s.k(context, "context");
        s.k(interceptors, "interceptors");
        s.k(subject, "subject");
        s.k(coroutineContext, "coroutineContext");
        return (g.a() || z11) ? new a(context, interceptors, subject, coroutineContext) : new n(subject, context, interceptors);
    }
}
