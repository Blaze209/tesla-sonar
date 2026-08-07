package androidx.media3.common.audio;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f9069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f9070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f9071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f9072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f9073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AudioProcessor.a f9074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f9076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f9077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f9078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f9079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f9080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9082q;

    public d() {
        this(false);
    }

    private boolean f() {
        return Math.abs(this.f9069d - 1.0f) < 1.0E-4f && Math.abs(this.f9070e - 1.0f) < 1.0E-4f && this.f9072g.f9027a == this.f9071f.f9027a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        if (!this.f9082q) {
            return false;
        }
        c cVar = this.f9076k;
        return cVar == null || cVar.k() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c cVar = (c) s7.a.f(this.f9076k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f9080o += (long) iRemaining;
            cVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void c() {
        c cVar = this.f9076k;
        if (cVar != null) {
            cVar.s();
        }
        this.f9082q = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        int iK;
        c cVar = this.f9076k;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f9077l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f9077l = byteBufferOrder;
                this.f9078m = byteBufferOrder.asShortBuffer();
            } else {
                this.f9077l.clear();
                this.f9078m.clear();
            }
            cVar.j(this.f9078m);
            this.f9081p += (long) iK;
            this.f9077l.limit(iK);
            this.f9079n = this.f9077l;
        }
        ByteBuffer byteBuffer = this.f9079n;
        this.f9079n = AudioProcessor.f9024a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f9029c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i11 = this.f9068c;
        if (i11 == -1) {
            i11 = aVar.f9027a;
        }
        this.f9071f = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i11, aVar.f9028b, 2);
        this.f9072g = aVar2;
        this.f9075j = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f9071f;
            this.f9073h = aVar;
            AudioProcessor.a aVar2 = this.f9072g;
            this.f9074i = aVar2;
            if (this.f9075j) {
                this.f9076k = new c(aVar.f9027a, aVar.f9028b, this.f9069d, this.f9070e, aVar2.f9027a);
            } else {
                c cVar = this.f9076k;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f9079n = AudioProcessor.f9024a;
        this.f9080o = 0L;
        this.f9081p = 0L;
        this.f9082q = false;
    }

    public long g(long j11) {
        if (this.f9081p < 1024) {
            return (long) (((double) this.f9069d) * j11);
        }
        long jL = this.f9080o - ((long) ((c) s7.a.f(this.f9076k)).l());
        int i11 = this.f9074i.f9027a;
        int i12 = this.f9073h.f9027a;
        return i11 == i12 ? q0.s1(j11, jL, this.f9081p) : q0.s1(j11, jL * ((long) i11), this.f9081p * ((long) i12));
    }

    public void h(float f11) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        if (this.f9070e != f11) {
            this.f9070e = f11;
            this.f9075j = true;
        }
    }

    public void i(float f11) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        if (this.f9069d != f11) {
            this.f9069d = f11;
            this.f9075j = true;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        if (this.f9072g.f9027a != -1) {
            return this.f9067b || !f();
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        this.f9069d = 1.0f;
        this.f9070e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9071f = aVar;
        this.f9072g = aVar;
        this.f9073h = aVar;
        this.f9074i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f9024a;
        this.f9077l = byteBuffer;
        this.f9078m = byteBuffer.asShortBuffer();
        this.f9079n = byteBuffer;
        this.f9068c = -1;
        this.f9075j = false;
        this.f9076k = null;
        this.f9080o = 0L;
        this.f9081p = 0L;
        this.f9082q = false;
    }

    d(boolean z11) {
        this.f9069d = 1.0f;
        this.f9070e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9071f = aVar;
        this.f9072g = aVar;
        this.f9073h = aVar;
        this.f9074i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f9024a;
        this.f9077l = byteBuffer;
        this.f9078m = byteBuffer.asShortBuffer();
        this.f9079n = byteBuffer;
        this.f9068c = -1;
        this.f9067b = z11;
    }
}
