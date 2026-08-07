package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f39696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f39697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f39698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f39699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39702h;

    public interface b {
        void q(int i11);

        void z(int i11, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = c2.this.f39696b;
            final c2 c2Var = c2.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.d2
                @Override // java.lang.Runnable
                public final void run() {
                    c2Var.i();
                }
            });
        }
    }

    public c2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f39695a = applicationContext;
        this.f39696b = handler;
        this.f39697c = bVar;
        AudioManager audioManager = (AudioManager) ts.a.i((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f39698d = audioManager;
        this.f39700f = 3;
        this.f39701g = f(audioManager, 3);
        this.f39702h = e(audioManager, this.f39700f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f39699e = cVar;
        } catch (RuntimeException e11) {
            ts.u.j("StreamVolumeManager", "Error registering stream volume receiver", e11);
        }
    }

    private static boolean e(AudioManager audioManager, int i11) {
        if (ts.p0.f115040a >= 23) {
            return audioManager.isStreamMute(i11);
        }
        return f(audioManager, i11) == 0;
    }

    private static int f(AudioManager audioManager, int i11) {
        try {
            return audioManager.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            ts.u.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i11, e11);
            return audioManager.getStreamMaxVolume(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int iF = f(this.f39698d, this.f39700f);
        boolean zE = e(this.f39698d, this.f39700f);
        if (this.f39701g == iF && this.f39702h == zE) {
            return;
        }
        this.f39701g = iF;
        this.f39702h = zE;
        this.f39697c.z(iF, zE);
    }

    public int c() {
        return this.f39698d.getStreamMaxVolume(this.f39700f);
    }

    public int d() {
        if (ts.p0.f115040a >= 28) {
            return this.f39698d.getStreamMinVolume(this.f39700f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f39699e;
        if (cVar != null) {
            try {
                this.f39695a.unregisterReceiver(cVar);
            } catch (RuntimeException e11) {
                ts.u.j("StreamVolumeManager", "Error unregistering stream volume receiver", e11);
            }
            this.f39699e = null;
        }
    }

    public void h(int i11) {
        if (this.f39700f == i11) {
            return;
        }
        this.f39700f = i11;
        i();
        this.f39697c.q(i11);
    }
}
