package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4189f4 implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderScript f38307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f38309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f38310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f38311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScriptIntrinsicYuvToRGB f38312f;

    public C4189f4(RenderScript renderScript, int i11) {
        p013kotlin.jvm.internal.s.k(renderScript, "renderScript");
        this.f38307a = renderScript;
        this.f38308b = i11;
    }

    private final ByteBuffer imageToByteBuffer(Image image) {
        int i11;
        Rect cropRect = image.getCropRect();
        int iWidth = cropRect.width();
        int iHeight = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i12 = 0;
        byte[] bArr = new byte[planes[0].getRowStride()];
        int i13 = iWidth * iHeight;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((ImageFormat.getBitsPerPixel(35) * i13) / 8);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < 3) {
            if (i14 != 0) {
                if (i14 == 1) {
                    i15 = i13 + 1;
                } else if (i14 == 2) {
                    i15 = i13;
                }
                i16 = 2;
            } else {
                i15 = i12;
                i16 = 1;
            }
            ByteBuffer buffer = planes[i14].getBuffer();
            int rowStride = planes[i14].getRowStride();
            int pixelStride = planes[i14].getPixelStride();
            int i17 = i14 == 0 ? i12 : 1;
            int i18 = iWidth >> i17;
            int i19 = iHeight >> i17;
            int i21 = iWidth;
            buffer.position(((cropRect.top >> i17) * rowStride) + ((cropRect.left >> i17) * pixelStride));
            int i22 = 0;
            while (i22 < i19) {
                if (pixelStride == 1 && i16 == 1) {
                    buffer.get(byteBufferAllocateDirect.array(), i15, i18);
                    i15 += i18;
                    i11 = i18;
                } else {
                    i11 = ((i18 - 1) * pixelStride) + 1;
                    buffer.get(bArr, 0, i11);
                    for (int i23 = 0; i23 < i18; i23++) {
                        byteBufferAllocateDirect.array()[i15] = bArr[i23 * pixelStride];
                        i15 += i16;
                    }
                }
                if (i22 < i19 - 1) {
                    buffer.position((buffer.position() + rowStride) - i11);
                }
                i22++;
                cropRect = cropRect;
            }
            i14++;
            iWidth = i21;
            i12 = 0;
        }
        p013kotlin.jvm.internal.s.h(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // com.fourthline.vision.internal.I2
    public void close() {
        Bitmap bitmap = this.f38309c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Allocation allocation = this.f38311e;
        if (allocation != null) {
            allocation.destroy();
        }
        Allocation allocation2 = this.f38310d;
        if (allocation2 != null) {
            allocation2.destroy();
        }
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.f38312f;
        if (scriptIntrinsicYuvToRGB != null) {
            scriptIntrinsicYuvToRGB.destroy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // com.fourthline.vision.internal.I2
    public Bitmap toBitmap(Image image, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        p013kotlin.jvm.internal.s.k(image, "image");
        ByteBuffer byteBufferImageToByteBuffer = imageToByteBuffer(image);
        Bitmap bitmap = this.f38309c;
        Bitmap bitmap2 = null;
        if (bitmap == null || bitmap.getWidth() != i11) {
            close();
            bitmapCreateBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
            this.f38309c = bitmapCreateBitmap;
            RenderScript renderScript = this.f38307a;
            if (bitmapCreateBitmap == null) {
                p013kotlin.jvm.internal.s.B("bitmap");
                bitmapCreateBitmap = null;
            }
            this.f38310d = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
            RenderScript renderScript2 = this.f38307a;
            this.f38311e = Allocation.createSized(renderScript2, Element.U8(renderScript2), byteBufferImageToByteBuffer.array().length);
            RenderScript renderScript3 = this.f38307a;
            this.f38312f = ScriptIntrinsicYuvToRGB.create(renderScript3, Element.U8_4(renderScript3));
        } else {
            Bitmap bitmap3 = this.f38309c;
            if (bitmap3 == null) {
                p013kotlin.jvm.internal.s.B("bitmap");
                bitmap3 = null;
            }
            if (bitmap3.getHeight() != i12) {
                close();
                bitmapCreateBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
                this.f38309c = bitmapCreateBitmap;
                RenderScript renderScript4 = this.f38307a;
                if (bitmapCreateBitmap == null) {
                    p013kotlin.jvm.internal.s.B("bitmap");
                    bitmapCreateBitmap = null;
                }
                this.f38310d = Allocation.createFromBitmap(renderScript4, bitmapCreateBitmap);
                RenderScript renderScript5 = this.f38307a;
                this.f38311e = Allocation.createSized(renderScript5, Element.U8(renderScript5), byteBufferImageToByteBuffer.array().length);
                RenderScript renderScript6 = this.f38307a;
                this.f38312f = ScriptIntrinsicYuvToRGB.create(renderScript6, Element.U8_4(renderScript6));
            }
        }
        Allocation allocation = this.f38311e;
        if (allocation == null) {
            p013kotlin.jvm.internal.s.B("allocationYuv");
            allocation = null;
        }
        allocation.copyFrom(byteBufferImageToByteBuffer.array());
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.f38312f;
        if (scriptIntrinsicYuvToRGB == null) {
            p013kotlin.jvm.internal.s.B("scriptYuvToRgb");
            scriptIntrinsicYuvToRGB = null;
        }
        Allocation allocation2 = this.f38311e;
        if (allocation2 == null) {
            p013kotlin.jvm.internal.s.B("allocationYuv");
            allocation2 = null;
        }
        scriptIntrinsicYuvToRGB.setInput(allocation2);
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB2 = this.f38312f;
        if (scriptIntrinsicYuvToRGB2 == null) {
            p013kotlin.jvm.internal.s.B("scriptYuvToRgb");
            scriptIntrinsicYuvToRGB2 = null;
        }
        Allocation allocation3 = this.f38310d;
        if (allocation3 == null) {
            p013kotlin.jvm.internal.s.B("allocationRgb");
            allocation3 = null;
        }
        scriptIntrinsicYuvToRGB2.forEach(allocation3);
        Allocation allocation4 = this.f38310d;
        if (allocation4 == null) {
            p013kotlin.jvm.internal.s.B("allocationRgb");
            allocation4 = null;
        }
        Bitmap bitmap4 = this.f38309c;
        if (bitmap4 == null) {
            p013kotlin.jvm.internal.s.B("bitmap");
            bitmap4 = null;
        }
        allocation4.copyTo(bitmap4);
        Bitmap bitmap5 = this.f38309c;
        if (bitmap5 == null) {
            p013kotlin.jvm.internal.s.B("bitmap");
            bitmap5 = null;
        }
        Bitmap bitmap6 = this.f38309c;
        if (bitmap6 == null) {
            p013kotlin.jvm.internal.s.B("bitmap");
        } else {
            bitmap2 = bitmap6;
        }
        Bitmap.Config config = bitmap2.getConfig();
        if (config == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bitmap bitmapCopy = bitmap5.copy(config, true);
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f38308b, bitmapCopy.getWidth() / 2.0f, bitmapCopy.getHeight() / 2.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCopy, 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight(), matrix, false);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap2, "createBitmap(...)");
        return bitmapCreateBitmap2;
    }
}
