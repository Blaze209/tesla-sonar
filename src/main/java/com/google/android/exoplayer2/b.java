package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f39665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39666c;

    private final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0649b f39667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f39668b;

        public a(Handler handler, InterfaceC0649b interfaceC0649b) {
            this.f39668b = handler;
            this.f39667a = interfaceC0649b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f39668b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f39666c) {
                this.f39667a.n();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0649b {
        void n();
    }

    public b(Context context, Handler handler, InterfaceC0649b interfaceC0649b) {
        this.f39664a = context.getApplicationContext();
        this.f39665b = new a(handler, interfaceC0649b);
    }

    public void b(boolean z11) {
        if (z11 && !this.f39666c) {
            this.f39664a.registerReceiver(this.f39665b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f39666c = true;
        } else {
            if (z11 || !this.f39666c) {
                return;
            }
            this.f39664a.unregisterReceiver(this.f39665b);
            this.f39666c = false;
        }
    }
}
