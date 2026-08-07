package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.sentry.b7;
import io.sentry.q7;
import io.sentry.r4;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010+\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lio/sentry/android/replay/q;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lio/sentry/android/replay/s;", "config", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/b;", "executorProvider", "Lio/sentry/android/replay/r;", "screenshotRecorderCallback", "<init>", "(Lio/sentry/android/replay/s;Lio/sentry/q7;Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;)V", "Ljn0/h0;", "b", "()V", "onDraw", "Landroid/view/View;", "root", "a", "(Landroid/view/View;)V", "f", DateTokenConverter.CONVERTER_KEY, "e", "c", "Lio/sentry/android/replay/s;", "getConfig", "()Lio/sentry/android/replay/s;", "Lio/sentry/q7;", "getOptions", "()Lio/sentry/q7;", "Lio/sentry/android/replay/b;", "getExecutorProvider", "()Lio/sentry/android/replay/b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "rootView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCapturing", "Lio/sentry/android/replay/util/d;", "Lio/sentry/android/replay/util/d;", "debugOverlayDrawable", "g", "contentChanged", "Lio/sentry/android/replay/screenshot/k;", "h", "Lio/sentry/android/replay/screenshot/k;", "screenshotStrategy", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
@TargetApi(26)
public final class q implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScreenshotRecorderConfig config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b executorProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private WeakReference<View> rootView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isCapturing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.d debugOverlayDrawable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean contentChanged;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.screenshot.k screenshotStrategy;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80095a;

        static {
            int[] iArr = new int[r4.values().length];
            try {
                iArr[r4.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r4.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80095a = iArr;
        }
    }

    public q(ScreenshotRecorderConfig config, q7 options, b executorProvider, r rVar) {
        io.sentry.android.replay.screenshot.k eVar;
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(executorProvider, "executorProvider");
        this.config = config;
        this.options = options;
        this.executorProvider = executorProvider;
        this.isCapturing = new AtomicBoolean(true);
        io.sentry.android.replay.util.d dVar = new io.sentry.android.replay.util.d();
        this.debugOverlayDrawable = dVar;
        this.contentChanged = new AtomicBoolean(false);
        int i11 = a.f80095a[options.getSessionReplay().n().ordinal()];
        if (i11 == 1) {
            eVar = new io.sentry.android.replay.screenshot.e(executorProvider, rVar, options, config);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new io.sentry.android.replay.screenshot.j(executorProvider, rVar, options, config, dVar);
        }
        this.screenshotStrategy = eVar;
    }

    public final void a(View root) {
        p013kotlin.jvm.internal.s.k(root, "root");
        WeakReference<View> weakReference = this.rootView;
        f(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        io.sentry.android.replay.util.q.a(root, this);
        this.contentChanged.set(true);
        this.screenshotStrategy.onContentChanged();
    }

    public final void b() {
        if (this.options.getSessionReplay().u()) {
            this.options.getLogger().c(b7.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.isCapturing.get()));
        }
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().u()) {
                this.options.getLogger().c(b7.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.options.getSessionReplay().u()) {
            this.options.getLogger().c(b7.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.contentChanged.get()), Boolean.valueOf(this.screenshotStrategy.b()));
        }
        if (!this.contentChanged.get()) {
            this.screenshotStrategy.c();
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().c(b7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (y.a(view) == null) {
            this.options.getLogger().c(b7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            this.screenshotStrategy.a(view);
        } catch (Throwable th2) {
            this.options.getLogger().a(b7.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        f(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.screenshotStrategy.close();
    }

    public final void d() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        f(weakReference != null ? weakReference.get() : null);
    }

    public final void e() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            io.sentry.android.replay.util.q.a(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void f(View root) {
        ViewOverlay overlay;
        if (this.options.getReplayController().t() && root != null && (overlay = root.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (root != null) {
            io.sentry.android.replay.util.q.h(root, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().c(b7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
                this.screenshotStrategy.onContentChanged();
            }
        }
    }
}
