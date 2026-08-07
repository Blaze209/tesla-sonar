package com.stripe.android.financialconnections.launcher;

import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import i40.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/e;", "Ll50/d;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/financialconnections/launcher/a$c;", "activityResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Li40/g;", "callback", "(Landroidx/fragment/app/Fragment;Li40/g;)V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/a$c;)V", "Landroidx/activity/result/ActivityResultLauncher;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements l50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<a.ForToken> activityResultLauncher;

    public e(ActivityResultLauncher<a.ForToken> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(g callback, i40.d dVar) {
        s.k(callback, "$callback");
        s.h(dVar);
        callback.a(dVar);
    }

    @Override // l50.d
    public void a(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(configuration, "configuration");
        this.activityResultLauncher.b(new a.ForToken(configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Fragment fragment, final g callback) {
        s.k(fragment, "fragment");
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForTokenContract(), new ActivityResultCallback() { // from class: l50.c
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.financialconnections.launcher.e.c(callback, (i40.d) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }
}
