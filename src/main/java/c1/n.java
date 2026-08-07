package c1;

import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static int a(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static int b(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static long c(int i11, long j11, @NonNull AudioTimestamp audioTimestamp) {
        u5.h.b(((long) i11) > 0, "sampleRate must be greater than 0.");
        u5.h.b(j11 >= 0, "framePosition must be no less than 0.");
        long jD = audioTimestamp.nanoTime + d(j11 - audioTimestamp.framePosition, i11);
        if (jD < 0) {
            return 0L;
        }
        return jD;
    }

    public static long d(long j11, int i11) {
        long j12 = i11;
        u5.h.b(j12 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j11) / j12;
    }

    public static long e(long j11, int i11) {
        long j12 = i11;
        u5.h.b(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 * j12;
    }

    public static int f(int i11, int i12) {
        u5.h.b(i12 > 0, "Invalid channel count: " + i12);
        if (i11 == 2) {
            return i12 * 2;
        }
        if (i11 == 3) {
            return i12;
        }
        if (i11 != 4) {
            if (i11 == 21) {
                return i12 * 3;
            }
            if (i11 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i11);
            }
        }
        return i12 * 4;
    }

    public static long g(long j11, int i11) {
        long j12 = i11;
        u5.h.b(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 / j12;
    }
}
