package com.plaid.link;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/plaid/link/PlaidHandler;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "open", "(Landroid/app/Activity;)Z", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "Ljn0/h0;", "submit", "(Lcom/plaid/link/SubmissionData;)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlaidHandler {
    public final boolean open(Activity activity) {
        s.k(activity, "activity");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(activity);
    }

    public final void submit(SubmissionData submissionData) {
        s.k(submissionData, "submissionData");
        Plaid.INSTANCE.submitInternal$link_sdk_release(submissionData);
    }

    public final boolean open(Fragment fragment) {
        s.k(fragment, "fragment");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(fragment);
    }
}
