package ff0;

import com.tesla.logging.TeslaLog;
import hf0.PhoneKeyLog;
import io.reactivex.rxjava3.core.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lff0/i;", "", "<init>", "()V", "Lio/reactivex/rxjava3/core/o;", "Lhf0/h;", "a", "()Lio/reactivex/rxjava3/core/o;", "response", "Ljn0/h0;", "b", "(Lhf0/h;)V", "Lwm0/e;", "kotlin.jvm.PlatformType", "Lwm0/e;", "results", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f65846a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<PhoneKeyLog> results;

    static {
        wm0.e eVarB0 = wm0.b.d0().b0();
        s.j(eVarB0, "toSerialized(...)");
        results = eVarB0;
    }

    private i() {
    }

    public static final o<PhoneKeyLog> a() {
        return results;
    }

    public static final void b(PhoneKeyLog response) {
        s.k(response, "response");
        TeslaLog.INSTANCE.i("PhoneKeyLogManager", "received PhoneKeyLog from vin " + response.getVin());
        results.onNext(response);
    }
}
