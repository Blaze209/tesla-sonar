package zw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import yu.d;
import yu.g;
import yu.i;

/* JADX INFO: loaded from: classes5.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, yu.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    @Override // yu.i
    public List<yu.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final yu.c<?> cVarR : componentRegistrar.getComponents()) {
            final String strI = cVarR.i();
            if (strI != null) {
                cVarR = cVarR.r(new g() { // from class: zw.a
                    @Override // yu.g
                    public final Object a(d dVar) {
                        return b.b(strI, cVarR, dVar);
                    }
                });
            }
            arrayList.add(cVarR);
        }
        return arrayList;
    }
}
