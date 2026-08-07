package vy;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.iid.InstanceID;
import com.learnium.RNDeviceInfo.RNDeviceModule;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f120115a;

    public a(Context context) {
        this.f120115a = context;
    }

    String a() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", null).invoke(null, null);
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    String b() throws IllegalAccessException, InvocationTargetException {
        String str = InstanceID.ERROR_SERVICE_NOT_AVAILABLE;
        Object objInvoke = InstanceID.class.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f120115a.getApplicationContext());
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    String c() {
        return RNDeviceModule.getRNDISharedPreferences(this.f120115a).getString("instanceId", "unknown");
    }

    public String d() {
        String strC = c();
        if (strC != "unknown") {
            return strC;
        }
        try {
            String strA = a();
            f(strA);
            return strA;
        } catch (ClassNotFoundException unused) {
            try {
                String strB = b();
                f(strB);
                return strB;
            } catch (ClassNotFoundException unused2) {
                String strE = e();
                f(strE);
                return strE;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
                System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
                String strE2 = e();
                f(strE2);
                return strE2;
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused4) {
            System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
            String strB2 = b();
            f(strB2);
            return strB2;
        }
    }

    String e() {
        return UUID.randomUUID().toString();
    }

    void f(String str) {
        SharedPreferences.Editor editorEdit = RNDeviceModule.getRNDISharedPreferences(this.f120115a).edit();
        editorEdit.putString("instanceId", str);
        editorEdit.apply();
    }
}
