package fb0;

import android.annotation.SuppressLint;
import android.content.Context;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.wire.ProtoAdapter;
import com.tesla.features.FeaturesConfig;
import com.tesla.features.Signaling;
import com.tesla.logging.TeslaLog;
import com.tesla.messagedecoding.CommandMessageDecoder;
import com.tesla.oapi.CommandActionsKt;
import com.tesla.oapi.auth.AuthRepository;
import com.tesla.oapi.auth.TeslaNetworkClient;
import com.tesla.oapi.auth.UnauthorizedTokenRefreshException;
import com.tesla.sessionmanager.VehicleSessionInfo;
import ezvcard.property.Gender;
import fc0.g5;
import fc0.u5;
import fc0.x4;
import fd0.ProtoRequestBuildParams;
import fd0.SignedCommandsException;
import gc0.a1;
import ie0.j0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import ob0.RetryPolicy;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002Ã\u0001\b\u0007\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u0002:\u0007\u0084\u0001*2\u0082\u0001$Bq\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020#¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020#2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020#H\u0002¢\u0006\u0004\b4\u0010-J\u0017\u00106\u001a\u00020#2\u0006\u0010 \u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020#2\u0006\u0010 \u001a\u0002052\b\b\u0002\u00109\u001a\u000208H\u0003¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u000205H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020#2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020#2\u0006\u0010 \u001a\u000205H\u0002¢\u0006\u0004\bD\u00107J\u0017\u0010G\u001a\u00020#2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ/\u0010K\u001a\u0002052\u0006\u0010'\u001a\u00020&2\u0006\u0010F\u001a\u00020E2\u0006\u0010J\u001a\u00020I2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020#H\u0002¢\u0006\u0004\bM\u0010-J\u0017\u0010N\u001a\u00020#2\u0006\u0010 \u001a\u000205H\u0002¢\u0006\u0004\bN\u00107J\u0017\u0010O\u001a\u00020#2\u0006\u0010 \u001a\u000205H\u0002¢\u0006\u0004\bO\u00107J\u000f\u0010P\u001a\u00020#H\u0002¢\u0006\u0004\bP\u0010-J\u000f\u0010Q\u001a\u00020#H\u0002¢\u0006\u0004\bQ\u0010-J\u000f\u0010R\u001a\u00020#H\u0002¢\u0006\u0004\bR\u0010-J'\u0010W\u001a\u00020#2\u0006\u0010 \u001a\u0002052\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020#H\u0002¢\u0006\u0004\bY\u0010-J/\u0010^\u001a\u0004\u0018\u00010]2\b\u0010 \u001a\u0004\u0018\u0001052\b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010\\\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b^\u0010_J'\u0010c\u001a\u00020#*\u0004\u0018\u0001052\u0006\u0010`\u001a\u00020&2\b\b\u0002\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ'\u0010j\u001a\u00020#2\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u000208H\u0002¢\u0006\u0004\bj\u0010kJA\u0010r\u001a\u00020#2\u0006\u0010 \u001a\u0002052\u0006\u0010m\u001a\u00020l2\b\b\u0002\u0010n\u001a\u00020&2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010pH\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020#H\u0002¢\u0006\u0004\bt\u0010-J\u0017\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020&H\u0002¢\u0006\u0004\bw\u0010xJ\u001b\u0010z\u001a\u00020=*\u00020y2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bz\u0010{J)\u0010}\u001a\u00020#2\u0006\u0010|\u001a\u00020&2\u0006\u0010 \u001a\u0002052\b\b\u0002\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\b}\u0010~R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u007fR\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u0080\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u0081\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R'\u0010\u009a\u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u00010#0#0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010\u009d\u0001\u001a\u0014\u0012\u000f\u0012\r \u0097\u0001*\u0005\u0018\u00010\u009b\u00010\u009b\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0099\u0001R'\u0010\u009f\u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u00010#0#0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0099\u0001R \u0010¤\u0001\u001a\u00030 \u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b\u0082\u0001\u0010£\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010ª\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R'\u0010¯\u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u00010@0@0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0099\u0001R)\u0010±\u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u000105050\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0099\u0001R\u001a\u0010µ\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R+\u0010¸\u0001\u001a\u0014\u0012\u000f\u0012\r \u0097\u0001*\u0005\u0018\u00010¶\u00010¶\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u0099\u0001R\u001a\u0010º\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010´\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R:\u0010Ë\u0001\u001a#\u0012\u0004\u0012\u00020&\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020&\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020#0È\u00010Ç\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u001b\u0010Ñ\u0001\u001a\u00020&*\u0002058BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001¨\u0006Ó\u0001"}, d2 = {"Lfb0/m;", "Lmb0/a;", "Led0/a;", "Lud0/a;", "remoteLog", "Lbe0/e;", "getVehicleData", "Lpa0/d;", "analyticsService", "Ljb0/b;", "getToken", "Ljb0/d;", "getVehicleToken", "Lce0/h;", "requestManager", "Lee0/a;", "sessionInfoManager", "Lhe0/b;", "teslaClient", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Lie0/f;", "appState", "Lfd0/k;", "routableMessageBuilder", "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "<init>", "(Lud0/a;Lbe0/e;Lpa0/d;Ljb0/b;Ljb0/d;Lce0/h;Lee0/a;Lhe0/b;Landroid/content/Context;Lcom/tesla/features/FeaturesConfig;Lie0/f;Lfd0/k;Lcom/tesla/oapi/auth/AuthRepository;)V", "Lic0/e;", "request", "Lce0/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "a", "(Lic0/e;Lce0/d;)V", "", "vin", "j0", "(Ljava/lang/String;)V", "c", "(Lic0/e;)V", "c0", "()V", "Lcom/tesla/logging/a$a;", "event", "Led0/d;", StatusResponse.PAYLOAD, "b", "(Lcom/tesla/logging/a$a;Led0/d;)V", "N0", "Lce0/j;", "K0", "(Lce0/j;)V", "", "delayMillis", Gender.UNKNOWN, "(Lce0/j;J)V", "teslaRequest", "", "z0", "(Lce0/j;)Z", "Lfb0/m$e;", "to", "x0", "(Lfb0/m$e;)V", "C0", "Lsc0/b;", "domain", "H0", "(Lsc0/b;)V", "Lce0/a$b;", "pendingRequest", "Z", "(Ljava/lang/String;Lsc0/b;Lce0/a$b;Lce0/d;)Lce0/j;", "P0", "S0", "R0", "O0", "o0", "L0", "Lkc0/d;", "message", "Lfd0/h;", "params", "E0", "(Lce0/j;Lkc0/d;Lfd0/h;)V", "Q0", "", "requestTag", "vehicleKeyHex", "Lid0/a;", "y0", "(Lce0/j;[BLjava/lang/String;)Lid0/a;", "value", "Lcom/tesla/logging/d;", "logLevel", "p0", "(Lce0/j;Ljava/lang/String;Lcom/tesla/logging/d;)V", "Lkc0/c;", "commandMessage", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "decodeResult", "receivedBytesTimestamp", "r0", "(Lkc0/c;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;J)V", "Lic0/h;", "result", "response", "nominalErrorReason", "Ljc0/a;", "genericNominalError", "w0", "(Lce0/j;Lic0/h;Ljava/lang/String;Ljava/lang/String;Ljc0/a;)V", "d0", "id", "Lokhttp3/WebSocketListener;", "i0", "(Ljava/lang/String;)Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "A0", "(Lokhttp3/WebSocket;Lkc0/d;)Z", AnalyticsAttribute.Reason, "u0", "(Ljava/lang/String;Lce0/j;Lic0/h;)V", "Lud0/a;", "Lbe0/e;", "Lpa0/d;", DateTokenConverter.CONVERTER_KEY, "Ljb0/b;", "e", "Ljb0/d;", "f", "Lce0/h;", "g", "Lee0/a;", "h", "Lhe0/b;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "j", "Lcom/tesla/features/FeaturesConfig;", "k", "Lie0/f;", "l", "Lfd0/k;", "m", "Lcom/tesla/oapi/auth/AuthRepository;", "Lwm0/e;", "kotlin.jvm.PlatformType", "n", "Lwm0/e;", "initializeHermesRequest", "Lfb0/m$c;", "o", "onGoingRequests", "p", "hermesSocketOpened", "Lic0/q;", "q", "Lic0/q;", "()Lic0/q;", "transport", "r", "Lokhttp3/WebSocket;", "socket", "s", "Ljava/lang/String;", "connectionId", "t", "Lfb0/m$e;", "socketState", "u", "socketStateStream", "v", "commandRequests", "Lam0/b;", "w", "Lam0/b;", "commandRequestsDisposable", "Lokio/k;", "x", "socketMessages", "y", "socketMessagesDisposable", "Lcom/tesla/features/Signaling;", "z", "Lcom/tesla/features/Signaling;", "hermesFeatureConfig", "Lie0/p;", "A", "Lie0/p;", "hermesConnectionBackoff", "fb0/m$b0", "B", "Lfb0/m$b0;", "tokenManager", "", "Lkotlin/Function0;", "C", "Ljava/util/Map;", "retries", "k0", "()Ljava/lang/String;", Scopes.EMAIL, "l0", "(Lce0/j;)Ljava/lang/String;", "requestTrackingIdentifier", "D", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
public final class m implements mb0.a, ed0.a {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final com.tesla.logging.g E = com.tesla.logging.g.INSTANCE.a("Hermes");

    @SuppressLint({"StaticFieldLeak"})
    private static volatile m F;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final ie0.p hermesConnectionBackoff;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final b0 tokenManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Map<String, Map<String, wn0.a<h0>>> retries;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ud0.a remoteLog;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final be0.e getVehicleData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pa0.d analyticsService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jb0.b getToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jb0.d getVehicleToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ce0.h requestManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ee0.a sessionInfoManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final he0.b teslaClient;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final FeaturesConfig featuresConfig;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ie0.f appState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final fd0.k routableMessageBuilder;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final AuthRepository authRepository;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final wm0.e<h0> initializeHermesRequest;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final wm0.e<c> onGoingRequests;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wm0.e<h0> hermesSocketOpened;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ic0.q transport;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private WebSocket socket;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String connectionId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private e socketState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final wm0.e<e> socketStateStream;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private wm0.e<TeslaCommandRequest> commandRequests;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private am0.b commandRequestsDisposable;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private wm0.e<okio.k> socketMessages;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private am0.b socketMessagesDisposable;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Signaling hermesFeatureConfig;

