package wj;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import dj.e;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, e> f121978a = new ConcurrentHashMap();

    private static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e11);
            return null;
        }
    }

    @NonNull
    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static e c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, e> concurrentMap = f121978a;
        e eVar = concurrentMap.get(packageName);
        if (eVar != null) {
            return eVar;
        }
        e eVarD = d(context);
        e eVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, eVarD);
        return eVarPutIfAbsent == null ? eVarD : eVarPutIfAbsent;
    }

    @NonNull
    private static e d(@NonNull Context context) {
        return new d(b(a(context)));
    }
}
