package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f40205g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f40206h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f40207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f40208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f40209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f40210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ts.g f40211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40212f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.f(message);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f40217d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f40218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40219f;

        b() {
        }

        public void a(int i11, int i12, int i13, long j11, int i14) {
            this.f40214a = i11;
            this.f40215b = i12;
            this.f40216c = i13;
            this.f40218e = j11;
            this.f40219f = i14;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ts.g());
    }

    private void b() {
        this.f40211e.c();
        ((Handler) ts.a.e(this.f40209c)).obtainMessage(2).sendToTarget();
        this.f40211e.a();
    }

    private static void c(fr.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f66335f;
        cryptoInfo.numBytesOfClearData = e(cVar.f66333d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f66334e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ts.a.e(d(cVar.f66331b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ts.a.e(d(cVar.f66330a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f66332c;
        if (p0.f115040a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f66336g, cVar.f66337h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    public void f(Message message) {
        b bVar;
        b bVar2;
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                bVar2 = null;
                if (i11 != 2) {
                    androidx.camera.view.i.a(this.f40210d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f40211e.e();
                }
            } else {
                bVar = (b) message.obj;
                h(bVar.f40214a, bVar.f40215b, bVar.f40217d, bVar.f40218e, bVar.f40219f);
            }
            if (bVar2 != null) {
                o(bVar2);
            }
        }
        bVar = (b) message.obj;
        g(bVar.f40214a, bVar.f40215b, bVar.f40216c, bVar.f40218e, bVar.f40219f);
        bVar2 = bVar;
        if (bVar2 != null) {
            o(bVar2);
        }
    }

    private void g(int i11, int i12, int i13, long j11, int i14) {
        try {
            this.f40207a.queueInputBuffer(i11, i12, i13, j11, i14);
        } catch (RuntimeException e11) {
            androidx.camera.view.i.a(this.f40210d, null, e11);
        }
    }

    private void h(int i11, int i12, MediaCodec.CryptoInfo cryptoInfo, long j11, int i13) {
        try {
            synchronized (f40206h) {
                this.f40207a.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
            }
        } catch (RuntimeException e11) {
            androidx.camera.view.i.a(this.f40210d, null, e11);
        }
    }

    private void j() {
        ((Handler) ts.a.e(this.f40209c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f40205g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f40205g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f40212f) {
            try {
                j();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    public void l() {
        RuntimeException andSet = this.f40210d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i11, int i12, int i13, long j11, int i14) {
        l();
        b bVarK = k();
        bVarK.a(i11, i12, i13, j11, i14);
        ((Handler) p0.j(this.f40209c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void n(int i11, int i12, fr.c cVar, long j11, int i13) {
        l();
        b bVarK = k();
        bVarK.a(i11, i12, 0, j11, i13);
        c(cVar, bVarK.f40217d);
        ((Handler) p0.j(this.f40209c)).obtainMessage(1, bVarK).sendToTarget();
    }

    public void p() {
        if (this.f40212f) {
            i();
            this.f40208b.quit();
        }
        this.f40212f = false;
    }

    public void q() {
        if (this.f40212f) {
            return;
        }
        this.f40208b.start();
        this.f40209c = new a(this.f40208b.getLooper());
        this.f40212f = true;
    }

    public void r() {
        b();
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, ts.g gVar) {
        this.f40207a = mediaCodec;
        this.f40208b = handlerThread;
        this.f40211e = gVar;
        this.f40210d = new AtomicReference<>();
    }
}
