package fd0;

import android.content.Context;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lfd0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lce0/j;", "request", "", "vin", "Lsc0/h;", "routableMessage", "Lsc0/b;", "domain", "", "requestTag", "vehicleKeyHex", "a", "(Landroid/content/Context;Lce0/j;Ljava/lang/String;Lsc0/h;Lsc0/b;[BLjava/lang/String;)[B", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "c", "Ljavax/crypto/Cipher;", "cipher", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f65687a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("AesGcmResponseDecrypter");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

    private a() {
    }

    public final byte[] a(Context context, TeslaCommandRequest request, String vin, sc0.h routableMessage, sc0.b domain, byte[] requestTag, String vehicleKeyHex) {
        s.k(context, "context");
        s.k(vin, "vin");
        s.k(routableMessage, "routableMessage");
        s.k(domain, "domain");
        s.k(requestTag, "requestTag");
        s.k(vehicleKeyHex, "vehicleKeyHex");
        rc0.m signature_data = routableMessage.getSignature_data();
        rc0.c aES_GCM_Response_data = signature_data != null ? signature_data.getAES_GCM_Response_data() : null;
        if (aES_GCM_Response_data == null) {
            logger.a("AES GCM Response signature data is null, nothing to decrypt!");
            return null;
        }
        okio.k protobuf_message_as_bytes = routableMessage.getProtobuf_message_as_bytes();
        if (protobuf_message_as_bytes == null) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Null response, nothing to decrypt!");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
        if (protobuf_message_as_bytes.D() == 0) {
            logger.j("Empty response, nothing to decrypt!");
            return null;
        }
        try {
            byte[] bArrE = gd0.d.f68771a.e(request, vin, routableMessage, requestTag, aES_GCM_Response_data.getCounter(), domain).e();
            okio.k nonce = aES_GCM_Response_data.getNonce();
            okio.k tag2 = aES_GCM_Response_data.getTag();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrE);
            byte[] bArrDigest = messageDigest.digest();
            try {
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, nonce.J());
                Key keyB = rb0.e.f107486a.b(context, vehicleKeyHex, "decryptResponse");
                Cipher cipher2 = cipher;
                cipher2.init(2, keyB, gCMParameterSpec);
                cipher2.updateAAD(bArrDigest);
                byte[] bArrDoFinal = cipher2.doFinal(p013kotlin.collections.n.G(protobuf_message_as_bytes.J(), tag2.J()));
                s.h(bArrDoFinal);
                de0.a.f(request, "decrypted: '" + ie0.n.e(bArrDoFinal, 0, 1, null) + "'", logger, com.tesla.logging.d.DEBUG, false, 8, null);
                return bArrDoFinal;
            } catch (Exception e11) {
                com.tesla.logging.g gVar2 = logger;
                gVar2.d("Failed to decrypt response", e11);
                gVar2.j(de0.a.b(request) + " Failed to decrypt response!");
                return null;
            }
        } catch (Exception e12) {
            logger.d("Error building response decryption metadata", e12);
            return null;
        }
    }
}
