package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7795a;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f7796a;

        b(View view) {
            this.f7796a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
            this.f7796a.onScrollLimit(i11, i12, i13, z11);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i11, int i12, int i13, int i14) {
            this.f7796a.onScrollProgress(i11, i12, i13, i14);
        }
    }

    private static class c implements d {
        private c() {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i11, int i12, int i13, int i14) {
        }
    }

    private interface d {
        void onScrollLimit(int i11, int i12, int i13, boolean z11);

        void onScrollProgress(int i11, int i12, int i13, int i14);
    }

    private f0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f7795a = new b(view);
        } else {
            this.f7795a = new c();
        }
    }

    public static f0 a(View view) {
        return new f0(view);
    }

    public void b(int i11, int i12, int i13, boolean z11) {
        this.f7795a.onScrollLimit(i11, i12, i13, z11);
    }

    public void c(int i11, int i12, int i13, int i14) {
        this.f7795a.onScrollProgress(i11, i12, i13, i14);
    }
}
