package v7;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f118126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityTaskManager f118127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118128c;

    public n(androidx.media3.datasource.a aVar, PriorityTaskManager priorityTaskManager, int i11) {
        this.f118126a = (androidx.media3.datasource.a) s7.a.f(aVar);
        this.f118127b = (PriorityTaskManager) s7.a.f(priorityTaskManager);
        this.f118128c = i11;
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        return this.f118126a.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f118126a.close();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f118126a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) {
        this.f118127b.b(this.f118128c);
        return this.f118126a.j(jVar);
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
        s7.a.f(qVar);
        this.f118126a.n(qVar);
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        this.f118127b.b(this.f118128c);
        return this.f118126a.read(bArr, i11, i12);
    }
}
