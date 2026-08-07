package com.plaid.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.plaid.internal.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4561v7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4572x0 f48182d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f48183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f48184b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48185c = 120000;

    /* JADX INFO: renamed from: com.plaid.internal.v7$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4519r1 f48186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RunnableC0760a f48187b = new RunnableC0760a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48188c = false;

        /* JADX INFO: renamed from: com.plaid.internal.v7$a$a, reason: collision with other inner class name */
        public class RunnableC0760a implements Runnable {
            public RunnableC0760a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (aVar.f48188c) {
                    return;
                }
                C4561v7.f48182d.a(W3.INFO, "release http client", new Object[0]);
                aVar.f48188c = true;
                aVar.f48186a.a();
            }
        }

        public a(InterfaceC4519r1 interfaceC4519r1) {
            this.f48186a = interfaceC4519r1;
        }
    }

    static {
        W3 w11 = Z3.f46846a;
        f48182d = new C4572x0("reuse-network");
    }

    public final void a() {
        synchronized (this) {
            b();
        }
    }

    public final synchronized void b() {
        try {
            if (this.f48183a != null) {
                C4572x0 c4572x0 = f48182d;
                c4572x0.a(W3.DEBUG, "release cached http client", new Object[0]);
                this.f48184b.removeCallbacks(this.f48183a.f48187b);
                a aVar = this.f48183a;
                if (!aVar.f48188c) {
                    c4572x0.a(W3.INFO, "release http client", new Object[0]);
                    aVar.f48188c = true;
                    aVar.f48186a.a();
                }
                this.f48183a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000e, B:14:0x0018, B:16:0x0042, B:18:0x0046, B:12:0x0014, B:15:0x002d), top: B:23:0x0001 }] */
    public final synchronized void a(InterfaceC4519r1 interfaceC4519r1) {
        try {
            if (interfaceC4519r1 == null) {
                b();
            } else {
                a aVar = this.f48183a;
                if (aVar != null) {
                    if ((aVar.f48188c ? null : aVar.f48186a) == interfaceC4519r1) {
                        f48182d.a(W3.INFO, "reuse cached http client", new Object[0]);
                        this.f48184b.removeCallbacks(this.f48183a.f48187b);
                    } else {
                        b();
                        f48182d.a(W3.INFO, "cache http client", new Object[0]);
                        this.f48183a = new a(interfaceC4519r1);
                    }
                } else {
                    b();
                    f48182d.a(W3.INFO, "cache http client", new Object[0]);
                    this.f48183a = new a(interfaceC4519r1);
                }
                int i11 = this.f48185c;
                if (i11 > 0) {
                    f48182d.a(W3.INFO, "schedule http client release in %d ms", Integer.valueOf(i11));
                    this.f48184b.postDelayed(this.f48183a.f48187b, this.f48185c);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
