package gb0;

import android.content.Context;
import be0.e;
import ce0.TeslaCommandRequest;
import ce0.h;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.features.FeaturesConfig;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.messagedecoding.CommandMessageDecoder;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import ed0.c;
import fb0.o;
import ic0.q;
import ie0.m0;
import ie0.v;
import java.util.Map;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Led0/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "decodeResult", "Lee0/a;", "sessionInfoManager", "Lce0/h;", "requestManager", "Lbe0/e;", "getVehicleData", "Led0/a;", "jsBridgeEventSender", "", "vin", "Lce0/j;", "request", "Lic0/q;", "transport", "Lfb0/o;", "tokenManager", "Lmb0/a;", "dispatcher", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Led0/c$b;", "a", "(Led0/c;Landroid/content/Context;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;Lee0/a;Lce0/h;Lbe0/e;Led0/a;Ljava/lang/String;Lce0/j;Lic0/q;Lfb0/o;Lmb0/a;Lcom/tesla/features/FeaturesConfig;)Led0/c$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Ljn0/h0;", "c", "(Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;Ljava/lang/String;)V", "command_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final c.MessageEvaluationResult a(c cVar, Context context, CommandMessageDecoder.Result decodeResult, ee0.a sessionInfoManager, h requestManager, e getVehicleData, ed0.a jsBridgeEventSender, String str, TeslaCommandRequest teslaCommandRequest, q transport, o tokenManager, mb0.a dispatcher, FeaturesConfig featuresConfig) {
        s.k(cVar, "<this>");
        s.k(context, "context");
        s.k(decodeResult, "decodeResult");
        s.k(sessionInfoManager, "sessionInfoManager");
        s.k(requestManager, "requestManager");
        s.k(getVehicleData, "getVehicleData");
        s.k(jsBridgeEventSender, "jsBridgeEventSender");
        s.k(transport, "transport");
        s.k(tokenManager, "tokenManager");
        s.k(dispatcher, "dispatcher");
        s.k(featuresConfig, "featuresConfig");
        ic0.h hVar = null;
        if (!s.f(decodeResult, CommandMessageDecoder.Result.e.f56413a) && !s.f(decodeResult, CommandMessageDecoder.Result.a.f56397a)) {
            if (decodeResult instanceof CommandMessageDecoder.Result.b.f) {
                cVar.e().d("exception was thrown while decoding command message", ((CommandMessageDecoder.Result.b.f) decodeResult).getException());
                hVar = ic0.h.RESULT_INTERNAL_ERROR;
            } else if ((decodeResult instanceof CommandMessageDecoder.Result.b.h) || (decodeResult instanceof CommandMessageDecoder.Result.b.j) || (decodeResult instanceof CommandMessageDecoder.Result.b.k) || (decodeResult instanceof CommandMessageDecoder.Result.b.i)) {
                b(cVar, decodeResult);
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.a.f56398a)) {
                b(cVar, decodeResult);
                hVar = ic0.h.RESULT_APPLICATION_ERROR;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.C1132b.f56399a)) {
                b(cVar, decodeResult);
                hVar = ic0.h.RESULT_HERMES_INTERNAL_ERROR;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.c.f56400a)) {
                b(cVar, decodeResult);
                hVar = ic0.h.RESULT_INVALID_MESSAGE_ERROR;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.g.f56404a)) {
                b(cVar, decodeResult);
                hVar = ic0.h.RESULT_TOO_MANY_REQUESTS;
            } else if (decodeResult instanceof CommandMessageDecoder.Result.f) {
                JSONObject iceConfig = ((CommandMessageDecoder.Result.f) decodeResult).getIceConfig();
                if (iceConfig != null) {
                    String string = iceConfig.toString();
                    s.j(string, "toString(...)");
                    cVar.e().j("sending ice config over JsBridge");
                    com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.CAR_API_ICE_CONFIG, v.b(iceConfig));
                    qb0.a.INSTANCE.b().P(string);
                    if (cVar.f() != null) {
                        m0 m0VarF = cVar.f();
                        s.h(m0VarF);
                        m0VarF.a(string);
                    } else {
                        g gVarE = cVar.e();
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVarE.getTag();
                        String strG = gVarE.g("[DCV_WebRTC] failed to send webrtc iceConfig since webrtcHelper is null");
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
                }
                hVar = ic0.h.RESULT_SUCCESS;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.e.f56402a)) {
                cVar.e().j("Vehicle token invalid!");
                if (str == null) {
                    g gVarE2 = cVar.e();
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String tag2 = gVarE2.getTag();
                    String strG2 = gVarE2.g("VIN null, can't reset vehicle token");
                    zb0.a aVar2 = zb0.a.f128044a;
                    Map mapF2 = v0.f(x.a(tag2, strG2));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : mapF2.entrySet()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(strG2));
                    TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                    vr0.a.INSTANCE.a(strG2, new Object[0]);
                } else {
                    tokenManager.a(str);
                }
                hVar = ic0.h.RESULT_TOKEN_ERROR;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.d.f56401a)) {
                cVar.e().j("User token invalid!");
                tokenManager.b();
                hVar = ic0.h.RESULT_TOKEN_ERROR;
            } else if (s.f(decodeResult, CommandMessageDecoder.Result.b.l.f56409a)) {
                cVar.e().j("Vehicle not connected");
                if (str == null) {
                    g gVarE3 = cVar.e();
                    TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                    String tag3 = gVarE3.getTag();
                    String strG3 = gVarE3.g("VIN is null for vehicle not connected evaluation");
                    zb0.a aVar3 = zb0.a.f128044a;
                    Map mapF3 = v0.f(x.a(tag3, strG3));
                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry3 : mapF3.entrySet()) {
                        zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    firebaseCrashlytics3.recordException(new Exception(strG3));
                    TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                    vr0.a.INSTANCE.a(strG3, new Object[0]);
                } else {
                    kb0.g.f85866a.z(str, kb0.g.c.OFFLINE);
                }
                hVar = ic0.h.RESULT_VEHICLE_NOT_CONNECTED;
            } else if (!s.f(decodeResult, CommandMessageDecoder.Result.c.f56410a)) {
                if (!(decodeResult instanceof CommandMessageDecoder.Result.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                CommandMessageDecoder.Result.d dVar = (CommandMessageDecoder.Result.d) decodeResult;
                c(dVar.getResult(), str);
                return c.f62814a.c(context, dVar.getResult(), dVar.getRoutableMessage(), sessionInfoManager, getVehicleData, jsBridgeEventSender, requestManager, str, teslaCommandRequest, transport, dispatcher, featuresConfig);
            }
        }
        return new c.MessageEvaluationResult(hVar, "", null, null, null, null, 60, null);
    }

    private static final void b(c cVar, CommandMessageDecoder.Result result) {
        g gVarE = cVar.e();
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVarE.getTag();
        String strG = gVarE.g("evaluated result: `" + result + "`");
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

    public static final void c(RoutableMessageDecoder.Result decodeResult, String str) {
        s.k(decodeResult, "decodeResult");
        if (!(decodeResult instanceof RoutableMessageDecoder.Result.b.VehicleData) || str == null) {
            return;
        }
        kb0.g.f85866a.z(str, kb0.g.c.ONLINE);
    }
}
