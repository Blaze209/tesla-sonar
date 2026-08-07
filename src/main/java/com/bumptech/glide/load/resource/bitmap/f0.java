package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f0<T> implements dj.j<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dj.g<Long> f20795d = dj.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dj.g<Integer> f20796e = dj.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f20797f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f20798g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<T> f20799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.d f20800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f20801c;

    class a implements dj.g.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f20802a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // dj.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Long l11, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f20802a) {
                this.f20802a.position(0);
                messageDigest.update(this.f20802a.putLong(l11.longValue()).array());
            }
        }
    }

    class b implements dj.g.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f20803a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // dj.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f20803a) {
                this.f20803a.position(0);
                messageDigest.update(this.f20803a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e<ByteBuffer> {

        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f20804a;

            a(ByteBuffer byteBuffer) {
                this.f20804a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f20804a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j11, byte[] bArr, int i11, int i12) {
                if (j11 >= this.f20804a.limit()) {
                    return -1;
                }
                this.f20804a.position((int) j11);
                int iMin = Math.min(i12, this.f20804a.remaining());
                this.f20804a.get(bArr, i11, iMin);
                return iMin;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e<T> {
        void a(MediaExtractor mediaExtractor, T t11);

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t11);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    f0(gj.d dVar, e<T> eVar) {
        this(dVar, eVar, f20797f);
    }

    public static dj.j<AssetFileDescriptor, Bitmap> c(gj.d dVar) {
        return new f0(dVar, new c(null));
    }

    public static dj.j<ByteBuffer, Bitmap> d(gj.d dVar) {
        return new f0(dVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    private Bitmap f(@NonNull T t11, MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, m mVar) {
        if (l(t11, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || mVar == m.f20816f) ? null : h(mediaMetadataRetriever, j11, i11, i12, i13, mVar);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j11, i11);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11) {
        return mediaMetadataRetriever.getFrameAtTime(j11, i11);
    }

    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, m mVar) {
        try {
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i16 == 90 || i16 == 270) {
                i15 = i14;
                i14 = i15;
            }
            float fB = mVar.b(i14, i15, i12, i13);
            return mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(i14 * fB), Math.round(fB * i15));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i11 = Integer.parseInt(strExtractMetadata);
        return (i11 == 7 || i11 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 30 && i11 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f20798g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x0053, B:25:0x0059), top: B:40:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[DONT_GENERATE] */
    private boolean l(@NonNull T t11, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f20799a.a(mediaExtractor2, t11);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i11 = 0; i11 < trackCount; i11++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i11).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static dj.j<ParcelFileDescriptor, Bitmap> m(gj.d dVar) {
        return new f0(dVar, new g());
    }

    @Override // dj.j
    public fj.c<Bitmap> a(@NonNull T t11, int i11, int i12, @NonNull dj.h hVar) throws Exception {
        long jLongValue = ((Long) hVar.c(f20795d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.c(f20796e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.f20818h);
        if (mVar == null) {
            mVar = m.f20817g;
        }
        m mVar2 = mVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f20801c.a();
        try {
            this.f20799a.b(mediaMetadataRetrieverA, t11);
            try {
                Bitmap bitmapF = f(t11, mediaMetadataRetrieverA, jLongValue, num.intValue(), i11, i12, mVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    z6.b.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return com.bumptech.glide.load.resource.bitmap.f.c(bitmapF, this.f20800b);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    z6.b.a(mediaMetadataRetrieverA);
                    throw th3;
                }
                mediaMetadataRetrieverA.release();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // dj.j
    public boolean b(@NonNull T t11, @NonNull dj.h hVar) {
        return true;
    }

    f0(gj.d dVar, e<T> eVar, f fVar) {
        this.f20800b = dVar;
        this.f20799a = eVar;
        this.f20801c = fVar;
    }
}
