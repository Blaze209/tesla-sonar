package com.stripe.android.stripe3ds2.security;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/l;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr80/c;", "errorReporter", "<init>", "(Landroid/content/Context;Lr80/c;)V", "a", "Lr80/c;", "b", "Landroid/content/Context;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public l(Context context, r80.c errorReporter) {
        s.k(context, "context");
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }
}
