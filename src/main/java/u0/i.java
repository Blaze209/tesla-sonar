package u0;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f115231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f115232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f115233d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115234a;

        static {
            int[] iArr = new int[p3.b.values().length];
            f115234a = iArr;
            try {
                iArr[p3.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115234a[p3.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115234a[p3.b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115234a[p3.b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(@NonNull p pVar) {
        this.f115231b = new l(pVar);
        this.f115232c = new m(pVar);
        this.f115233d = new k(pVar);
    }

    private boolean b(List<Pair<Integer, Size[]>> list) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            int iIntValue = ((Integer) pair.first).intValue();
            Size[] sizeArr = (Size[]) pair.second;
            if (iIntValue == 35 && sizeArr != null && sizeArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.p3
    public x0 a(@NonNull p3.b bVar, int i11) {
        d2 d2VarD0;
        int i12 = a.f115234a[bVar.ordinal()];
        if (i12 == 1) {
            d2VarD0 = d2.d0(this.f115231b.a());
        } else if (i12 == 2) {
            d2VarD0 = d2.d0(this.f115232c.a());
        } else {
            if (i12 != 3) {
                if (i12 != 4) {
                    return null;
                }
                throw new IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
            }
            o1 o1VarA = this.f115233d.a();
            if (!b(o1VarA.k(null))) {
                throw new IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            d2VarD0 = d2.d0(o1VarA);
        }
        d2VarD0.K(o3.A, Boolean.TRUE);
        return i2.b0(d2VarD0);
    }
}
