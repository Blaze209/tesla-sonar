package us;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.GlUtil;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f116625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f116626e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f116628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f116629c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.exoplayer2.util.a f116630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f116631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f116632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f116633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h f116634e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i11) throws GlUtil.GlException {
            ts.a.e(this.f116630a);
            this.f116630a.h(i11);
            this.f116634e = new h(this, this.f116630a.g(), i11 != 0);
        }

        private void d() {
            ts.a.e(this.f116630a);
            this.f116630a.i();
        }

        public h a(int i11) {
            boolean z11;
            start();
            this.f116631b = new Handler(getLooper(), this);
            this.f116630a = new com.google.android.exoplayer2.util.a(this.f116631b);
            synchronized (this) {
                z11 = false;
                this.f116631b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f116634e == null && this.f116633d == null && this.f116632c == null) {
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
            RuntimeException runtimeException = this.f116633d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f116632c;
            if (error == null) {
                return (h) ts.a.e(this.f116634e);
            }
            throw error;
        }

        public void c() {
            ts.a.e(this.f116631b);
            this.f116631b.sendEmptyMessage(2);
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
                            ts.u.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                    ts.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f116633d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    ts.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f116632c = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    ts.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f116633d = e13;
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
        if (GlUtil.h(context)) {
            return GlUtil.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f116626e) {
                f116625d = a(context);
                f116626e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f116625d != 0;
    }

    public static h c(Context context, boolean z11) {
        ts.a.g(!z11 || b(context));
        return new b().a(z11 ? f116625d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f116628b) {
            try {
                if (!this.f116629c) {
                    this.f116628b.c();
                    this.f116629c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h(b bVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f116628b = bVar;
        this.f116627a = z11;
    }
}
