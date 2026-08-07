package t7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s7.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112700a;

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f112701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f112702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<b> f112703d;

        public b(int i11, long j11) {
            super(i11);
            this.f112701b = j11;
            this.f112702c = new ArrayList();
            this.f112703d = new ArrayList();
        }

        public void b(b bVar) {
            this.f112703d.add(bVar);
        }

        public void c(c cVar) {
            this.f112702c.add(cVar);
        }

        public b d(int i11) {
            int size = this.f112703d.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f112703d.get(i12);
                if (bVar.f112700a == i11) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i11) {
            int size = this.f112702c.size();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = this.f112702c.get(i12);
                if (cVar.f112700a == i11) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // t7.e
        public String toString() {
            return e.a(this.f112700a) + " leaves: " + Arrays.toString(this.f112702c.toArray()) + " containers: " + Arrays.toString(this.f112703d.toArray());
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0 f112704b;

        public c(int i11, c0 c0Var) {
            super(i11);
            this.f112704b = c0Var;
        }
    }

    public static String a(int i11) {
        return "" + ((char) ((i11 >> 24) & 255)) + ((char) ((i11 >> 16) & 255)) + ((char) ((i11 >> 8) & 255)) + ((char) (i11 & 255));
    }

    public String toString() {
        return a(this.f112700a);
    }

    private e(int i11) {
        this.f112700a = i11;
    }
}
