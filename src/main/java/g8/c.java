package g8;

import java.util.List;
import p7.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f67466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<m0> f67467b;

    public c(f fVar, List<m0> list) {
        this.f67466a = fVar;
        this.f67467b = list;
    }

    @Override // g8.f
    public androidx.media3.exoplayer.upstream.c.a<e> a() {
        return new l8.b(this.f67466a.a(), this.f67467b);
    }

    @Override // g8.f
    public androidx.media3.exoplayer.upstream.c.a<e> b(androidx.media3.exoplayer.hls.playlist.d dVar, androidx.media3.exoplayer.hls.playlist.c cVar) {
        return new l8.b(this.f67466a.b(dVar, cVar), this.f67467b);
    }
}
