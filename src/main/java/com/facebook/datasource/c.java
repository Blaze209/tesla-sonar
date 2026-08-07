package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public interface c<T> {
    boolean a();

    Throwable b();

    void c(e<T> eVar, Executor executor);

    boolean close();

    boolean d();

    Map<String, Object> getExtras();

    float getProgress();

    T getResult();

    boolean isFinished();
}
