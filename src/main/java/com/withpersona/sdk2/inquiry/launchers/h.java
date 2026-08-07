package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/h;", "", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "pictureLaunchResultLauncher", "", "", "openDocumentsResultLauncher", "Lh/f;", "selectFromPhotoLibraryLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;)V", "c", "()Landroidx/activity/result/ActivityResultLauncher;", "a", "b", "Landroidx/activity/result/ActivityResultLauncher;", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<Uri> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<String[]> openDocumentsResultLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<h.f> selectFromPhotoLibraryLauncher;

    public h(ActivityResultLauncher<Uri> pictureLaunchResultLauncher, ActivityResultLauncher<String[]> openDocumentsResultLauncher, ActivityResultLauncher<h.f> selectFromPhotoLibraryLauncher) {
        p013kotlin.jvm.internal.s.k(pictureLaunchResultLauncher, "pictureLaunchResultLauncher");
        p013kotlin.jvm.internal.s.k(openDocumentsResultLauncher, "openDocumentsResultLauncher");
        p013kotlin.jvm.internal.s.k(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
        this.pictureLaunchResultLauncher = pictureLaunchResultLauncher;
        this.openDocumentsResultLauncher = openDocumentsResultLauncher;
        this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
    }

    public final ActivityResultLauncher<String[]> a() {
        return this.openDocumentsResultLauncher;
    }

    public final ActivityResultLauncher<h.f> b() {
        return this.selectFromPhotoLibraryLauncher;
    }

    public final ActivityResultLauncher<Uri> c() {
        return this.pictureLaunchResultLauncher;
    }
}
