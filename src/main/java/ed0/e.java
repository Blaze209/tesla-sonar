package ed0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.crypto.InvalidVehiclePublicKeyException;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import com.tesla.sessionmanager.VehicleSessionInfo;
import fc0.u5;
import gc0.v;
import ie0.t;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import jn0.x;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import rc0.f;
import rc0.m;
import rc0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Led0/e;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "", "value", "a", "(I[B)[B", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbe0/e;", "getVehicleData", "sourcePublicKey", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "sessionInfoResponse", "", "vin", "Led0/e$a;", "b", "(Landroid/content/Context;Lbe0/e;[BLcom/tesla/messagedecoding/RoutableMessageDecoder$a;Ljava/lang/String;)Led0/e$a;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "getLogger", "()Lcom/tesla/logging/g;", "logger", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f62830a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("SessionInfoValidator");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Led0/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "SkippedForNotLocallySigned", "SkippedForFWUnsupported", "Failed", "Passed", "Error", "InvalidPublicKey", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        SkippedForNotLocallySigned,
        SkippedForFWUnsupported,
        Failed,
        Passed,
        Error,
        InvalidPublicKey;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    private e() {
    }

    private final byte[] a(int key, byte[] value) {
        return n.G(new byte[]{(byte) key, (byte) value.length}, value);
    }

    public final a b(Context context, be0.e getVehicleData, byte[] sourcePublicKey, RoutableMessageDecoder.SessionInfoResponse sessionInfoResponse, String vin) {
        k kVarC;
        s.k(context, "context");
        s.k(getVehicleData, "getVehicleData");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(sessionInfoResponse, "sessionInfoResponse");
        s.k(vin, "vin");
        u5 u5VarD = getVehicleData.d(vin);
        if (u5VarD != null && !vb0.c.c(u5VarD, v.MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST, null, 2, null)) {
            return a.SkippedForFWUnsupported;
        }
        VehicleSessionInfo sessionInfo = sessionInfoResponse.getSessionInfo();
        byte[] rawSessionInfoData = sessionInfoResponse.getRawSessionInfoData();
        m signatureData = sessionInfoResponse.getSignatureData();
        byte[] requestUUID = sessionInfoResponse.getRequestUUID();
        rb0.e eVar = rb0.e.f107486a;
        if (!Arrays.equals(eVar.d(context), sourcePublicKey)) {
            return a.SkippedForNotLocallySigned;
        }
        f session_info_tag = signatureData.getSession_info_tag();
        if (session_info_tag == null || (kVarC = session_info_tag.getTag()) == null) {
            return a.Error;
        }
        try {
            byte[] bArrF = eVar.f(context, sessionInfo.getPublicKeyHex(), "session validation for " + vin);
            t tVar = t.f77619a;
            Charset charset = p013kotlin.text.d.UTF_8;
            byte[] bytes = "session info".getBytes(charset);
            s.j(bytes, "getBytes(...)");
            byte[] bArrB = tVar.b(bArrF, bytes);
            byte[] bArrG = n.G(new byte[0], a(o.TAG_SIGNATURE_TYPE.getValue(), new byte[]{(byte) rc0.n.SIGNATURE_TYPE_HMAC.getValue()}));
            int value = o.TAG_PERSONALIZATION.getValue();
            byte[] bytes2 = vin.getBytes(charset);
            s.j(bytes2, "getBytes(...)");
            return Arrays.equals(tVar.b(bArrB, n.G(n.F(n.G(n.G(bArrG, a(value, bytes2)), a(o.TAG_CHALLENGE.getValue(), requestUUID)), (byte) o.TAG_END.getValue()), rawSessionInfoData)), kVarC.J()) ? a.Passed : a.Failed;
        } catch (InvalidVehiclePublicKeyException e11) {
            g gVar = logger;
            String str = "session info validation failed: invalid vehicle public key " + e11.getVehicleKeyHex();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return a.InvalidPublicKey;
        } catch (Exception e12) {
            logger.d("session info validation error", e12);
            return a.Error;
        }
    }
}
