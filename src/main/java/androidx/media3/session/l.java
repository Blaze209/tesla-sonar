package androidx.media3.session;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes3.dex */
final class l implements j7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Service f11896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11897b = 0;

    private static final class a {
        public static PendingIntent a(Service service, int i11, Intent intent) {
            return PendingIntent.getForegroundService(service, i11, intent, 67108864);
        }
    }

    public l(Service service) {
        this.f11896a = service;
    }

    private PendingIntent e(t7 t7Var, String str, Bundle bundle) {
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(t7Var.f().o0());
        Service service = this.f11896a;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
        Service service2 = this.f11896a;
        int i11 = this.f11897b + 1;
        this.f11897b = i11;
        return PendingIntent.getService(service2, i11, intent, 134217728 | 67108864);
    }

    public static KeyEvent h(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
    }

    private Intent i(t7 t7Var, int i11) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(t7Var.f().o0());
        Service service = this.f11896a;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i11));
        return intent;
    }

    private int l(long j11) {
        if (j11 == 8 || j11 == 9) {
            return 87;
        }
        if (j11 == 6 || j11 == 7) {
            return 88;
        }
        if (j11 == 3) {
            return 86;
        }
        if (j11 == 12) {
            return 90;
        }
        if (j11 == 11) {
            return 89;
        }
        return j11 == 1 ? 85 : 0;
    }

    @Override // androidx.media3.session.j7.a
    public androidx.core.app.o.a a(t7 t7Var, IconCompat iconCompat, CharSequence charSequence, int i11) {
        return new androidx.core.app.o.a(iconCompat, charSequence, d(t7Var, i11));
    }

    @Override // androidx.media3.session.j7.a
    public PendingIntent b(t7 t7Var) {
        return PendingIntent.getService(this.f11896a, 86, i(t7Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
    }

    @Override // androidx.media3.session.j7.a
    public androidx.core.app.o.a c(t7 t7Var, androidx.media3.session.a aVar) {
        se seVar = aVar.f11456a;
        s7.a.a(seVar != null && seVar.f12347a == 0);
        se seVar2 = (se) s7.a.f(aVar.f11456a);
        return new androidx.core.app.o.a(IconCompat.c(this.f11896a, aVar.f11459d), aVar.f11461f, e(t7Var, seVar2.f12348b, seVar2.f12349c));
    }

    @Override // androidx.media3.session.j7.a
    public PendingIntent d(t7 t7Var, long j11) {
        int iL = l(j11);
        Intent intentI = i(t7Var, iL);
        return (Build.VERSION.SDK_INT < 26 || j11 != 1 || t7Var.k().t()) ? PendingIntent.getService(this.f11896a, iL, intentI, 67108864) : a.a(this.f11896a, iL, intentI);
    }

    public String f(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public Bundle g(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
        return obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
    }

    public boolean j(Intent intent) {
        return "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction());
    }

    public boolean k(Intent intent) {
        return "android.intent.action.MEDIA_BUTTON".equals(intent.getAction());
    }
}
