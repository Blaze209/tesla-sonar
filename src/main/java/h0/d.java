package h0;

import android.os.Build;
import android.util.CloseGuard;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f70083a;

    static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CloseGuard f70084a = new CloseGuard();

        a() {
        }

        @Override // h0.d.b
        public void a(@NonNull String str) {
            this.f70084a.open(str);
        }

        @Override // h0.d.b
        public void b() {
            this.f70084a.warnIfOpen();
        }

        @Override // h0.d.b
        public void close() {
            this.f70084a.close();
        }
    }

    private interface b {
        void a(@NonNull String str);

        void b();

        void close();
    }

    private d(b bVar) {
        this.f70083a = bVar;
    }

    @NonNull
    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f70083a.close();
    }

    public void c(@NonNull String str) {
        this.f70083a.a(str);
    }

    public void d() {
        this.f70083a.b();
    }

    static final class c implements b {
        c() {
        }

        @Override // h0.d.b
        public void a(@NonNull String str) {
            u5.h.h(str, "CloseMethodName must not be null.");
        }

        @Override // h0.d.b
        public void b() {
        }

        @Override // h0.d.b
        public void close() {
        }
    }
}
