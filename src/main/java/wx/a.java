package wx;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.h;
import java.nio.ByteBuffer;
import xx.c;

/* JADX INFO: loaded from: classes5.dex */
public class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Bitmap f122411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f122412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f122413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f122414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f122415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f122416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f122417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f122418h;

    private a(@NonNull Bitmap bitmap, int i11) {
        this.f122411a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f122414d = bitmap.getWidth();
        this.f122415e = bitmap.getHeight();
        n(i11);
        this.f122416f = i11;
        this.f122417g = -1;
        this.f122418h = null;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap, int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap, i11);
        p(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i11);
        return aVar;
    }

    @NonNull
    public static a b(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(byteBuffer, i11, i12, i13, i14);
        p(i14, 3, jElapsedRealtime, i12, i11, byteBuffer.limit(), i13);
        return aVar;
    }

    @NonNull
    public static a c(@NonNull Image image, int i11) {
        return o(image, i11, null);
    }

    @NonNull
    @KeepForSdk
    public static a d(@NonNull Image image, int i11, @NonNull Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return o(image, i11, matrix);
    }

    private static int n(int i11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != 90 && i11 != 180) {
            if (i11 == 270) {
                i11 = 270;
            } else {
                z11 = false;
            }
        }
        Preconditions.checkArgument(z11, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i11;
    }

    private static a o(@NonNull Image image, int i11, Matrix matrix) {
        Image image2;
        int i12;
        int iLimit;
        a aVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        n(i11);
        boolean z11 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i12 = i11;
            aVar = new a(c.f().c(image, i11), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i12 = i11;
            a aVar2 = new a(image2, image.getWidth(), image.getHeight(), i12, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            aVar = aVar2;
        }
        p(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i12);
        return aVar;
    }

    private static void p(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmu.zza(zzms.zzb("vision-common"), i11, i12, j11, i13, i14, i15, i16);
    }

    @KeepForSdk
    public Bitmap e() {
        return this.f122411a;
    }

    @KeepForSdk
    public ByteBuffer f() {
        return this.f122412b;
    }

    @KeepForSdk
    public Matrix g() {
        return this.f122418h;
    }

    @KeepForSdk
    public int h() {
        return this.f122417g;
    }

    @KeepForSdk
    public int i() {
        return this.f122415e;
    }

    @KeepForSdk
    public Image j() {
        if (this.f122413c == null) {
            return null;
        }
        return this.f122413c.a();
    }

    @KeepForSdk
    public Image.Plane[] k() {
        if (this.f122413c == null) {
            return null;
        }
        return this.f122413c.b();
    }

    @KeepForSdk
    public int l() {
        return this.f122416f;
    }

    @KeepForSdk
    public int m() {
        return this.f122414d;
    }

    private a(@NonNull Image image, int i11, int i12, int i13, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.f122413c = new b(image);
        this.f122414d = i11;
        this.f122415e = i12;
        n(i13);
        this.f122416f = i13;
        this.f122417g = 35;
        this.f122418h = matrix;
    }

    private a(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        boolean z11;
        if (i14 == 842094169) {
            z11 = true;
        } else if (i14 == 17) {
            i14 = 17;
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.f122412b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i11 * i12, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f122414d = i11;
        this.f122415e = i12;
        n(i13);
        this.f122416f = i13;
        this.f122417g = i14;
        this.f122418h = null;
    }
}
