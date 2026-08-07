package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.util.Size;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class N2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I2 f37850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J2 f37851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f37852c;

    public N2(I2 imageConverter, J2 imageCropper, Size imageSize) {
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(imageCropper, "imageCropper");
        p013kotlin.jvm.internal.s.k(imageSize, "imageSize");
        this.f37850a = imageConverter;
        this.f37851b = imageCropper;
        this.f37852c = imageSize;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Image, C4165c4>) obj, (Continuation<? super ScannerImage>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
        this.f37850a.close();
    }

    public Object process(Pair<? extends Image, C4165c4> pair, Continuation<? super ScannerImage> continuation) {
        Bitmap bitmap = this.f37850a.toBitmap(pair.e(), this.f37852c.getWidth(), this.f37852c.getHeight());
        return new ScannerImage(bitmap, J2.a.crop$default(this.f37851b, bitmap, pair.f(), 0, 4, null));
    }
}
