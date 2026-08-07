package rd0;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrd0/k;", "", "<init>", "()V", "", "vin", "", "a", "(Ljava/lang/String;)Z", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f107787a = new k();

    private k() {
    }

    public final boolean a(String vin) {
        if (vin != null && vin.length() != 0) {
            return i.c(vin) == j.Enabled;
        }
        com.tesla.logging.g gVarA = com.tesla.logging.g.INSTANCE.a("PhoneKeySettingUtils");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVarA.getTag();
        String strG = gVarA.g("VIN is null or empty, cannot fetch phone key setting state");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return true;
    }
}
