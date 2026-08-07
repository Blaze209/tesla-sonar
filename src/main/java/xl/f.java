package xl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u00011\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lxl/f;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lcl/a;", "Lql/a;", "animationBackend", "<init>", "(Lql/a;)V", "", "alpha", "Ljn0/h0;", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "start", "()V", "stop", "", "isRunning", "()Z", "a", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lql/a;", "Lxl/c;", "b", "Lxl/c;", "animatedFrameScheduler", "Lxl/d;", "c", "Lxl/d;", "animationListener", "Lll/d;", DateTokenConverter.CONVERTER_KEY, "Lll/d;", "drawableProperties", "xl/f$a", "e", "Lxl/f$a;", "invalidateRunnable", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class f extends Drawable implements Animatable, cl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ql.a animationBackend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c animatedFrameScheduler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d animationListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ll.d drawableProperties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a invalidateRunnable;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"xl/f$a", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.unscheduleSelf(this);
            f.this.invalidateSelf();
        }
    }

    public f(ql.a animationBackend) {
        s.k(animationBackend, "animationBackend");
        this.animationBackend = animationBackend;
        this.animatedFrameScheduler = new c(new zl.a(this.animationBackend));
        this.animationListener = new e();
        ll.d dVar = new ll.d();
        dVar.a(this);
        this.drawableProperties = dVar;
        this.invalidateRunnable = new a();
    }

    @Override // cl.a
    public void a() {
        this.animationBackend.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        s.k(canvas, "canvas");
        int iA = this.animatedFrameScheduler.a();
        if (iA == -1) {
            iA = this.animationBackend.a() - 1;
            this.animatedFrameScheduler.g(false);
            this.animationListener.d(this);
        } else if (iA == 0 && this.animatedFrameScheduler.h()) {
            this.animationListener.c(this);
        }
        if (this.animationBackend.m(this, canvas, iA)) {
            this.animationListener.b(this, iA);
            this.animatedFrameScheduler.f(iA);
        } else {
            this.animatedFrameScheduler.e();
        }
        long jC = this.animatedFrameScheduler.c();
        if (jC != -1) {
            scheduleSelf(this.invalidateRunnable, jC);
        } else {
            this.animationListener.d(this);
            this.animatedFrameScheduler.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.animationBackend.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.animationBackend.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animatedFrameScheduler.getRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        s.k(bounds, "bounds");
        this.animationBackend.e(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawableProperties.b(alpha);
        this.animationBackend.k(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableProperties.c(colorFilter);
        this.animationBackend.f(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.animationBackend.a() <= 0) {
            return;
        }
        this.animatedFrameScheduler.i();
        this.animationListener.a(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animatedFrameScheduler.j();
        this.animationListener.d(this);
        unscheduleSelf(this.invalidateRunnable);
    }
}
