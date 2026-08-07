package gr;

import java.util.UUID;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l implements fr.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f69367d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f69368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f69369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69370c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z11;
        if ("Amazon".equals(p0.f115042c)) {
            String str = p0.f115043d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        f69367d = z11;
    }

    public l(UUID uuid, byte[] bArr, boolean z11) {
        this.f69368a = uuid;
        this.f69369b = bArr;
        this.f69370c = z11;
    }
}
