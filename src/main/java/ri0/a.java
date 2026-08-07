package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f108290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f108291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f108292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f108293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f108294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f108297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f108298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f108299j;

    private a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull MaterialToolbar materialToolbar) {
        this.f108290a = frameLayout;
        this.f108291b = frameLayout2;
        this.f108292c = linearLayout;
        this.f108293d = view;
        this.f108294e = recyclerView;
        this.f108295f = textInputEditText;
        this.f108296g = textInputLayout;
        this.f108297h = view2;
        this.f108298i = textView;
        this.f108299j = materialToolbar;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = mi0.e.f92184n;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = mi0.e.Y;
            LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
            if (linearLayout != null && (viewA = gb.b.a(view, (i11 = mi0.e.Z))) != null) {
                i11 = mi0.e.f92195s0;
                RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
                if (recyclerView != null) {
                    i11 = mi0.e.f92199u0;
                    TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
                    if (textInputEditText != null) {
                        i11 = mi0.e.f92201v0;
                        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                        if (textInputLayout != null && (viewA2 = gb.b.a(view, (i11 = mi0.e.f92207y0))) != null) {
                            i11 = mi0.e.D0;
                            TextView textView = (TextView) gb.b.a(view, i11);
                            if (textView != null) {
                                i11 = mi0.e.F0;
                                MaterialToolbar materialToolbar = (MaterialToolbar) gb.b.a(view, i11);
                                if (materialToolbar != null) {
                                    return new a((FrameLayout) view, frameLayout, linearLayout, viewA, recyclerView, textInputEditText, textInputLayout, viewA2, textView, materialToolbar);
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
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92210a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f108290a;
    }
}
