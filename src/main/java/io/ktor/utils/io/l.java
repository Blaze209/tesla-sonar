package io.ktor.utils.io;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u000f\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0014J\"\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0017J8\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0003¢\u0006\u0004\b\"\u0010#J\u0014\u0010$\u001a\u00060\u0015j\u0002`\u0016H\u0097\u0001¢\u0006\u0004\b$\u0010%J>\u0010,\u001a\u00020+2\b\b\u0002\u0010&\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\u0018\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0(j\u0002`)H\u0097\u0001¢\u0006\u0004\b,\u0010-J*\u0010,\u001a\u00020+2\u0018\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0(j\u0002`)H\u0096\u0001¢\u0006\u0004\b,\u0010.J\u0013\u0010/\u001a\u00020\u000eH\u0096Aø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001c\u00102\u001a\u0002012\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002012\u0006\u00104\u001a\u000201H\u0096\u0003¢\u0006\u0004\b5\u00106J\u0018\u00105\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0003H\u0097\u0003¢\u0006\u0004\b5\u00108J\u0010\u00109\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010:R\u0014\u0010H\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0014\u0010I\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010:R\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lio/ktor/utils/io/l;", "", "Lio/ktor/utils/io/t;", "Lkotlinx/coroutines/Job;", "delegate", "Lio/ktor/utils/io/c;", "channel", "<init>", "(Lkotlinx/coroutines/Job;Lio/ktor/utils/io/c;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "Ljn0/h0;", "cancel", "()V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLwn0/l;)Lkotlinx/coroutines/DisposableHandle;", "(Lwn0/l;)Lkotlinx/coroutines/DisposableHandle;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "other", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "start", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/coroutines/Job;", "b", "Lio/ktor/utils/io/c;", "()Lio/ktor/utils/io/c;", "Lho0/i;", "getChildren", "()Lho0/i;", "children", "isActive", "isCancelled", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l implements Job, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Job delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c channel;

    public l(Job delegate, c channel) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(channel, "channel");
        this.delegate = delegate;
        this.channel = channel;
    }

    @Override // io.ktor.utils.io.t
    /* JADX INFO: renamed from: a, reason: from getter */
    public c getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public ChildHandle attachChild(ChildJob child) {
        p013kotlin.jvm.internal.s.k(child, "child");
        return this.delegate.attachChild(child);
    }

    @Override // kotlinx.coroutines.Job
    @jn0.e
    public /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, wn0.p<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        p013kotlin.jvm.internal.s.k(operation, "operation");
        return (R) this.delegate.fold(initial, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return (E) this.delegate.get(key);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public CancellationException getCancellationException() {
        return this.delegate.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    public ho0.i<Job> getChildren() {
        return this.delegate.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.delegate.getKey();
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        return this.delegate.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return this.delegate.getParent();
    }

    @Override // kotlinx.coroutines.Job
    public DisposableHandle invokeOnCompletion(wn0.l<? super Throwable, h0> handler) {
        p013kotlin.jvm.internal.s.k(handler, "handler");
        return this.delegate.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.delegate.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.delegate.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public Object join(Continuation<? super h0> continuation) {
        return this.delegate.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this.delegate.minusKey(key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return this.delegate.plus(context);
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.delegate.start();
    }

    public String toString() {
        return "ChannelJob[" + this.delegate + ']';
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cause) {
        this.delegate.cancel(cause);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, wn0.l<? super Throwable, h0> handler) {
        p013kotlin.jvm.internal.s.k(handler, "handler");
        return this.delegate.invokeOnCompletion(onCancelling, invokeImmediately, handler);
    }

    @Override // kotlinx.coroutines.Job
    @jn0.e
    public Job plus(Job other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return this.delegate.plus(other);
    }

    @Override // kotlinx.coroutines.Job
    @jn0.e
    public /* synthetic */ boolean cancel(Throwable cause) {
        return this.delegate.cancel(cause);
    }
}
