package ed0;

import android.content.Context;
import android.util.Base64;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.plaid.internal.EnumC4419g;
import com.tesla.features.FeaturesConfig;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import com.tesla.oapi.CommandActionExtensionsKt;
import com.tesla.sessionmanager.VehicleSessionInfo;
import fd0.l;
import ic0.f;
import ic0.h;
import ic0.o;
import ic0.q;
import id0.StreamMessageInfo;
import ie0.m0;
import ie0.n;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import rb0.i;
import rc0.k;
import rc0.m;
import vc0.o3;
import vc0.p3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\r<PB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJy\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J¥\u0001\u00104\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b4\u00105Jq\u0010<\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u00106\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b<\u0010=R\u0017\u0010B\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR$\u0010I\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020(0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020(0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020(0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010L¨\u0006Q"}, d2 = {"Led0/c;", "", "<init>", "()V", "Lsc0/b;", "domain", "", "vin", "Lee0/a;", "sessionInfoManager", "", "sourcePublicKey", "Ljn0/h0;", "b", "(Lsc0/b;Ljava/lang/String;Lee0/a;[B)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "callingContext", "Lbe0/e;", "getVehicleData", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "sessionInfoResponse", "Lce0/j;", "request", "Lic0/q;", "transport", "Lsc0/d;", "fault", "Lsc0/h;", "routable", "Lmb0/a;", "dispatcher", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "decodeResult", "Led0/c$c;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/String;Lbe0/e;Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;Lce0/j;Ljava/lang/String;Lee0/a;Lic0/q;Lsc0/d;Lsc0/h;Lmb0/a;Lcom/tesla/features/FeaturesConfig;Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;)Led0/c$c;", "appContext", "Led0/e$a;", "result", "newValidationResult", "commandName", "Lud0/a;", "remoteLog", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "oldSessionInfo", "Lrc0/k;", "newSessionInfo", "Led0/c$a;", "failureType", "g", "(Landroid/content/Context;Ljava/lang/String;Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;Led0/e$a;Led0/e$a;Lic0/q;Lsc0/d;Ljava/lang/String;Ljava/lang/String;Lud0/a;Lsc0/h;Lcom/tesla/sessionmanager/VehicleSessionInfo;Lrc0/k;Lce0/j;Led0/c$a;Lsc0/b;Lcom/tesla/features/FeaturesConfig;)V", "routableMessage", "Led0/a;", "jsBridgeEventSender", "Lce0/h;", "requestManager", "Led0/c$b;", "c", "(Landroid/content/Context;Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;Lsc0/h;Lee0/a;Lbe0/e;Led0/a;Lce0/h;Ljava/lang/String;Lce0/j;Lic0/q;Lmb0/a;Lcom/tesla/features/FeaturesConfig;)Led0/c$b;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "e", "()Lcom/tesla/logging/g;", "logger", "Lie0/m0;", "Lie0/m0;", "f", "()Lie0/m0;", "h", "(Lie0/m0;)V", "webrtcHelper", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "STRICT_TRUSTED_VALIDATION_RESULTS", "FALLBACK_TRUSTED_VALIDATION_RESULTS", "REPORTABLE_RESULTS", "a", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f62814a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("MessageEvaluator");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static m0 webrtcHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Set<e.a> STRICT_TRUSTED_VALIDATION_RESULTS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Set<e.a> FALLBACK_TRUSTED_VALIDATION_RESULTS;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final Set<e.a> REPORTABLE_RESULTS;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Led0/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "FETCHED_SESSION_INFO_VALIDATION_FAILURE", "FETCHED_SESSION_INFO_HANDLE_UNCHANGED", "FETCHED_SESSION_INFO_HANDLE_CHANGED", "FETCHED_SESSION_INFO_NEVER_RECEIVED_SIGNATURE", "FETCHED_SESSION_INFO_INVALID_PUBLIC_KEY", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        FETCHED_SESSION_INFO_VALIDATION_FAILURE,
        FETCHED_SESSION_INFO_HANDLE_UNCHANGED,
        FETCHED_SESSION_INFO_HANDLE_CHANGED,
        FETCHED_SESSION_INFO_NEVER_RECEIVED_SIGNATURE,
        FETCHED_SESSION_INFO_INVALID_PUBLIC_KEY;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: ed0.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Led0/c$c;", "", "Lic0/h;", "commandResult", "", "response", "<init>", "(Lic0/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lic0/h;", "()Lic0/h;", "b", "Ljava/lang/String;", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class SessionInfoHandlerResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h commandResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String response;

        public SessionInfoHandlerResult(h commandResult, String str) {
            s.k(commandResult, "commandResult");
            this.commandResult = commandResult;
            this.response = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getCommandResult() {
            return this.commandResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionInfoHandlerResult)) {
                return false;
            }
            SessionInfoHandlerResult sessionInfoHandlerResult = (SessionInfoHandlerResult) other;
            return this.commandResult == sessionInfoHandlerResult.commandResult && s.f(this.response, sessionInfoHandlerResult.response);
        }

        public int hashCode() {
            int iHashCode = this.commandResult.hashCode() * 31;
            String str = this.response;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SessionInfoHandlerResult(commandResult=" + this.commandResult + ", response=" + this.response + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62828a;

        static {
            int[] iArr = new int[o3.values().length];
            try {
                iArr[o3.WHITELISTOPERATION_INFORMATION_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f62828a = iArr;
        }
    }

    static {
        e.a aVar = e.a.Error;
        e.a aVar2 = e.a.Passed;
        e.a aVar3 = e.a.SkippedForFWUnsupported;
        e.a aVar4 = e.a.SkippedForNotLocallySigned;
        STRICT_TRUSTED_VALIDATION_RESULTS = d1.i(aVar, aVar2, aVar3, aVar4);
        e.a aVar5 = e.a.Failed;
        FALLBACK_TRUSTED_VALIDATION_RESULTS = d1.i(aVar, aVar5, aVar2, aVar3, aVar4);
        REPORTABLE_RESULTS = d1.i(aVar, aVar5, e.a.InvalidPublicKey);
    }

    private c() {
    }

    private final void b(sc0.b domain, String vin, ee0.a sessionInfoManager, byte[] sourcePublicKey) {
        logger.j("clearing session info " + domain + " " + vin);
        sessionInfoManager.b(domain, sourcePublicKey, vin);
    }

    private static final void d(String str, RoutableMessageDecoder.Result result) {
        if (str == null) {
            g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("vin is null for result: `" + result + "`");
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

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    private final void g(Context appContext, String vin, RoutableMessageDecoder.SessionInfoResponse sessionInfoResponse, e.a result, e.a newValidationResult, q transport, sc0.d fault, String context, String commandName, ud0.a remoteLog, sc0.h routable, VehicleSessionInfo oldSessionInfo, k newSessionInfo, TeslaCommandRequest request, a failureType, sc0.b domain, FeaturesConfig featuresConfig) {
        String lowerCase;
        String lowerCase2;
        String strI;
        String strA;
        String commandCenterName;
        String strName;
        ic0.e request2;
        ic0.c action;
        ic0.e request3;
        String strName2;
        String strName3;
        if (v.g0(REPORTABLE_RESULTS, result)) {
            String str = Address.ADDRESS_NULL_PLACEHOLDER;
            if (fault == null || (strName3 = fault.name()) == null) {
                lowerCase = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                lowerCase = strName3.toLowerCase(Locale.ROOT);
                s.j(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    lowerCase = Address.ADDRESS_NULL_PLACEHOLDER;
                }
            }
            if (result == null || (strName2 = result.name()) == null) {
                lowerCase2 = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                lowerCase2 = strName2.toLowerCase(Locale.ROOT);
                s.j(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null) {
                    lowerCase2 = Address.ADDRESS_NULL_PLACEHOLDER;
                }
            }
            String str2 = commandName == null ? "unknown" : commandName;
            logger.j("[" + context + "] session info validation result: " + result + ".name, domain: " + domain.name() + ", transport: " + transport.name() + " fault: " + lowerCase + ", commandName: " + str2);
            routable.getSignature_data();
            TeslaCommandRequest dependentCommand = request.getDependentCommand();
            if (dependentCommand == null || (strI = dependentCommand.I()) == null) {
                strI = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            TeslaCommandRequest dependentCommand2 = request.getDependentCommand();
            if (dependentCommand2 == null || (request3 = dependentCommand2.getRequest()) == null || (strA = de0.b.a(request3)) == null) {
                strA = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            TeslaCommandRequest dependentCommand3 = request.getDependentCommand();
            if (dependentCommand3 == null || (request2 = dependentCommand3.getRequest()) == null || (action = request2.getAction()) == null || (commandCenterName = CommandActionExtensionsKt.getCommandCenterName(action)) == null) {
                commandCenterName = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            if (newValidationResult != null && (strName = newValidationResult.name()) != null) {
                String lowerCase3 = strName.toLowerCase(Locale.ROOT);
                s.j(lowerCase3, "toLowerCase(...)");
                if (lowerCase3 != null) {
                    str = lowerCase3;
                }
            }
            ud0.a.b(v0.o(x.a("type", "mobile-app-session-info-validation-result"), x.a("version", "14"), x.a("result", lowerCase2), x.a("new_session_info_validation_result", str), x.a(CoreConstants.CONTEXT_SCOPE_VALUE, context), x.a("transport", lb0.a.c(transport)), x.a("domain", lb0.a.e(domain)), x.a("command_name", str2), x.a("fault", lowerCase), x.a("failure_type", failureType.name()), x.a("nominal", Boolean.valueOf(failureType == a.FETCHED_SESSION_INFO_HANDLE_CHANGED || failureType == a.FETCHED_SESSION_INFO_NEVER_RECEIVED_SIGNATURE)), x.a("refetched_session_info_for_new_signature", Boolean.valueOf(request.getRefetchedSessionInfoForNewSignature().get())), x.a("nominal_retry_count", Integer.valueOf(request.getNominalRetryCount().get())), x.a("request_txid", request.I()), x.a("request_command_id", de0.b.a(request.getRequest())), x.a("dependent_command_txid", strI), x.a("dependent_command_id", strA), x.a("dependent_command_name", commandCenterName), x.a("feature_flag_enabled", Boolean.valueOf(featuresConfig.getSessionInfoValidation().getEnabled())), x.a("feature_flag_min_version", Integer.valueOf(featuresConfig.getSessionInfoValidation().getMinVersion())), x.a("feature_flag_local_version", 3), x.a("feature_flag_enabled_and_meets_version_threshold", Boolean.valueOf(featuresConfig.getSessionInfoValidation().getEnabledAndMeetsVersionThreshold()))), false, null, 4, null);
        }
    }

    private final SessionInfoHandlerResult i(final Context context, final String callingContext, final be0.e getVehicleData, final RoutableMessageDecoder.SessionInfoResponse sessionInfoResponse, final TeslaCommandRequest request, final String vin, ee0.a sessionInfoManager, final q transport, final sc0.d fault, final sc0.h routable, mb0.a dispatcher, final FeaturesConfig featuresConfig, RoutableMessageDecoder.Result decodeResult) {
        sc0.d dVar;
        final byte[] bArr;
        final VehicleSessionInfo sessionInfo = sessionInfoResponse.getSessionInfo();
        sc0.b domain = sessionInfoResponse.getDomain();
        byte[] sourcePublicKey = request.getSourcePublicKey();
        if (domain == sc0.b.DOMAIN_VEHICLE_SECURITY) {
            he0.b bVarM = he0.b.m(context);
            s.j(bVarM, "getInstance(...)");
            i.a(bVarM, sessionInfo.getPublicKeyHex(), vin, logger);
        }
        final e.a aVarB = e.f62830a.b(context, getVehicleData, sourcePublicKey, sessionInfoResponse, vin);
        g gVar = logger;
        de0.a.f(request, "session info validation result '" + aVarB + "'", gVar, null, false, 12, null);
        g gVar2 = gVar;
        if (aVarB == e.a.InvalidPublicKey) {
            de0.a.f(request, "clearing session info due to invalid vehicle public key", gVar2, null, false, 12, null);
            g(context, vin, sessionInfoResponse, aVarB, null, transport, fault, callingContext, request.o(), ud0.a.f116153a, routable, sessionInfo, null, request, a.FETCHED_SESSION_INFO_INVALID_PUBLIC_KEY, domain, featuresConfig);
            b(domain, vin, sessionInfoManager, sourcePublicKey);
            return new SessionInfoHandlerResult(h.RESULT_INVALID_VEHICLE_PUBLIC_KEY, null);
        }
        final sc0.b bVar = domain;
        String str = vin;
        o tesla_proto_SessionInfoRequest = request.l().getTesla_proto_SessionInfoRequest();
        boolean z11 = false;
        if (tesla_proto_SessionInfoRequest != null && tesla_proto_SessionInfoRequest.getSkipValidationVerification()) {
            z11 = true;
        }
        if (aVarB != e.a.Failed) {
            dVar = fault;
            bArr = sourcePublicKey;
        } else if (z11) {
            de0.a.f(request, "session info fetched to verify failed validation, this is very unexpected!", gVar2, null, false, 12, null);
            dVar = fault;
            g(context, str, sessionInfoResponse, aVarB, null, transport, dVar, callingContext, request.o(), ud0.a.f116153a, routable, sessionInfo, null, request, a.FETCHED_SESSION_INFO_VALIDATION_FAILURE, bVar, featuresConfig);
            str = vin;
            aVarB = aVarB;
            bVar = bVar;
            gVar2 = gVar2;
            bArr = sourcePublicKey;
        } else {
            de0.a.f(request, "fetching session info due to validation failure", gVar2, null, false, 12, null);
            ic0.e eVarA = l.f65728a.a(vin, bVar, f.SOURCE_APP_NATIVE, true, true, "session_info_validation_failure");
            bVar = bVar;
            bArr = sourcePublicKey;
            ce0.d dVar2 = new ce0.d() { // from class: ed0.b
                @Override // ce0.d
                public final void a(ic0.g gVar3) {
                    c.j(context, getVehicleData, bArr, bVar, vin, request, sessionInfo, sessionInfoResponse, aVarB, transport, fault, callingContext, routable, featuresConfig, gVar3);
                }
            };
            str = vin;
            sessionInfo = sessionInfo;
            dVar = fault;
            dispatcher.a(eVarA, dVar2);
        }
        if (!featuresConfig.getSessionInfoValidation().getEnabledAndMeetsVersionThreshold() && v.g0(d1.i(sc0.d.MESSAGEFAULT_ERROR_INVALID_SIGNATURE, sc0.d.MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE), dVar)) {
            de0.a.f(request, "clearing session info because of fault " + dVar + " and session info validation feature flag is off", gVar2, null, false, 12, null);
            b(bVar, str, sessionInfoManager, bArr);
            return new SessionInfoHandlerResult(h.RESULT_SESSION_INFO_VALIDATION_FAILURE, null);
        }
        if ((featuresConfig.getSessionInfoValidation().getEnabledAndMeetsVersionThreshold() ? STRICT_TRUSTED_VALIDATION_RESULTS : FALLBACK_TRUSTED_VALIDATION_RESULTS).contains(aVarB)) {
            de0.a.f(request, "session info validation result " + aVarB + " is in trusted results!", gVar2, null, false, 12, null);
            ee0.a.b.a(sessionInfoManager, sessionInfo, str, bArr, request.I(), false, 16, null);
            return new SessionInfoHandlerResult(decodeResult instanceof RoutableMessageDecoder.Result.a.b ? h.RESULT_SESSION_INFO_RECOVERED : h.RESULT_SUCCESS, Base64.encodeToString(new k(sessionInfo.getCounter(), n.g(sessionInfo.getPublicKeyHex()), n.g(sessionInfo.getEpochHex()), sessionInfo.getClockTime(), null, sessionInfo.getHandle(), 0, null, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, null).encode(), 2));
        }
        de0.a.f(request, "clearing session info validation due to session info validation result '" + aVarB + "'", gVar2, null, false, 12, null);
        b(bVar, str, sessionInfoManager, request.getSourcePublicKey());
        return new SessionInfoHandlerResult(h.RESULT_SESSION_INFO_VALIDATION_FAILURE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Context context, be0.e eVar, byte[] bArr, sc0.b bVar, String str, TeslaCommandRequest teslaCommandRequest, VehicleSessionInfo vehicleSessionInfo, RoutableMessageDecoder.SessionInfoResponse sessionInfoResponse, e.a aVar, q qVar, sc0.d dVar, String str2, sc0.h hVar, FeaturesConfig featuresConfig, ic0.g response) {
        s.k(response, "response");
        if (response.getResult() != h.RESULT_SUCCESS) {
            de0.a.f(teslaCommandRequest, "failed to fetch session info for validation purposes", logger, null, false, 12, null);
            return;
        }
        try {
            k kVarDecode = k.f107686i.decode(n.a(response.getResponse()));
            String routableSignatureDataBase64 = response.getRoutableSignatureDataBase64();
            e.a aVarB = null;
            m mVarDecode = routableSignatureDataBase64 != null ? m.f107695j.decode(n.a(routableSignatureDataBase64)) : null;
            if (mVarDecode != null) {
                aVarB = e.f62830a.b(context, eVar, bArr, new RoutableMessageDecoder.SessionInfoResponse(VehicleSessionInfo.INSTANCE.a(kVarDecode, bVar, response.getRequestId()), n.a(response.getResponse()), mVarDecode, new byte[1], bVar), str);
                de0.a.f(teslaCommandRequest, "new session info validation result: " + aVarB, logger, null, false, 12, null);
            }
            e.a aVar2 = aVarB;
            if (kVarDecode.getHandle() == vehicleSessionInfo.getHandle()) {
                de0.a.f(teslaCommandRequest, "session info fetched, handles unchanged! this is unexpected. reporting...", logger, null, false, 12, null);
                f62814a.g(context, str, sessionInfoResponse, aVar, aVar2, qVar, dVar, str2, teslaCommandRequest.o(), ud0.a.f116153a, hVar, vehicleSessionInfo, kVarDecode, teslaCommandRequest, a.FETCHED_SESSION_INFO_HANDLE_UNCHANGED, bVar, featuresConfig);
            } else {
                de0.a.f(teslaCommandRequest, "session info fetched, handles changed! this is expected.", logger, null, false, 12, null);
                f62814a.g(context, str, sessionInfoResponse, aVar, aVar2, qVar, dVar, str2, teslaCommandRequest.o(), ud0.a.f116153a, hVar, vehicleSessionInfo, kVarDecode, teslaCommandRequest, a.FETCHED_SESSION_INFO_HANDLE_CHANGED, bVar, featuresConfig);
            }
        } catch (Exception e11) {
            logger.d("error decoding and processing fetched session info", e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessageEvaluationResult c(Context context, RoutableMessageDecoder.Result decodeResult, sc0.h routableMessage, ee0.a sessionInfoManager, be0.e getVehicleData, ed0.a jsBridgeEventSender, ce0.h requestManager, String vin, TeslaCommandRequest request, q transport, mb0.a dispatcher, FeaturesConfig featuresConfig) throws JSONException {
        RoutableMessageDecoder.Result result;
        h commandResult;
        h commandResult2;
        Object obj;
        Object error;
        Object obj2;
        String strT;
        h hVar;
        p3 whitelistOperationStatus;
        String strT2;
        String strT3;
        AtomicBoolean refetchedSessionInfoForNewSignature;
        String vin2 = vin;
        s.k(context, "context");
        s.k(decodeResult, "decodeResult");
        s.k(routableMessage, "routableMessage");
        s.k(sessionInfoManager, "sessionInfoManager");
        s.k(getVehicleData, "getVehicleData");
        s.k(jsBridgeEventSender, "jsBridgeEventSender");
        s.k(requestManager, "requestManager");
        s.k(transport, "transport");
        s.k(dispatcher, "dispatcher");
        s.k(featuresConfig, "featuresConfig");
        if (request != null) {
            request.I0(routableMessage.getSignature_data());
            h0 h0Var = h0.f84049a;
        }
        String strA = "";
        if (!(decodeResult instanceof RoutableMessageDecoder.Result.a.r)) {
            result = decodeResult;
            if (result instanceof RoutableMessageDecoder.Result.a.b) {
                logger.j("incorrect epoch information, replacing session info");
                RoutableMessageDecoder.Result.a.b bVar = (RoutableMessageDecoder.Result.a.b) result;
                RoutableMessageDecoder.SessionInfoResponse response = bVar.getResponse();
                if (vin2 == null) {
                    String requestId = response.f().getRequestId();
                    strT2 = requestId != null ? ((ce0.l) requestManager).t(requestId) : null;
                } else {
                    strT2 = vin2;
                }
                if (strT2 == null || request == null) {
                    d(vin2, result);
                    commandResult = h.RESULT_SESSION_INFO_VALIDATION_FAILURE;
                } else {
                    SessionInfoHandlerResult sessionInfoHandlerResultI = i(context, "badSessionInfo", getVehicleData, response, request, strT2, sessionInfoManager, transport, bVar.getFault(), routableMessage, dispatcher, featuresConfig, result);
                    String response2 = sessionInfoHandlerResultI.getResponse();
                    strA = response2 != null ? response2 : "";
                    commandResult = sessionInfoHandlerResultI.getCommandResult();
                }
            } else {
                if (result instanceof RoutableMessageDecoder.Result.a.c) {
                    sc0.b domain = ((RoutableMessageDecoder.Result.a.c) result).getDomain();
                    if (request == null) {
                        g gVar = logger;
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVar.getTag();
                        String strG = gVar.g("request is null");
                        zb0.a aVar = zb0.a.f128044a;
                        Map mapF = v0.f(x.a(tag, strG));
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry : mapF.entrySet()) {
                            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        firebaseCrashlytics.recordException(new Exception(strG));
                        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                        vr0.a.INSTANCE.a(strG, new Object[0]);
                        throw new RuntimeException("request is null");
                    }
                    commandResult = null;
                    d(vin2, result);
                    if (vin2 != null) {
                        b(domain, vin2, sessionInfoManager, request.getSourcePublicKey());
                    }
                    hVar = h.RESULT_INCORRECT_SESSION_INFO_ERROR;
                } else {
                    commandResult = null;
                    if (result instanceof RoutableMessageDecoder.Result.a.k) {
                        logger.j("not on whitelist");
                        sc0.b domain2 = ((RoutableMessageDecoder.Result.a.k) result).getDomain();
                        if (vin2 != null && request != null) {
                            b(domain2, vin2, sessionInfoManager, request.getSourcePublicKey());
                        }
                        hVar = h.RESULT_NOT_IN_WHITELIST;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.h) {
                        if (request == null) {
                            g gVar2 = logger;
                            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                            String tag2 = gVar2.getTag();
                            String strG2 = gVar2.g("request is null");
                            zb0.a aVar2 = zb0.a.f128044a;
                            Map mapF2 = v0.f(x.a(tag2, strG2));
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry2 : mapF2.entrySet()) {
                                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                            }
                            firebaseCrashlytics2.recordException(new Exception(strG2));
                            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                            vr0.a.INSTANCE.a(strG2, new Object[0]);
                            throw new RuntimeException("request is null");
                        }
                        sc0.b domain3 = ((RoutableMessageDecoder.Result.a.h) result).getDomain();
                        logger.j("invalid handle for " + domain3);
                        if (vin2 != null) {
                            b(domain3, vin2, sessionInfoManager, request.getSourcePublicKey());
                        }
                        hVar = h.RESULT_INVALID_HANDLE;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.s) {
                        Exception exception = ((RoutableMessageDecoder.Result.a.s) result).getException();
                        if (exception != null) {
                            logger.d("exception was thrown while processing routable message", exception);
                            h0 h0Var2 = h0.f84049a;
                        } else {
                            g gVar3 = logger;
                            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                            String tag3 = gVar3.getTag();
                            String strG3 = gVar3.g("exception was thrown while processing routable message");
                            zb0.a aVar3 = zb0.a.f128044a;
                            Map mapF3 = v0.f(x.a(tag3, strG3));
                            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry3 : mapF3.entrySet()) {
                                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                            }
                            firebaseCrashlytics3.recordException(new Exception(strG3));
                            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                            vr0.a.INSTANCE.a(strG3, new Object[0]);
                        }
                        hVar = h.RESULT_INTERNAL_ERROR;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.t) {
                        String message = ((RoutableMessageDecoder.Result.a.t) result).getMessage();
                        g gVar4 = logger;
                        TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                        String tag4 = gVar4.getTag();
                        String strG4 = gVar4.g(message);
                        zb0.a aVar4 = zb0.a.f128044a;
                        Map mapF4 = v0.f(x.a(tag4, strG4));
                        FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry4 : mapF4.entrySet()) {
                            zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                        }
                        firebaseCrashlytics4.recordException(new Exception(strG4));
                        TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                        vr0.a.INSTANCE.a(strG4, new Object[0]);
                        hVar = h.RESULT_INTERNAL_ERROR;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.e) {
                        String resultReason = ((RoutableMessageDecoder.Result.a.e) result).getResultReason();
                        logger.j("car server error result reason => " + resultReason);
                        obj2 = null;
                        commandResult = h.RESULT_CAR_SERVER_ERROR;
                        error = null;
                        obj = resultReason;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.j) {
                        String reason = ((RoutableMessageDecoder.Result.a.j) result).getReason();
                        logger.j(reason);
                        obj2 = reason;
                        obj = null;
                        commandResult = h.RESULT_NOMINAL_ERROR;
                        error = null;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.g) {
                        RoutableMessageDecoder.Result.a.g gVar5 = (RoutableMessageDecoder.Result.a.g) result;
                        error = gVar5.getError();
                        logger.j(gVar5.toString());
                        hVar = h.RESULT_NOMINAL_ERROR;
                        obj2 = null;
                        commandResult = hVar;
                        obj = obj2;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.w.f56442a)) {
                        hVar = h.RESULT_VEHICLE_WAIT_ERROR;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.d) {
                        hVar = h.RESULT_VEHICLE_BUSY_ERROR;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.v) {
                        hVar = h.RESULT_VEHICLE_TIMEOUT;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.x) {
                        hVar = h.RESULT_WHITELIST_FULL;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.f) {
                        hVar = h.RESULT_INSUFFICIENT_PRIVILEGES;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.u.f56440a)) {
                        hVar = h.RESULT_VEHICLE_INTERNAL_ERROR;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.l) {
                        hVar = h.RESULT_MOBILE_ACCESS_DISABLED;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.C1133a.f56419a)) {
                        hVar = h.RESULT_BAD_PARAMETER;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.o.f56434a)) {
                        hVar = h.RESULT_ERROR_REQUEST_MTU_EXCEEDED;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.n.f56433a)) {
                        hVar = h.RESULT_ERROR_RESPONSE_MTU_EXCEEDED;
                    } else if (s.f(result, RoutableMessageDecoder.Result.a.m.f56432a)) {
                        hVar = h.RESULT_MOBILE_ACCESS_DISABLED;
                    } else if (result instanceof RoutableMessageDecoder.Result.a.i) {
                        if (request != null) {
                            sc0.b bVarS = request.s();
                            if (vin2 == null) {
                                vin2 = request.getVin();
                            }
                            b(bVarS, vin2, sessionInfoManager, request.getSourcePublicKey());
                        }
                        hVar = h.RESULT_MISSING_SESSION_INFO_VALIDATION_DATA;
                    } else {
                        if (result instanceof RoutableMessageDecoder.Result.b) {
                            RoutableMessageDecoder.Result.b bVar2 = (RoutableMessageDecoder.Result.b) result;
                            if (bVar2 instanceof RoutableMessageDecoder.Result.b.PiiKeyResponse) {
                                logger.j("sending PII key response over JsBridge");
                                com.tesla.logging.a.EnumC1131a enumC1131a = com.tesla.logging.a.EnumC1131a.CAR_API_PII_KEY_RESPONSE;
                                JSONObject jSONObjectPut = new JSONObject().put("vin", vin2).put("protoMessage", ((RoutableMessageDecoder.Result.b.PiiKeyResponse) result).getProtoMessageBase64());
                                s.j(jSONObjectPut, "put(...)");
                                jsBridgeEventSender.b(enumC1131a, new ed0.d.JsonPayload(jSONObjectPut));
                                hVar = h.RESULT_SUCCESS;
                            } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.Ping) {
                                logger.j("sending ping over JsBridge");
                                com.tesla.logging.a.EnumC1131a enumC1131a2 = com.tesla.logging.a.EnumC1131a.CAR_API_VEHICLE_PING;
                                JSONObject jSONObjectPut2 = new JSONObject().put("vin", vin2).put("protoMessage", ((RoutableMessageDecoder.Result.b.Ping) result).getProtoMessageBase64());
                                s.j(jSONObjectPut2, "put(...)");
                                jsBridgeEventSender.b(enumC1131a2, new ed0.d.JsonPayload(jSONObjectPut2));
                                hVar = h.RESULT_SUCCESS;
                            } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.PseudonymSyncResponse) {
                                logger.j("Sending pseudonym response over JsBridge");
                                com.tesla.logging.a.EnumC1131a enumC1131a3 = com.tesla.logging.a.EnumC1131a.PSEUDONYM_SYNC;
                                JSONObject jSONObjectPut3 = new JSONObject().put("vin", vin2).put("pseudonym", ((RoutableMessageDecoder.Result.b.PseudonymSyncResponse) result).getPseudonymSyncResponse().getPseudonym());
                                s.j(jSONObjectPut3, "put(...)");
                                jsBridgeEventSender.b(enumC1131a3, new ed0.d.JsonPayload(jSONObjectPut3));
                                hVar = h.RESULT_SUCCESS;
                            } else if (!(bVar2 instanceof RoutableMessageDecoder.Result.b.CommandStatus)) {
                                if (bVar2 instanceof RoutableMessageDecoder.Result.b.c) {
                                    if (!ce0.c.h(request) && (request == null || !request.l0())) {
                                        hVar = h.RESULT_SUCCESS;
                                    }
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.SessionInfo) {
                                    RoutableMessageDecoder.SessionInfoResponse response3 = ((RoutableMessageDecoder.Result.b.SessionInfo) result).getResponse();
                                    if (vin2 == null) {
                                        String requestId2 = response3.f().getRequestId();
                                        strT = requestId2 != null ? ((ce0.l) requestManager).t(requestId2) : null;
                                    } else {
                                        strT = vin2;
                                    }
                                    if (request == null) {
                                        g gVar6 = logger;
                                        TeslaLog teslaLog5 = TeslaLog.INSTANCE;
                                        String tag5 = gVar6.getTag();
                                        String strG5 = gVar6.g("request is null");
                                        zb0.a aVar5 = zb0.a.f128044a;
                                        Map mapF5 = v0.f(x.a(tag5, strG5));
                                        FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
                                        for (Map.Entry entry5 : mapF5.entrySet()) {
                                            zb0.a.f128044a.a((String) entry5.getKey(), (String) entry5.getValue());
                                        }
                                        firebaseCrashlytics5.recordException(new Exception(strG5));
                                        TeslaLog.setTag$default(teslaLog5, tag5, false, 2, null);
                                        vr0.a.INSTANCE.a(strG5, new Object[0]);
                                        throw new RuntimeException("request is null");
                                    }
                                    if (strT != null) {
                                        SessionInfoHandlerResult sessionInfoHandlerResultI2 = i(context, "sessionInfo", getVehicleData, response3, request, strT, sessionInfoManager, transport, null, routableMessage, dispatcher, featuresConfig, result);
                                        String response4 = sessionInfoHandlerResultI2.getResponse();
                                        strA = response4 != null ? response4 : "";
                                        commandResult2 = sessionInfoHandlerResultI2.getCommandResult();
                                    } else {
                                        d(vin2, result);
                                        commandResult2 = h.RESULT_SESSION_INFO_VALIDATION_FAILURE;
                                    }
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.VehicleData) {
                                    if (vin2 == null) {
                                        d(vin2, result);
                                    } else {
                                        logger.j("sending vehicle data over JsBridge");
                                        String strE = ke0.h.e(ke0.h.g(((RoutableMessageDecoder.Result.b.VehicleData) result).getVehicleData(), vin2, transport == q.TRANSPORT_BLUETOOTH ? ke0.i.BLE_VEHICLE_DATA : ke0.i.HERMES_VEHICLE_DATA));
                                        com.tesla.logging.a.EnumC1131a enumC1131a4 = com.tesla.logging.a.EnumC1131a.PROTO_VEHICLE_DATA;
                                        JSONObject jSONObjectPut4 = new JSONObject().put("vin", vin2).put("protoMessage", strE).put("transport", transport.getValue());
                                        s.j(jSONObjectPut4, "put(...)");
                                        jsBridgeEventSender.b(enumC1131a4, new ed0.d.JsonPayload(jSONObjectPut4));
                                        strA = strE;
                                    }
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.NavigationRoute) {
                                    strA = ((RoutableMessageDecoder.Result.b.NavigationRoute) result).getProtoMessageBase64();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.VehicleDataSubscription) {
                                    logger.j("sending vehicle data subscription over JsBridge");
                                    com.tesla.logging.a.EnumC1131a enumC1131a5 = com.tesla.logging.a.EnumC1131a.CAR_API_VEHICLE_DATA_SUBSCRIPTION;
                                    JSONObject jSONObjectPut5 = new JSONObject().put("vin", vin2).put("protoMessage", ((RoutableMessageDecoder.Result.b.VehicleDataSubscription) result).getProtoMessageBase64());
                                    s.j(jSONObjectPut5, "put(...)");
                                    jsBridgeEventSender.b(enumC1131a5, new ed0.d.JsonPayload(jSONObjectPut5));
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.WhitelistInfo) {
                                    strA = ((RoutableMessageDecoder.Result.b.WhitelistInfo) result).getWhitelistInfo().encodeByteString().a();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.WhitelistEntryInfo) {
                                    strA = ((RoutableMessageDecoder.Result.b.WhitelistEntryInfo) result).getInfo().encodeByteString().a();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.KeysInfoResponse) {
                                    strA = ((RoutableMessageDecoder.Result.b.KeysInfoResponse) result).getKeysInfoResponse().encodeByteString().a();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.GetChargeOnSolarFeatureResponse) {
                                    strA = ((RoutableMessageDecoder.Result.b.GetChargeOnSolarFeatureResponse) result).getGetChargeOnSolarFeatureResponse().encodeByteString().a();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.GetManagedChargingSitesResponse) {
                                    strA = ((RoutableMessageDecoder.Result.b.GetManagedChargingSitesResponse) result).getGetManagedChargingSitesResponse().encodeByteString().a();
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.AddManagedChargingSiteResponse) {
                                    commandResult2 = ((RoutableMessageDecoder.Result.b.AddManagedChargingSiteResponse) result).getAddManagedChargingSiteResponse().getExisting_site_nearby() != null ? h.RESULT_BAD_PARAMETER : h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.EncryptedGetReaderKeyResponse) {
                                    if (request != null) {
                                        request.c("encrypted_result");
                                        h0 h0Var3 = h0.f84049a;
                                    }
                                    g gVar7 = logger;
                                    gVar7.j("Forwarding raw server encrypted routable message to RN as it is since we can't handle it");
                                    String strE2 = n.e(((RoutableMessageDecoder.Result.b.EncryptedGetReaderKeyResponse) result).getMessageData(), 0, 1, null);
                                    gVar7.a("Sending ble:vehicle_encrypted_message event " + v0.f(x.a("data", strE2)));
                                    com.tesla.logging.a.EnumC1131a enumC1131a6 = com.tesla.logging.a.EnumC1131a.BLE_VEHICLE_ENCRYPTED_MESSAGE;
                                    JSONObject jSONObjectPut6 = new JSONObject().put("data", strE2);
                                    s.j(jSONObjectPut6, "put(...)");
                                    jsBridgeEventSender.b(enumC1131a6, new ed0.d.JsonPayload(jSONObjectPut6));
                                    commandResult2 = h.RESULT_SUCCESS;
                                } else if (bVar2 instanceof RoutableMessageDecoder.Result.b.WebrtcResponse) {
                                    RoutableMessageDecoder.Result.b.WebrtcResponse webrtcResponse = (RoutableMessageDecoder.Result.b.WebrtcResponse) result;
                                    String strA2 = webrtcResponse.getWebrtcResponse().encodeByteString().a();
                                    byte[] bArrJ = webrtcResponse.getWebrtcResponse().getResponse_data().J();
                                    m0 m0Var = webrtcHelper;
                                    if (m0Var != null) {
                                        s.h(m0Var);
                                        if (vin2 == null) {
                                            vin2 = "";
                                        }
                                        m0Var.b(bArrJ, vin2);
                                    } else {
                                        g gVar8 = logger;
                                        TeslaLog teslaLog6 = TeslaLog.INSTANCE;
                                        String tag6 = gVar8.getTag();
                                        String strG6 = gVar8.g("[DCV_WebRTC] failed to send webrtc message since webrtcHelper is null");
                                        zb0.a aVar6 = zb0.a.f128044a;
                                        Map mapF6 = v0.f(x.a(tag6, strG6));
                                        FirebaseCrashlytics firebaseCrashlytics6 = FirebaseCrashlytics.getInstance();
                                        for (Map.Entry entry6 : mapF6.entrySet()) {
                                            zb0.a.f128044a.a((String) entry6.getKey(), (String) entry6.getValue());
                                        }
                                        firebaseCrashlytics6.recordException(new Exception(strG6));
                                        TeslaLog.setTag$default(teslaLog6, tag6, false, 2, null);
                                        vr0.a.INSTANCE.a(strG6, new Object[0]);
                                    }
                                    commandResult2 = h.RESULT_SUCCESS;
                                    strA = strA2;
                                } else {
                                    if (!(bVar2 instanceof RoutableMessageDecoder.Result.b.StreamMessageInfo)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    logger.j("sending streamMessage over JsBridge");
                                    StreamMessageInfo streamMessageInfo = ((RoutableMessageDecoder.Result.b.StreamMessageInfo) result).getStreamMessageInfo();
                                    jsBridgeEventSender.b(com.tesla.logging.a.EnumC1131a.CAR_API_STREAM_MESSAGE, new ed0.d.JsonPayload(streamMessageInfo.getData()));
                                    if (streamMessageInfo.getPongReceived()) {
                                        commandResult2 = h.RESULT_SUCCESS;
                                    }
                                }
                                obj = null;
                                error = null;
                                obj2 = null;
                            } else if (!ce0.c.h(request) || (whitelistOperationStatus = ((RoutableMessageDecoder.Result.b.CommandStatus) result).getStatus().getWhitelistOperationStatus()) == null) {
                                obj = null;
                                error = null;
                                obj2 = null;
                            } else if (d.f62828a[whitelistOperationStatus.getWhitelistOperationInformation().ordinal()] == 1) {
                                hVar = h.RESULT_SUCCESS;
                            } else {
                                strA = n.c(whitelistOperationStatus.encode(), 0, 1, null);
                                hVar = h.RESULT_WHITELIST_OPERATION_FAILURE;
                            }
                        } else if (s.f(result, RoutableMessageDecoder.Result.a.p.f56435a)) {
                            commandResult2 = h.RESULT_COMMAND_RESPONSE_REQUIRES_ENCRYPTION;
                        } else {
                            if (!s.f(result, RoutableMessageDecoder.Result.a.q.f56436a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            commandResult2 = h.RESULT_UNSUPPORTED_COMMAND;
                        }
                        obj = null;
                        error = null;
                        obj2 = null;
                        commandResult = commandResult2;
                    }
                }
                error = commandResult;
                obj2 = error;
                commandResult = hVar;
                obj = obj2;
            }
            return new MessageEvaluationResult(commandResult, strA, obj2, error, obj, result.getTelemetryData());
        }
        logger.j("session info is missing signature data");
        if (request != null && (refetchedSessionInfoForNewSignature = request.getRefetchedSessionInfoForNewSignature()) != null) {
            refetchedSessionInfoForNewSignature.set(true);
            h0 h0Var4 = h0.f84049a;
        }
        h hVar2 = h.RESULT_EMPTY_SESSION_INFO_SIGNATURE;
        if (request != null && !nb0.a.c(hVar2, transport, request).getRetry()) {
            RoutableMessageDecoder.Result.a.r rVar = (RoutableMessageDecoder.Result.a.r) decodeResult;
            RoutableMessageDecoder.SessionInfoResponse response5 = rVar.getResponse();
            VehicleSessionInfo sessionInfo = response5.getSessionInfo();
            sc0.b domain4 = response5.getDomain();
            if (vin2 == null) {
                String requestId3 = sessionInfo.getRequestId();
                strT3 = requestId3 != null ? ((ce0.l) requestManager).t(requestId3) : null;
            } else {
                strT3 = vin2;
            }
            g(context, strT3, rVar.getResponse(), null, null, transport, null, "sessionInfo", request.o(), ud0.a.f116153a, routableMessage, sessionInfo, null, request, a.FETCHED_SESSION_INFO_NEVER_RECEIVED_SIGNATURE, domain4, featuresConfig);
        }
        result = decodeResult;
        commandResult = hVar2;
        obj = null;
        error = null;
        obj2 = null;
        return new MessageEvaluationResult(commandResult, strA, obj2, error, obj, result.getTelemetryData());
    }

    public final g e() {
        return logger;
    }

    public final m0 f() {
        return webrtcHelper;
    }

    public final void h(m0 m0Var) {
        webrtcHelper = m0Var;
    }

    /* JADX INFO: renamed from: ed0.c$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b'\u0010\u0011R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Led0/c$b;", "", "Lic0/h;", "commandResult", "", "response", "nominalErrorReason", "Ljc0/a;", "genericNominalError", "carServerErrorResultReason", "", "telemetryData", "<init>", "(Lic0/h;Ljava/lang/String;Ljava/lang/String;Ljc0/a;Ljava/lang/String;Ljava/util/Map;)V", "a", "()Lic0/h;", "b", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "()Ljc0/a;", "e", "f", "()Ljava/util/Map;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lic0/h;", "h", "Ljava/lang/String;", "k", "j", "Ljc0/a;", IntegerTokenConverter.CONVERTER_KEY, "g", "Ljava/util/Map;", "getTelemetryData", "message-evaluator_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MessageEvaluationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h commandResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String response;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nominalErrorReason;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final jc0.a genericNominalError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carServerErrorResultReason;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> telemetryData;

        public MessageEvaluationResult(h hVar, String response, String str, jc0.a aVar, String str2, Map<String, String> telemetryData) {
            s.k(response, "response");
            s.k(telemetryData, "telemetryData");
            this.commandResult = hVar;
            this.response = response;
            this.nominalErrorReason = str;
            this.genericNominalError = aVar;
            this.carServerErrorResultReason = str2;
            this.telemetryData = telemetryData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getCommandResult() {
            return this.commandResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNominalErrorReason() {
            return this.nominalErrorReason;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jc0.a getGenericNominalError() {
            return this.genericNominalError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCarServerErrorResultReason() {
            return this.carServerErrorResultReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageEvaluationResult)) {
                return false;
            }
            MessageEvaluationResult messageEvaluationResult = (MessageEvaluationResult) other;
            return this.commandResult == messageEvaluationResult.commandResult && s.f(this.response, messageEvaluationResult.response) && s.f(this.nominalErrorReason, messageEvaluationResult.nominalErrorReason) && this.genericNominalError == messageEvaluationResult.genericNominalError && s.f(this.carServerErrorResultReason, messageEvaluationResult.carServerErrorResultReason) && s.f(this.telemetryData, messageEvaluationResult.telemetryData);
        }

        public final Map<String, String> f() {
            return this.telemetryData;
        }

        public final String g() {
            return this.carServerErrorResultReason;
        }

        public final h h() {
            return this.commandResult;
        }

        public int hashCode() {
            h hVar = this.commandResult;
            int iHashCode = (((hVar == null ? 0 : hVar.hashCode()) * 31) + this.response.hashCode()) * 31;
            String str = this.nominalErrorReason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            jc0.a aVar = this.genericNominalError;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.carServerErrorResultReason;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.telemetryData.hashCode();
        }

        public final jc0.a i() {
            return this.genericNominalError;
        }

        public final String j() {
            return this.nominalErrorReason;
        }

        public final String k() {
            return this.response;
        }

        public String toString() {
            return "MessageEvaluationResult(commandResult=" + this.commandResult + ", response=" + this.response + ", nominalErrorReason=" + this.nominalErrorReason + ", genericNominalError=" + this.genericNominalError + ", carServerErrorResultReason=" + this.carServerErrorResultReason + ", telemetryData=" + this.telemetryData + ")";
        }

        public /* synthetic */ MessageEvaluationResult(h hVar, String str, String str2, jc0.a aVar, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(hVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? v0.i() : map);
        }
    }
}
