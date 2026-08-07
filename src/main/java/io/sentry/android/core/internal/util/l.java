package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.android.core.z0;
import io.sentry.m2;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f79527a;

    public l() {
        this(new z0(m2.e()));
    }

    @SuppressLint({"NewApi"})
    public void a(ContentProvider contentProvider) {
        int iD = this.f79527a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public l(z0 z0Var) {
        this.f79527a = z0Var;
    }
}
