package e0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class y implements p0.a0<a, c0.r0.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private DngCreator f61427a;

    static abstract class a {
        a() {
        }

        @NonNull
        static a d(@NonNull androidx.camera.core.n nVar, int i11, @NonNull c0.r0.g gVar) {
            return new c(nVar, i11, gVar);
        }

        @NonNull
        abstract androidx.camera.core.n a();

        @NonNull
        abstract c0.r0.g b();

        abstract int c();
    }

    public y(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    static int b(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 90) {
            return 6;
        }
        if (i11 != 180) {
            return i11 != 270 ? 0 : 8;
        }
        return 3;
    }

    private void c(@NonNull File file, @NonNull androidx.camera.core.n nVar, int i11) {
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.f61427a.setOrientation(b(i11));
                    this.f61427a.writeImage(fileOutputStream, nVar.getImage());
                    fileOutputStream.close();
                    nVar.close();
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                throw new ImageCaptureException(1, "Failed to write to temp file", e11);
            } catch (IllegalArgumentException e12) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e12);
            } catch (IllegalStateException e13) {
                throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e13);
            }
        } catch (Throwable th4) {
            nVar.close();
            throw th4;
        }
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c0.r0.h apply(@NonNull a aVar) {
        c0.r0.g gVarB = aVar.b();
        File fileE = z.e(gVarB);
        c(fileE, aVar.a(), aVar.c());
        return new c0.r0.h(z.j(fileE, gVarB), 32);
    }

    y(@NonNull DngCreator dngCreator) {
        this.f61427a = dngCreator;
    }
}
