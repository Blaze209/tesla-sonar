package pc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import nc.h;
import nc.l;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnc/l$a;", DateTokenConverter.CONVERTER_KEY, "()Lnc/l$a;", "Lokhttp3/Call$Factory;", "Lnc/h;", "c", "(Lokhttp3/Call$Factory;)Lnc/h;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h b() {
        return c(new OkHttpClient());
    }

    public static final h c(Call.Factory factory) {
        return qc.a.b(qc.a.c(factory));
    }

    public static final l.a d() {
        return new l.a(new wn0.a() { // from class: pc.a
            @Override // wn0.a
            public final Object invoke() {
                return b.b();
            }
        }, null, null, 6, null);
    }
}
