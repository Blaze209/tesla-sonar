package com.stripe.android.financialconnections.launcher;

import androidx.fragment.app.Fragment;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/c;", "Ll50/d;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/financialconnections/launcher/a$a;", "activityResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Landroidx/activity/ComponentActivity;", "activity", "Li40/f;", "callback", "(Landroidx/activity/ComponentActivity;Li40/f;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Li40/f;)V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/a$c;)V", "Landroidx/activity/result/ActivityResultLauncher;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements l50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<a.ForData> activityResultLauncher;

    public c(ActivityResultLauncher<a.ForData> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(i40.f callback, i40.e eVar) {
        s.k(callback, "$callback");
        s.h(eVar);
        callback.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(i40.f callback, i40.e eVar) {
        s.k(callback, "$callback");
        s.h(eVar);
        callback.a(eVar);
    }

    @Override // l50.d
    public void a(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(configuration, "configuration");
        this.activityResultLauncher.b(new a.ForData(configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(ComponentActivity activity, final i40.f callback) {
        s.k(activity, "activity");
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(new FinancialConnectionsSheetForDataContract(), new ActivityResultCallback() { // from class: l50.a
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.financialconnections.launcher.c.d(callback, (i40.e) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Fragment fragment, final i40.f callback) {
        s.k(fragment, "fragment");
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForDataContract(), new ActivityResultCallback() { // from class: l50.b
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.financialconnections.launcher.c.e(callback, (i40.e) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }
}
