package p013kotlin.jvm.internal;

import com.adyen.checkout.components.core.Address;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wn0.g;
import wn0.h;
import wn0.i;
import wn0.j;
import wn0.k;
import wn0.l;
import wn0.m;
import wn0.n;
import wn0.o;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.s;
import wn0.t;
import wn0.u;
import wn0.v;
import wn0.w;
import xn0.a;
import xn0.b;
import xn0.c;
import xn0.d;
import xn0.e;
import xn0.f;

/* JADX INFO: loaded from: classes9.dex */
public class u0 {
    public static Collection a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            u(obj, "kotlin.collections.MutableCollection");
        }
        return h(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            u(obj, "kotlin.collections.MutableIterable");
        }
        return i(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            u(obj, "kotlin.collections.MutableList");
        }
        return j(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            u(obj, "kotlin.collections.MutableMap");
        }
        return k(obj);
    }

    public static Map.Entry e(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e.a)) {
            u(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return l(obj);
    }

    public static Set f(Object obj) {
        if ((obj instanceof a) && !(obj instanceof f)) {
            u(obj, "kotlin.collections.MutableSet");
        }
        return m(obj);
    }

    public static Object g(Object obj, int i11) {
        if (obj != null && !o(obj, i11)) {
            u(obj, "kotlin.jvm.functions.Function" + i11);
        }
        return obj;
    }

    public static Collection h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static Iterable i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static List j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static Map k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static Map.Entry l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static Set m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e11) {
            throw t(e11);
        }
    }

    public static int n(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).getArity();
        }
        if (obj instanceof wn0.a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof wn0.b) {
            return 10;
        }
        if (obj instanceof wn0.c) {
            return 11;
        }
        if (obj instanceof wn0.d) {
            return 12;
        }
        if (obj instanceof wn0.e) {
            return 13;
        }
        if (obj instanceof wn0.f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean o(Object obj, int i11) {
        return (obj instanceof jn0.i) && n(obj) == i11;
    }

    public static boolean p(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof a) || (obj instanceof d);
        }
        return false;
    }

    public static boolean q(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof a) || (obj instanceof e);
        }
        return false;
    }

    public static boolean r(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof a) || (obj instanceof f);
        }
        return false;
    }

    private static <T extends Throwable> T s(T t11) {
        return (T) s.s(t11, u0.class.getName());
    }

    public static ClassCastException t(ClassCastException classCastException) {
        throw ((ClassCastException) s(classCastException));
    }

    public static void u(Object obj, String str) {
        v((obj == null ? Address.ADDRESS_NULL_PLACEHOLDER : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void v(String str) {
        throw t(new ClassCastException(str));
    }
}
