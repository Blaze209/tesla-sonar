package th0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00140\u0000R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0012\u001a\u00020\u0002*\u00160\u0000R\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001c\u001a\u00020\u001b*\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aC\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001b0\u001ej\u0002` *\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u0015H\u0000¢\u0006\u0004\b!\u0010\"\u001aO\u0010(\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2&\u0010%\u001a\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u00152\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010+\u001a\u00020**\u00020\u0007H\u0000¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010/\u001a\u00020.*\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00101\u001a\u00020\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Ly20/r$c;", "Ly20/r;", "Lth0/x1;", "", "addCurrentState", "j", "(Ly20/r$c;Z)Lth0/x1;", "Lth0/d6$b;", "", "Lth0/a1;", "selfies", "", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "y", "(Ly20/r$c;Ljava/util/List;Ljava/lang/String;Lzf0/u;JLth0/x1;)Lth0/x1;", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Ly20/k;", "Lth0/d6$c;", "", "Lej0/a;", "webRtcManagerBridge", "Ljn0/h0;", "t", "(Ly20/k$a;Lej0/a;)V", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "l", "(Ly20/k$a;)Lwn0/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "renderContext", "renderProps", "useVideoCapture", "v", "(Landroid/content/Context;Ly20/k$a;Lth0/d6$b;Z)V", "Lth0/d6$d$c$a;", "x", "(Lth0/d6$b;)Lth0/d6$d$c$a;", "Lth0/d6$d$c$c;", "Lth0/d6$d$a$b;", "z", "(Lth0/d6$d$c$c;)Lth0/d6$d$a$b;", "A", "(Lth0/x1;)Z", "selfie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t6 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114159a;

        static {
            int[] iArr = new int[d6.d.c.EnumC2431c.values().length];
            try {
                iArr[d6.d.c.EnumC2431c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d6.d.c.EnumC2431c.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f114159a = iArr;
        }
    }

    public static final boolean A(x1 x1Var) {
        p013kotlin.jvm.internal.s.k(x1Var, "<this>");
        if ((x1Var instanceof x1.Capture) || (x1Var instanceof x1.b) || (x1Var instanceof x1.CountdownToCapture) || (x1Var instanceof x1.CountdownToManualCapture) || (x1Var instanceof x1.ShowPoseHint) || (x1Var instanceof x1.StartCapture) || (x1Var instanceof x1.StartCaptureFaceDetected) || (x1Var instanceof x1.WaitForCameraFeed) || (x1Var instanceof x1.WaitForWebRtcSetup) || (x1Var instanceof x1.f) || (x1Var instanceof x1.q) || (x1Var instanceof x1.FinalizeLocalVideoCapture)) {
            return true;
        }
        if ((x1Var instanceof x1.j) || (x1Var instanceof x1.RestartCamera) || (x1Var instanceof x1.i) || (x1Var instanceof x1.n)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x1 j(y20.r<?, x1, ?>.c cVar, boolean z11) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        return z11 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ x1 k(y20.r.c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return j(cVar, z11);
    }

    public static final wn0.l<Throwable, jn0.h0> l(final y20.k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return new wn0.l() { // from class: th0.l6
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t6.m(aVar, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(y20.k.a aVar, final Throwable cameraError) {
        p013kotlin.jvm.internal.s.k(cameraError, "cameraError");
        if (!(cameraError instanceof CameraError)) {
            aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.n6
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return t6.n(cameraError, (y20.r.c) obj);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }
        CameraError cameraError2 = (CameraError) cameraError;
        if (!(cameraError2 instanceof NoActiveRecordingError)) {
            if (cameraError2 instanceof NoSuitableCameraError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.o6
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t6.o((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof RecordingTooLongError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.p6
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t6.p((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof FinalizeRecordingError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.q6
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t6.q((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof UnsupportedDevice) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.r6
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t6.r((y20.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(cameraError2 instanceof RecordingInterrupted)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.s6
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t6.s((y20.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(Throwable th2, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new d6.c.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new d6.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        y1.a((x1) action.c());
        if (A((x1) action.c())) {
            action.e(new x1.RestartCamera(false, false, j(action, false), ((x1) action.c()).getCameraFacingMode(), 3, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new d6.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new d6.c.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        y1.a((x1) action.c());
        if (A((x1) action.c())) {
            action.e(new x1.RestartCamera(false, false, j(action, false), ((x1) action.c()).getCameraFacingMode(), 3, null));
        }
        return jn0.h0.f84049a;
    }

    public static final void t(y20.k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a aVar, final ej0.a aVar2) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.k6
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t6.u(aVar2, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u(ej0.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        x1 backState = ((x1) action.c()).getBackState();
        if (aVar != null) {
            aVar.d();
        }
        if (backState != null) {
            backState.r(true);
            action.e(backState);
        } else if (((d6.Input) action.b()).getBackStepEnabled()) {
            action.d(d6.c.a.f113699a);
        } else {
            action.d(d6.c.b.f113700a);
        }
        return jn0.h0.f84049a;
    }

    public static final void v(Context context, y20.k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a renderContext, d6.Input renderProps, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(renderContext, "renderContext");
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        List listS = p013kotlin.collections.v.s(oh0.d0.Camera);
        if (z11 && yh0.f.e(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listS.add(oh0.d0.RecordAudio);
        }
        final List<oh0.d0> listA = oh0.l1.a(context, listS);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.c().b(y20.b0.c(null, new wn0.l() { // from class: th0.m6
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t6.w(listA, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w(List list, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        x1 x1Var = (x1) action.c();
        if (x1Var instanceof x1.WaitForCameraFeed) {
            action.e(x1.WaitForCameraFeed.u((x1.WaitForCameraFeed) x1Var, !list.contains(oh0.d0.Camera), !list.contains(oh0.d0.RecordAudio), null, null, null, false, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        } else {
            y1.a((x1) action.c());
            action.e(new x1.RestartCamera(false, false, j(action, false), ((x1) action.c()).getCameraFacingMode(), 3, null));
        }
        return jn0.h0.f84049a;
    }

    public static final d6.d.c.AssetOverrides x(d6.Input input) {
        p013kotlin.jvm.internal.s.k(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new d6.d.c.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    public static final x1 y(y20.r<? super d6.Input, x1, ?>.c cVar, List<? extends a1> selfies, String str, zf0.u cameraProperties, long j11, x1 x1Var) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        p013kotlin.jvm.internal.s.k(selfies, "selfies");
        p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            a1 a1Var = (a1) obj;
            if (a1Var instanceof a1.SelfieImage ? cVar.b().getPoseConfigs().a(((a1.SelfieImage) a1Var).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty() ? new x1.i(selfies, arrayList, str, cameraProperties, j11, x1Var, cVar.c().getCameraFacingMode()) : new x1.n(selfies, str, cameraProperties, j11, x1Var, cVar.c().getCameraFacingMode());
    }

    public static final d6.d.a.b z(d6.d.c.EnumC2431c enumC2431c) {
        p013kotlin.jvm.internal.s.k(enumC2431c, "<this>");
        switch (a.f114159a[enumC2431c.ordinal()]) {
            case 1:
                return d6.d.a.b.CLEAR;
            case 2:
            case 3:
                return d6.d.a.b.CENTER;
            case 4:
            case 5:
            case 6:
                return d6.d.a.b.LOOK_LEFT;
            case 7:
            case 8:
            case 9:
                return d6.d.a.b.LOOK_RIGHT;
            case 10:
                return d6.d.a.b.FINALIZING;
            case 11:
                return d6.d.a.b.CLEAR;
            case 12:
                return d6.d.a.b.CLEAR;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
