package com.oney.WebRTCModule;

import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes6.dex */
class d0 implements PeerConnection.Observer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45888j = WebRTCModule.TAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45890b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PeerConnection f45892d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s0 f45896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WebRTCModule f45897i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45891c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, f> f45889a = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<String, String> f45893e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<String, MediaStream> f45894f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, MediaStreamTrack> f45895g = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f45899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f45900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f45901d;

        static {
            int[] iArr = new int[PeerConnection.SignalingState.values().length];
            f45901d = iArr;
            try {
                iArr[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45901d[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45901d[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45901d[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45901d[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45901d[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[PeerConnection.IceGatheringState.values().length];
            f45900c = iArr2;
            try {
                iArr2[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45900c[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45900c[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[PeerConnection.IceConnectionState.values().length];
            f45899b = iArr3;
            try {
                iArr3[PeerConnection.IceConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45899b[PeerConnection.IceConnectionState.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[PeerConnection.PeerConnectionState.values().length];
            f45898a = iArr4;
            try {
                iArr4[PeerConnection.PeerConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45898a[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f45898a[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f45898a[PeerConnection.PeerConnectionState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f45898a[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f45898a[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    d0(WebRTCModule webRTCModule, int i11) {
        this.f45897i = webRTCModule;
        this.f45890b = i11;
        this.f45896h = new s0(webRTCModule, i11);
    }

    private String A(PeerConnection.IceConnectionState iceConnectionState) {
        switch (a.f45899b[iceConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "checking";
            case 3:
                return "connected";
            case 4:
                return "completed";
            case 5:
                return "failed";
            case 6:
                return "disconnected";
            case 7:
                return "closed";
            default:
                return null;
        }
    }

    private String B(PeerConnection.IceGatheringState iceGatheringState) {
        int i11 = a.f45900c[iceGatheringState.ordinal()];
        if (i11 == 1) {
            return "new";
        }
        if (i11 == 2) {
            return "gathering";
        }
        if (i11 != 3) {
            return null;
        }
        return "complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public /* synthetic */ void C(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        RtpTransceiver next;
        Iterator<RtpTransceiver> it = this.f45892d.getTransceivers().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Objects.equals(next.getReceiver().id(), rtpReceiver.id()));
        if (next == null) {
            return;
        }
        MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
        if (!this.f45895g.containsKey(mediaStreamTrackTrack.id())) {
            if (mediaStreamTrackTrack.kind().equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                this.f45896h.d((VideoTrack) mediaStreamTrackTrack);
            } else if (mediaStreamTrackTrack.kind().equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                ((AudioTrack) mediaStreamTrackTrack).setVolume(r2.a().f46079i);
            }
            this.f45895g.put(mediaStreamTrackTrack.id(), mediaStreamTrackTrack);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (MediaStream mediaStream : mediaStreamArr) {
            String string = this.f45893e.get(mediaStream.getId());
            if (string == null) {
                string = UUID.randomUUID().toString();
                this.f45893e.put(mediaStream.getId(), string);
            }
            this.f45894f.put(string, mediaStream);
            writableArrayCreateArray.pushMap(o0.q(this.f45890b, string, mediaStream));
        }
        writableMapCreateMap.putArray("streams", writableArrayCreateArray);
        writableMapCreateMap.putMap("receiver", o0.k(this.f45890b, rtpReceiver));
        writableMapCreateMap.putInt("transceiverOrder", u());
        writableMapCreateMap.putMap("transceiver", o0.s(this.f45890b, next));
        writableMapCreateMap.putInt("pcId", this.f45890b);
        this.f45897i.sendEvent("peerConnectionOnTrack", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(PeerConnection.PeerConnectionState peerConnectionState) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        writableMapCreateMap.putString("connectionState", L(peerConnectionState));
        this.f45897i.sendEvent("peerConnectionStateChanged", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(DataChannel dataChannel) {
        String string = UUID.randomUUID().toString();
        f fVar = new f(this.f45897i, this.f45890b, string, dataChannel);
        this.f45889a.put(string, fVar);
        dataChannel.registerObserver(fVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", this.f45890b);
        writableMapCreateMap.putString("reactTag", string);
        writableMapCreateMap.putString(AnnotatedPrivateKey.LABEL, dataChannel.label());
        writableMapCreateMap.putInt("id", dataChannel.id());
        writableMapCreateMap.putBoolean("ordered", true);
        writableMapCreateMap.putInt("maxPacketLifeTime", -1);
        writableMapCreateMap.putInt("maxRetransmits", -1);
        writableMapCreateMap.putString("protocol", "");
        writableMapCreateMap.putBoolean("negotiated", false);
        writableMapCreateMap.putString("readyState", fVar.a(dataChannel.state()));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("pcId", this.f45890b);
        writableMapCreateMap2.putMap("dataChannel", writableMapCreateMap);
        this.f45897i.sendEvent("peerConnectionDidOpenDataChannel", writableMapCreateMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public /* synthetic */ void F(IceCandidate iceCandidate) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        writableMapCreateMap2.putString("sdpMid", iceCandidate.sdpMid);
        writableMapCreateMap2.putString("candidate", iceCandidate.sdp);
        writableMapCreateMap.putMap("candidate", writableMapCreateMap2);
        SessionDescription localDescription = this.f45892d.getLocalDescription();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        if (localDescription != null) {
            writableMapCreateMap3.putString("type", localDescription.type.canonicalForm());
            writableMapCreateMap3.putString("sdp", localDescription.description);
        }
        writableMapCreateMap.putMap("sdp", writableMapCreateMap3);
        this.f45897i.sendEvent("peerConnectionGotICECandidate", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(PeerConnection.IceConnectionState iceConnectionState) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        writableMapCreateMap.putString("iceConnectionState", A(iceConnectionState));
        this.f45897i.sendEvent("peerConnectionIceConnectionChanged", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public /* synthetic */ void H(PeerConnection.IceGatheringState iceGatheringState) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        writableMapCreateMap.putString("iceGatheringState", B(iceGatheringState));
        if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
            SessionDescription localDescription = this.f45892d.getLocalDescription();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            if (localDescription != null) {
                writableMapCreateMap2.putString("type", localDescription.type.canonicalForm());
                writableMapCreateMap2.putString("sdp", localDescription.description);
            }
            writableMapCreateMap.putMap("sdp", writableMapCreateMap2);
        }
        this.f45897i.sendEvent("peerConnectionIceGatheringChanged", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(RtpReceiver rtpReceiver) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        writableMapCreateMap.putString("receiverId", rtpReceiver.id());
        this.f45897i.sendEvent("peerConnectionOnRemoveTrack", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        this.f45897i.sendEvent("peerConnectionOnRenegotiationNeeded", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(PeerConnection.SignalingState signalingState) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("pcId", this.f45890b);
        writableMapCreateMap.putString("signalingState", P(signalingState));
        this.f45897i.sendEvent("peerConnectionSignalingStateChanged", writableMapCreateMap);
    }

    private String L(PeerConnection.PeerConnectionState peerConnectionState) {
        switch (a.f45898a[peerConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "connecting";
            case 3:
                return "connected";
            case 4:
                return "disconnected";
            case 5:
                return "failed";
            case 6:
                return "closed";
            default:
                return null;
        }
    }

    private String P(PeerConnection.SignalingState signalingState) {
        switch (a.f45901d[signalingState.ordinal()]) {
            case 1:
                return "stable";
            case 2:
                return "have-local-offer";
            case 3:
                return "have-local-pranswer";
            case 4:
                return "have-remote-offer";
            case 5:
                return "have-remote-pranswer";
            case 6:
                return "closed";
            default:
                return null;
        }
    }

    public void M(String str, final Promise promise) {
        RtpReceiver next;
        Iterator<RtpReceiver> it = this.f45892d.getReceivers().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.id().equals(str));
        if (next != null) {
            this.f45892d.getStats(next, new RTCStatsCollectorCallback() { // from class: com.oney.WebRTCModule.w
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    promise.resolve(p0.b(rTCStatsReport));
                }
            });
            return;
        }
        Log.w(f45888j, "receiverGetStats(): Receiver ID " + str + " not found");
        promise.resolve(p0.b(new RTCStatsReport(0L, new HashMap())));
    }

    public void N(String str, final Promise promise) {
        RtpSender next;
        Iterator<RtpSender> it = this.f45892d.getSenders().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.id().equals(str));
        if (next != null) {
            this.f45892d.getStats(next, new RTCStatsCollectorCallback() { // from class: com.oney.WebRTCModule.v
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    promise.resolve(p0.b(rTCStatsReport));
                }
            });
            return;
        }
        Log.w(f45888j, "senderGetStats(): Sender ID " + str + " not found");
        promise.resolve(p0.b(new RTCStatsReport(0L, new HashMap())));
    }

    void O(PeerConnection peerConnection) {
        this.f45892d = peerConnection;
    }

    RtpTransceiver m(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        PeerConnection peerConnection = this.f45892d;
        if (peerConnection == null) {
            return null;
        }
        return peerConnection.addTransceiver(mediaType, rtpTransceiverInit);
    }

    RtpTransceiver n(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        PeerConnection peerConnection = this.f45892d;
        if (peerConnection == null) {
            return null;
        }
        return peerConnection.addTransceiver(mediaStreamTrack, rtpTransceiverInit);
    }

    void o() {
        Log.d(f45888j, "PeerConnection.close() for " + this.f45890b);
        this.f45892d.close();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(final RtpReceiver rtpReceiver, final MediaStream[] mediaStreamArr) {
        Log.d(f45888j, "onAddTrack");
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f46163a.C(rtpReceiver, mediaStreamArr);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(final PeerConnection.PeerConnectionState peerConnectionState) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f46136a.D(peerConnectionState);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(final DataChannel dataChannel) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f46080a.E(dataChannel);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(final IceCandidate iceCandidate) {
        Log.d(f45888j, "onIceCandidate");
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f46173a.F(iceCandidate);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(final PeerConnection.IceConnectionState iceConnectionState) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f46099a.G(iceConnectionState);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z11) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(final PeerConnection.IceGatheringState iceGatheringState) {
        Log.d(f45888j, "onIceGatheringChange" + iceGatheringState.name());
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f46108a.H(iceGatheringState);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveTrack(final RtpReceiver rtpReceiver) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f46062a.I(rtpReceiver);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45866a.J();
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(final PeerConnection.SignalingState signalingState) {
        q0.a(new Runnable() { // from class: com.oney.WebRTCModule.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45838a.K(signalingState);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver rtpTransceiver) {
    }

    WritableMap p(String str, ReadableMap readableMap) {
        DataChannel.Init init = new DataChannel.Init();
        if (readableMap != null) {
            if (readableMap.hasKey("id")) {
                init.f99873id = readableMap.getInt("id");
            }
            if (readableMap.hasKey("ordered")) {
                init.ordered = readableMap.getBoolean("ordered");
            }
            if (readableMap.hasKey("maxRetransmitTime")) {
                init.maxRetransmitTimeMs = readableMap.getInt("maxRetransmitTime");
            }
            if (readableMap.hasKey("maxRetransmits")) {
                init.maxRetransmits = readableMap.getInt("maxRetransmits");
            }
            if (readableMap.hasKey("protocol")) {
                init.protocol = readableMap.getString("protocol");
            }
            if (readableMap.hasKey("negotiated")) {
                init.negotiated = readableMap.getBoolean("negotiated");
            }
        }
        DataChannel dataChannelCreateDataChannel = this.f45892d.createDataChannel(str, init);
        if (dataChannelCreateDataChannel == null) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        f fVar = new f(this.f45897i, this.f45890b, string, dataChannelCreateDataChannel);
        this.f45889a.put(string, fVar);
        dataChannelCreateDataChannel.registerObserver(fVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", this.f45890b);
        writableMapCreateMap.putString("reactTag", string);
        writableMapCreateMap.putString(AnnotatedPrivateKey.LABEL, dataChannelCreateDataChannel.label());
        writableMapCreateMap.putInt("id", dataChannelCreateDataChannel.id());
        writableMapCreateMap.putBoolean("ordered", init.ordered);
        writableMapCreateMap.putInt("maxPacketLifeTime", init.maxRetransmitTimeMs);
        writableMapCreateMap.putInt("maxRetransmits", init.maxRetransmits);
        writableMapCreateMap.putString("protocol", init.protocol);
        writableMapCreateMap.putBoolean("negotiated", init.negotiated);
        writableMapCreateMap.putString("readyState", fVar.a(dataChannelCreateDataChannel.state()));
        return writableMapCreateMap;
    }

    void q(String str) {
        f fVar = this.f45889a.get(str);
        if (fVar == null) {
            Log.d(f45888j, "dataChannelClose() dataChannel is null");
        } else {
            fVar.b().close();
        }
    }

    void r(String str) {
        f fVar = this.f45889a.get(str);
        if (fVar == null) {
            Log.d(f45888j, "dataChannelDispose() dataChannel is null");
        } else {
            fVar.b().unregisterObserver();
            this.f45889a.remove(str);
        }
    }

    void s(String str, String str2, String str3) {
        byte[] bArrDecode;
        f fVar = this.f45889a.get(str);
        if (fVar == null) {
            Log.d(f45888j, "dataChannelSend() dataChannel is null");
            return;
        }
        if (str3.equals("text")) {
            bArrDecode = str2.getBytes(StandardCharsets.UTF_8);
        } else {
            if (!str3.equals("binary")) {
                Log.e(f45888j, "Unsupported data type: " + str3);
                return;
            }
            bArrDecode = Base64.decode(str2, 2);
        }
        fVar.b().send(new DataChannel.Buffer(ByteBuffer.wrap(bArrDecode), str3.equals("binary")));
    }

    void t() {
        Log.d(f45888j, "PeerConnection.dispose() for " + this.f45890b);
        for (MediaStreamTrack mediaStreamTrack : this.f45895g.values()) {
            if (mediaStreamTrack instanceof VideoTrack) {
                this.f45896h.e((VideoTrack) mediaStreamTrack);
            }
        }
        Iterator<f> it = this.f45889a.values().iterator();
        while (it.hasNext()) {
            it.next().b().unregisterObserver();
        }
        this.f45892d.dispose();
        this.f45893e.clear();
        this.f45894f.clear();
        this.f45895g.clear();
        this.f45889a.clear();
    }

    public synchronized int u() {
        int i11;
        i11 = this.f45891c;
        this.f45891c = i11 + 1;
        return i11;
    }

    PeerConnection v() {
        return this.f45892d;
    }

    RtpReceiver w(String str) {
        PeerConnection peerConnection = this.f45892d;
        if (peerConnection == null) {
            return null;
        }
        for (RtpReceiver rtpReceiver : peerConnection.getReceivers()) {
            if (rtpReceiver.id().equals(str)) {
                return rtpReceiver;
            }
        }
        return null;
    }

    RtpSender x(String str) {
        PeerConnection peerConnection = this.f45892d;
        if (peerConnection == null) {
            return null;
        }
        for (RtpSender rtpSender : peerConnection.getSenders()) {
            if (rtpSender.id().equals(str)) {
                return rtpSender;
            }
        }
        return null;
    }

    void y(final Promise promise) {
        this.f45892d.getStats(new RTCStatsCollectorCallback() { // from class: com.oney.WebRTCModule.b0
            @Override // org.webrtc.RTCStatsCollectorCallback
            public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                promise.resolve(p0.b(rTCStatsReport));
            }
        });
    }

    RtpTransceiver z(String str) {
        PeerConnection peerConnection = this.f45892d;
        if (peerConnection == null) {
            return null;
        }
        for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
            if (rtpTransceiver.getSender().id().equals(str)) {
                return rtpTransceiver;
            }
        }
        return null;
    }
}
