package atd.az;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters extends BufferedInputStream {
    public AuthenticationRequestParameters(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }
}
