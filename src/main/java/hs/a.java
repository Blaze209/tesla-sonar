package hs;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.plaid.internal.EnumC4419g;
import gs.i;
import gs.m;
import gs.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;
import ts.d0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f73542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f73543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f73544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f73545k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<gs.b> f73548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<gs.b> f73549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f73550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f73551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f73552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f73553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte f73554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f73555u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f73557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f73558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f73539y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f73540z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 93, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE};
    private static final int[] D = {193, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 211, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 200, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 171, 187};
    private static final int[] E = {195, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 123, 125, 92, 94, 95, 124, 126, 196, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 165, 164, 9474, 197, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f73541g = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<C1543a> f73546l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C1543a f73547m = new C1543a(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f73556v = 0;

    /* JADX INFO: renamed from: hs.a$a, reason: collision with other inner class name */
    private static final class C1543a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C1544a> f73559a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f73560b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f73561c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f73562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f73563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f73564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f73565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f73566h;

        /* JADX INFO: renamed from: hs.a$a$a, reason: collision with other inner class name */
        private static class C1544a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f73567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f73568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f73569c;

            public C1544a(int i11, boolean z11, int i12) {
                this.f73567a = i11;
                this.f73568b = z11;
                this.f73569c = i12;
            }
        }

        public C1543a(int i11, int i12) {
            j(i11);
            this.f73566h = i12;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f73561c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 < this.f73559a.size()) {
                C1544a c1544a = this.f73559a.get(i15);
                boolean z12 = c1544a.f73568b;
                int i17 = c1544a.f73567a;
                if (i17 != 8) {
                    boolean z13 = i17 == 7;
                    if (i17 != 7) {
                        i14 = a.A[i17];
                    }
                    z11 = z13;
                }
                int i18 = c1544a.f73569c;
                i15++;
                if (i18 != (i15 < this.f73559a.size() ? this.f73559a.get(i15).f73569c : length)) {
                    if (i11 != -1 && !z12) {
                        q(spannableStringBuilder, i11, i18);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i18;
                    }
                    if (i12 != -1 && !z11) {
                        o(spannableStringBuilder, i12, i18);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i18;
                    }
                    if (i14 != i13) {
                        n(spannableStringBuilder, i16, i18, i13);
                        i13 = i14;
                        i16 = i18;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                q(spannableStringBuilder, i11, length);
            }
            if (i12 != -1 && i12 != length) {
                o(spannableStringBuilder, i12, length);
            }
            if (i16 != length) {
                n(spannableStringBuilder, i16, length, i13);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
            if (i13 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i11, i12, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }

        public void e(char c11) {
            if (this.f73561c.length() < 32) {
                this.f73561c.append(c11);
            }
        }

        public void f() {
            int length = this.f73561c.length();
            if (length > 0) {
                this.f73561c.delete(length - 1, length);
                for (int size = this.f73559a.size() - 1; size >= 0; size--) {
                    C1544a c1544a = this.f73559a.get(size);
                    int i11 = c1544a.f73569c;
                    if (i11 != length) {
                        return;
                    }
                    c1544a.f73569c = i11 - 1;
                }
            }
        }

        public gs.b g(int i11) {
            float f11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f73560b.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f73560b.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i13 = this.f73563e + this.f73564f;
            int length = (32 - i13) - spannableStringBuilder.length();
            int i14 = i13 - length;
            if (i11 == Integer.MIN_VALUE) {
                i11 = (this.f73565g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f73565g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i13 = 32 - length;
                }
                f11 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f11 = 0.5f;
            }
            int i15 = this.f73562d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f73565g == 1) {
                i15 -= this.f73566h - 1;
            }
            return new gs.b.C1421b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f11).l(i11).a();
        }

        public boolean i() {
            return this.f73559a.isEmpty() && this.f73560b.isEmpty() && this.f73561c.length() == 0;
        }

        public void j(int i11) {
            this.f73565g = i11;
            this.f73559a.clear();
            this.f73560b.clear();
            this.f73561c.setLength(0);
            this.f73562d = 15;
            this.f73563e = 0;
            this.f73564f = 0;
        }

        public void k() {
            this.f73560b.add(h());
            this.f73561c.setLength(0);
            this.f73559a.clear();
            int iMin = Math.min(this.f73566h, this.f73562d);
            while (this.f73560b.size() >= iMin) {
                this.f73560b.remove(0);
            }
        }

        public void l(int i11) {
            this.f73565g = i11;
        }

        public void m(int i11) {
            this.f73566h = i11;
        }

        public void p(int i11, boolean z11) {
            this.f73559a.add(new C1544a(i11, z11, this.f73561c.length()));
        }
    }

    public a(String str, int i11, long j11) {
        this.f73545k = j11 > 0 ? j11 * 1000 : -9223372036854775807L;
        this.f73542h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.f73544j = 0;
            this.f73543i = 0;
        } else if (i11 == 2) {
            this.f73544j = 1;
            this.f73543i = 0;
        } else if (i11 == 3) {
            this.f73544j = 0;
            this.f73543i = 1;
        } else if (i11 != 4) {
            u.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f73544j = 0;
            this.f73543i = 0;
        } else {
            this.f73544j = 1;
            this.f73543i = 1;
        }
        M(0);
        L();
        this.f73557w = true;
        this.f73558x = -9223372036854775807L;
    }

    private static boolean A(byte b11, byte b12) {
        return (b11 & 246) == 18 && (b12 & 224) == 32;
    }

    private static boolean B(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 32;
    }

    private static boolean C(byte b11, byte b12) {
        return (b11 & 246) == 20 && (b12 & 240) == 32;
    }

    private static boolean D(byte b11, byte b12) {
        return (b11 & 240) == 16 && (b12 & 192) == 64;
    }

    private static boolean E(byte b11) {
        return (b11 & 240) == 16;
    }

    private boolean F(boolean z11, byte b11, byte b12) {
        if (!z11 || !E(b11)) {
            this.f73553s = false;
        } else {
            if (this.f73553s && this.f73554t == b11 && this.f73555u == b12) {
                this.f73553s = false;
                return true;
            }
            this.f73553s = true;
            this.f73554t = b11;
            this.f73555u = b12;
        }
        return false;
    }

    private static boolean G(byte b11) {
        return (b11 & 246) == 20;
    }

    private static boolean H(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 48;
    }

    private static boolean I(byte b11, byte b12) {
        return (b11 & 247) == 23 && b12 >= 33 && b12 <= 35;
    }

    private static boolean J(byte b11) {
        return 1 <= b11 && b11 <= 15;
    }

    private void K(byte b11, byte b12) {
        if (J(b11)) {
            this.f73557w = false;
            return;
        }
        if (G(b11)) {
            if (b12 != 32 && b12 != 47) {
                switch (b12) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b12) {
                            case 42:
                            case 43:
                                this.f73557w = false;
                                break;
                        }
                        return;
                }
            }
            this.f73557w = true;
        }
    }

    private void L() {
        this.f73547m.j(this.f73550p);
        this.f73546l.clear();
        this.f73546l.add(this.f73547m);
    }

    private void M(int i11) {
        int i12 = this.f73550p;
        if (i12 == i11) {
            return;
        }
        this.f73550p = i11;
        if (i11 == 3) {
            for (int i13 = 0; i13 < this.f73546l.size(); i13++) {
                this.f73546l.get(i13).l(i11);
            }
            return;
        }
        L();
        if (i12 == 3 || i11 == 1 || i11 == 0) {
            this.f73548n = Collections.EMPTY_LIST;
        }
    }

    private void N(int i11) {
        this.f73551q = i11;
        this.f73547m.m(i11);
    }

    private boolean O() {
        return (this.f73545k == -9223372036854775807L || this.f73558x == -9223372036854775807L || j() - this.f73558x < this.f73545k) ? false : true;
    }

    private boolean P(byte b11) {
        if (z(b11)) {
            this.f73556v = q(b11);
        }
        return this.f73556v == this.f73544j;
    }

    private static char p(byte b11) {
        return (char) B[(b11 & 127) - 32];
    }

    private static int q(byte b11) {
        return (b11 >> 3) & 1;
    }

    private List<gs.b> r() {
        int size = this.f73546l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i11 = 0; i11 < size; i11++) {
            gs.b bVarG = this.f73546l.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f69481i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            gs.b bVar = (gs.b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f69481i != iMin) {
                    bVar = (gs.b) ts.a.e(this.f73546l.get(i12).g(iMin));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b11) {
        return (char) D[b11 & 31];
    }

    private static char t(byte b11) {
        return (char) E[b11 & 31];
    }

    private static char u(byte b11, byte b12) {
        return (b11 & 1) == 0 ? s(b12) : t(b12);
    }

    private static char v(byte b11) {
        return (char) C[b11 & 15];
    }

    private void w(byte b11) {
        this.f73547m.e(' ');
        this.f73547m.p((b11 >> 1) & 7, (b11 & 1) == 1);
    }

    private void x(byte b11) {
        if (b11 == 32) {
            M(2);
            return;
        }
        if (b11 == 41) {
            M(3);
            return;
        }
        switch (b11) {
            case 37:
                M(1);
                N(2);
                break;
            case 38:
                M(1);
                N(3);
                break;
            case 39:
                M(1);
                N(4);
                break;
            default:
                int i11 = this.f73550p;
                if (i11 != 0) {
                    if (b11 != 33) {
                        switch (b11) {
                            case 44:
                                this.f73548n = Collections.EMPTY_LIST;
                                if (i11 == 1 || i11 == 3) {
                                    L();
                                }
                                break;
                            case 45:
                                if (i11 == 1 && !this.f73547m.i()) {
                                    this.f73547m.k();
                                    break;
                                }
                                break;
                            case 46:
                                L();
                                break;
                            case 47:
                                this.f73548n = r();
                                L();
                                break;
                        }
                    } else {
                        this.f73547m.f();
                        break;
                    }
                }
                break;
        }
    }

    private void y(byte b11, byte b12) {
        int i11 = f73539y[b11 & 7];
        if ((b12 & 32) != 0) {
            i11++;
        }
        if (i11 != this.f73547m.f73562d) {
            if (this.f73550p != 1 && !this.f73547m.i()) {
                C1543a c1543a = new C1543a(this.f73550p, this.f73551q);
                this.f73547m = c1543a;
                this.f73546l.add(c1543a);
            }
            this.f73547m.f73562d = i11;
        }
        boolean z11 = (b12 & Tnaf.POW_2_WIDTH) == 16;
        boolean z12 = (b12 & 1) == 1;
        int i12 = (b12 >> 1) & 7;
        this.f73547m.p(z11 ? 8 : i12, z12);
        if (z11) {
            this.f73547m.f73563e = f73540z[i12];
        }
    }

    private static boolean z(byte b11) {
        return (b11 & 224) == 0;
    }

    @Override // hs.e, gs.j
    public /* bridge */ /* synthetic */ void c(long j11) {
        super.c(j11);
    }

    @Override // hs.e
    protected i e() {
        List<gs.b> list = this.f73548n;
        this.f73549o = list;
        return new f((List) ts.a.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // hs.e
    protected void f(m mVar) {
        boolean z11;
        ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(mVar.f39720c);
        this.f73541g.S(byteBuffer.array(), byteBuffer.limit());
        boolean z12 = false;
        while (true) {
            int iA = this.f73541g.a();
            int i11 = this.f73542h;
            if (iA < i11) {
                break;
            }
            int iH = i11 == 2 ? -4 : this.f73541g.H();
            int iH2 = this.f73541g.H();
            int iH3 = this.f73541g.H();
            if ((iH & 2) == 0 && (iH & 1) == this.f73543i) {
                byte b11 = (byte) (iH2 & 127);
                byte b12 = (byte) (iH3 & 127);
                if (b11 != 0 || b12 != 0) {
                    boolean z13 = this.f73552r;
                    if ((iH & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iH2] && zArr[iH3]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    this.f73552r = z11;
                    if (!F(z11, b11, b12)) {
                        if (this.f73552r) {
                            K(b11, b12);
                            if (this.f73557w && P(b11)) {
                                if (!z(b11)) {
                                    this.f73547m.e(p(b11));
                                    if ((b12 & 224) != 0) {
                                        this.f73547m.e(p(b12));
                                    }
                                } else if (H(b11, b12)) {
                                    this.f73547m.e(v(b12));
                                } else if (A(b11, b12)) {
                                    this.f73547m.f();
                                    this.f73547m.e(u(b11, b12));
                                } else if (B(b11, b12)) {
                                    w(b12);
                                } else if (D(b11, b12)) {
                                    y(b11, b12);
                                } else if (I(b11, b12)) {
                                    this.f73547m.f73564f = b12 - 32;
                                } else if (C(b11, b12)) {
                                    x(b12);
                                }
                                z12 = true;
                            }
                        } else if (z13) {
                            L();
                            z12 = true;
                        }
                    }
                }
            }
        }
        if (z12) {
            int i12 = this.f73550p;
            if (i12 == 1 || i12 == 3) {
                this.f73548n = r();
                this.f73558x = j();
            }
        }
    }

    @Override // hs.e, fr.d
    public void flush() {
        super.flush();
        this.f73548n = null;
        this.f73549o = null;
        M(0);
        N(4);
        L();
        this.f73552r = false;
        this.f73553s = false;
        this.f73554t = (byte) 0;
        this.f73555u = (byte) 0;
        this.f73556v = 0;
        this.f73557w = true;
        this.f73558x = -9223372036854775807L;
    }

    @Override // hs.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ m b() {
        return super.b();
    }

    @Override // hs.e, fr.d
    /* JADX INFO: renamed from: h */
    public n a() {
        n nVarI;
        n nVarA = super.a();
        if (nVarA != null) {
            return nVarA;
        }
        if (!O() || (nVarI = i()) == null) {
            return null;
        }
        this.f73548n = Collections.EMPTY_LIST;
        this.f73558x = -9223372036854775807L;
        nVarI.q(j(), e(), Long.MAX_VALUE);
        return nVarI;
    }

    @Override // hs.e
    protected boolean k() {
        return this.f73548n != this.f73549o;
    }

    @Override // hs.e
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void d(m mVar) {
        super.d(mVar);
    }

    @Override // hs.e, fr.d
    public void release() {
    }
}
