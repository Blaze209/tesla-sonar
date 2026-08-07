package ca;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import s7.c0;
import s7.n;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f19012a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19013b = new b();

    private static int d(c0 c0Var) {
        int i11 = -1;
        int iG = 0;
        while (i11 == -1) {
            iG = c0Var.g();
            String strX = c0Var.x();
            if (strX == null) {
                i11 = 0;
            } else if ("STYLE".equals(strX)) {
                i11 = 2;
            } else {
                i11 = strX.startsWith("NOTE") ? 1 : 3;
            }
        }
        c0Var.b0(iG);
        return i11;
    }

    private static void e(c0 c0Var) {
        while (!TextUtils.isEmpty(c0Var.x())) {
        }
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<t9.d> nVar) {
        d dVarO;
        this.f19012a.Z(bArr, i12 + i11);
        this.f19012a.b0(i11);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f19012a);
            while (!TextUtils.isEmpty(this.f19012a.x())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f19012a);
                if (iD == 0) {
                    t9.h.c(new j(arrayList2), bVar, nVar);
                    return;
                }
                if (iD == 1) {
                    e(this.f19012a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f19012a.x();
                    arrayList.addAll(this.f19013b.d(this.f19012a));
                } else if (iD == 3 && (dVarO = e.o(this.f19012a, arrayList)) != null) {
                    arrayList2.add(dVarO);
                }
            }
        } catch (ParserException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // t9.q
    public int b() {
        return 1;
    }
}
