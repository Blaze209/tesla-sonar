package u8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f115865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f115866e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f115868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f115869c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.a f115870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f115871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f115872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f115873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f115874e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i11) throws GlUtil.GlException {
            s7.a.f(this.f115870a);
            this.f115870a.h(i11);
            this.f115874e = new c(this, this.f115870a.g(), i11 != 0);
        }

        private void d() {
            s7.a.f(this.f115870a);
            this.f115870a.i();
        }

        public c a(int i11) {
            boolean z11;
            start();
            this.f115871b = new Handler(getLooper(), this);
            this.f115870a = new androidx.media3.common.util.a(this.f115871b);
            synchronized (this) {
                z11 = false;
                this.f115871b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f115874e == null && this.f115873d == null && this.f115872c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f115873d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f115872c;
            if (error == null) {
                return (c) s7.a.f(this.f115874e);
            }
            throw error;
        }

        public void c() {
            s7.a.f(this.f115871b);
            this.f115871b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            try {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            s7.t.e("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e11) {
                    s7.t.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f115873d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    s7.t.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f115872c = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    s7.t.e("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f115873d = e13;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }
    }

    private static int a(Context context) {
        try {
            if (GlUtil.m(context)) {
                return GlUtil.n() ? 1 : 2;
            }
            return 0;
        } catch (GlUtil.GlException e11) {
            s7.t.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e11.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f115866e) {
                f115865d = a(context);
                f115866e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f115865d != 0;
    }

    public static c c(Context context, boolean z11) {
        s7.a.h(!z11 || b(context));
        return new b().a(z11 ? f115865d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f115868b) {
            try {
                if (!this.f115869c) {
                    this.f115868b.c();
                    this.f115869c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c(b bVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f115868b = bVar;
        this.f115867a = z11;
    }
}
