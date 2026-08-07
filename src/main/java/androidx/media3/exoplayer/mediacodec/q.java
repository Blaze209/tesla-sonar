package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import s7.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f10575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j8.c f10576b;

    public static class b implements h.b {
        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.h.b
        @SuppressLint({"WrongConstant"})
        public h a(h.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    j0.a("configureCodec");
                    Surface surface = aVar.f10551d;
                    mediaCodecC.configure(aVar.f10549b, surface, aVar.f10552e, (surface == null && aVar.f10548a.f10565k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    j0.b();
                    j0.a("startCodec");
                    mediaCodecC.start();
                    j0.b();
                    return new q(mediaCodecC, aVar.f10553f);
                } catch (IOException e11) {
                    e = e11;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e12) {
                    e = e12;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        }

        protected MediaCodec c(h.a aVar) throws IOException {
            s7.a.f(aVar.f10548a);
            String str = aVar.f10548a.f10555a;
            j0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            j0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void k(q qVar, h.d dVar, MediaCodec mediaCodec, long j11, long j12) {
        qVar.getClass();
        dVar.a(qVar, j11, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i11) {
        this.f10575a.setVideoScalingMode(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c(int i11, long j11) {
        this.f10575a.releaseOutputBuffer(i11, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f10575a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(Surface surface) {
        this.f10575a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int f() {
        return this.f10575a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f10575a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(int i11, int i12, y7.c cVar, long j11, int i13) {
        this.f10575a.queueSecureInputBuffer(i11, i12, cVar.a(), j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer getInputBuffer(int i11) {
        return this.f10575a.getInputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer getOutputBuffer(int i11) {
        return this.f10575a.getOutputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat getOutputFormat() {
        return this.f10575a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void i(final h.d dVar, Handler handler) {
        this.f10575a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j8.j
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                q.k(this.f82802a, dVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j() {
        this.f10575a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f10575a.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        j8.c cVar;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && i11 < 33) {
                this.f10575a.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (cVar = this.f10576b) != null) {
                cVar.d(this.f10575a);
            }
            this.f10575a.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f10575a.releaseOutputBuffer(i11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void setParameters(Bundle bundle) {
        this.f10575a.setParameters(bundle);
    }

    private q(MediaCodec mediaCodec, j8.c cVar) {
        this.f10575a = mediaCodec;
        this.f10576b = cVar;
        if (Build.VERSION.SDK_INT < 35 || cVar == null) {
            return;
        }
        cVar.b(mediaCodec);
    }
}
