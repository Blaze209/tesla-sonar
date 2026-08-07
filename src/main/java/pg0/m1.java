package pg0;

import java.io.File;
import java.util.List;
import p013kotlin.Metadata;
import sg0.CaptureTipsViewModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¡\u0003\u00109\u001a\u0002082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2 \b\u0002\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2 \b\u0002\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$j\u0002`'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u00172\b\b\u0002\u0010,\u001a\u00020\u00172\b\b\u0002\u0010-\u001a\u00020\u00172\u001a\b\u0002\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u00102\u001a\u00020\u001d2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lpg0/g3$a;", "renderProps", "", "title", "message", "Lpg0/g5$b$a;", "captureButtonState", "Lpg0/g5$d;", "overlay", "Lwg0/e;", "idClass", "Lpg0/d4$e;", "captureSide", "Lii0/a;", "navigationState", "Lkotlin/Function2;", "", "Lzf0/u;", "Ljn0/h0;", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lzf0/e;", "autoCaptureRules", "Lpg0/n1;", "state", "", "autoCaptureRulesId", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "Lfg0/a;", "videoCaptureMethod", "enableAnalyzer", "showFinalizeUi", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "manualCaptureClicked", "checkPermissions", "remainingCaptureCount", "hintText", "Lsg0/h;", "captureTips", "Lej0/a;", "webRtcManager", "Lpg0/g5$b;", "f", "(Lpg0/g3$a;Ljava/lang/String;Ljava/lang/String;Lpg0/g5$b$a;Lpg0/g5$d;Lwg0/e;Lpg0/d4$e;Lii0/a;Lwn0/p;Lwn0/a;Lwn0/a;ZLjava/util/List;Lpg0/n1;ILzf0/y$a;Lbg0/e$a;Lwn0/p;Lwn0/l;Lwn0/l;Lfg0/a;ZZZLwn0/p;Lwn0/a;Lwn0/a;ILjava/lang/String;Lsg0/h;Lej0/a;)Lpg0/g5$b;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m1 {
    public static final g5.b f(g3.a renderProps, String title, String message, g5.b.a captureButtonState, g5.d overlay, wg0.e idClass, IdConfig.e captureSide, ii0.a navigationState, wn0.p<? super List<String>, ? super zf0.u, jn0.h0> manuallyCapture, wn0.a<jn0.h0> close, wn0.a<jn0.h0> back, boolean z11, List<? extends zf0.e> autoCaptureRules, n1 state, int i11, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, wn0.p<? super List<String>, ? super zf0.u, jn0.h0> autoCapture, wn0.l<? super Throwable, jn0.h0> onCaptureError, wn0.l<? super Throwable, jn0.h0> onCameraError, fg0.a videoCaptureMethod, boolean z12, boolean z13, boolean z14, wn0.p<? super File, ? super zf0.u, jn0.h0> onLocalVideoFinalized, wn0.a<jn0.h0> manualCaptureClicked, wn0.a<jn0.h0> checkPermissions, int i12, String str, CaptureTipsViewModel captureTipsViewModel, ej0.a aVar) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(captureButtonState, "captureButtonState");
        p013kotlin.jvm.internal.s.k(overlay, "overlay");
        p013kotlin.jvm.internal.s.k(idClass, "idClass");
        p013kotlin.jvm.internal.s.k(captureSide, "captureSide");
        p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
        p013kotlin.jvm.internal.s.k(manuallyCapture, "manuallyCapture");
        p013kotlin.jvm.internal.s.k(close, "close");
        p013kotlin.jvm.internal.s.k(back, "back");
        p013kotlin.jvm.internal.s.k(autoCaptureRules, "autoCaptureRules");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
        p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        p013kotlin.jvm.internal.s.k(autoCapture, "autoCapture");
        p013kotlin.jvm.internal.s.k(onCaptureError, "onCaptureError");
        p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
        p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
        p013kotlin.jvm.internal.s.k(onLocalVideoFinalized, "onLocalVideoFinalized");
        p013kotlin.jvm.internal.s.k(manualCaptureClicked, "manualCaptureClicked");
        p013kotlin.jvm.internal.s.k(checkPermissions, "checkPermissions");
        return new g5.b(title, message, renderProps.getStrings().getCaptureDisclaimer(), captureButtonState, overlay, idClass, captureSide, navigationState, manuallyCapture, close, back, z11, autoCaptureRules, state, i11, renderProps.getStyles(), autoCapture, onCaptureError, onCameraError, i12, manualCaptureClicked, checkPermissions, videoCaptureMethod, z14, onLocalVideoFinalized, z12, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), z13, str, captureTipsViewModel, aVar, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled(), renderProps.getVideoCaptureConfig().getRecordAudio(), cameraXControllerFactory, camera2ManagerFactoryFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(List list, zf0.u uVar) {
        p013kotlin.jvm.internal.s.k(list, "<unused var>");
        p013kotlin.jvm.internal.s.k(uVar, "<unused var>");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(List list, zf0.u uVar) {
        p013kotlin.jvm.internal.s.k(list, "<unused var>");
        p013kotlin.jvm.internal.s.k(uVar, "<unused var>");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k(File file, zf0.u uVar) {
        p013kotlin.jvm.internal.s.k(file, "<unused var>");
        p013kotlin.jvm.internal.s.k(uVar, "<unused var>");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l() {
        return jn0.h0.f84049a;
    }
}
