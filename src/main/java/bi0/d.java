package bi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import yh0.m;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f17428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f17429b;

    private d(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.f17428a = view;
        this.f17429b = progressBar;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = m.f125545k;
        ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
        if (progressBar != null) {
            return new d(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(n.f125551d, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f17428a;
    }
}
