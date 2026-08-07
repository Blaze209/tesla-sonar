package q7;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f104852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f104853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f104854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p7.d f104855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f104856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f104857f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f104858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f104859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f104860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p7.d f104861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f104862e;

        public c a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f104859b;
            if (onAudioFocusChangeListener != null) {
                return new c(this.f104858a, onAudioFocusChangeListener, (Handler) s7.a.f(this.f104860c), this.f104861d, this.f104862e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(p7.d dVar) {
            s7.a.f(dVar);
            this.f104861d = dVar;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            s7.a.f(onAudioFocusChangeListener);
            s7.a.f(handler);
            this.f104859b = onAudioFocusChangeListener;
            this.f104860c = handler;
            return this;
        }

        public b d(boolean z11) {
            this.f104862e = z11;
            return this;
        }

        public b(int i11) {
            this.f104861d = p7.d.f101231h;
            this.f104858a = i11;
        }

        private b(c cVar) {
            this.f104858a = cVar.e();
            this.f104859b = cVar.f();
            this.f104860c = cVar.d();
            this.f104861d = cVar.b();
            this.f104862e = cVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q7.c$c, reason: collision with other inner class name */
    static class C2215c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f104863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f104864b;

        C2215c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f104864b = onAudioFocusChangeListener;
            this.f104863a = q0.B(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i11) {
            q0.m1(this.f104863a, new Runnable() { // from class: q7.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104865a.f104864b.onAudioFocusChange(i11);
                }
            });
        }
    }

    c(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, p7.d dVar, boolean z11) {
        this.f104852a = i11;
        this.f104854c = handler;
        this.f104855d = dVar;
        this.f104856e = z11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            this.f104853b = new C2215c(onAudioFocusChangeListener, handler);
        } else {
            this.f104853b = onAudioFocusChangeListener;
        }
        if (i12 >= 26) {
            this.f104857f = q7.a.a(i11).setAudioAttributes(dVar.b().f101245a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f104857f = null;
        }
    }

    public b a() {
        return new b();
    }

    public p7.d b() {
        return this.f104855d;
    }

    AudioFocusRequest c() {
        return q7.b.a(s7.a.f(this.f104857f));
    }

    public Handler d() {
        return this.f104854c;
    }

    public int e() {
        return this.f104852a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f104852a == cVar.f104852a && this.f104856e == cVar.f104856e && Objects.equals(this.f104853b, cVar.f104853b) && Objects.equals(this.f104854c, cVar.f104854c) && Objects.equals(this.f104855d, cVar.f104855d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f104853b;
    }

    public boolean g() {
        return this.f104856e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f104852a), this.f104853b, this.f104854c, this.f104855d, Boolean.valueOf(this.f104856e));
    }
}
