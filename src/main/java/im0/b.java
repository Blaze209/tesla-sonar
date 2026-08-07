package im0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
abstract class b<T, R> extends io.reactivex.rxjava3.core.h<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.reactivex.rxjava3.core.h<T> f78303b;

    b(io.reactivex.rxjava3.core.h<T> hVar) {
        Objects.requireNonNull(hVar, "source is null");
        this.f78303b = hVar;
    }
}
