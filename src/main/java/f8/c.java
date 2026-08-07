package f8;

import a8.o2;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.x;
import da.k0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p7.f0;
import p7.g0;
import p7.u;
import s7.i0;
import t9.q;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f64541g = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f64542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q.a f64543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f64544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f64545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f64546f;

    public c() {
        this(0, true);
    }

    private static void f(int i11, List<Integer> list) {
        if (ru.f.j(f64541g, i11) == -1 || list.contains(Integer.valueOf(i11))) {
            return;
        }
        list.add(Integer.valueOf(i11));
    }

    @SuppressLint({"SwitchIntDef"})
    private p h(int i11, u uVar, List<u> list, i0 i0Var) {
        if (i11 == 0) {
            return new da.b();
        }
        if (i11 == 1) {
            return new da.e();
        }
        if (i11 == 2) {
            return new da.h();
        }
        if (i11 == 7) {
            return new p9.f(0, 0L);
        }
        if (i11 == 8) {
            return i(this.f64543c, this.f64544d, i0Var, uVar, list, this.f64545e);
        }
        if (i11 == 11) {
            return j(this.f64542b, this.f64546f, uVar, list, i0Var, this.f64543c, this.f64544d);
        }
        if (i11 != 13) {
            return null;
        }
        return new j(uVar.f101533d, i0Var, this.f64543c, this.f64544d);
    }

    private static q9.h i(q.a aVar, boolean z11, i0 i0Var, u uVar, List<u> list, int i11) {
        int i12 = m(uVar) ? 4 : 0;
        if (!z11) {
            aVar = q.a.f112982a;
            i12 |= 32;
        }
        q.a aVar2 = aVar;
        int iG = i12 | q9.h.g(i11);
        if (list == null) {
            list = x.r();
        }
        return new q9.h(aVar2, iG, i0Var, null, list, null);
    }

    private static k0 j(int i11, boolean z11, u uVar, List<u> list, i0 i0Var, q.a aVar, boolean z12) {
        int i12;
        int i13 = i11 | 16;
        if (list != null) {
            i13 = i11 | 48;
        } else {
            list = z11 ? Collections.singletonList(new u.b().y0("application/cea-608").P()) : Collections.EMPTY_LIST;
        }
        String str = uVar.f101540k;
        if (!TextUtils.isEmpty(str)) {
            if (!g0.b(str, "audio/mp4a-latm")) {
                i13 |= 2;
            }
            if (!g0.b(str, "video/avc")) {
                i13 |= 4;
            }
        }
        if (z12) {
            i12 = 0;
        } else {
            aVar = q.a.f112982a;
            i12 = 1;
        }
        return new k0(2, i12, aVar, i0Var, new da.j(i13, list), 112800);
    }

    private static boolean m(u uVar) {
        f0 f0Var = uVar.f101541l;
        if (f0Var == null) {
            return false;
        }
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof h) {
                return !((h) aVarD).f64551c.isEmpty();
            }
        }
        return false;
    }

    private static boolean o(p pVar, w8.q qVar) {
        try {
            return pVar.l(qVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            qVar.g();
        }
    }

    @Override // f8.e
    public u d(u uVar) {
        String str;
        if (!this.f64544d || !this.f64543c.b(uVar)) {
            return uVar;
        }
        u.b bVarY = uVar.b().y0("application/x-media3-cues").Y(this.f64543c.a(uVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uVar.f101544o);
        if (uVar.f101540k != null) {
            str = " " + uVar.f101540k;
        } else {
            str = "";
        }
        sb2.append(str);
        return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
    }

    @Override // f8.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e(Uri uri, u uVar, List<u> list, i0 i0Var, Map<String, List<String>> map, w8.q qVar, o2 o2Var) {
        int iA = p7.p.a(uVar.f101544o);
        int iB = p7.p.b(map);
        int iC = p7.p.c(uri);
        int[] iArr = f64541g;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(iA, arrayList);
        f(iB, arrayList);
        f(iC, arrayList);
        for (int i11 : iArr) {
            f(i11, arrayList);
        }
        qVar.g();
        p pVar = null;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            int iIntValue = ((Integer) arrayList.get(i12)).intValue();
            p pVar2 = (p) s7.a.f(h(iIntValue, uVar, list, i0Var));
            if (o(pVar2, qVar)) {
                return new a(pVar2, uVar, i0Var, this.f64543c, this.f64544d);
            }
            if (pVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                pVar = pVar2;
            }
        }
        return new a((p) s7.a.f(pVar), uVar, i0Var, this.f64543c, this.f64544d);
    }

    @Override // f8.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b(boolean z11) {
        this.f64544d = z11;
        return this;
    }

    @Override // f8.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c c(int i11) {
        this.f64545e = i11;
        return this;
    }

    @Override // f8.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c a(q.a aVar) {
        this.f64543c = aVar;
        return this;
    }

    public c(int i11, boolean z11) {
        this.f64542b = i11;
        this.f64546f = z11;
        this.f64543c = new t9.g();
    }
}
