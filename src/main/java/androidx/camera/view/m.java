package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import c0.z1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Size f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    FrameLayout f3745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final f f3746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3747d = false;

    interface a {
        void a();
    }

    m(@NonNull FrameLayout frameLayout, @NonNull f fVar) {
        this.f3745b = frameLayout;
        this.f3746c = fVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f3746c.a(bitmapC, new Size(this.f3745b.getWidth(), this.f3745b.getHeight()), this.f3745b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f3747d = true;
        h();
    }

    abstract void g(@NonNull z1 z1Var, a aVar);

    void h() {
        View viewB = b();
        if (viewB == null || !this.f3747d) {
            return;
        }
        this.f3746c.s(new Size(this.f3745b.getWidth(), this.f3745b.getHeight()), this.f3745b.getLayoutDirection(), viewB);
    }

    abstract void i(@NonNull Executor executor, @NonNull PreviewView.d dVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract com.google.common.util.concurrent.s<Void> j();
}
