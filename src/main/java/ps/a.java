package ps;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends gs.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f103929o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f103929o = new d0();
    }

    private static gs.b B(d0 d0Var, int i11) throws SubtitleDecoderException {
        CharSequence charSequenceQ = null;
        gs.b.C1421b c1421bO = null;
        while (i11 > 0) {
            if (i11 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            int i12 = iQ - 8;
            String strD = p0.D(d0Var.e(), d0Var.f(), i12);
            d0Var.V(i12);
            i11 = (i11 - 8) - i12;
            if (iQ2 == 1937011815) {
                c1421bO = f.o(strD);
            } else if (iQ2 == 1885436268) {
                charSequenceQ = f.q(null, strD.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return c1421bO != null ? c1421bO.o(charSequenceQ).a() : f.l(charSequenceQ);
    }

    @Override // gs.h
    protected gs.i A(byte[] bArr, int i11, boolean z11) throws SubtitleDecoderException {
        this.f103929o.S(bArr, i11);
        ArrayList arrayList = new ArrayList();
        while (this.f103929o.a() > 0) {
            if (this.f103929o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iQ = this.f103929o.q();
            if (this.f103929o.q() == 1987343459) {
                arrayList.add(B(this.f103929o, iQ - 8));
            } else {
                this.f103929o.V(iQ - 8);
            }
        }
        return new b(arrayList);
    }
}
