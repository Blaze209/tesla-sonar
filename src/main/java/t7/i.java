package t7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f112792a;

        private b(e eVar, d dVar) throws c {
            int i11 = dVar.f112793a;
            s7.a.a(i11 == 6 || i11 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f112794b.remaining())];
            dVar.f112794b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            i.f(eVar.f112795a);
            if (b0Var.g()) {
                this.f112792a = false;
                return;
            }
            int iH = b0Var.h(2);
            boolean zG = b0Var.g();
            i.f(eVar.f112796b);
            if (!zG) {
                this.f112792a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : b0Var.g();
            b0Var.q();
            i.f(!eVar.f112798d);
            if (b0Var.g()) {
                i.f(!eVar.f112799e);
                b0Var.q();
            }
            i.f(eVar.f112797c);
            if (iH != 3) {
                b0Var.q();
            }
            b0Var.r(eVar.f112800f);
            if (iH != 2 && iH != 0 && !zG2) {
                b0Var.r(3);
            }
            this.f112792a = ((iH == 3 || iH == 0) ? 255 : b0Var.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f112792a;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f112794b;

        private d(int i11, ByteBuffer byteBuffer) {
            this.f112793a = i11;
            this.f112794b = byteBuffer;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f112795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f112796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f112797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f112798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f112799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f112800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f112801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f112802h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112803i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f112804j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f112805k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f112806l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f112807m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f112808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f112809o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f112810p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f112811q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f112812r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f112813s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f112814t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r11;
            s7.a.a(dVar.f112793a == 1);
            byte[] bArr = new byte[dVar.f112794b.remaining()];
            dVar.f112794b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            this.f112801g = b0Var.h(3);
            b0Var.q();
            boolean zG2 = b0Var.g();
            this.f112795a = zG2;
            if (zG2) {
                iH2 = b0Var.h(5);
                this.f112796b = false;
                this.f112804j = false;
                r11 = 0;
                iH = 0;
            } else {
                if (b0Var.g()) {
                    b(b0Var);
                    boolean zG3 = b0Var.g();
                    this.f112796b = zG3;
                    if (zG3) {
                        b0Var.r(47);
                    }
                } else {
                    this.f112796b = false;
                }
                this.f112804j = b0Var.g();
                int iH3 = b0Var.h(5);
                int iH4 = 0;
                int i11 = 0;
                boolean z11 = false;
                iH = 0;
                while (i11 <= iH3) {
                    b0Var.r(12);
                    if (i11 == 0) {
                        iH4 = b0Var.h(5);
                        if (iH4 > 7) {
                            zG = z11;
                            zG = b0Var.g();
                        }
                    } else if (b0Var.h(5) > 7) {
                        zG = z11;
                        b0Var.q();
                        zG = z11;
                    }
                    zG = z11;
                    zG = z11;
                    if (this.f112796b) {
                        b0Var.q();
                    }
                    if (this.f112804j && b0Var.g()) {
                        if (i11 == 0) {
                            iH = b0Var.h(4);
                        } else {
                            b0Var.r(4);
                        }
                    }
                    i11++;
                    z11 = zG;
                }
                iH2 = iH4;
                r11 = z11;
            }
            int iH5 = b0Var.h(4);
            int iH6 = b0Var.h(4);
            b0Var.r(iH5 + 1);
            b0Var.r(iH6 + 1);
            if (this.f112795a) {
                this.f112797c = false;
            } else {
                this.f112797c = b0Var.g();
            }
            if (this.f112797c) {
                b0Var.r(4);
                b0Var.r(3);
            }
            b0Var.r(3);
            if (this.f112795a) {
                this.f112799e = true;
                this.f112798d = true;
                this.f112800f = 0;
            } else {
                b0Var.r(4);
                boolean zG4 = b0Var.g();
                if (zG4) {
                    b0Var.r(2);
                }
                if (b0Var.g()) {
                    this.f112798d = true;
                } else {
                    this.f112798d = b0Var.g();
                }
                if (!this.f112798d || b0Var.g()) {
                    this.f112799e = true;
                } else {
                    this.f112799e = b0Var.g();
                }
                if (zG4) {
                    this.f112800f = b0Var.h(3) + 1;
                } else {
                    this.f112800f = 0;
                }
            }
            this.f112802h = iH2;
            this.f112803i = r11;
            this.f112805k = iH;
            b0Var.r(3);
            boolean zG5 = b0Var.g();
            this.f112806l = zG5;
            if (this.f112801g == 2 && zG5) {
                this.f112807m = b0Var.g();
            } else {
                this.f112807m = false;
            }
            if (this.f112801g != 1) {
                this.f112808n = b0Var.g();
            } else {
                this.f112808n = false;
            }
            if (b0Var.g()) {
                this.f112812r = (byte) b0Var.h(8);
                this.f112813s = (byte) b0Var.h(8);
                this.f112814t = (byte) b0Var.h(8);
            } else {
                this.f112812r = (byte) 0;
                this.f112813s = (byte) 0;
                this.f112814t = (byte) 0;
            }
            if (this.f112808n) {
                b0Var.q();
                this.f112809o = false;
                this.f112810p = false;
                this.f112811q = 0;
            } else if (this.f112812r == 1 && this.f112813s == 13 && this.f112814t == 0) {
                this.f112809o = false;
                this.f112810p = false;
                this.f112811q = 0;
            } else {
                b0Var.q();
                int i12 = this.f112801g;
                if (i12 == 0) {
                    this.f112809o = true;
                    this.f112810p = true;
                } else if (i12 == 1) {
                    this.f112809o = false;
                    this.f112810p = false;
                } else if (this.f112807m) {
                    boolean zG6 = b0Var.g();
                    this.f112809o = zG6;
                    if (zG6) {
                        this.f112810p = b0Var.g();
                    } else {
                        this.f112810p = false;
                    }
                } else {
                    this.f112809o = true;
                    this.f112810p = false;
                }
                if (this.f112809o && this.f112810p) {
                    this.f112811q = b0Var.h(2);
                } else {
                    this.f112811q = 0;
                }
            }
            b0Var.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(b0 b0Var) {
            b0Var.r(64);
            if (b0Var.g()) {
                i.d(b0Var);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            byte b11 = byteBuffer.get();
            i11 |= (b11 & 127) << (i12 * 7);
            if ((b11 & 128) == 0) {
                return i11;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(b0 b0Var) {
        int i11 = 0;
        while (!b0Var.g()) {
            i11++;
        }
        if (i11 < 32) {
            b0Var.r(i11);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b11 = byteBufferAsReadOnlyBuffer.get();
            int i11 = (b11 >> 3) & 15;
            if (((b11 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b11 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i11, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z11) throws c {
        if (z11) {
            throw new c();
        }
    }
}
