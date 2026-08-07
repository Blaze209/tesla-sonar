package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.p f9566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9567d;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f9568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s7.p f9569b;

        public a(s7.p pVar, b bVar) {
            this.f9569b = pVar;
            this.f9568a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (d.this.f9567d) {
                this.f9568a.n();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9569b.g(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9545a.b();
                    }
                });
            }
        }
    }

    public interface b {
        void n();
    }

    public d(Context context, Looper looper, Looper looper2, b bVar, s7.j jVar) {
        this.f9564a = context.getApplicationContext();
        this.f9566c = jVar.c(looper, null);
        this.f9565b = new a(jVar.c(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z11) {
        if (z11 == this.f9567d) {
            return;
        }
        if (z11) {
            this.f9566c.g(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f9330a;
                    dVar.f9564a.registerReceiver(dVar.f9565b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f9567d = true;
        } else {
            this.f9566c.g(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f9537a;
                    dVar.f9564a.unregisterReceiver(dVar.f9565b);
                }
            });
            this.f9567d = false;
        }
    }
}
