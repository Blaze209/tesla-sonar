package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.r;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.q7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u000e*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lio/sentry/android/replay/screenshot/e;", "Lio/sentry/android/replay/screenshot/k;", "Lio/sentry/android/replay/b;", "executor", "Lio/sentry/android/replay/r;", "screenshotRecorderCallback", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/s;", "config", "<init>", "(Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;Lio/sentry/q7;Lio/sentry/android/replay/s;)V", "Landroid/view/View;", "root", "Ljn0/h0;", "a", "(Landroid/view/View;)V", "onContentChanged", "()V", "close", "", "b", "()Z", "c", "Landroid/os/Handler;", "Lio/sentry/android/replay/util/l;", "runnable", "l", "(Landroid/os/Handler;Lio/sentry/android/replay/util/l;)V", "Lio/sentry/android/replay/b;", "Lio/sentry/android/replay/r;", "Lio/sentry/q7;", DateTokenConverter.CONVERTER_KEY, "Lio/sentry/android/replay/s;", "Landroid/graphics/Bitmap;", "e", "Landroid/graphics/Bitmap;", "screenshot", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/graphics/Picture;", "f", "Ljava/util/concurrent/atomic/AtomicReference;", "unprocessedPictureRef", "Lio/sentry/util/a;", "g", "Lio/sentry/util/a;", "screenshotLock", "Landroid/graphics/Matrix;", "h", "Lkotlin/Lazy;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastCaptureSuccessful", "Lio/sentry/android/replay/screenshot/l;", "j", "Lio/sentry/android/replay/screenshot/l;", "textIgnoringCanvas", "k", "isClosed", "Landroid/graphics/SurfaceTexture;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Landroid/view/Surface;", "m", "Landroid/view/Surface;", "surface", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "pictureRenderTask", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NewApi", "UseKtx"})
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.b executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r screenshotRecorderCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ScreenshotRecorderConfig config;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile Bitmap screenshot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<Picture> unprocessedPictureRef;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a screenshotLock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy prescaledMatrix;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean lastCaptureSuccessful;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l textIgnoringCanvas;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final SurfaceTexture surfaceTexture;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Surface surface;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SuppressLint({"NewApi"})
    private final Runnable pictureRenderTask;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Matrix;", "b", "()Landroid/graphics/Matrix;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Matrix> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            e eVar = e.this;
            matrix.preScale(eVar.config.getScaleFactorX(), eVar.config.getScaleFactorY());
            return matrix;
        }
    }

    public e(io.sentry.android.replay.b executor, r rVar, q7 options, ScreenshotRecorderConfig config) {
        s.k(executor, "executor");
        s.k(options, "options");
        s.k(config, "config");
        this.executor = executor;
        this.screenshotRecorderCallback = rVar;
        this.options = options;
        this.config = config;
        this.unprocessedPictureRef = new AtomicReference<>(null);
        this.screenshotLock = new io.sentry.util.a();
        this.prescaledMatrix = m.a(p.NONE, new a());
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.textIgnoringCanvas = new l();
        this.isClosed = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = io.sentry.android.replay.screenshot.a.a(false);
        surfaceTextureA.setDefaultBufferSize(config.getRecordingWidth(), config.getRecordingHeight());
        this.surfaceTexture = surfaceTextureA;
        this.surface = new Surface(surfaceTextureA);
        io.sentry.util.p.a("ReplayCanvasStrategy");
        this.pictureRenderTask = new Runnable() { // from class: io.sentry.android.replay.screenshot.b
            @Override // java.lang.Runnable
            public final void run() {
                e.j(this.f80103a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(e eVar) {
        Bitmap bitmap = eVar.screenshot;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        eVar.surface.release();
        eVar.surfaceTexture.release();
    }

    private final Matrix i() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final e eVar) {
        if (eVar.isClosed.get()) {
            eVar.options.getLogger().c(b7.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = eVar.unprocessedPictureRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = eVar.surface.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                andSet.draw(canvasLockHardwareCanvas);
                eVar.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (eVar.screenshot == null) {
                    d1 d1VarA = eVar.screenshotLock.a();
                    try {
                        if (eVar.screenshot == null) {
                            eVar.screenshot = Bitmap.createBitmap(eVar.config.getRecordingWidth(), eVar.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
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
                if (eVar.isClosed.get()) {
                    eVar.options.getLogger().c(b7.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = eVar.surface;
                Bitmap bitmap = eVar.screenshot;
                s.h(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i11) {
                        e.k(this.f80105a, i11);
                    }
                }, eVar.executor.p());
            } catch (Throwable th4) {
                eVar.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th4;
            }
        } catch (Throwable th5) {
            eVar.options.getLogger().a(b7.ERROR, "Canvas Strategy: picture render failed", th5);
            eVar.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e eVar, int i11) {
        r rVar;
        if (eVar.isClosed.get()) {
            eVar.options.getLogger().c(b7.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i11 == 0) {
            eVar.lastCaptureSuccessful.set(true);
            Bitmap bitmap = eVar.screenshot;
            if (bitmap == null || bitmap.isRecycled() || (rVar = eVar.screenshotRecorderCallback) == null) {
                return;
            }
            rVar.o(bitmap);
            return;
        }
        eVar.options.getLogger().c(b7.ERROR, "Canvas Strategy: PixelCopy failed with code " + i11, new Object[0]);
        eVar.lastCaptureSuccessful.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.k
    @SuppressLint({"NewApi"})
    public void a(View root) {
        s.k(root, "root");
        if (this.isClosed.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.config.getRecordingWidth(), this.config.getRecordingHeight());
        s.j(canvasBeginRecording, "beginRecording(...)");
        this.textIgnoringCanvas.e(canvasBeginRecording);
        this.textIgnoringCanvas.setMatrix(i());
        root.draw(this.textIgnoringCanvas);
        picture.endRecording();
        if (this.isClosed.get()) {
            return;
        }
        this.unprocessedPictureRef.set(picture);
        l(this.executor.p(), new io.sentry.android.replay.util.l("screenshot_recorder.canvas", this.pictureRenderTask));
    }

    @Override // io.sentry.android.replay.screenshot.k
    public boolean b() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void c() {
        Bitmap bitmap;
        r rVar;
        if (!b() || (bitmap = this.screenshot) == null || bitmap.isRecycled() || (rVar = this.screenshotRecorderCallback) == null) {
            return;
        }
        rVar.o(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void close() {
        this.isClosed.set(true);
        l(this.executor.p(), new io.sentry.android.replay.util.l("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.c
            @Override // java.lang.Runnable
            public final void run() {
                e.h(this.f80104a);
            }
        }));
        this.unprocessedPictureRef.getAndSet(null);
    }

    public final void l(Handler handler, io.sentry.android.replay.util.l runnable) {
        s.k(handler, "<this>");
        s.k(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.options.getLogger().a(b7.ERROR, "Canvas Strategy: failed to post runnable " + runnable.getTaskName(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void onContentChanged() {
    }
}
