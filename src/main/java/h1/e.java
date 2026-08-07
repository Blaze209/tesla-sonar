package h1;

import android.os.StatFs;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh1/e;", "", "<init>", "()V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "b", "(Ljava/io/File;)J", "", "path", "c", "(Ljava/lang/String;)J", "Landroid/net/Uri;", "uri", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;)J", "bytes", "a", "(J)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "(Ljava/lang/Exception;)Z", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f70164a = new e();

    private e() {
    }

    public static final String a(long bytes) {
        if (bytes < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d11 = bytes;
        int i11 = 0;
        double d12 = d11;
        while (d12 >= 1024.0d && i11 < 4) {
            d12 /= 1024.0d;
            i11++;
        }
        if (i11 == 0) {
            return decimalFormat.format(d12) + ' ' + strArr[i11];
        }
        StringBuilder sb2 = new StringBuilder();
        while (-1 < i11) {
            double dPow = Math.pow(1024.0d, i11);
            double dFloor = Math.floor(d11 / dPow);
            if (dFloor > 0.0d) {
                sb2.append(decimalFormat.format(dFloor));
                sb2.append(" ");
                sb2.append(strArr[i11]);
                sb2.append(" ");
                d11 -= dFloor * dPow;
            }
            i11--;
        }
        return t.F1(sb2).toString();
    }

    public static final long b(File file) {
        s.k(file, "file");
        String path = file.getPath();
        s.j(path, "file.path");
        return c(path);
    }

    public static final long c(String path) {
        s.k(path, "path");
        return new StatFs(path).getAvailableBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0.equals("external") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.equals("external_primary") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        p013kotlin.jvm.internal.s.j(r3, "getExternalStorageDirectory()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        return b(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long d(android.net.Uri r3) {
        /*
            java.lang.String r0 = "uri"
            p013kotlin.jvm.internal.s.k(r3, r0)
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = p013kotlin.jvm.internal.s.f(r0, r1)
            if (r0 == 0) goto L84
            java.util.List r0 = r3.getPathSegments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L68
            int r1 = r0.hashCode()
            r2 = -1921573490(0xffffffff8d771d8e, float:-7.6148327E-31)
            if (r1 == r2) goto L52
            r2 = -1820761141(0xffffffff937963cb, float:-3.147742E-27)
            if (r1 == r2) goto L49
            r2 = 570410685(0x21ffc6bd, float:1.7332078E-18)
            if (r1 == r2) goto L32
            goto L68
        L32:
            java.lang.String r1 = "internal"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L68
        L3b:
            java.io.File r3 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = "getDataDirectory()"
            p013kotlin.jvm.internal.s.j(r3, r0)
            long r0 = b(r3)
            return r0
        L49:
            java.lang.String r1 = "external"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            goto L68
        L52:
            java.lang.String r1 = "external_primary"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
        L5a:
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "getExternalStorageDirectory()"
            p013kotlin.jvm.internal.s.j(r3, r0)
            long r0 = b(r3)
            return r0
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown MediaStore URI: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "StorageUtil"
            c0.y0.l(r0, r3)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a content uri: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e.d(android.net.Uri):long");
    }

    public static final boolean e(Exception e11) {
        String message;
        s.k(e11, "e");
        return (e11 instanceof FileNotFoundException) && (message = e11.getMessage()) != null && t.h0(message, "No space left on device", false, 2, null);
    }
}
