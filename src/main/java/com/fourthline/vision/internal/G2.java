package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class G2 implements InterfaceC4164c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37712a;

    public static final class a implements D3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wx.a f37713a;

        a(Image image, G2 g11) {
            wx.a aVarC = wx.a.c(image, g11.f37712a);
            p013kotlin.jvm.internal.s.j(aVarC, "fromMediaImage(...)");
            this.f37713a = aVarC;
        }

        @Override // com.fourthline.vision.internal.D3
        public wx.a getImage() {
            return this.f37713a;
        }
    }

    public static final class b implements D3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wx.a f37714a;

        b(Bitmap bitmap, G2 g11) {
            wx.a aVarA = wx.a.a(bitmap, g11.f37712a);
            p013kotlin.jvm.internal.s.j(aVarA, "fromBitmap(...)");
            this.f37714a = aVarA;
        }

        @Override // com.fourthline.vision.internal.D3
        public wx.a getImage() {
            return this.f37714a;
        }
    }

    public static final class c implements D3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wx.a f37715a;

        c(G2 g11, byte[] bArr, C4165c4 c4165c4) {
            wx.a aVarA = wx.a.a(g11.convertYUVtoGrayscaleBitmap(bArr, c4165c4.width(), c4165c4.height()), g11.f37712a);
            p013kotlin.jvm.internal.s.j(aVarA, "fromBitmap(...)");
            this.f37715a = aVarA;
        }

        @Override // com.fourthline.vision.internal.D3
        public wx.a getImage() {
            return this.f37715a;
        }
    }

    public G2(int i11) {
        this.f37712a = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertYUVtoGrayscaleBitmap(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = ((bArr[i13] & 255) * 65793) | (-16777216);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i11, i12, Bitmap.Config.ARGB_8888);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final C4165c4 mapToImageCoords(C4165c4 c4165c4, int i11) {
        Matrix matrix = new Matrix();
        matrix.setRotate(-this.f37712a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i12 = this.f37712a;
        matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, (i12 == 90 || i12 == 270) ? i11 : 0.0f);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, AbstractC4173d4.toRectF(c4165c4));
        return AbstractC4173d4.toRectangle(rectF);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4164c3
    public D3 toMlKitFrame(Image image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return new a(image, this);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4164c3
    public D3 toMlKitFrame(Bitmap image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return new b(image, this);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4164c3
    public D3 toMlKitFrame(Image image, int i11, int i12, C4165c4 processingArea) {
        p013kotlin.jvm.internal.s.k(image, "image");
        p013kotlin.jvm.internal.s.k(processingArea, "processingArea");
        C4165c4 c4165c4MapToImageCoords = mapToImageCoords(processingArea, i12);
        Image.Plane[] planes = image.getPlanes();
        p013kotlin.jvm.internal.s.j(planes, "getPlanes(...)");
        int rowStride = planes[0].getRowStride();
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[c4165c4MapToImageCoords.width() * c4165c4MapToImageCoords.height()];
        int top = c4165c4MapToImageCoords.getTop() * rowStride;
        int iHeight = c4165c4MapToImageCoords.height();
        for (int i13 = 0; i13 < iHeight; i13++) {
            int left = (i13 * rowStride) + top + c4165c4MapToImageCoords.getLeft();
            if (left < 0 || left > buffer.capacity()) {
                break;
            }
            buffer.position(left);
            buffer.get(bArr, c4165c4MapToImageCoords.width() * i13, c4165c4MapToImageCoords.width());
        }
        return new c(this, bArr, c4165c4MapToImageCoords);
    }
}
