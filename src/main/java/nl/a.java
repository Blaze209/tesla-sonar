package nl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC2028a f95111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f95112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f95113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f95114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f95115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f95116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f95117g;

    /* JADX INFO: renamed from: nl.a$a, reason: collision with other inner class name */
    public interface InterfaceC2028a {
        boolean a();
    }

    public a(Context context) {
        this.f95112b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f95111a = null;
        e();
    }

    public boolean b() {
        return this.f95113c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC2028a interfaceC2028a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f95113c = true;
            this.f95114d = true;
            this.f95115e = motionEvent.getEventTime();
            this.f95116f = motionEvent.getX();
            this.f95117g = motionEvent.getY();
        } else if (action == 1) {
            this.f95113c = false;
            if (Math.abs(motionEvent.getX() - this.f95116f) > this.f95112b || Math.abs(motionEvent.getY() - this.f95117g) > this.f95112b) {
                this.f95114d = false;
            }
            if (this.f95114d && motionEvent.getEventTime() - this.f95115e <= ViewConfiguration.getLongPressTimeout() && (interfaceC2028a = this.f95111a) != null) {
                interfaceC2028a.a();
            }
            this.f95114d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f95113c = false;
                this.f95114d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f95116f) > this.f95112b || Math.abs(motionEvent.getY() - this.f95117g) > this.f95112b) {
            this.f95114d = false;
        }
        return true;
    }

    public void e() {
        this.f95113c = false;
        this.f95114d = false;
    }

    public void f(InterfaceC2028a interfaceC2028a) {
        this.f95111a = interfaceC2028a;
    }
}
