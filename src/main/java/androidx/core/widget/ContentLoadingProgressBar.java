package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f7867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f7868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f7869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f7870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f7871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f7872f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f7869c = false;
        if (contentLoadingProgressBar.f7870d) {
            return;
        }
        contentLoadingProgressBar.f7867a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void d(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f7868b = false;
        contentLoadingProgressBar.f7867a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f7870d = true;
        removeCallbacks(this.f7872f);
        this.f7869c = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f7867a;
        long j12 = jCurrentTimeMillis - j11;
        if (j12 >= 500 || j11 == -1) {
            setVisibility(8);
        } else {
            if (this.f7868b) {
                return;
            }
            postDelayed(this.f7871e, 500 - j12);
            this.f7868b = true;
        }
    }

    private void g() {
        removeCallbacks(this.f7871e);
        removeCallbacks(this.f7872f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f7867a = -1L;
        this.f7870d = false;
        removeCallbacks(this.f7871e);
        this.f7868b = false;
        if (this.f7869c) {
            return;
        }
        postDelayed(this.f7872f, 500L);
        this.f7869c = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f7935a.f();
            }
        });
    }

    public void h() {
        post(new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f7934a.i();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7867a = -1L;
        this.f7868b = false;
        this.f7869c = false;
        this.f7870d = false;
        this.f7871e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.d(this.f7932a);
            }
        };
        this.f7872f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.c(this.f7933a);
            }
        };
    }
}
