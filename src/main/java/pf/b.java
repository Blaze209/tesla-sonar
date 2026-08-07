package pf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f102183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f102184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f102185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f102186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RoundCornerImageView f102187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Flow f102188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f102189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f102190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RecyclerView f102191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Space f102192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Space f102193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f102194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f102195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f102196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f102197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f102198p;

    private b(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3, @NonNull RoundCornerImageView roundCornerImageView, @NonNull Flow flow, @NonNull View view2, @NonNull View view3, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f102183a = view;
        this.f102184b = materialButton;
        this.f102185c = materialButton2;
        this.f102186d = materialButton3;
        this.f102187e = roundCornerImageView;
        this.f102188f = flow;
        this.f102189g = view2;
        this.f102190h = view3;
        this.f102191i = recyclerView;
        this.f102192j = space;
        this.f102193k = space2;
        this.f102194l = textView;
        this.f102195m = textView2;
        this.f102196n = textView3;
        this.f102197o = textView4;
        this.f102198p = textView5;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = of.a.f97235a;
        MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
        if (materialButton != null) {
            i11 = of.a.f97236b;
            MaterialButton materialButton2 = (MaterialButton) gb.b.a(view, i11);
            if (materialButton2 != null) {
                i11 = of.a.f97237c;
                MaterialButton materialButton3 = (MaterialButton) gb.b.a(view, i11);
                if (materialButton3 != null) {
                    i11 = of.a.f97238d;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) gb.b.a(view, i11);
                    if (roundCornerImageView != null) {
                        i11 = of.a.f97240f;
                        Flow flow = (Flow) gb.b.a(view, i11);
                        if (flow != null && (viewA = gb.b.a(view, (i11 = of.a.f97241g))) != null && (viewA2 = gb.b.a(view, (i11 = of.a.f97242h))) != null) {
                            i11 = of.a.f97243i;
                            RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
                            if (recyclerView != null) {
                                i11 = of.a.f97244j;
                                Space space = (Space) gb.b.a(view, i11);
                                if (space != null) {
                                    i11 = of.a.f97245k;
                                    Space space2 = (Space) gb.b.a(view, i11);
                                    if (space2 != null) {
                                        i11 = of.a.f97246l;
                                        TextView textView = (TextView) gb.b.a(view, i11);
                                        if (textView != null) {
                                            i11 = of.a.f97251q;
                                            TextView textView2 = (TextView) gb.b.a(view, i11);
                                            if (textView2 != null) {
                                                i11 = of.a.f97252r;
                                                TextView textView3 = (TextView) gb.b.a(view, i11);
                                                if (textView3 != null) {
                                                    i11 = of.a.f97253s;
                                                    TextView textView4 = (TextView) gb.b.a(view, i11);
                                                    if (textView4 != null) {
                                                        i11 = of.a.f97254t;
                                                        TextView textView5 = (TextView) gb.b.a(view, i11);
                                                        if (textView5 != null) {
                                                            return new b(view, materialButton, materialButton2, materialButton3, roundCornerImageView, flow, viewA, viewA2, recyclerView, space, space2, textView, textView2, textView3, textView4, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(of.b.f97256b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f102183a;
    }
}
