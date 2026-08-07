package zf0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/core/n;", "Lzf0/i0;", "e", "(Landroidx/camera/core/n;)Lzf0/i0;", "Landroid/media/Image;", "", "rotationDegrees", DateTokenConverter.CONVERTER_KEY, "(Landroid/media/Image;I)Lzf0/i0;", "Landroid/graphics/Bitmap;", "c", "(Landroid/media/Image;I)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "data", "Lzf0/d0;", OrcaKeys.METADATA, "a", "(Ljava/nio/ByteBuffer;Lzf0/d0;)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l0 {

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001c"}, d2 = {"zf0/l0$a", "Lzf0/i0;", "Landroid/media/Image;", "a", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "image", "Lwx/a;", "b", "Lkotlin/Lazy;", "()Lwx/a;", "inputImage", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "bitmap", "", DateTokenConverter.CONVERTER_KEY, "I", "getWidth", "()I", Snapshot.WIDTH, "e", "getHeight", Snapshot.HEIGHT, "f", "rotationDegrees", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Image image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Lazy inputImage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Lazy bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int rotationDegrees;

        a(final Image image, final int i11) {
            this.image = image;
            this.inputImage = jn0.m.b(new wn0.a() { // from class: zf0.j0
                @Override // wn0.a
                public final Object invoke() {
                    return l0.a.g(image, i11);
                }
            });
            this.bitmap = jn0.m.b(new wn0.a() { // from class: zf0.k0
                @Override // wn0.a
                public final Object invoke() {
                    return l0.a.f(image, i11);
                }
            });
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.rotationDegrees = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap f(Image image, int i11) {
            return l0.c(image, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wx.a g(Image image, int i11) {
            wx.a aVarC = wx.a.c(image, i11);
            p013kotlin.jvm.internal.s.j(aVarC, "fromMediaImage(...)");
            return aVarC;
        }

        @Override // zf0.i0
        public Bitmap a() {
            return (Bitmap) this.bitmap.getValue();
        }

        @Override // zf0.i0
        public wx.a b() {
            return (wx.a) this.inputImage.getValue();
        }

        @Override // zf0.i0
        /* JADX INFO: renamed from: d, reason: from getter */
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }

        @Override // zf0.i0
        public int getHeight() {
            return this.height;
        }

        @Override // zf0.i0
        public Image getImage() {
            return this.image;
        }

        @Override // zf0.i0
        public int getWidth() {
            return this.width;
        }
    }

    private static final Bitmap a(ByteBuffer byteBuffer, FrameMetadata frameMetadata) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, frameMetadata.getWidth(), frameMetadata.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, frameMetadata.getWidth(), frameMetadata.getHeight()), 80, byteArrayOutputStream);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                sn0.b.a(byteArrayOutputStream, null);
                p013kotlin.jvm.internal.s.h(bitmapDecodeByteArray);
                return b(bitmapDecodeByteArray, frameMetadata.getRotation());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static final Bitmap b(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        if (!p013kotlin.jvm.internal.s.f(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static final Bitmap c(Image image, int i11) {
        p013kotlin.jvm.internal.s.k(image, "<this>");
        FrameMetadata frameMetadata = new FrameMetadata(image.getWidth(), image.getHeight(), i11);
        h hVar = h.f128214a;
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        return a(hVar.c(planes, image.getWidth(), image.getHeight()), frameMetadata);
    }

    public static final i0 d(Image image, int i11) {
        p013kotlin.jvm.internal.s.k(image, "<this>");
        return new a(image, i11);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public static final i0 e(androidx.camera.core.n nVar) {
        p013kotlin.jvm.internal.s.k(nVar, "<this>");
        try {
            Image image = nVar.getImage();
            if (image == null) {
                return null;
            }
            return d(image, nVar.z().d());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
