package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f96875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f96876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f96877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f96880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f96881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96883i;

    private j(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull ThreeDS2TextView threeDS2TextView, @NonNull ThreeDS2TextView threeDS2TextView2, @NonNull AppCompatImageView appCompatImageView2, @NonNull LinearLayout linearLayout3, @NonNull ThreeDS2TextView threeDS2TextView3, @NonNull ThreeDS2TextView threeDS2TextView4) {
        this.f96875a = linearLayout;
        this.f96876b = appCompatImageView;
        this.f96877c = linearLayout2;
        this.f96878d = threeDS2TextView;
        this.f96879e = threeDS2TextView2;
        this.f96880f = appCompatImageView2;
        this.f96881g = linearLayout3;
        this.f96882h = threeDS2TextView3;
        this.f96883i = threeDS2TextView4;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i11 = n80.d.f93645n;
        AppCompatImageView appCompatImageView = (AppCompatImageView) gb.b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = n80.d.f93646o;
            LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
            if (linearLayout != null) {
                i11 = n80.d.f93647p;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) gb.b.a(view, i11);
                if (threeDS2TextView != null) {
                    i11 = n80.d.f93648q;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) gb.b.a(view, i11);
                    if (threeDS2TextView2 != null) {
                        i11 = n80.d.A;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) gb.b.a(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = n80.d.B;
                            LinearLayout linearLayout2 = (LinearLayout) gb.b.a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = n80.d.C;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) gb.b.a(view, i11);
                                if (threeDS2TextView3 != null) {
                                    i11 = n80.d.D;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) gb.b.a(view, i11);
                                    if (threeDS2TextView4 != null) {
                                        return new j((LinearLayout) view, appCompatImageView, linearLayout, threeDS2TextView, threeDS2TextView2, appCompatImageView2, linearLayout2, threeDS2TextView3, threeDS2TextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static j c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93667j, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96875a;
    }
}
