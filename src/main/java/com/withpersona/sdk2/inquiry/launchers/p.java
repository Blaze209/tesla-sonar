package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/p;", "", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "openDocumentResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "a", "()Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<String[]> openDocumentResultLauncher;

    public p(ActivityResultLauncher<String[]> openDocumentResultLauncher) {
        p013kotlin.jvm.internal.s.k(openDocumentResultLauncher, "openDocumentResultLauncher");
        this.openDocumentResultLauncher = openDocumentResultLauncher;
    }

    public final ActivityResultLauncher<String[]> a() {
        return this.openDocumentResultLauncher;
    }
}
