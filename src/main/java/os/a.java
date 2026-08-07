package os;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gs.h;
import gs.i;
import java.nio.charset.Charset;
import java.util.List;
import ou.e;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f99982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f99983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f99984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f99985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f99986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f99987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f99988u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f99982o = new d0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f99984q = 0;
            this.f99985r = -1;
            this.f99986s = "sans-serif";
            this.f99983p = false;
            this.f99987t = 0.85f;
            this.f99988u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f99984q = bArr[24];
        this.f99985r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f99986s = "Serif".equals(p0.D(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f99988u = i11;
        boolean z11 = (bArr[0] & 32) != 0;
        this.f99983p = z11;
        if (z11) {
            this.f99987t = p0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, BitmapDescriptorFactory.HUE_RED, 0.95f);
        } else {
            this.f99987t = 0.85f;
        }
    }

    private void B(d0 d0Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        C(d0Var.a() >= 12);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        d0Var.V(2);
        int iH = d0Var.H();
        d0Var.V(1);
        int iQ = d0Var.q();
        if (iN2 > spannableStringBuilder.length()) {
            u.i("Tx3gDecoder", "Truncating styl end (" + iN2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iN2 = spannableStringBuilder.length();
        }
        int i11 = iN2;
        if (iN < i11) {
            E(spannableStringBuilder, iH, this.f99984q, iN, i11, 0);
            D(spannableStringBuilder, iQ, this.f99985r, iN, i11, 0);
            return;
        }
        u.i("Tx3gDecoder", "Ignoring styl with start (" + iN + ") >= end (" + i11 + ").");
    }

    private static void C(boolean z11) throws SubtitleDecoderException {
        if (!z11) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
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

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i11, i12, 16711713);
        }
    }

    private static String G(d0 d0Var) throws SubtitleDecoderException {
        C(d0Var.a() >= 2);
        int iN = d0Var.N();
        if (iN == 0) {
            return "";
        }
        int iF = d0Var.f();
        Charset charsetP = d0Var.P();
        int iF2 = iN - (d0Var.f() - iF);
        if (charsetP == null) {
            charsetP = e.f100000c;
        }
        return d0Var.F(iF2, charsetP);
    }

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) throws SubtitleDecoderException {
        this.f99982o.S(bArr, i11);
        String strG = G(this.f99982o);
        if (strG.isEmpty()) {
            return b.f99989b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        E(spannableStringBuilder, this.f99984q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f99985r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f99986s, 0, spannableStringBuilder.length());
        float fP = this.f99987t;
        while (this.f99982o.a() >= 8) {
            int iF = this.f99982o.f();
            int iQ = this.f99982o.q();
            int iQ2 = this.f99982o.q();
            if (iQ2 == 1937013100) {
                C(this.f99982o.a() >= 2);
                int iN = this.f99982o.N();
                for (int i12 = 0; i12 < iN; i12++) {
                    B(this.f99982o, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f99983p) {
                C(this.f99982o.a() >= 2);
                fP = p0.p(this.f99982o.N() / this.f99988u, BitmapDescriptorFactory.HUE_RED, 0.95f);
            }
            this.f99982o.U(iF + iQ);
        }
        return new b(new gs.b.C1421b().o(spannableStringBuilder).h(fP, 0).i(0).a());
    }
}
