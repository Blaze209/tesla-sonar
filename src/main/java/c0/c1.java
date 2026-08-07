package c0;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rational f18277a;

    public c1() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    @NonNull
    protected abstract PointF a(float f11, float f12);

    @NonNull
    public final b1 b(float f11, float f12) {
        return c(f11, f12, d());
    }

    @NonNull
    public final b1 c(float f11, float f12, float f13) {
        PointF pointFA = a(f11, f12);
        return new b1(pointFA.x, pointFA.y, f13, this.f18277a);
    }

    protected void e(@NonNull Rational rational) {
        this.f18277a = rational;
    }

    public c1(Rational rational) {
        this.f18277a = rational;
    }
}
