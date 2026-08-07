package jj;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class z<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f83918b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<h, Data> f83919a;

    public z(o<h, Data> oVar) {
        this.f83919a = oVar;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        return this.f83919a.b(new h(uri.toString()), i11, i12, hVar);
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return f83918b.contains(uri.getScheme());
    }

    public static class a implements p<Uri, InputStream> {
        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }

        @Override // jj.p
        public void d() {
        }
    }
}
