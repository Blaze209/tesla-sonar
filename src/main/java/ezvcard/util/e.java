package ezvcard.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f63669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f63670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Reader f63671c;

    public e(InputStream inputStream) {
        this(null, inputStream, null);
    }

    private InputStream b() {
        InputStream inputStream = this.f63670b;
        return inputStream == null ? new BufferedInputStream(new FileInputStream(this.f63669a)) : inputStream;
    }

    private byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }

    public byte[] a() {
        if (this.f63671c == null) {
            return c(b());
        }
        throw new IllegalStateException("Cannot get raw bytes from a Reader object.");
    }

    private e(File file, InputStream inputStream, Reader reader) {
        this.f63669a = file;
        this.f63670b = inputStream;
        this.f63671c = reader;
    }
}
