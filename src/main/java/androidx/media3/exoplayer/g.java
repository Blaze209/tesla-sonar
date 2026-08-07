package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ou.x<AudioManager> f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f9844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p7.d f9845d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9847f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q7.c f9849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9850i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f9848g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9846e = 0;

    public interface a {
        void t(float f11);

        void u(int i11);
    }

    public g(final Context context, Looper looper, a aVar) {
        this.f9842a = ou.y.a(new ou.x() { // from class: androidx.media3.exoplayer.f
            @Override // ou.x
            public final Object get() {
                return q7.f.c(context);
            }
        });
        this.f9844c = aVar;
        this.f9843b = new Handler(looper);
    }

    private void c() {
        int i11 = this.f9846e;
        if (i11 == 1 || i11 == 0 || this.f9849h == null) {
            return;
        }
        q7.f.b(this.f9842a.get(), this.f9849h);
    }

    private static int d(p7.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f101240c) {
            case 0:
                s7.t.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (dVar.f101238a == 1) {
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
                s7.t.i("AudioFocusManager", "Unidentified audio usage: " + dVar.f101240c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i11) {
        a aVar = this.f9844c;
        if (aVar != null) {
            aVar.u(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i11) {
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i11 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i11 == 1) {
            l(2);
            e(1);
        } else {
            s7.t.i("AudioFocusManager", "Unknown focus change type: " + i11);
        }
    }

    private int i() {
        if (this.f9846e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        q7.c cVar = this.f9849h;
        if (cVar == null || this.f9850i) {
            this.f9849h = (cVar == null ? new q7.c.b(this.f9847f) : cVar.a()).b((p7.d) s7.a.f(this.f9845d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i11) {
                    this.f9822a.g(i11);
                }
            }, this.f9843b).a();
            this.f9850i = false;
        }
        return q7.f.h(this.f9842a.get(), this.f9849h);
    }

    private void l(int i11) {
        if (this.f9846e == i11) {
            return;
        }
        this.f9846e = i11;
        float f11 = i11 == 4 ? 0.2f : 1.0f;
        if (this.f9848g == f11) {
            return;
        }
        this.f9848g = f11;
        a aVar = this.f9844c;
        if (aVar != null) {
            aVar.t(f11);
        }
    }

    private boolean m(int i11) {
        return i11 != 1 && this.f9847f == 1;
    }

    private boolean o() {
        p7.d dVar = this.f9845d;
        return dVar != null && dVar.f101238a == 1;
    }

    public float f() {
        return this.f9848g;
    }

    public void h() {
        this.f9844c = null;
        c();
        l(0);
    }

    public void k(p7.d dVar) {
        if (Objects.equals(this.f9845d, dVar)) {
            return;
        }
        this.f9845d = dVar;
        int iD = d(dVar);
        this.f9847f = iD;
        boolean z11 = true;
        if (iD != 1 && iD != 0) {
            z11 = false;
        }
        s7.a.b(z11, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z11, int i11) {
        if (!m(i11)) {
            c();
            l(0);
            return 1;
        }
        if (z11) {
            return i();
        }
        int i12 = this.f9846e;
        if (i12 != 1) {
            return i12 != 3 ? 1 : 0;
        }
        return -1;
    }
}
