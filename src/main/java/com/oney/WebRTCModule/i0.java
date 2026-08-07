package com.oney.WebRTCModule;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.OrientationEventListener;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes6.dex */
public class i0 extends com.oney.WebRTCModule.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f45957l = "i0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Intent f45958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final OrientationEventListener f45959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f45960k;

    class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f45961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Context context2) {
            super(context);
            this.f45961a = context2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i11, int i12) {
            try {
                i0.this.f45836g.changeCaptureFormat(i11, i12, 30);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            DisplayMetrics displayMetricsA = g.a((Activity) this.f45961a);
            final int i12 = displayMetricsA.widthPixels;
            final int i13 = displayMetricsA.heightPixels;
            i0 i0Var = i0.this;
            if (i12 == i0Var.f45833d && i13 == i0Var.f45834e) {
                return;
            }
            i0Var.f45833d = i12;
            i0Var.f45834e = i13;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45949a.b(i12, i13);
                }
            });
        }
    }

    class b extends MediaProjection.Callback {
        b() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            Log.w(i0.f45957l, "Media projection stopped.");
            i0.this.f45959j.disable();
            i0.this.l();
            com.oney.WebRTCModule.a.InterfaceC0713a interfaceC0713a = i0.this.f45837h;
            if (interfaceC0713a != null) {
                interfaceC0713a.a();
            }
        }
    }

    public i0(Context context, int i11, int i12, Intent intent) {
        super(i11, i12, 30);
        this.f45958i = intent;
        this.f45960k = context;
        a aVar = new a(context, context);
        this.f45959j = aVar;
        if (aVar.canDetectOrientation()) {
            aVar.enable();
        }
    }

    @Override // com.oney.WebRTCModule.a
    protected VideoCapturer b() {
        return new ScreenCapturerAndroid(this.f45958i, new b());
    }

    @Override // com.oney.WebRTCModule.a
    public void c() {
        MediaProjectionService.a(this.f45960k);
        super.c();
    }

    @Override // com.oney.WebRTCModule.a
    public String d() {
        return "screen-capture";
    }
}
