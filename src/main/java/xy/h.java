package xy;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jn0.h0;
import org.webrtc.MediaStreamTrack;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f124065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final AudioManager f124066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f124067c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<Class<? extends rf0.c>> f124070f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private rf0.f f124072h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public p<? super List<? extends rf0.c>, ? super rf0.c, h0> f124068d = new p() { // from class: xy.c
        @Override // wn0.p
        public final Object invoke(Object obj, Object obj2) {
            return h.a((List) obj, (rf0.c) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public AudioManager.OnAudioFocusChangeListener f124069e = new AudioManager.OnAudioFocusChangeListener() { // from class: xy.d
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i11) {
            h.c(i11);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f124071g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f124073i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f124074j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124075k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f124076l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f124077m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f124078n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f124079o = false;

    public h(@NonNull Context context) {
        this.f124065a = context;
        this.f124066b = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        ArrayList arrayList = new ArrayList();
        this.f124070f = arrayList;
        arrayList.add(rf0.c.BluetoothHeadset.class);
        this.f124070f.add(rf0.c.WiredHeadset.class);
        this.f124070f.add(rf0.c.Speakerphone.class);
        this.f124070f.add(rf0.c.Earpiece.class);
    }

    public static /* synthetic */ h0 a(List list, rf0.c cVar) {
        return null;
    }

    public static /* synthetic */ void c(int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Class cls) {
        rf0.c next;
        if (this.f124072h != null) {
            Iterator<rf0.c> it = f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.getClass().equals(cls));
            if (next != null) {
                this.f124072h.u(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        rf0.f fVar = new rf0.f(this.f124065a, this.f124067c, this.f124069e, this.f124070f);
        this.f124072h = fVar;
        fVar.B(this.f124073i);
        this.f124072h.z(this.f124074j);
        this.f124072h.x(this.f124075k);
        this.f124072h.y(this.f124076l);
        this.f124072h.v(this.f124078n);
        this.f124072h.w(this.f124077m);
        this.f124072h.A(this.f124079o);
        this.f124072h.E(this.f124068d);
        this.f124072h.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            fVar.F();
        }
        this.f124072h = null;
    }

    @NonNull
    public List<rf0.c> f() {
        rf0.f fVar = this.f124072h;
        return fVar != null ? fVar.i() : Collections.EMPTY_LIST;
    }

    public void j(@NonNull final Class<? extends rf0.c> cls) {
        this.f124071g.post(new Runnable() { // from class: xy.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f124061a.g(cls);
            }
        });
    }

    public void k(a aVar) {
        if (aVar != null) {
            j(aVar.audioDeviceClass);
        }
    }

    public void l(int i11) {
        this.f124078n = i11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.v(this.f124078n);
        }
    }

    public void m(int i11) {
        this.f124077m = i11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.w(this.f124077m);
        }
    }

    public void n(int i11) {
        this.f124075k = i11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.x(this.f124075k);
        }
    }

    public void o(int i11) {
        this.f124076l = i11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.y(this.f124076l);
        }
    }

    public void p(int i11) {
        this.f124074j = i11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.z(this.f124074j);
        }
    }

    public void q(boolean z11) {
        this.f124079o = z11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.A(this.f124079o);
        }
    }

    public void r(boolean z11) {
        this.f124073i = z11;
        rf0.f fVar = this.f124072h;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.B(this.f124073i);
        }
    }

    public void s() {
        if (this.f124072h == null) {
            this.f124071g.removeCallbacksAndMessages(null);
            this.f124071g.postAtFrontOfQueue(new Runnable() { // from class: xy.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124063a.h();
                }
            });
        }
    }

    public void t() {
        this.f124071g.removeCallbacksAndMessages(null);
        this.f124071g.postAtFrontOfQueue(new Runnable() { // from class: xy.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f124064a.i();
            }
        });
    }
}
