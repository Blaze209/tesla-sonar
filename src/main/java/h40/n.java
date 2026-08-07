package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f70738b;

    private n(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.f70737a = view;
        this.f70738b = progressBar;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i11 = f30.z.f64269m;
        ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
        if (progressBar != null) {
            return new n(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static n b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63917o, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70737a;
    }
}
