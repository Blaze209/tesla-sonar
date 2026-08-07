package rb0;

import ie0.n;
import ie0.q0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhe0/b;", "", "vehiclePublicKeyHex", "vin", "Lcom/tesla/logging/g;", "logger", "Ljn0/h0;", "a", "(Lhe0/b;Ljava/lang/String;Ljava/lang/String;Lcom/tesla/logging/g;)V", "crypto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final void a(he0.b bVar, String vehiclePublicKeyHex, String vin, com.tesla.logging.g logger) {
        s.k(bVar, "<this>");
        s.k(vehiclePublicKeyHex, "vehiclePublicKeyHex");
        s.k(vin, "vin");
        s.k(logger, "logger");
        try {
            bVar.P(vin, q0.b(a.t(a.p(n.f(vehiclePublicKeyHex)))));
        } catch (Exception e11) {
            logger.d("Exception during vehicle public key persisting", e11);
        }
    }
}
