package hj;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d implements hj.a.InterfaceC1535a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f72914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f72915b;

    public interface a {
        File getCacheDirectory();
    }

    public d(a aVar, long j11) {
        this.f72914a = j11;
        this.f72915b = aVar;
    }

    @Override // hj.a.InterfaceC1535a
    public hj.a build() {
        File cacheDirectory = this.f72915b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return e.c(cacheDirectory, this.f72914a);
        }
        return null;
    }
}
