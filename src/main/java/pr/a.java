package pr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103746a;

    /* JADX INFO: renamed from: pr.a$a, reason: collision with other inner class name */
    static final class C2199a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f103748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<C2199a> f103749d;

        public C2199a(int i11, long j11) {
            super(i11);
            this.f103747b = j11;
            this.f103748c = new ArrayList();
            this.f103749d = new ArrayList();
        }

        public void d(C2199a c2199a) {
            this.f103749d.add(c2199a);
        }

        public void e(b bVar) {
            this.f103748c.add(bVar);
        }

        public C2199a f(int i11) {
            int size = this.f103749d.size();
            for (int i12 = 0; i12 < size; i12++) {
                C2199a c2199a = this.f103749d.get(i12);
                if (c2199a.f103746a == i11) {
                    return c2199a;
                }
            }
            return null;
        }

        public b g(int i11) {
            int size = this.f103748c.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f103748c.get(i12);
                if (bVar.f103746a == i11) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // pr.a
        public String toString() {
            return a.a(this.f103746a) + " leaves: " + Arrays.toString(this.f103748c.toArray()) + " containers: " + Arrays.toString(this.f103749d.toArray());
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f103750b;

        public b(int i11, d0 d0Var) {
            super(i11);
            this.f103750b = d0Var;
        }
    }

    public a(int i11) {
        this.f103746a = i11;
    }

    public static String a(int i11) {
        return "" + ((char) ((i11 >> 24) & 255)) + ((char) ((i11 >> 16) & 255)) + ((char) ((i11 >> 8) & 255)) + ((char) (i11 & 255));
    }

    public static int b(int i11) {
        return i11 & 16777215;
    }

    public static int c(int i11) {
        return (i11 >> 24) & 255;
    }

    public String toString() {
        return a(this.f103746a);
    }
}
