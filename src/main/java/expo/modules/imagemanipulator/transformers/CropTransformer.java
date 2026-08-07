package expo.modules.imagemanipulator.transformers;

import android.graphics.Bitmap;
import expo.modules.imagemanipulator.CropRect;
import expo.modules.imagemanipulator.ImageInvalidCropException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lexpo/modules/imagemanipulator/transformers/CropTransformer;", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "rect", "Lexpo/modules/imagemanipulator/CropRect;", "<init>", "(Lexpo/modules/imagemanipulator/CropRect;)V", "transform", "Landroid/graphics/Bitmap;", "bitmap", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropTransformer implements ImageTransformer {
    private final CropRect rect;

    public CropTransformer(CropRect rect) {
        s.k(rect, "rect");
        this.rect = rect;
    }

    @Override // expo.modules.imagemanipulator.transformers.ImageTransformer
    public Bitmap transform(Bitmap bitmap) throws ImageInvalidCropException {
        s.k(bitmap, "bitmap");
        if (this.rect.getOriginX() > bitmap.getWidth() || this.rect.getOriginY() > bitmap.getHeight() || this.rect.getWidth() > bitmap.getWidth() || this.rect.getHeight() > bitmap.getHeight()) {
            throw new ImageInvalidCropException();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) this.rect.getOriginX(), (int) this.rect.getOriginY(), (int) this.rect.getWidth(), (int) this.rect.getHeight());
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
