package com.withpersona.sdk2.inquiry.launchers;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/c;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "Landroidx/browser/customtabs/d;", AnalyticsAttribute.Intent, "", ImagesContract.URL, "<init>", "(Landroidx/browser/customtabs/d;Ljava/lang/String;)V", "a", "Landroidx/browser/customtabs/d;", "()Landroidx/browser/customtabs/d;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.browser.customtabs.d intent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    public c(androidx.browser.customtabs.d intent, String url) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(url, "url");
        this.intent = intent;
        this.url = url;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.browser.customtabs.d getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getUrl() {
        return this.url;
    }
}
