package p013kotlin.reflect.jvm.internal.impl.platform;

import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class PlatformUtilKt {
    public static final String getPresentableDescription(TargetPlatform targetPlatform) {
        s.k(targetPlatform, "<this>");
        return v.y0(targetPlatform.getComponentPlatforms(), "/", null, null, 0, null, null, 62, null);
    }
}
