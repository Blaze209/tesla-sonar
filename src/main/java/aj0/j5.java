package aj0;

import androidx.p002activity.result.ActivityResultLauncher;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<cj0.b> f1437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<com.squareup.moshi.u> f1438c;

    public j5(qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar, qj0.i<cj0.b> iVar2, qj0.i<com.squareup.moshi.u> iVar3) {
        this.f1436a = iVar;
        this.f1437b = iVar2;
        this.f1438c = iVar3;
    }

    public static j5 a(qj0.i<ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b>> iVar, qj0.i<cj0.b> iVar2, qj0.i<com.squareup.moshi.u> iVar3) {
        return new j5(iVar, iVar2, iVar3);
    }

    public static i5 c(ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> activityResultLauncher, cj0.b bVar, com.squareup.moshi.u uVar, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new i5(activityResultLauncher, bVar, uVar, str, str2, str3, str4, map);
    }

    public i5 b(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return c(this.f1436a.get(), this.f1437b.get(), this.f1438c.get(), str, str2, str3, str4, map);
    }
}
