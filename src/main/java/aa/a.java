package aa;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import s7.c0;
import s7.n;
import s7.q0;
import s7.t;
import t9.d;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f870a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f876g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f872c = 0;
            this.f873d = -1;
            this.f874e = "sans-serif";
            this.f871b = false;
            this.f875f = 0.85f;
            this.f876g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f872c = bArr[24];
        this.f873d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f874e = "Serif".equals(q0.L(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f876g = i11;
        boolean z11 = (bArr[0] & 32) != 0;
        this.f871b = z11;
        if (z11) {
            this.f875f = q0.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, BitmapDescriptorFactory.HUE_RED, 0.95f);
        } else {
            this.f875f = 0.85f;
        }
    }

    private void d(c0 c0Var, SpannableStringBuilder spannableStringBuilder) {
        s7.a.a(c0Var.a() >= 12);
        int iU = c0Var.U();
        int iU2 = c0Var.U();
        c0Var.c0(2);
        int iM = c0Var.M();
        c0Var.c0(1);
        int iV = c0Var.v();
        if (iU2 > spannableStringBuilder.length()) {
            t.i("Tx3gParser", "Truncating styl end (" + iU2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iU2 = spannableStringBuilder.length();
        }
        int i11 = iU2;
        if (iU < i11) {
            f(spannableStringBuilder, iM, this.f872c, iU, i11, 0);
            e(spannableStringBuilder, iV, this.f873d, iU, i11, 0);
            return;
        }
        t.i("Tx3gParser", "Ignoring styl with start (" + iU + ") >= end (" + i11 + ").");
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            int i16 = i15 | 33;
            boolean z11 = (i11 & 1) != 0;
            boolean z12 = (i11 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i13, i14, i16);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i13, i14, i16);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, i16);
            }
            boolean z13 = (i11 & 4) != 0;
            if (z13) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, i16);
            }
            if (z13 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i13, i14, i16);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i11, i12, 16711713);
        }
    }

    private static String h(c0 c0Var) {
        s7.a.a(c0Var.a() >= 2);
        int iU = c0Var.U();
        if (iU == 0) {
            return "";
        }
        int iG = c0Var.g();
        Charset charsetW = c0Var.W();
        int iG2 = iU - (c0Var.g() - iG);
        if (charsetW == null) {
            charsetW = StandardCharsets.UTF_8;
        }
        return c0Var.K(iG2, charsetW);
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<d> nVar) {
        this.f870a.Z(bArr, i12 + i11);
        this.f870a.b0(i11);
        String strH = h(this.f870a);
        if (strH.isEmpty()) {
            nVar.accept(new d(x.r(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f872c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f873d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f874e, 0, spannableStringBuilder.length());
        float fQ = this.f875f;
        while (this.f870a.a() >= 8) {
            int iG = this.f870a.g();
            int iV = this.f870a.v();
            int iV2 = this.f870a.v();
            if (iV2 == 1937013100) {
                s7.a.a(this.f870a.a() >= 2);
                int iU = this.f870a.U();
                for (int i13 = 0; i13 < iU; i13++) {
                    d(this.f870a, spannableStringBuilder);
                }
            } else if (iV2 == 1952608120 && this.f871b) {
                s7.a.a(this.f870a.a() >= 2);
                fQ = q0.q(this.f870a.U() / this.f876g, BitmapDescriptorFactory.HUE_RED, 0.95f);
            }
            this.f870a.b0(iG + iV);
        }
        nVar.accept(new d(x.s(new r7.a.b().o(spannableStringBuilder).h(fQ, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // t9.q
    public int b() {
        return 2;
    }
}
