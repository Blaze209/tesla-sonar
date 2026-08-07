package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f70659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f70660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Toolbar f70661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewStub f70662d;

    private b(@NonNull RelativeLayout relativeLayout, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull Toolbar toolbar, @NonNull ViewStub viewStub) {
        this.f70659a = relativeLayout;
        this.f70660b = linearProgressIndicator;
        this.f70661c = toolbar;
        this.f70662d = viewStub;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = f30.z.f64256f0;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) gb.b.a(view, i11);
        if (linearProgressIndicator != null) {
            i11 = f30.z.G0;
            Toolbar toolbar = (Toolbar) gb.b.a(view, i11);
            if (toolbar != null) {
                i11 = f30.z.H0;
                ViewStub viewStub = (ViewStub) gb.b.a(view, i11);
                if (viewStub != null) {
                    return new b((RelativeLayout) view, linearProgressIndicator, toolbar, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63904b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f70659a;
    }
}
