package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/b0;", "", "Landroidx/activity/result/ActivityResultLauncher;", "Lh/e;", "resolvableApiLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "a", "()Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<h.e> resolvableApiLauncher;

    public b0(ActivityResultLauncher<h.e> resolvableApiLauncher) {
        p013kotlin.jvm.internal.s.k(resolvableApiLauncher, "resolvableApiLauncher");
        this.resolvableApiLauncher = resolvableApiLauncher;
    }

    public final ActivityResultLauncher<h.e> a() {
        return this.resolvableApiLauncher;
    }
}
