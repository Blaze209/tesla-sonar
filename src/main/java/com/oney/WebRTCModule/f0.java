package com.oney.WebRTCModule;

import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.webrtc.FrameCryptor;
import org.webrtc.FrameCryptorAlgorithm;
import org.webrtc.FrameCryptorFactory;
import org.webrtc.FrameCryptorKeyProvider;

/* JADX INFO: loaded from: classes6.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, FrameCryptor> f45924a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f45925b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, FrameCryptorKeyProvider> f45926c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WebRTCModule f45927d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45928a;

        static {
            int[] iArr = new int[FrameCryptor.FrameCryptionState.values().length];
            f45928a = iArr;
            try {
                iArr[FrameCryptor.FrameCryptionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.DECRYPTIONFAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.ENCRYPTIONFAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.INTERNALERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.KEYRATCHETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45928a[FrameCryptor.FrameCryptionState.MISSINGKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    class b implements FrameCryptor.Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45929a;

        public b(String str) {
            this.f45929a = str;
        }

        private String a(FrameCryptor.FrameCryptionState frameCryptionState) {
            switch (a.f45928a[frameCryptionState.ordinal()]) {
                case 1:
                    return "new";
                case 2:
                    return "ok";
                case 3:
                    return "decryptionFailed";
                case 4:
                    return "encryptionFailed";
                case 5:
                    return "internalError";
                case 6:
                    return "keyRatcheted";
                case 7:
                    return "missingKey";
                default:
                    throw new IllegalArgumentException("Unknown FrameCryptorErrorState: " + frameCryptionState);
            }
        }

        @Override // org.webrtc.FrameCryptor.Observer
        public void onFrameCryptionStateChanged(String str, FrameCryptor.FrameCryptionState frameCryptionState) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("event", "frameCryptionStateChanged");
            writableMapCreateMap.putString("participantId", str);
            writableMapCreateMap.putString("state", a(frameCryptionState));
            writableMapCreateMap.putString("frameCryptorId", this.f45929a);
            f0.this.s("frameCryptionStateChanged", writableMapCreateMap);
        }
    }

    public f0(WebRTCModule webRTCModule) {
        this.f45927d = webRTCModule;
    }

    private FrameCryptorAlgorithm b(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? FrameCryptorAlgorithm.AES_GCM : FrameCryptorAlgorithm.AES_CBC;
        }
        return FrameCryptorAlgorithm.AES_GCM;
    }

    private byte[] j(ReadableMap readableMap, String str, String str2) {
        if (readableMap.getBoolean(str2)) {
            return Base64.decode(readableMap.getString(str), 0);
        }
        String string = readableMap.getString(str);
        Objects.requireNonNull(string);
        return string.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(String str, WritableMap writableMap) {
        this.f45927d.sendEvent(str, writableMap);
    }

    public void c(ReadableMap readableMap, @NonNull Promise promise) {
        String string = readableMap.getString("frameCryptorId");
        FrameCryptor frameCryptor = this.f45924a.get(string);
        if (frameCryptor == null) {
            promise.reject("frameCryptorDisposeFailed", "frameCryptor not found", (Throwable) null);
            return;
        }
        frameCryptor.dispose();
        this.f45924a.remove(string);
        this.f45925b.remove(string);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", "success");
        promise.resolve(writableMapCreateMap);
    }

    public String d(ReadableMap readableMap) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            Log.w("RTCFrameCryptor", "frameCryptorFactoryCreateFrameCryptorFailed: keyProvider not found");
            return null;
        }
        d0 peerConnectionObserver = this.f45927d.getPeerConnectionObserver(readableMap.getInt("peerConnectionId"));
        if (peerConnectionObserver == null) {
            Log.w("RTCFrameCryptor", "frameCryptorFactoryCreateFrameCryptorFailed: peerConnection not found");
            return null;
        }
        String string = readableMap.getString("participantId");
        String string2 = readableMap.getString("type");
        int i11 = readableMap.getInt("algorithm");
        String string3 = readableMap.getString("rtpSenderId");
        String string4 = readableMap.getString("rtpReceiverId");
        if (string2 == null || !(string2.equals("sender") || string2.equals("receiver"))) {
            Log.w("RTCFrameCryptor", "frameCryptorFactoryCreateFrameCryptorFailed: type must be sender or receiver");
            return null;
        }
        if (string2.equals("sender")) {
            FrameCryptor frameCryptorCreateFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.f45927d.mFactory, peerConnectionObserver.x(string3), string, b(i11), frameCryptorKeyProvider);
            String string5 = UUID.randomUUID().toString();
            this.f45924a.put(string5, frameCryptorCreateFrameCryptorForRtpSender);
            b bVar = new b(string5);
            frameCryptorCreateFrameCryptorForRtpSender.setObserver(bVar);
            this.f45925b.put(string5, bVar);
            return string5;
        }
        FrameCryptor frameCryptorCreateFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.f45927d.mFactory, peerConnectionObserver.w(string4), string, b(i11), frameCryptorKeyProvider);
        String string6 = UUID.randomUUID().toString();
        this.f45924a.put(string6, frameCryptorCreateFrameCryptorForRtpReceiver);
        b bVar2 = new b(string6);
        frameCryptorCreateFrameCryptorForRtpReceiver.setObserver(bVar2);
        this.f45925b.put(string6, bVar2);
        return string6;
    }

    public String e(ReadableMap readableMap) {
        String string = UUID.randomUUID().toString();
        if (readableMap == null) {
            Log.w("RTCFrameCryptor", "frameCryptorFactoryCreateKeyProvider: keyProviderOptions is null!");
            return null;
        }
        boolean z11 = readableMap.getBoolean("sharedKey");
        int i11 = readableMap.getInt("ratchetWindowSize");
        int i12 = readableMap.getInt("failureTolerance");
        byte[] bArrJ = j(readableMap, "ratchetSalt", "ratchetSaltIsBase64");
        byte[] bArrDecode = new byte[0];
        if (readableMap.hasKey("uncryptedMagicBytes")) {
            bArrDecode = Base64.decode(readableMap.getString("uncryptedMagicBytes"), 0);
        }
        this.f45926c.put(string, FrameCryptorFactory.createFrameCryptorKeyProvider(z11, bArrJ, i11, bArrDecode, i12, readableMap.getInt("keyRingSize"), readableMap.getBoolean("discardFrameWhenCryptorNotReady")));
        return string;
    }

    public void f(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptor frameCryptor = this.f45924a.get(readableMap.getString("frameCryptorId"));
        if (frameCryptor == null) {
            promise.reject("frameCryptorGetEnabledFailed", "frameCryptor not found", (Throwable) null);
            return;
        }
        boolean zIsEnabled = frameCryptor.isEnabled();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("enabled", zIsEnabled);
        promise.resolve(writableMapCreateMap);
    }

    public void g(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptor frameCryptor = this.f45924a.get(readableMap.getString("frameCryptorId"));
        if (frameCryptor == null) {
            promise.reject("frameCryptorGetKeyIndexFailed", "frameCryptor not found", (Throwable) null);
            return;
        }
        int keyIndex = frameCryptor.getKeyIndex();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("keyIndex", keyIndex);
        promise.resolve(writableMapCreateMap);
    }

    public void h(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptor frameCryptor = this.f45924a.get(readableMap.getString("frameCryptorId"));
        if (frameCryptor == null) {
            promise.reject("frameCryptorSetEnabledFailed", "frameCryptor not found", (Throwable) null);
            return;
        }
        boolean z11 = readableMap.getBoolean("enabled");
        frameCryptor.setEnabled(z11);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("result", z11);
        promise.resolve(writableMapCreateMap);
    }

    public void i(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptor frameCryptor = this.f45924a.get(readableMap.getString("frameCryptorId"));
        if (frameCryptor == null) {
            promise.reject("frameCryptorSetKeyIndexFailed", "frameCryptor not found", (Throwable) null);
            return;
        }
        frameCryptor.setKeyIndex(readableMap.getInt("keyIndex"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("result", true);
        promise.resolve(writableMapCreateMap);
    }

    public void k(ReadableMap readableMap, @NonNull Promise promise) {
        String string = readableMap.getString("keyProviderId");
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(string);
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderDisposeFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        frameCryptorKeyProvider.dispose();
        this.f45926c.remove(string);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", "success");
        promise.resolve(writableMapCreateMap);
    }

    public void l(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderExportKeyFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        byte[] bArrExportKey = frameCryptorKeyProvider.exportKey(readableMap.getString("participantId"), readableMap.getInt("keyIndex"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", Base64.encodeToString(bArrExportKey, 0));
        promise.resolve(writableMapCreateMap);
    }

    public void m(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderExportSharedKeyFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        byte[] bArrExportSharedKey = frameCryptorKeyProvider.exportSharedKey(readableMap.getInt("keyIndex"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", Base64.encodeToString(bArrExportSharedKey, 0));
        promise.resolve(writableMapCreateMap);
    }

    public void n(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderSetKeysFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        byte[] bArrRatchetKey = frameCryptorKeyProvider.ratchetKey(readableMap.getString("participantId"), readableMap.getInt("keyIndex"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", Base64.encodeToString(bArrRatchetKey, 0));
        promise.resolve(writableMapCreateMap);
    }

    public void o(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderRatchetSharedKeyFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        byte[] bArrRatchetSharedKey = frameCryptorKeyProvider.ratchetSharedKey(readableMap.getInt("keyIndex"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("result", Base64.encodeToString(bArrRatchetSharedKey, 0));
        promise.resolve(writableMapCreateMap);
    }

    public void p(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderSetKeyFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        frameCryptorKeyProvider.setKey(readableMap.getString("participantId"), readableMap.getInt("keyIndex"), j(readableMap, Action.KEY_ATTRIBUTE, "keyIsBase64"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("result", true);
        promise.resolve(writableMapCreateMap);
    }

    public void q(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderSetKeySharedFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        frameCryptorKeyProvider.setSharedKey(readableMap.getInt("keyIndex"), j(readableMap, Action.KEY_ATTRIBUTE, "keyIsBase64"));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("result", true);
        promise.resolve(writableMapCreateMap);
    }

    public void r(ReadableMap readableMap, @NonNull Promise promise) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.f45926c.get(readableMap.getString("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            promise.reject("keyProviderSetSifTrailerFailed", "keyProvider not found", (Throwable) null);
            return;
        }
        frameCryptorKeyProvider.setSifTrailer(Base64.decode(readableMap.getString("sifTrailer"), 0));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("result", true);
        promise.resolve(writableMapCreateMap);
    }
}
