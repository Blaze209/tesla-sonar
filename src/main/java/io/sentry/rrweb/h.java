package io.sentry.rrweb;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.j3;
import io.sentry.protocol.r;
import io.sentry.q7;
import io.sentry.r4;
import io.sentry.s7;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends b implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f81279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f81280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f81281f;

    public h() {
        super(c.Custom);
        this.f81279d = new HashMap();
        this.f81278c = "options";
    }

    private void g(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("tag").w(this.f81278c);
        j3Var.N(StatusResponse.PAYLOAD);
        h(j3Var, iLogger);
        Map<String, Object> map = this.f81281f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81281f.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    private void h(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        Map<String, Object> map = this.f81279d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81279d.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        g(j3Var, iLogger);
        Map<String, Object> map = this.f81280e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81280e.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public h(q7 q7Var) {
        String str;
        this();
        r sdkVersion = q7Var.getSdkVersion();
        if (sdkVersion != null) {
            this.f81279d.put("nativeSdkName", sdkVersion.f());
            this.f81279d.put("nativeSdkVersion", sdkVersion.h());
        }
        s7 sessionReplay = q7Var.getSessionReplay();
        this.f81279d.put("errorSampleRate", sessionReplay.l());
        this.f81279d.put("sessionSampleRate", sessionReplay.q());
        this.f81279d.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains("android.widget.ImageView")));
        this.f81279d.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains("android.widget.TextView")));
        this.f81279d.put("quality", sessionReplay.m().serializedName());
        this.f81279d.put("maskedViewClasses", sessionReplay.e());
        this.f81279d.put("unmaskedViewClasses", sessionReplay.s());
        if (sessionReplay.n() == r4.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.f81279d.put("screenshotStrategy", str);
        this.f81279d.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.g().isEmpty()));
        if (sessionReplay.g().isEmpty()) {
            return;
        }
        this.f81279d.put("networkDetailAllowUrls", sessionReplay.g());
        this.f81279d.put("networkRequestHeaders", sessionReplay.j());
        this.f81279d.put("networkResponseHeaders", sessionReplay.k());
        this.f81279d.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.v()));
        if (sessionReplay.h().isEmpty()) {
            return;
        }
        this.f81279d.put("networkDetailDenyUrls", sessionReplay.h());
    }
}
