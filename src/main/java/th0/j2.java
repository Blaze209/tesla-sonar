package th0;

import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÇ\u0002\u00106\u001a\u0002052\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\b\u001a\"0\u0002R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u000f2\b\b\u0002\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00108\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b8\u00109\u001a\u001f\u0010:\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b:\u00109\u001a\u0013\u0010<\u001a\u00020;*\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lth0/d6$b;", "renderProps", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Ly20/k;", "Lth0/x1;", "Lth0/d6$c;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth0/a1$b;", "pose", "", "title", "message", "realTimeHint", "", "isAutoCaptureOn", "Lth0/d6$d$c$b;", "mode", "Lth0/d6$d$c$a;", "assetOverrides", "requireStrictSelfieCapture", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "isAudioRequired", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "", "poseScore", "Ldg0/a;", "brightnessInfo", "Lzf0/u$b;", "facingMode", "isFlashEnabled", "isFlashOn", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lth0/d6$d;", "e", "(Lth0/d6$b;Ly20/k$a;Lth0/a1$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLth0/d6$d$c$b;Lth0/d6$d$c$a;ZLii0/a;Lwn0/a;Lwn0/a;Lwn0/l;Lwn0/a;Lfg0/a;Lej0/a;ZLzf0/y$a;Lbg0/e$a;FLdg0/a;Lzf0/u$b;ZZZZZ)Lth0/d6$d;", "l", "(Lth0/d6$b;Lth0/a1$b;)Ljava/lang/String;", "k", "Lth0/d6$d$a$a;", "m", "(Lth0/d6$d$c$b;)Lth0/d6$d$a$a;", "selfie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j2 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113932b;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113931a = iArr;
            int[] iArr2 = new int[a1.b.values().length];
            try {
                iArr2[a1.b.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a1.b.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a1.b.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f113932b = iArr2;
        }
    }

    public static final d6.d e(d6.Input renderProps, final y20.k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a context, a1.b bVar, String str, String str2, String str3, boolean z11, d6.d.c.b mode, d6.d.c.AssetOverrides assetOverrides, boolean z12, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, wn0.l<? super Throwable, jn0.h0> onCameraError, wn0.a<jn0.h0> onPermissionChanged, fg0.a videoCaptureMethod, ej0.a aVar, boolean z13, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, float f11, dg0.a aVar2, zf0.u.b facingMode, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        p013kotlin.jvm.internal.s.k(assetOverrides, "assetOverrides");
        p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
        p013kotlin.jvm.internal.s.k(onBack, "onBack");
        p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
        p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
        p013kotlin.jvm.internal.s.k(onPermissionChanged, "onPermissionChanged");
        p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
        p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
        p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        p013kotlin.jvm.internal.s.k(facingMode, "facingMode");
        int i11 = a.f113931a[renderProps.getDesignVersion().ordinal()];
        if (i11 == 1) {
            return new d6.d.c(str, str2, mode, renderProps.getStyles(), assetOverrides, z12, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar, z13, cameraXControllerFactory, camera2ManagerFactoryFactory, z17);
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new d6.d.a(str, ((mode instanceof d6.d.c.b.g) || (mode instanceof d6.d.c.b.i)) ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, bVar), k(renderProps, bVar), z11 ? renderProps.getStrings().getAutoCaptureOn() : null, renderProps.getStrings().getCaptureSuccess(), str3, z11, m(mode), renderProps.getStyles(), z12, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar, z13, cameraXControllerFactory, camera2ManagerFactoryFactory, new wn0.l() { // from class: th0.f2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j2.g(context, (zf0.u.b) obj);
            }
        }, f11, aVar2, facingMode, z14, z15, new wn0.l() { // from class: th0.g2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j2.i(context, ((Boolean) obj).booleanValue());
            }
        }, bVar, z16, z17, z18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(y20.k.a aVar, final zf0.u.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.i2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j2.h(it, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(zf0.u.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.RestartCamera(false, false, t6.j(action, false), bVar, 3, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(y20.k.a aVar, final boolean z11) {
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.h2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j2.j(z11, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(boolean z11, y20.r.c action) {
        Parcelable parcelableU;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        x1 x1Var = (x1) action.c();
        if (!(x1Var instanceof z)) {
            return jn0.h0.f84049a;
        }
        if (x1Var instanceof x1.Capture) {
            x1.Capture capture = (x1.Capture) x1Var;
            parcelableU = capture.s((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : BitmapDescriptorFactory.HUE_RED, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : z11, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture.flashState : null);
        } else if (x1Var instanceof x1.CountdownToManualCapture) {
            parcelableU = x1.CountdownToManualCapture.u((x1.CountdownToManualCapture) x1Var, 0, null, null, null, 0L, false, 0L, null, null, null, z11, 1023, null);
        } else if (x1Var instanceof x1.StartCapture) {
            x1.StartCapture startCapture = (x1.StartCapture) x1Var;
            parcelableU = startCapture.s((4095 & 1) != 0 ? startCapture.centered : false, (4095 & 2) != 0 ? startCapture.selfieError : null, (4095 & 4) != 0 ? startCapture.poseScore : BitmapDescriptorFactory.HUE_RED, (4095 & 8) != 0 ? startCapture.brightnessInfo : null, (4095 & 16) != 0 ? startCapture.posesNeeded : null, (4095 & 32) != 0 ? startCapture.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture.cameraProperties : null, (4095 & 512) != 0 ? startCapture.backState : null, (4095 & 1024) != 0 ? startCapture.poseConfigs : null, (4095 & 2048) != 0 ? startCapture.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture.isFlashEnabled : z11);
        } else if (x1Var instanceof x1.CountdownToCapture) {
            x1.CountdownToCapture countdownToCapture = (x1.CountdownToCapture) x1Var;
            parcelableU = countdownToCapture.s((8188 & 1) != 0 ? countdownToCapture.countDown : 0, (8188 & 2) != 0 ? countdownToCapture.selfieError : null, (8188 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture.poseScore : BitmapDescriptorFactory.HUE_RED, (8188 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (8188 & 128) != 0 ? countdownToCapture.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture.backState : null, (8188 & 512) != 0 ? countdownToCapture.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture.isFlashEnabled : z11);
        } else if (x1Var instanceof x1.ShowPoseHint) {
            parcelableU = x1.ShowPoseHint.u((x1.ShowPoseHint) x1Var, null, null, false, null, 0L, null, null, null, z11, 255, null);
        } else if (x1Var instanceof x1.StartCaptureFaceDetected) {
            x1.StartCaptureFaceDetected startCaptureFaceDetected = (x1.StartCaptureFaceDetected) x1Var;
            parcelableU = startCaptureFaceDetected.s((1023 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (1023 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (1023 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (1023 & 8) != 0 ? startCaptureFaceDetected.poseScore : BitmapDescriptorFactory.HUE_RED, (1023 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (1023 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (1023 & 64) != 0 ? startCaptureFaceDetected.backState : null, (1023 & 128) != 0 ? startCaptureFaceDetected.poseConfigs : null, (1023 & 256) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (1023 & 512) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (1023 & 1024) != 0 ? startCaptureFaceDetected.isFlashEnabled : z11);
        } else if (x1Var instanceof x1.WaitForCameraFeed) {
            parcelableU = x1.WaitForCameraFeed.u((x1.WaitForCameraFeed) x1Var, false, false, null, null, null, false, null, z11, 127, null);
        } else {
            if (!(x1Var instanceof x1.WaitForWebRtcSetup)) {
                throw new NoWhenBranchMatchedException();
            }
            parcelableU = x1.WaitForWebRtcSetup.u((x1.WaitForWebRtcSetup) x1Var, null, null, 0L, null, null, null, false, null, z11, 255, null);
        }
        action.e(parcelableU);
        return jn0.h0.f84049a;
    }

    private static final String k(d6.Input input, a1.b bVar) {
        int i11 = bVar == null ? -1 : a.f113932b[bVar.ordinal()];
        if (i11 == -1) {
            return null;
        }
        if (i11 == 1) {
            return input.getStrings().getSelfieHintLookLeftDescription();
        }
        if (i11 == 2) {
            return input.getStrings().getSelfieHintLookRightDescription();
        }
        if (i11 == 3) {
            return input.getStrings().getSelfieHintCenterFace();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String l(d6.Input input, a1.b bVar) {
        int i11 = bVar == null ? -1 : a.f113932b[bVar.ordinal()];
        if (i11 == -1) {
            return null;
        }
        if (i11 == 1) {
            return input.getStrings().getSelfieHintLookLeft();
        }
        if (i11 == 2) {
            return input.getStrings().getSelfieHintLookRight();
        }
        if (i11 == 3) {
            return input.getStrings().getSelfieHintPoseNotCentered();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final d6.d.a.AbstractC2425a m(d6.d.c.b bVar) {
        if (bVar instanceof d6.d.c.b.a) {
            return new d6.d.a.AbstractC2425a.C2426a(t6.z(((d6.d.c.b.a) bVar).getOverlay()));
        }
        if (bVar instanceof d6.d.c.b.C2428b) {
            d6.d.c.b.C2428b c2428b = (d6.d.c.b.C2428b) bVar;
            return new d6.d.a.AbstractC2425a.b(t6.z(c2428b.getOverlay()), c2428b.getCountDown(), c2428b.getRecordLocalVideo(), c2428b.getMaxRecordingLengthMs(), c2428b.d());
        }
        if (bVar instanceof d6.d.c.b.C2429c) {
            d6.d.c.b.C2429c c2429c = (d6.d.c.b.C2429c) bVar;
            return new d6.d.a.AbstractC2425a.c(t6.z(c2429c.getOverlay()), c2429c.b(), c2429c.c(), c2429c.getStartFinalize());
        }
        if (bVar instanceof d6.d.c.b.C2430d) {
            d6.d.c.b.C2430d c2430d = (d6.d.c.b.C2430d) bVar;
            return new d6.d.a.AbstractC2425a.C2427d(t6.z(c2430d.getOverlay()), c2430d.d(), c2430d.c(), c2430d.getForceCapture());
        }
        if (bVar instanceof d6.d.c.b.e) {
            d6.d.c.b.e eVar = (d6.d.c.b.e) bVar;
            return new d6.d.a.AbstractC2425a.e(t6.z(eVar.getOverlay()), eVar.b());
        }
        if (bVar instanceof d6.d.c.b.f) {
            d6.d.c.b.f fVar = (d6.d.c.b.f) bVar;
            return new d6.d.a.AbstractC2425a.f(t6.z(fVar.getOverlay()), fVar.b());
        }
        if (bVar instanceof d6.d.c.b.g) {
            d6.d.c.b.g gVar = (d6.d.c.b.g) bVar;
            return new d6.d.a.AbstractC2425a.g(t6.z(gVar.getOverlay()), gVar.b());
        }
        if (bVar instanceof d6.d.c.b.h) {
            d6.d.c.b.h hVar = (d6.d.c.b.h) bVar;
            return new d6.d.a.AbstractC2425a.h(t6.z(hVar.getOverlay()), hVar.c(), hVar.getImageCaptured());
        }
        if (!(bVar instanceof d6.d.c.b.i)) {
            throw new NoWhenBranchMatchedException();
        }
        d6.d.c.b.i iVar = (d6.d.c.b.i) bVar;
        return new d6.d.a.AbstractC2425a.i(t6.z(iVar.getOverlay()), iVar.getMaxRecordingLengthMs());
    }
}
