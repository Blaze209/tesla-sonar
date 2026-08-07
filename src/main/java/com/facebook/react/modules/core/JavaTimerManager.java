package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import ezvcard.property.Gender;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import jn.j;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0005583\u001a\u001cB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ'\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0018H\u0017¢\u0006\u0004\b*\u0010\u001bJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020!H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001fH\u0000¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010K\u001a\u00060HR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u00060LR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010S\u001a\b\u0018\u00010PR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010+\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010UR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020>0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lwn/d;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "Lco/c;", "javaScriptTimerExecutor", "Lcom/facebook/react/modules/core/b;", "reactChoreographer", "Lpn/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lco/c;Lcom/facebook/react/modules/core/b;Lpn/e;)V", "Ljn0/h0;", "w", "()V", "v", "y", "s", "z", "r", "onHostPause", "onHostDestroy", "onHostResume", "", "taskId", "b", "(I)V", "a", "x", "timerId", "", "delay", "", "repeat", "createTimer", "(IJZ)V", "duration", "", "jsSchedulingTime", "t", "(IIDZ)V", "deleteTimer", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "rangeMs", "u", "(J)Z", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lco/c;", "c", "Lcom/facebook/react/modules/core/b;", DateTokenConverter.CONVERTER_KEY, "Lpn/e;", "", "e", "Ljava/lang/Object;", "timerGuard", "f", "idleCallbackGuard", "Landroid/util/SparseArray;", "Lcom/facebook/react/modules/core/JavaTimerManager$d;", "g", "Landroid/util/SparseArray;", "timerIdsToTimers", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPaused", IntegerTokenConverter.CONVERTER_KEY, "isRunningTasks", "Lcom/facebook/react/modules/core/JavaTimerManager$e;", "j", "Lcom/facebook/react/modules/core/JavaTimerManager$e;", "timerFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$c;", "k", "Lcom/facebook/react/modules/core/JavaTimerManager$c;", "idleFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$b;", "l", "Lcom/facebook/react/modules/core/JavaTimerManager$b;", "currentIdleCallbackRunnable", "m", "Z", "frameCallbackPosted", "n", "frameIdleCallbackPosted", "o", "Ljava/util/PriorityQueue;", "p", "Ljava/util/PriorityQueue;", "timers", "q", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class JavaTimerManager implements LifecycleEventListener, wn.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f22719q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final co.c javaScriptTimerExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.react.modules.core.b reactChoreographer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pn.e devSupportManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object timerGuard;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object idleCallbackGuard;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<d> timerIdsToTimers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isPaused;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isRunningTasks;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e timerFrameCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final c idleFrameCallback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private b currentIdleCallbackRunnable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean frameCallbackPosted;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean frameIdleCallbackPosted;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean sendIdleEvents;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final PriorityQueue<d> timers;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$a;", "", "<init>", "()V", "Lcom/facebook/react/modules/core/JavaTimerManager$d;", "timer", "", "rangeMs", "", "b", "(Lcom/facebook/react/modules/core/JavaTimerManager$d;J)Z", "", "IDLE_CALLBACK_FRAME_DEADLINE_MS", Gender.FEMALE, "FRAME_DURATION_MS", "", "TIMER_QUEUE_CAPACITY", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d timer, long rangeMs) {
            return !timer.getRepeat() && ((long) timer.getInterval()) < rangeMs;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$b;", "Ljava/lang/Runnable;", "", "frameStartTime", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;J)V", "Ljn0/h0;", "run", "()V", "a", "J", "", "b", "Z", "isCancelled", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long frameStartTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile boolean isCancelled;

        public b(long j11) {
            this.frameStartTime = j11;
        }

        public final void a() {
            this.isCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            if (this.isCancelled) {
                return;
            }
            long jC = j.c() - (this.frameStartTime / ((long) 1000000));
            long jA = j.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.idleCallbackGuard;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z11 = javaTimerManager.sendIdleEvents;
                h0 h0Var = h0.f84049a;
            }
            if (z11) {
                JavaTimerManager.this.javaScriptTimerExecutor.callIdleCallbacks(jA);
            }
            JavaTimerManager.this.currentIdleCallbackRunnable = null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$c;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                b bVar = JavaTimerManager.this.currentIdleCallbackRunnable;
                if (bVar != null) {
                    bVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.currentIdleCallbackRunnable = javaTimerManager.new b(frameTimeNanos);
                JavaTimerManager.this.reactApplicationContext.runOnJSQueueThread(JavaTimerManager.this.currentIdleCallbackRunnable);
                JavaTimerManager.this.reactChoreographer.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$d;", "", "", "timerId", "", "targetTime", "interval", "", "repeat", "<init>", "(IJIZ)V", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "b", "J", "c", "()J", "e", "(J)V", "Z", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int timerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long targetTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int interval;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean repeat;

        public d(int i11, long j11, int i12, boolean z11) {
            this.timerId = i11;
            this.targetTime = j11;
            this.interval = i12;
            this.repeat = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getInterval() {
            return this.interval;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRepeat() {
            return this.repeat;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTargetTime() {
            return this.targetTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTimerId() {
            return this.timerId;
        }

        public final void e(long j11) {
            this.targetTime = j11;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$e;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "Lcom/facebook/react/bridge/WritableArray;", "a", "Lcom/facebook/react/bridge/WritableArray;", "timersToCall", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class e implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private WritableArray timersToCall;

        public e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            d dVar;
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                long j11 = frameTimeNanos / ((long) 1000000);
                Object obj = JavaTimerManager.this.timerGuard;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.timers.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.timers.peek();
                            s.h(objPeek);
                            if (((d) objPeek).getTargetTime() >= j11 || (dVar = (d) javaTimerManager.timers.poll()) == null) {
                                break;
                                break;
                            }
                            if (this.timersToCall == null) {
                                this.timersToCall = Arguments.createArray();
                            }
                            WritableArray writableArray = this.timersToCall;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.getTimerId());
                            }
                            if (dVar.getRepeat()) {
                                dVar.e(((long) dVar.getInterval()) + j11);
                                javaTimerManager.timers.add(dVar);
                            } else {
                                javaTimerManager.timerIdsToTimers.remove(dVar.getTimerId());
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    h0 h0Var = h0.f84049a;
                }
                WritableArray writableArray2 = this.timersToCall;
                if (writableArray2 != null) {
                    JavaTimerManager.this.javaScriptTimerExecutor.callTimers(writableArray2);
                    this.timersToCall = null;
                }
                JavaTimerManager.this.reactChoreographer.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, co.c javaScriptTimerExecutor, com.facebook.react.modules.core.b reactChoreographer, pn.e devSupportManager) {
        s.k(reactApplicationContext, "reactApplicationContext");
        s.k(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        s.k(reactChoreographer, "reactChoreographer");
        s.k(devSupportManager, "devSupportManager");
        this.reactApplicationContext = reactApplicationContext;
        this.javaScriptTimerExecutor = javaScriptTimerExecutor;
        this.reactChoreographer = reactChoreographer;
        this.devSupportManager = devSupportManager;
        this.timerGuard = new Object();
        this.idleCallbackGuard = new Object();
        this.timerIdsToTimers = new SparseArray<>();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        this.timerFrameCallback = new e();
        this.idleFrameCallback = new c();
        final p pVar = new p() { // from class: com.facebook.react.modules.core.a
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(JavaTimerManager.B((JavaTimerManager.d) obj, (JavaTimerManager.d) obj2));
            }
        };
        this.timers = new PriorityQueue<>(11, new Comparator() { // from class: co.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return JavaTimerManager.C(pVar, obj, obj2);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        wn.c.INSTANCE.a(reactApplicationContext).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(JavaTimerManager javaTimerManager, boolean z11) {
        synchronized (javaTimerManager.idleCallbackGuard) {
            try {
                if (z11) {
                    javaTimerManager.z();
                } else {
                    javaTimerManager.r();
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(d dVar, d dVar2) {
        return yn0.a.b(dVar.getTargetTime() - dVar2.getTargetTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final void r() {
        if (this.frameIdleCallbackPosted) {
            this.reactChoreographer.n(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.idleFrameCallback);
            this.frameIdleCallbackPosted = false;
        }
    }

    private final void s() {
        wn.c cVarA = wn.c.INSTANCE.a(this.reactApplicationContext);
        if (this.frameCallbackPosted && this.isPaused.get() && !cVarA.f()) {
            this.reactChoreographer.n(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.timerFrameCallback);
            this.frameCallbackPosted = false;
        }
    }

    private final void v() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        s();
    }

    private final void w() {
        synchronized (this.idleCallbackGuard) {
            try {
                if (this.sendIdleEvents) {
                    z();
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void y() {
        if (this.frameCallbackPosted) {
            return;
        }
        this.reactChoreographer.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.timerFrameCallback);
        this.frameCallbackPosted = true;
    }

    private final void z() {
        if (this.frameIdleCallbackPosted) {
            return;
        }
        this.reactChoreographer.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.idleFrameCallback);
        this.frameIdleCallbackPosted = true;
    }

    @Override // wn.d
    public void a(int taskId) {
        if (wn.c.INSTANCE.a(this.reactApplicationContext).f()) {
            return;
        }
        this.isRunningTasks.set(false);
        s();
        v();
    }

    @Override // wn.d
    public void b(int taskId) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        y();
        w();
    }

    @in.a
    public void createTimer(int timerId, long delay, boolean repeat) {
        d dVar = new d(timerId, (j.b() / ((long) 1000000)) + delay, (int) delay, repeat);
        synchronized (this.timerGuard) {
            this.timers.add(dVar);
            this.timerIdsToTimers.put(timerId, dVar);
            h0 h0Var = h0.f84049a;
        }
    }

    @in.a
    public void deleteTimer(int timerId) {
        synchronized (this.timerGuard) {
            d dVar = this.timerIdsToTimers.get(timerId);
            if (dVar == null) {
                return;
            }
            this.timerIdsToTimers.remove(timerId);
            this.timers.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        y();
        w();
    }

    @in.a
    public void setSendIdleEvents(final boolean sendIdleEvents) {
        synchronized (this.idleCallbackGuard) {
            this.sendIdleEvents = sendIdleEvents;
            h0 h0Var = h0.f84049a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: co.e
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.A(this.f19446a, sendIdleEvents);
            }
        });
    }

    public void t(int timerId, int duration, double jsSchedulingTime, boolean repeat) {
        long jA = j.a();
        long j11 = (long) jsSchedulingTime;
        if (this.devSupportManager.k() && Math.abs(j11 - jA) > 60000) {
            this.javaScriptTimerExecutor.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j11 - jA) + ((long) duration));
        if (duration != 0 || repeat) {
            createTimer(timerId, jMax, repeat);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(timerId);
        co.c cVar = this.javaScriptTimerExecutor;
        s.h(writableArrayCreateArray);
        cVar.callTimers(writableArrayCreateArray);
    }

    public final boolean u(long rangeMs) {
        synchronized (this.timerGuard) {
            d dVarPeek = this.timers.peek();
            if (dVarPeek == null) {
                return false;
            }
            if (f22719q.b(dVarPeek, rangeMs)) {
                return true;
            }
            Iterator<d> it = this.timers.iterator();
            s.j(it, "iterator(...)");
            while (it.hasNext()) {
                d next = it.next();
                a aVar = f22719q;
                s.h(next);
                if (aVar.b(next, rangeMs)) {
                    return true;
                }
            }
            h0 h0Var = h0.f84049a;
            return false;
        }
    }

    public void x() {
        wn.c.INSTANCE.a(this.reactApplicationContext).h(this);
        this.reactApplicationContext.removeLifecycleEventListener(this);
        s();
        r();
    }
}
