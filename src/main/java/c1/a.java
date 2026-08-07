package c1;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Integer> f18516a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED), 4800));

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0367a {
        AbstractC0367a() {
        }

        abstract a a();

        @NonNull
        public final a b() {
            a aVarA = a();
            String str = "";
            if (aVarA.c() == -1) {
                str = " audioSource";
            }
            if (aVarA.f() <= 0) {
                str = str + " sampleRate";
            }
            if (aVarA.e() <= 0) {
                str = str + " channelCount";
            }
            if (aVarA.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return aVarA;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        @NonNull
        public abstract AbstractC0367a c(int i11);

        @NonNull
        public abstract AbstractC0367a d(int i11);

        @NonNull
        public abstract AbstractC0367a e(int i11);

        @NonNull
        public abstract AbstractC0367a f(int i11);
    }

    a() {
    }

    @NonNull
    @SuppressLint({"Range"})
    public static AbstractC0367a a() {
        return new o.b().d(-1).f(-1).e(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return n.f(b(), e());
    }

    public abstract int e();

    public abstract int f();
}
