package com.tesla.TeslaV4.reactnative.module;

import ab0.MetrologyValidationResult;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ChargingMetrologyModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "", "getUptime", "()D", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "verifyMeterData", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getPublicKeyFromCert", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChargingMetrologyModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ab0.c validation = new ab0.c();
    private static final List<String> knownPins = p013kotlin.collections.v.e("74YLQNswhuCwXpyv8H83IGoc/BzmhS2NNA1v3as9OD4=");

    /* JADX INFO: renamed from: com.tesla.TeslaV4.reactnative.module.ChargingMetrologyModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ChargingMetrologyModule$a;", "", "<init>", "()V", "", "base64String", "", "b", "(Ljava/lang/String;)[B", "Lab0/c;", "validation", "Lab0/c;", "", "knownPins", "Ljava/util/List;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] b(String base64String) {
            try {
                return Base64.decode(base64String, 0);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargingMetrologyModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        try {
            InputStream inputStreamOpen = getReactApplicationContext().getAssets().open("shared/ChargingMetrology.checksum");
            p013kotlin.jvm.internal.s.j(inputStreamOpen, "open(...)");
            return v0.o(jn0.x.a("DISPLAY_VERSION", p013kotlin.text.t.F1(new String(sn0.a.c(inputStreamOpen), p013kotlin.text.d.UTF_8)).toString()));
        } catch (Exception unused) {
            return v0.o(jn0.x.a("DISPLAY_VERSION", ""));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ChargingMetrologyModule";
    }

    @ReactMethod
    public final void getPublicKeyFromCert(ReadableMap params, Promise promise) {
        p013kotlin.jvm.internal.s.k(params, "params");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            String string = params.getString("dataBytes");
            if (string == null) {
                promise.reject("INVALID_PARAM", "dataBytes cannot be null");
                return;
            }
            byte[] bArrB = INSTANCE.b(string);
            if (bArrB == null) {
                promise.reject("DECODE_ERROR", "unable to decode dataBytes");
                return;
            }
            PublicKey publicKey = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrB)).getPublicKey();
            p013kotlin.jvm.internal.s.j(publicKey, "getPublicKey(...)");
            promise.resolve(ab0.a.e(publicKey));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final double getUptime() {
        return SystemClock.elapsedRealtimeNanos() / 1.0E9d;
    }

    @ReactMethod
    public final void verifyMeterData(ReadableMap params, Promise promise) {
        p013kotlin.jvm.internal.s.k(params, "params");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        String string = params.getString("dataBytes");
        if (string == null) {
            promise.reject("INVALID_PARAM", "dataBytes cannot be null");
            return;
        }
        String string2 = params.getString("signature");
        if (string2 == null) {
            promise.reject("INVALID_PARAM", "rValueBytes cannot be null");
            return;
        }
        String string3 = params.getString("certChain");
        if (string3 == null) {
            promise.reject("INVALID_PARAM", "certChain cannot be null");
            return;
        }
        try {
            Companion companion = INSTANCE;
            byte[] bArrB = companion.b(string);
            if (bArrB == null) {
                promise.reject("DECODE_ERROR", "unable to decode dataBytes");
                return;
            }
            byte[] bArrB2 = companion.b(string2);
            if (bArrB2 == null) {
                promise.reject("DECODE_ERROR", "unable to decode signatureBytes");
                return;
            }
            MetrologyValidationResult metrologyValidationResultA = validation.a(bArrB, knownPins, bArrB2, string3);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("verified", metrologyValidationResultA.getVerified());
            writableMapCreateMap.putString("data", metrologyValidationResultA.getJson());
            writableMapCreateMap.putString("publicKey", metrologyValidationResultA.getPublicKey());
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}
