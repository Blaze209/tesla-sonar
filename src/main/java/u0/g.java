package u0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f115226b = new g("1.4.0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f115227a;

    public g(@NonNull String str) {
        this.f115227a = q.i(str);
    }

    @NonNull
    public static g a() {
        return f115226b;
    }

    public static boolean c(@NonNull q qVar) {
        return a().f115227a.a(qVar.f(), qVar.g()) <= 0;
    }

    public static boolean d(@NonNull q qVar) {
        return a().f115227a.a(qVar.f(), qVar.g()) >= 0;
    }

    @NonNull
    public q b() {
        return this.f115227a;
    }

    @NonNull
    public String e() {
        return this.f115227a.toString();
    }
}
