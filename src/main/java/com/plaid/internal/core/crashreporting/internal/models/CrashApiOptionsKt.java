package com.plaid.internal.core.crashreporting.internal.models;

import android.content.res.Resources;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"toCrashOptions", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "resources", "Landroid/content/res/Resources;", "release", "", "crash-reporting_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CrashApiOptionsKt {
    public static final CrashApiOptions toCrashOptions(SentryProject sentryProject, Resources resources, String str) {
        s.k(sentryProject, "<this>");
        s.k(resources, "resources");
        int projectNumber = sentryProject.getProjectNumber();
        String string = resources.getString(sentryProject.getKeyResId());
        s.j(string, "getString(...)");
        return new CrashApiOptions(projectNumber, string, str);
    }
}
