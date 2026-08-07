package sz;

import com.adyen.checkout.components.core.Address;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f111945a = g.f111934h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vz.d f111946b = new vz.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wz.e f111947c = new wz.e();

    public static void a(String str, Appendable appendable, g gVar) {
        if (str == null) {
            return;
        }
        gVar.f(str, appendable);
    }

    public static void b(Object obj, Appendable appendable, g gVar) throws IOException {
        if (obj == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            return;
        }
        Class<?> cls = obj.getClass();
        vz.d dVar = f111946b;
        vz.e<Object> eVarA = dVar.a(cls);
        if (eVarA == null) {
            if (cls.isArray()) {
                eVarA = vz.d.f120126l;
            } else {
                eVarA = dVar.b(obj.getClass());
                if (eVarA == null) {
                    eVarA = vz.d.f120124j;
                }
            }
            dVar.d(eVarA, cls);
        }
        eVarA.a(obj, appendable, gVar);
    }
}
