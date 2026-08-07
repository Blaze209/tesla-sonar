package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f9942a;

    class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, float f11, boolean z11, int i12) {
            super(i11, f11, z11);
            this.f9943a = i12;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f9943a;
        }
    }

    public b(int i11) {
        this.f9942a = new a(i11 + 1, 1.0f, false, i11);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f9942a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f9942a.put((Uri) s7.a.f(uri), (byte[]) s7.a.f(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f9942a.remove(s7.a.f(uri));
    }
}
