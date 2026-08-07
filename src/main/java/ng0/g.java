package ng0;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lng0/g;", "Lng0/a;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "", "c", "Z", "getDefaultValue", "()Z", "defaultValue", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f95005a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String key = "selfie_redesign_mobile_sdk";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultValue = false;

    private g() {
    }

    @Override // ng0.a
    public boolean getDefaultValue() {
        return defaultValue;
    }

    @Override // ng0.a
    public String getKey() {
        return key;
    }
}
