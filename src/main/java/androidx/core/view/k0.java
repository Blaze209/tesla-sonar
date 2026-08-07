package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, l0> f7819a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.getAxisVelocity(i11);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f7819a.containsKey(velocityTracker)) {
                f7819a.put(velocityTracker, new l0());
            }
            f7819a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i11) {
        c(velocityTracker, i11, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i11, float f11) {
        velocityTracker.computeCurrentVelocity(i11, f11);
        l0 l0VarE = e(velocityTracker);
        if (l0VarE != null) {
            l0VarE.c(i11, f11);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i11);
        }
        if (i11 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i11 == 1) {
            return velocityTracker.getYVelocity();
        }
        l0 l0VarE = e(velocityTracker);
        return l0VarE != null ? l0VarE.d(i11) : BitmapDescriptorFactory.HUE_RED;
    }

    private static l0 e(VelocityTracker velocityTracker) {
        return f7819a.get(velocityTracker);
    }
}
