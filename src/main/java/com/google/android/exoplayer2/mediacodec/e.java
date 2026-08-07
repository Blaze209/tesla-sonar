package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f40222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f40223c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f40228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f40229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f40230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f40231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f40233m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40221a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f40224d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f40225e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f40226f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f40227g = new ArrayDeque<>();

    e(HandlerThread handlerThread) {
        this.f40222b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f40225e.a(-2);
        this.f40227g.add(mediaFormat);
    }

    private void f() {
        if (!this.f40227g.isEmpty()) {
            this.f40229i = this.f40227g.getLast();
        }
        this.f40224d.b();
        this.f40225e.b();
        this.f40226f.clear();
        this.f40227g.clear();
    }

    private boolean i() {
        return this.f40231k > 0 || this.f40232l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f40233m;
        if (illegalStateException == null) {
            return;
        }
        this.f40233m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f40230j;
        if (codecException == null) {
            return;
        }
        this.f40230j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f40221a) {
            try {
                if (this.f40232l) {
                    return;
                }
                long j11 = this.f40231k - 1;
                this.f40231k = j11;
                if (j11 > 0) {
                    return;
                }
                if (j11 < 0) {
                    n(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f40221a) {
            this.f40233m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f40221a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f40224d.d()) {
                    iE = this.f40224d.e();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f40221a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f40225e.d()) {
                    return -1;
                }
                int iE = this.f40225e.e();
                if (iE >= 0) {
                    ts.a.i(this.f40228h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f40226f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f40228h = this.f40227g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f40221a) {
            this.f40231k++;
            ((Handler) p0.j(this.f40223c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40220a.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f40221a) {
            try {
                mediaFormat = this.f40228h;
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
        ts.a.g(this.f40223c == null);
        this.f40222b.start();
        Handler handler = new Handler(this.f40222b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f40223c = handler;
    }

    public void o() {
        synchronized (this.f40221a) {
            this.f40232l = true;
            this.f40222b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f40221a) {
            this.f40230j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        synchronized (this.f40221a) {
            this.f40224d.a(i11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f40221a) {
            try {
                MediaFormat mediaFormat = this.f40229i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f40229i = null;
                }
                this.f40225e.a(i11);
                this.f40226f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f40221a) {
            b(mediaFormat);
            this.f40229i = null;
        }
    }
}
