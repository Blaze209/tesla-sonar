package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public interface h {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f10548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f10549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f10550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f10551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f10552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j8.c f10553f;

        private a(j jVar, MediaFormat mediaFormat, u uVar, Surface surface, MediaCrypto mediaCrypto, j8.c cVar) {
            this.f10548a = jVar;
            this.f10549b = mediaFormat;
            this.f10550c = uVar;
            this.f10551d = surface;
            this.f10552e = mediaCrypto;
            this.f10553f = cVar;
        }

        public static a a(j jVar, MediaFormat mediaFormat, u uVar, MediaCrypto mediaCrypto, j8.c cVar) {
            return new a(jVar, mediaFormat, uVar, null, mediaCrypto, cVar);
        }

        public static a b(j jVar, MediaFormat mediaFormat, u uVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, uVar, surface, mediaCrypto, null);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f10554a = new g();

        static b b(Context context) {
            return new g(context);
        }

        h a(a aVar);
    }

    public interface c {
        default void a() {
        }

        default void b() {
        }
    }

    public interface d {
        void a(h hVar, long j11, long j12);
    }

    void a(int i11);

    boolean b();

    void c(int i11, long j11);

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(Surface surface);

    int f();

    void flush();

    void g(int i11, int i12, y7.c cVar, long j11, int i13);

    ByteBuffer getInputBuffer(int i11);

    ByteBuffer getOutputBuffer(int i11);

    MediaFormat getOutputFormat();

    default boolean h(c cVar) {
        return false;
    }

    void i(d dVar, Handler handler);

    void j();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void release();

    void releaseOutputBuffer(int i11, boolean z11);

    void setParameters(Bundle bundle);
}
