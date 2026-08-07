package hj0;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.brentvatne.exoplayer.v0;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f72943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e f72944b;

    protected d(Context context, Bundle bundle) {
        this.f72943a = context;
        this.f72944b = b(bundle);
    }

    private long[] c(List list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11) instanceof Number) {
                jArr[i11] = ((Number) list.get(i11)).longValue();
            }
        }
        return jArr;
    }

    public static b d(Context context, Bundle bundle) {
        return new d(context, bundle);
    }

    private int e(String str, String str2) {
        return this.f72943a.getResources().getIdentifier(str2, str, this.f72943a.getPackageName());
    }

    private Uri f(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase("default")) {
            return RingtoneManager.getDefaultUri(2);
        }
        int iE = e("raw", str);
        if (iE == 0) {
            iE = e("raw", str.substring(0, str.lastIndexOf(46)));
        }
        return Uri.parse("android.resource://" + this.f72943a.getPackageName() + "/" + iE);
    }

    @Override // hj0.b
    public void a() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        v0.a();
        NotificationChannel notificationChannelA = ga.c.a(this.f72944b.a(), this.f72944b.h(), this.f72944b.f());
        if (this.f72944b.l()) {
            notificationChannelA.setDescription(this.f72944b.b());
        }
        if (this.f72944b.m()) {
            notificationChannelA.enableLights(this.f72944b.c());
        }
        if (this.f72944b.n()) {
            notificationChannelA.enableVibration(this.f72944b.d());
        }
        if (this.f72944b.o()) {
            notificationChannelA.setGroup(this.f72944b.e());
        }
        if (this.f72944b.p()) {
            notificationChannelA.setLightColor(Color.parseColor(this.f72944b.g()));
        }
        if (this.f72944b.q()) {
            notificationChannelA.setShowBadge(this.f72944b.i());
        }
        if (this.f72944b.r()) {
            notificationChannelA.setSound(f(this.f72944b.j()), null);
        }
        if (this.f72944b.s()) {
            notificationChannelA.setVibrationPattern(c(this.f72944b.k()));
        }
        ((NotificationManager) this.f72943a.getSystemService("notification")).createNotificationChannel(notificationChannelA);
    }

    protected e b(Bundle bundle) {
        return new e(bundle);
    }
}
