package bx;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g0 {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f18181a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f18182b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f18182b = method;
            }

            @Override // bx.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f18182b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e11) {
                    throw new RuntimeException("Failed invoking canAccess", e11);
                }
            }
        }

        /* JADX INFO: renamed from: bx.g0$b$b, reason: collision with other inner class name */
        class C0363b extends b {
            C0363b() {
                super();
            }

            @Override // bx.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (y.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0363b();
            }
            f18181a = aVar;
        }

        private b() {
        }

        abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f18181a.a(accessibleObject, obj);
    }

    public static com.google.gson.t.a b(List<com.google.gson.t> list, Class<?> cls) {
        Iterator<com.google.gson.t> it = list.iterator();
        while (it.hasNext()) {
            com.google.gson.t.a aVarA = it.next().a(cls);
            if (aVarA != com.google.gson.t.a.INDECISIVE) {
                return aVarA;
            }
        }
        return com.google.gson.t.a.ALLOW;
    }
}
