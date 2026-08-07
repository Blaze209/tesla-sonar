package com.mrousavy.camera.react;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import dz.e1;
import fz.Video;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Lfz/p;", "options", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "Ljn0/h0;", "f", "(Lcom/mrousavy/camera/react/o;Lfz/p;Lcom/facebook/react/bridge/Callback;)V", DateTokenConverter.CONVERTER_KEY, "(Lcom/mrousavy/camera/react/o;)V", "e", IntegerTokenConverter.CONVERTER_KEY, "c", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w {
    public static final void c(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        dz.w.b(oVar.getCameraSession());
    }

    public static final void d(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        dz.w.c(oVar.getCameraSession());
    }

    public static final void e(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        dz.w.d(oVar.getCameraSession());
    }

    public static final void f(o oVar, fz.p options, final Callback onRecordCallback) throws e1 {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(onRecordCallback, "onRecordCallback");
        if (oVar.getOrg.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND java.lang.String() && androidx.core.content.b.checkSelfPermission(oVar.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            throw new e1();
        }
        dz.w.e(oVar.getCameraSession(), oVar.getOrg.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND java.lang.String(), options, new wn0.l() { // from class: com.mrousavy.camera.react.u
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return w.g(onRecordCallback, (Video) obj);
            }
        }, new wn0.l() { // from class: com.mrousavy.camera.react.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return w.h(onRecordCallback, (dz.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(Callback callback, Video video) {
        p013kotlin.jvm.internal.s.k(video, "video");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("path", video.getPath());
        writableMapCreateMap.putDouble("duration", video.getDurationMs() / 1000.0d);
        writableMapCreateMap.putInt(Snapshot.WIDTH, video.getSize().getWidth());
        writableMapCreateMap.putInt(Snapshot.HEIGHT, video.getSize().getHeight());
        callback.invoke(writableMapCreateMap, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(Callback callback, dz.c error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        callback.invoke(null, iz.a.c(error.a(), error.getMessage(), null, null, 12, null));
        return h0.f84049a;
    }

    public static final void i(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        dz.w.g(oVar.getCameraSession());
    }
}
