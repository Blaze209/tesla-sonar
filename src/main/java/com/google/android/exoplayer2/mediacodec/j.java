package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.u0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f40247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f40248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f40249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f40250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f40251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f40252f;

        private a(k kVar, MediaFormat mediaFormat, u0 u0Var, Surface surface, MediaCrypto mediaCrypto, int i11) {
            this.f40247a = kVar;
            this.f40248b = mediaFormat;
            this.f40249c = u0Var;
            this.f40250d = surface;
            this.f40251e = mediaCrypto;
            this.f40252f = i11;
        }

        public static a a(k kVar, MediaFormat mediaFormat, u0 u0Var, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, u0Var, null, mediaCrypto, 0);
        }

        public static a b(k kVar, MediaFormat mediaFormat, u0 u0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, u0Var, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        j a(a aVar);
    }

    public interface c {
        void a(j jVar, long j11, long j12);
    }

    void a(int i11);

    boolean b();

    void c(int i11, long j11);

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(Surface surface);

    int f();

    void flush();

    void g(int i11, int i12, fr.c cVar, long j11, int i13);

    ByteBuffer getInputBuffer(int i11);

    ByteBuffer getOutputBuffer(int i11);

    MediaFormat getOutputFormat();

    void h(c cVar, Handler handler);

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void release();

    void releaseOutputBuffer(int i11, boolean z11);

    void setParameters(Bundle bundle);
}
