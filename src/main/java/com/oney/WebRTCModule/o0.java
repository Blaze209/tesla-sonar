package com.oney.WebRTCModule;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46035a;

        static {
            int[] iArr = new int[RtpTransceiver.RtpTransceiverDirection.values().length];
            f46035a = iArr;
            try {
                iArr[RtpTransceiver.RtpTransceiverDirection.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46035a[RtpTransceiver.RtpTransceiverDirection.RECV_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46035a[RtpTransceiver.RtpTransceiverDirection.SEND_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46035a[RtpTransceiver.RtpTransceiverDirection.SEND_RECV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46035a[RtpTransceiver.RtpTransceiverDirection.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static /* synthetic */ String a(Map map, String str) {
        return str + "=" + ((String) map.get(str));
    }

    public static /* synthetic */ void b(WritableArray writableArray, RtpParameters.HeaderExtension headerExtension) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", headerExtension.getId());
        writableMapCreateMap.putString("uri", headerExtension.getUri());
        writableMapCreateMap.putBoolean("encrypted", headerExtension.getEncrypted());
        writableArray.pushMap(writableMapCreateMap);
    }

    public static /* synthetic */ void c(WritableArray writableArray, RtpParameters.Encoding encoding) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("active", encoding.active);
        String str = encoding.rid;
        if (str != null) {
            writableMapCreateMap.putString("rid", str);
        }
        Integer num = encoding.maxBitrateBps;
        if (num != null) {
            writableMapCreateMap.putInt("maxBitrate", num.intValue());
        }
        Integer num2 = encoding.maxFramerate;
        if (num2 != null) {
            writableMapCreateMap.putInt("maxFramerate", num2.intValue());
        }
        Double d11 = encoding.scaleResolutionDownBy;
        if (d11 != null) {
            writableMapCreateMap.putDouble("scaleResolutionDownBy", d11.doubleValue());
        }
        writableArray.pushMap(writableMapCreateMap);
    }

    public static /* synthetic */ void d(WritableArray writableArray, RtpParameters.Codec codec) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("payloadType", codec.payloadType);
        writableMapCreateMap.putString("mimeType", codec.name);
        writableMapCreateMap.putInt("clockRate", codec.clockRate.intValue());
        Integer num = codec.numChannels;
        if (num != null) {
            writableMapCreateMap.putInt("channels", num.intValue());
        }
        if (!codec.parameters.isEmpty()) {
            writableMapCreateMap.putString("sdpFmtpLine", o(codec.parameters));
        }
        writableArray.pushMap(writableMapCreateMap);
    }

    public static RtpTransceiver.RtpTransceiverDirection f(String str) {
        str.getClass();
        switch (str) {
            case "recvonly":
                return RtpTransceiver.RtpTransceiverDirection.RECV_ONLY;
            case "inactive":
                return RtpTransceiver.RtpTransceiverDirection.INACTIVE;
            case "sendonly":
                return RtpTransceiver.RtpTransceiverDirection.SEND_ONLY;
            case "sendrecv":
                return RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
            default:
                throw new Error("Invalid direction");
        }
    }

    private static RtpParameters.Encoding g(ReadableMap readableMap) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding(readableMap.getString("rid"), true, Double.valueOf(1.0d));
        if (readableMap.hasKey("active")) {
            encoding.active = readableMap.getBoolean("active");
        }
        if (readableMap.hasKey("maxBitrate")) {
            encoding.maxBitrateBps = Integer.valueOf(readableMap.getInt("maxBitrate"));
        }
        if (readableMap.hasKey("maxFramerate")) {
            encoding.maxFramerate = Integer.valueOf(readableMap.getInt("maxFramerate"));
        }
        if (readableMap.hasKey("scaleResolutionDownBy")) {
            encoding.scaleResolutionDownBy = Double.valueOf(readableMap.getDouble("scaleResolutionDownBy"));
        }
        return encoding;
    }

    public static MediaStreamTrack.MediaType h(String str) {
        str.getClass();
        if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        }
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            return MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        }
        throw new Error("Unknown media type");
    }

    public static RtpTransceiver.RtpTransceiverInit i(ReadableMap readableMap) {
        ReadableArray array;
        ReadableArray array2;
        String string;
        if (readableMap == null) {
            return null;
        }
        RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirectionF = RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (readableMap.hasKey("direction") && (string = readableMap.getString("direction")) != null) {
            rtpTransceiverDirectionF = f(string);
        }
        if (readableMap.hasKey("streamIds") && (array2 = readableMap.getArray("streamIds")) != null) {
            for (int i11 = 0; i11 < array2.size(); i11++) {
                arrayList.add(array2.getString(i11));
            }
        }
        if (readableMap.hasKey("sendEncodings") && (array = readableMap.getArray("sendEncodings")) != null) {
            for (int i12 = 0; i12 < array.size(); i12++) {
                arrayList2.add(g(array.getMap(i12)));
            }
        }
        return new RtpTransceiver.RtpTransceiverInit(rtpTransceiverDirectionF, arrayList, arrayList2);
    }

    public static String j(RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        int i11 = a.f46035a[rtpTransceiverDirection.ordinal()];
        if (i11 == 1) {
            return "inactive";
        }
        if (i11 == 2) {
            return "recvonly";
        }
        if (i11 == 3) {
            return "sendonly";
        }
        if (i11 == 4) {
            return "sendrecv";
        }
        if (i11 == 5) {
            return "stopped";
        }
        throw new Error("Invalid direction");
    }

    public static ReadableMap k(int i11, RtpReceiver rtpReceiver) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpReceiver.id());
        writableMapCreateMap.putInt("peerConnectionId", i11);
        if (rtpReceiver.track() != null) {
            writableMapCreateMap.putMap("track", r(i11, rtpReceiver.track()));
        }
        writableMapCreateMap.putMap("rtpParameters", n(rtpReceiver.getParameters()));
        return writableMapCreateMap;
    }

    public static ReadableMap l(RtpCapabilities rtpCapabilities) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        final WritableArray writableArrayCreateArray = Arguments.createArray();
        rtpCapabilities.codecs.forEach(new Consumer() { // from class: com.oney.WebRTCModule.j0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                writableArrayCreateArray.pushMap(o0.m((RtpCapabilities.CodecCapability) obj));
            }
        });
        writableMapCreateMap.putArray("codecs", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    public static ReadableMap m(RtpCapabilities.CodecCapability codecCapability) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("payloadType", codecCapability.preferredPayloadType);
        writableMapCreateMap.putString("mimeType", codecCapability.mimeType);
        writableMapCreateMap.putInt("clockRate", codecCapability.clockRate.intValue());
        Integer num = codecCapability.numChannels;
        if (num != null) {
            writableMapCreateMap.putInt("channels", num.intValue());
        }
        if (!codecCapability.parameters.isEmpty()) {
            writableMapCreateMap.putString("sdpFmtpLine", o(codecCapability.parameters));
        }
        return writableMapCreateMap;
    }

    public static ReadableMap n(RtpParameters rtpParameters) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        final WritableArray writableArrayCreateArray = Arguments.createArray();
        final WritableArray writableArrayCreateArray2 = Arguments.createArray();
        final WritableArray writableArrayCreateArray3 = Arguments.createArray();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("cname", rtpParameters.getRtcp().getCname());
        writableMapCreateMap2.putBoolean("reducedSize", rtpParameters.getRtcp().getReducedSize());
        rtpParameters.getHeaderExtensions().forEach(new Consumer() { // from class: com.oney.WebRTCModule.l0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.b(writableArrayCreateArray3, (RtpParameters.HeaderExtension) obj);
            }
        });
        rtpParameters.encodings.forEach(new Consumer() { // from class: com.oney.WebRTCModule.m0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.c(writableArrayCreateArray, (RtpParameters.Encoding) obj);
            }
        });
        rtpParameters.codecs.forEach(new Consumer() { // from class: com.oney.WebRTCModule.n0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o0.d(writableArrayCreateArray2, (RtpParameters.Codec) obj);
            }
        });
        writableMapCreateMap.putString("transactionId", rtpParameters.transactionId);
        writableMapCreateMap.putMap("rtcp", writableMapCreateMap2);
        writableMapCreateMap.putArray("encodings", writableArrayCreateArray);
        writableMapCreateMap.putArray("codecs", writableArrayCreateArray2);
        writableMapCreateMap.putArray("headerExtensions", writableArrayCreateArray3);
        RtpParameters.DegradationPreference degradationPreference = rtpParameters.degradationPreference;
        if (degradationPreference != null) {
            writableMapCreateMap.putString("degradationPreference", degradationPreference.toString());
        }
        return writableMapCreateMap;
    }

    public static String o(final Map<String, String> map) {
        return (String) map.keySet().stream().map(new Function() { // from class: com.oney.WebRTCModule.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return o0.a(map, (String) obj);
            }
        }).collect(Collectors.joining(";"));
    }

    public static ReadableMap p(int i11, RtpSender rtpSender) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpSender.id());
        writableMapCreateMap.putInt("peerConnectionId", i11);
        if (rtpSender.track() != null) {
            writableMapCreateMap.putMap("track", r(i11, rtpSender.track()));
        }
        writableMapCreateMap.putMap("rtpParameters", n(rtpSender.getParameters()));
        return writableMapCreateMap;
    }

    public static ReadableMap q(int i11, String str, MediaStream mediaStream) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("streamId", mediaStream.getId());
        writableMapCreateMap.putString("streamReactTag", str);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<VideoTrack> it = mediaStream.videoTracks.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(r(i11, it.next()));
        }
        Iterator<AudioTrack> it2 = mediaStream.audioTracks.iterator();
        while (it2.hasNext()) {
            writableArrayCreateArray.pushMap(r(i11, it2.next()));
        }
        writableMapCreateMap.putArray("tracks", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    public static ReadableMap r(int i11, MediaStreamTrack mediaStreamTrack) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", mediaStreamTrack.id());
        writableMapCreateMap.putInt("peerConnectionId", i11);
        writableMapCreateMap.putString("kind", mediaStreamTrack.kind());
        writableMapCreateMap.putBoolean("enabled", mediaStreamTrack.enabled());
        writableMapCreateMap.putString("readyState", mediaStreamTrack.state().toString().toLowerCase());
        writableMapCreateMap.putBoolean("remote", true);
        return writableMapCreateMap;
    }

    public static ReadableMap s(int i11, RtpTransceiver rtpTransceiver) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpTransceiver.getSender().id());
        writableMapCreateMap.putInt("peerConnectionId", i11);
        writableMapCreateMap.putString("mid", rtpTransceiver.getMid());
        writableMapCreateMap.putString("direction", j(rtpTransceiver.getDirection()));
        if (rtpTransceiver.getCurrentDirection() != null) {
            writableMapCreateMap.putString("currentDirection", j(rtpTransceiver.getCurrentDirection()));
        }
        writableMapCreateMap.putBoolean("isStopped", rtpTransceiver.isStopped());
        writableMapCreateMap.putMap("receiver", k(i11, rtpTransceiver.getReceiver()));
        writableMapCreateMap.putMap("sender", p(i11, rtpTransceiver.getSender()));
        return writableMapCreateMap;
    }

    public static RtpParameters t(ReadableMap readableMap, RtpParameters rtpParameters) {
        ReadableArray array = readableMap.getArray("encodings");
        List<RtpParameters.Encoding> list = rtpParameters.encodings;
        if (array.size() != list.size()) {
            return null;
        }
        for (int i11 = 0; i11 < array.size(); i11++) {
            ReadableMap map = array.getMap(i11);
            RtpParameters.Encoding encoding = list.get(i11);
            Integer numValueOf = map.hasKey("maxBitrate") ? Integer.valueOf(map.getInt("maxBitrate")) : null;
            Integer numValueOf2 = map.hasKey("maxFramerate") ? Integer.valueOf(map.getInt("maxFramerate")) : null;
            Double dValueOf = map.hasKey("scaleResolutionDownBy") ? Double.valueOf(map.getDouble("scaleResolutionDownBy")) : null;
            encoding.active = map.getBoolean("active");
            encoding.rid = map.getString("rid");
            encoding.maxBitrateBps = numValueOf;
            encoding.maxFramerate = numValueOf2;
            encoding.scaleResolutionDownBy = dValueOf;
        }
        if (readableMap.hasKey("degradationPreference")) {
            rtpParameters.degradationPreference = RtpParameters.DegradationPreference.valueOf(readableMap.getString("degradationPreference"));
        }
        return rtpParameters;
    }
}
