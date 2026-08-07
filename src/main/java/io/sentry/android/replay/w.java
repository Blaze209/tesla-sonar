package io.sentry.android.replay;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.q7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R0\u0010<\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100807j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001008`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010P¨\u0006R"}, d2 = {"Lio/sentry/android/replay/w;", "Lio/sentry/android/replay/g;", "Lio/sentry/android/replay/e;", "Lio/sentry/android/replay/b;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/r;", "screenshotRecorderCallback", "Lio/sentry/android/replay/u;", "windowCallback", "Lio/sentry/android/replay/util/h;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/r;Lio/sentry/android/replay/u;Lio/sentry/android/replay/util/h;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroid/view/View;", "root", "", "added", "Ljn0/h0;", "n", "(Landroid/view/View;Z)V", "H", "(Landroid/view/View;)V", "start", "()V", "Lio/sentry/android/replay/s;", "config", "s", "(Lio/sentry/android/replay/s;)V", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "reset", "stop", "close", "c", "()Ljava/util/concurrent/ScheduledExecutorService;", "o", "()Lio/sentry/android/replay/util/h;", "Landroid/os/Handler;", "p", "()Landroid/os/Handler;", "a", "Lio/sentry/q7;", "b", "Lio/sentry/android/replay/r;", "Lio/sentry/android/replay/u;", "Lio/sentry/android/replay/util/h;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "rootViews", "Landroid/graphics/Point;", "h", "Landroid/graphics/Point;", "lastKnownWindowSize", "Lio/sentry/util/a;", "Lio/sentry/util/a;", "rootViewsLock", "j", "capturerLock", "k", "backgroundProcessingHandlerLock", "Lio/sentry/android/replay/w$a;", "l", "Lio/sentry/android/replay/w$a;", "capturer", "Landroid/os/HandlerThread;", "m", "Landroid/os/HandlerThread;", "backgroundProcessingHandlerThread", "Landroid/os/Handler;", "backgroundProcessingHandler", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class w implements g, e, io.sentry.android.replay.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r screenshotRecorderCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u windowCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.h mainLooperHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService replayExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isRecording;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<WeakReference<View>> rootViews;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Point lastKnownWindowSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a rootViewsLock;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a capturerLock;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a backgroundProcessingHandlerLock;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private volatile a capturer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private volatile HandlerThread backgroundProcessingHandlerThread;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private volatile Handler backgroundProcessingHandler;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f¨\u0006!"}, d2 = {"Lio/sentry/android/replay/w$a;", "Ljava/lang/Runnable;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/util/h;", "mainLooperHandler", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/util/h;)V", "Ljn0/h0;", "c", "()V", "b", "stop", "run", "a", "Lio/sentry/q7;", "Lio/sentry/android/replay/util/h;", "Lio/sentry/android/replay/q;", "Lio/sentry/android/replay/q;", "()Lio/sentry/android/replay/q;", "e", "(Lio/sentry/android/replay/q;)V", "recorder", "Lio/sentry/android/replay/s;", DateTokenConverter.CONVERTER_KEY, "Lio/sentry/android/replay/s;", "getConfig", "()Lio/sentry/android/replay/s;", "(Lio/sentry/android/replay/s;)V", "config", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q7 options;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final io.sentry.android.replay.util.h mainLooperHandler;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private q recorder;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private ScreenshotRecorderConfig config;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AtomicBoolean isRecording;

        public a(q7 options, io.sentry.android.replay.util.h mainLooperHandler) {
            p013kotlin.jvm.internal.s.k(options, "options");
            p013kotlin.jvm.internal.s.k(mainLooperHandler, "mainLooperHandler");
            this.options = options;
            this.mainLooperHandler = mainLooperHandler;
            this.isRecording = new AtomicBoolean(true);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q getRecorder() {
            return this.recorder;
        }

        public final void b() {
            q qVar = this.recorder;
            if (qVar != null) {
                qVar.d();
            }
            this.isRecording.getAndSet(false);
        }

        public final void c() {
            if (this.options.getSessionReplay().u()) {
                this.options.getLogger().c(b7.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            q qVar = this.recorder;
            if (qVar != null) {
                qVar.e();
            }
            this.isRecording.getAndSet(true);
            this.mainLooperHandler.d(this);
            if (this.mainLooperHandler.b(this)) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void d(ScreenshotRecorderConfig screenshotRecorderConfig) {
            this.config = screenshotRecorderConfig;
        }

        public final void e(q qVar) {
            this.recorder = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.isRecording.get()) {
                if (this.options.getSessionReplay().u()) {
                    this.options.getLogger().c(b7.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.options.getSessionReplay().u()) {
                    this.options.getLogger().c(b7.DEBUG, "Capturing a frame.", new Object[0]);
                }
                q qVar = this.recorder;
                if (qVar != null) {
                    qVar.b();
                }
            } catch (Throwable th2) {
                this.options.getLogger().a(b7.ERROR, "Failed to capture a frame", th2);
            }
            if (this.options.getSessionReplay().u()) {
                ILogger logger = this.options.getLogger();
                b7 b7Var = b7.DEBUG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Posting the capture runnable again, frame rate is ");
                ScreenshotRecorderConfig screenshotRecorderConfig = this.config;
                sb2.append(screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1);
                sb2.append(" fps.");
                logger.c(b7Var, sb2.toString(), new Object[0]);
            }
            io.sentry.android.replay.util.h hVar = this.mainLooperHandler;
            ScreenshotRecorderConfig screenshotRecorderConfig2 = this.config;
            if (hVar.c(this, 1000 / ((long) (screenshotRecorderConfig2 != null ? screenshotRecorderConfig2.getFrameRate() : 1)))) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }

        public final void stop() {
            q qVar = this.recorder;
            if (qVar != null) {
                qVar.c();
            }
            this.recorder = null;
            this.isRecording.getAndSet(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/sentry/android/replay/w$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f80265b;

        b(View view) {
            this.f80265b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) p013kotlin.collections.v.C0(w.this.rootViews);
            if (!p013kotlin.jvm.internal.s.f(this.f80265b, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.q.i(this.f80265b, this);
                return true;
            }
            if (io.sentry.android.replay.util.q.e(this.f80265b)) {
                io.sentry.android.replay.util.q.i(this.f80265b, this);
                if (this.f80265b.getWidth() != w.this.lastKnownWindowSize.x && this.f80265b.getHeight() != w.this.lastKnownWindowSize.y) {
                    w.this.lastKnownWindowSize.set(this.f80265b.getWidth(), this.f80265b.getHeight());
                    w.this.windowCallback.C(this.f80265b.getWidth(), this.f80265b.getHeight());
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "it", "", "a", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<WeakReference<View>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f80266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(1);
            this.f80266c = view;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<View> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return Boolean.valueOf(p013kotlin.jvm.internal.s.f(it.get(), this.f80266c));
        }
    }

    public w(q7 options, r rVar, u windowCallback, io.sentry.android.replay.util.h mainLooperHandler, ScheduledExecutorService replayExecutor) {
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(windowCallback, "windowCallback");
        p013kotlin.jvm.internal.s.k(mainLooperHandler, "mainLooperHandler");
        p013kotlin.jvm.internal.s.k(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = rVar;
        this.windowCallback = windowCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.lastKnownWindowSize = new Point();
        this.rootViewsLock = new io.sentry.util.a();
        this.capturerLock = new io.sentry.util.a();
        this.backgroundProcessingHandlerLock = new io.sentry.util.a();
    }

    public final void H(View root) {
        p013kotlin.jvm.internal.s.k(root, "root");
        if (!io.sentry.android.replay.util.q.e(root)) {
            io.sentry.android.replay.util.q.b(root, new b(root));
            return;
        }
        if (root.getWidth() != this.lastKnownWindowSize.x) {
            int height = root.getHeight();
            Point point = this.lastKnownWindowSize;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.windowCallback.C(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        reset();
        this.mainLooperHandler.d(this.capturer);
        d1 d1VarA = this.backgroundProcessingHandlerLock.a();
        try {
            Handler handler = this.backgroundProcessingHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            un0.a.a(d1VarA, null);
            stop();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public void d() {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // io.sentry.android.replay.g
    public void i() {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // io.sentry.android.replay.e
    public void n(View root, boolean added) throws Exception {
        q recorder;
        q recorder2;
        q recorder3;
        p013kotlin.jvm.internal.s.k(root, "root");
        d1 d1VarA = this.rootViewsLock.a();
        try {
            if (!added) {
                a aVar = this.capturer;
                if (aVar != null && (recorder2 = aVar.getRecorder()) != null) {
                    recorder2.f(root);
                }
                p013kotlin.collections.v.L(this.rootViews, new c(root));
                WeakReference weakReference = (WeakReference) p013kotlin.collections.v.C0(this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !p013kotlin.jvm.internal.s.f(root, view)) {
                    a aVar2 = this.capturer;
                    if (aVar2 != null && (recorder = aVar2.getRecorder()) != null) {
                        recorder.a(view);
                    }
                    H(view);
                }
            } else {
                if (y.a(root) == null) {
                    this.options.getLogger().c(b7.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    un0.a.a(d1VarA, null);
                    return;
                }
                this.rootViews.add(new WeakReference<>(root));
                a aVar3 = this.capturer;
                if (aVar3 != null && (recorder3 = aVar3.getRecorder()) != null) {
                    recorder3.a(root);
                }
                H(root);
            }
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.b
    /* JADX INFO: renamed from: o, reason: from getter */
    public io.sentry.android.replay.util.h getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @Override // io.sentry.android.replay.b
    public Handler p() throws Exception {
        if (this.backgroundProcessingHandler == null) {
            d1 d1VarA = this.backgroundProcessingHandlerLock.a();
            try {
                if (this.backgroundProcessingHandler == null) {
                    this.backgroundProcessingHandlerThread = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.backgroundProcessingHandlerThread;
                    p013kotlin.jvm.internal.s.h(handlerThread2);
                    this.backgroundProcessingHandler = new Handler(handlerThread2.getLooper());
                }
                h0 h0Var = h0.f84049a;
                un0.a.a(d1VarA, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(d1VarA, th2);
                    throw th3;
                }
            }
        }
        Handler handler = this.backgroundProcessingHandler;
        p013kotlin.jvm.internal.s.h(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.g
    public void reset() throws Exception {
        q recorder;
        this.lastKnownWindowSize.set(0, 0);
        d1 d1VarA = this.rootViewsLock.a();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a aVar = this.capturer;
                if (aVar != null && (recorder = aVar.getRecorder()) != null) {
                    recorder.f((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public void s(ScreenshotRecorderConfig config) throws Exception {
        a aVar;
        q recorder;
        p013kotlin.jvm.internal.s.k(config, "config");
        if (this.isRecording.get()) {
            if (this.capturer == null) {
                d1 d1VarA = this.capturerLock.a();
                try {
                    if (this.capturer == null) {
                        this.capturer = new a(this.options, this.mainLooperHandler);
                    }
                    h0 h0Var = h0.f84049a;
                    un0.a.a(d1VarA, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        un0.a.a(d1VarA, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.capturer;
            if (aVar2 != null) {
                aVar2.d(config);
            }
            a aVar3 = this.capturer;
            if (aVar3 != null) {
                aVar3.e(new q(config, this.options, this, this.screenshotRecorderCallback));
            }
            WeakReference weakReference = (WeakReference) p013kotlin.collections.v.C0(this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.capturer) != null && (recorder = aVar.getRecorder()) != null) {
                recorder.a(view);
            }
            this.mainLooperHandler.d(this.capturer);
            if (this.mainLooperHandler.c(this.capturer, 100L)) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.g
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.g
    public void stop() throws Exception {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.stop();
        }
        d1 d1VarA = this.capturerLock.a();
        try {
            this.capturer = null;
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
            this.isRecording.set(false);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }
}
