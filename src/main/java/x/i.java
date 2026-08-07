package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f122454a;

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputConfiguration f122455a;

        a(@NonNull Object obj) {
            this.f122455a = (InputConfiguration) obj;
        }

        @Override // x.i.c
        public Object a() {
            return this.f122455a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f122455a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f122455a.hashCode();
        }

        @NonNull
        public String toString() {
            return this.f122455a.toString();
        }
    }

    private static final class b extends a {
        b(@NonNull Object obj) {
            super(obj);
        }
    }

    private interface c {
        Object a();
    }

    private i(@NonNull c cVar) {
        this.f122454a = cVar;
    }

    public static i b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new i(new b(obj)) : new i(new a(obj));
    }

    public Object a() {
        return this.f122454a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f122454a.equals(((i) obj).f122454a);
        }
        return false;
    }

    public int hashCode() {
        return this.f122454a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f122454a.toString();
    }
}
