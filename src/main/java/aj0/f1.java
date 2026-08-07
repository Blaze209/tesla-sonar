package aj0;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<cj0.b> f1355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<hg0.a> f1356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> f1357c;

    public f1(qj0.i<cj0.b> iVar, qj0.i<hg0.a> iVar2, qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar3) {
        this.f1355a = iVar;
        this.f1356b = iVar2;
        this.f1357c = iVar3;
    }

    public static f1 a(qj0.i<cj0.b> iVar, qj0.i<hg0.a> iVar2, qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar3) {
        return new f1(iVar, iVar2, iVar3);
    }

    public static e1 c(cj0.b bVar, hg0.a aVar, ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> activityResultLauncher, String str, String str2, String str3, String str4) {
        return new e1(bVar, aVar, activityResultLauncher, str, str2, str3, str4);
    }

    public e1 b(String str, String str2, String str3, String str4) {
        return c(this.f1355a.get(), this.f1356b.get(), this.f1357c.get(), str, str2, str3, str4);
    }
}
