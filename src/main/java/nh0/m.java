package nh0;

import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<ActivityResultLauncher<PassportNfcReaderConfig>> f95045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<Context> f95046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<rh0.c> f95047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qj0.i<fi0.c> f95048d;

    public m(qj0.i<ActivityResultLauncher<PassportNfcReaderConfig>> iVar, qj0.i<Context> iVar2, qj0.i<rh0.c> iVar3, qj0.i<fi0.c> iVar4) {
        this.f95045a = iVar;
        this.f95046b = iVar2;
        this.f95047c = iVar3;
        this.f95048d = iVar4;
    }

    public static m a(qj0.i<ActivityResultLauncher<PassportNfcReaderConfig>> iVar, qj0.i<Context> iVar2, qj0.i<rh0.c> iVar3, qj0.i<fi0.c> iVar4) {
        return new m(iVar, iVar2, iVar3, iVar4);
    }

    public static com.withpersona.sdk2.inquiry.nfc.b c(ActivityResultLauncher<PassportNfcReaderConfig> activityResultLauncher, Context context, rh0.c cVar, fi0.c cVar2, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> list, StepStyles.UiStepStyle uiStepStyle, Integer num, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return new com.withpersona.sdk2.inquiry.nfc.b(activityResultLauncher, context, cVar, cVar2, str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }

    public com.withpersona.sdk2.inquiry.nfc.b b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> list, StepStyles.UiStepStyle uiStepStyle, Integer num, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return c(this.f95045a.get(), this.f95046b.get(), this.f95047c.get(), this.f95048d.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
