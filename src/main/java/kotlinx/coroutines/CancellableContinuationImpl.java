package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00152\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J[\u00103\u001a\u0004\u0018\u00010\"\"\u0004\b\u0001\u0010,2\u0006\u0010&\u001a\u00020-2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0015\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b3\u00104JK\u00106\u001a\u0004\u0018\u000105\"\u0004\b\u0001\u0010,2\u0006\u0010.\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\"2 \u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0015\u0018\u00010/H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0002082\b\u0010.\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0015H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\rH\u0001¢\u0006\u0004\b>\u0010\u000fJ\u0017\u0010A\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010E\u001a\u0004\u0018\u00010\"H\u0010¢\u0006\u0004\bC\u0010DJ!\u0010I\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bJ\u0010\u0013J\u0017\u0010M\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u00152\u0006\u0010#\u001a\u00020N2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bO\u0010PJC\u0010R\u001a\u00020\u0015\"\u0004\b\u0001\u0010,2\u001e\u00101\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00150/2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010Q\u001a\u00028\u0001¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00102\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0011\u0010X\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0004\bX\u0010DJ\u000f\u0010Z\u001a\u00020\u0015H\u0000¢\u0006\u0004\bY\u0010<J\u001d\u0010]\u001a\u00020\u00152\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b]\u0010%J-\u0010_\u001a\u00020\u00152\u0006\u0010Q\u001a\u00028\u00002\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010^H\u0016¢\u0006\u0004\b_\u0010`JC\u0010_\u001a\u00020\u0015\"\b\b\u0001\u0010,*\u00028\u00002\u0006\u0010Q\u001a\u00028\u00012 \u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0015\u0018\u00010/H\u0016¢\u0006\u0004\b_\u0010aJ#\u0010c\u001a\u00020\u00152\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010b\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010dJ)\u0010c\u001a\u00020\u00152\u0018\u0010#\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00150^j\u0002`eH\u0016¢\u0006\u0004\bc\u0010fJ\u0017\u0010i\u001a\u00020\u00152\u0006\u0010#\u001a\u00020NH\u0000¢\u0006\u0004\bg\u0010hJI\u0010l\u001a\u00020\u0015\"\u0004\b\u0001\u0010,2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0015\u0018\u00010/H\u0000¢\u0006\u0004\bj\u0010kJ\u000f\u0010n\u001a\u00020\u0015H\u0000¢\u0006\u0004\bm\u0010<J#\u0010\u001e\u001a\u0004\u0018\u00010\"2\u0006\u0010Q\u001a\u00028\u00002\b\u00102\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b\u001e\u0010oJO\u0010\u001e\u001a\u0004\u0018\u00010\"\"\b\b\u0001\u0010,*\u00028\u00002\u0006\u0010Q\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\"2 \u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0015\u0018\u00010/H\u0016¢\u0006\u0004\b\u001e\u0010pJ\u0019\u0010r\u001a\u0004\u0018\u00010\"2\u0006\u0010q\u001a\u00020\u0010H\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\"H\u0016¢\u0006\u0004\bu\u0010%J\u001b\u0010w\u001a\u00020\u0015*\u00020v2\u0006\u0010Q\u001a\u00028\u0000H\u0016¢\u0006\u0004\bw\u0010xJ\u001b\u0010y\u001a\u00020\u0015*\u00020v2\u0006\u0010q\u001a\u00020\u0010H\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010}\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010&\u001a\u0004\u0018\u00010\"H\u0010¢\u0006\u0004\b{\u0010|J\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\"H\u0010¢\u0006\u0004\b~\u0010\u007fJ\u0013\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0013\u0010\u0084\u0001\u001a\u00030\u0081\u0001H\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001R#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\u0088\u0001\u001a\u0002008\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010!R\u0018\u0010\u008f\u0001\u001a\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0083\u0001R\u0017\u0010&\u001a\u0004\u0018\u00010\"8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010DR\u0016\u0010\u0091\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u000fR\u0016\u0010\u0092\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u000fR\u0016\u0010\u0093\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u000fR\u001f\u0010\u0096\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\r\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004R\u0015\u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0099\u00018\u0002X\u0082\u0004R\u0015\u0010\u009b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0099\u00018\u0002X\u0082\u0004¨\u0006\u009c\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "isReusable", "()Z", "", "cause", "cancelLater", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Ljn0/h0;", "block", "callCancelHandlerSafely", "(Lwn0/a;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "callSegmentOnCancellation", "(Lkotlinx/coroutines/internal/Segment;Ljava/lang/Throwable;)V", "trySuspend", "tryResume", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "", "handler", "invokeOnCancellationImpl", "(Ljava/lang/Object;)V", "state", "multipleHandlersError", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "dispatchResume", "(I)V", "R", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILwn0/q;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;)Lkotlinx/coroutines/internal/Symbol;", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "detachChildIfNonReusable", "()V", "initCancellability", "resetStateReusable", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancel", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "Lkotlinx/coroutines/CancelHandler;", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "value", "callOnCancellation", "(Lwn0/q;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "getResult", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "Ljn0/s;", "result", "resumeWith", "Lkotlin/Function1;", "resume", "(Ljava/lang/Object;Lwn0/l;)V", "(Ljava/lang/Object;Lwn0/q;)V", "index", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CompletionHandler;", "(Lwn0/l;)V", "invokeOnCancellationInternal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/CancelHandler;)V", "invokeOnCancellationInternal", "resumeImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;ILwn0/q;)V", "resumeImpl", "detachChild$kotlinx_coroutines_core", "detachChild", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "", "toString", "()Ljava/lang/String;", "nameString", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getParentHandle", "parentHandle", "getStateDebugRepresentation", "stateDebugRepresentation", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final CoroutineContext context;
    private final Continuation<T> delegate;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> continuation, int i11) {
        super(i11);
        this.delegate = continuation;
        this.context = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    private final Void alreadyResumedError(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void callCancelHandlerSafely(wn0.a<h0> block) {
        try {
            block.invoke();
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void callSegmentOnCancellation(Segment<?> segment, Throwable cause) {
        int i11 = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i11 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.onCancellation(i11, cause, get$context());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable cause) {
        if (!isReusable()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        s.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(cause);
    }

    private final void detachChildIfNonReusable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int mode) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, mode);
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof NotCompleted) {
            return "Active";
        }
        return state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) get$context().get(Job.INSTANCE);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(job, false, new ChildContinuation(this), 1, null);
        androidx.concurrent.futures.b.a(_parentHandle$volatile$FU, this, null, disposableHandleInvokeOnCompletion$default);
        return disposableHandleInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Active) {
                if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof CancelHandler) || (obj instanceof Segment)) {
                multipleHandlersError(handler, obj);
            } else {
                if (obj instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(handler, obj);
                    }
                    if (obj instanceof CancelledContinuation) {
                        Throwable th2 = completedExceptionally.cause;
                        if (handler instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) handler, th2);
                            return;
                        } else {
                            s.i(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((Segment) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        multipleHandlersError(handler, obj);
                    }
                    if (handler instanceof Segment) {
                        return;
                    }
                    s.i(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CancelHandler cancelHandler = (CancelHandler) handler;
                    if (completedContinuation.getCancelled()) {
                        callCancelHandler(cancelHandler, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, CompletedContinuation.copy$default(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof Segment) {
                        return;
                    }
                    s.i(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, new CompletedContinuation(obj, (CancelHandler) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean isReusable() {
        if (!DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        s.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core();
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l<Object, h0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l<? super Integer, h0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void multipleHandlersError(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 resume$lambda$13$lambda$12(l lVar, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        lVar.invoke(th2);
        return h0.f84049a;
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i11, q qVar, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i12 & 4) != 0) {
            qVar = null;
        }
        cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core(obj, i11, qVar);
    }

    private final <R> Object resumedState(NotCompleted state, R proposedUpdate, int resumeMode, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof CompletedExceptionally) {
            return proposedUpdate;
        }
        if ((DispatchedTaskKt.isCancellableMode(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof CancelHandler) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof CancelHandler ? (CancelHandler) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i11) {
        this._decisionAndIndex$volatile = i11;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean tryResume() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
        return true;
    }

    private final <R> Symbol tryResumeImpl(R proposedUpdate, Object idempotent, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                return null;
            }
            R r11 = proposedUpdate;
            Object obj3 = idempotent;
            q<? super Throwable, ? super R, ? super CoroutineContext, h0> qVar = onCancellation;
            if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, resumedState((NotCompleted) obj, r11, this.resumeMode, qVar, obj3))) {
                detachChildIfNonReusable();
                return CancellableContinuationImplKt.RESUME_TOKEN;
            }
            proposedUpdate = r11;
            onCancellation = qVar;
            idempotent = obj3;
        }
    }

    private final boolean trySuspend() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i11, PKIFailureInfo.duplicateCertReq + (536870911 & i11)));
        return true;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l<? super Integer, Integer> lVar) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, lVar.invoke(Integer.valueOf(i11)).intValue()));
    }

    public final void callCancelHandler(CancelHandler handler, Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void callOnCancellation(q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation, Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, get$context());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, new CancelledContinuation(this, cause, (obj instanceof CancelHandler) || (obj instanceof Segment))));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            callCancelHandler((CancelHandler) obj, cause);
        } else if (notCompleted instanceof Segment) {
            callSegmentOnCancellation((Segment) obj, cause);
        }
        detachChildIfNonReusable();
        dispatchResume(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof CompletedExceptionally) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.getCancelled()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = cause;
                th2 = th3;
                if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, CompletedContinuation.copy$default(completedContinuation, null, null, null, null, th3, 15, null))) {
                    completedContinuation.invokeHandlers(this, th2);
                    return;
                }
            } else {
                th2 = cause;
                if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            cause = th2;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object token) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // p013kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public CoroutineContext get$context() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(Job parent) {
        return parent.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object state) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        if (!DispatchedTaskKt.isCancellableMode(this.resumeMode) || (job = (Job) get$context().get(Job.INSTANCE)) == null || job.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int index) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + index));
        invokeOnCancellationImpl(segment);
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler handler) {
        invokeOnCancellationImpl(handler);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    protected String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable cause) {
        if (cancelLater(cause)) {
            return;
        }
        cancel(cause);
        detachChildIfNonReusable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        Object obj = _state$volatile$FU.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        _state$volatile$FU.set(this, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, final l<? super Throwable, h0> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation != null ? new q() { // from class: kotlinx.coroutines.a
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CancellableContinuationImpl.resume$lambda$13$lambda$12(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R proposedUpdate, int resumeMode, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                R r11 = proposedUpdate;
                q<? super Throwable, ? super R, ? super CoroutineContext, h0> qVar = onCancellation;
                if (obj instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (qVar != null) {
                            callOnCancellation(qVar, cancelledContinuation.cause, r11);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(r11);
                throw new KotlinNothingValueException();
            }
            R r12 = proposedUpdate;
            int i11 = resumeMode;
            q<? super Throwable, ? super R, ? super CoroutineContext, h0> qVar2 = onCancellation;
            if (androidx.concurrent.futures.b.a(_state$volatile$FU, this, obj, resumedState((NotCompleted) obj, r12, i11, qVar2, null))) {
                detachChildIfNonReusable();
                dispatchResume(i11);
                return;
            } else {
                proposedUpdate = r12;
                resumeMode = i11;
                onCancellation = qVar2;
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t11) {
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t11, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new CompletedExceptionally(th2, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // p013kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        resumeImpl$kotlinx_coroutines_core$default(this, CompletionStateKt.toState(result, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return nameString() + CoreConstants.LEFT_PARENTHESIS_CHAR + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable exception) {
        return tryResumeImpl(new CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R value, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(l<? super Throwable, h0> handler) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(handler));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T value, Object idempotent) {
        return tryResumeImpl(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> Object tryResume(R value, Object idempotent, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation) {
        return tryResumeImpl(value, idempotent, onCancellation);
    }
}
