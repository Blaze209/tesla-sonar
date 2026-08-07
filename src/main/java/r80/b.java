package r80;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lr80/b;", "Lr80/d;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "projectId", "c", "getKey", Action.KEY_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "getSecret", "secret", "e", "getVersion", "version", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f107303a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String projectId = "426";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String key = "dcb428fea25c40e7b99f81ae5981ee6a";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String secret = "deca87e736574c5c83c07314051fd93a";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String version = "7";

    private b() {
    }

    @Override // r80.d
    public String a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis);
        return seconds + "." + (jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
    }

    @Override // r80.d
    public String b() {
        return projectId;
    }

    @Override // r80.d
    public String getKey() {
        return key;
    }

    @Override // r80.d
    public String getSecret() {
        return secret;
    }

    @Override // r80.d
    public String getVersion() {
        return version;
    }
}
