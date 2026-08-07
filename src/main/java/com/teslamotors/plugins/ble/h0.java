package com.teslamotors.plugins.ble;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import ob0.RequestVehicleData;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import vc0.e3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00182\u00020\u0001:\u0003!\n\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/teslamotors/plugins/ble/h0;", "", "Ljn0/h0;", "start", "()V", "e", "Lcom/teslamotors/plugins/ble/Peripheral;", "peripheral", "b", "(Lcom/teslamotors/plugins/ble/Peripheral;)V", "c", "Lcom/teslamotors/plugins/ble/h0$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "l", "(Lcom/teslamotors/plugins/ble/h0$c;)V", "Lvc0/w0;", "message", "", "receivedBytesTimestamp", "f", "(Lvc0/w0;Lcom/teslamotors/plugins/ble/Peripheral;J)V", "", "token", "remoteKey", "a", "([B[B)[B", "Lvc0/e3;", "additionalData", "Ldf0/a;", "k", "(Lvc0/e3;[B)Ldf0/a;", "", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "keyIDs", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "onWhitelist", "h", "()Ljava/lang/String;", "publicKeyHash", "getPublicKey", "()[B", "publicKey", "Lcom/teslamotors/plugins/ble/h0$d;", "getType", "()Lcom/teslamotors/plugins/ble/h0$d;", "type", "g", "()J", "sessionCounter", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56878a;

    /* JADX INFO: renamed from: com.teslamotors.plugins.ble.h0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/teslamotors/plugins/ble/h0$a;", "", "<init>", "()V", "Lcom/teslamotors/plugins/ble/q1;", "vehicleController", "", "vin", Scopes.EMAIL, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lye0/n;", "sender", "Lcom/teslamotors/plugins/ble/h0;", "a", "(Lcom/teslamotors/plugins/ble/q1;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lye0/n;)Lcom/teslamotors/plugins/ble/h0;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56878a = new Companion();

        private Companion() {
        }

        public final h0 a(q1 vehicleController, String vin, String email, Context context, ye0.n sender) {
            p013kotlin.jvm.internal.s.k(vehicleController, "vehicleController");
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(email, "email");
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(sender, "sender");
            RequestVehicleData requestVehicleDataB = ob0.a.b(be0.e.INSTANCE.a(), vin, 0, 0, 6, null);
            return ob0.d.c(vin, requestVehicleDataB.getApiVersion(), requestVehicleDataB.getCarType()) ? new a2(vehicleController, vin, email, context) : new gf0.b(vehicleController, vin, email, context, sender);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static df0.a a(h0 h0Var, e3 message, byte[] additionalData) {
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(additionalData, "additionalData");
            return null;
        }

        public static long b(h0 h0Var) {
            return 0L;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/teslamotors/plugins/ble/h0$c;", "", "Ljn0/h0;", "onReset", "()V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        void onReset();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/teslamotors/plugins/ble/h0$d;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY", "ROUTABLE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        LEGACY,
        ROUTABLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    static h0 j(q1 q1Var, String str, String str2, Context context, ye0.n nVar) {
        return INSTANCE.a(q1Var, str, str2, context, nVar);
    }

    byte[] a(byte[] token, byte[] remoteKey);

    void b(Peripheral peripheral);

    void c(Peripheral peripheral);

    Set<String> d();

    void e();

    void f(vc0.w0 message, Peripheral peripheral, long receivedBytesTimestamp);

    long g();

    byte[] getPublicKey();

    d getType();

    String h();

    /* JADX INFO: renamed from: i */
    boolean getOnWhitelist();

    df0.a k(e3 message, byte[] additionalData);

    void l(c listener);

    void start();
}
