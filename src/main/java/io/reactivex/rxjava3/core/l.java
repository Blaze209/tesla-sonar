package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes8.dex */
public interface l<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(am0.b bVar);

    void onSuccess(T t11);
}
