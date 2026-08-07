package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import ou.x;
import ts.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f40196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f40197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40201f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C0651b implements j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x<HandlerThread> f40202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x<HandlerThread> f40203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f40204c;

        public C0651b(final int i11, boolean z11) {
            this(new x() { // from class: tr.a
                @Override // ou.x
                public final Object get() {
                    return com.google.android.exoplayer2.mediacodec.b.C0651b.b(i11);
                }
            }, new x() { // from class: tr.b
                @Override // ou.x
                public final Object get() {
                    return com.google.android.exoplayer2.mediacodec.b.C0651b.c(i11);
                }
            }, z11);
        }

        public static /* synthetic */ HandlerThread b(int i11) {
            return new HandlerThread(b.m(i11));
        }

        public static /* synthetic */ HandlerThread c(int i11) {
            return new HandlerThread(b.n(i11));
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(j.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f40247a.f40253a;
            b bVar = null;
            try {
                n0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    b bVar2 = new b(mediaCodecCreateByCodecName, this.f40202a.get(), this.f40203b.get(), this.f40204c);
                    try {
                        n0.c();
                        bVar2.p(aVar.f40248b, aVar.f40250d, aVar.f40251e, aVar.f40252f);
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

        C0651b(x<HandlerThread> xVar, x<HandlerThread> xVar2, boolean z11) {
            this.f40202a = xVar;
            this.f40203b = xVar2;
            this.f40204c = z11;
        }
    }

    public static /* synthetic */ void i(b bVar, j.c cVar, MediaCodec mediaCodec, long j11, long j12) {
        bVar.getClass();
        cVar.a(bVar, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(int i11) {
        return o(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(int i11) {
        return o(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String o(int i11, String str) {
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
    public void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        this.f40197b.h(this.f40196a);
        n0.a("configureCodec");
        this.f40196a.configure(mediaFormat, surface, mediaCrypto, i11);
        n0.c();
        this.f40198c.q();
        n0.a("startCodec");
        this.f40196a.start();
        n0.c();
        this.f40201f = 1;
    }

    private void q() {
        if (this.f40199d) {
            try {
                this.f40198c.r();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i11) {
        q();
        this.f40196a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void c(int i11, long j11) {
        this.f40196a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int d(MediaCodec.BufferInfo bufferInfo) {
        this.f40198c.l();
        return this.f40197b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void e(Surface surface) {
        q();
        this.f40196a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int f() {
        this.f40198c.l();
        return this.f40197b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.f40198c.i();
        this.f40196a.flush();
        this.f40197b.e();
        this.f40196a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i11, int i12, fr.c cVar, long j11, int i13) {
        this.f40198c.n(i11, i12, cVar, j11, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer getInputBuffer(int i11) {
        return this.f40196a.getInputBuffer(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer getOutputBuffer(int i11) {
        return this.f40196a.getOutputBuffer(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat getOutputFormat() {
        return this.f40197b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void h(final j.c cVar, Handler handler) {
        q();
        this.f40196a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                b.i(this.f40194a, cVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f40198c.m(i11, i12, i13, j11, i14);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        try {
            if (this.f40201f == 1) {
                this.f40198c.p();
                this.f40197b.o();
            }
            this.f40201f = 2;
        } finally {
            if (!this.f40200e) {
                this.f40196a.release();
                this.f40200e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f40196a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void setParameters(Bundle bundle) {
        q();
        this.f40196a.setParameters(bundle);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z11) {
        this.f40196a = mediaCodec;
        this.f40197b = new e(handlerThread);
        this.f40198c = new c(mediaCodec, handlerThread2);
        this.f40199d = z11;
        this.f40201f = 0;
    }
}
