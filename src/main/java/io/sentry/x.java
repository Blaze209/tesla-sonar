package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f81603b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f81604a;

    public x(e1 e1Var) {
        this.f81604a = e1Var;
    }

    private q5 b(byte[] bArr, int i11, int i12) {
        StringReader stringReader = new StringReader(new String(bArr, i11, i12, f81603b));
        try {
            q5 q5Var = (q5) this.f81604a.c(stringReader, q5.class);
            stringReader.close();
            return q5Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private q6 c(byte[] bArr, int i11, int i12) {
        StringReader stringReader = new StringReader(new String(bArr, i11, i12, f81603b));
        try {
            q6 q6Var = (q6) this.f81604a.c(stringReader, q6.class);
            stringReader.close();
            return q6Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.p0
    public p5 a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        int i12 = -1;
        while (true) {
            try {
                int i13 = inputStream.read(bArr);
                if (i13 <= 0) {
                    break;
                }
                for (int i14 = 0; i12 == -1 && i14 < i13; i14++) {
                    if (bArr[i14] == 10) {
                        i12 = i11 + i14;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i13);
                i11 += i13;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i12 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        q5 q5VarB = b(byteArray, 0, i12);
        if (q5VarB == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i15 = i12 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i16 = i15;
            while (true) {
                if (i16 >= byteArray.length) {
                    i16 = -1;
                    break;
                }
                if (byteArray[i16] == 10) {
                    break;
                }
                i16++;
            }
            if (i16 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            q6 q6VarC = c(byteArray, i15, i16 - i15);
            if (q6VarC == null || q6VarC.a() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int iA = q6VarC.a() + i16;
            int i17 = iA + 1;
            if (i17 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i17 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new p6(q6VarC, Arrays.copyOfRange(byteArray, i16 + 1, i17)));
            if (i17 == byteArray.length) {
                break;
            }
            i15 = iA + 2;
            if (i15 == byteArray.length) {
                if (byteArray[i17] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        p5 p5Var = new p5(q5VarB, arrayList);
        byteArrayOutputStream.close();
        return p5Var;
    }
}
