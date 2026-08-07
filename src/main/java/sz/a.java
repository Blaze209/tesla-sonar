package sz;

import com.adyen.checkout.components.core.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a extends ArrayList<Object> implements List<Object>, c, f {
    public static String a(List<? extends Object> list, g gVar) {
        StringBuilder sb2 = new StringBuilder();
        try {
            f(list, sb2, gVar);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void f(Iterable<? extends Object> iterable, Appendable appendable, g gVar) throws IOException {
        if (iterable == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            vz.d.f120121g.a(iterable, appendable, gVar);
        }
    }

    @Override // sz.e
    public void b(Appendable appendable) throws IOException {
        f(this, appendable, i.f111945a);
    }

    @Override // sz.c
    public String d(g gVar) {
        return a(this, gVar);
    }

    @Override // sz.b
    public String e() {
        return a(this, i.f111945a);
    }

    @Override // sz.f
    public void h(Appendable appendable, g gVar) throws IOException {
        f(this, appendable, gVar);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return e();
    }
}
