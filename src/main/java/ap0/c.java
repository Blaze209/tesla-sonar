package ap0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f14837e = Logger.getLogger("net.sf.scuba.tlv");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Deque<a> f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14841d;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f14844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ByteArrayOutputStream f14845d;

        public a(c cVar, int i11) {
            this(i11, Integer.MAX_VALUE, false, null);
        }

        public int b() {
            return this.f14843b;
        }

        public byte[] c() {
            return this.f14845d.toByteArray();
        }

        public int d() {
            return this.f14845d.size();
        }

        public boolean e() {
            return this.f14844c;
        }

        public void f(int i11) {
            this.f14843b = i11;
            this.f14844c = true;
        }

        public void g(byte[] bArr, int i11, int i12) {
            this.f14845d.write(bArr, i11, i12);
        }

        public String toString() {
            byte[] byteArray = this.f14845d.toByteArray();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[TLVStruct ");
            sb2.append(Integer.toHexString(this.f14842a));
            sb2.append(", ");
            sb2.append(this.f14844c ? Integer.valueOf(this.f14843b) : "UNDEFINED");
            sb2.append(", ");
            sb2.append(bp0.a.b(byteArray));
            sb2.append("(");
            sb2.append(byteArray.length);
            sb2.append(") ]");
            return sb2.toString();
        }

        public a(int i11, int i12, boolean z11, byte[] bArr) {
            this.f14842a = i11;
            this.f14843b = i12;
            this.f14844c = z11;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f14845d = byteArrayOutputStream;
            if (bArr != null) {
                try {
                    byteArrayOutputStream.write(bArr);
                } catch (IOException e11) {
                    c.f14837e.log(Level.FINE, "Exception writing bytes in memory", (Throwable) e11);
                }
            }
        }
    }

    public c() {
        this(new ArrayDeque(), true, false, false);
    }

    public boolean b() {
        Iterator<a> it = this.f14838a.iterator();
        while (it.hasNext()) {
            if (!it.next().e()) {
                return false;
            }
        }
        return true;
    }

    public byte[] c() {
        if (this.f14838a.isEmpty()) {
            throw new IllegalStateException("Cannot get value yet.");
        }
        return this.f14838a.peek().c();
    }

    public boolean d() {
        return this.f14840c;
    }

    public boolean e() {
        return this.f14839b;
    }

    public boolean f() {
        if (this.f14838a.isEmpty()) {
            return false;
        }
        return !this.f14838a.peek().e();
    }

    public void g() {
        this.f14839b = false;
        this.f14840c = false;
        this.f14841d = true;
    }

    public void h(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set negative length (length = " + i11 + ").");
        }
        a aVarPop = this.f14838a.pop();
        if (!this.f14838a.isEmpty()) {
            a aVarPeek = this.f14838a.peek();
            byte[] bArrA = e.a(i11);
            aVarPeek.g(bArrA, 0, bArrA.length);
        }
        aVarPop.f(i11);
        this.f14838a.push(aVarPop);
        this.f14839b = false;
        this.f14840c = false;
        this.f14841d = true;
    }

    public void i(int i11) {
        a aVar = new a(this, i11);
        if (!this.f14838a.isEmpty()) {
            a aVarPeek = this.f14838a.peek();
            byte[] bArrC = e.c(i11);
            aVarPeek.g(bArrC, 0, bArrC.length);
        }
        this.f14838a.push(aVar);
        this.f14839b = false;
        this.f14840c = true;
        this.f14841d = false;
    }

    public void j(int i11) {
        if (this.f14838a.isEmpty()) {
            return;
        }
        a aVarPeek = this.f14838a.peek();
        if (aVarPeek.f14844c && aVarPeek.b() == i11) {
            return;
        }
        aVarPeek.f(i11);
        if (aVarPeek.d() == aVarPeek.b()) {
            this.f14838a.pop();
            byte[] bArrA = e.a(i11);
            byte[] bArrC = aVarPeek.c();
            k(bArrA, 0, bArrA.length);
            k(bArrC, 0, bArrC.length);
            this.f14839b = true;
            this.f14840c = false;
            this.f14841d = false;
        }
    }

    public void k(byte[] bArr, int i11, int i12) {
        if (this.f14838a.isEmpty()) {
            return;
        }
        a aVarPeek = this.f14838a.peek();
        int iB = aVarPeek.b() - aVarPeek.d();
        if (i12 > iB) {
            throw new IllegalArgumentException("Cannot process " + i12 + " bytes! Only " + iB + " bytes left in this TLV object " + aVarPeek);
        }
        aVarPeek.g(bArr, i11, i12);
        if (aVarPeek.d() != aVarPeek.b()) {
            this.f14839b = false;
            this.f14840c = false;
            this.f14841d = true;
        } else {
            this.f14838a.pop();
            k(aVarPeek.c(), 0, aVarPeek.b());
            this.f14839b = true;
            this.f14840c = false;
            this.f14841d = false;
        }
    }

    public String toString() {
        return this.f14838a.toString();
    }

    private c(Deque<a> deque, boolean z11, boolean z12, boolean z13) {
        this.f14838a = deque;
        this.f14839b = z11;
        this.f14840c = z12;
        this.f14841d = z13;
    }
}
