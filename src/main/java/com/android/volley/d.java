package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20178a;

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f20179a;

        a(Handler handler) {
            this.f20179a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f20179a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f20181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f20182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f20183c;

        public b(i iVar, k kVar, Runnable runnable) {
            this.f20181a = iVar;
            this.f20182b = kVar;
            this.f20183c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20181a.isCanceled()) {
                this.f20181a.finish("canceled-at-delivery");
                return;
            }
            if (this.f20182b.b()) {
                this.f20181a.deliverResponse(this.f20182b.f20211a);
            } else {
                this.f20181a.deliverError(this.f20182b.f20213c);
            }
            if (this.f20182b.f20214d) {
                this.f20181a.addMarker("intermediate-response");
            } else {
                this.f20181a.finish("done");
            }
            Runnable runnable = this.f20183c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public d(Handler handler) {
        this.f20178a = new a(handler);
    }

    @Override // com.android.volley.l
    public void a(i<?> iVar, k<?> kVar) {
        b(iVar, kVar, null);
    }

    @Override // com.android.volley.l
    public void b(i<?> iVar, k<?> kVar, Runnable runnable) {
        iVar.markDelivered();
        iVar.addMarker("post-response");
        this.f20178a.execute(new b(iVar, kVar, runnable));
    }

    @Override // com.android.volley.l
    public void c(i<?> iVar, VolleyError volleyError) {
        iVar.addMarker("post-error");
        this.f20178a.execute(new b(iVar, k.a(volleyError), null));
    }
}
