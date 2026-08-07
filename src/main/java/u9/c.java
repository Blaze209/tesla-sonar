package u9;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.b0;
import s7.c0;
import s7.k;
import s7.t;
import t9.j;
import t9.n;
import t9.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f115988h = new c0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f115989i = new b0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f115990j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f115991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f115992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f115993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f115994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<r7.a> f115995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<r7.a> f115996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2498c f115997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f115998r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f115999c = new Comparator() { // from class: u9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f116001b, ((c.a) obj).f116001b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r7.a f116000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116001b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f11, int i11, int i12, float f12, int i13, float f13, boolean z11, int i14, int i15) {
            r7.a.b bVarN = new r7.a.b().o(charSequence).p(alignment).h(f11, i11).i(i12).k(f12).l(i13).n(f13);
            if (z11) {
                bVarN.s(i14);
            }
            this.f116000a = bVarN.a();
            this.f116001b = i15;
        }
    }

    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f116002v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f116003w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f116004x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f116005y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f116006z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f116007a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f116008b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f116009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f116010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f116011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f116012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f116013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f116014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f116015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f116016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f116017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f116018l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f116019m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f116020n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f116021o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f116022p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f116023q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f116024r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f116025s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f116026t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f116027u;

        static {
            int iH = h(0, 0, 0, 0);
            f116003w = iH;
            int iH2 = h(0, 0, 0, 3);
            f116004x = iH2;
            f116005y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f116006z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
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
            s7.a.c(i11, 0, 4);
            s7.a.c(i12, 0, 4);
            s7.a.c(i13, 0, 4);
            s7.a.c(i14, 0, 4);
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
                this.f116008b.append(c11);
                return;
            }
            this.f116007a.add(d());
            this.f116008b.clear();
            if (this.f116021o != -1) {
                this.f116021o = 0;
            }
            if (this.f116022p != -1) {
                this.f116022p = 0;
            }
            if (this.f116023q != -1) {
                this.f116023q = 0;
            }
            if (this.f116025s != -1) {
                this.f116025s = 0;
            }
            while (true) {
                if (this.f116007a.size() < this.f116016j && this.f116007a.size() < 15) {
                    this.f116027u = this.f116007a.size();
                    return;
                }
                this.f116007a.remove(0);
            }
        }

        public void b() {
            int length = this.f116008b.length();
            if (length > 0) {
                this.f116008b.delete(length - 1, length);
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
            for (int i11 = 0; i11 < this.f116007a.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f116007a.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i12 = this.f116017k;
            int i13 = 2;
            if (i12 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i12 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f116017k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f116012f) {
                f11 = this.f116014h / 99.0f;
                f12 = this.f116013g / 99.0f;
            } else {
                f11 = this.f116014h / 209.0f;
                f12 = this.f116013g / 74.0f;
            }
            float f13 = (f11 * 0.9f) + 0.05f;
            float f14 = (f12 * 0.9f) + 0.05f;
            int i14 = this.f116015i;
            int i15 = i14 / 3 == 0 ? 0 : i14 / 3 == 1 ? 1 : 2;
            if (i14 % 3 == 0) {
                i13 = 0;
            } else if (i14 % 3 == 1) {
                i13 = 1;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i15, f13, i13, -3.4028235E38f, this.f116020n != f116003w, this.f116020n, this.f116011e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f116008b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f116021o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f116021o, length, 33);
                }
                if (this.f116022p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f116022p, length, 33);
                }
                if (this.f116023q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f116024r), this.f116023q, length, 33);
                }
                if (this.f116025s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f116026t), this.f116025s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f116007a.clear();
            this.f116008b.clear();
            this.f116021o = -1;
            this.f116022p = -1;
            this.f116023q = -1;
            this.f116025s = -1;
            this.f116027u = 0;
        }

        public void f(boolean z11, int i11, boolean z12, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f116009c = true;
            this.f116010d = z11;
            this.f116011e = i11;
            this.f116012f = z12;
            this.f116013g = i12;
            this.f116014h = i13;
            this.f116015i = i15;
            int i18 = i14 + 1;
            if (this.f116016j != i18) {
                this.f116016j = i18;
                while (true) {
                    if (this.f116007a.size() < this.f116016j && this.f116007a.size() < 15) {
                        break;
                    } else {
                        this.f116007a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f116018l != i16) {
                this.f116018l = i16;
                int i19 = i16 - 1;
                q(C[i19], f116004x, B[i19], 0, f116006z[i19], A[i19], f116005y[i19]);
            }
            if (i17 == 0 || this.f116019m == i17) {
                return;
            }
            this.f116019m = i17;
            int i21 = i17 - 1;
            m(0, 1, 1, false, false, E[i21], D[i21]);
            n(f116002v, F[i21], f116003w);
        }

        public boolean i() {
            return this.f116009c;
        }

        public boolean j() {
            if (i()) {
                return this.f116007a.isEmpty() && this.f116008b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f116010d;
        }

        public void l() {
            e();
            this.f116009c = false;
            this.f116010d = false;
            this.f116011e = 4;
            this.f116012f = false;
            this.f116013g = 0;
            this.f116014h = 0;
            this.f116015i = 0;
            this.f116016j = 15;
            this.f116017k = 0;
            this.f116018l = 0;
            this.f116019m = 0;
            int i11 = f116003w;
            this.f116020n = i11;
            this.f116024r = f116002v;
            this.f116026t = i11;
        }

        public void m(int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15) {
            if (this.f116021o != -1) {
                if (!z11) {
                    this.f116008b.setSpan(new StyleSpan(2), this.f116021o, this.f116008b.length(), 33);
                    this.f116021o = -1;
                }
            } else if (z11) {
                this.f116021o = this.f116008b.length();
            }
            if (this.f116022p == -1) {
                if (z12) {
                    this.f116022p = this.f116008b.length();
                }
            } else {
                if (z12) {
                    return;
                }
                this.f116008b.setSpan(new UnderlineSpan(), this.f116022p, this.f116008b.length(), 33);
                this.f116022p = -1;
            }
        }

        public void n(int i11, int i12, int i13) {
            if (this.f116023q != -1 && this.f116024r != i11) {
                this.f116008b.setSpan(new ForegroundColorSpan(this.f116024r), this.f116023q, this.f116008b.length(), 33);
            }
            if (i11 != f116002v) {
                this.f116023q = this.f116008b.length();
                this.f116024r = i11;
            }
            if (this.f116025s != -1 && this.f116026t != i12) {
                this.f116008b.setSpan(new BackgroundColorSpan(this.f116026t), this.f116025s, this.f116008b.length(), 33);
            }
            if (i12 != f116003w) {
                this.f116025s = this.f116008b.length();
                this.f116026t = i12;
            }
        }

        public void o(int i11, int i12) {
            if (this.f116027u != i11) {
                a('\n');
            }
            this.f116027u = i11;
        }

        public void p(boolean z11) {
            this.f116010d = z11;
        }

        public void q(int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
            this.f116020n = i11;
            this.f116017k = i16;
        }
    }

    /* JADX INFO: renamed from: u9.c$c, reason: collision with other inner class name */
    private static final class C2498c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f116030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f116031d = 0;

        public C2498c(int i11, int i12) {
            this.f116028a = i11;
            this.f116029b = i12;
            this.f116030c = new byte[(i12 * 2) - 1];
        }
    }

    public c(int i11, List<byte[]> list) {
        this.f115992l = i11 == -1 ? 1 : i11;
        this.f115991k = list != null && k.C(list);
        this.f115993m = new b[8];
        for (int i12 = 0; i12 < 8; i12++) {
            this.f115993m[i12] = new b();
        }
        this.f115994n = this.f115993m[0];
    }

    private void A(int i11) {
        if (i11 == 160) {
            this.f115994n.a((char) 13252);
            return;
        }
        t.i("Cea708Decoder", "Invalid G3 character: " + i11);
        this.f115994n.a('_');
    }

    private void B() {
        this.f115994n.m(this.f115989i.h(4), this.f115989i.h(2), this.f115989i.h(2), this.f115989i.g(), this.f115989i.g(), this.f115989i.h(3), this.f115989i.h(3));
    }

    private void C() {
        int iH = b.h(this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2));
        int iH2 = b.h(this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2));
        this.f115989i.r(2);
        this.f115994n.n(iH, iH2, b.g(this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2)));
    }

    private void D() {
        this.f115989i.r(4);
        int iH = this.f115989i.h(4);
        this.f115989i.r(2);
        this.f115994n.o(iH, this.f115989i.h(6));
    }

    private void E() {
        int iH = b.h(this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2));
        int iH2 = this.f115989i.h(2);
        int iG = b.g(this.f115989i.h(2), this.f115989i.h(2), this.f115989i.h(2));
        if (this.f115989i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f115989i.g();
        int iH3 = this.f115989i.h(2);
        int iH4 = this.f115989i.h(2);
        int iH5 = this.f115989i.h(2);
        this.f115989i.r(8);
        this.f115994n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    private void F() {
        C2498c c2498c = this.f115997q;
        if (c2498c.f116031d != (c2498c.f116029b * 2) - 1) {
            t.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f115997q.f116029b * 2) - 1) + ", but current index is " + this.f115997q.f116031d + " (sequence number " + this.f115997q.f116028a + ");");
        }
        b0 b0Var = this.f115989i;
        C2498c c2498c2 = this.f115997q;
        b0Var.o(c2498c2.f116030c, c2498c2.f116031d);
        boolean z11 = false;
        while (this.f115989i.b() > 0) {
            int iH = this.f115989i.h(3);
            int iH2 = this.f115989i.h(5);
            if (iH == 7) {
                this.f115989i.r(2);
                iH = this.f115989i.h(6);
                if (iH < 7) {
                    t.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                t.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f115992l) {
                this.f115989i.s(iH2);
            } else {
                int iE = this.f115989i.e() + (iH2 * 8);
                while (this.f115989i.e() < iE) {
                    int iH3 = this.f115989i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f115989i.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                t.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z11 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            t.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z11 = true;
                    }
                }
            }
        }
        if (z11) {
            this.f115995o = r();
        }
    }

    private void G() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f115993m[i11].l();
        }
    }

    private void q() {
        if (this.f115997q == null) {
            return;
        }
        F();
        this.f115997q = null;
    }

    private List<r7.a> r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            if (!this.f115993m[i11].j() && this.f115993m[i11].k() && (aVarC = this.f115993m[i11].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f115999c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((a) arrayList.get(i12)).f116000a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i11) {
        if (i11 != 0) {
            if (i11 == 3) {
                this.f115995o = r();
                return;
            }
            if (i11 == 8) {
                this.f115994n.b();
                return;
            }
            switch (i11) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f115994n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i11 >= 17 && i11 <= 23) {
                        t.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i11);
                        this.f115989i.r(8);
                    } else if (i11 >= 24 && i11 <= 31) {
                        t.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i11);
                        this.f115989i.r(16);
                    } else {
                        t.i("Cea708Decoder", "Invalid C0 command: " + i11);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void t(int i11) {
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
                if (this.f115998r != i13) {
                    this.f115998r = i13;
                    this.f115994n = this.f115993m[i13];
                }
                break;
            case 136:
                while (i12 <= 8) {
                    if (this.f115989i.g()) {
                        this.f115993m[8 - i12].e();
                    }
                    i12++;
                }
                break;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f115989i.g()) {
                        this.f115993m[8 - i14].p(true);
                    }
                }
                break;
            case 138:
                while (i12 <= 8) {
                    if (this.f115989i.g()) {
                        this.f115993m[8 - i12].p(false);
                    }
                    i12++;
                }
                break;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f115989i.g()) {
                        b bVar = this.f115993m[8 - i15];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i12 <= 8) {
                    if (this.f115989i.g()) {
                        this.f115993m[8 - i12].l();
                    }
                    i12++;
                }
                break;
            case 141:
                this.f115989i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f115994n.i()) {
                    B();
                } else {
                    this.f115989i.r(16);
                }
                break;
            case 145:
                if (this.f115994n.i()) {
                    C();
                } else {
                    this.f115989i.r(24);
                }
                break;
            case 146:
                if (this.f115994n.i()) {
                    D();
                } else {
                    this.f115989i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                t.i("Cea708Decoder", "Invalid C1 command: " + i11);
                break;
            case 151:
                if (this.f115994n.i()) {
                    E();
                } else {
                    this.f115989i.r(32);
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
                w(i16);
                if (this.f115998r != i16) {
                    this.f115998r = i16;
                    this.f115994n = this.f115993m[i16];
                }
                break;
        }
    }

    private void u(int i11) {
        if (i11 <= 7) {
            return;
        }
        if (i11 <= 15) {
            this.f115989i.r(8);
        } else if (i11 <= 23) {
            this.f115989i.r(16);
        } else if (i11 <= 31) {
            this.f115989i.r(24);
        }
    }

    private void v(int i11) {
        if (i11 <= 135) {
            this.f115989i.r(32);
            return;
        }
        if (i11 <= 143) {
            this.f115989i.r(40);
        } else if (i11 <= 159) {
            this.f115989i.r(2);
            this.f115989i.r(this.f115989i.h(6) * 8);
        }
    }

    private void w(int i11) {
        b bVar = this.f115993m[i11];
        this.f115989i.r(2);
        boolean zG = this.f115989i.g();
        this.f115989i.r(2);
        int iH = this.f115989i.h(3);
        boolean zG2 = this.f115989i.g();
        int iH2 = this.f115989i.h(7);
        int iH3 = this.f115989i.h(8);
        int iH4 = this.f115989i.h(4);
        int iH5 = this.f115989i.h(4);
        this.f115989i.r(2);
        this.f115989i.r(6);
        this.f115989i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f115989i.h(3), this.f115989i.h(3));
    }

    private void x(int i11) {
        if (i11 == 127) {
            this.f115994n.a((char) 9835);
        } else {
            this.f115994n.a((char) (i11 & 255));
        }
    }

    private void y(int i11) {
        this.f115994n.a((char) (i11 & 255));
    }

    private void z(int i11) {
        if (i11 == 32) {
            this.f115994n.a(' ');
            return;
        }
        if (i11 == 33) {
            this.f115994n.a((char) 160);
            return;
        }
        if (i11 == 37) {
            this.f115994n.a((char) 8230);
            return;
        }
        if (i11 == 42) {
            this.f115994n.a((char) 352);
            return;
        }
        if (i11 == 44) {
            this.f115994n.a((char) 338);
            return;
        }
        if (i11 == 63) {
            this.f115994n.a((char) 376);
            return;
        }
        if (i11 == 57) {
            this.f115994n.a((char) 8482);
            return;
        }
        if (i11 == 58) {
            this.f115994n.a((char) 353);
            return;
        }
        if (i11 == 60) {
            this.f115994n.a((char) 339);
            return;
        }
        if (i11 == 61) {
            this.f115994n.a((char) 8480);
            return;
        }
        switch (i11) {
            case 48:
                this.f115994n.a((char) 9608);
                break;
            case 49:
                this.f115994n.a((char) 8216);
                break;
            case 50:
                this.f115994n.a((char) 8217);
                break;
            case 51:
                this.f115994n.a((char) 8220);
                break;
            case 52:
                this.f115994n.a((char) 8221);
                break;
            case 53:
                this.f115994n.a((char) 8226);
                break;
            default:
                switch (i11) {
                    case 118:
                        this.f115994n.a((char) 8539);
                        break;
                    case 119:
                        this.f115994n.a((char) 8540);
                        break;
                    case 120:
                        this.f115994n.a((char) 8541);
                        break;
                    case 121:
                        this.f115994n.a((char) 8542);
                        break;
                    case 122:
                        this.f115994n.a((char) 9474);
                        break;
                    case 123:
                        this.f115994n.a((char) 9488);
                        break;
                    case 124:
                        this.f115994n.a((char) 9492);
                        break;
                    case 125:
                        this.f115994n.a((char) 9472);
                        break;
                    case 126:
                        this.f115994n.a((char) 9496);
                        break;
                    case 127:
                        this.f115994n.a((char) 9484);
                        break;
                    default:
                        t.i("Cea708Decoder", "Invalid G2 character: " + i11);
                        break;
                }
                break;
        }
    }

    @Override // u9.e, t9.k
    public /* bridge */ /* synthetic */ void c(long j11) {
        super.c(j11);
    }

    @Override // u9.e, y7.d
    public void flush() {
        super.flush();
        this.f115995o = null;
        this.f115996p = null;
        this.f115998r = 0;
        this.f115994n = this.f115993m[0];
        G();
        this.f115997q = null;
    }

    @Override // u9.e
    protected j g() {
        List<r7.a> list = this.f115995o;
        this.f115996p = list;
        return new f((List) s7.a.f(list));
    }

    @Override // u9.e
    protected void h(n nVar) {
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(nVar.f9286d);
        this.f115988h.Z(byteBuffer.array(), byteBuffer.limit());
        while (this.f115988h.a() >= 3) {
            int iM = this.f115988h.M();
            int i11 = iM & 3;
            boolean z11 = (iM & 4) == 4;
            byte bM = (byte) this.f115988h.M();
            byte bM2 = (byte) this.f115988h.M();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        q();
                        int i12 = (bM & 192) >> 6;
                        int i13 = this.f115990j;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            G();
                            t.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f115990j + " current=" + i12);
                        }
                        this.f115990j = i12;
                        int i14 = bM & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C2498c c2498c = new C2498c(i12, i14);
                        this.f115997q = c2498c;
                        byte[] bArr = c2498c.f116030c;
                        int i15 = c2498c.f116031d;
                        c2498c.f116031d = i15 + 1;
                        bArr[i15] = bM2;
                    } else {
                        s7.a.a(i11 == 2);
                        C2498c c2498c2 = this.f115997q;
                        if (c2498c2 == null) {
                            t.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c2498c2.f116030c;
                            int i16 = c2498c2.f116031d;
                            int i17 = i16 + 1;
                            c2498c2.f116031d = i17;
                            bArr2[i16] = bM;
                            c2498c2.f116031d = i16 + 2;
                            bArr2[i17] = bM2;
                        }
                    }
                    C2498c c2498c3 = this.f115997q;
                    if (c2498c3.f116031d == (c2498c3.f116029b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // u9.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ n b() {
        return super.b();
    }

    @Override // u9.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ o a() {
        return super.a();
    }

    @Override // u9.e
    protected boolean m() {
        return this.f115995o != this.f115996p;
    }

    @Override // u9.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void d(n nVar) {
        super.d(nVar);
    }

    @Override // u9.e, y7.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
