package p013kotlin.reflect.jvm.internal.impl.platform;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SimplePlatform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TargetPlatformVersion f88239b;

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.f88239b;
    }

    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() <= 0) {
            return this.f88238a;
        }
        return this.f88238a + " (" + targetName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
