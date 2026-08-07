package androidx.transition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14098b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f14099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f14100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f14101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f14102f;

    public n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f14099c = viewGroup;
        this.f14100d = view;
    }

    public static n c(@NonNull ViewGroup viewGroup) {
        return (n) viewGroup.getTag(l.f14089c);
    }

    static void f(@NonNull ViewGroup viewGroup, n nVar) {
        viewGroup.setTag(l.f14089c, nVar);
    }

    public void a() {
        if (this.f14098b > 0 || this.f14100d != null) {
            d().removeAllViews();
            if (this.f14098b > 0) {
                LayoutInflater.from(this.f14097a).inflate(this.f14098b, this.f14099c);
            } else {
                this.f14099c.addView(this.f14100d);
            }
        }
        Runnable runnable = this.f14101e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f14099c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f14099c) != this || (runnable = this.f14102f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup d() {
        return this.f14099c;
    }

    boolean e() {
        return this.f14098b > 0;
    }
}
