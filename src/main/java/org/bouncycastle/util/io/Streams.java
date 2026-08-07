package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) {
        int i11 = BUFFER_SIZE;
        while (inputStream.read(new byte[i11], 0, i11) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        pipeAll(inputStream, outputStream, BUFFER_SIZE);
    }

    public static long pipeAllLimited(InputStream inputStream, long j11, OutputStream outputStream) throws IOException {
        int i11 = BUFFER_SIZE;
        byte[] bArr = new byte[i11];
        long j12 = 0;
        while (true) {
            int i12 = inputStream.read(bArr, 0, i11);
            if (i12 < 0) {
                return j12;
            }
            long j13 = i12;
            if (j11 - j12 < j13) {
                throw new StreamOverflowException("Data Overflow");
            }
            j12 += j13;
            outputStream.write(bArr, 0, i12);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void validateBufferArguments(byte[] bArr, int i11, int i12) {
        bArr.getClass();
        int length = bArr.length - i11;
        if ((length | i11 | i12 | (length - i12)) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        while (true) {
            int i12 = inputStream.read(bArr, 0, i11);
            if (i12 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i12);
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        while (i13 < i12) {
            int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (i14 < 0) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }
}
