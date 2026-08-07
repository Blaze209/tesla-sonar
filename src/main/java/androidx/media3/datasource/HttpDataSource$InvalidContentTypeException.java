package androidx.media3.datasource;

import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9127d;

    public HttpDataSource$InvalidContentTypeException(String str, j jVar) {
        super("Invalid content type: " + str, jVar, 2003, 1);
        this.f9127d = str;
    }
}
