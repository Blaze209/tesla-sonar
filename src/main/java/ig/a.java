package ig;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import tf.i;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f77656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f77657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f77658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f77659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f77660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f77661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f77662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f77663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f77664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f77665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f77666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f77667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f77668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f77669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f77670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f77671p;

    public a(i iVar, T t11, T t12, Interpolator interpolator, float f11, Float f12) {
        this.f77664i = -3987645.8f;
        this.f77665j = -3987645.8f;
        this.f77666k = 784923401;
        this.f77667l = 784923401;
        this.f77668m = Float.MIN_VALUE;
        this.f77669n = Float.MIN_VALUE;
        this.f77670o = null;
        this.f77671p = null;
        this.f77656a = iVar;
        this.f77657b = t11;
        this.f77658c = t12;
        this.f77659d = interpolator;
        this.f77660e = null;
        this.f77661f = null;
        this.f77662g = f11;
        this.f77663h = f12;
    }

    public boolean a(float f11) {
        return f11 >= f() && f11 < c();
    }

    public a<T> b(T t11, T t12) {
        return new a<>(t11, t12);
    }

    public float c() {
        if (this.f77656a == null) {
            return 1.0f;
        }
        if (this.f77669n == Float.MIN_VALUE) {
            if (this.f77663h == null) {
                this.f77669n = 1.0f;
            } else {
                float f11 = f();
                this.f77669n = (float) (((double) f11) + (((double) (this.f77663h.floatValue() - this.f77662g)) / ((double) this.f77656a.e())));
            }
        }
        return this.f77669n;
    }

    public float d() {
        if (this.f77665j == -3987645.8f) {
            this.f77665j = ((Float) this.f77658c).floatValue();
        }
        return this.f77665j;
    }

    public int e() {
        if (this.f77667l == 784923401) {
            this.f77667l = ((Integer) this.f77658c).intValue();
        }
        return this.f77667l;
    }

    public float f() {
        i iVar = this.f77656a;
        if (iVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f77668m == Float.MIN_VALUE) {
            this.f77668m = (this.f77662g - iVar.p()) / this.f77656a.e();
        }
        return this.f77668m;
    }

    public float g() {
        if (this.f77664i == -3987645.8f) {
            this.f77664i = ((Float) this.f77657b).floatValue();
        }
        return this.f77664i;
    }

    public int h() {
        if (this.f77666k == 784923401) {
            this.f77666k = ((Integer) this.f77657b).intValue();
        }
        return this.f77666k;
    }

    public boolean i() {
        return this.f77659d == null && this.f77660e == null && this.f77661f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f77657b + ", endValue=" + this.f77658c + ", startFrame=" + this.f77662g + ", endFrame=" + this.f77663h + ", interpolator=" + this.f77659d + CoreConstants.CURLY_RIGHT;
    }

    public a(i iVar, T t11, T t12, Interpolator interpolator, Interpolator interpolator2, float f11, Float f12) {
        this.f77664i = -3987645.8f;
        this.f77665j = -3987645.8f;
        this.f77666k = 784923401;
        this.f77667l = 784923401;
        this.f77668m = Float.MIN_VALUE;
        this.f77669n = Float.MIN_VALUE;
        this.f77670o = null;
        this.f77671p = null;
        this.f77656a = iVar;
        this.f77657b = t11;
        this.f77658c = t12;
        this.f77659d = null;
        this.f77660e = interpolator;
        this.f77661f = interpolator2;
        this.f77662g = f11;
        this.f77663h = f12;
    }

    protected a(i iVar, T t11, T t12, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f11, Float f12) {
        this.f77664i = -3987645.8f;
        this.f77665j = -3987645.8f;
        this.f77666k = 784923401;
        this.f77667l = 784923401;
        this.f77668m = Float.MIN_VALUE;
        this.f77669n = Float.MIN_VALUE;
        this.f77670o = null;
        this.f77671p = null;
        this.f77656a = iVar;
        this.f77657b = t11;
        this.f77658c = t12;
        this.f77659d = interpolator;
        this.f77660e = interpolator2;
        this.f77661f = interpolator3;
        this.f77662g = f11;
        this.f77663h = f12;
    }

    public a(T t11) {
        this.f77664i = -3987645.8f;
        this.f77665j = -3987645.8f;
        this.f77666k = 784923401;
        this.f77667l = 784923401;
        this.f77668m = Float.MIN_VALUE;
        this.f77669n = Float.MIN_VALUE;
        this.f77670o = null;
        this.f77671p = null;
        this.f77656a = null;
        this.f77657b = t11;
        this.f77658c = t11;
        this.f77659d = null;
        this.f77660e = null;
        this.f77661f = null;
        this.f77662g = Float.MIN_VALUE;
        this.f77663h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t11, T t12) {
        this.f77664i = -3987645.8f;
        this.f77665j = -3987645.8f;
        this.f77666k = 784923401;
        this.f77667l = 784923401;
        this.f77668m = Float.MIN_VALUE;
        this.f77669n = Float.MIN_VALUE;
        this.f77670o = null;
        this.f77671p = null;
        this.f77656a = null;
        this.f77657b = t11;
        this.f77658c = t12;
        this.f77659d = null;
        this.f77660e = null;
        this.f77661f = null;
        this.f77662g = Float.MIN_VALUE;
        this.f77663h = Float.valueOf(Float.MAX_VALUE);
    }
}
