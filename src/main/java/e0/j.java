package e0;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j implements p0.a0<b, p0.b0<byte[]>> {

    private static class a {
        static boolean a(@NonNull Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    public static abstract class b {
        @NonNull
        public static b c(@NonNull p0.b0<Bitmap> b0Var, int i11) {
            return new e0.a(b0Var, i11);
        }

        abstract int a();

        abstract p0.b0<Bitmap> b();
    }

    private static int b(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<byte[]> apply(@NonNull b bVar) {
        p0.b0<Bitmap> b0VarB = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b0VarB.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        h0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        return p0.b0.m(byteArray, gVarD, b(b0VarB.c()), b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }
}
