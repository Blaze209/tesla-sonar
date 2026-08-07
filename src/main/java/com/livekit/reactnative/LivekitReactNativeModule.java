package com.livekit.reactnative;

import android.media.AudioAttributes;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.oney.WebRTCModule.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrackSink;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioTrackHelper;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import rf0.c;
import wy.b;
import xy.a;
import xy.h;
import yy.d;
import yy.e;
import yy.j;
import yy.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\u001cJ'\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010 J'\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b&\u0010 J\u0019\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u000fR\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/livekit/reactnative/LivekitReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", "configureAudio", "(Lcom/facebook/react/bridge/ReadableMap;)V", "startAudioSession", "()V", "stopAudioSession", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getAudioOutputs", "(Lcom/facebook/react/bridge/Promise;)V", "deviceId", "selectAudioOutput", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "pcId", "trackId", "createAudioSinkListener", "(ILjava/lang/String;)Ljava/lang/String;", "reactTag", "", "deleteAudioSinkListener", "(Ljava/lang/String;ILjava/lang/String;)Z", "createVolumeProcessor", "deleteVolumeProcessor", "options", "createMultibandVolumeProcessor", "(Lcom/facebook/react/bridge/ReadableMap;ILjava/lang/String;)Ljava/lang/String;", "deleteMultibandVolumeProcessor", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(Ljava/lang/Integer;)V", "", "volume", "setDefaultAudioTrackVolume", "(D)V", "invalidate", "Lyy/d;", "audioSinkManager", "Lyy/d;", "getAudioSinkManager", "()Lyy/d;", "Lxy/h;", "audioManager", "Lxy/h;", "getAudioManager", "()Lxy/h;", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LivekitReactNativeModule extends ReactContextBaseJavaModule {
    private final h audioManager;
    private final d audioSinkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivekitReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.audioSinkManager = new d(reactContext);
        this.audioManager = new h(reactContext.getApplicationContext());
    }

    @ReactMethod
    public final void addListener(String eventName) {
    }

    @ReactMethod
    public final void configureAudio(ReadableMap config) {
        ReadableMap map;
        String string;
        Integer numA;
        String string2;
        Integer numB;
        String string3;
        Integer numD;
        String string4;
        Integer numE;
        String string5;
        Integer numC;
        ReadableArray array;
        s.k(config, "config");
        ReadableMap map2 = config.getMap("android");
        if (map2 == null) {
            return;
        }
        if (map2.hasKey("preferredOutputList") && (array = map2.getArray("preferredOutputList")) != null) {
            ArrayList<Object> arrayList = array.toArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                a aVarFromTypeName = a.fromTypeName(obj instanceof String ? (String) obj : null);
                Class<? extends c> cls = aVarFromTypeName != null ? aVarFromTypeName.audioDeviceClass : null;
                if (cls != null) {
                    arrayList2.add(cls);
                }
            }
            this.audioManager.f124070f = arrayList2;
        }
        if (!map2.hasKey("audioTypeOptions") || (map = map2.getMap("audioTypeOptions")) == null) {
            return;
        }
        JavaAudioDeviceModule javaAudioDeviceModuleB = b.f122420a.b();
        WebRtcAudioTrackHelper webRtcAudioTrackHelper = WebRtcAudioTrackHelper.INSTANCE;
        AudioAttributes.Builder builder = new AudioAttributes.Builder(webRtcAudioTrackHelper.getAudioOutputAttributes(javaAudioDeviceModuleB));
        if (map.hasKey("manageAudioFocus")) {
            this.audioManager.r(map.getBoolean("manageAudioFocus"));
        }
        if (map.hasKey("audioMode") && (string5 = map.getString("audioMode")) != null && (numC = xy.b.f124060a.c(string5)) != null) {
            this.audioManager.n(numC.intValue());
        }
        if (map.hasKey("audioFocusMode") && (string4 = map.getString("audioFocusMode")) != null && (numE = xy.b.f124060a.e(string4)) != null) {
            this.audioManager.p(numE.intValue());
        }
        if (map.hasKey("audioStreamType") && (string3 = map.getString("audioStreamType")) != null && (numD = xy.b.f124060a.d(string3)) != null) {
            this.audioManager.o(numD.intValue());
        }
        if (map.hasKey("audioAttributesUsageType") && (string2 = map.getString("audioAttributesUsageType")) != null && (numB = xy.b.f124060a.b(string2)) != null) {
            this.audioManager.m(numB.intValue());
            builder.setUsage(numB.intValue());
        }
        if (map.hasKey("audioAttributesContentType") && (string = map.getString("audioAttributesContentType")) != null && (numA = xy.b.f124060a.a(string)) != null) {
            this.audioManager.l(numA.intValue());
            builder.setContentType(numA.intValue());
        }
        if (map.hasKey("forceHandleAudioRouting")) {
            this.audioManager.q(map.getBoolean("forceHandleAudioRouting"));
        }
        AudioAttributes audioAttributesBuild = builder.build();
        s.j(audioAttributesBuild, "build(...)");
        webRtcAudioTrackHelper.setAudioOutputAttributes(javaAudioDeviceModuleB, audioAttributesBuild);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String createAudioSinkListener(int pcId, String trackId) {
        s.k(trackId, "trackId");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        e eVar = new e(reactApplicationContext);
        String strE = this.audioSinkManager.e(eVar);
        this.audioSinkManager.a(eVar, pcId, trackId);
        eVar.b(strE);
        return strE;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String createMultibandVolumeProcessor(ReadableMap options, int pcId, String trackId) {
        s.k(options, "options");
        s.k(trackId, "trackId");
        int i11 = options.getInt("bands");
        double d11 = options.getDouble("minFrequency");
        double d12 = options.getDouble("maxFrequency");
        double d13 = options.getDouble("updateInterval");
        io0.b.Companion companion = io0.b.INSTANCE;
        long jR = io0.d.r(d13, io0.e.MILLISECONDS);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        j jVar = new j((float) d11, (float) d12, i11, jR, reactApplicationContext, null);
        String strE = this.audioSinkManager.e(jVar);
        jVar.j(strE);
        this.audioSinkManager.a(jVar, pcId, trackId);
        jVar.h();
        return strE;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String createVolumeProcessor(int pcId, String trackId) {
        s.k(trackId, "trackId");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        l lVar = new l(reactApplicationContext);
        String strE = this.audioSinkManager.e(lVar);
        this.audioSinkManager.a(lVar, pcId, trackId);
        lVar.b(strE);
        return strE;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean deleteAudioSinkListener(String reactTag, int pcId, String trackId) {
        s.k(reactTag, "reactTag");
        s.k(trackId, "trackId");
        this.audioSinkManager.b(reactTag, pcId, trackId);
        this.audioSinkManager.f(reactTag);
        return true;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean deleteMultibandVolumeProcessor(String reactTag, int pcId, String trackId) {
        s.k(reactTag, "reactTag");
        s.k(trackId, "trackId");
        AudioTrackSink audioTrackSinkD = this.audioSinkManager.d(reactTag);
        if (audioTrackSinkD == null) {
            throw new IllegalArgumentException("Can't find volume processor for " + reactTag);
        }
        this.audioSinkManager.c(audioTrackSinkD, pcId, trackId);
        this.audioSinkManager.g(audioTrackSinkD);
        j jVar = audioTrackSinkD instanceof j ? (j) audioTrackSinkD : null;
        if (jVar != null) {
            jVar.g();
            return true;
        }
        Log.w(getName(), "deleteMultibandVolumeProcessor called, but non-MultibandVolumeProcessor found?!");
        return false;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean deleteVolumeProcessor(String reactTag, int pcId, String trackId) {
        s.k(reactTag, "reactTag");
        s.k(trackId, "trackId");
        this.audioSinkManager.b(reactTag, pcId, trackId);
        this.audioSinkManager.f(reactTag);
        return true;
    }

    public final h getAudioManager() {
        return this.audioManager;
    }

    @ReactMethod
    public final void getAudioOutputs(Promise promise) {
        s.k(promise, "promise");
        List<c> listF = this.audioManager.f();
        s.j(listF, "availableAudioDevices(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            a aVarFromAudioDevice = a.fromAudioDevice((c) it.next());
            String str = aVarFromAudioDevice != null ? aVarFromAudioDevice.typeName : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        promise.resolve(Arguments.makeNativeArray((List) arrayList));
    }

    public final d getAudioSinkManager() {
        return this.audioSinkManager;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LivekitReactNativeModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        b bVar = b.f122420a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        bVar.d(reactApplicationContext);
    }

    @ReactMethod
    public final void removeListeners(Integer count) {
    }

    @ReactMethod
    public final void selectAudioOutput(String deviceId, Promise promise) {
        s.k(deviceId, "deviceId");
        s.k(promise, "promise");
        this.audioManager.k(a.fromTypeName(deviceId));
        promise.resolve(null);
    }

    @ReactMethod
    public final void setDefaultAudioTrackVolume(double volume) {
        r2.a().f46079i = volume;
    }

    @ReactMethod
    public final void startAudioSession() {
        this.audioManager.s();
    }

    @ReactMethod
    public final void stopAudioSession() {
        this.audioManager.t();
    }
}
