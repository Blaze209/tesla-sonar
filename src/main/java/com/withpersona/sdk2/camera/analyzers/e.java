package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import java.nio.ByteBuffer;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import zf0.ImageLightCondition;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001a\u0010'\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/e;", "Lag0/b;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "", "imageWidth", "imageHeight", "Landroid/graphics/Rect;", "region", "Lzf0/h0;", "b", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lzf0/h0;", "averageLuma", "", "e", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D", "", "histogram", "sampleSize", "lowerPercentile", "higherPercentile", "c", "([JIDD)I", "Lzf0/i0;", "image", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "[B", "byteArr", "Landroid/util/Size;", "Landroid/util/Size;", "getPreferredImageSize", "()Landroid/util/Size;", "preferredImageSize", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements ag0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] byteArr = new byte[32768];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Size preferredImageSize = new Size(0, 0);

    private final ImageLightCondition b(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        if (imageWidth == 0 || imageHeight == 0) {
            return null;
        }
        long[] jArr = new long[256];
        yPlaneBuffer.rewind();
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        if (iWidth2 > 32768) {
            return null;
        }
        int i11 = region.bottom;
        long j11 = 0;
        for (int i12 = region.top; i12 < i11; i12++) {
            yPlaneBuffer.position((i12 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i13 = 0; i13 < iWidth2; i13++) {
                int i14 = this.byteArr[i13] & 255;
                j11 += (long) i14;
                jArr[i14] = jArr[i14] + 1;
            }
        }
        double d11 = j11 / ((double) iWidth);
        return new ImageLightCondition(d11 / 255.0d, e(yPlaneBuffer, imageWidth, (int) d11, region), ((double) d(this, jArr, iWidth, 0.0d, 0.0d, 12, null)) / 255.0d, iWidth);
    }

    private final int c(long[] histogram, int sampleSize, double lowerPercentile, double higherPercentile) {
        double d11 = 100;
        double d12 = sampleSize;
        double dFloor = Math.floor((lowerPercentile / d11) * d12);
        double dFloor2 = Math.floor((higherPercentile / d11) * d12);
        int length = histogram.length;
        int i11 = 0;
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = 0;
                break;
            }
            j12 += histogram[i12];
            if (j12 > dFloor) {
                break;
            }
            i12++;
        }
        double d13 = d12 - dFloor2;
        int length2 = histogram.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i13 = length2 - 1;
                j11 += histogram[length2];
                if (j11 > d13) {
                    i11 = length2;
                    break;
                }
                if (i13 < 0) {
                    break;
                }
                length2 = i13;
            }
        }
        return i11 - i12;
    }

    static /* synthetic */ int d(e eVar, long[] jArr, int i11, double d11, double d12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            d11 = 1.0d;
        }
        double d13 = d11;
        if ((i12 & 8) != 0) {
            d12 = 99.0d;
        }
        return eVar.c(jArr, i11, d13, d12);
    }

    private final double e(ByteBuffer yPlaneBuffer, int imageWidth, int averageLuma, Rect region) {
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        int i11 = region.bottom;
        long j11 = 0;
        for (int i12 = region.top; i12 < i11; i12++) {
            yPlaneBuffer.position((i12 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i13 = 0; i13 < iWidth2; i13++) {
                int i14 = (this.byteArr[i13] & 255) - averageLuma;
                j11 += (long) (i14 * i14);
            }
        }
        return Math.sqrt(j11 / ((double) iWidth)) / 128.0d;
    }

    @Override // ag0.b
    public Object a(i0 i0Var, Rect rect, Continuation<? super s<? extends a>> continuation) {
        Image.Plane plane;
        int width = i0Var.getImage().getWidth();
        int height = i0Var.getImage().getHeight();
        Image.Plane[] planes = i0Var.getImage().getPlanes();
        if (planes == null || (plane = planes[0]) == null) {
            s.Companion companion = s.INSTANCE;
            return s.b(a.b.f57156a);
        }
        if (rect == null) {
            rect = new Rect(0, 0, width, height);
        }
        ByteBuffer buffer = plane.getBuffer();
        p013kotlin.jvm.internal.s.j(buffer, "getBuffer(...)");
        ImageLightCondition imageLightConditionB = b(buffer, width, height, rect);
        if (imageLightConditionB == null) {
            s.Companion companion2 = s.INSTANCE;
            return s.b(a.b.f57156a);
        }
        s.Companion companion3 = s.INSTANCE;
        return s.b(new a.e(imageLightConditionB));
    }
}
