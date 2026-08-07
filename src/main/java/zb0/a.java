package zb0;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzb0/a;", "", "<init>", "()V", "", "", "data", "", "throwable", "Ljn0/h0;", "b", "(Ljava/util/Map;Ljava/lang/Throwable;)V", Action.KEY_ATTRIBUTE, "value", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "error-reporting_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f128044a = new a();

    private a() {
    }

    public final void a(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        FirebaseCrashlytics.getInstance().log(key + ": " + value);
    }

    public final void b(Map<String, String> data, Throwable throwable) {
        s.k(data, "data");
        s.k(throwable, "throwable");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            f128044a.a(entry.getKey(), entry.getValue());
        }
        firebaseCrashlytics.recordException(throwable);
    }
}
