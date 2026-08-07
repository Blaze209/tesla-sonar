package t80;

import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt80/f;", "Lt80/b;", "Lr80/c;", "errorReporter", "<init>", "(Lr80/c;)V", "", "ephemPubkey", "Ljava/security/interfaces/ECPublicKey;", "b", "(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;", "Lorg/json/JSONObject;", "payloadJson", "Lt80/a;", "a", "(Lorg/json/JSONObject;)Lt80/a;", "Lr80/c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    public f(r80.c errorReporter) {
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    private final ECPublicKey b(Object ephemPubkey) throws ParseException {
        qz.b bVarV;
        if (ephemPubkey instanceof Map) {
            p013kotlin.jvm.internal.s.i(ephemPubkey, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            bVarV = qz.b.w((Map) ephemPubkey);
        } else {
            String string = ephemPubkey != null ? ephemPubkey.toString() : null;
            if (string == null) {
                string = "";
            }
            bVarV = qz.b.v(string);
        }
        ECPublicKey eCPublicKeyX = bVarV.x();
        p013kotlin.jvm.internal.s.j(eCPublicKeyX, "toECPublicKey(...)");
        return eCPublicKeyX;
    }

    @Override // t80.b
    public AcsData a(JSONObject payloadJson) {
        Object objB;
        p013kotlin.jvm.internal.s.k(payloadJson, "payloadJson");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Map<String, Object> mapM = yz.j.m(payloadJson.toString());
            p013kotlin.jvm.internal.s.j(mapM, "parse(...)");
            Map mapA = v0.A(mapM);
            objB = jn0.s.b(new AcsData(String.valueOf(mapA.get("acsURL")), b(mapA.get("acsEphemPubKey")), b(mapA.get("sdkEphemPubKey"))));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.errorReporter.Y0(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, thE));
        }
        jn0.t.b(objB);
        return (AcsData) objB;
    }
}
