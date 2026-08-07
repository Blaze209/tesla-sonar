package at;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f14989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14991e;

    public j(long j11, long j12) {
        this.f14989c = null;
        this.f14990d = 0;
        this.f14991e = 1;
        this.f14987a = j11;
        this.f14988b = j12;
    }

    @NonNull
    static j b(@NonNull ValueAnimator valueAnimator) {
        j jVar = new j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        jVar.f14990d = valueAnimator.getRepeatCount();
        jVar.f14991e = valueAnimator.getRepeatMode();
        return jVar;
    }

    private static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return b.f14973b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return b.f14974c;
        }
        return interpolator instanceof DecelerateInterpolator ? b.f14975d : interpolator;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f14987a;
    }

    public long d() {
        return this.f14988b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f14989c;
        return timeInterpolator != null ? timeInterpolator : b.f14973b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c() == jVar.c() && d() == jVar.d() && g() == jVar.g() && h() == jVar.h()) {
            return e().getClass().equals(jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f14990d;
    }

    public int h() {
        return this.f14991e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public j(long j11, long j12, @NonNull TimeInterpolator timeInterpolator) {
        this.f14990d = 0;
        this.f14991e = 1;
        this.f14987a = j11;
        this.f14988b = j12;
        this.f14989c = timeInterpolator;
    }
}
