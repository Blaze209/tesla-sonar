package com.facebook.datasource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements e<T> {
    @Override // com.facebook.datasource.e
    public void onCancellation(c<T> cVar) {
    }

    @Override // com.facebook.datasource.e
    public void onFailure(c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void onFailureImpl(c<T> cVar);

    @Override // com.facebook.datasource.e
    public void onNewResult(c<T> cVar) {
        boolean zIsFinished = cVar.isFinished();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (zIsFinished) {
                cVar.close();
            }
        }
    }

    protected abstract void onNewResultImpl(c<T> cVar);

    @Override // com.facebook.datasource.e
    public void onProgressUpdate(c<T> cVar) {
    }
}
