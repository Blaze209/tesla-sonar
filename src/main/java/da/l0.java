package da;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f60107c;

        public a(String str, int i11, byte[] bArr) {
            this.f60105a = str;
            this.f60106b = i11;
            this.f60107c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f60111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f60112e;

        public b(int i11, String str, int i12, List<a> list, byte[] bArr) {
            this.f60108a = i11;
            this.f60109b = str;
            this.f60110c = i12;
            this.f60111d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f60112e = bArr;
        }

        public int a() {
            int i11 = this.f60110c;
            if (i11 != 2) {
                return i11 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        SparseArray<l0> a();

        l0 b(int i11, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f60113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f60115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f60116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f60117e;

        public d(int i11, int i12) {
            this(Integer.MIN_VALUE, i11, i12);
        }

        private void d() {
            if (this.f60116d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i11 = this.f60116d;
            this.f60116d = i11 == Integer.MIN_VALUE ? this.f60114b : i11 + this.f60115c;
            this.f60117e = this.f60113a + this.f60116d;
        }

        public String b() {
            d();
            return this.f60117e;
        }

        public int c() {
            d();
            return this.f60116d;
        }

        public d(int i11, int i12, int i13) {
            String str;
            if (i11 != Integer.MIN_VALUE) {
                str = i11 + "/";
            } else {
                str = "";
            }
            this.f60113a = str;
            this.f60114b = i12;
            this.f60115c = i13;
            this.f60116d = Integer.MIN_VALUE;
            this.f60117e = "";
        }
    }

    void a();

    void b(s7.c0 c0Var, int i11);

    void c(s7.i0 i0Var, w8.r rVar, d dVar);
}
