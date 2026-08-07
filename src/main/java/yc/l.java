package yc;

import android.os.StatFs;
import java.io.File;
import okio.i0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lokio/o;", "Lokio/i0;", "directory", "", "a", "(Lokio/o;Lokio/i0;)J", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final long a(okio.o oVar, i0 i0Var) {
        File file = i0Var.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
