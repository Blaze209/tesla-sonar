package s70;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import n70.v;
import n70.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f110515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f110516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f110517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ComposeView f110518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f110519e;

    private b(@NonNull View view, @NonNull ImageView imageView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ComposeView composeView, @NonNull ImageView imageView2) {
        this.f110515a = view;
        this.f110516b = imageView;
        this.f110517c = circularProgressIndicator;
        this.f110518d = composeView;
        this.f110519e = imageView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = v.f93495a;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = v.f93496b;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
            if (circularProgressIndicator != null) {
                i11 = v.f93497c;
                ComposeView composeView = (ComposeView) gb.b.a(view, i11);
                if (composeView != null) {
                    i11 = v.f93498d;
                    ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                    if (imageView2 != null) {
                        return new b(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(w.f93501b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f110515a;
    }
}
