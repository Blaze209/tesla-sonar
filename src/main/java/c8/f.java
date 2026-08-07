package c8;

import android.net.Uri;
import d8.i;
import java.util.Map;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static j a(d8.j jVar, String str, i iVar, int i11, Map<String, String> map) {
        return new j.b().i(iVar.b(str)).h(iVar.f59824a).g(iVar.f59825b).f(c(jVar, iVar)).b(i11).e(map).a();
    }

    public static d8.c b(androidx.media3.datasource.a aVar, Uri uri) {
        return (d8.c) androidx.media3.exoplayer.upstream.c.g(aVar, new d8.d(), uri, 4);
    }

    public static String c(d8.j jVar, i iVar) {
        String strA = jVar.a();
        return strA != null ? strA : iVar.b(jVar.f59830c.get(0).f59774a).toString();
    }
}
