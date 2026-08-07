package rj;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.v;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set<Activity> f108411a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f108412b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f108413a;

        /* JADX INFO: renamed from: rj.h$a$a, reason: collision with other inner class name */
        class RunnableC2303a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f108415a;

            RunnableC2303a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f108415a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.b().h();
                h.this.f108412b = true;
                h.b(a.this.f108413a, this.f108415a);
                h.this.f108411a.clear();
            }
        }

        a(View view) {
            this.f108413a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            xj.l.v(new RunnableC2303a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // rj.i
    public void a(Activity activity) {
        if (!this.f108412b && this.f108411a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
