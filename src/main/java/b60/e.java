package b60;

import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb60/e;", "", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleScope", "Lcom/stripe/android/googlepaylauncher/h$e;", "config", "Lcom/stripe/android/googlepaylauncher/h$f;", "readyCallback", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "activityResultLauncher", "", "skipReadyCheck", "Lcom/stripe/android/googlepaylauncher/h;", "a", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/h$e;Lcom/stripe/android/googlepaylauncher/h$f;Landroidx/activity/result/ActivityResultLauncher;Z)Lcom/stripe/android/googlepaylauncher/h;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {
    com.stripe.android.googlepaylauncher.h a(CoroutineScope lifecycleScope, com.stripe.android.googlepaylauncher.h.Config config, com.stripe.android.googlepaylauncher.h.f readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean skipReadyCheck);
}
