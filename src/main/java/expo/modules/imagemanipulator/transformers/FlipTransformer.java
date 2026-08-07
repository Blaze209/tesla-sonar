package expo.modules.imagemanipulator.transformers;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import expo.modules.imagemanipulator.FlipType;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/imagemanipulator/transformers/FlipTransformer;", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "flipType", "Lexpo/modules/imagemanipulator/FlipType;", "<init>", "(Lexpo/modules/imagemanipulator/FlipType;)V", "transform", "Landroid/graphics/Bitmap;", "bitmap", "rotationMatrix", "Landroid/graphics/Matrix;", "getRotationMatrix", "()Landroid/graphics/Matrix;", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlipTransformer implements ImageTransformer {
    private final FlipType flipType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlipType.values().length];
            try {
                iArr[FlipType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlipType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlipTransformer(FlipType flipType) {
        s.k(flipType, "flipType");
        this.flipType = flipType;
    }

    private final Matrix getRotationMatrix() {
        Matrix matrix = new Matrix();
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.flipType.ordinal()];
        if (i11 == 1) {
            matrix.postScale(1.0f, -1.0f);
            return matrix;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    @Override // expo.modules.imagemanipulator.transformers.ImageTransformer
    public Bitmap transform(Bitmap bitmap) {
        s.k(bitmap, "bitmap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), getRotationMatrix(), true);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
