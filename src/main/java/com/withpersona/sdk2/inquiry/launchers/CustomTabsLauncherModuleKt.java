package com.withpersona.sdk2.inquiry.launchers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.contract.ActivityResultContract;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "", "b", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "launchers_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CustomTabsLauncherModuleKt {
    public static final g0<b, Integer> b() {
        return new g0<>(new ActivityResultContract<b, Integer>() { // from class: com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt$createCustomTabsLauncher$1
            @Override // androidx.p002activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, b input) {
                p013kotlin.jvm.internal.s.k(context, "context");
                p013kotlin.jvm.internal.s.k(input, "input");
                if (input instanceof c) {
                    c cVar = (c) input;
                    Intent intent = cVar.getIntent().f2960a;
                    intent.setData(Uri.parse(cVar.getUrl()));
                    p013kotlin.jvm.internal.s.h(intent);
                    return intent;
                }
                if (!(input instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a aVar = (a) input;
                Intent intent2 = aVar.getIntent().intent;
                intent2.setData(Uri.parse(aVar.getUrl()));
                intent2.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_HOST", aVar.getHost());
                intent2.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_PATH", aVar.getPath());
                p013kotlin.jvm.internal.s.h(intent2);
                return intent2;
            }

            @Override // androidx.p002activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer parseResult(int resultCode, Intent intent) {
                return Integer.valueOf(resultCode);
            }
        }, new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.e
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomTabsLauncherModuleKt.c(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i11) {
        new g().a(i11);
    }
}
