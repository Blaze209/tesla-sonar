package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f39528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f39529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0648c f39530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f39531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f39532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.exoplayer2.audio.b f39533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39534h;

    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) ts.a.e((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) ts.a.e((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$c, reason: collision with other inner class name */
    private final class C0648c extends AudioDeviceCallback {
        private C0648c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f39527a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f39527a));
        }
    }

    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f39536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f39537b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f39536a = contentResolver;
            this.f39537b = uri;
        }

        public void a() {
            this.f39536a.registerContentObserver(this.f39537b, false, this);
        }

        public void b() {
            this.f39536a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f39527a));
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            c.this.c(com.google.android.exoplayer2.audio.b.d(context, intent));
        }
    }

    public interface f {
        void a(com.google.android.exoplayer2.audio.b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f39527a = applicationContext;
        this.f39528b = (f) ts.a.e(fVar);
        Handler handlerX = p0.x();
        this.f39529c = handlerX;
        int i11 = p0.f115040a;
        Object[] objArr = 0;
        this.f39530d = i11 >= 23 ? new C0648c() : null;
        this.f39531e = i11 >= 21 ? new e() : null;
        Uri uriG = com.google.android.exoplayer2.audio.b.g();
        this.f39532f = uriG != null ? new d(handlerX, applicationContext.getContentResolver(), uriG) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.google.android.exoplayer2.audio.b bVar) {
        if (!this.f39534h || bVar.equals(this.f39533g)) {
            return;
        }
        this.f39533g = bVar;
        this.f39528b.a(bVar);
    }

    public com.google.android.exoplayer2.audio.b d() {
        C0648c c0648c;
        if (this.f39534h) {
            return (com.google.android.exoplayer2.audio.b) ts.a.e(this.f39533g);
        }
        this.f39534h = true;
        d dVar = this.f39532f;
        if (dVar != null) {
            dVar.a();
        }
        if (p0.f115040a >= 23 && (c0648c = this.f39530d) != null) {
            b.a(this.f39527a, c0648c, this.f39529c);
        }
        com.google.android.exoplayer2.audio.b bVarD = com.google.android.exoplayer2.audio.b.d(this.f39527a, this.f39531e != null ? this.f39527a.registerReceiver(this.f39531e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f39529c) : null);
        this.f39533g = bVarD;
        return bVarD;
    }

    public void e() {
        C0648c c0648c;
        if (this.f39534h) {
            this.f39533g = null;
            if (p0.f115040a >= 23 && (c0648c = this.f39530d) != null) {
                b.b(this.f39527a, c0648c);
            }
            BroadcastReceiver broadcastReceiver = this.f39531e;
            if (broadcastReceiver != null) {
                this.f39527a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f39532f;
            if (dVar != null) {
                dVar.b();
            }
            this.f39534h = false;
        }
    }
}
