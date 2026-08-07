package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11155a;

    public a() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public int b(int i11) {
        int i12 = this.f11155a;
        if (i12 == -1) {
            return i11 == 7 ? 6 : 3;
        }
        return i12;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public b.C0205b c(b.a aVar, b.c cVar) {
        if (!e(cVar.f11164c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new b.C0205b(1, DataPersistorKt.EXPIRATION_TIME);
        }
        if (aVar.a(2)) {
            return new b.C0205b(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public long d(b.c cVar) {
        IOException iOException = cVar.f11164c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f11165d - 1) * 1000, 5000);
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i11 = ((HttpDataSource$InvalidResponseCodeException) iOException).f9128d;
        return i11 == 403 || i11 == 404 || i11 == 410 || i11 == 416 || i11 == 500 || i11 == 503;
    }

    public a(int i11) {
        this.f11155a = i11;
    }
}
