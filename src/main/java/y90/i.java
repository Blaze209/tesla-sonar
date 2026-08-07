package y90;

import android.view.MotionEvent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly90/i;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "averageTouches", "", "b", "(Landroid/view/MotionEvent;Z)F", "c", "", "angle", "a", "(D)D", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f125305a = new i();

    private i() {
    }

    public final double a(double angle) {
        return Math.cos(Math.toRadians(angle / 2.0d));
    }

    public final float b(MotionEvent event, boolean averageTouches) {
        s.k(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!averageTouches) {
            int pointerCount = event.getPointerCount();
            int i11 = pointerCount - 1;
            if (i11 == actionIndex) {
                i11 = pointerCount - 2;
            }
            return event.getX(i11);
        }
        int pointerCount2 = event.getPointerCount();
        float x11 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < pointerCount2; i13++) {
            if (i13 != actionIndex) {
                x11 += event.getX(i13);
                i12++;
            }
        }
        return x11 / i12;
    }

    public final float c(MotionEvent event, boolean averageTouches) {
        s.k(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!averageTouches) {
            int pointerCount = event.getPointerCount();
            int i11 = pointerCount - 1;
            if (i11 == actionIndex) {
                i11 = pointerCount - 2;
            }
            return event.getY(i11);
        }
        int pointerCount2 = event.getPointerCount();
        float y11 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < pointerCount2; i13++) {
            if (i13 != actionIndex) {
                y11 += event.getY(i13);
                i12++;
            }
        }
        return y11 / i12;
    }
}
