package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f96843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f96844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f96845c;

    private a(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f96843a = view;
        this.f96844b = imageView;
        this.f96845c = imageView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = n80.d.f93650s;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = n80.d.f93652u;
            ImageView imageView2 = (ImageView) gb.b.a(view, i11);
            if (imageView2 != null) {
                return new a(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(n80.e.f93658a, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f96843a;
    }
}
