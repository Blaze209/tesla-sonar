package pf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f102199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f102200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f102201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f102202d;

    private c(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f102199a = view;
        this.f102200b = imageView;
        this.f102201c = textView;
        this.f102202d = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = of.a.f97238d;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = of.a.f97247m;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = of.a.f97248n;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    return new c(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(of.b.f97257c, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f102199a;
    }
}
