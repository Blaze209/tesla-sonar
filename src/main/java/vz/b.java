package vz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import sz.g;
import sz.h;

/* JADX INFO: loaded from: classes6.dex */
public class b implements e<Object> {
    @Override // vz.e
    public <E> void a(E e11, Appendable appendable, g gVar) {
        Method declaredMethod;
        Object objInvoke;
        Class<?> type;
        try {
            gVar.n(appendable);
            boolean z11 = false;
            for (Class<?> superclass = e11.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            objInvoke = field.get(e11);
                        } else {
                            try {
                                declaredMethod = superclass.getDeclaredMethod(h.a(field.getName()), null);
                            } catch (Exception unused) {
                                declaredMethod = null;
                            }
                            if (declaredMethod == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                declaredMethod = superclass.getDeclaredMethod(h.b(field.getName()), null);
                            }
                            if (declaredMethod != null) {
                                objInvoke = declaredMethod.invoke(e11, null);
                            }
                        }
                        if (objInvoke != null || !gVar.g()) {
                            if (z11) {
                                gVar.m(appendable);
                            } else {
                                z11 = true;
                            }
                            d.g(field.getName(), objInvoke, appendable, gVar);
                        }
                    }
                }
            }
            gVar.o(appendable);
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }
}
