package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface d<T> {

    public interface a<T> {
        void e(T t11);

        void f(@NonNull Exception exc);
    }

    @NonNull
    Class<T> a();

    void b();

    @NonNull
    dj.a c();

    void cancel();

    void d(@NonNull com.bumptech.glide.h hVar, @NonNull a<? super T> aVar);
}
