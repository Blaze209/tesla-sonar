package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2973a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.b f2974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f2975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f2976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f2977e;

    f(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2974b = bVar;
        this.f2975c = aVar;
        this.f2976d = componentName;
        this.f2977e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2977e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public boolean c(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2974b.S1(this.f2975c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
