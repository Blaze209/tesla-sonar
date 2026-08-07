package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f96873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ThreeDS2WebView f96874b;

    private i(@NonNull View view, @NonNull ThreeDS2WebView threeDS2WebView) {
        this.f96873a = view;
        this.f96874b = threeDS2WebView;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i11 = n80.d.f93657z;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) gb.b.a(view, i11);
        if (threeDS2WebView != null) {
            return new i(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static i b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(n80.e.f93666i, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f96873a;
    }
}
