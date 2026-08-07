package le;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.regex.Pattern;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001c\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0017\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Lle/i;", "", "<init>", "()V", "", "emailAddress", "", "b", "(Ljava/lang/String;)Z", "clientKey", "Lme/c;", AnalyticsAttribute.Environment, "a", "(Ljava/lang/String;Lme/c;)Z", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "EMAIL_PATTERN", "c", "PHONE_PATTERN", DateTokenConverter.CONVERTER_KEY, "TEST_CLIENT_KEY_PATTERN", "e", "LIVE_CLIENT_KEY_PATTERN", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f89954a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(([a-z0-9!#$%&'*+\\-/=?^_`{|}~]+(\\.[a-z0-9!#$%&'*+\\-/=?^_`{|}~]+)*)|(\".+\"))@((\\[((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}])|((?!-)[a-z0-9-]{1,63}(?<!-)(\\.[a-z0-9-]{1,63}(?<!-))*\\.[a-z]{2,}))$", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\D*(\\d\\D*){9,14}$");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Pattern TEST_CLIENT_KEY_PATTERN = Pattern.compile("test_([a-zA-Z0-9]){32}");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Pattern LIVE_CLIENT_KEY_PATTERN = Pattern.compile("live_([a-zA-Z0-9]){32}");

    private i() {
    }

    public final boolean a(String clientKey, Environment environment) {
        s.k(clientKey, "clientKey");
        s.k(environment, "environment");
        if (s.f(environment, Environment.f91841d)) {
            return TEST_CLIENT_KEY_PATTERN.matcher(clientKey).matches();
        }
        if (s.f(environment, Environment.f91846i) ? true : s.f(environment, Environment.f91844g) ? true : s.f(environment, Environment.f91842e) ? true : s.f(environment, Environment.f91845h) ? true : s.f(environment, Environment.f91843f)) {
            return LIVE_CLIENT_KEY_PATTERN.matcher(clientKey).matches();
        }
        return false;
    }

    public final boolean b(String emailAddress) {
        s.k(emailAddress, "emailAddress");
        return EMAIL_PATTERN.matcher(emailAddress).matches();
    }
}
