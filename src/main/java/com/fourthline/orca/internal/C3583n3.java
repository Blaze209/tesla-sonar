package com.fourthline.orca.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3583n3 implements YD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityResultRegistry f33812a;

    public C3583n3(ActivityResultRegistry resultRegistry) {
        p013kotlin.jvm.internal.s.k(resultRegistry, "resultRegistry");
        this.f33812a = resultRegistry;
    }

    @Override // com.fourthline.orca.internal.YD
    public void a(Uri url, final wn0.a onUserReturned) {
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(onUserReturned, "onUserReturned");
        Intent intent = new Intent("android.intent.action.VIEW", url);
        ActivityResultLauncher activityResultLauncherL = this.f33812a.l("BrowserLauncherResult", new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.fourthline.orca.internal.y71
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C3583n3.a(onUserReturned, (h.a) obj);
            }
        });
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        p013kotlin.jvm.internal.s.j(intentCreateChooser, "createChooser(...)");
        activityResultLauncherL.b(intentCreateChooser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn0.a aVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.invoke();
    }
}
