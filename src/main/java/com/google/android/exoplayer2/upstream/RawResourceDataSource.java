package com.google.android.exoplayer2.upstream;

import android.content.Context;
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
import ss.e;
import ss.l;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class RawResourceDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f41060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f41061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f41062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f41063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputStream f41064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f41065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41066k;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f41060e = context.getResources();
        this.f41061f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i11) {
        return Uri.parse("rawresource:///" + i11);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // ss.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f41062g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f41064i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f41064i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f41063h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f41063h = r0
            boolean r0 = r5.f41066k
            if (r0 == 0) goto L2b
            r5.f41066k = r2
            r5.o()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f41063h = r0
            boolean r0 = r5.f41066k
            if (r0 == 0) goto L3d
            r5.f41066k = r2
            r5.o()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f41064i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f41063h     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f41063h = r0
            boolean r0 = r5.f41066k
            if (r0 == 0) goto L5d
            r5.f41066k = r2
            r5.o()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f41063h = r0
            boolean r0 = r5.f41066k
            if (r0 == 0) goto L6f
            r5.f41066k = r2
            r5.o()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f41062g;
    }

    @Override // ss.i
    public long j(l lVar) throws RawResourceDataSourceException {
        int identifier;
        String str;
        Uri uriNormalizeScheme = lVar.f111661a.normalizeScheme();
        this.f41062g = uriNormalizeScheme;
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) ts.a.e(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) ts.a.e(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String strSubstring = (String) ts.a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(strSubstring);
            identifier = this.f41060e.getIdentifier(sb2.toString(), "raw", this.f41061f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        p(lVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f41060e.openRawResourceFd(identifier);
            this.f41063h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f41064i = fileInputStream;
            if (length != -1) {
                try {
                    if (lVar.f111667g > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(null, e12, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(lVar.f111667g + startOffset) - startOffset;
            if (jSkip != lVar.f111667g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f41065j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f41065j = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j11 = length - jSkip;
                this.f41065j = j11;
                if (j11 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = lVar.f111668h;
            if (jMin != -1) {
                long j12 = this.f41065j;
                if (j12 != -1) {
                    jMin = Math.min(j12, jMin);
                }
                this.f41065j = jMin;
            }
            this.f41066k = true;
            q(lVar);
            long j13 = lVar.f111668h;
            return j13 != -1 ? j13 : this.f41065j;
        } catch (Resources.NotFoundException e13) {
            throw new RawResourceDataSourceException(null, e13, 2005);
        }
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) throws RawResourceDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f41065j;
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
        int i13 = ((InputStream) p0.j(this.f41064i)).read(bArr, i11, i12);
        if (i13 == -1) {
            if (this.f41065j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j12 = this.f41065j;
        if (j12 != -1) {
            this.f41065j = j12 - ((long) i13);
        }
        n(i13);
        return i13;
    }
}
