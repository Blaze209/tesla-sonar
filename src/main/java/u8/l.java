package u8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u8.b f115896a = new u8.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f115897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f115898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f115899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f115900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f115901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f115902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f115903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f115904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f115905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f115906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f115907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f115908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f115909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f115910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f115911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f115912q;

    private static final class a {
        public static void a(Surface surface, float f11) {
            try {
                surface.setFrameRate(f11, f11 == BitmapDescriptorFactory.HUE_RED ? 0 : 1);
            } catch (IllegalStateException e11) {
                s7.t.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
            }
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f115915f = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f115916a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f115917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f115918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f115919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f115920e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f115918c = handlerThread;
            handlerThread.start();
            Handler handlerB = q0.B(handlerThread.getLooper(), this);
            this.f115917b = handlerB;
            handlerB.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f115919d;
            if (choreographer != null) {
                int i11 = this.f115920e + 1;
                this.f115920e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f115919d = Choreographer.getInstance();
            } catch (RuntimeException e11) {
                s7.t.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e11);
            }
        }

        public static c d() {
            return f115915f;
        }

        private void f() {
            Choreographer choreographer = this.f115919d;
            if (choreographer != null) {
                int i11 = this.f115920e - 1;
                this.f115920e = i11;
                if (i11 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f115916a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f115917b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            this.f115916a = j11;
            ((Choreographer) s7.a.f(this.f115919d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f115917b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                c();
                return true;
            }
            if (i11 == 2) {
                b();
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public l(Context context) {
        b bVarF = f(context);
        this.f115897b = bVarF;
        this.f115898c = bVarF != null ? c.d() : null;
        this.f115906k = -9223372036854775807L;
        this.f115907l = -9223372036854775807L;
        this.f115901f = -1.0f;
        this.f115904i = 1.0f;
        this.f115905j = 0;
    }

    private static boolean c(long j11, long j12) {
        return Math.abs(j11 - j12) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f115900e) == null || this.f115905j == Integer.MIN_VALUE || this.f115903h == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f115903h = BitmapDescriptorFactory.HUE_RED;
        a.a(surface, BitmapDescriptorFactory.HUE_RED);
    }

    private static long e(long j11, long j12, long j13) {
        long j14;
        long j15 = j12 + (((j11 - j12) / j13) * j13);
        if (j11 <= j15) {
            j14 = j15 - j13;
        } else {
            long j16 = j13 + j15;
            j14 = j15;
            j15 = j16;
        }
        return j15 - j11 < j11 - j14 ? j15 : j14;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f115908m = 0L;
        this.f115911p = -1L;
        this.f115909n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f115906k = refreshRate;
            this.f115907l = (refreshRate * 80) / 100;
        } else {
            s7.t.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f115906k = -9223372036854775807L;
            this.f115907l = -9223372036854775807L;
        }
    }

    private void q() {
        if (Build.VERSION.SDK_INT < 30 || this.f115900e == null) {
            return;
        }
        float fB = this.f115896a.e() ? this.f115896a.b() : this.f115901f;
        float f11 = this.f115902g;
        if (fB == f11) {
            return;
        }
        if (fB != -1.0f && f11 != -1.0f) {
            if (Math.abs(fB - this.f115902g) < ((!this.f115896a.e() || this.f115896a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f115896a.c() < 30) {
            return;
        }
        this.f115902g = fB;
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z11) {
        Surface surface;
        float f11;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f115900e) == null || this.f115905j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f115899d) {
            float f12 = this.f115902g;
            if (f12 != -1.0f) {
                f11 = f12 * this.f115904i;
            } else {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        if (z11 || this.f115903h != f11) {
            this.f115903h = f11;
            a.a(surface, f11);
        }
    }

    public long b(long j11) {
        long j12;
        if (this.f115911p == -1 || !this.f115896a.e()) {
            j12 = j11;
        } else {
            long jA = this.f115912q + ((long) ((this.f115896a.a() * (this.f115908m - this.f115911p)) / this.f115904i));
            if (c(j11, jA)) {
                j12 = jA;
            } else {
                n();
                j12 = j11;
            }
        }
        this.f115909n = this.f115908m;
        this.f115910o = j12;
        c cVar = this.f115898c;
        if (cVar != null && this.f115906k != -9223372036854775807L) {
            long j13 = cVar.f115916a;
            if (j13 != -9223372036854775807L) {
                return e(j12, j13, this.f115906k) - this.f115907l;
            }
        }
        return j12;
    }

    public void g(float f11) {
        this.f115901f = f11;
        this.f115896a.g();
        q();
    }

    public void h(long j11) {
        long j12 = this.f115909n;
        if (j12 != -1) {
            this.f115911p = j12;
            this.f115912q = this.f115910o;
        }
        this.f115908m++;
        this.f115896a.f(j11 * 1000);
        q();
    }

    public void i(float f11) {
        this.f115904i = f11;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f115899d = true;
        n();
        if (this.f115897b != null) {
            ((c) s7.a.f(this.f115898c)).a();
            this.f115897b.b();
        }
        r(false);
    }

    public void l() {
        this.f115899d = false;
        b bVar = this.f115897b;
        if (bVar != null) {
            bVar.c();
            ((c) s7.a.f(this.f115898c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f115900e == surface) {
            return;
        }
        d();
        this.f115900e = surface;
        r(true);
    }

    public void o(int i11) {
        if (this.f115905j == i11) {
            return;
        }
        this.f115905j = i11;
        r(true);
    }

    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f115913a;

        public b(DisplayManager displayManager) {
            this.f115913a = displayManager;
        }

        private Display a() {
            return this.f115913a.getDisplay(0);
        }

        public void b() {
            this.f115913a.registerDisplayListener(this, q0.C());
            l.this.p(a());
        }

        public void c() {
            this.f115913a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            if (i11 == 0) {
                l.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }
}
