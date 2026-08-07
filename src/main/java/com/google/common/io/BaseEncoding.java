package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f43751a = new d("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f43752b = new d("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f43753c = new f("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f43754d = new f("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f43755e = new c("base16()", "0123456789ABCDEF");

    public static final class DecodingException extends IOException {
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f43761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f43762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f43763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f43764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f43765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f43766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f43767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f43768i;

        b(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < cArr.length; i11++) {
                char c11 = cArr[i11];
                boolean z11 = true;
                p.f(c11 < 128, "Non-ASCII character: %s", c11);
                if (bArr[c11] != -1) {
                    z11 = false;
                }
                p.f(z11, "Duplicate character: %s", c11);
                bArr[c11] = (byte) i11;
            }
            return bArr;
        }

        char c(int i11) {
            return this.f43761b[i11];
        }

        public boolean d(char c11) {
            byte[] bArr = this.f43766g;
            return c11 < bArr.length && bArr[c11] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f43768i == bVar.f43768i && Arrays.equals(this.f43761b, bVar.f43761b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f43761b) + (this.f43768i ? 1231 : 1237);
        }

        public String toString() {
            return this.f43760a;
        }

        private b(String str, char[] cArr, byte[] bArr, boolean z11) {
            this.f43760a = (String) p.m(str);
            this.f43761b = (char[]) p.m(cArr);
            try {
                int iE = qu.d.e(cArr.length, RoundingMode.UNNECESSARY);
                this.f43763d = iE;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
                int i11 = 1 << (3 - iNumberOfTrailingZeros);
                this.f43764e = i11;
                this.f43765f = iE >> iNumberOfTrailingZeros;
                this.f43762c = cArr.length - 1;
                this.f43766g = bArr;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < this.f43765f; i12++) {
                    zArr[qu.d.b(i12 * 8, this.f43763d, RoundingMode.CEILING)] = true;
                }
                this.f43767h = zArr;
                this.f43768i = z11;
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
            }
        }
    }

    private static final class c extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final char[] f43769h;

        c(String str, String str2) {
            this(new b(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.f, com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            p.m(appendable);
            p.q(i11, i11 + i12, bArr.length);
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bArr[i11 + i13] & 255;
                appendable.append(this.f43769h[i14]);
                appendable.append(this.f43769h[i14 | 256]);
            }
        }

        private c(b bVar) {
            super(bVar, null);
            this.f43769h = new char[512];
            p.d(bVar.f43761b.length == 16);
            for (int i11 = 0; i11 < 256; i11++) {
                this.f43769h[i11] = bVar.c(i11 >>> 4);
                this.f43769h[i11 | 256] = bVar.c(i11 & 15);
            }
        }
    }

    private static final class d extends f {
        d(String str, String str2, Character ch2) {
            this(new b(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.f, com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            p.m(appendable);
            int i13 = i11 + i12;
            p.q(i11, i13, bArr.length);
            while (i12 >= 3) {
                int i14 = i11 + 2;
                int i15 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
                i11 += 3;
                int i16 = i15 | (bArr[i14] & 255);
                appendable.append(this.f43773f.c(i16 >>> 18));
                appendable.append(this.f43773f.c((i16 >>> 12) & 63));
                appendable.append(this.f43773f.c((i16 >>> 6) & 63));
                appendable.append(this.f43773f.c(i16 & 63));
                i12 -= 3;
            }
            if (i11 < i13) {
                h(appendable, bArr, i11, i13 - i11);
            }
        }

        private d(b bVar, Character ch2) {
            super(bVar, ch2);
            p.d(bVar.f43761b.length == 64);
        }
    }

    static final class e extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final BaseEncoding f43770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f43771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f43772h;

        e(BaseEncoding baseEncoding, String str, int i11) {
            this.f43770f = (BaseEncoding) p.m(baseEncoding);
            this.f43771g = (String) p.m(str);
            this.f43772h = i11;
            p.g(i11 > 0, "Cannot add a separator after every %s chars", i11);
        }

        @Override // com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i11, int i12) {
            this.f43770f.d(BaseEncoding.f(appendable, this.f43771g, this.f43772h), bArr, i11, i12);
        }

        @Override // com.google.common.io.BaseEncoding
        int e(int i11) {
            int iE = this.f43770f.e(i11);
            return iE + (this.f43771g.length() * qu.d.b(Math.max(0, iE - 1), this.f43772h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding g(String str, int i11) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        public String toString() {
            return this.f43770f + ".withSeparator(\"" + this.f43771g + "\", " + this.f43772h + ")";
        }
    }

    private static class f extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final b f43773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f43774g;

        f(String str, String str2, Character ch2) {
            this(new b(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            p.m(appendable);
            p.q(i11, i11 + i12, bArr.length);
            int i13 = 0;
            while (i13 < i12) {
                h(appendable, bArr, i11 + i13, Math.min(this.f43773f.f43765f, i12 - i13));
                i13 += this.f43773f.f43765f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int e(int i11) {
            b bVar = this.f43773f;
            return bVar.f43764e * qu.d.b(i11, bVar.f43765f, RoundingMode.CEILING);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f43773f.equals(fVar.f43773f) && Objects.equals(this.f43774g, fVar.f43774g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding g(String str, int i11) {
            for (int i12 = 0; i12 < str.length(); i12++) {
                p.j(!this.f43773f.d(str.charAt(i12)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.f43774g;
            if (ch2 != null) {
                p.j(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new e(this, str, i11);
        }

        void h(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            p.m(appendable);
            p.q(i11, i11 + i12, bArr.length);
            int i13 = 0;
            p.d(i12 <= this.f43773f.f43765f);
            long j11 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                j11 = (j11 | ((long) (bArr[i11 + i14] & 255))) << 8;
            }
            int i15 = ((i12 + 1) * 8) - this.f43773f.f43763d;
            while (i13 < i12 * 8) {
                b bVar = this.f43773f;
                appendable.append(bVar.c(((int) (j11 >>> (i15 - i13))) & bVar.f43762c));
                i13 += this.f43773f.f43763d;
            }
            if (this.f43774g != null) {
                while (i13 < this.f43773f.f43765f * 8) {
                    appendable.append(this.f43774g.charValue());
                    i13 += this.f43773f.f43763d;
                }
            }
        }

        public int hashCode() {
            return this.f43773f.hashCode() ^ Objects.hashCode(this.f43774g);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f43773f);
            if (8 % this.f43773f.f43763d != 0) {
                if (this.f43774g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f43774g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        f(b bVar, Character ch2) {
            this.f43773f = (b) p.m(bVar);
            p.j(ch2 == null || !bVar.d(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f43774g = ch2;
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f43755e;
    }

    static Appendable f(Appendable appendable, String str, int i11) {
        p.m(appendable);
        p.m(str);
        p.d(i11 > 0);
        return new a(i11, appendable, str);
    }

    public String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public final String c(byte[] bArr, int i11, int i12) {
        p.q(i11, i11 + i12, bArr.length);
        StringBuilder sb2 = new StringBuilder(e(i12));
        try {
            d(sb2, bArr, i11, i12);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    abstract void d(Appendable appendable, byte[] bArr, int i11, int i12);

    abstract int e(int i11);

    public abstract BaseEncoding g(String str, int i11);

    class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Appendable f43758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f43759d;

        a(int i11, Appendable appendable, String str) {
            this.f43757b = i11;
            this.f43758c = appendable;
            this.f43759d = str;
            this.f43756a = i11;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f43756a == 0) {
                this.f43758c.append(this.f43759d);
                this.f43756a = this.f43757b;
            }
            this.f43758c.append(c11);
            this.f43756a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i11, int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }
}
