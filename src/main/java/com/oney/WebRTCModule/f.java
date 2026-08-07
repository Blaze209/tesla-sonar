package com.oney.WebRTCModule;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.nio.charset.StandardCharsets;
import org.webrtc.DataChannel;

/* JADX INFO: loaded from: classes6.dex */
class f implements DataChannel.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataChannel f45920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WebRTCModule f45922d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45923a;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            f45923a = iArr;
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45923a[DataChannel.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45923a[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45923a[DataChannel.State.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    f(WebRTCModule webRTCModule, int i11, String str, DataChannel dataChannel) {
        this.f45922d = webRTCModule;
        this.f45921c = i11;
        this.f45919a = str;
        this.f45920b = dataChannel;
    }

    public String a(DataChannel.State state) {
        int i11 = a.f45923a[state.ordinal()];
        if (i11 == 1) {
            return "connecting";
        }
        if (i11 == 2) {
            return "open";
        }
        if (i11 == 3) {
            return "closing";
        }
        if (i11 != 4) {
            return null;
        }
        return "closed";
    }

    public DataChannel b() {
        return this.f45920b;
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.f45919a);
        writableMapCreateMap.putInt("peerConnectionId", this.f45921c);
        writableMapCreateMap.putDouble("bufferedAmount", Long.valueOf(j11).doubleValue());
        this.f45922d.sendEvent("dataChannelDidChangeBufferedAmount", writableMapCreateMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        byte[] bArrArray;
        String str;
        String str2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.f45919a);
        writableMapCreateMap.putInt("peerConnectionId", this.f45921c);
        if (buffer.data.hasArray()) {
            bArrArray = buffer.data.array();
        } else {
            bArrArray = new byte[buffer.data.remaining()];
            buffer.data.get(bArrArray);
        }
        if (buffer.binary) {
            str = Base64.encodeToString(bArrArray, 2);
            str2 = "binary";
        } else {
            str = new String(bArrArray, StandardCharsets.UTF_8);
            str2 = "text";
        }
        writableMapCreateMap.putString("type", str2);
        writableMapCreateMap.putString("data", str);
        this.f45922d.sendEvent("dataChannelReceiveMessage", writableMapCreateMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.f45919a);
        writableMapCreateMap.putInt("peerConnectionId", this.f45921c);
        writableMapCreateMap.putInt("id", this.f45920b.id());
        writableMapCreateMap.putString("state", a(this.f45920b.state()));
        this.f45922d.sendEvent("dataChannelStateChanged", writableMapCreateMap);
    }
}
