package bi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import yh0.m;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f17425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f17426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f17427c;

    private c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f17425a = view;
        this.f17426b = imageView;
        this.f17427c = imageView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = m.f125539e;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = m.f125540f;
            ImageView imageView2 = (ImageView) gb.b.a(view, i11);
            if (imageView2 != null) {
                return new c(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(n.f125550c, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f17425a;
    }
}
