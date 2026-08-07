package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4319y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39104b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39105c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4305w f39106a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4319y documentCamera$fourthline_vision_release() {
            return new C4319y(new O0());
        }

        public final C4319y selfieCamera$fourthline_vision_release() {
            return new C4319y(new C4296u4());
        }

        private a() {
        }
    }

    public C4319y(InterfaceC4305w cameraInfoInstanceProvider) {
        p013kotlin.jvm.internal.s.k(cameraInfoInstanceProvider, "cameraInfoInstanceProvider");
        this.f39106a = cameraInfoInstanceProvider;
    }

    public final C4257p provideCamera2(CameraManager cameraManager, Handler handler, C4312x cameraInfoProvider) {
        p013kotlin.jvm.internal.s.k(cameraManager, "cameraManager");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        p013kotlin.jvm.internal.s.k(cameraInfoProvider, "cameraInfoProvider");
        return new C4257p(cameraManager, handler, cameraInfoProvider);
    }

    public final C4284t provideCameraFocusManager(C4257p camera2, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(camera2, "camera2");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        return new C4284t(camera2, CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(coroutineContext), JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
    }

    public C4312x provideCameraInfoProvider(CameraManager cameraManager, Display display, C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(cameraManager, "cameraManager");
        p013kotlin.jvm.internal.s.k(display, "display");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        return this.f39106a.provideCameraInfoProvider(cameraManager, display, scannerConfig);
    }

    public final CameraManager provideCameraManager(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("camera");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    public final Display provideDisplay(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("window");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        p013kotlin.jvm.internal.s.j(defaultDisplay, "getDefaultDisplay(...)");
        return defaultDisplay;
    }
}
