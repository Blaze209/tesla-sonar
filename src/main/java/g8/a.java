package g8;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {
    @Override // g8.f
    public androidx.media3.exoplayer.upstream.c.a<e> a() {
        return new HlsPlaylistParser();
    }

    @Override // g8.f
    public androidx.media3.exoplayer.upstream.c.a<e> b(androidx.media3.exoplayer.hls.playlist.d dVar, androidx.media3.exoplayer.hls.playlist.c cVar) {
        return new HlsPlaylistParser(dVar, cVar);
    }
}
