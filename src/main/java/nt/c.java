package nt;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f95448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final nt.b f95449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final View f95450c;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f95451a;

        private b() {
        }

        @Override // nt.c.d
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f95451a);
            this.f95451a = null;
        }

        @Override // nt.c.d
        public void b(@NonNull nt.b bVar, @NonNull View view, boolean z11) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f95451a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f95451a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z11 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        OnBackInvokedCallback c(@NonNull final nt.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: nt.d
                public final void onBackInvoked() {
                    bVar.c();
                }
            };
        }

        boolean d() {
            return this.f95451a != null;
        }
    }

    /* JADX INFO: renamed from: nt.c$c, reason: collision with other inner class name */
    private static class C2035c extends b {

        /* JADX INFO: renamed from: nt.c$c$a */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ nt.b f95452a;

            a(nt.b bVar) {
                this.f95452a = bVar;
            }

            public void onBackCancelled() {
                if (C2035c.this.d()) {
                    this.f95452a.d();
                }
            }

            public void onBackInvoked() {
                this.f95452a.c();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C2035c.this.d()) {
                    this.f95452a.b(new androidx.p002activity.b(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C2035c.this.d()) {
                    this.f95452a.a(new androidx.p002activity.b(backEvent));
                }
            }
        }

        private C2035c() {
            super();
        }

        @Override // nt.c.b
        OnBackInvokedCallback c(@NonNull nt.b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(@NonNull View view);

        void b(@NonNull nt.b bVar, @NonNull View view, boolean z11);
    }

    public <T extends View & nt.b> c(@NonNull T t11) {
        this(t11, t11);
    }

    private static d a() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return new C2035c();
        }
        if (i11 >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z11) {
        d dVar = this.f95448a;
        if (dVar != null) {
            dVar.b(this.f95449b, this.f95450c, z11);
        }
    }

    public void b() {
        c(false);
    }

    public void d() {
        d dVar = this.f95448a;
        if (dVar != null) {
            dVar.a(this.f95450c);
        }
    }

    public c(@NonNull nt.b bVar, @NonNull View view) {
        this.f95448a = a();
        this.f95449b = bVar;
        this.f95450c = view;
    }
}
