package an0;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/* JADX INFO: loaded from: classes9.dex */
public class a implements io.realm.internal.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean f1764c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f1765a = Looper.myLooper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1766b = e();

    private boolean d() {
        return this.f1765a != null;
    }

    private static boolean e() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }

    @Override // io.realm.internal.a
    public boolean a() {
        Looper looper = this.f1765a;
        if (looper != null) {
            return f1764c || looper == Looper.getMainLooper();
        }
        return false;
    }

    @Override // io.realm.internal.a
    public boolean b() {
        return d() && !this.f1766b;
    }

    @Override // io.realm.internal.a
    public void c(String str) {
        String str2 = "";
        if (!d()) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        }
        if (this.f1766b) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }
}
