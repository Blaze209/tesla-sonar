package com.facebook.datasource;

/* JADX INFO: loaded from: classes3.dex */
public interface e<T> {
    void onCancellation(c<T> cVar);

    void onFailure(c<T> cVar);

    void onNewResult(c<T> cVar);

    void onProgressUpdate(c<T> cVar);
}
