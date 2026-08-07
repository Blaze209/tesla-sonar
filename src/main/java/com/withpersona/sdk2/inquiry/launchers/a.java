package com.withpersona.sdk2.inquiry.launchers;

import androidx.browser.auth.AuthTabIntent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/a;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "Landroidx/browser/auth/AuthTabIntent;", AnalyticsAttribute.Intent, "", ImagesContract.URL, "host", "path", "<init>", "(Landroidx/browser/auth/AuthTabIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Landroidx/browser/auth/AuthTabIntent;", "b", "()Landroidx/browser/auth/AuthTabIntent;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "c", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AuthTabIntent intent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String path;

    public a(AuthTabIntent intent, String url, String host, String path) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(host, "host");
        p013kotlin.jvm.internal.s.k(path, "path");
        this.intent = intent;
        this.url = url;
        this.host = host;
        this.path = path;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AuthTabIntent getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUrl() {
        return this.url;
    }
}