    /* JADX INFO: renamed from: fb0.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006Ju\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lfb0/m$a;", "", "<init>", "()V", "Lfb0/m;", "a", "()Lfb0/m;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhe0/b;", "teslaClient", "Lee0/a;", "sessionInfoManager", "Lce0/h;", "requestManager", "Lud0/a;", "remoteLog", "Lbe0/e;", "getVehicleData", "Lpa0/d;", "analyticsService", "Ljb0/b;", "getToken", "Ljb0/d;", "getVehicleToken", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Lie0/f;", "appState", "Lfd0/k;", "routableMessageBuilder", "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "b", "(Landroid/content/Context;Lhe0/b;Lee0/a;Lce0/h;Lud0/a;Lbe0/e;Lpa0/d;Ljb0/b;Ljb0/d;Lcom/tesla/features/FeaturesConfig;Lie0/f;Lfd0/k;Lcom/tesla/oapi/auth/AuthRepository;)Lfb0/m;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "REQUEST_TIMEOUT_S", "I", "", "DEFAULT_SEND_REQUEST_DELAY_MILLIS", "J", "MIN_CAR_API_VERSION", "INSTANCE", "Lfb0/m;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return m.F;
        }

        public final m b(Context context, he0.b teslaClient, ee0.a sessionInfoManager, ce0.h requestManager, ud0.a remoteLog, be0.e getVehicleData, pa0.d analyticsService, jb0.b getToken, jb0.d getVehicleToken, FeaturesConfig featuresConfig, ie0.f appState, fd0.k routableMessageBuilder, AuthRepository authRepository) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(teslaClient, "teslaClient");
            p013kotlin.jvm.internal.s.k(sessionInfoManager, "sessionInfoManager");
            p013kotlin.jvm.internal.s.k(requestManager, "requestManager");
            p013kotlin.jvm.internal.s.k(remoteLog, "remoteLog");
            p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
            p013kotlin.jvm.internal.s.k(analyticsService, "analyticsService");
            p013kotlin.jvm.internal.s.k(getToken, "getToken");
            p013kotlin.jvm.internal.s.k(getVehicleToken, "getVehicleToken");
            p013kotlin.jvm.internal.s.k(featuresConfig, "featuresConfig");
            p013kotlin.jvm.internal.s.k(appState, "appState");
            p013kotlin.jvm.internal.s.k(routableMessageBuilder, "routableMessageBuilder");
            p013kotlin.jvm.internal.s.k(authRepository, "authRepository");
            m mVar = m.F;
            if (mVar != null) {
                return mVar;
            }
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            m mVar2 = new m(remoteLog, getVehicleData, analyticsService, getToken, getVehicleToken, requestManager, sessionInfoManager, teslaClient, applicationContext, featuresConfig, appState, routableMessageBuilder, authRepository, null);
            m.F = mVar2;
            return mVar2;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a0<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a0<T> f64786a = new a0<>();

        a0() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            m.E.d("error in socket message processing", error);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lfb0/m$b;", "", "Lfd0/h;", "params", "<init>", "(Lfd0/h;)V", "a", "Lfd0/h;", "()Lfd0/h;", "b", "c", "Lfb0/m$b$a;", "Lfb0/m$b$b;", "Lfb0/m$b$c;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ProtoRequestBuildParams params;

        /* JADX INFO: renamed from: fb0.m$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfb0/m$b$a;", "Lfb0/m$b;", "Lfd0/h;", "params", "<init>", "(Lfd0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lfd0/h;", "a", "()Lfd0/h;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmailLookupFailure extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProtoRequestBuildParams params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailLookupFailure(ProtoRequestBuildParams params) {
                super(params, null);
                p013kotlin.jvm.internal.s.k(params, "params");
                this.params = params;
            }

            @Override // fb0.m.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ProtoRequestBuildParams getParams() {
                return this.params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailLookupFailure) && p013kotlin.jvm.internal.s.f(this.params, ((EmailLookupFailure) other).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                return "EmailLookupFailure(params=" + this.params + ")";
            }
        }

        /* JADX INFO: renamed from: fb0.m$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfb0/m$b$b;", "Lfb0/m$b;", "Lfd0/h;", "params", "Lfd0/b;", "message", "<init>", "(Lfd0/h;Lfd0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lfd0/h;", "a", "()Lfd0/h;", "c", "Lfd0/b;", "()Lfd0/b;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProtoRequestBuildParams params;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final fd0.b message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ProtoRequestBuildParams params, fd0.b message) {
                super(params, null);
                p013kotlin.jvm.internal.s.k(params, "params");
                p013kotlin.jvm.internal.s.k(message, "message");
                this.params = params;
                this.message = message;
            }

            @Override // fb0.m.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ProtoRequestBuildParams getParams() {
                return this.params;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final fd0.b getMessage() {
                return this.message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return p013kotlin.jvm.internal.s.f(this.params, success.params) && p013kotlin.jvm.internal.s.f(this.message, success.message);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Success(params=" + this.params + ", message=" + this.message + ")";
            }
        }

        /* JADX INFO: renamed from: fb0.m$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfb0/m$b$c;", "Lfb0/m$b;", "Lfd0/h;", "params", "<init>", "(Lfd0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lfd0/h;", "a", "()Lfd0/h;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VehicleTokenFailure extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProtoRequestBuildParams params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VehicleTokenFailure(ProtoRequestBuildParams params) {
                super(params, null);
                p013kotlin.jvm.internal.s.k(params, "params");
                this.params = params;
            }

            @Override // fb0.m.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ProtoRequestBuildParams getParams() {
                return this.params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VehicleTokenFailure) && p013kotlin.jvm.internal.s.f(this.params, ((VehicleTokenFailure) other).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                return "VehicleTokenFailure(params=" + this.params + ")";
            }
        }

        public /* synthetic */ b(ProtoRequestBuildParams protoRequestBuildParams, DefaultConstructorMarker defaultConstructorMarker) {
            this(protoRequestBuildParams);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public ProtoRequestBuildParams getParams() {
            return this.params;
        }

        private b(ProtoRequestBuildParams protoRequestBuildParams) {
            this.params = protoRequestBuildParams;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"fb0/m$b0", "Lfb0/o;", "Ljn0/h0;", "b", "()V", "", "vin", "a", "(Ljava/lang/String;)V", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b0 implements fb0.o {
        b0() {
        }

        @Override // fb0.o
        public void a(String vin) {
            p013kotlin.jvm.internal.s.k(vin, "vin");
            m.E.j("Deleting vehicle token");
            m mVar = m.this;
            synchronized (this) {
                jb0.d dVar = mVar.getVehicleToken;
                String strK0 = mVar.k0();
                p013kotlin.jvm.internal.s.h(strK0);
                dVar.h(strK0, vin);
                h0 h0Var = h0.f84049a;
            }
        }

        @Override // fb0.o
        public void b() {
            m.E.j("Deleting user token and reconnecting to web socket");
            m mVar = m.this;
            synchronized (this) {
                jb0.b bVar = mVar.getToken;
                String strK0 = mVar.k0();
                p013kotlin.jvm.internal.s.h(strK0);
                bVar.g(strK0);
                m.E.j("User token invalid, killing and restarting hermes!");
                mVar.o0();
                mVar.hermesConnectionBackoff.d();
                h0 h0Var = h0.f84049a;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lfb0/m$c;", "", "", "identifier", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "b", "Lfb0/m$c$a;", "Lfb0/m$c$b;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String identifier;

        /* JADX INFO: renamed from: fb0.m$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lfb0/m$c$a;", "Lfb0/m$c;", "", "identifier", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ended extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String identifier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ended(String identifier) {
                super(identifier, null);
                p013kotlin.jvm.internal.s.k(identifier, "identifier");
                this.identifier = identifier;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIdentifier() {
                return this.identifier;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ended) && p013kotlin.jvm.internal.s.f(this.identifier, ((ended) other).identifier);
            }

            public int hashCode() {
                return this.identifier.hashCode();
            }

            public String toString() {
                return "ended(" + getIdentifier() + ")";
            }
        }

        /* JADX INFO: renamed from: fb0.m$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lfb0/m$c$b;", "Lfb0/m$c;", "", "identifier", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class started extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String identifier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public started(String identifier) {
                super(identifier, null);
                p013kotlin.jvm.internal.s.k(identifier, "identifier");
                this.identifier = identifier;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIdentifier() {
                return this.identifier;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof started) && p013kotlin.jvm.internal.s.f(this.identifier, ((started) other).identifier);
            }

            public int hashCode() {
                return this.identifier.hashCode();
            }

            public String toString() {
                return "started(" + getIdentifier() + ")";
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private c(String str) {
            this.identifier = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lfb0/m$e;", "", "<init>", "(Ljava/lang/String;I)V", "", "isOpeningOrOpened", "()Z", "OPENING", "OPENED", "CLOSING", "CLOSED", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum e {
        OPENING,
        OPENED,
        CLOSING,
        CLOSED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        public final boolean isOpeningOrOpened() {
            return this == OPENING || this == OPENED;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f<T, R> f64799a = new f<>();

        f() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(j0<? extends com.auth0.android.jwt.d> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.b().toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g<T> implements cm0.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64801b;

        g(String str) {
            this.f64801b = str;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(String token) {
            p013kotlin.jvm.internal.s.k(token, "token");
            m.E.j("hermes user token fetched! creating new web socket instance.");
            m mVar = m.this;
            mVar.socket = m.e0(mVar, this.f64801b, v0.f(jn0.x.a("X-Jwt", token)));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h<T> implements cm0.f {
        h() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable throwable) {
            p013kotlin.jvm.internal.s.k(throwable, "throwable");
            m.E.d("error fetching hermes user token", throwable);
            m.g0(m.this, throwable);
        }
    }

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"fb0/m$i", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "", "code", "", AnalyticsAttribute.Reason, "Ljn0/h0;", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosing", "", "t", "Lokhttp3/Response;", "response", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "Lokio/k;", "bytes", "onMessage", "(Lokhttp3/WebSocket;Lokio/k;)V", "", "b", "()Z", "isCurrentConnectionListener", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f64804b;

        i(String str, m mVar) {
            this.f64803a = str;
            this.f64804b = mVar;
        }

        public final boolean b() {
            return p013kotlin.jvm.internal.s.f(this.f64803a, this.f64804b.connectionId);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int code, String reason) {
            p013kotlin.jvm.internal.s.k(webSocket, "webSocket");
            p013kotlin.jvm.internal.s.k(reason, "reason");
            super.onClosed(webSocket, code, reason);
            if (b()) {
                m mVar = this.f64804b;
                synchronized (this) {
                    m.E.j("onClosed called: " + code + " " + reason);
                    mVar.x0(e.CLOSED);
                    h0 h0Var = h0.f84049a;
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int code, String reason) {
            p013kotlin.jvm.internal.s.k(webSocket, "webSocket");
            p013kotlin.jvm.internal.s.k(reason, "reason");
            super.onClosing(webSocket, code, reason);
            if (b()) {
                m mVar = this.f64804b;
                synchronized (this) {
                    m.E.j("onClosing called: " + code + " " + reason);
                    mVar.x0(e.CLOSING);
                    h0 h0Var = h0.f84049a;
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t11, Response response) {
            p013kotlin.jvm.internal.s.k(webSocket, "webSocket");
            p013kotlin.jvm.internal.s.k(t11, "t");
            super.onFailure(webSocket, t11, response);
            if (b()) {
                m mVar = this.f64804b;
                synchronized (this) {
                    try {
                        m.E.d("onFailure called: " + (response != null ? response.toString() : null), t11);
                        mVar.x0(e.CLOSED);
                        mVar.hermesConnectionBackoff.b();
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, okio.k bytes) {
            p013kotlin.jvm.internal.s.k(webSocket, "webSocket");
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            super.onMessage(webSocket, bytes);
            if (b()) {
                this.f64804b.socketMessages.onNext(bytes);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            p013kotlin.jvm.internal.s.k(webSocket, "webSocket");
            p013kotlin.jvm.internal.s.k(response, "response");
            super.onOpen(webSocket, response);
            if (b()) {
                m mVar = this.f64804b;
                synchronized (this) {
                    m.E.j("onOpen called: " + response);
                    mVar.hermesSocketOpened.onNext(h0.f84049a);
                    mVar.x0(e.OPENED);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"fb0/m$j", "Lid0/a;", "", "vin", "Lsc0/h;", "routableMessage", "Lsc0/b;", "domain", "", "requestTag", "vehicleKeyHex", "Lokio/k;", "a", "(Ljava/lang/String;Lsc0/h;Lsc0/b;[BLjava/lang/String;)Lokio/k;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j implements id0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeslaCommandRequest f64806b;

        j(TeslaCommandRequest teslaCommandRequest) {
            this.f64806b = teslaCommandRequest;
        }

        @Override // id0.a
        public okio.k a(String vin, sc0.h routableMessage, sc0.b domain, byte[] requestTag, String vehicleKeyHex) {
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(routableMessage, "routableMessage");
            p013kotlin.jvm.internal.s.k(domain, "domain");
            p013kotlin.jvm.internal.s.k(requestTag, "requestTag");
            p013kotlin.jvm.internal.s.k(vehicleKeyHex, "vehicleKeyHex");
            try {
                byte[] bArrA = fd0.a.f65687a.a(m.this.context, this.f64806b, vin, routableMessage, domain, requestTag, vehicleKeyHex);
                if (bArrA != null) {
                    return okio.k.Companion.i(okio.k.INSTANCE, bArrA, 0, 0, 3, null);
                }
                return null;
            } catch (Exception e11) {
                m.E.d("Error decrypting message", e11);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fb0/m$k", "Lxm0/a;", "", "count", "Ljn0/h0;", "e", "(J)V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "()V", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends xm0.a<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeslaCommandRequest f64807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f64808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProtoRequestBuildParams f64809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kc0.d f64810e;

        k(TeslaCommandRequest teslaCommandRequest, m mVar, ProtoRequestBuildParams protoRequestBuildParams, kc0.d dVar) {
            this.f64807b = teslaCommandRequest;
            this.f64808c = mVar;
            this.f64809d = protoRequestBuildParams;
            this.f64810e = dVar;
        }

        public void e(long count) {
            if (this.f64807b.getFinished()) {
                this.f64808c.p0(this.f64807b, "not resending, it's finished.", com.tesla.logging.d.DEBUG);
                dispose();
                return;
            }
            m mVar = this.f64808c;
            TeslaCommandRequest teslaCommandRequest = this.f64807b;
            m.q0(mVar, teslaCommandRequest, "<- resending, resent count: " + teslaCommandRequest.h0(), null, 2, null);
            m.G0(this.f64808c, this.f64807b, this.f64809d, this.f64810e);
        }

        @Override // nr0.b
        public void onComplete() {
            this.f64808c.p0(this.f64807b, "onComplete called for repeating request", com.tesla.logging.d.DEBUG);
        }

        @Override // nr0.b
        public void onError(Throwable t11) {
            m.E.d("error in repeating request", t11);
        }

        @Override // nr0.b
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            e(((Number) obj).longValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class l<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l<T> f64811a = new l<>();

        l() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            m.E.d("Error in command requests stream", it);
        }
    }

    /* JADX INFO: renamed from: fb0.m$m, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C1333m<T, R> implements cm0.h {
        C1333m() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProtoRequestBuildParams apply(TeslaCommandRequest teslaCommandRequest) {
            String vin = teslaCommandRequest.getVin();
            teslaCommandRequest.c("entered_request_flow");
            VehicleSessionInfo vehicleSessionInfoG = m.this.sessionInfoManager.g(CommandActionsKt.getDomain(teslaCommandRequest.l()), vin, teslaCommandRequest.getSourcePublicKey());
            teslaCommandRequest.c("building_params_start");
            ProtoRequestBuildParams.Companion companion = ProtoRequestBuildParams.INSTANCE;
            String str = m.this.connectionId;
            p013kotlin.jvm.internal.s.h(teslaCommandRequest);
            ProtoRequestBuildParams protoRequestBuildParamsA = companion.a(str, teslaCommandRequest, teslaCommandRequest.u(), vehicleSessionInfoG);
            teslaCommandRequest.c("building_params_done");
            m.this.p0(teslaCommandRequest, "<- params built", com.tesla.logging.d.DEBUG);
            return protoRequestBuildParamsA;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class n<T, R> implements cm0.h {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T, R> implements cm0.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeslaCommandRequest f64814a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProtoRequestBuildParams f64815b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f64816c;

            a(TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams, m mVar) {
                this.f64814a = teslaCommandRequest;
                this.f64815b = protoRequestBuildParams;
                this.f64816c = mVar;
            }

            @Override // cm0.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final io.reactivex.rxjava3.core.y<? extends b> apply(j0<? extends com.auth0.android.jwt.d> result) {
                p013kotlin.jvm.internal.s.k(result, "result");
                if (!result.getIsFailure()) {
                    this.f64814a.c("vehicle_token_fetch_done");
                    return n.c(this.f64814a, this.f64815b, this.f64816c, result.b().toString());
                }
                this.f64814a.c("vehicle_token_fetch_failure");
                Throwable exception = result.getException();
                if (exception != null) {
                    m.E.d("Hermes vehicle token failure", exception);
                } else {
                    com.tesla.logging.g gVar = m.E;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("Hermes vehicle token failure");
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(jn0.x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
                ProtoRequestBuildParams protoRequestBuildParams = this.f64815b;
                p013kotlin.jvm.internal.s.h(protoRequestBuildParams);
                io.reactivex.rxjava3.core.u uVarM = io.reactivex.rxjava3.core.u.m(new b.VehicleTokenFailure(protoRequestBuildParams));
                p013kotlin.jvm.internal.s.h(uVarM);
                return uVarM;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T, R> implements cm0.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProtoRequestBuildParams f64817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f64818b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TeslaCommandRequest f64819c;

            b(ProtoRequestBuildParams protoRequestBuildParams, m mVar, TeslaCommandRequest teslaCommandRequest) {
                this.f64817a = protoRequestBuildParams;
                this.f64818b = mVar;
                this.f64819c = teslaCommandRequest;
            }

            @Override // cm0.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b apply(fd0.b buildMessageResult) {
                p013kotlin.jvm.internal.s.k(buildMessageResult, "buildMessageResult");
                ProtoRequestBuildParams protoRequestBuildParams = this.f64817a;
                p013kotlin.jvm.internal.s.h(protoRequestBuildParams);
                b.Success success = new b.Success(protoRequestBuildParams, buildMessageResult);
                if (this.f64817a.getRequest().M()) {
                    this.f64818b.sessionInfoManager.e(this.f64817a.getRequest().s(), this.f64817a.getVin(), this.f64817a.getRequest().getSourcePublicKey());
                }
                this.f64819c.c("message_build_done");
                this.f64818b.p0(this.f64819c, "<- message built", com.tesla.logging.d.DEBUG);
                return success;
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final io.reactivex.rxjava3.core.u<b> c(TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams, m mVar, String str) {
            teslaCommandRequest.c("message_build_start");
            fd0.g gVar = fd0.g.f65701a;
            p013kotlin.jvm.internal.s.h(protoRequestBuildParams);
            io.reactivex.rxjava3.core.u<R> uVarN = gVar.a(protoRequestBuildParams, str, mVar.routableMessageBuilder).n(new b(protoRequestBuildParams, mVar, teslaCommandRequest));
            p013kotlin.jvm.internal.s.j(uVarN, "map(...)");
            return uVarN;
        }

        static /* synthetic */ io.reactivex.rxjava3.core.u d(TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams, m mVar, String str, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str = null;
            }
            return c(teslaCommandRequest, protoRequestBuildParams, mVar, str);
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.reactivex.rxjava3.core.r<? extends b> apply(ProtoRequestBuildParams params) {
            io.reactivex.rxjava3.core.o<R> oVarY;
            p013kotlin.jvm.internal.s.k(params, "params");
            TeslaCommandRequest request = params.getRequest();
            if (m.this.k0() != null) {
                request.w0(ic0.j.FETCHING_VEHICLE_TOKEN);
                request.c("vehicle_token_fetch_start");
                if (m.this.hermesFeatureConfig.getUseAuthToken()) {
                    m.E.j("using OAPI auth token to stand-up hermes");
                    oVarY = d(request, params, m.this, null, 8, null).y();
                } else {
                    jb0.d dVar = m.this.getVehicleToken;
                    String str = m.this.connectionId;
                    String strK0 = m.this.k0();
                    p013kotlin.jvm.internal.s.h(strK0);
                    oVarY = dVar.i(strK0, str, params.getVin()).j(new a(request, params, m.this)).y();
                }
                p013kotlin.jvm.internal.s.h(oVarY);
                return oVarY;
            }
            com.tesla.logging.g gVar = m.E;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Email is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            request.c("email_null");
            io.reactivex.rxjava3.core.o oVarC = io.reactivex.rxjava3.core.o.C(new b.EmailLookupFailure(params));
            p013kotlin.jvm.internal.s.h(oVarC);
            return oVarC;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class o<T> implements cm0.f {
        o() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(b result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            ProtoRequestBuildParams params = result.getParams();
            TeslaCommandRequest request = params.getRequest();
            if (request.getFinished()) {
                m.q0(m.this, request, "request is finished, not sending over hermes.", null, 2, null);
                return;
            }
            if (result instanceof b.EmailLookupFailure) {
                com.tesla.logging.g gVar = m.E;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("email lookup failed");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                m.v0(m.this, "email lookup failed", request, null, 4, null);
                return;
            }
            if (result instanceof b.VehicleTokenFailure) {
                m.E.j("Vehicle token failure");
                m.this.U(request, 0L);
                return;
            }
            if (!(result instanceof b.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            fd0.b message = ((b.Success) result).getMessage();
            if (message instanceof fd0.b.a) {
                m.q0(m.this, request, "error occurred building proto message", null, 2, null);
                m.E.d("error occurred building proto message", ((fd0.b.a) message).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
                m.v0(m.this, "error occurred building proto message", request, null, 4, null);
            } else {
                if (!(message instanceof fd0.b.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (m.this.socketState != e.OPENED) {
                    request.c("socket_state_not_open");
                    m mVar = m.this;
                    m.q0(mVar, request, "socket in state " + mVar.socketState + ", adding request back to request manager, not sending over hermes.", null, 2, null);
                    params.getRequest().w0(ic0.j.WEBSOCKET_CONNECTING);
                    m.W(m.this, request, 0L, 2, null);
                } else {
                    request.c("send_over_hermes_start");
                    m.this.E0(request, ((fd0.b.Success) message).getMessage(), params);
                }
            }
            ie0.e.a(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class p<T> implements cm0.f {
        p() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            TeslaCommandRequest request;
            p013kotlin.jvm.internal.s.k(error, "error");
            if (!(error instanceof SignedCommandsException)) {
                m.E.f("error in request processing", error);
                return;
            }
            SignedCommandsException signedCommandsException = (SignedCommandsException) error;
            ProtoRequestBuildParams params = signedCommandsException.getParams();
            ic0.h result = signedCommandsException.getResult();
            String message = signedCommandsException.getMessage();
            Throwable cause = signedCommandsException.getCause();
            String str = "error in request processing msg: " + message;
            if (cause != null) {
                m.E.d(str, cause);
            } else {
                com.tesla.logging.g gVar = m.E;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            }
            if (params == null || (request = params.getRequest()) == null) {
                return;
            }
            m mVar = m.this;
            TeslaCommandRequest teslaCommandRequestG = mVar.requestManager.g(request.q());
            if (teslaCommandRequestG == null) {
                return;
            }
            if (result == null) {
                result = ic0.h.RESULT_INTERNAL_ERROR;
            }
            mVar.u0(str, teslaCommandRequestG, result);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"fb0/m$q", "Lkb0/g$b;", "", "vin", "Lkb0/g$c;", "state", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkb0/g$c;)V", "Lkb0/g$c;", "lastState", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q implements kb0.g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private kb0.g.c lastState = kb0.g.c.UNKNOWN;

        q() {
        }

        @Override // kb0.g.b
        public void a(String vin, kb0.g.c state) {
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(state, "state");
            if (state == kb0.g.c.ONLINE && state != this.lastState) {
                m.this.j0(vin);
            }
            this.lastState = state;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class r<T> implements cm0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r<T> f64824a = new r<>();

        r() {
        }

        @Override // cm0.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Boolean it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.booleanValue();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class s<T1, T2, R> implements cm0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s<T1, T2, R> f64825a = new s<>();

        s() {
        }

        @Override // cm0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<c> apply(Set<c> requests, c cVar) {
            p013kotlin.jvm.internal.s.k(requests, "requests");
            if (cVar instanceof c.started) {
                requests.add(cVar);
                return requests;
            }
            if (!(cVar instanceof c.ended)) {
                throw new NoWhenBranchMatchedException();
            }
            requests.remove(new c.started(((c.ended) cVar).getIdentifier()));
            return requests;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class t<T1, T2, T3, R> implements cm0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t<T1, T2, T3, R> f64826a = new t<>();

        t() {
        }

        @Override // cm0.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<c> a(h0 h0Var, Boolean bool, Set<c> requests) {
            p013kotlin.jvm.internal.s.k(bool, "<unused var>");
            p013kotlin.jvm.internal.s.k(requests, "requests");
            return requests;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class u<T> implements cm0.f {
        u() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set<c> onGoingRequests) {
            p013kotlin.jvm.internal.s.k(onGoingRequests, "onGoingRequests");
            m mVar = m.this;
            synchronized (mVar) {
                try {
                    boolean isBackgrounded = mVar.appState.getIsBackgrounded();
                    if (isBackgrounded && onGoingRequests.isEmpty()) {
                        m.E.a("app is backgrounded && no more requests, killing hermes!");
                        mVar.o0();
                    } else if (isBackgrounded) {
                        m.E.a("app is backgrounded but still has on-going requests to process");
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class v<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v<T> f64828a = new v<>();

        v() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(h0 h0Var) {
            m.E.a("initialize hermes request event fired!");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class w<T, R> implements cm0.h {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements cm0.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f64830a = new a<>();

            a() {
            }

            @Override // cm0.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean appIsBackgrounded) {
                p013kotlin.jvm.internal.s.k(appIsBackgrounded, "appIsBackgrounded");
                return !appIsBackgrounded.booleanValue();
            }
        }

        w() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.reactivex.rxjava3.core.r<? extends Boolean> apply(h0 h0Var) {
            return m.this.appState.h().M(Boolean.FALSE).s(a.f64830a).R(vm0.a.c());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class x<T> implements cm0.f {
        x() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if (m.this.socketState.isOpeningOrOpened()) {
                return;
            }
            if (m.this.featuresConfig.getHasSignedOapiTransportAndConnectHermesOnDemand()) {
                m.E.j("hasSignedOapiTransportAndConnectHermesOnDemand is true, skipping auto-connect");
            } else {
                m.this.hermesConnectionBackoff.d();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class y<T, R> implements cm0.h {
        y() {
        }

        /* JADX WARN: Code duplicated, block: B:33:0x007d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [com.tesla.messagedecoding.CommandMessageDecoder] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.tesla.messagedecoding.CommandMessageDecoder$Result] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SocketMessageResult apply(okio.k kVar) {
            TeslaCommandRequest teslaCommandRequestC;
            byte[] requestTag;
            String vehicleKeyHex;
            byte[] bArr;
            String str;
            id0.a aVarY0;
            ProtoAdapter<kc0.d> protoAdapter = kc0.d.f85904e;
            p013kotlin.jvm.internal.s.h(kVar);
            kc0.d dVarDecode = protoAdapter.decode(kVar);
            kc0.c command_message = dVarDecode.getCommand_message();
            Object objA = null;
            if (command_message != null) {
                m mVar = m.this;
                try {
                    kc0.a aVarA = kc0.a.INSTANCE.a(command_message.getCommand_type());
                    if (aVarA == kc0.a.COMMAND_TYPE_SIGNED_COMMAND || aVarA == kc0.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE) {
                        teslaCommandRequestC = mVar.requestManager.l(sc0.h.f111089m.decode(command_message.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String()), m.E).c();
                        if (teslaCommandRequestC != null) {
                            try {
                                requestTag = teslaCommandRequestC.getRequestTag();
                            } catch (Exception e11) {
                                e = e11;
                                requestTag = null;
                                vehicleKeyHex = requestTag;
                                m.E.d("Fail to prepare messageDecrypter", e);
                                bArr = requestTag;
                                str = vehicleKeyHex;
                                aVarY0 = null;
                                objA = CommandMessageDecoder.f56395a.a(command_message, aVarY0, teslaCommandRequestC != null ? teslaCommandRequestC.getVin() : null, bArr, str);
                                return new SocketMessageResult(dVarDecode, objA, 0L, 4, null);
                            }
                        } else {
                            requestTag = null;
                        }
                        if (teslaCommandRequestC != null) {
                            try {
                                vehicleKeyHex = teslaCommandRequestC.getVehicleKeyHex();
                            } catch (Exception e12) {
                                e = e12;
                                vehicleKeyHex = null;
                                m.E.d("Fail to prepare messageDecrypter", e);
                                bArr = requestTag;
                                str = vehicleKeyHex;
                                aVarY0 = null;
                                objA = CommandMessageDecoder.f56395a.a(command_message, aVarY0, teslaCommandRequestC != null ? teslaCommandRequestC.getVin() : null, bArr, str);
                                return new SocketMessageResult(dVarDecode, objA, 0L, 4, null);
                            }
                        } else {
                            vehicleKeyHex = null;
                        }
                        try {
                            bArr = requestTag;
                            str = vehicleKeyHex;
                            aVarY0 = mVar.y0(teslaCommandRequestC, requestTag, vehicleKeyHex);
                        } catch (Exception e13) {
                            e = e13;
                            m.E.d("Fail to prepare messageDecrypter", e);
                            bArr = requestTag;
                            str = vehicleKeyHex;
                            aVarY0 = null;
                        }
                    } else {
                        teslaCommandRequestC = null;
                        aVarY0 = null;
                        bArr = null;
                        str = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    teslaCommandRequestC = null;
                    requestTag = null;
                }
                objA = CommandMessageDecoder.f56395a.a(command_message, aVarY0, teslaCommandRequestC != null ? teslaCommandRequestC.getVin() : null, bArr, str);
            }
            return new SocketMessageResult(dVarDecode, objA, 0L, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class z<T> implements cm0.f {
        z() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(SocketMessageResult socketMessageResult) throws Throwable {
            kc0.c command_message;
            p013kotlin.jvm.internal.s.k(socketMessageResult, "<destruct>");
            kc0.d message = socketMessageResult.getMessage();
            CommandMessageDecoder.Result decodedMessageResult = socketMessageResult.getDecodedMessageResult();
            long receivedBytesTimestamp = socketMessageResult.getReceivedBytesTimestamp();
            if (decodedMessageResult == null || (command_message = message.getCommand_message()) == null) {
                return;
            }
            m.this.r0(command_message, decodedMessageResult, receivedBytesTimestamp);
        }
    }

    public /* synthetic */ m(ud0.a aVar, be0.e eVar, pa0.d dVar, jb0.b bVar, jb0.d dVar2, ce0.h hVar, ee0.a aVar2, he0.b bVar2, Context context, FeaturesConfig featuresConfig, ie0.f fVar, fd0.k kVar, AuthRepository authRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, eVar, dVar, bVar, dVar2, hVar, aVar2, bVar2, context, featuresConfig, fVar, kVar, authRepository);
    }

    private final boolean A0(WebSocket webSocket, kc0.d dVar) {
        return webSocket.send(dVar.encodeByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 B0(m mVar, TeslaCommandRequest commandRequest) {
        p013kotlin.jvm.internal.s.k(commandRequest, "commandRequest");
        lb0.c cVar = lb0.c.f89930a;
        ic0.q transport = mVar.getTransport();
        cVar.c(mVar.context, mVar.remoteLog, commandRequest, mVar.connectionId, mVar.getVehicleData, transport, ic0.h.RESULT_TIMEOUT, (16640 & 128) != 0 ? null : kb0.g.f85866a.o(commandRequest.getVin()), (16640 & 256) != 0 ? null : null, (16640 & 512) != 0 ? null : null, (16640 & 1024) != 0 ? null : null, (16640 & 2048) != 0 ? null : E, (16640 & 4096) != 0 ? null : null, (16640 & PKIFailureInfo.certRevoked) != 0 ? null : "timeout from send", (16640 & 16384) != 0 ? false : false, (16640 & 32768) != 0 ? false : false);
        return h0.f84049a;
    }

    private final void C0(TeslaCommandRequest request) {
        request.d(new wn0.p() { // from class: fb0.c
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m.D0(this.f64740a, (TeslaCommandRequest) obj, (ic0.h) obj2);
            }
        });
        if (z0(request)) {
            K0(request);
            S0(request);
            request.x0();
            p0(request, "<- building request", com.tesla.logging.d.DEBUG);
            this.commandRequests.onNext(request);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 D0(m mVar, TeslaCommandRequest finishedRequest, ic0.h hVar) {
        p013kotlin.jvm.internal.s.k(finishedRequest, "finishedRequest");
        p013kotlin.jvm.internal.s.k(hVar, "<unused var>");
        mVar.R0(finishedRequest);
        fb0.n.f64834a.f(finishedRequest);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(final TeslaCommandRequest request, kc0.d message, ProtoRequestBuildParams params) {
        if (!G0(this, request, params, message)) {
            q0(this, request, "-> failed to send message over socket.", null, 2, null);
            request.c("send_over_hermes_failure_to_send_over_socket");
            W(this, request, 0L, 2, null);
            return;
        }
        request.u0(kb0.g.f85866a.n(request.getVin()));
        VehicleSessionInfo vehicleSessionInfo = params.getVehicleSessionInfo();
        request.G0(vehicleSessionInfo != null ? vehicleSessionInfo.getRequestId() : null);
        fb0.n nVar = fb0.n.f64834a;
        if (p013kotlin.jvm.internal.s.f(nVar.g(request), Boolean.TRUE)) {
            k kVar = new k(request, this, params, message);
            nVar.e(request, kVar);
            io.reactivex.rxjava3.core.h.n(1L, 7L, 3L, 3L, TimeUnit.SECONDS).h(new cm0.a() { // from class: fb0.k
                @Override // cm0.a
                public final void run() {
                    m.F0(this.f64753a, request);
                }
            }).x(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(m mVar, TeslaCommandRequest teslaCommandRequest) {
        q0(mVar, teslaCommandRequest, "re-send flow terminated!", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G0(m mVar, TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams, kc0.d dVar) {
        if (mVar.socket == null) {
            q0(mVar, teslaCommandRequest, "socket is null, adding request back to request manager, not sending.", null, 2, null);
            teslaCommandRequest.c("send_over_hermes_failure_socket_is_null");
            protoRequestBuildParams.getRequest().w0(ic0.j.WEBSOCKET_CONNECTING);
            W(mVar, teslaCommandRequest, 0L, 2, null);
            return false;
        }
        teslaCommandRequest.w0(ic0.j.READY);
        q0(mVar, teslaCommandRequest, "<- sending", null, 2, null);
        okio.k kVarEncodeByteString = dVar.encodeByteString();
        teslaCommandRequest.D0(Integer.valueOf(kVarEncodeByteString.D()));
        teslaCommandRequest.F0(Long.valueOf(System.currentTimeMillis()));
        WebSocket webSocket = mVar.socket;
        p013kotlin.jvm.internal.s.h(webSocket);
        boolean zSend = webSocket.send(kVarEncodeByteString);
        teslaCommandRequest.c("send_over_hermes_sent_message_sent:" + zSend);
        pa0.d dVar2 = mVar.analyticsService;
        cc0.d dVar3 = cc0.d.SEND_FILLED_REQUEST;
        cc0.f fVarG = zSend ? qa0.a.g() : qa0.a.b();
        bb0.b bVar = bb0.b.f16948a;
        dVar2.b(dVar3, p013kotlin.collections.v.p(fVarG, bVar.e(mVar.getTransport()), bVar.b(protoRequestBuildParams.getRequest().getRequest())));
        return zSend;
    }

    private final void H0(final sc0.b domain) throws Exception {
        sc0.b bVar;
        com.tesla.logging.g gVarP = E.p("sendPendingRequests(" + domain + ")");
        e eVar = this.socketState;
        if (eVar != e.OPENED) {
            if (eVar != e.OPENING) {
                gVarP.a("calling initialize()");
                this.initializeHermesRequest.onNext(h0.f84049a);
            }
            gVarP.a("socket isn't open, doing nothing more.");
            return;
        }
        List<ce0.a> listA = this.requestManager.a(domain);
        if (listA.isEmpty()) {
            gVarP.a("no actionable requests " + domain);
        } else {
            gVarP.a("actionable requests " + domain + " => " + p013kotlin.collections.v.y0(listA, null, null, null, 0, null, new wn0.l() { // from class: fb0.i
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return m.I0((ce0.a) obj);
                }
            }, 31, null));
        }
        for (ce0.a aVar : listA) {
            if (aVar instanceof ce0.a.Request) {
                C0(((ce0.a.Request) aVar).getRequest());
                bVar = domain;
            } else {
                if (!(aVar instanceof ce0.a.SessionInfoRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                ce0.a.SessionInfoRequest sessionInfoRequest = (ce0.a.SessionInfoRequest) aVar;
                final String vin = sessionInfoRequest.getVin();
                final byte[] sourcePublicKey = sessionInfoRequest.getSourcePublicKey();
                TeslaCommandRequest teslaCommandRequestZ = Z(vin, domain, sessionInfoRequest, new ce0.d() { // from class: fb0.j
                    @Override // ce0.d
                    public final void a(ic0.g gVar) throws Exception {
                        m.J0(this.f64749a, domain, vin, sourcePublicKey, gVar);
                    }
                });
                this.requestManager.m(teslaCommandRequestZ);
                bVar = domain;
                this.sessionInfoManager.h(true, vin, teslaCommandRequestZ.getSourcePublicKey(), bVar, getTransport());
                C0(teslaCommandRequestZ);
            }
            domain = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I0(ce0.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof ce0.a.Request) {
            return ((ce0.a.Request) it).getRequest().o();
        }
        if (it instanceof ce0.a.SessionInfoRequest) {
            return "session info request";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(m mVar, sc0.b bVar, String str, byte[] bArr, ic0.g response) throws Exception {
        p013kotlin.jvm.internal.s.k(response, "response");
        if (nb0.b.c(response)) {
            mVar.H0(bVar);
            return;
        }
        ic0.h hVarE = nb0.a.e(response.getResult());
        E.j("failed to fetch session info for domain " + lb0.a.e(bVar) + " (" + lb0.a.b(response.getResult()) + "), finishing with " + lb0.a.b(hVarE));
        for (TeslaCommandRequest teslaCommandRequest : mVar.requestManager.c(bVar, str, bArr)) {
            teslaCommandRequest.H0(lb0.a.b(response.getResult()));
            mVar.u0("session info response failure", teslaCommandRequest, hVarE);
        }
    }

    private final void K0(TeslaCommandRequest request) {
        kb0.g.D(kb0.g.f85866a, request, le0.b.HERMES_SEND_COMMAND, null, 4, null);
    }

    private final void L0() {
        if (this.commandRequests.Y() || this.commandRequests.a0() || this.commandRequestsDisposable.isDisposed()) {
            com.tesla.logging.g gVar = E;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("requests stream or observer in error state, setup requests stream again.");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            this.commandRequests.onComplete();
            this.commandRequests = wm0.f.c0().b0();
        } else if (this.commandRequests.Z()) {
            return;
        }
        this.commandRequestsDisposable.dispose();
        E.a("Setting up requests stream...");
        this.commandRequestsDisposable = this.commandRequests.b0().R(vm0.a.c()).m(new cm0.a() { // from class: fb0.f
            @Override // cm0.a
            public final void run() {
                m.M0();
            }
        }).o(l.f64811a).D(new C1333m()).t(new n()).O(new o(), new p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0() {
        E.j("Disposed of command requests stream");
    }

    private final void N0() {
        kb0.g.f85866a.s(new q());
    }

    private final void O0() {
        io.reactivex.rxjava3.core.o.d(this.hermesSocketOpened, this.appState.h().j().s(r.f64824a), this.onGoingRequests.H(new LinkedHashSet(), s.f64825a), t.f64826a).h(5L, TimeUnit.SECONDS).R(vm0.a.c()).N(new u());
    }

    private final void P0() {
        E.a("setting up hermes called.");
        this.initializeHermesRequest.M(h0.f84049a).q(v.f64828a).R(vm0.a.c()).S(new w()).R(vm0.a.c()).E(vm0.a.c()).N(new x());
    }

    private final void Q0() {
        if (this.socketMessages.Y() || this.socketMessages.a0() || this.socketMessagesDisposable.isDisposed()) {
            com.tesla.logging.g gVar = E;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("socket messages stream or observer in error state, setup requests stream again.");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            this.socketMessages.onComplete();
            this.socketMessages = wm0.f.c0().b0();
        } else if (this.socketMessages.Z()) {
            return;
        }
        this.socketMessagesDisposable.dispose();
        E.a("Setting up socket messages stream...");
        this.socketMessagesDisposable = this.socketMessages.b0().R(vm0.a.c()).D(new y()).E(vm0.a.c()).O(new z(), a0.f64786a);
    }

    private final void R0(TeslaCommandRequest request) {
        this.onGoingRequests.onNext(new c.ended(l0(request)));
    }

    private final void S0(TeslaCommandRequest request) {
        this.onGoingRequests.onNext(new c.started(l0(request)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void U(final TeslaCommandRequest request, long delayMillis) {
        request.c("addRequestToManager delay:" + delayMillis);
        p0(request, "addRequestToManager called with " + delayMillis + " millis delay", com.tesla.logging.d.DEBUG);
        if (delayMillis <= 0) {
            V(this, request);
            return;
        }
        final String strI = request.I();
        final String vin = request.getVin();
        if (this.retries.get(vin) == null) {
            this.retries.put(vin, new LinkedHashMap());
        }
        ((Map) v0.j(this.retries, vin)).put(strI, new wn0.a() { // from class: fb0.g
            @Override // wn0.a
            public final Object invoke() {
                return m.X(this.f64743a, request);
            }
        });
        p013kotlin.jvm.internal.s.h(io.reactivex.rxjava3.core.b.l(delayMillis, TimeUnit.MILLISECONDS).h(new cm0.a() { // from class: fb0.h
            @Override // cm0.a
            public final void run() {
                m.Y(this.f64745a, vin, strI, request);
            }
        }));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private static final void V(m mVar, TeslaCommandRequest teslaCommandRequest) {
        synchronized (mVar) {
            try {
                q0(mVar, teslaCommandRequest, "adding to request manager and triggering send pending requests", null, 2, null);
                mVar.requestManager.n(teslaCommandRequest);
                mVar.H0(teslaCommandRequest.s());
                h0 h0Var = h0.f84049a;
            } finally {
            }
        }
    }

    static /* synthetic */ void W(m mVar, TeslaCommandRequest teslaCommandRequest, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 250;
        }
        mVar.U(teslaCommandRequest, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 X(m mVar, TeslaCommandRequest teslaCommandRequest) {
        V(mVar, teslaCommandRequest);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(m mVar, String str, String str2, TeslaCommandRequest teslaCommandRequest) {
        Map<String, wn0.a<h0>> map = mVar.retries.get(str);
        wn0.a<h0> aVarRemove = map != null ? map.remove(str2) : null;
        if (aVarRemove == null) {
            mVar.p0(teslaCommandRequest, "no retry found (probably already executed)", com.tesla.logging.d.INFO);
        } else {
            aVarRemove.invoke();
        }
    }

    private final TeslaCommandRequest Z(final String vin, final sc0.b domain, final ce0.a.SessionInfoRequest pendingRequest, final ce0.d listener) throws Exception {
        try {
            ic0.e eVarB = fd0.l.b(fd0.l.f65728a, vin, domain, ic0.f.SOURCE_APP_NATIVE, pendingRequest.getLetSleep(), false, "session_info_hermes", 16, null);
            TeslaCommandRequest teslaCommandRequest = new TeslaCommandRequest(eVarB, new ce0.d() { // from class: fb0.l
                @Override // ce0.d
                public final void a(ic0.g gVar) {
                    m.a0(this.f64755a, vin, pendingRequest, domain, listener, gVar);
                }
            }, null, pendingRequest.getSourcePublicKey(), ic0.q.TRANSPORT_HERMES, 4, null);
            TeslaCommandRequest dependentCommand = pendingRequest.getDependentCommand();
            if (dependentCommand != null) {
                teslaCommandRequest.z0(dependentCommand);
            }
            teslaCommandRequest.e(new wn0.l() { // from class: fb0.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return m.b0(this.f64738a, vin, (TeslaCommandRequest) obj);
                }
            });
            return teslaCommandRequest;
        } catch (Exception e11) {
            E.d("Failed to build session info request", e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(m mVar, String str, ce0.a.SessionInfoRequest sessionInfoRequest, sc0.b bVar, ce0.d dVar, ic0.g response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        mVar.sessionInfoManager.h(false, str, sessionInfoRequest.getSourcePublicKey(), bVar, mVar.getTransport());
        dVar.a(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b0(m mVar, String str, TeslaCommandRequest it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lb0.c cVar = lb0.c.f89930a;
        ic0.q transport = mVar.getTransport();
        cVar.c(mVar.context, mVar.remoteLog, it, mVar.connectionId, mVar.getVehicleData, transport, ic0.h.RESULT_TIMEOUT, (16640 & 128) != 0 ? null : kb0.g.f85866a.o(str), (16640 & 256) != 0 ? null : null, (16640 & 512) != 0 ? null : null, (16640 & 1024) != 0 ? null : null, (16640 & 2048) != 0 ? null : E, (16640 & 4096) != 0 ? null : null, (16640 & PKIFailureInfo.certRevoked) != 0 ? null : "session info timeout", (16640 & 16384) != 0 ? false : false, (16640 & 32768) != 0 ? false : false);
        return h0.f84049a;
    }

    private final void d0() {
        synchronized (this) {
            com.tesla.logging.g gVar = E;
            gVar.j("connecting to hermes called...");
            try {
                String strD = qb0.a.INSTANCE.b().d();
                if (this.socketState.isOpeningOrOpened()) {
                    gVar.j("socket state is already " + this.socketState + ", doing nothing more.");
                    return;
                }
                if (!ie0.a0.f77574a.b(this.context)) {
                    gVar.j("no network connectivity, doing nothing more.");
                    h0(this, null, 2, null);
                    return;
                }
                if (k0() == null) {
                    gVar.j("email is null, doing nothing more.");
                    h0(this, null, 2, null);
                    return;
                }
                if (strD == null) {
                    gVar.j("public key ID is null, doing nothing more.");
                    h0(this, null, 2, null);
                    return;
                }
                x0(e.OPENING);
                gVar.j("fetching token required for hermes connection...");
                this.connectionId = UUID.randomUUID().toString();
                if (this.hermesFeatureConfig.getUseAuthToken()) {
                    gVar.j("using OAPI token for hermes web socket connection!");
                    String token = this.authRepository.getToken();
                    if (token == null) {
                        gVar.j("OAPI token is null, doing nothing more");
                        h0(this, null, 2, null);
                    } else {
                        this.socket = e0(this, strD, v0.m(jn0.x.a("Authorization", "Bearer " + token), jn0.x.a("X-Jwt-OAPI", token)));
                        h0 h0Var = h0.f84049a;
                    }
                } else {
                    jb0.b bVar = this.getToken;
                    String strK0 = k0();
                    p013kotlin.jvm.internal.s.h(strK0);
                    p013kotlin.jvm.internal.s.h(bVar.h(strK0, this.connectionId).n(f.f64799a).t(new g(strD), new h<>()));
                }
            } catch (Exception e11) {
                E.f("exception thrown connecting to hermes", e11);
                g0(this, e11);
                h0 h0Var2 = h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebSocket e0(m mVar, String str, Map<String, String> map) {
        String hermesURL = TeslaNetworkClient.INSTANCE.getHermesURL();
        Map mapR = v0.r(f0(str, mVar), map);
        Request.Builder builderUrl = new Request.Builder().url(hermesURL);
        for (Map.Entry entry : mapR.entrySet()) {
            builderUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        return db0.b.f60354a.c().newWebSocket(builderUrl.build(), mVar.i0(mVar.connectionId));
    }

    private static final Map<String, String> f0(String str, m mVar) {
        return v0.m(jn0.x.a("X-Tesla-User-Agent", qb0.a.INSTANCE.b().c()), jn0.x.a("X-Tesla-App-Key", str), jn0.x.a("X-Connection-Id", mVar.connectionId), jn0.x.a("connect_on_demand", String.valueOf(mVar.featuresConfig.getHasSignedOapiTransportAndConnectHermesOnDemand())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(m mVar, Throwable th2) {
        com.tesla.logging.g gVar = E;
        gVar.j("failed to setup web socket, notifying backoff mechanism of failure.");
        mVar.x0(e.CLOSED);
        if (!(th2 instanceof UnauthorizedTokenRefreshException)) {
            mVar.hermesConnectionBackoff.b();
        } else {
            gVar.j("stop backoff because we receive UnauthorizedTokenRefreshException");
            mVar.hermesConnectionBackoff.e();
        }
    }

    static /* synthetic */ void h0(m mVar, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        g0(mVar, th2);
    }

    private final WebSocketListener i0(String id2) {
        return new i(id2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k0() {
        return this.teslaClient.g();
    }

    private final String l0(TeslaCommandRequest teslaCommandRequest) {
        return teslaCommandRequest.o() + "." + teslaCommandRequest.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m0(final m mVar) {
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: fb0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.n0(this.f64742a);
            }
        }).k(vm0.a.c()).g();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n0(m mVar) {
        mVar.d0();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        synchronized (this) {
            try {
                e eVar = this.socketState;
                e eVar2 = e.CLOSED;
                if (eVar == eVar2 && this.socket == null) {
                    E.a("hermes already dead.");
                } else {
                    com.tesla.logging.g gVar = E;
                    gVar.a("closing socket and nulling it out.");
                    this.connectionId = UUID.randomUUID().toString();
                    WebSocket webSocket = this.socket;
                    if (webSocket != null) {
                        webSocket.close(1000, null);
                    }
                    this.socket = null;
                    x0(eVar2);
                    gVar.a("stopping hermes reconnect");
                    this.hermesConnectionBackoff.e();
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(TeslaCommandRequest teslaCommandRequest, String str, com.tesla.logging.d dVar) {
        de0.a.f(teslaCommandRequest, str, E, dVar, false, 8, null);
    }

    static /* synthetic */ void q0(m mVar, TeslaCommandRequest teslaCommandRequest, String str, com.tesla.logging.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = com.tesla.logging.d.INFO;
        }
        mVar.p0(teslaCommandRequest, str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0281 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02f9 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02fd A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0309  */
    /* JADX WARN: Code duplicated, block: B:115:0x0347 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x002e, blocks: (B:4:0x0005, B:6:0x0019, B:11:0x0034, B:13:0x003b, B:15:0x0056, B:19:0x006d, B:21:0x007b, B:23:0x0081, B:25:0x0087, B:27:0x008d, B:35:0x00b8, B:29:0x0093, B:43:0x00c8, B:45:0x00cf, B:47:0x00db, B:51:0x00eb, B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:82:0x020a, B:84:0x021c, B:86:0x0222, B:88:0x0228, B:90:0x0230, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:118:0x0366, B:117:0x035f, B:115:0x0347, B:16:0x005f), top: B:129:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012a A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0180 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ed A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f3 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x024a A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0267 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TRY_ENTER, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0273 A[Catch: all -> 0x002e, RuntimeException -> 0x013f, TryCatch #3 {RuntimeException -> 0x013f, blocks: (B:52:0x00f0, B:54:0x012a, B:59:0x0146, B:62:0x015e, B:63:0x0172, B:64:0x017a, B:66:0x0180, B:68:0x0194, B:70:0x01ae, B:72:0x01b5, B:74:0x01bb, B:76:0x01d6, B:78:0x01ed, B:80:0x01f3, B:94:0x024a, B:97:0x0267, B:99:0x0273, B:100:0x027b, B:102:0x0281, B:103:0x02ad, B:105:0x02f9, B:107:0x02fd, B:112:0x0337, B:115:0x0347), top: B:128:0x00f0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0281, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x012a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01f3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x024a, please report this as an issue */
    public final void r0(kc0.c commandMessage, CommandMessageDecoder.Result decodeResult, long receivedBytesTimestamp) throws Throwable {
        TeslaCommandRequest teslaCommandRequest;
        ic0.h commandResult;
        String response;
        String nominalErrorReason;
        jc0.a genericNominalError;
        String carServerErrorResultReason;
        Map<String, String> mapF;
        String strB;
        Long lT;
        RetryPolicy retryPolicyC;
        ic0.h hVar;
        String strK;
        sc0.a to_destination;
        okio.k routing_address;
        String key;
        String value;
        synchronized (this) {
            try {
                ce0.h.Request requestE = this.requestManager.e(commandMessage, E);
                String requestId = requestE.getRequestId();
                TeslaCommandRequest request = requestE.getRequest();
                if (request != null) {
                    request.c("decode=" + decodeResult);
                }
                String strH = null;
                String vin = request != null ? request.getVin() : null;
                q0(this, request, "-> decoded: " + decodeResult, null, 2, null);
                WebSocket webSocket = this.socket;
                if (webSocket == null) {
                    q0(this, request, "can't send ack message, socket is null", null, 2, null);
                } else {
                    p013kotlin.jvm.internal.s.h(webSocket);
                    A0(webSocket, gb0.a.a(commandMessage));
                }
                if (requestId != null && request != null) {
                    fb0.n nVar = fb0.n.f64834a;
                    if (p013kotlin.jvm.internal.s.f(nVar.g(request), Boolean.TRUE) && nVar.b(requestId, decodeResult)) {
                        if (request.l0() || request.p0() || request.q0()) {
                            try {
                                gb0.b.a(ed0.c.f62814a, this.context, decodeResult, this.sessionInfoManager, this.requestManager, this.getVehicleData, this, vin, request, ic0.q.TRANSPORT_HERMES, this.tokenManager, this, this.featuresConfig);
                                request = request;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        q0(this, request, "received response, but we already processed a response from earlier, doing nothing more.", null, 2, null);
                        return;
                    }
                    if (request == null) {
                    }
                    if (request != null) {
                        request.c("evaluation_start");
                    }
                    ed0.c.MessageEvaluationResult messageEvaluationResultA = gb0.b.a(ed0.c.f62814a, this.context, decodeResult, this.sessionInfoManager, this.requestManager, this.getVehicleData, this, vin, request, ic0.q.TRANSPORT_HERMES, this.tokenManager, this, this.featuresConfig);
                    teslaCommandRequest = request;
                    commandResult = messageEvaluationResultA.getCommandResult();
                    response = messageEvaluationResultA.getResponse();
                    nominalErrorReason = messageEvaluationResultA.getNominalErrorReason();
                    genericNominalError = messageEvaluationResultA.getGenericNominalError();
                    carServerErrorResultReason = messageEvaluationResultA.getCarServerErrorResultReason();
                    mapF = messageEvaluationResultA.f();
                    if (teslaCommandRequest != null) {
                        teslaCommandRequest.c("command_result=" + commandResult);
                    }
                    if (genericNominalError != null) {
                        teslaCommandRequest.c("generic_nominal_error=" + genericNominalError);
                    }
                    if (carServerErrorResultReason != null) {
                        teslaCommandRequest.c("car_server_error_result_reason=" + carServerErrorResultReason);
                    }
                    for (Map.Entry<String, String> entry : mapF.entrySet()) {
                        key = entry.getKey();
                        value = entry.getValue();
                        if (teslaCommandRequest != null) {
                            teslaCommandRequest.c(key + "=" + value);
                        }
                    }
                    if (teslaCommandRequest != null) {
                        teslaCommandRequest.c("evaluation_done");
                    }
                    if (commandResult != null) {
                        strB = lb0.a.b(commandResult);
                    } else {
                        strB = null;
                    }
                    q0(this, teslaCommandRequest, "-> result: " + strB, null, 2, null);
                    if (teslaCommandRequest == null) {
                        p0(teslaCommandRequest, "-> no request found, doing nothing more.", com.tesla.logging.d.DEBUG);
                        strK = commandMessage.getRequest_txid().K();
                        if (!this.requestManager.j(strK)) {
                            if (strK.length() > 0) {
                                lb0.c.f89930a.b("no_request_associated_with_request_txid: " + strK);
                            } else {
                                to_destination = sc0.h.f111089m.decode(commandMessage.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String()).getTo_destination();
                                if (to_destination != null) {
                                    strH = ie0.n.h(routing_address);
                                }
                                if (strH != null) {
                                    lb0.c.f89930a.b("no_request_associated_with_request_uuid: " + strH);
                                }
                            }
                        }
                        return;
                    }
                    if (commandResult == null) {
                        p0(teslaCommandRequest, "-> command result was " + commandResult + " doing nothing more.", com.tesla.logging.d.DEBUG);
                        return;
                    }
                    teslaCommandRequest.s0();
                    teslaCommandRequest.C0(Long.valueOf(receivedBytesTimestamp));
                    if (requestId != null) {
                        fb0.n nVar2 = fb0.n.f64834a;
                        nVar2.c(requestId, decodeResult);
                        nVar2.f(teslaCommandRequest);
                    }
                    lT = teslaCommandRequest.t();
                    if (lT != null) {
                        q0(this, teslaCommandRequest, "-> " + lT.longValue() + " ms. wire duration: " + teslaCommandRequest.g0() + " ms", null, 2, null);
                    }
                    int i11 = teslaCommandRequest.getTotalRetryCount().get();
                    int i12 = teslaCommandRequest.getNominalRetryCount().get();
                    retryPolicyC = nb0.a.c(commandResult, getTransport(), teslaCommandRequest);
                    p0(teslaCommandRequest, "nominal retries: " + i12 + ", total retries: " + i11 + "  " + commandResult + ". retry policy => " + retryPolicyC, com.tesla.logging.d.DEBUG);
                    if (retryPolicyC.getRetry()) {
                        if (commandResult == ic0.h.RESULT_VEHICLE_INTERNAL_ERROR) {
                            hVar = commandResult;
                            s0(this, commandMessage, teslaCommandRequest, hVar, carServerErrorResultReason, genericNominalError, mapF, true);
                            teslaCommandRequest = teslaCommandRequest;
                        } else {
                            hVar = commandResult;
                        }
                        String strI = teslaCommandRequest.I();
                        teslaCommandRequest.i0(hVar);
                        q0(this, teslaCommandRequest, "incremented retry count to " + teslaCommandRequest.getTotalRetryCount().get() + ", old request id: " + strI, null, 2, null);
                        U(teslaCommandRequest, retryPolicyC.getDelayMilliseconds());
                    } else {
                        t0(this, commandMessage, teslaCommandRequest, commandResult, carServerErrorResultReason, genericNominalError, mapF, false, 128, null);
                        w0(teslaCommandRequest, commandResult, response, nominalErrorReason, genericNominalError);
                    }
                    h0 h0Var = h0.f84049a;
                    return;
                }
                if (request == null && request.getFinished()) {
                    if (!p013kotlin.jvm.internal.s.f(request.o(), "vehicle_data_subscription")) {
                        request.c("request finished.");
                        p0(request, "-> listener notified already, doing nothing more.", com.tesla.logging.d.DEBUG);
                    }
                    return;
                }
                if (request != null) {
                    request.c("evaluation_start");
                }
                try {
                    ed0.c.MessageEvaluationResult messageEvaluationResultA2 = gb0.b.a(ed0.c.f62814a, this.context, decodeResult, this.sessionInfoManager, this.requestManager, this.getVehicleData, this, vin, request, ic0.q.TRANSPORT_HERMES, this.tokenManager, this, this.featuresConfig);
                    teslaCommandRequest = request;
                    commandResult = messageEvaluationResultA2.getCommandResult();
                    response = messageEvaluationResultA2.getResponse();
                    nominalErrorReason = messageEvaluationResultA2.getNominalErrorReason();
                    genericNominalError = messageEvaluationResultA2.getGenericNominalError();
                    carServerErrorResultReason = messageEvaluationResultA2.getCarServerErrorResultReason();
                    mapF = messageEvaluationResultA2.f();
                    if (teslaCommandRequest != null) {
                        teslaCommandRequest.c("command_result=" + commandResult);
                    }
                    if (genericNominalError != null && teslaCommandRequest != null) {
                        teslaCommandRequest.c("generic_nominal_error=" + genericNominalError);
                    }
                    if (carServerErrorResultReason != null && teslaCommandRequest != null) {
                        teslaCommandRequest.c("car_server_error_result_reason=" + carServerErrorResultReason);
                    }
                    while (r1.hasNext()) {
                        key = entry.getKey();
                        value = entry.getValue();
                        if (teslaCommandRequest != null) {
                            teslaCommandRequest.c(key + "=" + value);
                        }
                    }
                    if (teslaCommandRequest != null) {
                        teslaCommandRequest.c("evaluation_done");
                    }
                    if (commandResult != null) {
                        strB = lb0.a.b(commandResult);
                    } else {
                        strB = null;
                    }
                    q0(this, teslaCommandRequest, "-> result: " + strB, null, 2, null);
                    if (teslaCommandRequest == null) {
                        p0(teslaCommandRequest, "-> no request found, doing nothing more.", com.tesla.logging.d.DEBUG);
                        strK = commandMessage.getRequest_txid().K();
                        if (!this.requestManager.j(strK)) {
                            if (strK.length() > 0) {
                                lb0.c.f89930a.b("no_request_associated_with_request_txid: " + strK);
                            } else {
                                try {
                                    to_destination = sc0.h.f111089m.decode(commandMessage.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String()).getTo_destination();
                                    if (to_destination != null && (routing_address = to_destination.getRouting_address()) != null) {
                                        strH = ie0.n.h(routing_address);
                                    }
                                    if (strH != null && !this.requestManager.j(strH)) {
                                        lb0.c.f89930a.b("no_request_associated_with_request_uuid: " + strH);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return;
                    }
                    if (commandResult == null) {
                        p0(teslaCommandRequest, "-> command result was " + commandResult + " doing nothing more.", com.tesla.logging.d.DEBUG);
                        return;
                    }
                    teslaCommandRequest.s0();
                    teslaCommandRequest.C0(Long.valueOf(receivedBytesTimestamp));
                    if (requestId != null) {
                        fb0.n nVar3 = fb0.n.f64834a;
                        nVar3.c(requestId, decodeResult);
                        nVar3.f(teslaCommandRequest);
                    }
                    lT = teslaCommandRequest.t();
                    if (lT != null) {
                        q0(this, teslaCommandRequest, "-> " + lT.longValue() + " ms. wire duration: " + teslaCommandRequest.g0() + " ms", null, 2, null);
                    }
                    int i13 = teslaCommandRequest.getTotalRetryCount().get();
                    int i14 = teslaCommandRequest.getNominalRetryCount().get();
                    retryPolicyC = nb0.a.c(commandResult, getTransport(), teslaCommandRequest);
                    p0(teslaCommandRequest, "nominal retries: " + i14 + ", total retries: " + i13 + "  " + commandResult + ". retry policy => " + retryPolicyC, com.tesla.logging.d.DEBUG);
                    if (retryPolicyC.getRetry()) {
                        if (commandResult == ic0.h.RESULT_VEHICLE_INTERNAL_ERROR) {
                            hVar = commandResult;
                            s0(this, commandMessage, teslaCommandRequest, hVar, carServerErrorResultReason, genericNominalError, mapF, true);
                            teslaCommandRequest = teslaCommandRequest;
                        } else {
                            hVar = commandResult;
                        }
                        try {
                            String strI2 = teslaCommandRequest.I();
                            teslaCommandRequest.i0(hVar);
                            q0(this, teslaCommandRequest, "incremented retry count to " + teslaCommandRequest.getTotalRetryCount().get() + ", old request id: " + strI2, null, 2, null);
                            U(teslaCommandRequest, retryPolicyC.getDelayMilliseconds());
                        } catch (RuntimeException e11) {
                            e = e11;
                            E.d("error when evaluate message", e);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        t0(this, commandMessage, teslaCommandRequest, commandResult, carServerErrorResultReason, genericNominalError, mapF, false, 128, null);
                        w0(teslaCommandRequest, commandResult, response, nominalErrorReason, genericNominalError);
                    }
                    h0 h0Var2 = h0.f84049a;
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }

    private static final void s0(m mVar, kc0.c cVar, TeslaCommandRequest teslaCommandRequest, ic0.h hVar, String str, jc0.a aVar, Map<String, String> map, boolean z11) {
        lb0.c cVar2 = lb0.c.f89930a;
        ic0.q transport = mVar.getTransport();
        cVar2.c(mVar.context, mVar.remoteLog, teslaCommandRequest, mVar.connectionId, mVar.getVehicleData, transport, hVar, (16640 & 128) != 0 ? null : kb0.g.f85866a.o(teslaCommandRequest.getVin()), (16640 & 256) != 0 ? null : Integer.valueOf(cVar.getStatus_code()), (16640 & 512) != 0 ? null : str, (16640 & 1024) != 0 ? null : aVar, (16640 & 2048) != 0 ? null : E, (16640 & 4096) != 0 ? null : map, (16640 & PKIFailureInfo.certRevoked) != 0 ? null : "response evaluated", (16640 & 16384) != 0 ? false : z11, (16640 & 32768) != 0 ? false : false);
    }

    static /* synthetic */ void t0(m mVar, kc0.c cVar, TeslaCommandRequest teslaCommandRequest, ic0.h hVar, String str, jc0.a aVar, Map map, boolean z11, int i11, Object obj) {
        s0(mVar, cVar, teslaCommandRequest, hVar, str, aVar, map, (i11 & 128) != 0 ? false : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(String reason, TeslaCommandRequest request, ic0.h result) {
        this.requestManager.k(request.q());
        if (request.getFinished()) {
            return;
        }
        q0(this, request, "finishing response as failure, reason: " + reason + ", command result: " + lb0.a.b(result), null, 2, null);
        String vin = request.getVin();
        lb0.c cVar = lb0.c.f89930a;
        ic0.q transport = getTransport();
        Context context = this.context;
        ud0.a aVar = this.remoteLog;
        String str = this.connectionId;
        be0.e eVar = this.getVehicleData;
        com.tesla.logging.g gVar = E;
        kb0.g gVar2 = kb0.g.f85866a;
        cVar.c(context, aVar, request, str, eVar, transport, result, (16640 & 128) != 0 ? null : gVar2.o(vin), (16640 & 256) != 0 ? null : null, (16640 & 512) != 0 ? null : null, (16640 & 1024) != 0 ? null : null, (16640 & 2048) != 0 ? null : gVar, (16640 & 4096) != 0 ? null : null, (16640 & PKIFailureInfo.certRevoked) != 0 ? null : reason, (16640 & 16384) != 0 ? false : false, (16640 & 32768) != 0 ? false : false);
        request.a(TeslaCommandRequest.h(request, ic0.q.TRANSPORT_HERMES, result, reason, null, gVar2.n(request.getVin()), null, 40, null));
    }

    static /* synthetic */ void v0(m mVar, String str, TeslaCommandRequest teslaCommandRequest, ic0.h hVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            hVar = ic0.h.RESULT_INTERNAL_ERROR;
        }
        mVar.u0(str, teslaCommandRequest, hVar);
    }

    private final void w0(TeslaCommandRequest request, ic0.h result, String response, String nominalErrorReason, jc0.a genericNominalError) {
        String strI = request.I();
        TeslaCommandRequest teslaCommandRequestI = this.requestManager.i(strI, request.q());
        if (!d1.i(ic0.h.RESULT_SUCCESS, ic0.h.RESULT_NOMINAL_ERROR).contains(result)) {
            lb0.c.f89930a.b("removed id: " + request.I() + ", removed request is null? " + (teslaCommandRequestI == null));
        }
        if (request.getFinished()) {
            q0(this, request, "request is already finished, not notifying listener", null, 2, null);
            return;
        }
        q0(this, request, "notifying listener command result: " + lb0.a.b(result), null, 2, null);
        request.a(ic0.g.b(request.g(ic0.q.TRANSPORT_HERMES, result, response, nominalErrorReason, kb0.g.f85866a.n(request.getVin()), genericNominalError), null, strI, null, null, null, 0, request.getHermesState(), 0L, 0L, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, null, null, 8388541, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(e to2) {
        synchronized (this) {
            try {
                E.j("WebSocket state: " + this.socketState + " -> " + to2);
                if (this.socketState == to2) {
                    return;
                }
                this.socketStateStream.onNext(to2);
                this.socketState = to2;
                e eVar = e.OPENED;
                if (to2 == eVar) {
                    H0(sc0.b.DOMAIN_VEHICLE_SECURITY);
                    H0(sc0.b.DOMAIN_INFOTAINMENT);
                    H0(sc0.b.DOMAIN_AUTHD);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("hermes_connected", to2 == eVar);
                writableNativeMap.putString("hermes_connection_id", this.connectionId);
                com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.HERMES_STATUS, writableNativeMap);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id0.a y0(TeslaCommandRequest request, byte[] requestTag, String vehicleKeyHex) {
        if (request != null && !request.M()) {
            return null;
        }
        if (requestTag != null && vehicleKeyHex != null) {
            return new j(request);
        }
        q0(this, request, "assuming no response decryption due null request or missing signing data.", null, 2, null);
        return null;
    }

    private final boolean z0(TeslaCommandRequest teslaRequest) {
        a1 vehicle_state;
        List<Integer> listT;
        Integer num;
        u5 u5VarD = this.getVehicleData.d(teslaRequest.getVin());
        if (u5VarD == null) {
            u0("could not find vehicle associated with request", teslaRequest, ic0.h.RESULT_VEHICLE_LOOKUP_FAILURE);
            return false;
        }
        Integer numG = wb0.e.g(u5VarD);
        if ((numG != null ? numG.intValue() : -1) < 23) {
            u0("vehicle car api version `" + wb0.e.g(u5VarD) + "` does not meet min car api version `23`", teslaRequest, ic0.h.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED);
            return false;
        }
        if (!teslaRequest.getTimeoutStarted()) {
            p0(teslaRequest, "starting timeout", com.tesla.logging.d.DEBUG);
            TeslaCommandRequest.L0(teslaRequest, 25, false, 2, null);
        }
        fb0.n nVar = fb0.n.f64834a;
        if (nVar.g(teslaRequest) == null && (vehicle_state = u5VarD.getVehicle_state()) != null && (listT = vehicle_state.t()) != null && (num = (Integer) p013kotlin.collections.v.q0(listT)) != null) {
            boolean z11 = (num.intValue() & (1 << gc0.v.MOBILE_APP_FEATURE_RESPONSE_CACHE.getValue())) > 0;
            E.j("vehicle " + u5VarD + ". has response caching feature? " + z11);
            nVar.d(teslaRequest, z11);
        }
        Boolean boolG = nVar.g(teslaRequest);
        if (boolG != null) {
            teslaRequest.getVehicleHasResponseCacheFeature().set(boolG.booleanValue());
        }
        return true;
    }

    @Override // mb0.a
    public void a(ic0.e request, ce0.d listener) {
        x4 streamMessage;
        fc0.s createStreamSession;
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        Context context = this.context;
        com.tesla.logging.g gVar = E;
        byte[] bArrD = ce0.c.d(request, context, gVar);
        if (bArrD == null) {
            listener.a(nb0.b.b(request, getTransport(), ic0.h.RESULT_SOURCE_PUBLIC_KEY_NOT_FOUND, null, null, null, 56, null));
            return;
        }
        TeslaCommandRequest teslaCommandRequest = new TeslaCommandRequest(request, listener, null, bArrD, ic0.q.TRANSPORT_HERMES, 4, null);
        g5 carServerAction = teslaCommandRequest.l().getCarServerAction();
        if (carServerAction != null && (createStreamSession = carServerAction.getCreateStreamSession()) != null) {
            if (createStreamSession.getSessionId().length() == 0) {
                teslaCommandRequest = TeslaCommandRequest.j(teslaCommandRequest, ic0.e.b(teslaCommandRequest.getRequest(), null, null, null, null, null, false, false, new ic0.c(new g5(null, null, new fc0.s(this.connectionId, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, -1, -1, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null), null, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, null, 4194175, null), null, null, null, null, 30, null);
            }
            h0 h0Var = h0.f84049a;
        }
        TeslaCommandRequest teslaCommandRequestJ = teslaCommandRequest;
        g5 carServerAction2 = teslaCommandRequestJ.l().getCarServerAction();
        if (carServerAction2 != null && (streamMessage = carServerAction2.getStreamMessage()) != null) {
            if (streamMessage.getSessionId().length() == 0) {
                teslaCommandRequestJ = TeslaCommandRequest.j(teslaCommandRequestJ, ic0.e.b(teslaCommandRequestJ.getRequest(), null, null, null, null, null, false, false, new ic0.c(new g5(null, null, null, x4.b(streamMessage, this.connectionId, null, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null), null, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, null, 4194175, null), null, null, null, null, 30, null);
            }
            h0 h0Var2 = h0.f84049a;
        }
        teslaCommandRequestJ.t0();
        teslaCommandRequestJ.e(new wn0.l() { // from class: fb0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m.B0(this.f64737a, (TeslaCommandRequest) obj);
            }
        });
        ic0.c action = request.getAction();
        if (action != null && CommandActionsKt.isCalendarSync(action) && !request.getLetSleep()) {
            String str = "Calendar sync request with `letSleep=false`, source=" + request.getSource();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        try {
            if (z0(teslaCommandRequestJ)) {
                K0(teslaCommandRequestJ);
                U(teslaCommandRequestJ, 0L);
            }
        } catch (Exception e11) {
            E.d(AnalyticsAttribute.Error, e11);
            v0(this, "exception thrown: " + e11.getMessage(), teslaCommandRequestJ, null, 4, null);
        }
    }

    @Override // ed0.a
    public void b(com.tesla.logging.a.EnumC1131a event, ed0.d payload) throws JSONException {
        WritableMap writableMapA;
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(payload, "payload");
        if (payload instanceof ed0.d.JsonPayload) {
            writableMapA = ie0.v.b(((ed0.d.JsonPayload) payload).getJson());
        } else {
            if (!(payload instanceof ed0.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            writableMapA = ((ed0.d.b) payload).a();
        }
        com.tesla.logging.a.b(event, writableMapA);
    }

    @Override // mb0.a
    public void c(ic0.e request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        TeslaCommandRequest teslaCommandRequestK = this.requestManager.k(de0.b.a(request));
        if (teslaCommandRequestK != null) {
            if (teslaCommandRequestK.getFinished()) {
                p0(teslaCommandRequestK, "failed to cancel, request already finished", com.tesla.logging.d.DEBUG);
                return;
            } else {
                p0(teslaCommandRequestK, "canceling request as result timeout.", com.tesla.logging.d.DEBUG);
                teslaCommandRequestK.N0();
                return;
            }
        }
        E.a("failed to cancel " + ce0.c.b(request) + ", no request found");
    }

    public final void c0() {
        if (!this.socketState.isOpeningOrOpened()) {
            E.j("connectIfNeeded: triggering hermes connection on-demand");
            this.hermesConnectionBackoff.d();
            return;
        }
        E.a("connectIfNeeded: already connected or connecting, state=" + this.socketState);
    }

    @Override // mb0.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public ic0.q getTransport() {
        return this.transport;
    }

    public final void j0(String vin) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        Map<String, wn0.a<h0>> map = this.retries.get(vin);
        if (map != null) {
            for (Map.Entry<String, wn0.a<h0>> entry : map.entrySet()) {
                String key = entry.getKey();
                wn0.a<h0> value = entry.getValue();
                E.j("executing retry for request " + key + " " + vin);
                value.invoke();
            }
        }
        Map<String, wn0.a<h0>> map2 = this.retries.get(vin);
        if (map2 != null) {
            map2.clear();
        }
    }

    private m(ud0.a aVar, be0.e eVar, pa0.d dVar, jb0.b bVar, jb0.d dVar2, ce0.h hVar, ee0.a aVar2, he0.b bVar2, Context context, FeaturesConfig featuresConfig, ie0.f fVar, fd0.k kVar, AuthRepository authRepository) {
        this.remoteLog = aVar;
        this.getVehicleData = eVar;
        this.analyticsService = dVar;
        this.getToken = bVar;
        this.getVehicleToken = dVar2;
        this.requestManager = hVar;
        this.sessionInfoManager = aVar2;
        this.teslaClient = bVar2;
        this.context = context;
        this.featuresConfig = featuresConfig;
        this.appState = fVar;
        this.routableMessageBuilder = kVar;
        this.authRepository = authRepository;
        wm0.e eVarB0 = wm0.c.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB0, "toSerialized(...)");
        this.initializeHermesRequest = eVarB0;
        wm0.e eVarB1 = wm0.a.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB1, "toSerialized(...)");
        this.onGoingRequests = eVarB1;
        wm0.e eVarB2 = wm0.b.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB2, "toSerialized(...)");
        this.hermesSocketOpened = eVarB2;
        this.transport = ic0.q.TRANSPORT_HERMES;
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        this.connectionId = string;
        this.socketState = e.CLOSED;
        wm0.e eVarB3 = wm0.f.c0().b0();
        p013kotlin.jvm.internal.s.j(eVarB3, "toSerialized(...)");
        this.socketStateStream = eVarB3;
        wm0.e eVarB4 = wm0.f.c0().b0();
        p013kotlin.jvm.internal.s.j(eVarB4, "toSerialized(...)");
        this.commandRequests = eVarB4;
        am0.b bVarEmpty = am0.b.empty();
        p013kotlin.jvm.internal.s.j(bVarEmpty, "empty(...)");
        this.commandRequestsDisposable = bVarEmpty;
        wm0.e eVarB5 = wm0.f.c0().b0();
        p013kotlin.jvm.internal.s.j(eVarB5, "toSerialized(...)");
        this.socketMessages = eVarB5;
        am0.b bVarEmpty2 = am0.b.empty();
        p013kotlin.jvm.internal.s.j(bVarEmpty2, "empty(...)");
        this.socketMessagesDisposable = bVarEmpty2;
        this.hermesFeatureConfig = featuresConfig.getSignaling();
        this.hermesConnectionBackoff = new ie0.p(0L, null, new wn0.a() { // from class: fb0.d
            @Override // wn0.a
            public final Object invoke() {
                return m.m0(this.f64741a);
            }
        }, null, 11, null);
        this.tokenManager = new b0();
        L0();
        Q0();
        P0();
        O0();
        N0();
        this.retries = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: fb0.m$d, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lfb0/m$d;", "", "Lkc0/d;", "message", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "decodedMessageResult", "", "receivedBytesTimestamp", "<init>", "(Lkc0/d;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;J)V", "a", "()Lkc0/d;", "b", "()Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "c", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkc0/d;", "getMessage", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "getDecodedMessageResult", "J", "getReceivedBytesTimestamp", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class SocketMessageResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kc0.d message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CommandMessageDecoder.Result decodedMessageResult;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long receivedBytesTimestamp;

        public SocketMessageResult(kc0.d message, CommandMessageDecoder.Result result, long j11) {
            p013kotlin.jvm.internal.s.k(message, "message");
            this.message = message;
            this.decodedMessageResult = result;
            this.receivedBytesTimestamp = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final kc0.d getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CommandMessageDecoder.Result getDecodedMessageResult() {
            return this.decodedMessageResult;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getReceivedBytesTimestamp() {
            return this.receivedBytesTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocketMessageResult)) {
                return false;
            }
            SocketMessageResult socketMessageResult = (SocketMessageResult) other;
            return p013kotlin.jvm.internal.s.f(this.message, socketMessageResult.message) && p013kotlin.jvm.internal.s.f(this.decodedMessageResult, socketMessageResult.decodedMessageResult) && this.receivedBytesTimestamp == socketMessageResult.receivedBytesTimestamp;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            CommandMessageDecoder.Result result = this.decodedMessageResult;
            return ((iHashCode + (result == null ? 0 : result.hashCode())) * 31) + Long.hashCode(this.receivedBytesTimestamp);
        }

        public String toString() {
            return "SocketMessageResult(message=" + this.message + ", decodedMessageResult=" + this.decodedMessageResult + ", receivedBytesTimestamp=" + this.receivedBytesTimestamp + ")";
        }

        public /* synthetic */ SocketMessageResult(kc0.d dVar, CommandMessageDecoder.Result result, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i11 & 2) != 0 ? null : result, (i11 & 4) != 0 ? System.currentTimeMillis() : j11);
        }
    }
}
