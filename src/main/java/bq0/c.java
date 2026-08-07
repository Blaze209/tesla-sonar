package bq0;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f17896a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f17897b = File.separatorChar;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f17898c = System.lineSeparator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f17899d = new byte[PKIFailureInfo.certRevoked];

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long jE = e(inputStream, outputStream);
        if (jE > 2147483647L) {
            return -1;
        }
        return (int) jE;
    }

    public static int b(Reader reader, Writer writer) {
        long jG = g(reader, writer);
        if (jG > 2147483647L) {
            return -1;
        }
        return (int) jG;
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i11) {
        return f(inputStream, outputStream, new byte[i11]);
    }

    public static void d(InputStream inputStream, Writer writer, Charset charset) {
        b(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long e(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, PKIFailureInfo.certRevoked);
    }

    public static long f(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j11 = 0;
        if (inputStream != null) {
            while (true) {
                int i11 = inputStream.read(bArr);
                if (-1 == i11) {
                    break;
                }
                outputStream.write(bArr, 0, i11);
                j11 += (long) i11;
            }
        }
        return j11;
    }

    public static long g(Reader reader, Writer writer) {
        return h(reader, writer, new char[PKIFailureInfo.certRevoked]);
    }

    public static long h(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j11 = 0;
        while (true) {
            int i11 = reader.read(cArr);
            if (-1 == i11) {
                return j11;
            }
            writer.write(cArr, 0, i11);
            j11 += (long) i11;
        }
    }

    @Deprecated
    public static String i(InputStream inputStream) {
        return j(inputStream, Charset.defaultCharset());
    }

    public static String j(InputStream inputStream, Charset charset) {
        eq0.a aVar = new eq0.a();
        try {
            d(inputStream, aVar, charset);
            String string = aVar.toString();
            aVar.close();
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
