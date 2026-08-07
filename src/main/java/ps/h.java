package ps;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h extends gs.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f103979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f103980p;

    public h() {
        super("WebvttDecoder");
        this.f103979o = new d0();
        this.f103980p = new c();
    }

    private static int B(d0 d0Var) {
        int i11 = -1;
        int iF = 0;
        while (i11 == -1) {
            iF = d0Var.f();
            String strS = d0Var.s();
            if (strS == null) {
                i11 = 0;
            } else if ("STYLE".equals(strS)) {
                i11 = 2;
            } else {
                i11 = strS.startsWith("NOTE") ? 1 : 3;
            }
        }
        d0Var.U(iF);
        return i11;
    }

    private static void C(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    @Override // gs.h
    protected gs.i A(byte[] bArr, int i11, boolean z11) throws SubtitleDecoderException {
        e eVarN;
        this.f103979o.S(bArr, i11);
        ArrayList arrayList = new ArrayList();
        try {
            i.d(this.f103979o);
            while (!TextUtils.isEmpty(this.f103979o.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iB = B(this.f103979o);
                if (iB == 0) {
                    return new k(arrayList2);
                }
                if (iB == 1) {
                    C(this.f103979o);
                } else if (iB == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f103979o.s();
                    arrayList.addAll(this.f103980p.d(this.f103979o));
                } else if (iB == 3 && (eVarN = f.n(this.f103979o, arrayList)) != null) {
                    arrayList2.add(eVarN);
                }
            }
        } catch (ParserException e11) {
            throw new SubtitleDecoderException(e11);
        }
    }
}
