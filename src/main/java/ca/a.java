package ca;

import java.util.ArrayList;
import java.util.Collections;
import s7.c0;
import s7.n;
import s7.q0;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f18963a = new c0();

    private static r7.a d(c0 c0Var, int i11) {
        CharSequence charSequenceR = null;
        r7.a.b bVarP = null;
        while (i11 > 0) {
            s7.a.b(i11 >= 8, "Incomplete vtt cue box header found.");
            int iV = c0Var.v();
            int iV2 = c0Var.v();
            int i12 = iV - 8;
            String strL = q0.L(c0Var.f(), c0Var.g(), i12);
            c0Var.c0(i12);
            i11 = (i11 - 8) - i12;
            if (iV2 == 1937011815) {
                bVarP = e.p(strL);
            } else if (iV2 == 1885436268) {
                charSequenceR = e.r(null, strL.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<t9.d> nVar) {
        this.f18963a.Z(bArr, i12 + i11);
        this.f18963a.b0(i11);
        ArrayList arrayList = new ArrayList();
        while (this.f18963a.a() > 0) {
            s7.a.b(this.f18963a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iV = this.f18963a.v();
            if (this.f18963a.v() == 1987343459) {
                arrayList.add(d(this.f18963a, iV - 8));
            } else {
                this.f18963a.c0(iV - 8);
            }
        }
        nVar.accept(new t9.d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // t9.q
    public int b() {
        return 2;
    }
}
