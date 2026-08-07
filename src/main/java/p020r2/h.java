package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lr2/h;", "Lr2/f1;", "Lkotlin/Function0;", "Ljn0/h0;", "onNewAwaiters", "<init>", "(Lwn0/a;)V", "", "cause", "g", "(Ljava/lang/Throwable;)V", "", "timeNanos", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "R", "Lkotlin/Function1;", "onFrame", "B", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lwn0/a;", "", "b", "Ljava/lang/Object;", "lock", "c", "Ljava/lang/Throwable;", "failureCause", "", "Lr2/h$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "awaiters", "e", "spareList", "Lr2/g;", "f", "Lr2/g;", "hasAwaitersUnlocked", "", "h", "()Z", "hasAwaiters", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onNewAwaiters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Throwable failureCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> awaiters = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> spareList = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g hasAwaitersUnlocked = new g(0);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr2/h$a;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lwn0/l;Lkotlin/coroutines/Continuation;)V", "timeNanos", "Ljn0/h0;", "b", "(J)V", "a", "Lwn0/l;", "getOnFrame", "()Lwn0/l;", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l<Long, R> onFrame;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Continuation<R> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
            this.onFrame = lVar;
            this.continuation = continuation;
        }

        public final Continuation<R> a() {
            return this.continuation;
        }

        public final void b(long timeNanos) {
            Object objB;
            Continuation<R> continuation = this.continuation;
            try {
                s.Companion companion = s.INSTANCE;
                objB = s.b(this.onFrame.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            continuation.resumeWith(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<R> f106565d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<R> aVar) {
            super(1);
            this.f106565d = aVar;
        }

        public final void a(Throwable th2) {
            Object obj = h.this.lock;
            h hVar = h.this;
            Object obj2 = this.f106565d;
            synchronized (obj) {
                try {
                    hVar.awaiters.remove(obj2);
                    if (hVar.awaiters.isEmpty()) {
                        hVar.hasAwaitersUnlocked.set(0);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    public h(wn0.a<h0> aVar) {
        this.onNewAwaiters = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<a<?>> list = this.awaiters;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Continuation<?> continuationA = list.get(i11).a();
                    s.Companion companion = s.INSTANCE;
                    continuationA.resumeWith(s.b(t.a(cause)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p020r2.f1
    public <R> Object B(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(lVar, cancellableContinuationImpl);
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                s.Companion companion = s.INSTANCE;
                cancellableContinuationImpl.resumeWith(s.b(t.a(th2)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(aVar);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                cancellableContinuationImpl.invokeOnCancellation(new b(aVar));
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th3) {
                        g(th3);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) f1.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) f1.a.b(this, key);
    }

    public final boolean h() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    public final void i(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<a<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).b(timeNanos);
                }
                list.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return f1.a.c(this, key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return f1.a.d(this, coroutineContext);
    }
}
