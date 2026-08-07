package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.b7;
import io.sentry.q7;
import io.sentry.r8;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Window.Callback f79449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f79450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GestureDetectorCompat f79451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q7 f79452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f79453f;

    class a implements b {
        a() {
        }
    }

    interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, q7 q7Var) {
        this(callback, new GestureDetectorCompat(context, gVar, new Handler(Looper.getMainLooper())), gVar, q7Var, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f79451d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f79450c.k(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f79449b;
    }

    public void c() {
        this.f79450c.m(r8.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventA = this.f79453f.a(motionEvent);
            try {
                b(motionEventA);
            } catch (Throwable th2) {
                try {
                    if (this.f79452e != null) {
                        this.f79452e.getLogger().a(b7.ERROR, "Error dispatching touch event", th2);
                    }
                } finally {
                    motionEventA.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, q7 q7Var, b bVar) {
        super(callback);
        this.f79449b = callback;
        this.f79450c = gVar;
        this.f79452e = q7Var;
        this.f79451d = gestureDetectorCompat;
        this.f79453f = bVar;
    }
}
