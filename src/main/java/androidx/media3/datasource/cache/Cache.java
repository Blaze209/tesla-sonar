package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface a {
        void c(Cache cache, w7.c cVar, w7.c cVar2);

        void e(Cache cache, w7.c cVar);

        void f(Cache cache, w7.c cVar);
    }

    void a(w7.c cVar);

    w7.d b(String str);

    w7.c c(String str, long j11, long j12);

    File d(String str, long j11, long j12);

    w7.c e(String str, long j11, long j12);

    void f(w7.c cVar);

    void g(String str, w7.e eVar);

    void h(File file, long j11);
}
