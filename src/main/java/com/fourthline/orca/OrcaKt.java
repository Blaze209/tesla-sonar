package com.fourthline.orca;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.core.internal.activity.OrcaActivity;
import com.fourthline.orca.internal.C3103bt;
import com.fourthline.orca.internal.C3152d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/Orca;", "Ljn0/h0;", "abort", "(Lcom/fourthline/orca/Orca;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "productName", "launchOrca", "(Landroid/content/Context;Ljava/lang/String;)V", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaKt {
    public static final void abort(Orca orca) {
        Activity activityB;
        s.k(orca, "<this>");
        C3103bt.a(C3103bt.f30707a, "orca_aborted", null, null, 6, null);
        C3152d c3152dA = OrcaActivity.INSTANCE.a();
        if (c3152dA == null || (activityB = c3152dA.b()) == null) {
            return;
        }
        activityB.finish();
    }

    public static final void launchOrca(Context context, String productName) {
        s.k(context, "context");
        s.k(productName, "productName");
        Intent intent = new Intent(context, (Class<?>) OrcaActivity.class);
        intent.putExtra("productName", productName);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 0);
        } else {
            context.startActivity(intent);
        }
    }
}
