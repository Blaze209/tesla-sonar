package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import gb.b;
import od.d;
import od.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f102104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f102105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f102106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f102107d;

    private a(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f102104a = view;
        this.f102105b = imageView;
        this.f102106c = textView;
        this.f102107d = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = d.f97118a;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = d.f97119b;
            TextView textView = (TextView) b.a(view, i11);
            if (textView != null) {
                i11 = d.f97120c;
                TextView textView2 = (TextView) b.a(view, i11);
                if (textView2 != null) {
                    return new a(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(e.f97121a, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f102104a;
    }
}
