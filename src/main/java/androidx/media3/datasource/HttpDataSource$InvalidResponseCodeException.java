package androidx.media3.datasource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f9130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f9131g;

    public HttpDataSource$InvalidResponseCodeException(int i11, String str, IOException iOException, Map<String, List<String>> map, j jVar, byte[] bArr) {
        super("Response code: " + i11, iOException, jVar, 2004, 1);
        this.f9128d = i11;
        this.f9129e = str;
        this.f9130f = map;
        this.f9131g = bArr;
    }
}
