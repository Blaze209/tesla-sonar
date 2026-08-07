package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.exoplayer.source.s;
import g8.f;
import java.io.IOException;
import s8.e;

/* JADX INFO: loaded from: classes3.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10116a;

        public PlaylistResetException(Uri uri) {
            this.f10116a = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10117a;

        public PlaylistStuckException(Uri uri) {
            this.f10117a = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(f8.d dVar, androidx.media3.exoplayer.upstream.b bVar, f fVar, e eVar);
    }

    public interface b {
        void a();

        boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z11);
    }

    public interface c {
        void m(androidx.media3.exoplayer.hls.playlist.c cVar);
    }

    long a();

    void b(b bVar);

    void c(b bVar);

    void d(Uri uri, s.a aVar, c cVar);

    default void e(Uri uri) {
    }

    void f(Uri uri);

    d g();

    void h(Uri uri);

    boolean i(Uri uri);

    boolean j();

    boolean k(Uri uri, long j11);

    void l();

    androidx.media3.exoplayer.hls.playlist.c m(Uri uri, boolean z11);

    void stop();
}
