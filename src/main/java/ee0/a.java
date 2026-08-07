package ee0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.sessionmanager.VehicleSessionInfo;
import ic0.q;
import io.reactivex.rxjava3.core.o;
import jn0.s;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u0000 !2\u00020\u0001:\u0001!J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010&J7\u0010'\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lee0/a;", "", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "", "vin", "", "sourcePublicKey", "requestId", "", "persist", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/tesla/sessionmanager/VehicleSessionInfo;Ljava/lang/String;[BLjava/lang/String;Z)V", "Lsc0/b;", "domain", "e", "(Lsc0/b;Ljava/lang/String;[B)V", "b", "(Lsc0/b;[BLjava/lang/String;)V", "g", "(Lsc0/b;Ljava/lang/String;[B)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "l", "(Lsc0/b;[BLjava/lang/String;)Z", "fetching", "Lic0/q;", "transport", "h", "(ZLjava/lang/String;[BLsc0/b;Lic0/q;)V", "c", "(Ljava/lang/String;[BLsc0/b;Lic0/q;)Z", "confirmed", "f", "a", "(Ljava/lang/String;Lic0/q;)V", "inFlight", "ownerCommandId", "j", "(ZLjava/lang/String;[BLsc0/b;Lic0/q;Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;[BLsc0/b;Lic0/q;Ljava/lang/String;)Z", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f62847a;

    /* JADX INFO: renamed from: ee0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lee0/a$a;", "", "<init>", "()V", "Lbe0/b;", "getSelectedProduct", "", "userPublicKey", "Lio/reactivex/rxjava3/core/o;", "Ljn0/s;", "publicKey", "Lee0/a;", "a", "(Lbe0/b;[BLio/reactivex/rxjava3/core/o;)Lee0/a;", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f62847a = new Companion();

        private Companion() {
        }

        public final a a(be0.b getSelectedProduct, byte[] userPublicKey, o<s<byte[]>> publicKey) {
            p013kotlin.jvm.internal.s.k(getSelectedProduct, "getSelectedProduct");
            p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
            return new g(new ee0.b(), getSelectedProduct, userPublicKey, publicKey);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(a aVar, VehicleSessionInfo vehicleSessionInfo, String str, byte[] bArr, String str2, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSessionInfo");
            }
            if ((i11 & 16) != 0) {
                z11 = true;
            }
            aVar.d(vehicleSessionInfo, str, bArr, str2, z11);
        }
    }

    static a k(be0.b bVar, byte[] bArr, o<s<byte[]>> oVar) {
        return INSTANCE.a(bVar, bArr, oVar);
    }

    void a(String vin, q transport);

    void b(sc0.b domain, byte[] sourcePublicKey, String vin);

    boolean c(String vin, byte[] sourcePublicKey, sc0.b domain, q transport);

    void d(VehicleSessionInfo sessionInfo, String vin, byte[] sourcePublicKey, String requestId, boolean persist);

    void e(sc0.b domain, String vin, byte[] sourcePublicKey);

    void f(boolean confirmed, String vin, byte[] sourcePublicKey, sc0.b domain, q transport);

    VehicleSessionInfo g(sc0.b domain, String vin, byte[] sourcePublicKey);

    void h(boolean fetching, String vin, byte[] sourcePublicKey, sc0.b domain, q transport);

    boolean i(String vin, byte[] sourcePublicKey, sc0.b domain, q transport, String ownerCommandId);

    void j(boolean inFlight, String vin, byte[] sourcePublicKey, sc0.b domain, q transport, String ownerCommandId);

    boolean l(sc0.b domain, byte[] sourcePublicKey, String vin);
}
