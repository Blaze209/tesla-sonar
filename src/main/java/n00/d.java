package n00;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z11) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z11 ? 2 : 4);
        }
    }

    public static boolean b(Context context) {
        return androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static void c(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[(bArr.length - i11) - 1];
            bArr[(bArr.length - i11) - 1] = b11;
        }
    }
}
