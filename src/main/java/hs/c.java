package hs;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.nearby.uwb.RangingPosition;
import gs.i;
import gs.m;
import gs.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.c0;
import ts.d0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f73570g = new d0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f73571h = new c0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73572i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f73573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f73574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b[] f73575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f73576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<gs.b> f73577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<gs.b> f73578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C1545c f73579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f73580q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f73581c = new Comparator() { // from class: hs.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f73583b, ((c.a) obj).f73583b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final gs.b f73582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73583b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f11, int i11, int i12, float f12, int i13, float f13, boolean z11, int i14, int i15) {
            gs.b.C1421b c1421bN = new gs.b.C1421b().o(charSequence).p(alignment).h(f11, i11).i(i12).k(f12).l(i13).n(f13);
            if (z11) {
                c1421bN.s(i14);
            }
            this.f73582a = c1421bN.a();
            this.f73583b = i15;
        }
    }

    private static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f73584w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f73585x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f73586y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f73587z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f73588a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f73589b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f73590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f73592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f73593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f73594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f73595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f73596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f73597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f73598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f73599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f73600m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f73601n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f73602o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f73603p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f73604q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f73605r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f73606s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f73607t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f73608u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f73609v;

        static {
            int iH = h(0, 0, 0, 0);
            f73585x = iH;
            int iH2 = h(0, 0, 0, 3);
            f73586y = iH2;
            f73587z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i11, int i12, int i13) {
            return h(i11, i12, i13, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int h(int i11, int i12, int i13, int i14) {
            int i15;
            ts.a.c(i11, 0, 4);
            ts.a.c(i12, 0, 4);
            ts.a.c(i13, 0, 4);
            ts.a.c(i14, 0, 4);
            if (i14 == 0 || i14 == 1) {
                i15 = 255;
            } else if (i14 == 2) {
                i15 = 127;
            } else if (i14 != 3) {
                i15 = 255;
            } else {
                i15 = 0;
            }
            return Color.argb(i15, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0, i13 > 1 ? 255 : 0);
        }

        public void a(char c11) {
            if (c11 != '\n') {
                this.f73589b.append(c11);
                return;
            }
            this.f73588a.add(d());
            this.f73589b.clear();
            if (this.f73603p != -1) {
                this.f73603p = 0;
            }
            if (this.f73604q != -1) {
                this.f73604q = 0;
            }
            if (this.f73605r != -1) {
                this.f73605r = 0;
            }
            if (this.f73607t != -1) {
                this.f73607t = 0;
            }
            while (true) {
                if ((!this.f73598k || this.f73588a.size() < this.f73597j) && this.f73588a.size() < 15) {
                    return;
                } else {
                    this.f73588a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f73589b.length();
            if (length > 0) {
                this.f73589b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f11;
            float f12;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f73588a.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f73588a.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i12 = this.f73599l;
            int i13 = 2;
            if (i12 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i12 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f73599l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f73593f) {
                f11 = this.f73595h / 99.0f;
                f12 = this.f73594g / 99.0f;
            } else {
                f11 = this.f73595h / 209.0f;
                f12 = this.f73594g / 74.0f;
            }
            float f13 = (f11 * 0.9f) + 0.05f;
            float f14 = (f12 * 0.9f) + 0.05f;
            int i14 = this.f73596i;
            int i15 = i14 / 3 == 0 ? 0 : i14 / 3 == 1 ? 1 : 2;
            if (i14 % 3 == 0) {
                i13 = 0;
            } else if (i14 % 3 == 1) {
                i13 = 1;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i15, f13, i13, -3.4028235E38f, this.f73602o != f73585x, this.f73602o, this.f73592e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f73589b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f73603p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f73603p, length, 33);
                }
                if (this.f73604q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f73604q, length, 33);
                }
                if (this.f73605r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f73606s), this.f73605r, length, 33);
                }
                if (this.f73607t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f73608u), this.f73607t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f73588a.clear();
            this.f73589b.clear();
            this.f73603p = -1;
            this.f73604q = -1;
            this.f73605r = -1;
            this.f73607t = -1;
            this.f73609v = 0;
        }

        public void f(boolean z11, boolean z12, boolean z13, int i11, boolean z14, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f73590c = true;
            this.f73591d = z11;
            this.f73598k = z12;
            this.f73592e = i11;
            this.f73593f = z14;
            this.f73594g = i12;
            this.f73595h = i13;
            this.f73596i = i16;
            int i19 = i14 + 1;
            if (this.f73597j != i19) {
                this.f73597j = i19;
                while (true) {
                    if ((!z12 || this.f73588a.size() < this.f73597j) && this.f73588a.size() < 15) {
                        break;
                    } else {
                        this.f73588a.remove(0);
                    }
                }
            }
            if (i17 != 0 && this.f73600m != i17) {
                this.f73600m = i17;
                int i21 = i17 - 1;
                q(D[i21], f73586y, C[i21], 0, A[i21], B[i21], f73587z[i21]);
            }
            if (i18 == 0 || this.f73601n == i18) {
                return;
            }
            this.f73601n = i18;
            int i22 = i18 - 1;
            m(0, 1, 1, false, false, F[i22], E[i22]);
            n(f73584w, G[i22], f73585x);
        }

        public boolean i() {
            return this.f73590c;
        }

        public boolean j() {
            if (i()) {
                return this.f73588a.isEmpty() && this.f73589b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f73591d;
        }

        public void l() {
            e();
            this.f73590c = false;
            this.f73591d = false;
            this.f73592e = 4;
            this.f73593f = false;
            this.f73594g = 0;
            this.f73595h = 0;
            this.f73596i = 0;
            this.f73597j = 15;
            this.f73598k = true;
            this.f73599l = 0;
            this.f73600m = 0;
            this.f73601n = 0;
            int i11 = f73585x;
            this.f73602o = i11;
            this.f73606s = f73584w;
            this.f73608u = i11;
        }

        public void m(int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15) {
            if (this.f73603p != -1) {
                if (!z11) {
                    this.f73589b.setSpan(new StyleSpan(2), this.f73603p, this.f73589b.length(), 33);
                    this.f73603p = -1;
                }
            } else if (z11) {
                this.f73603p = this.f73589b.length();
            }
            if (this.f73604q == -1) {
                if (z12) {
                    this.f73604q = this.f73589b.length();
                }
            } else {
                if (z12) {
                    return;
                }
                this.f73589b.setSpan(new UnderlineSpan(), this.f73604q, this.f73589b.length(), 33);
                this.f73604q = -1;
            }
        }

        public void n(int i11, int i12, int i13) {
            if (this.f73605r != -1 && this.f73606s != i11) {
                this.f73589b.setSpan(new ForegroundColorSpan(this.f73606s), this.f73605r, this.f73589b.length(), 33);
            }
            if (i11 != f73584w) {
                this.f73605r = this.f73589b.length();
                this.f73606s = i11;
            }
            if (this.f73607t != -1 && this.f73608u != i12) {
                this.f73589b.setSpan(new BackgroundColorSpan(this.f73608u), this.f73607t, this.f73589b.length(), 33);
            }
            if (i12 != f73585x) {
                this.f73607t = this.f73589b.length();
                this.f73608u = i12;
            }
        }

        public void o(int i11, int i12) {
            if (this.f73609v != i11) {
                a('\n');
            }
            this.f73609v = i11;
        }

        public void p(boolean z11) {
            this.f73591d = z11;
        }

        public void q(int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
            this.f73602o = i11;
            this.f73599l = i16;
        }
    }

    /* JADX INFO: renamed from: hs.c$c, reason: collision with other inner class name */
    private static final class C1545c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f73612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73613d = 0;

        public C1545c(int i11, int i12) {
            this.f73610a = i11;
            this.f73611b = i12;
            this.f73612c = new byte[(i12 * 2) - 1];
        }
    }

    public c(int i11, List<byte[]> list) {
        this.f73574k = i11 == -1 ? 1 : i11;
        this.f73573j = list != null && ts.e.f(list);
        this.f73575l = new b[8];
        for (int i12 = 0; i12 < 8; i12++) {
            this.f73575l[i12] = new b();
        }
        this.f73576m = this.f73575l[0];
    }

    private void A() {
        int iH = b.h(this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2));
        int iH2 = b.h(this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2));
        this.f73571h.r(2);
        this.f73576m.n(iH, iH2, b.g(this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2)));
    }

    private void B() {
        this.f73571h.r(4);
        int iH = this.f73571h.h(4);
        this.f73571h.r(2);
        this.f73576m.o(iH, this.f73571h.h(6));
    }

    private void C() {
        int iH = b.h(this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2));
        int iH2 = this.f73571h.h(2);
        int iG = b.g(this.f73571h.h(2), this.f73571h.h(2), this.f73571h.h(2));
        if (this.f73571h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f73571h.g();
        int iH3 = this.f73571h.h(2);
        int iH4 = this.f73571h.h(2);
        int iH5 = this.f73571h.h(2);
        this.f73571h.r(8);
        this.f73576m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    private void D() {
        C1545c c1545c = this.f73579p;
        if (c1545c.f73613d != (c1545c.f73611b * 2) - 1) {
            u.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f73579p.f73611b * 2) - 1) + ", but current index is " + this.f73579p.f73613d + " (sequence number " + this.f73579p.f73610a + ");");
        }
        c0 c0Var = this.f73571h;
        C1545c c1545c2 = this.f73579p;
        c0Var.o(c1545c2.f73612c, c1545c2.f73613d);
        boolean z11 = false;
        while (this.f73571h.b() > 0) {
            int iH = this.f73571h.h(3);
            int iH2 = this.f73571h.h(5);
            if (iH == 7) {
                this.f73571h.r(2);
                iH = this.f73571h.h(6);
                if (iH < 7) {
                    u.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                u.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f73574k) {
                this.f73571h.s(iH2);
            } else {
                int iE = this.f73571h.e() + (iH2 * 8);
                while (this.f73571h.e() < iE) {
                    int iH3 = this.f73571h.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f73571h.h(8);
                        if (iH4 <= 31) {
                            s(iH4);
                        } else {
                            if (iH4 <= 127) {
                                x(iH4);
                            } else if (iH4 <= 159) {
                                t(iH4);
                            } else if (iH4 <= 255) {
                                y(iH4);
                            } else {
                                u.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z11 = true;
                        }
                    } else if (iH3 <= 31) {
                        q(iH3);
                    } else {
                        if (iH3 <= 127) {
                            v(iH3);
                        } else if (iH3 <= 159) {
                            r(iH3);
                        } else if (iH3 <= 255) {
                            w(iH3);
                        } else {
                            u.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z11 = true;
                    }
                }
            }
        }
        if (z11) {
            this.f73577n = p();
        }
    }

    private void E() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f73575l[i11].l();
        }
    }

    private void o() {
        if (this.f73579p == null) {
            return;
        }
        D();
        this.f73579p = null;
    }

    private List<gs.b> p() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            if (!this.f73575l[i11].j() && this.f73575l[i11].k() && (aVarC = this.f73575l[i11].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f73581c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((a) arrayList.get(i12)).f73582a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i11) {
        if (i11 != 0) {
            if (i11 == 3) {
                this.f73577n = p();
                return;
            }
            if (i11 == 8) {
                this.f73576m.b();
                return;
            }
            switch (i11) {
                case 12:
                    E();
                    break;
                case 13:
                    this.f73576m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i11 >= 17 && i11 <= 23) {
                        u.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i11);
                        this.f73571h.r(8);
                    } else if (i11 >= 24 && i11 <= 31) {
                        u.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i11);
                        this.f73571h.r(16);
                    } else {
                        u.i("Cea708Decoder", "Invalid C0 command: " + i11);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void r(int i11) {
        int i12 = 1;
        switch (i11) {
            case 128:
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i11 + RangingPosition.RSSI_UNKNOWN;
                if (this.f73580q != i13) {
                    this.f73580q = i13;
                    this.f73576m = this.f73575l[i13];
                }
                break;
            case 136:
                while (i12 <= 8) {
                    if (this.f73571h.g()) {
                        this.f73575l[8 - i12].e();
                    }
                    i12++;
                }
                break;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f73571h.g()) {
                        this.f73575l[8 - i14].p(true);
                    }
                }
                break;
            case 138:
                while (i12 <= 8) {
                    if (this.f73571h.g()) {
                        this.f73575l[8 - i12].p(false);
                    }
                    i12++;
                }
                break;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f73571h.g()) {
                        b bVar = this.f73575l[8 - i15];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i12 <= 8) {
                    if (this.f73571h.g()) {
                        this.f73575l[8 - i12].l();
                    }
                    i12++;
                }
                break;
            case 141:
                this.f73571h.r(8);
                break;
            case 142:
                break;
            case 143:
                E();
                break;
            case 144:
                if (this.f73576m.i()) {
                    z();
                } else {
                    this.f73571h.r(16);
                }
                break;
            case 145:
                if (this.f73576m.i()) {
                    A();
                } else {
                    this.f73571h.r(24);
                }
                break;
            case 146:
                if (this.f73576m.i()) {
                    B();
                } else {
                    this.f73571h.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                u.i("Cea708Decoder", "Invalid C1 command: " + i11);
                break;
            case 151:
                if (this.f73576m.i()) {
                    C();
                } else {
                    this.f73571h.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i11 - 152;
                u(i16);
                if (this.f73580q != i16) {
                    this.f73580q = i16;
                    this.f73576m = this.f73575l[i16];
                }
                break;
        }
    }

    private void s(int i11) {
        if (i11 <= 7) {
            return;
        }
        if (i11 <= 15) {
            this.f73571h.r(8);
        } else if (i11 <= 23) {
            this.f73571h.r(16);
        } else if (i11 <= 31) {
            this.f73571h.r(24);
        }
    }

    private void t(int i11) {
        if (i11 <= 135) {
            this.f73571h.r(32);
            return;
        }
        if (i11 <= 143) {
            this.f73571h.r(40);
        } else if (i11 <= 159) {
            this.f73571h.r(2);
            this.f73571h.r(this.f73571h.h(6) * 8);
        }
    }

    private void u(int i11) {
        b bVar = this.f73575l[i11];
        this.f73571h.r(2);
        boolean zG = this.f73571h.g();
        boolean zG2 = this.f73571h.g();
        boolean zG3 = this.f73571h.g();
        int iH = this.f73571h.h(3);
        boolean zG4 = this.f73571h.g();
        int iH2 = this.f73571h.h(7);
        int iH3 = this.f73571h.h(8);
        int iH4 = this.f73571h.h(4);
        int iH5 = this.f73571h.h(4);
        this.f73571h.r(2);
        int iH6 = this.f73571h.h(6);
        this.f73571h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f73571h.h(3), this.f73571h.h(3));
    }

    private void v(int i11) {
        if (i11 == 127) {
            this.f73576m.a((char) 9835);
        } else {
            this.f73576m.a((char) (i11 & 255));
        }
    }

    private void w(int i11) {
        this.f73576m.a((char) (i11 & 255));
    }

    private void x(int i11) {
        if (i11 == 32) {
            this.f73576m.a(' ');
            return;
        }
        if (i11 == 33) {
            this.f73576m.a((char) 160);
            return;
        }
        if (i11 == 37) {
            this.f73576m.a((char) 8230);
            return;
        }
        if (i11 == 42) {
            this.f73576m.a((char) 352);
            return;
        }
        if (i11 == 44) {
            this.f73576m.a((char) 338);
            return;
        }
        if (i11 == 63) {
            this.f73576m.a((char) 376);
            return;
        }
        if (i11 == 57) {
            this.f73576m.a((char) 8482);
            return;
        }
        if (i11 == 58) {
            this.f73576m.a((char) 353);
            return;
        }
        if (i11 == 60) {
            this.f73576m.a((char) 339);
            return;
        }
        if (i11 == 61) {
            this.f73576m.a((char) 8480);
            return;
        }
        switch (i11) {
            case 48:
                this.f73576m.a((char) 9608);
                break;
            case 49:
                this.f73576m.a((char) 8216);
                break;
            case 50:
                this.f73576m.a((char) 8217);
                break;
            case 51:
                this.f73576m.a((char) 8220);
                break;
            case 52:
                this.f73576m.a((char) 8221);
                break;
            case 53:
                this.f73576m.a((char) 8226);
                break;
            default:
                switch (i11) {
                    case 118:
                        this.f73576m.a((char) 8539);
                        break;
                    case 119:
                        this.f73576m.a((char) 8540);
                        break;
                    case 120:
                        this.f73576m.a((char) 8541);
                        break;
                    case 121:
                        this.f73576m.a((char) 8542);
                        break;
                    case 122:
                        this.f73576m.a((char) 9474);
                        break;
                    case 123:
                        this.f73576m.a((char) 9488);
                        break;
                    case 124:
                        this.f73576m.a((char) 9492);
                        break;
                    case 125:
                        this.f73576m.a((char) 9472);
                        break;
                    case 126:
                        this.f73576m.a((char) 9496);
                        break;
                    case 127:
                        this.f73576m.a((char) 9484);
                        break;
                    default:
                        u.i("Cea708Decoder", "Invalid G2 character: " + i11);
                        break;
                }
                break;
        }
    }

    private void y(int i11) {
        if (i11 == 160) {
            this.f73576m.a((char) 13252);
            return;
        }
        u.i("Cea708Decoder", "Invalid G3 character: " + i11);
        this.f73576m.a('_');
    }

    private void z() {
        this.f73576m.m(this.f73571h.h(4), this.f73571h.h(2), this.f73571h.h(2), this.f73571h.g(), this.f73571h.g(), this.f73571h.h(3), this.f73571h.h(3));
    }

    @Override // hs.e, gs.j
    public /* bridge */ /* synthetic */ void c(long j11) {
        super.c(j11);
    }

    @Override // hs.e
    protected i e() {
        List<gs.b> list = this.f73577n;
        this.f73578o = list;
        return new f((List) ts.a.e(list));
    }

    @Override // hs.e
    protected void f(m mVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(mVar.f39720c);
        this.f73570g.S(byteBuffer.array(), byteBuffer.limit());
        while (this.f73570g.a() >= 3) {
            int iH = this.f73570g.H();
            int i11 = iH & 3;
            boolean z11 = (iH & 4) == 4;
            byte bH = (byte) this.f73570g.H();
            byte bH2 = (byte) this.f73570g.H();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        o();
                        int i12 = (bH & 192) >> 6;
                        int i13 = this.f73572i;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            E();
                            u.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f73572i + " current=" + i12);
                        }
                        this.f73572i = i12;
                        int i14 = bH & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C1545c c1545c = new C1545c(i12, i14);
                        this.f73579p = c1545c;
                        byte[] bArr = c1545c.f73612c;
                        int i15 = c1545c.f73613d;
                        c1545c.f73613d = i15 + 1;
                        bArr[i15] = bH2;
                    } else {
                        ts.a.a(i11 == 2);
                        C1545c c1545c2 = this.f73579p;
                        if (c1545c2 == null) {
                            u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c1545c2.f73612c;
                            int i16 = c1545c2.f73613d;
                            int i17 = i16 + 1;
                            c1545c2.f73613d = i17;
                            bArr2[i16] = bH;
                            c1545c2.f73613d = i16 + 2;
                            bArr2[i17] = bH2;
                        }
                    }
                    C1545c c1545c3 = this.f73579p;
                    if (c1545c3.f73613d == (c1545c3.f73611b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // hs.e, fr.d
    public void flush() {
        super.flush();
        this.f73577n = null;
        this.f73578o = null;
        this.f73580q = 0;
        this.f73576m = this.f73575l[0];
        E();
        this.f73579p = null;
    }

    @Override // hs.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ m b() {
        return super.b();
    }

    @Override // hs.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ n a() {
        return super.a();
    }

    @Override // hs.e
    protected boolean k() {
        return this.f73577n != this.f73578o;
    }

    @Override // hs.e
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void d(m mVar) {
        super.d(mVar);
    }

    @Override // hs.e, fr.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
