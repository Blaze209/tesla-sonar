package vr;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import ou.e;
import ts.c0;
import ur.d;
import ur.g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends g {
    private static ur.a c(c0 c0Var) {
        c0Var.r(12);
        int iD = (c0Var.d() + c0Var.h(12)) - 4;
        c0Var.r(44);
        c0Var.s(c0Var.h(12));
        c0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (c0Var.d() >= iD) {
                break;
            }
            c0Var.r(48);
            int iH = c0Var.h(8);
            c0Var.r(4);
            int iD2 = c0Var.d() + c0Var.h(12);
            String strL2 = null;
            while (c0Var.d() < iD2) {
                int iH2 = c0Var.h(8);
                int iH3 = c0Var.h(8);
                int iD3 = c0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = c0Var.h(16);
                    c0Var.r(8);
                    if (iH4 == 3) {
                        while (c0Var.d() < iD3) {
                            strL = c0Var.l(c0Var.h(8), e.f99998a);
                            int iH5 = c0Var.h(8);
                            for (int i11 = 0; i11 < iH5; i11++) {
                                c0Var.s(c0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = c0Var.l(iH3, e.f99998a);
                }
                c0Var.p(iD3 * 8);
            }
            c0Var.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ur.a(arrayList);
    }

    @Override // ur.g
    protected ur.a b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new c0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
