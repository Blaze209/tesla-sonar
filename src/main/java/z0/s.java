package z0;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    public static abstract class a {
        a() {
        }

        @NonNull
        public abstract s a();

        @NonNull
        public a b(@NonNull Consumer<e2.a> consumer) {
            e2.a aVarF = c().f();
            consumer.accept(aVarF);
            f(aVarF.a());
            return this;
        }

        @SuppressLint({"KotlinPropertyAccess"})
        abstract e2 c();

        @NonNull
        public abstract a d(@NonNull z0.a aVar);

        @NonNull
        public abstract a e(int i11);

        @NonNull
        public abstract a f(@NonNull e2 e2Var);
    }

    s() {
    }

    @NonNull
    public static a a() {
        return new g.b().e(-1).d(z0.a.a().a()).f(e2.a().a());
    }

    @NonNull
    public static String e(int i11) {
        return i11 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int f(int i11) {
        return Objects.equals(e(i11), "audio/mp4a-latm") ? 2 : -1;
    }

    static int g(int i11) {
        return i11 != 1 ? 0 : 1;
    }

    @NonNull
    public static String h(int i11) {
        return i11 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    @NonNull
    public abstract z0.a b();

    public abstract int c();

    @NonNull
    public abstract e2 d();

    @NonNull
    public abstract a i();
}
