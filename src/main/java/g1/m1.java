package g1;

import android.media.MediaFormat;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import com.google.android.gms.common.Scopes;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 implements m {

    public static abstract class a {
        a() {
        }

        @NonNull
        public abstract m1 a();

        @NonNull
        public abstract a b(int i11);

        @NonNull
        public abstract a c(int i11);

        @NonNull
        public abstract a d(@NonNull n1 n1Var);

        @NonNull
        public abstract a e(int i11);

        @NonNull
        public abstract a f(int i11);

        @NonNull
        public abstract a g(@NonNull h3 h3Var);

        @NonNull
        public abstract a h(@NonNull String str);

        @NonNull
        public abstract a i(int i11);

        @NonNull
        public abstract a j(@NonNull Size size);
    }

    m1() {
    }

    @NonNull
    public static a c() {
        return new d.b().i(-1).f(1).c(2130708361).d(n1.f66976a);
    }

    @Override // g1.m
    @NonNull
    public abstract h3 a();

    @Override // g1.m
    @NonNull
    public MediaFormat b() {
        Size sizeJ = j();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(getMimeType(), sizeJ.getWidth(), sizeJ.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", e());
        mediaFormatCreateVideoFormat.setInteger("bitrate", d());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", g());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", h());
        if (i() != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i());
        }
        n1 n1VarF = f();
        if (n1VarF.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", n1VarF.c());
        }
        if (n1VarF.d() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", n1VarF.d());
        }
        if (n1VarF.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", n1VarF.b());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int d();

    public abstract int e();

    @NonNull
    public abstract n1 f();

    public abstract int g();

    @Override // g1.m
    @NonNull
    public abstract String getMimeType();

    public abstract int h();

    public abstract int i();

    @NonNull
    public abstract Size j();
}
