package xl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0011H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0016\u00103\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102R$\u00107\u001a\u00020\b2\u0006\u00104\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0010R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00105R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00105R\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00105R\u0016\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010=R\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lxl/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lcl/a;", "Lql/a;", "_animationBackend", "<init>", "(Lql/a;)V", "", "targetAnimationTimeMs", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(J)V", "c", "()V", "b", "()J", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "start", "stop", "", "isRunning", "()Z", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "level", "onLevelChange", "(I)Z", "a", "Lql/a;", "Lzl/b;", "Lzl/b;", "frameScheduler", "Z", "_isRunning", "value", "J", "getStartTimeMs", "startTimeMs", "e", "lastFrameAnimationTimeMs", "f", "expectedRenderTimeMs", "g", "I", "lastDrawnFrameNumber", "h", "pausedStartTimeMsDifference", IntegerTokenConverter.CONVERTER_KEY, "pausedLastFrameAnimationTimeMsDifference", "j", "pausedLastDrawnFrameNumber", "k", "frameSchedulingDelayMs", "l", "frameSchedulingOffsetMs", "m", "_droppedFrames", "Lxl/d;", "n", "Lxl/d;", "animationListener", "Lql/a$a;", "o", "Lql/a$a;", "animationBackendListener", "Lll/d;", "p", "Lll/d;", "drawableProperties", "Ljava/lang/Runnable;", "q", "Ljava/lang/Runnable;", "invalidateRunnable", "r", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b extends Drawable implements Animatable, cl.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class<?> f123670s = b.class;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f123671t = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ql.a _animationBackend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private zl.b frameScheduler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile boolean _isRunning;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastFrameAnimationTimeMs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long expectedRenderTimeMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int lastDrawnFrameNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long pausedStartTimeMsDifference;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long pausedLastFrameAnimationTimeMsDifference;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int pausedLastDrawnFrameNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long frameSchedulingDelayMs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long frameSchedulingOffsetMs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int _droppedFrames;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private volatile d animationListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ql.a.InterfaceC2242a animationBackendListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ll.d drawableProperties;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Runnable invalidateRunnable;

    /* JADX INFO: renamed from: xl.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lxl/b$a;", "", "<init>", "()V", "Lql/a;", "animationBackend", "Lzl/b;", "b", "(Lql/a;)Lzl/b;", "Ljava/lang/Class;", "TAG", "Ljava/lang/Class;", "Lxl/d;", "NO_OP_LISTENER", "Lxl/d;", "", "DEFAULT_FRAME_SCHEDULING_DELAY_MS", "I", "DEFAULT_FRAME_SCHEDULING_OFFSET_MS", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final zl.b b(ql.a animationBackend) {
            if (animationBackend == null) {
                return null;
            }
            return new zl.a(animationBackend);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: xl.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"xl/b$b", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RunnableC2679b implements Runnable {
        RunnableC2679b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.unscheduleSelf(this);
            b.this.invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void c() {
        this._droppedFrames++;
        if (qk.a.w(2)) {
            qk.a.y(f123670s, "Dropped a frame. Count: %s", Integer.valueOf(this._droppedFrames));
        }
    }

    private final void d(long targetAnimationTimeMs) {
        long j11 = this.startTimeMs + targetAnimationTimeMs;
        this.expectedRenderTimeMs = j11;
        scheduleSelf(this.invalidateRunnable, j11);
    }

    @Override // cl.a
    public void a() {
        ql.a aVar = this._animationBackend;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        s.k(canvas, "canvas");
        if (this._animationBackend == null || this.frameScheduler == null) {
            return;
        }
        long jB = b();
        long jMax = this._isRunning ? (jB - this.startTimeMs) + this.frameSchedulingOffsetMs : (long) Math.max(this.lastFrameAnimationTimeMs, 0.0d);
        zl.b bVar = this.frameScheduler;
        s.h(bVar);
        int iB = bVar.b(jMax, this.lastFrameAnimationTimeMs);
        if (iB == -1) {
            ql.a aVar = this._animationBackend;
            s.h(aVar);
            iB = aVar.a() - 1;
            this.animationListener.d(this);
            this._isRunning = false;
        } else if (iB == 0 && this.lastDrawnFrameNumber != -1 && jB >= this.expectedRenderTimeMs) {
            this.animationListener.c(this);
        }
        ql.a aVar2 = this._animationBackend;
        s.h(aVar2);
        boolean zM = aVar2.m(this, canvas, iB);
        if (zM) {
            this.animationListener.b(this, iB);
            this.lastDrawnFrameNumber = iB;
        }
        if (!zM) {
            c();
        }
        long jB2 = b();
        if (this._isRunning) {
            zl.b bVar2 = this.frameScheduler;
            s.h(bVar2);
            long jA = bVar2.a(jB2 - this.startTimeMs);
            if (jA != -1) {
                d(jA + this.frameSchedulingDelayMs);
            } else {
                this.animationListener.d(this);
                this._isRunning = false;
            }
        }
        this.lastFrameAnimationTimeMs = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ql.a aVar = this._animationBackend;
        return aVar != null ? aVar.d() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ql.a aVar = this._animationBackend;
        return aVar != null ? aVar.c() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this._isRunning;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        s.k(bounds, "bounds");
        super.onBoundsChange(bounds);
        ql.a aVar = this._animationBackend;
        if (aVar != null) {
            aVar.e(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        if (this._isRunning) {
            return false;
        }
        long j11 = level;
        if (this.lastFrameAnimationTimeMs == j11) {
            return false;
        }
        this.lastFrameAnimationTimeMs = j11;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.drawableProperties == null) {
            this.drawableProperties = new ll.d();
        }
        ll.d dVar = this.drawableProperties;
        s.h(dVar);
        dVar.b(alpha);
        ql.a aVar = this._animationBackend;
        if (aVar != null) {
            aVar.k(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.drawableProperties == null) {
            this.drawableProperties = new ll.d();
        }
        ll.d dVar = this.drawableProperties;
        s.h(dVar);
        dVar.c(colorFilter);
        ql.a aVar = this._animationBackend;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ql.a aVar;
        if (this._isRunning || (aVar = this._animationBackend) == null) {
            return;
        }
        s.h(aVar);
        if (aVar.a() <= 1) {
            return;
        }
        this._isRunning = true;
        long jB = b();
        long j11 = jB - this.pausedStartTimeMsDifference;
        this.startTimeMs = j11;
        this.expectedRenderTimeMs = j11;
        this.lastFrameAnimationTimeMs = jB - this.pausedLastFrameAnimationTimeMsDifference;
        this.lastDrawnFrameNumber = this.pausedLastDrawnFrameNumber;
        invalidateSelf();
        this.animationListener.a(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this._isRunning) {
            long jB = b();
            this.pausedStartTimeMsDifference = jB - this.startTimeMs;
            this.pausedLastFrameAnimationTimeMsDifference = jB - this.lastFrameAnimationTimeMs;
            this.pausedLastDrawnFrameNumber = this.lastDrawnFrameNumber;
            this._isRunning = false;
            this.startTimeMs = 0L;
            this.expectedRenderTimeMs = 0L;
            this.lastFrameAnimationTimeMs = -1L;
            this.lastDrawnFrameNumber = -1;
            unscheduleSelf(this.invalidateRunnable);
            this.animationListener.d(this);
        }
    }

    public /* synthetic */ b(ql.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar);
    }

    public b(ql.a aVar) {
        this._animationBackend = aVar;
        this.frameSchedulingDelayMs = 8L;
        this.animationListener = f123671t;
        ql.a.InterfaceC2242a interfaceC2242a = new ql.a.InterfaceC2242a() { // from class: xl.a
        };
        this.animationBackendListener = interfaceC2242a;
        this.invalidateRunnable = new RunnableC2679b();
        this.frameScheduler = INSTANCE.b(this._animationBackend);
        ql.a aVar2 = this._animationBackend;
        if (aVar2 != null) {
            aVar2.h(interfaceC2242a);
        }
    }
}
