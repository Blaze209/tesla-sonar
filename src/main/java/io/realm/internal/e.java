package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes9.dex */
class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue<h> f79079a;

    e(ReferenceQueue<h> referenceQueue) {
        this.f79079a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f79079a.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
