package us;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final us.e f116653a = new us.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f116654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f116655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f116656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f116657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f116658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f116659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f116660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f116661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f116662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f116663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f116664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f116665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f116666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f116667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f116668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f116669q;

    private static final class a {
        public static void a(Surface surface, float f11) {
            try {
                surface.setFrameRate(f11, f11 == BitmapDescriptorFactory.HUE_RED ? 0 : 1);
            } catch (IllegalStateException e11) {
                ts.u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final e f116673f = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f116674a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f116675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f116676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f116677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f116678e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f116676c = handlerThread;
            handlerThread.start();
            Handler handlerU = p0.u(handlerThread.getLooper(), this);
            this.f116675b = handlerU;
            handlerU.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f116677d;
            if (choreographer != null) {
                int i11 = this.f116678e + 1;
                this.f116678e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f116677d = Choreographer.getInstance();
            } catch (RuntimeException e11) {
                ts.u.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e11);
            }
        }

        public static e d() {
            return f116673f;
        }

        private void f() {
            Choreographer choreographer = this.f116677d;
            if (choreographer != null) {
                int i11 = this.f116678e - 1;
                this.f116678e = i11;
                if (i11 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f116674a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f116675b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            this.f116674a = j11;
            ((Choreographer) ts.a.e(this.f116677d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f116675b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                c();
                return true;
            }
            if (i11 == 1) {
                b();
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public m(Context context) {
        b bVarF = f(context);
        this.f116654b = bVarF;
        this.f116655c = bVarF != null ? e.d() : null;
        this.f116663k = -9223372036854775807L;
        this.f116664l = -9223372036854775807L;
        this.f116658f = -1.0f;
        this.f116661i = 1.0f;
        this.f116662j = 0;
    }

    private static boolean c(long j11, long j12) {
        return Math.abs(j11 - j12) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (p0.f115040a < 30 || (surface = this.f116657e) == null || this.f116662j == Integer.MIN_VALUE || this.f116660h == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f116660h = BitmapDescriptorFactory.HUE_RED;
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

    private static b f(Context context) {
        b bVarD = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            bVarD = p0.f115040a >= 17 ? d.d(applicationContext) : null;
            if (bVarD == null) {
                return c.c(applicationContext);
            }
        }
        return bVarD;
    }

    private void n() {
        this.f116665m = 0L;
        this.f116668p = -1L;
        this.f116666n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f116663k = refreshRate;
            this.f116664l = (refreshRate * 80) / 100;
        } else {
            ts.u.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f116663k = -9223372036854775807L;
            this.f116664l = -9223372036854775807L;
        }
    }

    private void q() {
        if (p0.f115040a < 30 || this.f116657e == null) {
            return;
        }
        float fB = this.f116653a.e() ? this.f116653a.b() : this.f116658f;
        float f11 = this.f116659g;
        if (fB == f11) {
            return;
        }
        if (fB != -1.0f && f11 != -1.0f) {
            if (Math.abs(fB - this.f116659g) < ((!this.f116653a.e() || this.f116653a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f116653a.c() < 30) {
            return;
        }
        this.f116659g = fB;
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z11) {
        Surface surface;
        float f11;
        if (p0.f115040a < 30 || (surface = this.f116657e) == null || this.f116662j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f116656d) {
            float f12 = this.f116659g;
            if (f12 != -1.0f) {
                f11 = f12 * this.f116661i;
            } else {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        if (z11 || this.f116660h != f11) {
            this.f116660h = f11;
            a.a(surface, f11);
        }
    }

    public long b(long j11) {
        long j12;
        if (this.f116668p == -1 || !this.f116653a.e()) {
            j12 = j11;
        } else {
            long jA = this.f116669q + ((long) ((this.f116653a.a() * (this.f116665m - this.f116668p)) / this.f116661i));
            if (c(j11, jA)) {
                j12 = jA;
            } else {
                n();
                j12 = j11;
            }
        }
        this.f116666n = this.f116665m;
        this.f116667o = j12;
        e eVar = this.f116655c;
        if (eVar != null && this.f116663k != -9223372036854775807L) {
            long j13 = eVar.f116674a;
            if (j13 != -9223372036854775807L) {
                return e(j12, j13, this.f116663k) - this.f116664l;
            }
        }
        return j12;
    }

    public void g(float f11) {
        this.f116658f = f11;
        this.f116653a.g();
        q();
    }

    public void h(long j11) {
        long j12 = this.f116666n;
        if (j12 != -1) {
            this.f116668p = j12;
            this.f116669q = this.f116667o;
        }
        this.f116665m++;
        this.f116653a.f(j11 * 1000);
        q();
    }

    public void i(float f11) {
        this.f116661i = f11;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f116656d = true;
        n();
        if (this.f116654b != null) {
            ((e) ts.a.e(this.f116655c)).a();
            this.f116654b.b(new b.a() { // from class: us.l
                @Override // us.m.b.a
                public final void a(Display display) {
                    this.f116652a.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f116656d = false;
        b bVar = this.f116654b;
        if (bVar != null) {
            bVar.a();
            ((e) ts.a.e(this.f116655c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof h) {
            surface = null;
        }
        if (this.f116657e == surface) {
            return;
        }
        d();
        this.f116657e = surface;
        r(true);
    }

    public void o(int i11) {
        if (this.f116662j == i11) {
            return;
        }
        this.f116662j = i11;
        r(true);
    }

    private static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f116670a;

        private c(WindowManager windowManager) {
            this.f116670a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // us.m.b
        public void b(b.a aVar) {
            aVar.a(this.f116670a.getDefaultDisplay());
        }

        @Override // us.m.b
        public void a() {
        }
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f116671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b.a f116672b;

        private d(DisplayManager displayManager) {
            this.f116671a = displayManager;
        }

        private Display c() {
            return this.f116671a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // us.m.b
        public void a() {
            this.f116671a.unregisterDisplayListener(this);
            this.f116672b = null;
        }

        @Override // us.m.b
        public void b(b.a aVar) {
            this.f116672b = aVar;
            this.f116671a.registerDisplayListener(this, p0.v());
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            b.a aVar = this.f116672b;
            if (aVar == null || i11 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }
}
