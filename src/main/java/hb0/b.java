package hb0;

import android.app.PendingIntent;
import android.content.Context;
import ic0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhb0/b;", "Lnd0/a;", "", "vin", "Lic0/e;", "a", "(Ljava/lang/String;)Lic0/e;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b extends nd0.a {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static PendingIntent a(b bVar, Context context, int i11, String str) {
            s.k(context, "context");
            if (str == null) {
                throw new IllegalStateException("Cannot create pending intent with null vin!");
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i11, hb0.a.f72473a.b(context, i11, str, bVar), 67108864);
            s.j(broadcast, "getBroadcast(...)");
            return broadcast;
        }
    }

    e a(String vin);
}
