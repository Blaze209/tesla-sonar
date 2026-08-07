package gj0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.teslamotors.TeslaApp.MainActivity;
import ie0.r;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tesla.logging.g f69008a = com.tesla.logging.g.h(f.class.getSimpleName());

    public static boolean a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return false;
        }
        boolean z11 = intent.hasExtra("pushNotification") || extras.getString("google.message_id", null) != null;
        if (r.a()) {
            return (intent.getDataString() == null && intent.getStringExtra("JMessageExtra") == null && !z11) ? false : true;
        }
        return z11;
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    public static PendingIntent b(Context context, com.wix.reactnativenotifications.core.notification.b bVar) {
        Intent launchIntentForPackage;
        try {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            launchIntentForPackage = new Intent(context, (Class<?>) MainActivity.class);
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }
        launchIntentForPackage.putExtra("pushNotification", bVar.a());
        return PendingIntent.getActivity(context, (int) System.currentTimeMillis(), launchIntentForPackage, 1140850688);
    }

    public static Bundle c(Intent intent) {
        Bundle bundleD = intent.hasExtra("pushNotification") ? d(intent) : intent.getExtras();
        if (r.a()) {
            String stringExtra = intent.getStringExtra("JMessageExtra");
            if (stringExtra == null) {
                stringExtra = intent.getDataString();
            }
            if (stringExtra != null) {
                try {
                    e(bundleD, new JSONObject(stringExtra).getJSONObject("n_extras"));
                    return bundleD;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    f69008a.d("[JPUSH] Failed to parse JPush Notification Json", e11);
                }
            }
        }
        return bundleD;
    }

    public static Bundle d(Intent intent) {
        return intent.getBundleExtra("pushNotification");
    }

    public static void e(Bundle bundle, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException e11) {
                f69008a.d("[JPUSH] Failed to parse Notification Json", e11);
            }
        }
    }
}
