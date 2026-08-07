package mq0;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes9.dex */
abstract class f implements jq0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f92452h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String[] f92453i = new String[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static Class[] f92454j = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f92455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f92456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f92457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Class f92458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f92459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f92460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ClassLoader f92461g = null;

    private interface a {
        void a(int i11, String str);

        String get(int i11);
    }

    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SoftReference f92462a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f92462a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f92462a = new SoftReference(strArr);
            return strArr;
        }

        @Override // mq0.f.a
        public void a(int i11, String str) {
            String[] strArrB = b();
            if (strArrB == null) {
                strArrB = c();
            }
            strArrB[i11] = str;
        }

        @Override // mq0.f.a
        public String get(int i11) {
            String[] strArrB = b();
            if (strArrB == null) {
                return null;
            }
            return strArrB[i11];
        }
    }

    f(int i11, String str, Class cls) {
        this.f92455a = i11;
        this.f92456b = str;
        this.f92458d = cls;
    }

    private ClassLoader h() {
        if (this.f92461g == null) {
            this.f92461g = getClass().getClassLoader();
        }
        return this.f92461g;
    }

    protected abstract String a(h hVar);

    int b(int i11) {
        return Integer.parseInt(c(i11), 16);
    }

    String c(int i11) {
        int iIndexOf = this.f92460f.indexOf(45);
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            i12 = iIndexOf + 1;
            iIndexOf = this.f92460f.indexOf(45, i12);
            i11 = i13;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f92460f.length();
        }
        return this.f92460f.substring(i12, iIndexOf);
    }

    Class d(int i11) {
        return mq0.b.a(c(i11), h());
    }

    Class[] e(int i11) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i11), ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i12 = 0; i12 < iCountTokens; i12++) {
            clsArr[i12] = mq0.b.a(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f92458d == null) {
            this.f92458d = d(2);
        }
        return this.f92458d;
    }

    public String g() {
        if (this.f92457c == null) {
            this.f92457c = f().getName();
        }
        return this.f92457c;
    }

    public int i() {
        if (this.f92455a == -1) {
            this.f92455a = b(0);
        }
        return this.f92455a;
    }

    public String j() {
        if (this.f92456b == null) {
            this.f92456b = c(1);
        }
        return this.f92456b;
    }

    String k(h hVar) {
        String strA;
        if (f92452h) {
            a aVar = this.f92459e;
            if (aVar == null) {
                try {
                    this.f92459e = new b();
                } catch (Throwable unused) {
                    f92452h = false;
                }
                strA = null;
            } else {
                strA = aVar.get(hVar.f92477i);
            }
        } else {
            strA = null;
        }
        if (strA == null) {
            strA = a(hVar);
        }
        if (f92452h) {
            this.f92459e.a(hVar.f92477i, strA);
        }
        return strA;
    }

    public final String toString() {
        return k(h.f92467k);
    }
}
