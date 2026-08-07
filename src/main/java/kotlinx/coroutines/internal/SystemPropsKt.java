package kotlinx.coroutines.internal;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i11, int i12, int i13) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i11, i12, i13);
    }

    public static final long systemProp(String str, long j11, long j12, long j13) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j11, j12, j13);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z11) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z11);
    }
}
