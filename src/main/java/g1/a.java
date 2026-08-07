package g1;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import com.google.android.gms.common.Scopes;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1372a {
        AbstractC1372a() {
        }

        @NonNull
        abstract a a();

        @NonNull
        public a b() {
            a aVarA = a();
            if (Objects.equals(aVarA.getMimeType(), "audio/mp4a-latm") && aVarA.f() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return aVarA;
        }

        @NonNull
        public abstract AbstractC1372a c(int i11);

        @NonNull
        public abstract AbstractC1372a d(int i11);

        @NonNull
        public abstract AbstractC1372a e(@NonNull h3 h3Var);

        @NonNull
        public abstract AbstractC1372a f(@NonNull String str);

        @NonNull
        public abstract AbstractC1372a g(int i11);

        @NonNull
        public abstract AbstractC1372a h(int i11);
    }

    a() {
    }

    @NonNull
    public static AbstractC1372a c() {
        return new c.b().g(-1);
    }

    @Override // g1.m
    @NonNull
    public abstract h3 a();

    @Override // g1.m
    @NonNull
    public MediaFormat b() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(getMimeType(), g(), e());
        mediaFormatCreateAudioFormat.setInteger("bitrate", d());
        if (f() != -1) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", f());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, f());
        }
        return mediaFormatCreateAudioFormat;
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    @Override // g1.m
    @NonNull
    public abstract String getMimeType();
}
