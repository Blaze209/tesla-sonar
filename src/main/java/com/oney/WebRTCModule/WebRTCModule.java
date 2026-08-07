package com.oney.WebRTCModule;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.webrtc.AddIceObserver;
import org.webrtc.AudioProcessingFactory;
import org.webrtc.AudioTrack;
import org.webrtc.CryptoOptions;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoTrack;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "WebRTCModule")
public class WebRTCModule extends ReactContextBaseJavaModule {
    static final String TAG = "com.oney.WebRTCModule.WebRTCModule";
    f0 frameCryptor;
    private final o getUserMediaImpl;
    final Map<String, MediaStream> localStreams;
    AudioDeviceModule mAudioDeviceModule;
    PeerConnectionFactory mFactory;
    private final SparseArray<d0> mPeerConnectionObservers;
    VideoDecoderFactory mVideoDecoderFactory;
    VideoEncoderFactory mVideoEncoderFactory;

    class a implements SdpObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f45808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PeerConnection f45809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f45810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f45811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f45812e;

        a(Promise promise, PeerConnection peerConnection, List list, d0 d0Var, int i11) {
            this.f45808a = promise;
            this.f45809b = peerConnection;
            this.f45810c = list;
            this.f45811d = d0Var;
            this.f45812e = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(SessionDescription sessionDescription, PeerConnection peerConnection, List list, d0 d0Var, int i11, Promise promise) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("sdp", sessionDescription.description);
            writableMapCreateMap2.putString("type", sessionDescription.type.canonicalForm());
            writableMapCreateMap.putArray("transceiversInfo", WebRTCModule.this.getTransceiversInfo(peerConnection));
            writableMapCreateMap.putMap("sdpInfo", writableMapCreateMap2);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
                if (!list.contains(rtpTransceiver.getReceiver().id())) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("transceiverOrder", d0Var.u());
                    writableMapCreateMap3.putMap("transceiver", o0.s(i11, rtpTransceiver));
                    writableArrayCreateArray.pushMap(writableMapCreateMap3);
                }
            }
            writableMapCreateMap.putArray("newTransceivers", writableArrayCreateArray);
            promise.resolve(writableMapCreateMap);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(final String str) {
            final Promise promise = this.f45808a;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.h2
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("E_OPERATION_ERROR", str);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(final SessionDescription sessionDescription) {
            final PeerConnection peerConnection = this.f45809b;
            final List list = this.f45810c;
            final d0 d0Var = this.f45811d;
            final int i11 = this.f45812e;
            final Promise promise = this.f45808a;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.i2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45967a.c(sessionDescription, peerConnection, list, d0Var, i11, promise);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
        }
    }

    class b implements SdpObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f45814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PeerConnection f45815b;

        b(Promise promise, PeerConnection peerConnection) {
            this.f45814a = promise;
            this.f45815b = peerConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(SessionDescription sessionDescription, PeerConnection peerConnection, Promise promise) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("sdp", sessionDescription.description);
            writableMapCreateMap2.putString("type", sessionDescription.type.canonicalForm());
            writableMapCreateMap.putArray("transceiversInfo", WebRTCModule.this.getTransceiversInfo(peerConnection));
            writableMapCreateMap.putMap("sdpInfo", writableMapCreateMap2);
            promise.resolve(writableMapCreateMap);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(final String str) {
            final Promise promise = this.f45814a;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.j2
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("E_OPERATION_ERROR", str);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(final SessionDescription sessionDescription) {
            final PeerConnection peerConnection = this.f45815b;
            final Promise promise = this.f45814a;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.k2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45986a.c(sessionDescription, peerConnection, promise);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
        }
    }

    class c implements SdpObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PeerConnection f45817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f45818b;

        c(PeerConnection peerConnection, Promise promise) {
            this.f45817a = peerConnection;
            this.f45818b = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(PeerConnection peerConnection, Promise promise) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            SessionDescription localDescription = peerConnection.getLocalDescription();
            if (localDescription != null) {
                writableMapCreateMap.putString("type", localDescription.type.canonicalForm());
                writableMapCreateMap.putString("sdp", localDescription.description);
            }
            writableMapCreateMap2.putMap("sdpInfo", writableMapCreateMap);
            writableMapCreateMap2.putArray("transceiversInfo", WebRTCModule.this.getTransceiversInfo(peerConnection));
            promise.resolve(writableMapCreateMap2);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(final String str) {
            final Promise promise = this.f45818b;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.m2
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("E_OPERATION_ERROR", str);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            final PeerConnection peerConnection = this.f45817a;
            final Promise promise = this.f45818b;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.l2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45994a.c(peerConnection, promise);
                }
            });
        }
    }

    class d implements SdpObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PeerConnection f45820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f45822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f45824e;

        d(PeerConnection peerConnection, List list, d0 d0Var, int i11, Promise promise) {
            this.f45820a = peerConnection;
            this.f45821b = list;
            this.f45822c = d0Var;
            this.f45823d = i11;
            this.f45824e = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(PeerConnection peerConnection, List list, d0 d0Var, int i11, Promise promise) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            SessionDescription remoteDescription = peerConnection.getRemoteDescription();
            if (remoteDescription != null) {
                writableMapCreateMap.putString("type", remoteDescription.type.canonicalForm());
                writableMapCreateMap.putString("sdp", remoteDescription.description);
            }
            writableMapCreateMap2.putArray("transceiversInfo", WebRTCModule.this.getTransceiversInfo(peerConnection));
            writableMapCreateMap2.putMap("sdpInfo", writableMapCreateMap);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
                if (!list.contains(rtpTransceiver.getReceiver().id())) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("transceiverOrder", d0Var.u());
                    writableMapCreateMap3.putMap("transceiver", o0.s(i11, rtpTransceiver));
                    writableArrayCreateArray.pushMap(writableMapCreateMap3);
                }
            }
            writableMapCreateMap2.putArray("newTransceivers", writableArrayCreateArray);
            promise.resolve(writableMapCreateMap2);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(final String str) {
            final Promise promise = this.f45824e;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.n2
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("E_OPERATION_ERROR", str);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            final PeerConnection peerConnection = this.f45820a;
            final List list = this.f45821b;
            final d0 d0Var = this.f45822c;
            final int i11 = this.f45823d;
            final Promise promise = this.f45824e;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.o2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46040a.c(peerConnection, list, d0Var, i11, promise);
                }
            });
        }
    }

    class e implements AddIceObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PeerConnection f45826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f45827b;

        e(PeerConnection peerConnection, Promise promise) {
            this.f45826a = peerConnection;
            this.f45827b = promise;
        }

        public static /* synthetic */ void a(PeerConnection peerConnection, Promise promise) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            SessionDescription remoteDescription = peerConnection.getRemoteDescription();
            writableMapCreateMap.putString("type", remoteDescription.type.canonicalForm());
            writableMapCreateMap.putString("sdp", remoteDescription.description);
            promise.resolve(writableMapCreateMap);
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddFailure(final String str) {
            final Promise promise = this.f45827b;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.q2
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("E_OPERATION_ERROR", str);
                }
            });
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddSuccess() {
            final PeerConnection peerConnection = this.f45826a;
            final Promise promise = this.f45827b;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.p2
                @Override // java.lang.Runnable
                public final void run() {
                    WebRTCModule.e.a(peerConnection, promise);
                }
            });
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45829a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f45829a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45829a[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public WebRTCModule(ReactApplicationContext reactApplicationContext) throws Exception {
        super(reactApplicationContext);
        this.frameCryptor = new f0(this);
        this.mPeerConnectionObservers = new SparseArray<>();
        this.localStreams = new HashMap();
        r2 r2VarA = r2.a();
        AudioDeviceModule audioDeviceModuleCreateAudioDeviceModule = r2VarA.f46073c;
        VideoEncoderFactory softwareVideoEncoderFactory = r2VarA.f46071a;
        VideoDecoderFactory softwareVideoDecoderFactory = r2VarA.f46072b;
        Loggable loggable = r2VarA.f46075e;
        Logging.Severity severity = r2VarA.f46076f;
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(reactApplicationContext).setFieldTrials(r2VarA.f46077g).setNativeLibraryLoader(new p()).setInjectableLogger(loggable, severity).createInitializationOptions());
        if (loggable == null && severity != null) {
            Logging.enableLogToDebugOutput(severity);
        }
        if (softwareVideoEncoderFactory == null || softwareVideoDecoderFactory == null) {
            EglBase.Context contextB = h.b();
            if (contextB != null) {
                c00.b bVar = new c00.b(contextB);
                c00.a aVar = new c00.a(contextB);
                softwareVideoEncoderFactory = bVar;
                softwareVideoDecoderFactory = aVar;
            } else {
                softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
                softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
            }
        }
        audioDeviceModuleCreateAudioDeviceModule = audioDeviceModuleCreateAudioDeviceModule == null ? JavaAudioDeviceModule.builder(reactApplicationContext).createAudioDeviceModule() : audioDeviceModuleCreateAudioDeviceModule;
        AudioProcessingFactory audioProcessingFactoryCall = null;
        try {
            Callable<AudioProcessingFactory> callable = r2VarA.f46074d;
            if (callable != null) {
                audioProcessingFactoryCall = callable.call();
            }
        } catch (Exception unused) {
        }
        String str = TAG;
        Log.d(str, "Using video encoder factory: " + softwareVideoEncoderFactory.getClass().getCanonicalName());
        Log.d(str, "Using video decoder factory: " + softwareVideoDecoderFactory.getClass().getCanonicalName());
        PeerConnectionFactory.Builder videoDecoderFactory = PeerConnectionFactory.builder().setAudioDeviceModule(audioDeviceModuleCreateAudioDeviceModule).setVideoEncoderFactory(softwareVideoEncoderFactory).setVideoDecoderFactory(softwareVideoDecoderFactory);
        if (audioProcessingFactoryCall != null) {
            videoDecoderFactory.setAudioProcessingFactory(audioProcessingFactoryCall);
        }
        this.mFactory = videoDecoderFactory.createPeerConnectionFactory();
        audioDeviceModuleCreateAudioDeviceModule.release();
        this.mVideoEncoderFactory = softwareVideoEncoderFactory;
        this.mVideoDecoderFactory = softwareVideoDecoderFactory;
        this.mAudioDeviceModule = audioDeviceModuleCreateAudioDeviceModule;
        this.getUserMediaImpl = new o(this, reactApplicationContext);
    }

    private PeerConnection.IceServer createIceServer(String str) {
        return PeerConnection.IceServer.builder(str).createIceServer();
    }

    private List<PeerConnection.IceServer> createIceServers(ReadableArray readableArray) {
        int size = readableArray == null ? 0 : readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            boolean z11 = map.hasKey("username") && map.hasKey("credential");
            if (map.hasKey("urls")) {
                int i12 = f.f45829a[map.getType("urls").ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        ReadableArray array = map.getArray("urls");
                        for (int i13 = 0; i13 < array.size(); i13++) {
                            String string = array.getString(i13);
                            if (z11) {
                                arrayList.add(createIceServer(string, map.getString("username"), map.getString("credential")));
                            } else {
                                arrayList.add(createIceServer(string));
                            }
                        }
                    }
                } else if (z11) {
                    arrayList.add(createIceServer(map.getString("urls"), map.getString("username"), map.getString("credential")));
                } else {
                    arrayList.add(createIceServer(map.getString("urls")));
                }
            }
        }
        return arrayList;
    }

    private PeerConnection getPeerConnection(int i11) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null) {
            return null;
        }
        return d0Var.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReadableArray getTransceiversInfo(PeerConnection peerConnection) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            RtpTransceiver.RtpTransceiverDirection currentDirection = rtpTransceiver.getCurrentDirection();
            if (currentDirection != null) {
                writableMapCreateMap.putString("currentDirection", o0.j(currentDirection));
            }
            writableMapCreateMap.putString("transceiverId", rtpTransceiver.getSender().id());
            writableMapCreateMap.putString("mid", rtpTransceiver.getMid());
            writableMapCreateMap.putBoolean("isStopped", rtpTransceiver.isStopped());
            writableMapCreateMap.putMap("senderRtpParameters", o0.n(rtpTransceiver.getSender().getParameters()));
            writableMapCreateMap.putMap("receiverRtpParameters", o0.n(rtpTransceiver.getReceiver().getParameters()));
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createDataChannel$36(int i11, String str, ReadableMap readableMap) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var != null && d0Var.v() != null) {
            return d0Var.p(str, readableMap);
        }
        Log.d(TAG, "createDataChannel() peerConnection is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dataChannelClose$37(int i11, String str) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null || d0Var.v() == null) {
            Log.d(TAG, "dataChannelClose() peerConnection is null");
        } else {
            d0Var.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dataChannelDispose$38(int i11, String str) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null || d0Var.v() == null) {
            Log.d(TAG, "dataChannelDispose() peerConnection is null");
        } else {
            d0Var.r(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dataChannelSend$39(int i11, String str, String str2, String str3) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null || d0Var.v() == null) {
            Log.d(TAG, "dataChannelSend() peerConnection is null");
        } else {
            d0Var.s(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enumerateDevices$12(Callback callback) {
        callback.invoke(this.getUserMediaImpl.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDisplayMedia$10(Promise promise) {
        this.getUserMediaImpl.t(promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getStreamForReactTag$1(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream != null) {
            return mediaStream;
        }
        int size = this.mPeerConnectionObservers.size();
        for (int i11 = 0; i11 < size; i11++) {
            MediaStream mediaStream2 = this.mPeerConnectionObservers.valueAt(i11).f45894f.get(str);
            if (mediaStream2 != null) {
                return mediaStream2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUserMedia$11(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.getUserMediaImpl.v(readableMap, callback, callback2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamAddTrack$14(String str, int i11, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamAddTrack() could not find stream " + str);
            return;
        }
        MediaStreamTrack track = getTrack(i11, str2);
        if (track == null) {
            Log.d(TAG, "mediaStreamAddTrack() could not find track " + str2);
            return;
        }
        String strKind = track.kind();
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(strKind)) {
            mediaStream.addTrack((AudioTrack) track);
        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(strKind)) {
            mediaStream.addTrack((VideoTrack) track);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamCreate$13(String str) {
        this.localStreams.put(str, this.mFactory.createLocalMediaStream(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamRelease$16(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamRelease() stream is null");
        } else {
            this.localStreams.remove(str);
            mediaStream.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamRemoveTrack$15(String str, int i11, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamRemoveTrack() could not find stream " + str);
            return;
        }
        MediaStreamTrack track = getTrack(i11, str2);
        if (track == null) {
            Log.d(TAG, "mediaStreamRemoveTrack() could not find track " + str2);
            return;
        }
        String strKind = track.kind();
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(strKind)) {
            mediaStream.removeTrack((AudioTrack) track);
        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(strKind)) {
            mediaStream.removeTrack((VideoTrack) track);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackApplyConstraints$19(String str, ReadableMap readableMap, Promise promise) {
        if (getLocalTrack(str) != null) {
            this.getUserMediaImpl.j(str, readableMap, promise);
            return;
        }
        promise.reject(new Exception("mediaStreamTrackApplyConstraints() could not find track " + str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackRelease$17(String str) {
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            Log.d(TAG, "mediaStreamTrackRelease() track is null");
        } else {
            localTrack.setEnabled(false);
            this.getUserMediaImpl.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackSetEnabled$18(int i11, String str, boolean z11) {
        MediaStreamTrack track = getTrack(i11, str);
        if (track != null) {
            if (track.enabled() == z11) {
                return;
            }
            track.setEnabled(z11);
            this.getUserMediaImpl.x(str, z11);
            return;
        }
        Log.d(TAG, "mediaStreamTrackSetEnabled() could not find track " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackSetVideoEffects$21(String str, ReadableArray readableArray) {
        this.getUserMediaImpl.y(str, readableArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackSetVolume$20(int i11, String str, double d11) {
        MediaStreamTrack track = getTrack(i11, str);
        if (track != null) {
            if (track instanceof AudioTrack) {
                ((AudioTrack) track).setVolume(d11);
                return;
            } else {
                Log.d(TAG, "mediaStreamTrackSetVolume() track is not an AudioTrack!");
                return;
            }
        }
        Log.d(TAG, "mediaStreamTrackSetVolume() could not find track " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionAddICECandidate$31(int i11, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionAddICECandidate() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
        } else if (readableMap.hasKey("sdpMid") || readableMap.hasKey("sdpMLineIndex")) {
            peerConnection.addIceCandidate(new IceCandidate((!readableMap.hasKey("sdpMid") || readableMap.isNull("sdpMid")) ? "" : readableMap.getString("sdpMid"), (!readableMap.hasKey("sdpMLineIndex") || readableMap.isNull("sdpMLineIndex")) ? 0 : readableMap.getInt("sdpMLineIndex"), readableMap.getString("candidate")), new e(peerConnection, promise));
        } else {
            promise.reject("E_TYPE_ERROR", "Invalid argument");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$peerConnectionAddTrack$3(int i11, String str, ReadableMap readableMap) {
        ReadableArray array;
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null) {
            Log.d(TAG, "peerConnectionAddTrack() peerConnection is null");
            return null;
        }
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            Log.w(TAG, "peerConnectionAddTrack() couldn't find track " + str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (readableMap.hasKey("streamIds") && (array = readableMap.getArray("streamIds")) != null) {
            for (int i12 = 0; i12 < array.size(); i12++) {
                arrayList.add(array.getString(i12));
            }
        }
        RtpSender rtpSenderAddTrack = d0Var.v().addTrack(localTrack, arrayList);
        RtpTransceiver rtpTransceiverZ = d0Var.z(rtpSenderAddTrack.id());
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("transceiverOrder", d0Var.u());
        writableMapCreateMap.putMap("transceiver", o0.s(i11, rtpTransceiverZ));
        writableMapCreateMap.putMap("sender", o0.p(i11, rtpSenderAddTrack));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$peerConnectionAddTransceiver$2(int i11, ReadableMap readableMap) {
        RtpTransceiver rtpTransceiverN;
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null) {
            Log.d(TAG, "peerConnectionAddTransceiver() peerConnection is null");
            return null;
        }
        if (readableMap.hasKey("type")) {
            rtpTransceiverN = d0Var.m(o0.h(readableMap.getString("type")), o0.i(readableMap.getMap("init")));
        } else {
            if (!readableMap.hasKey("trackId")) {
                Log.d(TAG, "peerConnectionAddTransceiver() no type nor trackId provided in options");
                return null;
            }
            rtpTransceiverN = d0Var.n(getLocalTrack(readableMap.getString("trackId")), o0.i(readableMap.getMap("init")));
        }
        if (rtpTransceiverN == null) {
            Log.d(TAG, "peerConnectionAddTransceiver() Error adding transceiver");
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("transceiverOrder", d0Var.u());
        writableMapCreateMap.putMap("transceiver", o0.s(i11, rtpTransceiverN));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionClose$33(int i11) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null || d0Var.v() == null) {
            Log.d(TAG, "peerConnectionClose() peerConnection is null");
        } else {
            d0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionCreateAnswer$24(int i11, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection != null) {
            peerConnection.createAnswer(new b(promise, peerConnection), constraintsForOptions(readableMap));
        } else {
            Log.d(TAG, "peerConnectionCreateAnswer() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionCreateOffer$23(int i11, Promise promise, ReadableMap readableMap) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        PeerConnection peerConnectionV = d0Var.v();
        if (peerConnectionV == null) {
            Log.d(TAG, "peerConnectionCreateOffer() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RtpTransceiver> it = peerConnectionV.getTransceivers().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReceiver().id());
        }
        peerConnectionV.createOffer(new a(promise, peerConnectionV, arrayList, d0Var, i11), constraintsForOptions(readableMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionDispose$34(int i11) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null || d0Var.v() == null) {
            Log.d(TAG, "peerConnectionDispose() peerConnection is null");
        }
        d0Var.t();
        this.mPeerConnectionObservers.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionGetStats$32(int i11, Promise promise) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var != null && d0Var.v() != null) {
            d0Var.y(promise);
        } else {
            Log.d(TAG, "peerConnectionGetStats() peerConnection is null");
            promise.resolve(p0.b(new RTCStatsReport(0L, new HashMap())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$peerConnectionInit$0(int i11, PeerConnection.RTCConfiguration rTCConfiguration) {
        d0 d0Var = new d0(this, i11);
        PeerConnection peerConnectionCreatePeerConnection = this.mFactory.createPeerConnection(rTCConfiguration, d0Var);
        if (peerConnectionCreatePeerConnection == null) {
            return Boolean.FALSE;
        }
        d0Var.O(peerConnectionCreatePeerConnection);
        this.mPeerConnectionObservers.put(i11, d0Var);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$peerConnectionRemoveTrack$4(int i11, String str) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var == null) {
            Log.d(TAG, "peerConnectionRemoveTrack() peerConnection is null");
            return Boolean.FALSE;
        }
        RtpSender rtpSenderX = d0Var.x(str);
        if (rtpSenderX != null) {
            return Boolean.valueOf(d0Var.v().removeTrack(rtpSenderX));
        }
        Log.w(TAG, "peerConnectionRemoveTrack() sender is null");
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionRestartIce$35(int i11) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.w(TAG, "peerConnectionRestartIce() peerConnection is null");
        } else {
            peerConnection.restartIce();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionSetConfiguration$22(int i11, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetConfiguration() peerConnection is null");
        } else {
            peerConnection.setConfiguration(parseRTCConfiguration(readableMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionSetLocalDescription$25(int i11, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetLocalDescription() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        c cVar = new c(peerConnection, promise);
        if (readableMap == null) {
            peerConnection.setLocalDescription(cVar);
            return;
        }
        String string = readableMap.getString("type");
        Objects.requireNonNull(string);
        peerConnection.setLocalDescription(cVar, new SessionDescription(SessionDescription.Type.fromCanonicalForm(string), readableMap.getString("sdp")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionSetRemoteDescription$26(int i11, Promise promise, ReadableMap readableMap) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        PeerConnection peerConnectionV = d0Var.v();
        if (peerConnectionV == null) {
            Log.d(TAG, "peerConnectionSetRemoteDescription() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.fromCanonicalForm(readableMap.getString("type")), readableMap.getString("sdp"));
        ArrayList arrayList = new ArrayList();
        Iterator<RtpTransceiver> it = peerConnectionV.getTransceivers().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReceiver().id());
        }
        peerConnectionV.setRemoteDescription(new d(peerConnectionV, arrayList, d0Var, i11, promise), sessionDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$receiverGetCapabilities$27(String str) {
        MediaStreamTrack.MediaType mediaType;
        if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        } else {
            if (!str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                return Arguments.createMap();
            }
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        }
        return o0.l(this.mFactory.getRtpReceiverCapabilities(mediaType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiverGetStats$29(int i11, Promise promise, String str) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var != null && d0Var.v() != null) {
            d0Var.M(str, promise);
        } else {
            Log.d(TAG, "receiverGetStats() peerConnection is null");
            promise.resolve(p0.b(new RTCStatsReport(0L, new HashMap())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$senderGetCapabilities$28(String str) {
        MediaStreamTrack.MediaType mediaType;
        if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        } else {
            if (!str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                return Arguments.createMap();
            }
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        }
        return o0.l(this.mFactory.getRtpSenderCapabilities(mediaType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senderGetStats$30(int i11, Promise promise, String str) {
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var != null && d0Var.v() != null) {
            d0Var.N(str, promise);
        } else {
            Log.d(TAG, "senderGetStats() peerConnection is null");
            promise.resolve(p0.b(new RTCStatsReport(0L, new HashMap())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senderReplaceTrack$7(int i11, Promise promise, String str, String str2) {
        try {
            d0 d0Var = this.mPeerConnectionObservers.get(i11);
            if (d0Var == null) {
                Log.d(TAG, "senderReplaceTrack() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpSender rtpSenderX = d0Var.x(str);
            if (rtpSenderX == null) {
                Log.w(TAG, "senderReplaceTrack() sender is null");
                promise.reject(new Exception("Could not get sender"));
            } else {
                rtpSenderX.setTrack(getLocalTrack(str2), false);
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            Log.d(TAG, "senderReplaceTrack(): " + e11.getMessage());
            promise.reject(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senderSetParameters$5(int i11, Promise promise, String str, ReadableMap readableMap) {
        try {
            d0 d0Var = this.mPeerConnectionObservers.get(i11);
            if (d0Var == null) {
                Log.d(TAG, "senderSetParameters() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpSender rtpSenderX = d0Var.x(str);
            if (rtpSenderX == null) {
                Log.w(TAG, "senderSetParameters() sender is null");
                promise.reject(new Exception("Could not get sender"));
            } else {
                rtpSenderX.setParameters(o0.t(readableMap, rtpSenderX.getParameters()));
                promise.resolve(o0.n(rtpSenderX.getParameters()));
            }
        } catch (Exception e11) {
            Log.d(TAG, "senderSetParameters: " + e11.getMessage());
            promise.reject(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transceiverSetCodecPreferences$9(int i11, String str, ReadableArray readableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", i11);
        writableMapCreateMap.putString("transceiverId", str);
        try {
            d0 d0Var = this.mPeerConnectionObservers.get(i11);
            if (d0Var == null) {
                Log.d(TAG, "transceiverSetDirection() peerConnectionObserver is null");
                return;
            }
            RtpTransceiver rtpTransceiverZ = d0Var.z(str);
            if (rtpTransceiverZ == null) {
                Log.d(TAG, "transceiverSetDirection() transceiver is null");
                return;
            }
            RtpTransceiver.RtpTransceiverDirection direction = rtpTransceiverZ.getDirection();
            ArrayList<Pair> arrayList = new ArrayList();
            if (direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_RECV) || direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY)) {
                for (RtpCapabilities.CodecCapability codecCapability : this.mFactory.getRtpSenderCapabilities(rtpTransceiverZ.getMediaType()).codecs) {
                    arrayList.add(new Pair(o0.m(codecCapability).toHashMap(), codecCapability));
                }
            }
            if (direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_RECV) || direction.equals(RtpTransceiver.RtpTransceiverDirection.RECV_ONLY)) {
                for (RtpCapabilities.CodecCapability codecCapability2 : this.mFactory.getRtpReceiverCapabilities(rtpTransceiverZ.getMediaType()).codecs) {
                    arrayList.add(new Pair(o0.m(codecCapability2).toHashMap(), codecCapability2));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < readableArray.size(); i12++) {
                HashMap<String, Object> hashMap = readableArray.getMap(i12).toHashMap();
                for (Pair pair : arrayList) {
                    if (hashMap.equals((Map) pair.first)) {
                        arrayList2.add((RtpCapabilities.CodecCapability) pair.second);
                        break;
                    }
                }
            }
            rtpTransceiverZ.setCodecPreferences(arrayList2);
        } catch (Exception e11) {
            Log.d(TAG, "transceiverSetCodecPreferences(): " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transceiverSetDirection$8(int i11, String str, Promise promise, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", i11);
        writableMapCreateMap.putString("transceiverId", str);
        try {
            d0 d0Var = this.mPeerConnectionObservers.get(i11);
            if (d0Var == null) {
                Log.d(TAG, "transceiverSetDirection() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpTransceiver rtpTransceiverZ = d0Var.z(str);
            if (rtpTransceiverZ == null) {
                Log.d(TAG, "transceiverSetDirection() transceiver is null");
                promise.reject(new Exception("Could not get sender"));
            } else {
                rtpTransceiverZ.setDirection(o0.f(str2));
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            Log.d(TAG, "transceiverSetDirection(): " + e11.getMessage());
            promise.reject(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transceiverStop$6(int i11, Promise promise, String str) {
        try {
            d0 d0Var = this.mPeerConnectionObservers.get(i11);
            if (d0Var == null) {
                Log.d(TAG, "transceiverStop() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpTransceiver rtpTransceiverZ = d0Var.z(str);
            if (rtpTransceiverZ == null) {
                Log.w(TAG, "transceiverStop() transceiver is null");
                promise.reject(new Exception("Could not get transceiver"));
            } else {
                rtpTransceiverZ.stopStandard();
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            Log.d(TAG, "transceiverStop(): " + e11.getMessage());
            promise.reject(e11);
        }
    }

    private PeerConnection.RTCConfiguration parseRTCConfiguration(ReadableMap readableMap) {
        int i11;
        String string;
        String string2;
        String string3;
        String string4;
        int i12;
        String string5;
        String string6;
        String string7;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(createIceServers((readableMap == null || !readableMap.hasKey("iceServers")) ? null : readableMap.getArray("iceServers")));
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        byte b11 = 1;
        rTCConfiguration.enableImplicitRollback = true;
        rTCConfiguration.cryptoOptions = CryptoOptions.builder().setEnableGcmCryptoSuites(true).setEnableAes128Sha1_32CryptoCipher(false).setEnableEncryptedRtpHeaderExtensions(false).setRequireFrameEncryption(false).createCryptoOptions();
        if (readableMap != null) {
            if (readableMap.hasKey("iceTransportPolicy") && readableMap.getType("iceTransportPolicy") == ReadableType.String && (string7 = readableMap.getString("iceTransportPolicy")) != null) {
                switch (string7) {
                    case "nohost":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NOHOST;
                        break;
                    case "all":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
                        break;
                    case "none":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NONE;
                        break;
                    case "relay":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
                        break;
                }
            }
            if (readableMap.hasKey("bundlePolicy") && readableMap.getType("bundlePolicy") == ReadableType.String && (string6 = readableMap.getString("bundlePolicy")) != null) {
                switch (string6.hashCode()) {
                    case -1924829944:
                        b11 = !string6.equals("balanced") ? (byte) -1 : (byte) 0;
                        break;
                    case -585638645:
                        if (!string6.equals("max-bundle")) {
                            b11 = -1;
                        }
                        break;
                    case -562569205:
                        b11 = !string6.equals("max-compat") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.BALANCED;
                        break;
                    case 1:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
                        break;
                    case 2:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXCOMPAT;
                        break;
                }
            }
            if (readableMap.hasKey("rtcpMuxPolicy") && readableMap.getType("rtcpMuxPolicy") == ReadableType.String && (string5 = readableMap.getString("rtcpMuxPolicy")) != null) {
                if (string5.equals("negotiate")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.NEGOTIATE;
                } else if (string5.equals("require")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
                }
            }
            if (readableMap.hasKey("iceCandidatePoolSize") && readableMap.getType("iceCandidatePoolSize") == ReadableType.Number && (i12 = readableMap.getInt("iceCandidatePoolSize")) > 0) {
                rTCConfiguration.iceCandidatePoolSize = i12;
            }
            if (readableMap.hasKey("tcpCandidatePolicy") && readableMap.getType("tcpCandidatePolicy") == ReadableType.String && (string4 = readableMap.getString("tcpCandidatePolicy")) != null) {
                if (string4.equals("enabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
                } else if (string4.equals("disabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
                }
            }
            if (readableMap.hasKey("candidateNetworkPolicy") && readableMap.getType("candidateNetworkPolicy") == ReadableType.String && (string3 = readableMap.getString("candidateNetworkPolicy")) != null) {
                if (string3.equals("low_cost")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.LOW_COST;
                } else if (string3.equals("all")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.ALL;
                }
            }
            if (readableMap.hasKey("keyType") && readableMap.getType("keyType") == ReadableType.String && (string2 = readableMap.getString("keyType")) != null) {
                if (string2.equals("RSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.RSA;
                } else if (string2.equals("ECDSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
                }
            }
            if (readableMap.hasKey("continualGatheringPolicy") && readableMap.getType("continualGatheringPolicy") == ReadableType.String && (string = readableMap.getString("continualGatheringPolicy")) != null) {
                if (string.equals("gather_once")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
                } else if (string.equals("gather_continually")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
                }
            }
            if (readableMap.hasKey("audioJitterBufferMaxPackets") && readableMap.getType("audioJitterBufferMaxPackets") == ReadableType.Number && (i11 = readableMap.getInt("audioJitterBufferMaxPackets")) > 0) {
                rTCConfiguration.audioJitterBufferMaxPackets = i11;
            }
            if (readableMap.hasKey("iceConnectionReceivingTimeout") && readableMap.getType("iceConnectionReceivingTimeout") == ReadableType.Number) {
                rTCConfiguration.iceConnectionReceivingTimeout = readableMap.getInt("iceConnectionReceivingTimeout");
            }
            if (readableMap.hasKey("iceBackupCandidatePairPingInterval") && readableMap.getType("iceBackupCandidatePairPingInterval") == ReadableType.Number) {
                rTCConfiguration.iceBackupCandidatePairPingInterval = readableMap.getInt("iceBackupCandidatePairPingInterval");
            }
            if (readableMap.hasKey("audioJitterBufferFastAccelerate") && readableMap.getType("audioJitterBufferFastAccelerate") == ReadableType.Boolean) {
                rTCConfiguration.audioJitterBufferFastAccelerate = readableMap.getBoolean("audioJitterBufferFastAccelerate");
            }
            if (readableMap.hasKey("pruneTurnPorts") && readableMap.getType("pruneTurnPorts") == ReadableType.Boolean) {
                rTCConfiguration.pruneTurnPorts = readableMap.getBoolean("pruneTurnPorts");
            }
            if (readableMap.hasKey("presumeWritableWhenFullyRelayed") && readableMap.getType("presumeWritableWhenFullyRelayed") == ReadableType.Boolean) {
                rTCConfiguration.presumeWritableWhenFullyRelayed = readableMap.getBoolean("presumeWritableWhenFullyRelayed");
            }
        }
        return rTCConfiguration;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    MediaConstraints constraintsForOptions(ReadableMap readableMap) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(strNextKey, g0.a(readableMap, strNextKey)));
        }
        return mediaConstraints;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap createDataChannel(final int i11, final String str, final ReadableMap readableMap) {
        try {
            return (WritableMap) q0.b(new Callable() { // from class: com.oney.WebRTCModule.p1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46048a.lambda$createDataChannel$36(i11, str, readableMap);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public void createStream(MediaStreamTrack[] mediaStreamTrackArr, o.d<String, ArrayList<WritableMap>> dVar) {
        this.getUserMediaImpl.o(mediaStreamTrackArr, dVar);
    }

    public VideoTrack createVideoTrack(com.oney.WebRTCModule.a aVar) {
        return this.getUserMediaImpl.p(aVar);
    }

    @ReactMethod
    public void dataChannelClose(final int i11, final String str) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.r1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46067a.lambda$dataChannelClose$37(i11, str);
            }
        });
    }

    @ReactMethod
    public void dataChannelDispose(final int i11, final String str) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.e2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45916a.lambda$dataChannelDispose$38(i11, str);
            }
        });
    }

    @ReactMethod
    public void dataChannelSend(final int i11, final String str, final String str2, final String str3) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46118a.lambda$dataChannelSend$39(i11, str, str2, str3);
            }
        });
    }

    @ReactMethod
    public void enumerateDevices(final Callback callback) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46116a.lambda$enumerateDevices$12(callback);
            }
        });
    }

    @ReactMethod
    public void frameCryptorDispose(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.c(readableMap, promise);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String frameCryptorFactoryCreateFrameCryptor(ReadableMap readableMap) {
        return this.frameCryptor.d(readableMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String frameCryptorFactoryCreateKeyProvider(ReadableMap readableMap) {
        return this.frameCryptor.e(readableMap);
    }

    @ReactMethod
    public void frameCryptorGetEnabled(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.f(readableMap, promise);
    }

    @ReactMethod
    public void frameCryptorGetKeyIndex(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.g(readableMap, promise);
    }

    @ReactMethod
    public void frameCryptorSetEnabled(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.h(readableMap, promise);
    }

    @ReactMethod
    public void frameCryptorSetKeyIndex(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.i(readableMap, promise);
    }

    @ReactMethod
    public void getDisplayMedia(final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46175a.lambda$getDisplayMedia$10(promise);
            }
        });
    }

    MediaStreamTrack getLocalTrack(String str) {
        return this.getUserMediaImpl.u(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "WebRTCModule";
    }

    public d0 getPeerConnectionObserver(int i11) {
        return this.mPeerConnectionObservers.get(i11);
    }

    MediaStream getStreamForReactTag(final String str) {
        try {
            return (MediaStream) q0.b(new Callable() { // from class: com.oney.WebRTCModule.u1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46112a.lambda$getStreamForReactTag$1(str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public MediaStreamTrack getTrack(int i11, String str) {
        if (i11 == -1) {
            return getLocalTrack(str);
        }
        d0 d0Var = this.mPeerConnectionObservers.get(i11);
        if (d0Var != null) {
            return d0Var.f45895g.get(str);
        }
        Log.d(TAG, "getTrack(): could not find PeerConnection");
        return null;
    }

    @ReactMethod
    public void getUserMedia(final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.d2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45904a.lambda$getUserMedia$11(readableMap, callback, callback2);
            }
        });
    }

    @ReactMethod
    public void keyProviderDispose(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.k(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderExportKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.l(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderExportSharedKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.m(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderRatchetKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.n(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderRatchetSharedKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.o(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderSetKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.p(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderSetSharedKey(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.q(readableMap, promise);
    }

    @ReactMethod
    public void keyProviderSetSifTrailer(ReadableMap readableMap, Promise promise) {
        this.frameCryptor.r(readableMap, promise);
    }

    @ReactMethod
    public void mediaStreamAddTrack(final String str, final int i11, final String str2) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46140a.lambda$mediaStreamAddTrack$14(str, i11, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamCreate(final String str) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45867a.lambda$mediaStreamCreate$13(str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamRelease(final String str) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.a2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45844a.lambda$mediaStreamRelease$16(str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamRemoveTrack(final String str, final int i11, final String str2) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46095a.lambda$mediaStreamRemoveTrack$15(str, i11, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackApplyConstraints(final String str, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46103a.lambda$mediaStreamTrackApplyConstraints$19(str, readableMap, promise);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackRelease(final String str) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45902a.lambda$mediaStreamTrackRelease$17(str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSetEnabled(final int i11, final String str, final boolean z11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.o1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46036a.lambda$mediaStreamTrackSetEnabled$18(i11, str, z11);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSetVideoEffects(final String str, final ReadableArray readableArray) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45964a.lambda$mediaStreamTrackSetVideoEffects$21(str, readableArray);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSetVolume(final int i11, final String str, final double d11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45840a.lambda$mediaStreamTrackSetVolume$20(i11, str, d11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionAddICECandidate(final int i11, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.g2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45944a.lambda$peerConnectionAddICECandidate$31(i11, promise, readableMap);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap peerConnectionAddTrack(final int i11, final String str, final ReadableMap readableMap) {
        try {
            return (WritableMap) q0.b(new Callable() { // from class: com.oney.WebRTCModule.g1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f45940a.lambda$peerConnectionAddTrack$3(i11, str, readableMap);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            Log.d(TAG, "peerConnectionAddTrack() " + e11.getMessage());
            return null;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap peerConnectionAddTransceiver(final int i11, final ReadableMap readableMap) {
        try {
            return (WritableMap) q0.b(new Callable() { // from class: com.oney.WebRTCModule.h1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f45952a.lambda$peerConnectionAddTransceiver$2(i11, readableMap);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            Log.d(TAG, "peerConnectionAddTransceiver() " + e11.getMessage());
            return null;
        }
    }

    @ReactMethod
    public void peerConnectionClose(final int i11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45992a.lambda$peerConnectionClose$33(i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateAnswer(final int i11, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46056a.lambda$peerConnectionCreateAnswer$24(i11, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateOffer(final int i11, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45912a.lambda$peerConnectionCreateOffer$23(i11, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionDispose(final int i11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46101a.lambda$peerConnectionDispose$34(i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionGetStats(final int i11, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45849a.lambda$peerConnectionGetStats$32(i11, promise);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean peerConnectionInit(ReadableMap readableMap, final int i11) {
        final PeerConnection.RTCConfiguration rTCConfiguration = parseRTCConfiguration(readableMap);
        try {
            return ((Boolean) q0.b(new Callable() { // from class: com.oney.WebRTCModule.c2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f45869a.lambda$peerConnectionInit$0(i11, rTCConfiguration);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            e11.printStackTrace();
            throw new RuntimeException(e11);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean peerConnectionRemoveTrack(final int i11, final String str) {
        try {
            return ((Boolean) q0.b(new Callable() { // from class: com.oney.WebRTCModule.y1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46170a.lambda$peerConnectionRemoveTrack$4(i11, str);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            Log.d(TAG, "peerConnectionRemoveTrack() " + e11.getMessage());
            return false;
        }
    }

    @ReactMethod
    public void peerConnectionRestartIce(final int i11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46138a.lambda$peerConnectionRestartIce$35(i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetConfiguration(final ReadableMap readableMap, final int i11) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45936a.lambda$peerConnectionSetConfiguration$22(i11, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetLocalDescription(final int i11, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46125a.lambda$peerConnectionSetLocalDescription$25(i11, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetRemoteDescription(final int i11, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45999a.lambda$peerConnectionSetRemoteDescription$26(i11, promise, readableMap);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap receiverGetCapabilities(final String str) {
        try {
            return (WritableMap) q0.b(new Callable() { // from class: com.oney.WebRTCModule.z1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46177a.lambda$receiverGetCapabilities$27(str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            Log.d(TAG, "receiverGetCapabilities() " + e11.getMessage());
            return null;
        }
    }

    @ReactMethod
    public void receiverGetStats(final int i11, final String str, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45982a.lambda$receiverGetStats$29(i11, promise, str);
            }
        });
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    void sendEvent(String str, ReadableMap readableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, readableMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap senderGetCapabilities(final String str) {
        try {
            return (WritableMap) q0.b(new Callable() { // from class: com.oney.WebRTCModule.u0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46110a.lambda$senderGetCapabilities$28(str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            Log.d(TAG, "senderGetCapabilities() " + e11.getMessage());
            return null;
        }
    }

    @ReactMethod
    public void senderGetStats(final int i11, final String str, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45975a.lambda$senderGetStats$30(i11, promise, str);
            }
        });
    }

    @ReactMethod
    public void senderReplaceTrack(final int i11, final String str, final String str2, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46008a.lambda$senderReplaceTrack$7(i11, promise, str, str2);
            }
        });
    }

    @ReactMethod
    public void senderSetParameters(final int i11, final String str, final ReadableMap readableMap, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.f1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45931a.lambda$senderSetParameters$5(i11, promise, str, readableMap);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean transceiverSetCodecPreferences(final int i11, final String str, final ReadableArray readableArray) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46166a.lambda$transceiverSetCodecPreferences$9(i11, str, readableArray);
            }
        });
        return true;
    }

    @ReactMethod
    public void transceiverSetDirection(final int i11, final String str, final String str2, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.b2
            @Override // java.lang.Runnable
            public final void run() {
                this.f45852a.lambda$transceiverSetDirection$8(i11, str, promise, str2);
            }
        });
    }

    @ReactMethod
    public void transceiverStop(final int i11, final String str, final Promise promise) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f46129a.lambda$transceiverStop$6(i11, promise, str);
            }
        });
    }

    private PeerConnection.IceServer createIceServer(String str, String str2, String str3) {
        return PeerConnection.IceServer.builder(str).setUsername(str2).setPassword(str3).createIceServer();
    }
}
