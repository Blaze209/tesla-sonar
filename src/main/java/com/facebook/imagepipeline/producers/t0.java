package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.c0;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface t0<FETCH_STATE extends c0> {

    public interface a {
        void a();

        void b(InputStream inputStream, int i11);

        void onFailure(Throwable th2);
    }

    void a(FETCH_STATE fetch_state, int i11);

    FETCH_STATE b(n<um.k> nVar, a1 a1Var);

    void c(FETCH_STATE fetch_state, a aVar);

    boolean d(FETCH_STATE fetch_state);

    Map<String, String> e(FETCH_STATE fetch_state, int i11);
}
