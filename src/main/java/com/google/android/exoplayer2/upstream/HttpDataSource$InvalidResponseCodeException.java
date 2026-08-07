package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import ss.l;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f41038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f41039g;

    public HttpDataSource$InvalidResponseCodeException(int i11, String str, IOException iOException, Map<String, List<String>> map, l lVar, byte[] bArr) {
        super("Response code: " + i11, iOException, lVar, 2004, 1);
        this.f41036d = i11;
        this.f41037e = str;
        this.f41038f = map;
        this.f41039g = bArr;
    }
}
