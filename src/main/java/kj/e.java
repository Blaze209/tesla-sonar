package kj;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import jj.h;
import jj.o;
import jj.p;
import jj.s;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<h, InputStream> f86180a;

    public e(o<h, InputStream> oVar) {
        this.f86180a = oVar;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@NonNull URL url, int i11, int i12, @NonNull dj.h hVar) {
        return this.f86180a.b(new h(url), i11, i12, hVar);
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull URL url) {
        return true;
    }

    public static class a implements p<URL, InputStream> {
        @Override // jj.p
        @NonNull
        public o<URL, InputStream> e(s sVar) {
            return new e(sVar.d(h.class, InputStream.class));
        }

        @Override // jj.p
        public void d() {
        }
    }
}
