package o80;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f96884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f96885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f96886c;

    private k(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f96884a = linearLayout;
        this.f96885b = imageView;
        this.f96886c = circularProgressIndicator;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i11 = n80.d.f93632a;
        ImageView imageView = (ImageView) gb.b.a(view, i11);
        if (imageView != null) {
            i11 = n80.d.f93653v;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
            if (circularProgressIndicator != null) {
                return new k((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96884a;
    }
}
