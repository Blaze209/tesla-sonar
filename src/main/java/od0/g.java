package od0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.MediaMetadataRetriever;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00192\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lod0/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "videoFilePath", "", "c", "(Ljava/lang/String;)I", "Landroid/graphics/Bitmap;", "bitmap", "degrees", "e", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "Landroid/media/Image;", "image", DateTokenConverter.CONVERTER_KEY, "(Landroid/media/Image;)Landroid/graphics/Bitmap;", "videoFileAbsolutePath", "", "intervalMs", "", "autoRotate", "", "a", "(Ljava/lang/String;JZ)Ljava/util/List;", "Landroid/content/Context;", "b", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f97210c = com.tesla.logging.g.INSTANCE.a("TeslaNotification").p("VideoFrameExtractor");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public g(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    public static /* synthetic */ List b(g gVar, String str, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return gVar.a(str, j11, z11);
    }

    private final int c(String videoFilePath) {
        com.tesla.logging.g gVar;
        String message;
        StringBuilder sb2;
        Integer numX;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int iIntValue = 0;
        try {
            try {
                mediaMetadataRetriever.setDataSource(videoFilePath);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                if (strExtractMetadata != null && (numX = t.x(strExtractMetadata)) != null) {
                    iIntValue = numX.intValue();
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e11) {
                    e = e11;
                    gVar = f97210c;
                    message = e.getMessage();
                    sb2 = new StringBuilder();
                    sb2.append("Error releasing MediaMetadataRetriever: ");
                    sb2.append(message);
                    gVar.d(sb2.toString(), e);
                }
            } catch (Exception e12) {
                f97210c.d("Error getting video rotation: " + e12.getMessage(), e12);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e13) {
                    e = e13;
                    gVar = f97210c;
                    message = e.getMessage();
                    sb2 = new StringBuilder();
                    sb2.append("Error releasing MediaMetadataRetriever: ");
                    sb2.append(message);
                    gVar.d(sb2.toString(), e);
                }
            }
            return iIntValue;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e14) {
                f97210c.d("Error releasing MediaMetadataRetriever: " + e14.getMessage(), e14);
            }
            throw th2;
        }
    }

    private final Bitmap d(Image image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();
            Image.Plane[] planes = image.getPlanes();
            int i11 = 0;
            ByteBuffer buffer = planes[0].getBuffer();
            ByteBuffer buffer2 = planes[1].getBuffer();
            ByteBuffer buffer3 = planes[2].getBuffer();
            int rowStride = planes[0].getRowStride();
            int rowStride2 = planes[1].getRowStride();
            int pixelStride = planes[1].getPixelStride();
            int i12 = width * height;
            byte[] bArr = new byte[(i12 * 3) / 2];
            int iPosition = buffer.position();
            int iRemaining = buffer.remaining();
            for (int i13 = 0; i13 < height; i13++) {
                int i14 = i13 * rowStride;
                if (i14 + width <= iRemaining) {
                    buffer.position(i14 + iPosition);
                    buffer.get(bArr, i13 * width, width);
                } else {
                    buffer.position(i14 + iPosition);
                    for (int i15 = 0; i15 < width; i15++) {
                        if (buffer.remaining() > 0) {
                            bArr[(i13 * width) + i15] = buffer.get();
                        }
                    }
                }
            }
            int iPosition2 = buffer3.position();
            int iPosition3 = buffer2.position();
            int i16 = height / 2;
            int i17 = 0;
            while (i17 < i16) {
                int i18 = width / 2;
                for (int i19 = i11; i19 < i18; i19++) {
                    int i21 = (i17 * rowStride2) + (i19 * pixelStride);
                    int i22 = i12 + 1;
                    bArr[i12] = buffer3.get(iPosition2 + i21);
                    i12 += 2;
                    bArr[i22] = buffer2.get(i21 + iPosition3);
                }
                i17++;
                i11 = 0;
            }
            YuvImage yuvImage = new YuvImage(bArr, 17, width, height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, width, height), 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap bitmapCopy = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length).copy(Bitmap.Config.RGB_565, false);
            d dVar = d.f97137a;
            s.h(bitmapCopy);
            return dVar.d(bitmapCopy);
        } catch (Exception e11) {
            f97210c.d("Error converting Image to bitmap: " + e11.getMessage(), e11);
            return null;
        }
    }

    private final Bitmap e(Bitmap bitmap, int degrees) {
        Bitmap bitmap2;
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate(degrees);
            bitmap2 = bitmap;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                s.j(bitmapCreateBitmap, "createBitmap(...)");
                if (s.f(bitmapCreateBitmap, bitmap2)) {
                    return bitmapCreateBitmap;
                }
                bitmap2.recycle();
                return bitmapCreateBitmap;
            } catch (Exception e11) {
                e = e11;
                Exception exc = e;
                f97210c.d("Error rotating bitmap: " + exc.getMessage(), exc);
                return bitmap2;
            }
        } catch (Exception e12) {
            e = e12;
            bitmap2 = bitmap;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7411. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.util.List<android.graphics.Bitmap> a(java.lang.String r26, long r27, boolean r29) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.g.a(java.lang.String, long, boolean):java.util.List");
    }
}
