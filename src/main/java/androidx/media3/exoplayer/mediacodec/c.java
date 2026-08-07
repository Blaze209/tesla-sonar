package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
class c implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f10509g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f10510h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f10511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f10513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f10514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s7.m f10515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10516f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.h(message);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f10521d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f10522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10523f;

        b() {
        }

        public void a(int i11, int i12, int i13, long j11, int i14) {
            this.f10518a = i11;
            this.f10519b = i12;
            this.f10520c = i13;
            this.f10522e = j11;
            this.f10523f = i14;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new s7.m());
    }

    private void c() {
        this.f10515e.d();
        ((Handler) s7.a.f(this.f10513c)).obtainMessage(3).sendToTarget();
        this.f10515e.a();
    }

    private static void d(y7.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f125186f;
        cryptoInfo.numBytesOfClearData = f(cVar.f125184d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = f(cVar.f125185e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) s7.a.f(e(cVar.f125182b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) s7.a.f(e(cVar.f125181a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f125183c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f125187g, cVar.f125188h));
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] f(int[] iArr, int[] iArr2) {
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
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public void h(Message message) {
        b bVar;
        b bVar2;
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                bVar2 = null;
                if (i11 == 3) {
                    this.f10515e.f();
                } else if (i11 != 4) {
                    androidx.camera.view.i.a(this.f10514d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    k((Bundle) message.obj);
                }
            } else {
                bVar = (b) message.obj;
                j(bVar.f10518a, bVar.f10519b, bVar.f10521d, bVar.f10522e, bVar.f10523f);
            }
            if (bVar2 != null) {
                n(bVar2);
            }
        }
        bVar = (b) message.obj;
        i(bVar.f10518a, bVar.f10519b, bVar.f10520c, bVar.f10522e, bVar.f10523f);
        bVar2 = bVar;
        if (bVar2 != null) {
            n(bVar2);
        }
    }

    private void i(int i11, int i12, int i13, long j11, int i14) {
        try {
            this.f10511a.queueInputBuffer(i11, i12, i13, j11, i14);
        } catch (RuntimeException e11) {
            androidx.camera.view.i.a(this.f10514d, null, e11);
        }
    }

    private void j(int i11, int i12, MediaCodec.CryptoInfo cryptoInfo, long j11, int i13) {
        try {
            synchronized (f10510h) {
                this.f10511a.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
            }
        } catch (RuntimeException e11) {
            androidx.camera.view.i.a(this.f10514d, null, e11);
        }
    }

    private void k(Bundle bundle) {
        try {
            this.f10511a.setParameters(bundle);
        } catch (RuntimeException e11) {
            androidx.camera.view.i.a(this.f10514d, null, e11);
        }
    }

    private void l() {
        ((Handler) s7.a.f(this.f10513c)).removeCallbacksAndMessages(null);
        c();
    }

    private static b m() {
        ArrayDeque<b> arrayDeque = f10509g;
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

    private static void n(b bVar) {
        ArrayDeque<b> arrayDeque = f10509g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a() {
        RuntimeException andSet = this.f10514d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
        if (this.f10516f) {
            try {
                l();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void g(int i11, int i12, y7.c cVar, long j11, int i13) {
        a();
        b bVarM = m();
        bVarM.a(i11, i12, 0, j11, i13);
        d(cVar, bVarM.f10521d);
        ((Handler) q0.l(this.f10513c)).obtainMessage(2, bVarM).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        a();
        b bVarM = m();
        bVarM.a(i11, i12, i13, j11, i14);
        ((Handler) q0.l(this.f10513c)).obtainMessage(1, bVarM).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void setParameters(Bundle bundle) {
        a();
        ((Handler) q0.l(this.f10513c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
        if (this.f10516f) {
            flush();
            this.f10512b.quit();
        }
        this.f10516f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
        if (this.f10516f) {
            return;
        }
        this.f10512b.start();
        this.f10513c = new a(this.f10512b.getLooper());
        this.f10516f = true;
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, s7.m mVar) {
        this.f10511a = mediaCodec;
        this.f10512b = handlerThread;
        this.f10515e = mVar;
        this.f10514d = new AtomicReference<>();
    }
}
