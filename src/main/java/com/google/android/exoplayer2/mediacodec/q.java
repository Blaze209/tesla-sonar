package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import ts.n0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f40267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f40268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f40269c;

    public static class b implements j.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.j.b
        public j a(j.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    n0.a("configureCodec");
                    mediaCodecB.configure(aVar.f40248b, aVar.f40250d, aVar.f40251e, aVar.f40252f);
                    n0.c();
                    n0.a("startCodec");
                    mediaCodecB.start();
                    n0.c();
                    return new q(mediaCodecB);
                } catch (IOException | RuntimeException e11) {
                    e = e11;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (RuntimeException e13) {
                e = e13;
            }
        }

        protected MediaCodec b(j.a aVar) throws IOException {
            ts.a.e(aVar.f40247a);
            String str = aVar.f40247a.f40253a;
            n0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            n0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void i(q qVar, j.c cVar, MediaCodec mediaCodec, long j11, long j12) {
        qVar.getClass();
        cVar.a(qVar, j11, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i11) {
        this.f40267a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void c(int i11, long j11) {
        this.f40267a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f40267a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && p0.f115040a < 21) {
                this.f40269c = this.f40267a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void e(Surface surface) {
        this.f40267a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int f() {
        return this.f40267a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.f40267a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i11, int i12, fr.c cVar, long j11, int i13) {
        this.f40267a.queueSecureInputBuffer(i11, i12, cVar.a(), j11, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer getInputBuffer(int i11) {
        return p0.f115040a >= 21 ? this.f40267a.getInputBuffer(i11) : ((ByteBuffer[]) p0.j(this.f40268b))[i11];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer getOutputBuffer(int i11) {
        return p0.f115040a >= 21 ? this.f40267a.getOutputBuffer(i11) : ((ByteBuffer[]) p0.j(this.f40269c))[i11];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat getOutputFormat() {
        return this.f40267a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void h(final j.c cVar, Handler handler) {
        this.f40267a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: tr.d
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                q.i(this.f114933a, cVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f40267a.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        this.f40268b = null;
        this.f40269c = null;
        this.f40267a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f40267a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void setParameters(Bundle bundle) {
        this.f40267a.setParameters(bundle);
    }

    private q(MediaCodec mediaCodec) {
        this.f40267a = mediaCodec;
        if (p0.f115040a < 21) {
            this.f40268b = mediaCodec.getInputBuffers();
            this.f40269c = mediaCodec.getOutputBuffers();
        }
    }
}
