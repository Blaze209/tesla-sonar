package rr;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface i0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f108841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f108842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f108843c;

        public a(String str, int i11, byte[] bArr) {
            this.f108841a = str;
            this.f108842b = i11;
            this.f108843c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f108844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f108845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f108846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f108847d;

        public b(int i11, String str, List<a> list, byte[] bArr) {
            this.f108844a = i11;
            this.f108845b = str;
            this.f108846c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f108847d = bArr;
        }
    }

    public interface c {
        SparseArray<i0> a();

        i0 b(int i11, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f108848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f108849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f108850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f108851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f108852e;

        public d(int i11, int i12) {
            this(Integer.MIN_VALUE, i11, i12);
        }

        private void d() {
            if (this.f108851d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i11 = this.f108851d;
            this.f108851d = i11 == Integer.MIN_VALUE ? this.f108849b : i11 + this.f108850c;
            this.f108852e = this.f108848a + this.f108851d;
        }

        public String b() {
            d();
            return this.f108852e;
        }

        public int c() {
            d();
            return this.f108851d;
        }

        public d(int i11, int i12, int i13) {
            String str;
            if (i11 != Integer.MIN_VALUE) {
                str = i11 + "/";
            } else {
                str = "";
            }
            this.f108848a = str;
            this.f108849b = i12;
            this.f108850c = i13;
            this.f108851d = Integer.MIN_VALUE;
            this.f108852e = "";
        }
    }

    void a();

    void b(ts.d0 d0Var, int i11);

    void c(m0 m0Var, hr.m mVar, d dVar);
}
