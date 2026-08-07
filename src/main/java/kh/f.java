package kh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile f f86089g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f86090h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f86096f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f86091a = new a("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f86092b = new a("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f86094d = new a("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f86093c = new a("aaid");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f86095e = new c();

    public static String b(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    public static d c(Cursor cursor) {
        d dVar = new d(null, 0);
        if (cursor == null) {
            e("parseValue fail, cursor is null.");
            return dVar;
        }
        if (cursor.isClosed()) {
            e("parseValue fail, cursor is closed.");
            return dVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            dVar.f86086a = cursor.getString(columnIndex);
        } else {
            e("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            dVar.f86087b = cursor.getInt(columnIndex2);
        } else {
            e("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            dVar.f86088c = cursor.getLong(columnIndex3);
            return dVar;
        }
        e("parseExpired fail, index < 0.");
        return dVar;
    }

    public static final f d() {
        if (f86089g == null) {
            synchronized (f.class) {
                try {
                    if (f86089g == null) {
                        f86089g = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f86089g;
    }

    public static void e(String str) {
        if (f86090h) {
            Log.d("OpenIdManager", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a A[PHI: r8
      0x005a: PHI (r8v3 android.database.Cursor) = (r8v1 android.database.Cursor), (r8v4 android.database.Cursor) binds: [B:20:0x0058, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean f(Context context) {
        e("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
                d dVarC = c(cursorQuery);
                boolean z11 = 1000 != dVarC.f86087b || WebrtcBuildVersion.maint_version.equals(dVarC.f86086a);
                cursorQuery.close();
                return z11;
            } catch (Exception e11) {
                e("querySupport, Exception : " + e11.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    public static String i(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            e("getAppVersion, Exception : " + e11.getMessage());
            return null;
        }
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.d()) {
                return aVar.f86080b;
            }
            if (g(context, true)) {
                return h(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        e(str);
        return null;
    }

    public final boolean g(Context context, boolean z11) {
        if (this.f86095e.b() && !z11) {
            return this.f86095e.e();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strB = b(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        String strI = i(packageManager, strB);
        if (this.f86095e.b() && this.f86095e.c(strI)) {
            e("use same version cache, safeVersion : ".concat(String.valueOf(strI)));
            return this.f86095e.e();
        }
        this.f86095e.d(strI);
        boolean zF = f(context);
        e("query support, result : ".concat(String.valueOf(zF)));
        this.f86095e.a(zF);
        return zF;
    }

    public final String h(Context context, a aVar) throws Throwable {
        Throwable th2;
        Exception exc;
        String str;
        Cursor cursorQuery;
        boolean zG;
        String str2;
        e("queryId : " + aVar.f86081c);
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{aVar.f86081c}, null);
                try {
                    if (cursorQuery != null) {
                        d dVarC = c(cursorQuery);
                        str3 = dVarC.f86086a;
                        aVar.c(str3);
                        aVar.b(dVarC.f86088c);
                        aVar.a(dVarC.f86087b);
                        e(aVar.f86081c + " errorCode : " + aVar.f86082d);
                        if (dVarC.f86087b != 1000) {
                            j(context);
                            if (!g(context, false)) {
                                zG = g(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                e(str2.concat(String.valueOf(zG)));
                            }
                        }
                    } else if (g(context, false)) {
                        zG = g(context, true);
                        str2 = "forceQuery isSupported : ";
                        e(str2.concat(String.valueOf(zG)));
                    }
                    if (cursorQuery == null) {
                        return str3;
                    }
                } catch (Exception e11) {
                    exc = e11;
                    str = str3;
                    cursor = cursorQuery;
                    e("queryId, Exception : " + exc.getMessage());
                    if (cursor == null) {
                        return str;
                    }
                    cursorQuery = cursor;
                    str3 = str;
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            } catch (Exception e12) {
                exc = e12;
                str = null;
            }
            cursorQuery.close();
            return str3;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public final synchronized void j(Context context) {
        if (this.f86096f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f86096f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
