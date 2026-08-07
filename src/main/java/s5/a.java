package s5;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f110152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f110153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f110154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f110155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f110156h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f110157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f110159c;

    /* JADX INFO: renamed from: s5.a$a, reason: collision with other inner class name */
    public static final class C2337a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f110160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f110161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g f110162c;

        public C2337a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z11) {
            return z11 ? a.f110156h : a.f110155g;
        }

        private void c(boolean z11) {
            this.f110160a = z11;
            this.f110162c = a.f110152d;
            this.f110161b = 2;
        }

        public a a() {
            return (this.f110161b == 2 && this.f110162c == a.f110152d) ? b(this.f110160a) : new a(this.f110160a, this.f110161b, this.f110162c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f110163f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f110164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f110165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f110166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f110167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f110168e;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f110163f[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence, boolean z11) {
            this.f110164a = charSequence;
            this.f110165b = z11;
            this.f110166c = charSequence.length();
        }

        private static byte c(char c11) {
            return c11 < 1792 ? f110163f[c11] : Character.getDirectionality(c11);
        }

        private byte f() {
            char cCharAt;
            int i11 = this.f110167d;
            do {
                int i12 = this.f110167d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f110164a;
                int i13 = i12 - 1;
                this.f110167d = i13;
                cCharAt = charSequence.charAt(i13);
                this.f110168e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f110167d = i11;
            this.f110168e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i11 = this.f110167d;
                if (i11 >= this.f110166c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f110164a;
                this.f110167d = i11 + 1;
                cCharAt = charSequence.charAt(i11);
                this.f110168e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i11 = this.f110167d;
            while (true) {
                int i12 = this.f110167d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f110164a;
                int i13 = i12 - 1;
                this.f110167d = i13;
                char cCharAt2 = charSequence.charAt(i13);
                this.f110168e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i14 = this.f110167d;
                        if (i14 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f110164a;
                        int i15 = i14 - 1;
                        this.f110167d = i15;
                        cCharAt = charSequence2.charAt(i15);
                        this.f110168e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f110167d = i11;
            this.f110168e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i11 = this.f110167d;
            while (true) {
                int i12 = this.f110167d;
                if (i12 >= this.f110166c) {
                    this.f110167d = i11;
                    this.f110168e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f110164a;
                this.f110167d = i12 + 1;
                char cCharAt2 = charSequence.charAt(i12);
                this.f110168e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f110167d;
                        if (i13 >= this.f110166c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f110164a;
                        this.f110167d = i13 + 1;
                        cCharAt = charSequence2.charAt(i13);
                        this.f110168e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f110164a.charAt(this.f110167d - 1);
            this.f110168e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f110164a, this.f110167d);
                this.f110167d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f110167d--;
            byte bC = c(this.f110168e);
            if (!this.f110165b) {
                return bC;
            }
            char c11 = this.f110168e;
            if (c11 == '>') {
                return h();
            }
            return c11 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f110164a.charAt(this.f110167d);
            this.f110168e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f110164a, this.f110167d);
                this.f110167d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f110167d++;
            byte bC = c(this.f110168e);
            if (!this.f110165b) {
                return bC;
            }
            char c11 = this.f110168e;
            if (c11 == '<') {
                return i();
            }
            return c11 == '&' ? g() : bC;
        }

        int d() {
            this.f110167d = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.f110167d < this.f110166c && i11 == 0) {
                byte b11 = b();
                if (b11 != 0) {
                    if (b11 == 1 || b11 == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (b11 != 9) {
                        switch (b11) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.f110167d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                    default:
                        continue;
                }
                i13--;
            }
            return 0;
        }

        int e() {
            this.f110167d = this.f110166c;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.f110167d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i12 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                        if (i12 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i12 == i11) {
                                    return -1;
                                }
                                i11--;
                                break;
                            case 16:
                            case 17:
                                if (i12 == i11) {
                                    return 1;
                                }
                                i11--;
                                break;
                            case 18:
                                i11++;
                                break;
                            default:
                                if (i12 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        g gVar = h.f110184c;
        f110152d = gVar;
        f110153e = Character.toString((char) 8206);
        f110154f = Character.toString((char) 8207);
        f110155g = new a(false, 2, gVar);
        f110156h = new a(true, 2, gVar);
    }

    a(boolean z11, int i11, g gVar) {
        this.f110157a = z11;
        this.f110158b = i11;
        this.f110159c = gVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C2337a().a();
    }

    static boolean e(Locale locale) {
        return i.a(locale) == 1;
    }

    private String f(CharSequence charSequence, g gVar) {
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f110157a && (zIsRtl || b(charSequence) == 1)) {
            return f110153e;
        }
        if (this.f110157a) {
            return (!zIsRtl || b(charSequence) == -1) ? f110154f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, g gVar) {
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f110157a && (zIsRtl || a(charSequence) == 1)) {
            return f110153e;
        }
        if (this.f110157a) {
            return (!zIsRtl || a(charSequence) == -1) ? f110154f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f110158b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f110159c, true);
    }

    public CharSequence i(CharSequence charSequence, g gVar, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z11) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? h.f110183b : h.f110182a));
        }
        if (zIsRtl != this.f110157a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? h.f110183b : h.f110182a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f110159c, true);
    }

    public String k(String str, g gVar, boolean z11) {
        if (str == null) {
            return null;
        }
        return i(str, gVar, z11).toString();
    }
}
