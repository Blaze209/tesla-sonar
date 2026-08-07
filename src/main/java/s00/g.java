package s00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Call;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls00/g;", "", "<init>", "()V", "Lokhttp3/Call;", "call", "", "uuid", "Ljn0/h0;", "b", "(Lokhttp3/Call;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)Lokhttp3/Call;", "e", DateTokenConverter.CONVERTER_KEY, "()Lokhttp3/Call;", "a", "", "Ljava/util/Map;", "resumableCalls", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, Call> resumableCalls = new HashMap();

    public final void a() {
        Iterator<Map.Entry<String, Call>> it = this.resumableCalls.entrySet().iterator();
        while (it.hasNext()) {
            Call value = it.next().getValue();
            if (value != null) {
                value.cancel();
            }
        }
        this.resumableCalls.clear();
    }

    public final void b(Call call, String uuid) {
        s.k(call, "call");
        s.k(uuid, "uuid");
        this.resumableCalls.put(uuid, call);
    }

    public final Call c(String uuid) {
        s.k(uuid, "uuid");
        return this.resumableCalls.get(uuid);
    }

    public final Call d() {
        return (Call) u0.d(this.resumableCalls).remove((String) v.B0(this.resumableCalls.keySet()));
    }

    public final Call e(String uuid) {
        s.k(uuid, "uuid");
        return c(uuid);
    }
}
