package ag;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f999c;

    public a() {
        this.f997a = new PointF();
        this.f998b = new PointF();
        this.f999c = new PointF();
    }

    public PointF a() {
        return this.f997a;
    }

    public PointF b() {
        return this.f998b;
    }

    public PointF c() {
        return this.f999c;
    }

    public void d(float f11, float f12) {
        this.f997a.set(f11, f12);
    }

    public void e(float f11, float f12) {
        this.f998b.set(f11, f12);
    }

    public void f(float f11, float f12) {
        this.f999c.set(f11, f12);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f999c.x), Float.valueOf(this.f999c.y), Float.valueOf(this.f997a.x), Float.valueOf(this.f997a.y), Float.valueOf(this.f998b.x), Float.valueOf(this.f998b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f997a = pointF;
        this.f998b = pointF2;
        this.f999c = pointF3;
    }
}
