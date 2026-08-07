package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import s7.q0;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends v7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f9132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f9133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f9134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f9135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9137j;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f9132e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i11) {
        return Uri.parse("rawresource:///" + i11);
    }

    private static AssetFileDescriptor s(Context context, j jVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = jVar.f118101a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = t(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String strSubstring = (String) s7.a.f(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e11) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e11, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = t(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException(null, e12, 2005);
        }
    }

    private static int t(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f9133f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f9135h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f9135h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f9134g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f9134g = r0
            boolean r0 = r5.f9137j
            if (r0 == 0) goto L2b
            r5.f9137j = r2
            r5.p()
        L2b:
            return
        L2c:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f9134g = r0
            boolean r0 = r5.f9137j
            if (r0 == 0) goto L3d
            r5.f9137j = r2
            r5.p()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f9135h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f9134g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f9134g = r0
            boolean r0 = r5.f9137j
            if (r0 == 0) goto L5d
            r5.f9137j = r2
            r5.p()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f9134g = r0
            boolean r0 = r5.f9137j
            if (r0 == 0) goto L6f
            r5.f9137j = r2
            r5.p()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.RawResourceDataSource.close():void");
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        j jVar = this.f9133f;
        if (jVar != null) {
            return jVar.f118101a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws RawResourceDataSourceException {
        this.f9133f = jVar;
        q(jVar);
        AssetFileDescriptor assetFileDescriptorS = s(this.f9132e, jVar);
        this.f9134g = assetFileDescriptorS;
        long length = assetFileDescriptorS.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f9134g.getFileDescriptor());
        this.f9135h = fileInputStream;
        if (length != -1) {
            try {
                if (jVar.f118107g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RawResourceDataSourceException(null, e12, 2000);
            }
        }
        long startOffset = this.f9134g.getStartOffset();
        long jSkip = fileInputStream.skip(jVar.f118107g + startOffset) - startOffset;
        if (jSkip != jVar.f118107g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f9136i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f9136i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j11 = length - jSkip;
            this.f9136i = j11;
            if (j11 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = jVar.f118108h;
        if (jMin != -1) {
            long j12 = this.f9136i;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            this.f9136i = jMin;
        }
        this.f9137j = true;
        r(jVar);
        long j13 = jVar.f118108h;
        return j13 != -1 ? j13 : this.f9136i;
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws RawResourceDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f9136i;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        int i13 = ((InputStream) q0.l(this.f9135h)).read(bArr, i11, i12);
        if (i13 == -1) {
            if (this.f9136i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j12 = this.f9136i;
        if (j12 != -1) {
            this.f9136i = j12 - ((long) i13);
        }
        o(i13);
        return i13;
    }
}
