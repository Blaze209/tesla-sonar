package io.realm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p0 implements n0 {
    public static <E extends n0> boolean h(E e11) {
        if (e11 instanceof io.realm.internal.o) {
            return ((io.realm.internal.o) e11).f().c().b0();
        }
        return false;
    }

    public static <E extends n0> boolean i(E e11) {
        return e11 instanceof io.realm.internal.o;
    }

    public static <E extends n0> boolean j(E e11) {
        if (!(e11 instanceof io.realm.internal.o)) {
            return e11 != null;
        }
        io.realm.internal.q qVarD = ((io.realm.internal.o) e11).f().d();
        return qVarD != null && qVarD.isValid();
    }
}
