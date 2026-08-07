package ar0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f14952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection<C0260a> f14953b;

    /* JADX INFO: renamed from: ar0.a$a, reason: collision with other inner class name */
    public static class C0260a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14955b;

        private C0260a(int i11, int i12) {
            this.f14954a = i11;
            this.f14955b = i12;
        }

        public static C0260a a(int i11, int i12) {
            return new C0260a(i11, i12);
        }

        public int b() {
            return this.f14955b;
        }

        public int c() {
            return this.f14954a;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!obj.getClass().equals(C0260a.class)) {
                return false;
            }
            C0260a c0260a = (C0260a) obj;
            return c0260a.f14954a == this.f14954a && c0260a.f14955b == this.f14955b;
        }

        public int hashCode() {
            return (this.f14954a * 2) + (this.f14955b * 3) + 5;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f14954a);
            sb2.append(" .. ");
            sb2.append((this.f14954a + this.f14955b) - 1);
            sb2.append(" (");
            sb2.append(this.f14955b);
            sb2.append(")]");
            return sb2.toString();
        }
    }

    public a() {
        this(2000);
    }

    private void f(int i11) {
        synchronized (this) {
            try {
                byte[] bArr = this.f14952a;
                if (i11 <= bArr.length) {
                    return;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f14952a = bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(int i11, byte[] bArr) {
        b(i11, bArr, 0, bArr.length);
    }

    public synchronized void b(int i11, byte[] bArr, int i12, int i13) {
        int i14 = i11 + i13;
        try {
            byte[] bArr2 = this.f14952a;
            if (i14 > bArr2.length) {
                f(Math.max(i14, bArr2.length) * 2);
            }
            System.arraycopy(bArr, i12, this.f14952a, i11, i13);
            for (C0260a c0260a : new ArrayList(this.f14953b)) {
                if (c0260a.c() <= i11 && i11 + i13 <= c0260a.c() + c0260a.b()) {
                    return;
                }
                if (c0260a.c() <= i11 && i11 <= c0260a.c() + c0260a.b()) {
                    int iC = (i11 + i13) - c0260a.c();
                    int iC2 = c0260a.c();
                    this.f14953b.remove(c0260a);
                    i13 = iC;
                    i11 = iC2;
                } else if (i11 <= c0260a.c() && c0260a.c() + c0260a.b() <= i11 + i13) {
                    this.f14953b.remove(c0260a);
                } else if (i11 <= c0260a.c() && c0260a.c() <= i11 + i13) {
                    i13 = (c0260a.c() + c0260a.b()) - i11;
                    this.f14953b.remove(c0260a);
                }
            }
            this.f14953b.add(C0260a.a(i11, i13));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public byte[] c() {
        return this.f14952a;
    }

    public int d() {
        int length;
        synchronized (this) {
            length = this.f14952a.length;
        }
        return length;
    }

    public synchronized C0260a e(int i11, int i12) {
        int i13;
        try {
            i13 = i11;
            for (C0260a c0260a : this.f14953b) {
                if (c0260a.c() <= i13 && i13 + i12 <= c0260a.c() + c0260a.b()) {
                    i12 = 0;
                    break;
                }
                if (c0260a.c() <= i13 && i13 < c0260a.c() + c0260a.b()) {
                    int iC = c0260a.c() + c0260a.b();
                    i12 = (i13 + i12) - iC;
                    i13 = iC;
                } else if (i13 > c0260a.c() || c0260a.c() + c0260a.b() > i13 + i12) {
                    if (i11 <= c0260a.c() && c0260a.c() < i13 + i12) {
                        i12 = c0260a.c() - i13;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C0260a.a(i13, i12);
    }

    public synchronized boolean equals(Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(a.class)) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f14952a;
        if (bArr == null && this.f14952a != null) {
            return false;
        }
        if (bArr != null && this.f14952a == null) {
            return false;
        }
        Collection<C0260a> collection = aVar.f14953b;
        if (collection == null && this.f14953b != null) {
            return false;
        }
        if (collection != null && this.f14953b == null) {
            return false;
        }
        if (Arrays.equals(bArr, this.f14952a) && aVar.f14953b.equals(this.f14953b)) {
            z11 = true;
        }
        return z11;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f14952a) * 3) + (this.f14953b.hashCode() * 2) + 7;
    }

    public synchronized String toString() {
        return "FragmentBuffer [" + this.f14952a.length + ", " + this.f14953b + "]";
    }

    public a(int i11) {
        this.f14952a = new byte[i11];
        this.f14953b = new HashSet();
    }
}
