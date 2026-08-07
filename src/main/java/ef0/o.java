package ef0;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.wire.ProtoAdapter;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import vc0.w0;
import vc0.z2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Lef0/o;", "", "<init>", "()V", "", "data", "Lef0/n;", "b", "([B)Lef0/n;", "E", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "a", "(Lcom/squareup/wire/ProtoAdapter;[B)Ljava/lang/Object;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f62919a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("VehicleMessageParser");

    private o() {
    }

    private final <E> E a(ProtoAdapter<E> adapter, byte[] data) {
        try {
            return adapter.decode(data);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    public static final VehicleMessage b(byte[] data) {
        w0 w0Var;
        VehicleMessage vehicleMessage;
        s.k(data, "data");
        long jCurrentTimeMillis = System.currentTimeMillis();
        o oVar = f62919a;
        sc0.h hVar = (sc0.h) oVar.a(sc0.h.f111089m, data);
        okio.k protobuf_message_as_bytes = hVar != null ? hVar.getProtobuf_message_as_bytes() : null;
        sc0.a from_destination = hVar != null ? hVar.getFrom_destination() : null;
        sc0.a to_destination = hVar != null ? hVar.getTo_destination() : null;
        if (from_destination == null && to_destination == null) {
            vehicleMessage = new VehicleMessage(null, (w0) oVar.a(w0.f118956z, data), null, jCurrentTimeMillis, 5, null);
        } else {
            if (protobuf_message_as_bytes == null) {
                w0Var = null;
            } else if ((from_destination != null ? from_destination.getDomain() : null) == sc0.b.DOMAIN_VEHICLE_SECURITY) {
                w0Var = (w0) oVar.a(w0.f118956z, protobuf_message_as_bytes.J());
            } else {
                w0Var = null;
            }
            vehicleMessage = new VehicleMessage(null, w0Var, hVar, jCurrentTimeMillis, 1, null);
        }
        VehicleMessage vehicleMessageB = vehicleMessage;
        z2 z2Var = (z2) oVar.a(z2.f119007d, data);
        if (z2Var != null) {
            vehicleMessageB = VehicleMessage.b(vehicleMessageB, z2Var, null, null, 0L, 14, null);
        }
        if (vehicleMessageB.getRoutableMessage() == null && vehicleMessageB.getFromVCSECMessage() == null && vehicleMessageB.getToVCSECMessage() == null) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Unable to parse message as RoutableMessage, FromVCSECMessage or ToVCSECMessage");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        return vehicleMessageB;
    }
}
