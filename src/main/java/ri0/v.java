package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f108395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f108396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f108397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f108398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f108399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f108400g;

    private v(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.f108394a = constraintLayout;
        this.f108395b = textView;
        this.f108396c = imageView;
        this.f108397d = textView2;
        this.f108398e = textView3;
        this.f108399f = materialCardView;
        this.f108400g = imageView2;
    }

    @NonNull
    public static v a(@NonNull View view) {
        int i11 = mi0.e.f92158a;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = mi0.e.f92206y;
            ImageView imageView = (ImageView) gb.b.a(view, i11);
            if (imageView != null) {
                i11 = mi0.e.E;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    i11 = mi0.e.W;
                    TextView textView3 = (TextView) gb.b.a(view, i11);
                    if (textView3 != null) {
                        i11 = mi0.e.f92209z0;
                        MaterialCardView materialCardView = (MaterialCardView) gb.b.a(view, i11);
                        if (materialCardView != null) {
                            i11 = mi0.e.A0;
                            ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                            if (imageView2 != null) {
                                return new v((ConstraintLayout) view, textView, imageView, textView2, textView3, materialCardView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static v c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static v d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92232w, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108394a;
    }
}
