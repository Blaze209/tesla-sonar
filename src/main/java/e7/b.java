package e7;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
class b {

    static class a {
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    static void a(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e11) {
            Log.e("ExifInterfaceUtils", "Error closing fd.", e11);
        }
    }

    static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            jArr[i11] = iArr[i11];
        }
        return jArr;
    }

    static int d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        int i11 = 0;
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 == -1) {
                return i11;
            }
            i11 += i12;
            outputStream.write(bArr, 0, i12);
        }
    }

    static void e(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (i11 > 0) {
            int iMin = Math.min(i11, PKIFailureInfo.certRevoked);
            int i12 = inputStream.read(bArr, 0, iMin);
            if (i12 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i11 -= i12;
            outputStream.write(bArr, 0, i12);
        }
    }

    static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
