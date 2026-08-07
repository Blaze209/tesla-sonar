package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41076a;

    public a() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public int b(int i11) {
        int i12 = this.f41076a;
        if (i12 == -1) {
            return i11 == 7 ? 6 : 3;
        }
        return i12;
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public long c(b.a aVar) {
        IOException iOException = aVar.f41079c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f41080d - 1) * 1000, 5000);
    }

    public a(int i11) {
        this.f41076a = i11;
    }
}
