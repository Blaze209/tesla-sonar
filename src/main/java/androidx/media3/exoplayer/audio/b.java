package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f9453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f9454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f9455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f9456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f9457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f9458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f9459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p7.d f9460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9461j;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    private static final class C0195b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            q7.f.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            q7.f.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f9452a, b.this.f9460i, b.this.f9459h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (q0.u(audioDeviceInfoArr, b.this.f9459h)) {
                b.this.f9459h = null;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f9452a, b.this.f9460i, b.this.f9459h));
        }
    }

    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f9463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f9464b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f9463a = contentResolver;
            this.f9464b = uri;
        }

        public void a() {
            this.f9463a.registerContentObserver(this.f9464b, false, this);
        }

        public void b() {
            this.f9463a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f9452a, b.this.f9460i, b.this.f9459h));
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
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(context, intent, bVar.f9460i, b.this.f9459h));
        }
    }

    public interface f {
        void a(androidx.media3.exoplayer.audio.a aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Context context, f fVar, p7.d dVar, androidx.media3.exoplayer.audio.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9452a = applicationContext;
        this.f9453b = (f) s7.a.f(fVar);
        this.f9460i = dVar;
        this.f9459h = cVar;
        Handler handlerE = q0.E();
        this.f9454c = handlerE;
        this.f9455d = new c();
        this.f9456e = new e();
        Uri uriI = androidx.media3.exoplayer.audio.a.i();
        this.f9457f = uriI != null ? new d(handlerE, applicationContext.getContentResolver(), uriI) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.a aVar) {
        if (!this.f9461j || aVar.equals(this.f9458g)) {
            return;
        }
        this.f9458g = aVar;
        this.f9453b.a(aVar);
    }

    public void g(androidx.media3.exoplayer.audio.a aVar) {
        f(aVar);
    }

    public androidx.media3.exoplayer.audio.a h() {
        if (this.f9461j) {
            return (androidx.media3.exoplayer.audio.a) s7.a.f(this.f9458g);
        }
        this.f9461j = true;
        d dVar = this.f9457f;
        if (dVar != null) {
            dVar.a();
        }
        c cVar = this.f9455d;
        if (cVar != null) {
            C0195b.a(this.f9452a, cVar, this.f9454c);
        }
        androidx.media3.exoplayer.audio.a aVarE = androidx.media3.exoplayer.audio.a.e(this.f9452a, this.f9452a.registerReceiver(this.f9456e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f9454c), this.f9460i, this.f9459h);
        this.f9458g = aVarE;
        return aVarE;
    }

    public void i(p7.d dVar) {
        this.f9460i = dVar;
        f(androidx.media3.exoplayer.audio.a.f(this.f9452a, dVar, this.f9459h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.c cVar = this.f9459h;
        if (Objects.equals(audioDeviceInfo, cVar == null ? null : cVar.f9467a)) {
            return;
        }
        androidx.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f9459h = cVar2;
        f(androidx.media3.exoplayer.audio.a.f(this.f9452a, this.f9460i, cVar2));
    }

    public void k() {
        if (this.f9461j) {
            this.f9458g = null;
            c cVar = this.f9455d;
            if (cVar != null) {
                C0195b.b(this.f9452a, cVar);
            }
            this.f9452a.unregisterReceiver(this.f9456e);
            d dVar = this.f9457f;
            if (dVar != null) {
                dVar.b();
            }
            this.f9461j = false;
        }
    }
}
