package ah0;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> f1056a;

    public c(qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar) {
        this.f1056a = iVar;
    }

    public static c a(qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar) {
        return new c(iVar);
    }

    public static b c(ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> activityResultLauncher, String str, boolean z11) {
        return new b(activityResultLauncher, str, z11);
    }

    public b b(String str, boolean z11) {
        return c(this.f1056a.get(), str, z11);
    }
}
