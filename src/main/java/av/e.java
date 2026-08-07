package av;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class e implements wu.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cv.b f15144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cv.b f15145b;

    e() {
    }

    private static void b(cv.b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    private void c(@NonNull String str, @NonNull Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f15144a : this.f15145b, str, bundle);
    }

    @Override // wu.a.b
    public void a(int i11, Bundle bundle) {
        String string;
        bv.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i11), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(cv.b bVar) {
        this.f15145b = bVar;
    }

    public void e(cv.b bVar) {
        this.f15144a = bVar;
    }
}
