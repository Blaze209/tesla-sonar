package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001 B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/l0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "r0", "()Ljava/lang/Runnable;", "Ljn0/h0;", "t0", "()V", "", "frameTimeNanos", "s0", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "u0", "(Landroid/view/Choreographer$FrameCallback;)V", "w0", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "b", "Landroid/view/Choreographer;", "k0", "()Landroid/view/Choreographer;", "c", "Landroid/os/Handler;", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "lock", "Lkotlin/collections/m;", "e", "Lkotlin/collections/m;", "toRunTrampolined", "", "f", "Ljava/util/List;", "toRunOnFrame", "g", "spareToRunOnFrame", "", "h", "Z", "scheduledTrampolineDispatch", IntegerTokenConverter.CONVERTER_KEY, "scheduledFrameDispatch", "androidx/compose/ui/platform/l0$d", "j", "Landroidx/compose/ui/platform/l0$d;", "dispatchCallback", "Lr2/f1;", "k", "Lr2/f1;", "n0", "()Lr2/f1;", "frameClock", "l", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5839m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy<CoroutineContext> f5840n = jn0.m.b(a.f5852c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ThreadLocal<CoroutineContext> f5841o = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.collections.m<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d dispatchCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p020r2.f1 frameClock;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "b", "()Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<CoroutineContext> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5852c = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.l0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0124a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Choreographer>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5853n;

            C0124a(Continuation<? super C0124a> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new C0124a(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5853n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return Choreographer.getInstance();
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Choreographer> continuation) {
                return ((C0124a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            l0 l0Var = new l0(m0.b() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new C0124a(null)), q5.i.a(Looper.getMainLooper()), null);
            return l0Var.plus(l0Var.getFrameClock());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/l0$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends ThreadLocal<CoroutineContext> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            l0 l0Var = new l0(choreographer, q5.i.a(looperMyLooper), null);
            return l0Var.plus(l0Var.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.l0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/l0$c;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/Lazy;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            if (m0.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) l0.f5841o.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext b() {
            return (CoroutineContext) l0.f5840n.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/l0$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            l0.this.handler.removeCallbacks(this);
            l0.this.t0();
            l0.this.s0(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.t0();
            Object obj = l0.this.lock;
            l0 l0Var = l0.this;
            synchronized (obj) {
                try {
                    if (l0Var.toRunOnFrame.isEmpty()) {
                        l0Var.getChoreographer().removeFrameCallback(this);
                        l0Var.scheduledFrameDispatch = false;
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ l0(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable r0() {
        Runnable runnableR;
        synchronized (this.lock) {
            runnableR = this.toRunTrampolined.r();
        }
        return runnableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        boolean z11;
        do {
            Runnable runnableR0 = r0();
            while (runnableR0 != null) {
                runnableR0.run();
                runnableR0 = r0();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z11 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo574dispatch(CoroutineContext context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final p020r2.f1 getFrameClock() {
        return this.frameClock;
    }

    public final void u0(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w0(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    private l0(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new p013kotlin.collections.m<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new d();
        this.frameClock = new n0(choreographer, this);
    }
}
