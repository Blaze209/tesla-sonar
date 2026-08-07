package vz;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import sz.g;
import sz.h;

/* JADX INFO: loaded from: classes6.dex */
public class c implements e<Object> {
    @Override // vz.e
    public <E> void a(E e11, Appendable appendable, g gVar) throws IOException {
        rz.d dVarC = rz.d.c(e11.getClass(), h.f111944a);
        appendable.append(CoreConstants.CURLY_LEFT);
        boolean z11 = false;
        for (rz.b bVar : dVarC.d()) {
            Object objB = dVarC.b(e11, bVar.a());
            if (objB != null || !gVar.g()) {
                if (z11) {
                    appendable.append(CoreConstants.COMMA_CHAR);
                } else {
                    z11 = true;
                }
                sz.d.k(bVar.b(), objB, appendable, gVar);
            }
        }
        appendable.append(CoreConstants.CURLY_RIGHT);
    }
}
