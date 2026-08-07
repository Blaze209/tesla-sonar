package e0;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements p0.a0<a, c0.r0.h> {

    public static abstract class a {
        @NonNull
        public static a c(@NonNull p0.b0<byte[]> b0Var, @NonNull c0.r0.g gVar) {
            return new e(b0Var, gVar);
        }

        @NonNull
        abstract c0.r0.g a();

        @NonNull
        abstract p0.b0<byte[]> b();
    }

    static void b(@NonNull File file, @NonNull byte[] bArr) throws ImageCaptureException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new n0.c().b(bArr));
                fileOutputStream.close();
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
        }
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c0.r0.h apply(@NonNull a aVar) throws ImageCaptureException {
        p0.b0<byte[]> b0VarB = aVar.b();
        c0.r0.g gVarA = aVar.a();
        File fileE = z.e(gVarA);
        b(fileE, b0VarB.c());
        h0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        z.l(fileE, gVarD, gVarA, b0VarB.f());
        return new c0.r0.h(z.j(fileE, gVarA), 256);
    }
}
