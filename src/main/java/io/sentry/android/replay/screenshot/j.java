package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.r;
import io.sentry.android.replay.util.p;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.y;
import io.sentry.b7;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.m;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010AR\u0014\u0010K\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010A¨\u0006L"}, d2 = {"Lio/sentry/android/replay/screenshot/j;", "Lio/sentry/android/replay/screenshot/k;", "Lio/sentry/android/replay/b;", "executorProvider", "Lio/sentry/android/replay/r;", "screenshotRecorderCallback", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/s;", "config", "Lio/sentry/android/replay/util/d;", "debugOverlayDrawable", "<init>", "(Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;Lio/sentry/q7;Lio/sentry/android/replay/s;Lio/sentry/android/replay/util/d;)V", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "", "r", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I", "Landroid/view/View;", "root", "Ljn0/h0;", "a", "(Landroid/view/View;)V", "onContentChanged", "()V", "", "b", "()Z", "c", "close", "Lio/sentry/android/replay/r;", "Lio/sentry/q7;", "Lio/sentry/android/replay/s;", DateTokenConverter.CONVERTER_KEY, "Lio/sentry/android/replay/util/d;", "Ljava/util/concurrent/ScheduledExecutorService;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lio/sentry/android/replay/util/h;", "f", "Lio/sentry/android/replay/util/h;", "mainLooperHandler", "g", "Lkotlin/Lazy;", "u", "()Landroid/graphics/Bitmap;", "singlePixelBitmap", "h", "Landroid/graphics/Bitmap;", "screenshot", "Landroid/graphics/Canvas;", IntegerTokenConverter.CONVERTER_KEY, "v", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas", "Landroid/graphics/Matrix;", "j", "t", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "k", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastCaptureSuccessful", "Landroid/graphics/Paint;", "l", "s", "()Landroid/graphics/Paint;", "maskingPaint", "m", "contentChanged", "n", "isClosed", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r screenshotRecorderCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ScreenshotRecorderConfig config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.d debugOverlayDrawable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService executor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.h mainLooperHandler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy singlePixelBitmap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Bitmap screenshot;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy singlePixelBitmapCanvas;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy prescaledMatrix;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean lastCaptureSuccessful;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy maskingPaint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean contentChanged;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b;", "node", "", "a", "(Lio/sentry/android/replay/viewhierarchy/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<io.sentry.android.replay.viewhierarchy.b, Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Rect> f80145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Canvas f80146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Rect> list, Canvas canvas) {
            super(1);
            this.f80145d = list;
            this.f80146e = canvas;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            Pair pairA;
            Integer dominantColor;
            s.k(node, "node");
            if (node.getShouldMask() && node.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() > 0 && node.getHeight() > 0) {
                if (node.getVisibleRect() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof io.sentry.android.replay.viewhierarchy.b.c) {
                    List listE = v.e(node.getVisibleRect());
                    j jVar = j.this;
                    pairA = x.a(listE, Integer.valueOf(jVar.r(jVar.screenshot, node.getVisibleRect())));
                } else {
                    if (node instanceof io.sentry.android.replay.viewhierarchy.b.d) {
                        io.sentry.android.replay.viewhierarchy.b.d dVar = (io.sentry.android.replay.viewhierarchy.b.d) node;
                        p layout = dVar.getLayout();
                        pairA = x.a(q.d(dVar.getLayout(), node.getVisibleRect(), dVar.getPaddingLeft(), dVar.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.f()) == null) && (dominantColor = dVar.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                    } else {
                        pairA = x.a(v.e(node.getVisibleRect()), -16777216);
                    }
                }
                List list = (List) pairA.a();
                j.this.s().setColor(((Number) pairA.b()).intValue());
                Canvas canvas = this.f80146e;
                j jVar2 = j.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, jVar2.s());
                }
                if (j.this.options.getReplayController().t()) {
                    this.f80145d.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Paint;", "b", "()Landroid/graphics/Paint;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<Paint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f80147c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Matrix;", "b", "()Landroid/graphics/Matrix;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<Matrix> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            j jVar = j.this;
            matrix.preScale(jVar.config.getScaleFactorX(), jVar.config.getScaleFactorY());
            return matrix;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<Bitmap> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f80149c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            s.j(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<Canvas> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(j.this.u());
        }
    }

    public j(io.sentry.android.replay.b executorProvider, r rVar, q7 options, ScreenshotRecorderConfig config, io.sentry.android.replay.util.d debugOverlayDrawable) {
        s.k(executorProvider, "executorProvider");
        s.k(options, "options");
        s.k(config, "config");
        s.k(debugOverlayDrawable, "debugOverlayDrawable");
        this.screenshotRecorderCallback = rVar;
        this.options = options;
        this.config = config;
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.executor = executorProvider.c();
        this.mainLooperHandler = executorProvider.o();
        jn0.p pVar = jn0.p.NONE;
        this.singlePixelBitmap = m.a(pVar, d.f80149c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        this.screenshot = bitmapCreateBitmap;
        this.singlePixelBitmapCanvas = m.a(pVar, new e());
        this.prescaledMatrix = m.a(pVar, new c());
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.maskingPaint = m.a(pVar, b.f80147c);
        this.contentChanged = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final j jVar, final View view, int i11) {
        if (jVar.isClosed.get()) {
            jVar.options.getLogger().c(b7.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i11 != 0) {
            jVar.options.getLogger().c(b7.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i11));
            jVar.lastCaptureSuccessful.set(false);
        } else if (jVar.contentChanged.get()) {
            jVar.options.getLogger().c(b7.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            jVar.lastCaptureSuccessful.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.INSTANCE.a(view, null, 0, jVar.options);
            q.k(view, bVarA, jVar.options);
            jVar.executor.submit(new io.sentry.android.replay.util.l("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.o(this.f80124a, bVarA, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final j jVar, io.sentry.android.replay.viewhierarchy.b bVar, final View view) {
        if (jVar.isClosed.get() || jVar.screenshot.isRecycled()) {
            jVar.options.getLogger().c(b7.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(jVar.screenshot);
        canvas.setMatrix(jVar.t());
        bVar.h(jVar.new a(arrayList, canvas));
        if (jVar.options.getReplayController().t()) {
            jVar.mainLooperHandler.b(new Runnable() { // from class: io.sentry.android.replay.screenshot.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.p(this.f80127a, view, arrayList);
                }
            });
        }
        r rVar = jVar.screenshotRecorderCallback;
        if (rVar != null) {
            rVar.o(jVar.screenshot);
        }
        jVar.lastCaptureSuccessful.set(true);
        jVar.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(j jVar, View view, List list) {
        if (jVar.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(jVar.debugOverlayDrawable);
        }
        jVar.debugOverlayDrawable.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(j jVar) {
        if (!jVar.screenshot.isRecycled()) {
            synchronized (jVar.screenshot) {
                try {
                    if (!jVar.screenshot.isRecycled()) {
                        jVar.screenshot.recycle();
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (jVar.u().isRecycled()) {
            return;
        }
        jVar.u().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Bitmap bitmap, Rect rect) {
        if (this.isClosed.get() || bitmap.isRecycled() || u().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        t().mapRect(rectF);
        rectF.round(rect2);
        v().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return u().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint s() {
        return (Paint) this.maskingPaint.getValue();
    }

    private final Matrix t() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap u() {
        return (Bitmap) this.singlePixelBitmap.getValue();
    }

    private final Canvas v() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.k
    @SuppressLint({"NewApi"})
    public void a(final View root) {
        s.k(root, "root");
        Window windowA = y.a(root);
        if (windowA == null) {
            this.options.getLogger().c(b7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.isClosed.get()) {
            this.options.getLogger().c(b7.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            PixelCopy.request(windowA, this.screenshot, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.f
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i11) {
                    j.n(this.f80121a, root, i11);
                }
            }, this.mainLooperHandler.getHandler());
        } catch (Throwable th2) {
            this.options.getLogger().a(b7.WARNING, "Failed to capture replay recording", th2);
            this.lastCaptureSuccessful.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public boolean b() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void c() {
        r rVar;
        if (!b() || this.screenshot.isRecycled() || (rVar = this.screenshotRecorderCallback) == null) {
            return;
        }
        rVar.o(this.screenshot);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void close() {
        this.isClosed.set(true);
        this.executor.submit(new io.sentry.android.replay.util.l("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.g
            @Override // java.lang.Runnable
            public final void run() {
                j.q(this.f80123a);
            }
        }));
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void onContentChanged() {
        this.contentChanged.set(true);
    }
}
