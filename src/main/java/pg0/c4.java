package pg0;

import android.content.Context;
import android.os.Parcelable;
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
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import sg0.CaptureTipsViewModel;
import wg0.GovernmentIdRequestArguments;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aC\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aj\u0002`\u001c*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00140\u001fR\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030 2\b\b\u0002\u0010!\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(\u001a¥\u0001\u00108\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u000201002\b\b\u0002\u00104\u001a\u0002032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b8\u00109\u001aO\u0010;\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0012H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020=*\u00020$H\u0000¢\u0006\u0004\b>\u0010?\u001a5\u0010D\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010C\u001a\u00020\u0012H\u0000¢\u0006\u0004\bD\u0010E\u001a-\u0010F\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bH\u0010G\u001a\u001f\u0010K\u001a\u0004\u0018\u000105*\u00020@2\b\u0010J\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bK\u0010L\u001a\u001d\u0010N\u001a\u0004\u0018\u00010M*\u00020\u00032\u0006\u0010A\u001a\u00020$H\u0000¢\u0006\u0004\bN\u0010O\u001a\u0019\u0010Q\u001a\b\u0012\u0004\u0012\u00020P00*\u00020\u0003H\u0000¢\u0006\u0004\bQ\u0010R\u001aG\u0010T\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010S\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bT\u0010U¨\u0006V"}, d2 = {"Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Ly20/k;", "Lpg0/g3$a;", "Lpg0/n1;", "Lpg0/g3$b;", "", "Lxg0/k;", "videoCaptureHelper", "Ljn0/h0;", Gender.NONE, "(Ly20/k$a;Lxg0/k;)V", "u", "(Ly20/k$a;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "renderContext", "renderProps", "", "checkPermissions", "Loh0/c1;", "permissionRequestWorkflow", "Llh0/c;", "d0", "(Ljava/lang/Object;Landroid/content/Context;Ly20/k$a;Lpg0/g3$a;ZLoh0/c1;)Llh0/c;", "Z", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "y", "(Ly20/k$a;)Lwn0/l;", "Ly20/r$c;", "Ly20/r;", "addCurrentState", "w", "(Ly20/r$c;Z)Lpg0/n1;", "Lpg0/d4$e;", "currentSide", "Lpg0/g5$b$a;", "K", "(Lpg0/g3$a;Lpg0/d4$e;)Lpg0/g5$b$a;", "renderState", "Lpg0/d0;", "acceptedId", "Lpg0/d4;", "id", "Lzf0/u;", "cameraProperties", "", "Lpg0/i4;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "R", "(Lpg0/n1;Ly20/k$a;Lpg0/g3$a;Lpg0/d0;Lpg0/d4;Lxg0/k;Lzf0/u;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "P", "(Landroid/content/Context;Ly20/k$a;Lpg0/g3$a;Z)V", "Lpg0/d0$d;", "Y", "(Lpg0/d4$e;)Lpg0/d0$d;", "Lpg0/g3$a$a;", "side", "selectedId", "isAutoClassification", "L", "(Lpg0/g3$a$a;Lpg0/d4$e;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "G", "(Lpg0/g3$a$a;Lpg0/d4$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "I", "Lvg0/d;", "hint", Gender.MALE, "(Lpg0/g3$a$a;Lvg0/d;)Ljava/lang/String;", "Lsg0/h;", "H", "(Lpg0/g3$a;Lpg0/d4$e;)Lsg0/h;", "Lpg0/b0;", "J", "(Lpg0/g3$a;)Ljava/util/List;", "output", "W", "(Ly20/k$a;Lpg0/g3$b;Lxg0/k;)V", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c4 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f102251b;

        static {
            int[] iArr = new int[oh0.g1.values().length];
            try {
                iArr[oh0.g1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oh0.g1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oh0.g1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102250a = iArr;
            int[] iArr2 = new int[IdConfig.e.values().length];
            try {
                iArr2[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.e.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.e.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f102251b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        ((n1) action.c()).d();
        action.e(new n1.ShowInstructions(null, null, null, null, 0, ((n1) action.c()).getCountryCode(), null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 B(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new g3.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new g3.b.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        ((n1) action.c()).d();
        action.e(new n1.ShowInstructions(null, null, null, null, 0, ((n1) action.c()).getCountryCode(), null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E(Throwable th2, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new g3.b.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new g3.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return jn0.h0.f84049a;
    }

    public static final String G(g3.a.C2175a c2175a, IdConfig.e side, String selectedId, String str) {
        p013kotlin.jvm.internal.s.k(c2175a, "<this>");
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(selectedId, "selectedId");
        String strA = c2175a.getCaptureScreenTitle().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    public static final CaptureTipsViewModel H(g3.a aVar, IdConfig.e side) {
        String idFrontHelpModalTitle;
        String idFrontHelpModalPrompt;
        String idFrontHelpModalHints;
        String idFrontHelpModalContinueButtonText;
        String idBackHelpModalTitle;
        String idBackHelpModalPrompt;
        String idBackHelpModalHints;
        String idBackHelpModalContinueButtonText;
        String barcodeHelpModalTitle;
        String barcodeHelpModalPrompt;
        String barcodeHelpModalHints;
        String barcodeHelpModalContinueButtonText;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(side, "side");
        int i11 = a.f102251b[side.ordinal()];
        if (i11 == 1) {
            String helpButtonText = aVar.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = aVar.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = aVar.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = aVar.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = aVar.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new CaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, side);
        }
        if (i11 == 2) {
            String helpButtonText2 = aVar.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = aVar.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = aVar.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = aVar.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = aVar.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new CaptureTipsViewModel(helpButtonText2, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHints, idBackHelpModalContinueButtonText, side);
        }
        if (i11 == 3) {
            return null;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String helpButtonText3 = aVar.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = aVar.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = aVar.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = aVar.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = aVar.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new CaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    public static final String I(g3.a.C2175a c2175a, IdConfig.e side, String selectedId, String str) {
        p013kotlin.jvm.internal.s.k(c2175a, "<this>");
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(selectedId, "selectedId");
        String strA = c2175a.getConfirmCapture().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    public static final List<EnabledIdClass> J(g3.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        List<IdConfig> listG = aVar.g();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listG, 10));
        for (IdConfig idConfig : listG) {
            h4 icon = idConfig.getIcon();
            String idClassKey = aVar.getStrings().G().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    public static final g5.b.a K(g3.a renderProps, IdConfig.e currentSide) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(currentSide, "currentSide");
        if (currentSide == IdConfig.e.PassportSignature) {
            return g5.b.a.Enabled;
        }
        return (p013kotlin.jvm.internal.s.f(renderProps.getCountryCode(), "US") || currentSide != IdConfig.e.Back) ? g5.b.a.Hidden : g5.b.a.Enabled;
    }

    public static final String L(g3.a.C2175a c2175a, IdConfig.e side, String selectedId, String str, boolean z11) {
        p013kotlin.jvm.internal.s.k(c2175a, "<this>");
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(selectedId, "selectedId");
        if (z11 && c2175a.getAutoClassificationCaptureTipText() != null) {
            return c2175a.getAutoClassificationCaptureTipText();
        }
        String strA = c2175a.getScanInstructions().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    public static final String M(g3.a.C2175a c2175a, vg0.d dVar) {
        p013kotlin.jvm.internal.s.k(c2175a, "<this>");
        if (p013kotlin.jvm.internal.s.f(dVar, vg0.e.f119327a)) {
            return c2175a.getHintHoldStill();
        }
        if (p013kotlin.jvm.internal.s.f(dVar, vg0.f.f119328a)) {
            return c2175a.getHintLowLight();
        }
        if (dVar == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void N(y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a aVar, final xg0.k kVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.u3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.O(kVar, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O(xg0.k kVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        n1 backState = ((n1) action.c()).getBackState();
        if (kVar != null) {
            kVar.a();
        }
        if (backState != null) {
            backState.l(true);
            action.e(backState);
        } else if (((g3.a) action.b()).getBackStepEnabled()) {
            action.d(g3.b.a.f102420a);
        } else {
            action.d(g3.b.C2176b.f102421a);
        }
        return jn0.h0.f84049a;
    }

    public static final void P(Context context, y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a renderContext, g3.a renderProps, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(renderContext, "renderContext");
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        List listS = p013kotlin.collections.v.s(oh0.d0.Camera);
        if (z11 && yh0.f.e(context)) {
            listS.add(oh0.d0.RecordAudio);
        }
        final List<oh0.d0> listA = oh0.l1.a(context, listS);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.w3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.Q(listA, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q(List list, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        n1 n1Var = (n1) action.c();
        if (n1Var instanceof n1.WaitForAutocapture) {
            action.e(n1.WaitForAutocapture.s((n1.WaitForAutocapture) n1Var, null, null, null, null, null, 0, null, null, null, null, list.contains(oh0.d0.Camera), list.contains(oh0.d0.RecordAudio), null, null, null, 29695, null));
        } else {
            ((n1) action.c()).d();
            action.e(new n1.ShowInstructions(null, null, null, null, 0, n1Var.getCountryCode(), null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        }
        return jn0.h0.f84049a;
    }

    public static final void R(final n1 renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a renderContext, final g3.a renderProps, final d0 d0Var, final IdConfig id2, final xg0.k videoCaptureHelper, final zf0.u cameraProperties, final boolean z11, final List<? extends i4> parts, final int i11, final String str, final String str2) {
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(renderContext, "renderContext");
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
        p013kotlin.jvm.internal.s.k(parts, "parts");
        final fg0.a aVarE = videoCaptureHelper.e(renderProps);
        renderContext.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.v3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.T(renderState, d0Var, i11, parts, renderProps, videoCaptureHelper, id2, z11, str2, aVarE, cameraProperties, str, renderContext, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T(n1 n1Var, d0 d0Var, int i11, List list, g3.a aVar, final xg0.k kVar, IdConfig idConfig, boolean z11, String str, fg0.a aVar2, zf0.u uVar, String str2, final y20.k.a aVar3, y20.r.c action) {
        Parcelable submit;
        Parcelable waitForAutocapture;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (action.c().getClass() != n1Var.getClass()) {
            return jn0.h0.f84049a;
        }
        List<d0> listQ0 = d0Var != null ? p013kotlin.collections.v.Q0(((n1) action.c()).k(), d0Var) : ((n1) action.c()).k();
        int i12 = i11 == list.size() ? i11 : i11 + 1;
        i4 i4Var = (i4) p013kotlin.collections.v.r0(list, i12);
        if (i4Var instanceof i4.SideIdPart) {
            if (!aVar.l() || kVar.d()) {
                i4.SideIdPart sideIdPart = (i4.SideIdPart) i4Var;
                waitForAutocapture = new n1.WaitForAutocapture(sideIdPart, listQ0, new q.IdCaptureConfig(idConfig), K((g3.a) action.b(), sideIdPart.getSide()), list, i12, w(action, z11), kVar.d() ? xg0.v.Connected : xg0.v.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str, null, new wn0.a() { // from class: pg0.x3
                    @Override // wn0.a
                    public final Object invoke() {
                        return c4.U(aVar3, kVar);
                    }
                }, 11776, null);
            } else {
                waitForAutocapture = new n1.ChooseCaptureMethod((i4.SideIdPart) i4Var, listQ0, list, i12, str, new q.IdCaptureConfig(idConfig), false, w(action, z11), null, 320, null);
            }
        } else {
            if (i4Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar2 != fg0.a.Stream || (action.c() instanceof n1.f) || (action.c() instanceof n1.ReviewSelectedImage)) {
                submit = (aVar2 != fg0.a.Upload || (action.c() instanceof n1.FinalizeLocalVideoCapture) || (action.c() instanceof n1.ReviewSelectedImage)) ? new n1.Submit(idConfig, listQ0, null, list, i12, w(action, z11), str, new GovernmentIdRequestArguments(listQ0, aVar.getFieldKeyDocument(), aVar.getFieldKeyIdClass()), str2, uVar, 4, null) : new n1.FinalizeLocalVideoCapture(idConfig, listQ0, (i4) p013kotlin.collections.v.A0(list), list, i12, w(action, z11), str, new GovernmentIdRequestArguments(listQ0, aVar.getFieldKeyDocument(), aVar.getFieldKeyIdClass()), 0L, false, 768, null);
            } else {
                submit = new n1.f((i4) p013kotlin.collections.v.A0(list), listQ0, list, i12, w(action, z11), str, idConfig, uVar);
            }
            waitForAutocapture = submit;
        }
        action.e(waitForAutocapture);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U(y20.k.a aVar, final xg0.k kVar) {
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.b4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.V(kVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V(xg0.k kVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.WaitForAutocapture waitForAutocapture = objC instanceof n1.WaitForAutocapture ? (n1.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(n1.WaitForAutocapture.s(waitForAutocapture, null, null, null, null, null, 0, null, kVar.d() ? xg0.v.Connected : xg0.v.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return jn0.h0.f84049a;
    }

    public static final void W(y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final g3.b output, xg0.k videoCaptureHelper) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(output, "output");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof g3.b.d) || (output instanceof g3.b.a) || (output instanceof g3.b.c)) {
            videoCaptureHelper.a();
        }
        context.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.i3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.X(output, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X(g3.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(bVar);
        return jn0.h0.f84049a;
    }

    public static final d0.d Y(IdConfig.e eVar) {
        p013kotlin.jvm.internal.s.k(eVar, "<this>");
        int i11 = a.f102251b[eVar.ordinal()];
        if (i11 == 1) {
            return d0.d.FRONT;
        }
        if (i11 == 2) {
            return d0.d.BACK;
        }
        if (i11 == 3) {
            return d0.d.FRONT;
        }
        if (i11 == 4) {
            return d0.d.BACK;
        }
        if (i11 == 5) {
            return d0.d.BACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final lh0.c<Object, Object> Z(Object obj, Context context, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a renderContext, g3.a renderProps, boolean z11, oh0.c1 permissionRequestWorkflow) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(renderContext, "renderContext");
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkflow, "permissionRequestWorkflow");
        oh0.d0 d0Var = oh0.d0.RecordAudio;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(qh0.e.M);
            p013kotlin.jvm.internal.s.j(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string = context.getString(qh0.e.L, yh0.f.b(context));
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return oh0.l1.d(obj, renderContext, z11, d0Var, (19976 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new wn0.l() { // from class: pg0.z3
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return c4.a0(renderContext, (oh0.c1.Output) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r a0(final y20.k.a aVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.b0.c(null, new wn0.l() { // from class: pg0.j3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.b0(it, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b0(oh0.c1.Output output, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = a.f102250a[output.getPermissionState().getResult().ordinal()];
        if (i11 == 1 || i11 == 2) {
            aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.r3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c4.c0((y20.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            N(aVar, null);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Parcelable parcelable = (n1) action.c();
        if (parcelable instanceof b) {
            action.e(((b) parcelable).a(false));
        }
        return jn0.h0.f84049a;
    }

    public static final lh0.c<Object, Object> d0(Object obj, Context context, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a renderContext, g3.a renderProps, boolean z11, oh0.c1 permissionRequestWorkflow) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(renderContext, "renderContext");
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkflow, "permissionRequestWorkflow");
        oh0.d0 d0Var = oh0.d0.Camera;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(qh0.e.f105559m);
            p013kotlin.jvm.internal.s.j(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string = context.getString(qh0.e.f105558l, yh0.f.b(context));
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return oh0.l1.d(obj, renderContext, z11, d0Var, (19976 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new wn0.l() { // from class: pg0.y3
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return c4.e0(renderContext, (oh0.c1.Output) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r e0(final y20.k.a aVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.b0.c(null, new wn0.l() { // from class: pg0.k3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.f0(it, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f0(oh0.c1.Output output, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = a.f102250a[output.getPermissionState().getResult().ordinal()];
        if (i11 == 1 || i11 == 2) {
            aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.s3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c4.g0((y20.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            N(aVar, null);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Parcelable parcelable = (n1) action.c();
        if (parcelable instanceof d) {
            action.e(((d) parcelable).b(false));
        }
        return jn0.h0.f84049a;
    }

    public static final void u(y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.t3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.v((y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(g3.b.C2176b.f102421a);
        return jn0.h0.f84049a;
    }

    public static final n1 w(y20.r<?, n1, ?>.c cVar, boolean z11) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        return z11 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ n1 x(y20.r.c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return w(cVar, z11);
    }

    public static final wn0.l<Throwable, jn0.h0> y(final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return new wn0.l() { // from class: pg0.a4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c4.z(aVar, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 z(y20.k.a aVar, final Throwable cameraError) {
        p013kotlin.jvm.internal.s.k(cameraError, "cameraError");
        if (!(cameraError instanceof CameraError)) {
            aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.l3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c4.E(cameraError, (y20.r.c) obj);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }
        CameraError cameraError2 = (CameraError) cameraError;
        if (!(cameraError2 instanceof NoActiveRecordingError)) {
            if (cameraError2 instanceof NoSuitableCameraError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.m3
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c4.F((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof RecordingTooLongError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.n3
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c4.A((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof FinalizeRecordingError) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.o3
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c4.B((y20.r.c) obj);
                    }
                }, 1, null));
            } else if (cameraError2 instanceof UnsupportedDevice) {
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.p3
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c4.C((y20.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(cameraError2 instanceof RecordingInterrupted)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.q3
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c4.D((y20.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return jn0.h0.f84049a;
    }
}
