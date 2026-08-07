package ij0;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f78216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final gj0.a f78217b;

    protected c(Context context, gj0.a aVar) {
        this.f78216a = context;
        this.f78217b = aVar;
    }

    public static b g(Context context) {
        return h(context, new gj0.a());
    }

    public static b h(Context context, gj0.a aVar) {
        Object applicationContext = context.getApplicationContext();
        return applicationContext instanceof a ? ((a) applicationContext).a(context, aVar) : new c(context, aVar);
    }

    @Override // ij0.b
    public void b(int i11) {
        ((NotificationManager) this.f78216a.getSystemService("notification")).cancel(i11);
    }

    @Override // ij0.b
    public void e(String str, int i11) {
        ((NotificationManager) this.f78216a.getSystemService("notification")).cancel(str, i11);
    }

    @Override // ij0.b
    public void f() {
        ((NotificationManager) this.f78216a.getSystemService("notification")).cancelAll();
    }

    @Override // ij0.b
    public void a() {
    }

    @Override // ij0.b
    public void d() {
    }

    @Override // ij0.b
    public void c(Activity activity) {
    }
}
