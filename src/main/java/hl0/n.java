package hl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Ba\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012H\u0010\f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b \u0010!RV\u0010\f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u001b\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0016R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lhl0/n;", "", "TSubject", "TContext", "Lhl0/e;", "initial", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "", DevicePublicKeyStringDef.DIRECT, "l", "(Z)Z", "Ljn0/s;", "result", "m", "(Ljava/lang/Object;)V", "j", "()V", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subject", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "continuation", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)V", "b", "Ljava/util/List;", "Lkotlin/coroutines/Continuation;", "getContinuation$ktor_utils", "()Lkotlin/coroutines/Continuation;", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "n", "", "e", "[Lkotlin/coroutines/Continuation;", "suspensions", "", "f", "I", "lastSuspensionIndex", "g", "index", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n<TSubject, TContext> extends e<TSubject, TContext> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> blocks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Continuation<h0> continuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TSubject subject;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Continuation<TSubject>[] suspensions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastSuspensionIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int index;

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0015\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"hl0/n$a", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lio/ktor/util/CoroutineStackFrame;", "a", "()Lkotlin/coroutines/Continuation;", "Ljava/lang/StackTraceElement;", "Lio/ktor/util/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ljn0/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "I", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentIndex", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Continuation<h0>, CoroutineStackFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int currentIndex = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<TSubject, TContext> f73162b;

        a(n<TSubject, TContext> nVar) {
            this.f73162b = nVar;
        }

        private final Continuation<?> a() {
            if (this.currentIndex == Integer.MIN_VALUE) {
                this.currentIndex = ((n) this.f73162b).lastSuspensionIndex;
            }
            if (this.currentIndex < 0) {
                this.currentIndex = Integer.MIN_VALUE;
                return null;
            }
            try {
                Continuation<?>[] continuationArr = ((n) this.f73162b).suspensions;
                int i11 = this.currentIndex;
                Continuation<?> continuation = continuationArr[i11];
                if (continuation == null) {
                    return m.f73154a;
                }
                this.currentIndex = i11 - 1;
                return continuation;
            } catch (Throwable unused) {
                return m.f73154a;
            }
        }

        @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            Continuation<?> continuationA = a();
            if (continuationA instanceof CoroutineStackFrame) {
                return (CoroutineStackFrame) continuationA;
            }
            return null;
        }

        @Override // p013kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext get$context() {
            Continuation continuation = ((n) this.f73162b).suspensions[((n) this.f73162b).lastSuspensionIndex];
            if (continuation != this && continuation != null) {
                return continuation.get$context();
            }
            int i11 = ((n) this.f73162b).lastSuspensionIndex - 1;
            while (i11 >= 0) {
                int i12 = i11 - 1;
                Continuation continuation2 = ((n) this.f73162b).suspensions[i11];
                if (continuation2 != this && continuation2 != null) {
                    return continuation2.get$context();
                }
                i11 = i12;
            }
            throw new IllegalStateException("Not started");
        }

        @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            return null;
        }

        @Override // p013kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            if (!s.g(result)) {
                this.f73162b.l(false);
                return;
            }
            n<TSubject, TContext> nVar = this.f73162b;
            Throwable thE = s.e(result);
            p013kotlin.jvm.internal.s.h(thE);
            nVar.m(s.b(t.a(thE)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(TSubject initial, TContext context, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object>> blocks) {
        super(context);
        p013kotlin.jvm.internal.s.k(initial, "initial");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(blocks, "blocks");
        this.blocks = blocks;
        this.continuation = new a(this);
        this.subject = initial;
        this.suspensions = new Continuation[blocks.size()];
        this.lastSuspensionIndex = -1;
    }

    private final void j() {
        int i11 = this.lastSuspensionIndex;
        if (i11 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<TSubject>[] continuationArr = this.suspensions;
        this.lastSuspensionIndex = i11 - 1;
        continuationArr[i11] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(boolean direct) {
        int i11;
        do {
            i11 = this.index;
            if (i11 == this.blocks.size()) {
                if (direct) {
                    return true;
                }
                s.Companion companion = s.INSTANCE;
                m(s.b(k()));
                return false;
            }
            this.index = i11 + 1;
            try {
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                m(s.b(t.a(th2)));
                return false;
            }
        } while (this.blocks.get(i11).invoke(this, k(), this.continuation) != IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Object result) {
        int i11 = this.lastSuspensionIndex;
        if (i11 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<TSubject> continuation = this.suspensions[i11];
        p013kotlin.jvm.internal.s.h(continuation);
        Continuation<TSubject>[] continuationArr = this.suspensions;
        int i12 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i12 - 1;
        continuationArr[i12] = null;
        if (!s.g(result)) {
            continuation.resumeWith(result);
            return;
        }
        Throwable thE = s.e(result);
        p013kotlin.jvm.internal.s.h(thE);
        continuation.resumeWith(s.b(t.a(k.a(thE, continuation))));
    }

    @Override // hl0.e
    public Object a(TSubject tsubject, Continuation<? super TSubject> continuation) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        n(tsubject);
        if (this.lastSuspensionIndex < 0) {
            return c(continuation);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // hl0.e
    public Object c(Continuation<? super TSubject> continuation) {
        Object coroutine_suspended;
        if (this.index == this.blocks.size()) {
            coroutine_suspended = k();
        } else {
            i(IntrinsicsKt.intercepted(continuation));
            if (l(true)) {
                j();
                coroutine_suspended = k();
            } else {
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // hl0.e
    public Object d(TSubject tsubject, Continuation<? super TSubject> continuation) {
        n(tsubject);
        return c(continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.continuation.get$context();
    }

    public final void i(Continuation<? super TSubject> continuation) {
        p013kotlin.jvm.internal.s.k(continuation, "continuation");
        Continuation<TSubject>[] continuationArr = this.suspensions;
        int i11 = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i11;
        continuationArr[i11] = continuation;
    }

    public TSubject k() {
        return this.subject;
    }

    public void n(TSubject tsubject) {
        p013kotlin.jvm.internal.s.k(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
