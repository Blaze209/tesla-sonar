package androidx.media3.exoplayer.smoothstreaming;

import p7.u;
import p8.i;
import r8.t;
import s8.e;
import s8.k;
import v7.q;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends i {
    void b(t tVar);

    void e(androidx.media3.exoplayer.smoothstreaming.manifest.a aVar);

    public interface a {
        default a b(boolean z11) {
            return this;
        }

        b c(k kVar, androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, int i11, t tVar, q qVar, e eVar);

        default a a(t9.q.a aVar) {
            return this;
        }

        default u d(u uVar) {
            return uVar;
        }
    }
}
