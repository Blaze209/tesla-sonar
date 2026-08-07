package aq0;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class h implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f14933l = Character.toString('\r');

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f14934m = Character.toString('\n');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f14935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f14936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f14937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f14938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f14939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char f14940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f14942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f14943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f14944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14945k;

    h(b bVar, g gVar) {
        this.f14943i = gVar;
        char[] charArray = bVar.D().toCharArray();
        this.f14935a = charArray;
        this.f14938d = T(bVar.F());
        this.f14939e = T(bVar.L());
        this.f14940f = T(bVar.C());
        this.f14941g = bVar.J();
        this.f14942h = bVar.H();
        this.f14936b = new char[charArray.length - 1];
        this.f14937c = new char[(charArray.length * 2) - 1];
    }

    private boolean H(int i11) {
        return i11 == this.f14938d || i11 == this.f14939e || i11 == this.f14940f;
    }

    private char T(Character ch2) {
        if (ch2 == null) {
            return (char) 65534;
        }
        return ch2.charValue();
    }

    private j c0(j jVar) throws IOException {
        int i11;
        jVar.f14949d = true;
        long jN = n();
        while (true) {
            int i12 = this.f14943i.read();
            if (B(i12)) {
                if (C()) {
                    jVar.f14947b.append(this.f14935a);
                } else {
                    int iN0 = n0();
                    if (iN0 == -1) {
                        StringBuilder sb2 = jVar.f14947b;
                        sb2.append((char) i12);
                        sb2.append((char) this.f14943i.n());
                    } else {
                        jVar.f14947b.append((char) iN0);
                    }
                }
            } else if (I(i12)) {
                if (!I(this.f14943i.p())) {
                    do {
                        i11 = this.f14943i.read();
                        if (p(i11)) {
                            jVar.f14946a = j.a.TOKEN;
                            return jVar;
                        }
                        if (t(i11)) {
                            jVar.f14946a = j.a.EOF;
                            jVar.f14948c = true;
                            return jVar;
                        }
                        if (k0(i11)) {
                            jVar.f14946a = j.a.EORECORD;
                            return jVar;
                        }
                    } while (Character.isWhitespace((char) i11));
                    throw new IOException("(line " + n() + ") invalid char between encapsulated token and delimiter");
                }
                jVar.f14947b.append((char) this.f14943i.read());
            } else {
                if (t(i12)) {
                    throw new IOException("(startline " + jN + ") EOF reached before encapsulated token finished");
                }
                jVar.f14947b.append((char) i12);
            }
        }
    }

    private j e0(j jVar, int i11) throws IOException {
        while (true) {
            if (k0(i11)) {
                jVar.f14946a = j.a.EORECORD;
                break;
            }
            if (t(i11)) {
                jVar.f14946a = j.a.EOF;
                jVar.f14948c = true;
                break;
            }
            if (p(i11)) {
                jVar.f14946a = j.a.TOKEN;
                break;
            }
            if (!B(i11)) {
                jVar.f14947b.append((char) i11);
            } else if (C()) {
                jVar.f14947b.append(this.f14935a);
            } else {
                int iN0 = n0();
                if (iN0 == -1) {
                    StringBuilder sb2 = jVar.f14947b;
                    sb2.append((char) i11);
                    sb2.append((char) this.f14943i.n());
                } else {
                    jVar.f14947b.append((char) iN0);
                }
            }
            i11 = this.f14943i.read();
        }
        if (this.f14941g) {
            r0(jVar.f14947b);
        }
        return jVar;
    }

    boolean B(int i11) {
        return i11 == this.f14938d;
    }

    boolean C() throws IOException {
        this.f14943i.t(this.f14937c);
        if (this.f14937c[0] != this.f14935a[0]) {
            return false;
        }
        int i11 = 1;
        while (true) {
            char[] cArr = this.f14935a;
            if (i11 >= cArr.length) {
                g gVar = this.f14943i;
                char[] cArr2 = this.f14937c;
                return gVar.read(cArr2, 0, cArr2.length) != -1;
            }
            char[] cArr3 = this.f14937c;
            int i12 = i11 * 2;
            if (cArr3[i12] != cArr[i11] || cArr3[i12 - 1] != this.f14938d) {
                return false;
            }
            i11++;
        }
    }

    boolean I(int i11) {
        return i11 == this.f14939e;
    }

    boolean J(int i11) {
        return i11 == 10 || i11 == 13 || i11 == -2;
    }

    j b0(j jVar) throws IOException {
        int iN = this.f14943i.n();
        int i11 = this.f14943i.read();
        boolean zK0 = k0(i11);
        if (this.f14942h) {
            while (zK0 && J(iN)) {
                int i12 = this.f14943i.read();
                zK0 = k0(i12);
                if (t(i12)) {
                    jVar.f14946a = j.a.EOF;
                    return jVar;
                }
                int i13 = i11;
                i11 = i12;
                iN = i13;
            }
        }
        if (t(iN) || (!this.f14945k && t(i11))) {
            jVar.f14946a = j.a.EOF;
            return jVar;
        }
        if (J(iN) && o(i11)) {
            String line = this.f14943i.readLine();
            if (line == null) {
                jVar.f14946a = j.a.EOF;
                return jVar;
            }
            jVar.f14947b.append(line.trim());
            jVar.f14946a = j.a.COMMENT;
            return jVar;
        }
        while (jVar.f14946a == j.a.INVALID) {
            if (this.f14941g) {
                while (Character.isWhitespace((char) i11) && !p(i11) && !zK0) {
                    i11 = this.f14943i.read();
                    zK0 = k0(i11);
                }
            }
            if (p(i11)) {
                jVar.f14946a = j.a.TOKEN;
            } else if (zK0) {
                jVar.f14946a = j.a.EORECORD;
            } else if (I(i11)) {
                c0(jVar);
            } else if (t(i11)) {
                jVar.f14946a = j.a.EOF;
                jVar.f14948c = true;
            } else {
                e0(jVar, i11);
            }
        }
        return jVar;
    }

    long c() {
        return this.f14943i.o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14943i.close();
    }

    boolean isClosed() {
        return this.f14943i.isClosed();
    }

    boolean k0(int i11) throws IOException {
        if (i11 == 13 && this.f14943i.p() == 10) {
            i11 = this.f14943i.read();
            if (this.f14944j == null) {
                this.f14944j = "\r\n";
            }
        }
        if (this.f14944j == null) {
            if (i11 == 10) {
                this.f14944j = f14934m;
            } else if (i11 == 13) {
                this.f14944j = f14933l;
            }
        }
        return i11 == 10 || i11 == 13;
    }

    long n() {
        return this.f14943i.c();
    }

    int n0() throws IOException {
        int i11 = this.f14943i.read();
        if (i11 == -1) {
            throw new IOException("EOF whilst processing escape sequence");
        }
        if (i11 == 98) {
            return 8;
        }
        if (i11 == 102) {
            return 12;
        }
        if (i11 == 110) {
            return 10;
        }
        if (i11 == 114) {
            return 13;
        }
        if (i11 == 116) {
            return 9;
        }
        if (i11 != 12 && i11 != 13) {
            switch (i11) {
                default:
                    if (!H(i11)) {
                        return -1;
                    }
                case 8:
                case 9:
                case 10:
                    return i11;
            }
        }
        return i11;
    }

    boolean o(int i11) {
        return i11 == this.f14940f;
    }

    boolean p(int i11) throws IOException {
        char c11;
        this.f14945k = false;
        char[] cArr = this.f14935a;
        if (i11 != cArr[0]) {
            return false;
        }
        if (cArr.length == 1) {
            this.f14945k = true;
            return true;
        }
        this.f14943i.t(this.f14936b);
        int i12 = 0;
        do {
            char[] cArr2 = this.f14936b;
            if (i12 >= cArr2.length) {
                boolean z11 = this.f14943i.read(cArr2, 0, cArr2.length) != -1;
                this.f14945k = z11;
                return z11;
            }
            c11 = cArr2[i12];
            i12++;
        } while (c11 == this.f14935a[i12]);
        return false;
    }

    void r0(StringBuilder sb2) {
        int length = sb2.length();
        while (length > 0) {
            int i11 = length - 1;
            if (!Character.isWhitespace(sb2.charAt(i11))) {
                break;
            } else {
                length = i11;
            }
        }
        if (length != sb2.length()) {
            sb2.setLength(length);
        }
    }

    boolean t(int i11) {
        return i11 == -1;
    }
}
