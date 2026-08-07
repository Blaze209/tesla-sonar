package ou;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements q<Character> {

    static abstract class a extends d {
        a() {
        }

        @Override // ou.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f99995a;

        b(char c11) {
            this.f99995a = c11;
        }

        @Override // ou.d
        public boolean e(char c11) {
            return c11 == this.f99995a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f99995a) + "')";
        }
    }

    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99996a;

        c(String str) {
            this.f99996a = (String) p.m(str);
        }

        public final String toString() {
            return this.f99996a;
        }
    }

    /* JADX INFO: renamed from: ou.d$d, reason: collision with other inner class name */
    private static final class C2122d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f99997b = new C2122d();

        private C2122d() {
            super("CharMatcher.none()");
        }

        @Override // ou.d
        public int c(CharSequence charSequence, int i11) {
            p.o(i11, charSequence.length());
            return -1;
        }

        @Override // ou.d
        public boolean e(char c11) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c11) {
        return new b(c11);
    }

    public static d f() {
        return C2122d.f99997b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c11) {
        char[] cArr = new char[6];
        cArr[0] = CoreConstants.ESCAPE_CHAR;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        p.o(i11, length);
        while (i11 < length) {
            if (e(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public abstract boolean e(char c11);
}
