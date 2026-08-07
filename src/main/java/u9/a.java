package u9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.plaid.internal.EnumC4419g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;
import s7.c0;
import s7.t;
import t9.j;
import t9.n;
import t9.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f115960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f115961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f115962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f115963l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<r7.a> f115966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<r7.a> f115967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f115968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f115969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f115970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f115971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f115972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f115973v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f115975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f115976y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f115958z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 93, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 9632};
    private static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE};
    private static final int[] E = {193, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 211, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 200, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 171, 187};
    private static final int[] F = {195, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 123, 125, 92, 94, 95, 124, 126, 196, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 165, 164, 9474, 197, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f115959h = new c0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<C2496a> f115964m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2496a f115965n = new C2496a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f115974w = 0;

    /* JADX INFO: renamed from: u9.a$a, reason: collision with other inner class name */
    private static final class C2496a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C2497a> f115977a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f115978b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f115979c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f115980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f115981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f115982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f115983g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f115984h;

        /* JADX INFO: renamed from: u9.a$a$a, reason: collision with other inner class name */
        private static class C2497a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f115985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f115986b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f115987c;

            public C2497a(int i11, boolean z11, int i12) {
                this.f115985a = i11;
                this.f115986b = z11;
                this.f115987c = i12;
            }
        }

        public C2496a(int i11, int i12) {
            j(i11);
            this.f115984h = i12;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f115979c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 < this.f115977a.size()) {
                C2497a c2497a = this.f115977a.get(i15);
                boolean z12 = c2497a.f115986b;
                int i17 = c2497a.f115985a;
                if (i17 != 8) {
                    boolean z13 = i17 == 7;
                    if (i17 != 7) {
                        i14 = a.B[i17];
                    }
                    z11 = z13;
                }
                int i18 = c2497a.f115987c;
                i15++;
                if (i18 != (i15 < this.f115977a.size() ? this.f115977a.get(i15).f115987c : length)) {
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
            if (this.f115979c.length() < 32) {
                this.f115979c.append(c11);
            }
        }

        public void f() {
            int length = this.f115979c.length();
            if (length > 0) {
                this.f115979c.delete(length - 1, length);
                for (int size = this.f115977a.size() - 1; size >= 0; size--) {
                    C2497a c2497a = this.f115977a.get(size);
                    int i11 = c2497a.f115987c;
                    if (i11 != length) {
                        return;
                    }
                    c2497a.f115987c = i11 - 1;
                }
            }
        }

        public r7.a g(int i11) {
            float f11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f115978b.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f115978b.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i13 = this.f115981e + this.f115982f;
            int length = (32 - i13) - spannableStringBuilder.length();
            int i14 = i13 - length;
            if (i11 == Integer.MIN_VALUE) {
                i11 = (this.f115983g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f115983g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i13 = 32 - length;
                }
                f11 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f11 = 0.5f;
            }
            int i15 = this.f115980d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f115983g == 1) {
                i15 -= this.f115984h - 1;
            }
            return new r7.a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f11).l(i11).a();
        }

        public boolean i() {
            return this.f115977a.isEmpty() && this.f115978b.isEmpty() && this.f115979c.length() == 0;
        }

        public void j(int i11) {
            this.f115983g = i11;
            this.f115977a.clear();
            this.f115978b.clear();
            this.f115979c.setLength(0);
            this.f115980d = 15;
            this.f115981e = 0;
            this.f115982f = 0;
        }

        public void k() {
            this.f115978b.add(h());
            this.f115979c.setLength(0);
            this.f115977a.clear();
            int iMin = Math.min(this.f115984h, this.f115980d);
            while (this.f115978b.size() >= iMin) {
                this.f115978b.remove(0);
            }
        }

        public void l(int i11) {
            this.f115983g = i11;
        }

        public void m(int i11) {
            this.f115984h = i11;
        }

        public void p(int i11, boolean z11) {
            this.f115977a.add(new C2497a(i11, z11, this.f115979c.length()));
        }
    }

    public a(String str, int i11, long j11) {
        if (j11 != -9223372036854775807L) {
            s7.a.a(j11 >= 16000);
            this.f115963l = j11 * 1000;
        } else {
            this.f115963l = -9223372036854775807L;
        }
        this.f115960i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.f115962k = 0;
            this.f115961j = 0;
        } else if (i11 == 2) {
            this.f115962k = 1;
            this.f115961j = 0;
        } else if (i11 == 3) {
            this.f115962k = 0;
            this.f115961j = 1;
        } else if (i11 != 4) {
            t.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f115962k = 0;
            this.f115961j = 0;
        } else {
            this.f115962k = 1;
            this.f115961j = 1;
        }
        O(0);
        N();
        this.f115975x = true;
        this.f115976y = -9223372036854775807L;
    }

    private void A(byte b11, byte b12) {
        int i11 = f115958z[b11 & 7];
        if ((b12 & 32) != 0) {
            i11++;
        }
        if (i11 != this.f115965n.f115980d) {
            if (this.f115968q != 1 && !this.f115965n.i()) {
                C2496a c2496a = new C2496a(this.f115968q, this.f115969r);
                this.f115965n = c2496a;
                this.f115964m.add(c2496a);
            }
            this.f115965n.f115980d = i11;
        }
        boolean z11 = (b12 & Tnaf.POW_2_WIDTH) == 16;
        boolean z12 = (b12 & 1) == 1;
        int i12 = (b12 >> 1) & 7;
        this.f115965n.p(z11 ? 8 : i12, z12);
        if (z11) {
            this.f115965n.f115981e = A[i12];
        }
    }

    private static boolean B(byte b11) {
        return (b11 & 224) == 0;
    }

    private static boolean C(byte b11, byte b12) {
        return (b11 & 246) == 18 && (b12 & 224) == 32;
    }

    private static boolean D(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 32;
    }

    private static boolean E(byte b11, byte b12) {
        return (b11 & 246) == 20 && (b12 & 240) == 32;
    }

    private static boolean F(byte b11, byte b12) {
        return (b11 & 240) == 16 && (b12 & 192) == 64;
    }

    private static boolean G(byte b11) {
        return (b11 & 240) == 16;
    }

    private boolean H(boolean z11, byte b11, byte b12) {
        if (!z11 || !G(b11)) {
            this.f115971t = false;
        } else {
            if (this.f115971t && this.f115972u == b11 && this.f115973v == b12) {
                this.f115971t = false;
                return true;
            }
            this.f115971t = true;
            this.f115972u = b11;
            this.f115973v = b12;
        }
        return false;
    }

    private static boolean I(byte b11) {
        return (b11 & 246) == 20;
    }

    private static boolean J(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 48;
    }

    private static boolean K(byte b11, byte b12) {
        return (b11 & 247) == 23 && b12 >= 33 && b12 <= 35;
    }

    private static boolean L(byte b11) {
        return 1 <= b11 && b11 <= 15;
    }

    private void M(byte b11, byte b12) {
        if (L(b11)) {
            this.f115975x = false;
            return;
        }
        if (I(b11)) {
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
                                this.f115975x = false;
                                break;
                        }
                        return;
                }
            }
            this.f115975x = true;
        }
    }

    private void N() {
        this.f115965n.j(this.f115968q);
        this.f115964m.clear();
        this.f115964m.add(this.f115965n);
    }

    private void O(int i11) {
        int i12 = this.f115968q;
        if (i12 == i11) {
            return;
        }
        this.f115968q = i11;
        if (i11 == 3) {
            for (int i13 = 0; i13 < this.f115964m.size(); i13++) {
                this.f115964m.get(i13).l(i11);
            }
            return;
        }
        N();
        if (i12 == 3 || i11 == 1 || i11 == 0) {
            this.f115966o = Collections.EMPTY_LIST;
        }
    }

    private void P(int i11) {
        this.f115969r = i11;
        this.f115965n.m(i11);
    }

    private boolean Q() {
        return (this.f115963l == -9223372036854775807L || this.f115976y == -9223372036854775807L || l() - this.f115976y < this.f115963l) ? false : true;
    }

    private boolean R(byte b11) {
        if (B(b11)) {
            this.f115974w = s(b11);
        }
        return this.f115974w == this.f115962k;
    }

    private static char r(byte b11) {
        return (char) C[(b11 & 127) - 32];
    }

    private static int s(byte b11) {
        return (b11 >> 3) & 1;
    }

    private List<r7.a> t() {
        int size = this.f115964m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i11 = 0; i11 < size; i11++) {
            r7.a aVarG = this.f115964m.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f107074i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            r7.a aVar = (r7.a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f107074i != iMin) {
                    aVar = (r7.a) s7.a.f(this.f115964m.get(i12).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b11) {
        return (char) E[b11 & 31];
    }

    private static char v(byte b11) {
        return (char) F[b11 & 31];
    }

    private static char w(byte b11, byte b12) {
        return (b11 & 1) == 0 ? u(b12) : v(b12);
    }

    private static char x(byte b11) {
        return (char) D[b11 & 15];
    }

    private void y(byte b11) {
        this.f115965n.e(' ');
        this.f115965n.p((b11 >> 1) & 7, (b11 & 1) == 1);
    }

    private void z(byte b11) {
        if (b11 == 32) {
            O(2);
            return;
        }
        if (b11 == 41) {
            O(3);
            return;
        }
        switch (b11) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i11 = this.f115968q;
                if (i11 != 0) {
                    if (b11 != 33) {
                        switch (b11) {
                            case 44:
                                this.f115966o = Collections.EMPTY_LIST;
                                if (i11 == 1 || i11 == 3) {
                                    N();
                                }
                                break;
                            case 45:
                                if (i11 == 1 && !this.f115965n.i()) {
                                    this.f115965n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f115966o = t();
                                N();
                                break;
                        }
                    } else {
                        this.f115965n.f();
                        break;
                    }
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
        this.f115966o = null;
        this.f115967p = null;
        O(0);
        P(4);
        N();
        this.f115970s = false;
        this.f115971t = false;
        this.f115972u = (byte) 0;
        this.f115973v = (byte) 0;
        this.f115974w = 0;
        this.f115975x = true;
        this.f115976y = -9223372036854775807L;
    }

    @Override // u9.e
    protected j g() {
        List<r7.a> list = this.f115966o;
        this.f115967p = list;
        return new f((List) s7.a.f(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // u9.e
    protected void h(n nVar) {
        boolean z11;
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(nVar.f9286d);
        this.f115959h.Z(byteBuffer.array(), byteBuffer.limit());
        boolean z12 = false;
        while (true) {
            int iA = this.f115959h.a();
            int i11 = this.f115960i;
            if (iA < i11) {
                break;
            }
            int iM = i11 == 2 ? -4 : this.f115959h.M();
            int iM2 = this.f115959h.M();
            int iM3 = this.f115959h.M();
            if ((iM & 2) == 0 && (iM & 1) == this.f115961j) {
                byte b11 = (byte) (iM2 & 127);
                byte b12 = (byte) (iM3 & 127);
                if (b11 != 0 || b12 != 0) {
                    boolean z13 = this.f115970s;
                    if ((iM & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iM2] && zArr[iM3]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    this.f115970s = z11;
                    if (!H(z11, b11, b12)) {
                        if (this.f115970s) {
                            M(b11, b12);
                            if (this.f115975x && R(b11)) {
                                if (!B(b11)) {
                                    this.f115965n.e(r(b11));
                                    if ((b12 & 224) != 0) {
                                        this.f115965n.e(r(b12));
                                    }
                                } else if (J(b11, b12)) {
                                    this.f115965n.e(x(b12));
                                } else if (C(b11, b12)) {
                                    this.f115965n.f();
                                    this.f115965n.e(w(b11, b12));
                                } else if (D(b11, b12)) {
                                    y(b12);
                                } else if (F(b11, b12)) {
                                    A(b11, b12);
                                } else if (K(b11, b12)) {
                                    this.f115965n.f115982f = b12 - 32;
                                } else if (E(b11, b12)) {
                                    z(b12);
                                }
                                z12 = true;
                            }
                        } else if (z13) {
                            N();
                            z12 = true;
                        }
                    }
                }
            }
        }
        if (z12) {
            int i12 = this.f115968q;
            if (i12 == 1 || i12 == 3) {
                this.f115966o = t();
                this.f115976y = l();
            }
        }
    }

    @Override // u9.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ n b() {
        return super.b();
    }

    @Override // u9.e, y7.d, i8.b
    /* JADX INFO: renamed from: j */
    public o a() {
        o oVarK;
        o oVarA = super.a();
        if (oVarA != null) {
            return oVarA;
        }
        if (!Q() || (oVarK = k()) == null) {
            return null;
        }
        this.f115966o = Collections.EMPTY_LIST;
        this.f115976y = -9223372036854775807L;
        oVarK.p(l(), g(), Long.MAX_VALUE);
        return oVarK;
    }

    @Override // u9.e
    protected boolean m() {
        return this.f115966o != this.f115967p;
    }

    @Override // u9.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void d(n nVar) {
        super.d(nVar);
    }

    @Override // u9.e, y7.d
    public void release() {
    }
}
