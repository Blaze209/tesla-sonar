package g40;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import ho0.i;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/Deferred;", "b", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/Deferred;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0085\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\b\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0097\u0001¢\u0006\u0004\b\b\u0010\rJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0096\u0001¢\u0006\u0004\b\b\u0010\u0010J8\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001b\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0018*\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0096\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u000ej\u0002`\u000fH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nH\u0097\u0001¢\u0006\u0004\b!\u0010\"J:\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070%j\u0002`&H\u0097\u0001¢\u0006\u0004\b)\u0010*J*\u0010)\u001a\u00020(2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070%j\u0002`&H\u0096\u0001¢\u0006\u0004\b)\u0010+J\u0010\u0010,\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b,\u0010-J\u001c\u0010/\u001a\u00020.2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020.2\u0006\u00101\u001a\u00020.H\u0096\u0003¢\u0006\u0004\b2\u00103J\u0018\u00102\u001a\u0002042\u0006\u00105\u001a\u000204H\u0097\u0003¢\u0006\u0004\b2\u00106J\u0010\u00107\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b9\u0010-R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u0002040:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u00108R\u0014\u0010?\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u00108R\u0014\u0010@\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u00108R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010M\u001a\u0004\u0018\u0001048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"g40/b$a", "Lkotlinx/coroutines/Deferred;", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "Ljn0/h0;", "cancel", "()V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLwn0/l;)Lkotlinx/coroutines/DisposableHandle;", "(Lwn0/l;)Lkotlinx/coroutines/DisposableHandle;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/Job;", "other", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "start", "()Z", AwaitAction.ACTION_TYPE, "Lho0/i;", "getChildren", "()Lho0/i;", "children", "isActive", "isCancelled", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements Deferred<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ CompletableDeferred<T> f67327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow<T> f67328b;

        /* JADX WARN: Multi-variable type inference failed */
        a(CompletableDeferred<T> completableDeferred, Flow<? extends T> flow) {
            this.f67328b = flow;
            this.f67327a = completableDeferred;
        }

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        public ChildHandle attachChild(ChildJob child) {
            s.k(child, "child");
            return this.f67327a.attachChild(child);
        }

        @Override // kotlinx.coroutines.Deferred
        public Object await(Continuation<? super T> continuation) {
            return FlowKt.first(FlowKt.filterNotNull(this.f67328b), continuation);
        }

        @Override // kotlinx.coroutines.Job
        @jn0.e
        public /* synthetic */ void cancel() {
            this.f67327a.cancel();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public <R> R fold(R initial, p<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            s.k(operation, "operation");
            return (R) this.f67327a.fold(initial, operation);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            s.k(key, "key");
            return (E) this.f67327a.get(key);
        }

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        public CancellationException getCancellationException() {
            return this.f67327a.getCancellationException();
        }

        @Override // kotlinx.coroutines.Job
        public i<Job> getChildren() {
            return this.f67327a.getChildren();
        }

        @Override // kotlinx.coroutines.Deferred
        @ExperimentalCoroutinesApi
        public T getCompleted() {
            return this.f67327a.getCompleted();
        }

        @Override // kotlinx.coroutines.Deferred
        @ExperimentalCoroutinesApi
        public Throwable getCompletionExceptionOrNull() {
            return this.f67327a.getCompletionExceptionOrNull();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public CoroutineContext.Key<?> getKey() {
            return this.f67327a.getKey();
        }

        @Override // kotlinx.coroutines.Deferred
        public SelectClause1<T> getOnAwait() {
            return this.f67327a.getOnAwait();
        }

        @Override // kotlinx.coroutines.Job
        public SelectClause0 getOnJoin() {
            return this.f67327a.getOnJoin();
        }

        @Override // kotlinx.coroutines.Job
        public Job getParent() {
            return this.f67327a.getParent();
        }

        @Override // kotlinx.coroutines.Job
        public DisposableHandle invokeOnCompletion(l<? super Throwable, h0> handler) {
            s.k(handler, "handler");
            return this.f67327a.invokeOnCompletion(handler);
        }

        @Override // kotlinx.coroutines.Job
        public boolean isActive() {
            return this.f67327a.isActive();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCancelled() {
            return this.f67327a.isCancelled();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCompleted() {
            return this.f67327a.isCompleted();
        }

        @Override // kotlinx.coroutines.Job
        public Object join(Continuation<? super h0> continuation) {
            return this.f67327a.join(continuation);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            s.k(key, "key");
            return this.f67327a.minusKey(key);
        }

        @Override // p013kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext context) {
            s.k(context, "context");
            return this.f67327a.plus(context);
        }

        @Override // kotlinx.coroutines.Job
        public boolean start() {
            return this.f67327a.start();
        }

        @Override // kotlinx.coroutines.Job
        public void cancel(CancellationException cause) {
            this.f67327a.cancel(cause);
        }

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, l<? super Throwable, h0> handler) {
            s.k(handler, "handler");
            return this.f67327a.invokeOnCompletion(onCancelling, invokeImmediately, handler);
        }

        @Override // kotlinx.coroutines.Job
        @jn0.e
        public Job plus(Job other) {
            s.k(other, "other");
            return this.f67327a.plus(other);
        }

        @Override // kotlinx.coroutines.Job
        @jn0.e
        public /* synthetic */ boolean cancel(Throwable cause) {
            return this.f67327a.cancel(cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Deferred<T> b(Flow<? extends T> flow) {
        return new a(CompletableDeferredKt.CompletableDeferred$default(null, 1, null), flow);
    }
}
