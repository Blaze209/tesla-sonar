package b60;

import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.k;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f16728a;

    f(k kVar) {
        this.f16728a = kVar;
    }

    public static qj0.i<e> b(k kVar) {
        return qj0.f.a(new f(kVar));
    }

    @Override // b60.e
    public com.stripe.android.googlepaylauncher.h a(CoroutineScope coroutineScope, com.stripe.android.googlepaylauncher.h.Config config, com.stripe.android.googlepaylauncher.h.f fVar, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z11) {
        return this.f16728a.b(coroutineScope, config, fVar, activityResultLauncher, z11);
    }
}
