package b1;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import c0.y0;
import f1.k;
import g1.m1;
import g1.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class b implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f15258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a<m1, o1> f15259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, j1> f15260e = new HashMap();

    public b(@NonNull i1 i1Var, @NonNull r.a<m1, o1> aVar) {
        this.f15258c = i1Var;
        this.f15259d = aVar;
    }

    private j1 c(j1 j1Var, int i11, int i12) {
        j1.c next;
        if (j1Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(j1Var.e());
        Iterator<j1.c> it = j1Var.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.g() != 0);
        j1.c cVarK = k(g(next, i11, i12), this.f15259d);
        if (cVarK != null) {
            arrayList.add(cVarK);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return j1.b.h(j1Var.d(), j1Var.b(), j1Var.c(), arrayList);
    }

    private static int d(int i11) {
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    @NonNull
    private static String e(int i11) {
        return j1.f(i11);
    }

    private static int f(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 4096;
        }
        if (i11 == 3) {
            return PKIFailureInfo.certRevoked;
        }
        if (i11 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    private static j1.c g(j1.c cVar, int i11, int i12) {
        if (cVar == null) {
            return null;
        }
        int iE = cVar.e();
        String strI = cVar.i();
        int iJ = cVar.j();
        if (i11 != cVar.g()) {
            iE = d(i11);
            strI = e(iE);
            iJ = f(i11);
        }
        return j1.c.a(iE, strI, j(cVar.c(), i12, cVar.b()), cVar.f(), cVar.k(), cVar.h(), iJ, i12, cVar.d(), i11);
    }

    private j1 h(int i11) {
        if (this.f15260e.containsKey(Integer.valueOf(i11))) {
            return this.f15260e.get(Integer.valueOf(i11));
        }
        if (!this.f15258c.b(i11)) {
            return null;
        }
        j1 j1VarC = c(this.f15258c.a(i11), 1, 10);
        this.f15260e.put(Integer.valueOf(i11), j1VarC);
        return j1VarC;
    }

    @NonNull
    private static j1.c i(@NonNull j1.c cVar, int i11) {
        return j1.c.a(cVar.e(), cVar.i(), i11, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private static int j(int i11, int i12, int i13) {
        if (i12 == i13) {
            return i11;
        }
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue());
        if (y0.f("BackupHdrProfileEncoderProfilesProvider")) {
            y0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    static j1.c k(j1.c cVar, @NonNull r.a<m1, o1> aVar) {
        m1 m1VarF;
        o1 o1VarApply;
        if (cVar == null || (o1VarApply = aVar.apply((m1VarF = k.f(cVar)))) == null || !o1VarApply.b(cVar.k(), cVar.h())) {
            return null;
        }
        int iD = m1VarF.d();
        int iIntValue = ((Integer) o1VarApply.c().clamp(Integer.valueOf(iD))).intValue();
        return iIntValue == iD ? cVar : i(cVar, iIntValue);
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        return h(i11);
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return this.f15258c.b(i11) && h(i11) != null;
    }
}
