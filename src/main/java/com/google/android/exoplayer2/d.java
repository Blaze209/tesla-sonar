package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f39704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f39705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f39706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f39707d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39709f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f39711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39712i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39710g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39708e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f39713a;

        public a(Handler handler) {
            this.f39713a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i11) {
            this.f39713a.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.h(i11);
                }
            });
        }
    }

    public interface b {
        void t(float f11);

        void u(int i11);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f39704a = (AudioManager) ts.a.e((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f39706c = bVar;
        this.f39705b = new a(handler);
    }

    private void a() {
        this.f39704a.abandonAudioFocus(this.f39705b);
    }

    private void b() {
        if (this.f39708e == 0) {
            return;
        }
        if (ts.p0.f115040a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f39711h;
        if (audioFocusRequest != null) {
            this.f39704a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(com.google.android.exoplayer2.audio.a aVar) {
        if (aVar == null) {
            return 0;
        }
        switch (aVar.f39511c) {
            case 0:
                ts.u.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (aVar.f39509a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                ts.u.i("AudioFocusManager", "Unidentified audio usage: " + aVar.f39511c);
                return 0;
            case 16:
                return ts.p0.f115040a >= 19 ? 4 : 2;
        }
    }

    private void f(int i11) {
        b bVar = this.f39706c;
        if (bVar != null) {
            bVar.u(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i11) {
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2 && !q()) {
                n(3);
                return;
            } else {
                f(0);
                n(2);
                return;
            }
        }
        if (i11 == -1) {
            f(-1);
            b();
        } else if (i11 == 1) {
            n(1);
            f(1);
        } else {
            ts.u.i("AudioFocusManager", "Unknown focus change type: " + i11);
        }
    }

    private int j() {
        if (this.f39708e == 1) {
            return 1;
        }
        if ((ts.p0.f115040a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f39704a.requestAudioFocus(this.f39705b, ts.p0.e0(((com.google.android.exoplayer2.audio.a) ts.a.e(this.f39707d)).f39511c), this.f39709f);
    }

    private int l() {
        AudioFocusRequest.Builder builderA;
        AudioFocusRequest audioFocusRequest = this.f39711h;
        if (audioFocusRequest == null || this.f39712i) {
            if (audioFocusRequest == null) {
                br.b.a();
                builderA = q7.a.a(this.f39709f);
            } else {
                br.b.a();
                builderA = br.a.a(this.f39711h);
            }
            this.f39711h = builderA.setAudioAttributes(((com.google.android.exoplayer2.audio.a) ts.a.e(this.f39707d)).b().f39515a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f39705b).build();
            this.f39712i = false;
        }
        return this.f39704a.requestAudioFocus(this.f39711h);
    }

    private void n(int i11) {
        if (this.f39708e == i11) {
            return;
        }
        this.f39708e = i11;
        float f11 = i11 == 3 ? 0.2f : 1.0f;
        if (this.f39710g == f11) {
            return;
        }
        this.f39710g = f11;
        b bVar = this.f39706c;
        if (bVar != null) {
            bVar.t(f11);
        }
    }

    private boolean o(int i11) {
        return i11 == 1 || this.f39709f != 1;
    }

    private boolean q() {
        com.google.android.exoplayer2.audio.a aVar = this.f39707d;
        return aVar != null && aVar.f39509a == 1;
    }

    public float g() {
        return this.f39710g;
    }

    public void i() {
        this.f39706c = null;
        b();
    }

    public void m(com.google.android.exoplayer2.audio.a aVar) {
        if (ts.p0.c(this.f39707d, aVar)) {
            return;
        }
        this.f39707d = aVar;
        int iE = e(aVar);
        this.f39709f = iE;
        boolean z11 = true;
        if (iE != 1 && iE != 0) {
            z11 = false;
        }
        ts.a.b(z11, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z11, int i11) {
        if (o(i11)) {
            b();
            return z11 ? 1 : -1;
        }
        if (z11) {
            return j();
        }
        return -1;
    }
}
