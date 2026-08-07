package vz;

import java.io.IOException;
import sz.g;
import sz.i;

/* JADX INFO: loaded from: classes6.dex */
public class a implements e<Object> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vz.e
    public <E> void a(E e11, Appendable appendable, g gVar) throws IOException {
        gVar.c(appendable);
        boolean z11 = false;
        for (Object obj : (Object[]) e11) {
            if (z11) {
                gVar.m(appendable);
            } else {
                z11 = true;
            }
            i.b(obj, appendable, gVar);
        }
        gVar.d(appendable);
    }
}
