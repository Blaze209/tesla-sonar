package com.brentvatne.react;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/brentvatne/react/VideoDecoderInfoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", "p", "Ljn0/h0;", "getWidevineLevel", "(Lcom/facebook/react/bridge/Promise;)V", "mimeType", "", Snapshot.WIDTH, Snapshot.HEIGHT, "isCodecSupported", "(Ljava/lang/String;DDLcom/facebook/react/bridge/Promise;)V", "isHEVCSupported", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoDecoderInfoModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "VideoDecoderInfoModule";
    private static final String SECURITY_LEVEL_PROPERTY = "securityLevel";
    private static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);

    public VideoDecoderInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactMethod
    public final void getWidevineLevel(Promise p11) {
        s.k(p11, "p");
        int i11 = 0;
        try {
            String propertyString = new MediaDrm(WIDEVINE_UUID).getPropertyString(SECURITY_LEVEL_PROPERTY);
            s.j(propertyString, "getPropertyString(...)");
            switch (propertyString.hashCode()) {
                case 2405:
                    if (propertyString.equals("L1")) {
                        i11 = 1;
                    }
                    break;
                case 2406:
                    if (propertyString.equals("L2")) {
                        i11 = 2;
                    }
                    break;
                case 2407:
                    if (propertyString.equals("L3")) {
                        i11 = 3;
                    }
                    break;
            }
        } catch (UnsupportedSchemeException e11) {
            e11.printStackTrace();
        }
        p11.resolve(Integer.valueOf(i11));
    }

    @ReactMethod
    public final void isCodecSupported(String mimeType, double width, double height, Promise p11) {
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        s.h(mimeType);
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(mimeType, (int) width, (int) height);
        s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
        String strFindDecoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormatCreateVideoFormat);
        if (strFindDecoderForFormat == null) {
            if (p11 != null) {
                p11.resolve("unsupported");
                return;
            }
            return;
        }
        if (i11 < 29) {
            if (p11 != null) {
                p11.resolve("software");
                return;
            }
            return;
        }
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        s.j(codecInfos, "getCodecInfos(...)");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (t.M(mediaCodecInfo.getName(), strFindDecoderForFormat, true) && mediaCodecInfo.isHardwareAccelerated()) {
                z11 = true;
                break;
            }
        }
        if (p11 != null) {
            p11.resolve(z11 ? "software" : "hardware");
        }
    }

    @ReactMethod
    public final void isHEVCSupported(Promise p11) {
        s.k(p11, "p");
        isCodecSupported("video/hevc", 1920.0d, 1080.0d, p11);
    }
}
