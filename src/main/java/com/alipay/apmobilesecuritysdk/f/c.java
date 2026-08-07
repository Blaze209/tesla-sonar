package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20086a;

    public c(b bVar) {
        this.f20086a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f20086a.f20085c.isEmpty()) {
                Runnable runnable = (Runnable) this.f20086a.f20085c.get(0);
                this.f20086a.f20085c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            this.f20086a.f20084b = null;
            throw th2;
        }
        this.f20086a.f20084b = null;
    }
}
