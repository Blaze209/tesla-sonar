package l8;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.c;
import java.io.InputStream;
import java.util.List;
import l8.a;
import p7.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T extends a<T>> implements c.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a<? extends T> f89686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<m0> f89687b;

    public b(c.a<? extends T> aVar, List<m0> list) {
        this.f89686a = aVar;
        this.f89687b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T tA = this.f89686a.a(uri, inputStream);
        List<m0> list = this.f89687b;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f89687b);
    }
}
