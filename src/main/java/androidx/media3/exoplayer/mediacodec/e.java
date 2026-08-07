package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f10526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f10527c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f10532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f10533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f10534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f10535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f10536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f10538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h.c f10539o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10525a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.collection.f f10528d = new androidx.collection.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.f f10529e = new androidx.collection.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f10530f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f10531g = new ArrayDeque<>();

    e(HandlerThread handlerThread) {
        this.f10526b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f10529e.a(-2);
        this.f10531g.add(mediaFormat);
    }

    private void f() {
        if (!this.f10531g.isEmpty()) {
            this.f10533i = this.f10531g.getLast();
        }
        this.f10528d.b();
        this.f10529e.b();
        this.f10530f.clear();
        this.f10531g.clear();
    }

    private boolean i() {
        return this.f10536l > 0 || this.f10537m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f10538n;
        if (illegalStateException == null) {
            return;
        }
        this.f10538n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f10535k;
        if (cryptoException == null) {
            return;
        }
        this.f10535k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f10534j;
        if (codecException == null) {
            return;
        }
        this.f10534j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f10525a) {
            try {
                if (this.f10537m) {
                    return;
                }
                long j11 = this.f10536l - 1;
                this.f10536l = j11;
                if (j11 > 0) {
                    return;
                }
                if (j11 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f10525a) {
            this.f10538n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f10525a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f10528d.d()) {
                    iE = this.f10528d.e();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10525a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f10529e.d()) {
                    return -1;
                }
                int iE = this.f10529e.e();
                if (iE >= 0) {
                    s7.a.j(this.f10532h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f10530f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f10532h = this.f10531g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f10525a) {
            this.f10536l++;
            ((Handler) q0.l(this.f10527c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10524a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f10525a) {
            try {
                mediaFormat = this.f10532h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        s7.a.h(this.f10527c == null);
        this.f10526b.start();
        Handler handler = new Handler(this.f10526b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10527c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f10525a) {
            this.f10535k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10525a) {
            this.f10534j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        synchronized (this.f10525a) {
            try {
                this.f10528d.a(i11);
                h.c cVar = this.f10539o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10525a) {
            try {
                MediaFormat mediaFormat = this.f10533i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f10533i = null;
                }
                this.f10529e.a(i11);
                this.f10530f.add(bufferInfo);
                h.c cVar = this.f10539o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10525a) {
            b(mediaFormat);
            this.f10533i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f10525a) {
            this.f10539o = cVar;
        }
    }

    public void q() {
        synchronized (this.f10525a) {
            this.f10537m = true;
            this.f10526b.quit();
            f();
        }
    }
}
