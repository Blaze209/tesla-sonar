package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f42781e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Object f42782a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Handler f42783b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f42784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f42785d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0671b {
        void a(int i11);

        void show();
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final WeakReference<InterfaceC0671b> f42787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42789c;

        c(int i11, InterfaceC0671b interfaceC0671b) {
            this.f42787a = new WeakReference<>(interfaceC0671b);
            this.f42788b = i11;
        }

        boolean a(InterfaceC0671b interfaceC0671b) {
            return interfaceC0671b != null && this.f42787a.get() == interfaceC0671b;
        }
    }

    private b() {
    }

    private boolean a(@NonNull c cVar, int i11) {
        InterfaceC0671b interfaceC0671b = cVar.f42787a.get();
        if (interfaceC0671b == null) {
            return false;
        }
        this.f42783b.removeCallbacksAndMessages(cVar);
        interfaceC0671b.a(i11);
        return true;
    }

    static b c() {
        if (f42781e == null) {
            f42781e = new b();
        }
        return f42781e;
    }

    private boolean f(InterfaceC0671b interfaceC0671b) {
        c cVar = this.f42784c;
        return cVar != null && cVar.a(interfaceC0671b);
    }

    private boolean g(InterfaceC0671b interfaceC0671b) {
        c cVar = this.f42785d;
        return cVar != null && cVar.a(interfaceC0671b);
    }

    private void l(@NonNull c cVar) {
        int i11 = cVar.f42788b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f42783b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f42783b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i11);
    }

    private void n() {
        c cVar = this.f42785d;
        if (cVar != null) {
            this.f42784c = cVar;
            this.f42785d = null;
            InterfaceC0671b interfaceC0671b = cVar.f42787a.get();
            if (interfaceC0671b != null) {
                interfaceC0671b.show();
            } else {
                this.f42784c = null;
            }
        }
    }

    public void b(InterfaceC0671b interfaceC0671b, int i11) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    a(this.f42784c, i11);
                } else if (g(interfaceC0671b)) {
                    a(this.f42785d, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(@NonNull c cVar) {
        synchronized (this.f42782a) {
            try {
                if (this.f42784c == cVar || this.f42785d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(InterfaceC0671b interfaceC0671b) {
        boolean z11;
        synchronized (this.f42782a) {
            try {
                z11 = f(interfaceC0671b) || g(interfaceC0671b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public void h(InterfaceC0671b interfaceC0671b) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    this.f42784c = null;
                    if (this.f42785d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(InterfaceC0671b interfaceC0671b) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    l(this.f42784c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(InterfaceC0671b interfaceC0671b) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    c cVar = this.f42784c;
                    if (!cVar.f42789c) {
                        cVar.f42789c = true;
                        this.f42783b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(InterfaceC0671b interfaceC0671b) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    c cVar = this.f42784c;
                    if (cVar.f42789c) {
                        cVar.f42789c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i11, InterfaceC0671b interfaceC0671b) {
        synchronized (this.f42782a) {
            try {
                if (f(interfaceC0671b)) {
                    c cVar = this.f42784c;
                    cVar.f42788b = i11;
                    this.f42783b.removeCallbacksAndMessages(cVar);
                    l(this.f42784c);
                    return;
                }
                if (g(interfaceC0671b)) {
                    this.f42785d.f42788b = i11;
                } else {
                    this.f42785d = new c(i11, interfaceC0671b);
                }
                c cVar2 = this.f42784c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f42784c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
