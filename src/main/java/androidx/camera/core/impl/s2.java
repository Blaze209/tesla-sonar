package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface s2 extends x0 {
    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT a(@NonNull x0.a<ValueT> aVar) {
        return (ValueT) getConfig().a(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default void b(@NonNull String str, @NonNull x0.b bVar) {
        getConfig().b(str, bVar);
    }

    @Override // androidx.camera.core.impl.x0
    @NonNull
    default Set<x0.c> c(@NonNull x0.a<?> aVar) {
        return getConfig().c(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT d(@NonNull x0.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) getConfig().d(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.x0
    default boolean e(@NonNull x0.a<?> aVar) {
        return getConfig().e(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    default <ValueT> ValueT f(@NonNull x0.a<ValueT> aVar, @NonNull x0.c cVar) {
        return (ValueT) getConfig().f(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.x0
    @NonNull
    default Set<x0.a<?>> g() {
        return getConfig().g();
    }

    @NonNull
    x0 getConfig();

    @Override // androidx.camera.core.impl.x0
    @NonNull
    default x0.c h(@NonNull x0.a<?> aVar) {
        return getConfig().h(aVar);
    }
}
