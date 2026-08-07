package rd0;

import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrd0/i;", "", "<init>", "()V", "", "vin", "Lrd0/j;", "c", "(Ljava/lang/String;)Lrd0/j;", "state", "Ljn0/h0;", "f", "(Ljava/lang/String;Lrd0/j;)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f107785a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("PhoneKeySettingRepository");

    private i() {
    }

    private final String a(String vin) {
        return "PASSIVE_AUTH_DISABLED_" + vin;
    }

    private final String b(String vin) {
        return "PHONE_KEY_SETTING_STATE_" + vin;
    }

    public static final j c(String vin) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        td0.m mVarJ = td0.m.j();
        i iVar = f107785a;
        String strH = mVarJ.h(iVar.b(vin));
        return strH != null ? j.INSTANCE.a(strH) : iVar.d(vin);
    }

    private final j d(String vin) {
        String strA = a(vin);
        String strH = td0.m.j().h(strA);
        Boolean boolE1 = strH != null ? p013kotlin.text.t.E1(strH) : null;
        if (boolE1 == null) {
            return j.Enabled;
        }
        j jVar = boolE1.booleanValue() ? j.DisabledByApp : j.Enabled;
        f(vin, jVar);
        td0.m.j().r(strA);
        return jVar;
    }

    public static final void f(String vin, j state) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(state, "state");
        logger.j("Setting phone key setting state to " + state.getValue() + " for " + vin);
        td0.m.j().u(f107785a.b(vin), state.getValue());
    }

    public final void e() {
        List<Pair<String, String>> listF = be0.e.INSTANCE.a().f();
        if (listF != null) {
            List<Pair<String, String>> list = listF;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strOptString = new JSONObject((String) ((Pair) it.next()).second).optString("vin");
                i iVar = f107785a;
                p013kotlin.jvm.internal.s.h(strOptString);
                arrayList.add(iVar.d(strOptString));
            }
        }
    }
}
