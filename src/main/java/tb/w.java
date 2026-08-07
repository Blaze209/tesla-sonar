package tb;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f113103a = androidx.work.z.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i11, boolean z11) {
        if (i11 == 0) {
            return z11;
        }
        return i11 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z11) {
        try {
            if (z11 == b(a(context, cls.getName()), false)) {
                androidx.work.z.e().a(f113103a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            androidx.work.z zVarE = androidx.work.z.e();
            String str = f113103a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z11 ? "enabled" : "disabled");
            zVarE.a(str, sb2.toString());
        } catch (Exception e11) {
            androidx.work.z zVarE2 = androidx.work.z.e();
            String str2 = f113103a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z11 ? "enabled" : "disabled");
            zVarE2.b(str2, sb3.toString(), e11);
        }
    }
}
