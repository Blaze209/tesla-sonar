package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import ou.x;
import p7.g0;
import p7.u;
import s7.j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f10502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j8.c f10503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10505f;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C0201b implements h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x<HandlerThread> f10506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x<HandlerThread> f10507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10508d;

        public C0201b(final int i11) {
            this(new x() { // from class: j8.a
                @Override // ou.x
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.b.C0201b.d(i11);
                }
            }, new x() { // from class: j8.b
                @Override // ou.x
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.b.C0201b.c(i11);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i11) {
            return new HandlerThread(b.p(i11));
        }

        public static /* synthetic */ HandlerThread d(int i11) {
            return new HandlerThread(b.o(i11));
        }

        private static boolean g(u uVar) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 34) {
                return false;
            }
            return i11 >= 35 || g0.t(uVar.f101544o);
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b a(h.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            i cVar;
            int i11;
            String str = aVar.f10548a.f10555a;
            b bVar = null;
            try {
                j0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f10508d && g(aVar.f10550c)) {
                        cVar = new r(mediaCodecCreateByCodecName);
                        i11 = 4;
                    } else {
                        cVar = new c(mediaCodecCreateByCodecName, this.f10507c.get());
                        i11 = 0;
                    }
                    b bVar2 = new b(mediaCodecCreateByCodecName, this.f10506b.get(), cVar, aVar.f10553f);
                    try {
                        j0.b();
                        Surface surface = aVar.f10551d;
                        if (surface == null && aVar.f10548a.f10565k && Build.VERSION.SDK_INT >= 35) {
                            i11 |= 8;
                        }
                        bVar2.r(aVar.f10549b, surface, aVar.f10552e, i11);
                        return bVar2;
                    } catch (Exception e11) {
                        exc = e11;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                }
            } catch (Exception e13) {
                exc = e13;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z11) {
            this.f10508d = z11;
        }

        public C0201b(x<HandlerThread> xVar, x<HandlerThread> xVar2) {
            this.f10506b = xVar;
            this.f10507c = xVar2;
            this.f10508d = false;
        }
    }

    public static /* synthetic */ void k(b bVar, h.d dVar, MediaCodec mediaCodec, long j11, long j12) {
        bVar.getClass();
        dVar.a(bVar, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o(int i11) {
        return q(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p(int i11) {
        return q(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String q(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        j8.c cVar;
        this.f10501b.h(this.f10500a);
        j0.a("configureCodec");
        this.f10500a.configure(mediaFormat, surface, mediaCrypto, i11);
        j0.b();
        this.f10502c.start();
        j0.a("startCodec");
        this.f10500a.start();
        j0.b();
        if (Build.VERSION.SDK_INT >= 35 && (cVar = this.f10503d) != null) {
            cVar.b(this.f10500a);
        }
        this.f10505f = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i11) {
        this.f10500a.setVideoScalingMode(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c(int i11, long j11) {
        this.f10500a.releaseOutputBuffer(i11, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int d(MediaCodec.BufferInfo bufferInfo) {
        this.f10502c.a();
        return this.f10501b.d(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(Surface surface) {
        this.f10500a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int f() {
        this.f10502c.a();
        return this.f10501b.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f10502c.flush();
        this.f10500a.flush();
        this.f10501b.e();
        this.f10500a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(int i11, int i12, y7.c cVar, long j11, int i13) {
        this.f10502c.g(i11, i12, cVar, j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer getInputBuffer(int i11) {
        return this.f10500a.getInputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer getOutputBuffer(int i11) {
        return this.f10500a.getOutputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat getOutputFormat() {
        return this.f10501b.g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean h(h.c cVar) {
        this.f10501b.p(cVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void i(final h.d dVar, Handler handler) {
        this.f10500a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                b.k(this.f10498a, dVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j() {
        this.f10500a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f10502c.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        j8.c cVar;
        j8.c cVar2;
        try {
            if (this.f10505f == 1) {
                this.f10502c.shutdown();
                this.f10501b.q();
            }
            this.f10505f = 2;
            if (this.f10504e) {
                return;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30 && i11 < 33) {
                    this.f10500a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (cVar2 = this.f10503d) != null) {
                    cVar2.d(this.f10500a);
                }
                this.f10500a.release();
                this.f10504e = true;
            }
        } catch (Throwable th2) {
            if (!this.f10504e) {
                try {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30 && i12 < 33) {
                        this.f10500a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (cVar = this.f10503d) != null) {
                        cVar.d(this.f10500a);
                    }
                    this.f10500a.release();
                    this.f10504e = true;
                }
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f10500a.releaseOutputBuffer(i11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void setParameters(Bundle bundle) {
        this.f10502c.setParameters(bundle);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, i iVar, j8.c cVar) {
        this.f10500a = mediaCodec;
        this.f10501b = new e(handlerThread);
        this.f10502c = iVar;
        this.f10503d = cVar;
        this.f10505f = 0;
    }
}
