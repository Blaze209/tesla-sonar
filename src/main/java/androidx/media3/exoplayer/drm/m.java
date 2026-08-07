package androidx.media3.exoplayer.drm;

import a8.o2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f9809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9811c;

        public a(byte[] bArr, String str, int i11) {
            this.f9809a = bArr;
            this.f9810b = str;
            this.f9811c = i11;
        }

        public byte[] a() {
            return this.f9809a;
        }

        public String b() {
            return this.f9810b;
        }
    }

    public interface b {
        void a(m mVar, byte[] bArr, int i11, int i12, byte[] bArr2);
    }

    public interface c {
        m a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f9812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9813b;

        public d(byte[] bArr, String str) {
            this.f9812a = bArr;
            this.f9813b = str;
        }

        public byte[] a() {
            return this.f9812a;
        }

        public String b() {
            return this.f9813b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    byte[] e(byte[] bArr, byte[] bArr2);

    void f(byte[] bArr);

    int g();

    y7.b h(byte[] bArr);

    boolean i(byte[] bArr, String str);

    void j(byte[] bArr);

    a k(byte[] bArr, List<p7.n.b> list, int i11, HashMap<String, String> map);

    void m(b bVar);

    void release();

    default void l(byte[] bArr, o2 o2Var) {
    }
}
