package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f70704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f70705c;

    private j(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f70703a = view;
        this.f70704b = imageView;
        this.f70705c = imageView2;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i11 = f30.z.f64283t;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = f30.z.T;
            ImageView imageView2 = (ImageView) gb.b.a(view, i11);
            if (imageView2 != null) {
                return new j(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static j b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63913k, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70703a;
    }
}
