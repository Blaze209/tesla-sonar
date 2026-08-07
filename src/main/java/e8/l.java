package e8;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l implements y7.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f62229d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f62230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f62231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f62232c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z11;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        f62229d = z11;
    }

    public l(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public l(UUID uuid, byte[] bArr, boolean z11) {
        this.f62230a = uuid;
        this.f62231b = bArr;
        this.f62232c = z11;
    }
}
