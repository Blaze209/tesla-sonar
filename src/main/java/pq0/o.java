package pq0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f103723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f103724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f103725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f103726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f103727h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f103720a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f103721b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<sq0.o> f103722c = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f103728i = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103729a;

        static {
            int[] iArr = new int[b.values().length];
            f103729a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103729a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103729a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103729a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103729a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103729a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int a(CharSequence charSequence, int i11) {
        int iM = rq0.d.m(charSequence, i11, charSequence.length());
        int iA = rq0.c.a(charSequence, iM);
        if (iA == -1) {
            return -1;
        }
        this.f103725f = charSequence.charAt(iM) == '<' ? charSequence.subSequence(iM + 1, iA - 1).toString() : charSequence.subSequence(iM, iA).toString();
        int iM2 = rq0.d.m(charSequence, iA, charSequence.length());
        if (iM2 >= charSequence.length()) {
            this.f103728i = true;
            this.f103721b.setLength(0);
        } else if (iM2 == iA) {
            return -1;
        }
        this.f103720a = b.START_TITLE;
        return iM2;
    }

    private void b() {
        if (this.f103728i) {
            String strE = rq0.a.e(this.f103725f);
            StringBuilder sb2 = this.f103727h;
            this.f103722c.add(new sq0.o(this.f103724e, strE, sb2 != null ? rq0.a.e(sb2.toString()) : null));
            this.f103723d = null;
            this.f103728i = false;
            this.f103724e = null;
            this.f103725f = null;
            this.f103727h = null;
        }
    }

    private int e(CharSequence charSequence, int i11) {
        int i12;
        int iC = rq0.c.c(charSequence, i11);
        if (iC == -1) {
            return -1;
        }
        this.f103723d.append(charSequence, i11, iC);
        if (iC >= charSequence.length()) {
            this.f103723d.append('\n');
            return iC;
        }
        if (charSequence.charAt(iC) != ']' || (i12 = iC + 1) >= charSequence.length() || charSequence.charAt(i12) != ':' || this.f103723d.length() > 999) {
            return -1;
        }
        String strB = rq0.a.b(this.f103723d.toString());
        if (strB.isEmpty()) {
            return -1;
        }
        this.f103724e = strB;
        this.f103720a = b.DESTINATION;
        return rq0.d.m(charSequence, iC + 2, charSequence.length());
    }

    private int g(CharSequence charSequence, int i11) {
        int iM = rq0.d.m(charSequence, i11, charSequence.length());
        if (iM >= charSequence.length() || charSequence.charAt(iM) != '[') {
            return -1;
        }
        this.f103720a = b.LABEL;
        this.f103723d = new StringBuilder();
        int i12 = iM + 1;
        if (i12 >= charSequence.length()) {
            this.f103723d.append('\n');
        }
        return i12;
    }

    private int h(CharSequence charSequence, int i11) {
        int iM = rq0.d.m(charSequence, i11, charSequence.length());
        if (iM >= charSequence.length()) {
            this.f103720a = b.START_DEFINITION;
            return iM;
        }
        this.f103726g = (char) 0;
        char cCharAt = charSequence.charAt(iM);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.f103726g = cCharAt;
        } else if (cCharAt == '(') {
            this.f103726g = CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        if (this.f103726g == 0) {
            b();
            this.f103720a = b.START_DEFINITION;
            return iM;
        }
        this.f103720a = b.TITLE;
        this.f103727h = new StringBuilder();
        int i12 = iM + 1;
        if (i12 == charSequence.length()) {
            this.f103727h.append('\n');
        }
        return i12;
    }

    private int i(CharSequence charSequence, int i11) {
        int iE = rq0.c.e(charSequence, i11, this.f103726g);
        if (iE == -1) {
            return -1;
        }
        this.f103727h.append(charSequence.subSequence(i11, iE));
        if (iE >= charSequence.length()) {
            this.f103727h.append('\n');
            return iE;
        }
        int iM = rq0.d.m(charSequence, iE + 1, charSequence.length());
        if (iM != charSequence.length()) {
            return -1;
        }
        this.f103728i = true;
        b();
        this.f103721b.setLength(0);
        this.f103720a = b.START_DEFINITION;
        return iM;
    }

    List<sq0.o> c() {
        b();
        return this.f103722c;
    }

    CharSequence d() {
        return this.f103721b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[LOOP:0: B:6:0x0015->B:23:?, LOOP_END, SYNTHETIC] */
    public void f(CharSequence charSequence) {
        if (this.f103721b.length() != 0) {
            this.f103721b.append('\n');
        }
        this.f103721b.append(charSequence);
        int iG = 0;
        while (iG < charSequence.length()) {
            switch (a.f103729a[this.f103720a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    iG = g(charSequence, iG);
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
                case 3:
                    iG = e(charSequence, iG);
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
                case 4:
                    iG = a(charSequence, iG);
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
                case 5:
                    iG = h(charSequence, iG);
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
                case 6:
                    iG = i(charSequence, iG);
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
                default:
                    if (iG == -1) {
                        this.f103720a = b.PARAGRAPH;
                        return;
                    }
                    break;
            }
        }
    }
}
