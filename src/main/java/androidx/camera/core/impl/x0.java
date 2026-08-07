package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface x0 {

    public static abstract class a<T> {
        a() {
        }

        @NonNull
        public static <T> a<T> a(@NonNull String str, @NonNull Class<?> cls) {
            return b(str, cls, null);
        }

        @NonNull
        public static <T> a<T> b(@NonNull String str, @NonNull Class<?> cls, Object obj) {
            return new d(str, cls, obj);
        }

        @NonNull
        public abstract String c();

        public abstract Object d();

        @NonNull
        public abstract Class<T> e();
    }

    public interface b {
        boolean a(@NonNull a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static boolean Q(@NonNull c cVar, @NonNull c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    @NonNull
    static x0 V(x0 x0Var, x0 x0Var2) {
        if (x0Var == null && x0Var2 == null) {
            return i2.a0();
        }
        d2 d2VarD0 = x0Var2 != null ? d2.d0(x0Var2) : d2.c0();
        if (x0Var != null) {
            Iterator<a<?>> it = x0Var.g().iterator();
            while (it.hasNext()) {
                v(d2VarD0, x0Var2, x0Var, it.next());
            }
        }
        return i2.b0(d2VarD0);
    }

    static void v(@NonNull d2 d2Var, @NonNull x0 x0Var, @NonNull x0 x0Var2, @NonNull a<?> aVar) {
        if (!Objects.equals(aVar, r1.f3294s)) {
            d2Var.m(aVar, x0Var2.h(aVar), x0Var2.a(aVar));
            return;
        }
        s0.c cVar = (s0.c) x0Var2.d(aVar, null);
        d2Var.m(aVar, x0Var2.h(aVar), h0.o.a((s0.c) x0Var.d(aVar, null), cVar));
    }

    <ValueT> ValueT a(@NonNull a<ValueT> aVar);

    void b(@NonNull String str, @NonNull b bVar);

    @NonNull
    Set<c> c(@NonNull a<?> aVar);

    <ValueT> ValueT d(@NonNull a<ValueT> aVar, ValueT valuet);

    boolean e(@NonNull a<?> aVar);

    <ValueT> ValueT f(@NonNull a<ValueT> aVar, @NonNull c cVar);

    @NonNull
    Set<a<?>> g();

    @NonNull
    c h(@NonNull a<?> aVar);
}
