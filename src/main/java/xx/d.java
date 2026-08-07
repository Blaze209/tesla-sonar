package xx;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final GmsLogger f124047a = new GmsLogger("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f124048b = new d();

    private d() {
    }

    @NonNull
    @KeepForSdk
    public static d b() {
        return f124048b;
    }

    @NonNull
    @KeepForSdk
    public IObjectWrapper a(@NonNull wx.a aVar) throws MlKitException {
        int iH = aVar.h();
        if (iH == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(aVar.e()));
        }
        if (iH != 17) {
            if (iH == 35) {
                return ObjectWrapper.wrap(aVar.j());
            }
            if (iH != 842094169) {
                throw new MlKitException("Unsupported image format: " + aVar.h(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(aVar.f()));
    }

    @KeepForSdk
    public int c(@NonNull wx.a aVar) {
        return aVar.h();
    }

    @KeepForSdk
    public int d(@NonNull wx.a aVar) {
        if (aVar.h() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(aVar.e())).getAllocationByteCount();
        }
        if (aVar.h() == 17 || aVar.h() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(aVar.f())).limit();
        }
        if (aVar.h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(aVar.k()))[0].getBuffer().limit() * 3) / 2;
    }

    @KeepForSdk
    public Matrix e(int i11, int i12, int i13) {
        if (i13 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i11) / 2.0f, (-i12) / 2.0f);
        matrix.postRotate(i13 * 90);
        int i14 = i13 % 2;
        int i15 = i14 != 0 ? i12 : i11;
        if (i14 == 0) {
            i11 = i12;
        }
        matrix.postTranslate(i15 / 2.0f, i11 / 2.0f);
        return matrix;
    }
}
