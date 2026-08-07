package com.stripe.android.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/r;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "companyName", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public r(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    public final CharSequence a(String companyName) {
        p013kotlin.jvm.internal.s.k(companyName, "companyName");
        String string = this.context.getString(f30.d0.M, companyName);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        Spanned spannedFromHtml = Html.fromHtml(string, 0);
        p013kotlin.jvm.internal.s.h(spannedFromHtml);
        return spannedFromHtml;
    }
}
