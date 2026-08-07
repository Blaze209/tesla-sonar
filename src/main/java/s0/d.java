package s0;

import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final d f109295c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Size f109296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f109297b;

    private d() {
        this.f109296a = null;
        this.f109297b = 0;
    }

    public Size a() {
        return this.f109296a;
    }

    public int b() {
        return this.f109297b;
    }

    public d(@NonNull Size size, int i11) {
        this.f109296a = size;
        this.f109297b = i11;
    }
}
