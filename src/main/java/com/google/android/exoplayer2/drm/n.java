package com.google.android.exoplayer2.drm;

import cr.q1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f39838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f39840c;

        public a(byte[] bArr, String str, int i11) {
            this.f39838a = bArr;
            this.f39839b = str;
            this.f39840c = i11;
        }

        public byte[] a() {
            return this.f39838a;
        }

        public String b() {
            return this.f39839b;
        }
    }

    public interface b {
        void a(n nVar, byte[] bArr, int i11, int i12, byte[] bArr2);
    }

    public interface c {
        n a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f39841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39842b;

        public d(byte[] bArr, String str) {
            this.f39841a = bArr;
            this.f39842b = str;
        }

        public byte[] a() {
            return this.f39841a;
        }

        public String b() {
            return this.f39842b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    byte[] e(byte[] bArr, byte[] bArr2);

    void f(byte[] bArr);

    int g();

    fr.b h(byte[] bArr);

    boolean i(byte[] bArr, String str);

    void j(byte[] bArr);

    a k(byte[] bArr, List<h.b> list, int i11, HashMap<String, String> map);

    void l(b bVar);

    void release();

    default void m(byte[] bArr, q1 q1Var) {
    }
}
