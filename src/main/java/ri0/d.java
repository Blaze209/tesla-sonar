package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f108313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f108315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f108317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f108318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f108319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f108320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f108321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f108329s;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f108311a = constraintLayout;
        this.f108312b = textInputLayout;
        this.f108313c = textView;
        this.f108314d = textInputLayout2;
        this.f108315e = materialAutoCompleteTextView;
        this.f108316f = textInputLayout3;
        this.f108317g = materialAutoCompleteTextView2;
        this.f108318h = constraintLayout2;
        this.f108319i = constraintLayout3;
        this.f108320j = constraintLayout4;
        this.f108321k = textView2;
        this.f108322l = textInputLayout4;
        this.f108323m = textInputLayout5;
        this.f108324n = textInputLayout6;
        this.f108325o = textInputEditText;
        this.f108326p = textInputEditText2;
        this.f108327q = textInputEditText3;
        this.f108328r = textInputEditText4;
        this.f108329s = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = mi0.e.f92160b;
        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
        if (textInputLayout != null) {
            i11 = mi0.e.f92162c;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = mi0.e.f92164d;
                TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                if (textInputLayout2 != null) {
                    i11 = mi0.e.f92166e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) gb.b.a(view, i11);
                    if (materialAutoCompleteTextView != null) {
                        i11 = mi0.e.f92168f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                        if (textInputLayout3 != null) {
                            i11 = mi0.e.f92170g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) gb.b.a(view, i11);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i11 = mi0.e.f92172h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                                if (constraintLayout2 != null) {
                                    i11 = mi0.e.f92174i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) gb.b.a(view, i11);
                                    if (constraintLayout3 != null) {
                                        i11 = mi0.e.f92176j;
                                        TextView textView2 = (TextView) gb.b.a(view, i11);
                                        if (textView2 != null) {
                                            i11 = mi0.e.f92178k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                                            if (textInputLayout4 != null) {
                                                i11 = mi0.e.f92180l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) gb.b.a(view, i11);
                                                if (textInputLayout5 != null) {
                                                    i11 = mi0.e.f92182m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) gb.b.a(view, i11);
                                                    if (textInputLayout6 != null) {
                                                        i11 = mi0.e.A;
                                                        TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
                                                        if (textInputEditText != null) {
                                                            i11 = mi0.e.B;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) gb.b.a(view, i11);
                                                            if (textInputEditText2 != null) {
                                                                i11 = mi0.e.C;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) gb.b.a(view, i11);
                                                                if (textInputEditText3 != null) {
                                                                    i11 = mi0.e.D;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) gb.b.a(view, i11);
                                                                    if (textInputEditText4 != null) {
                                                                        i11 = mi0.e.f92181l0;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
                                                                        if (circularProgressIndicator != null) {
                                                                            return new d(constraintLayout, textInputLayout, textView, textInputLayout2, materialAutoCompleteTextView, textInputLayout3, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, constraintLayout3, textView2, textInputLayout4, textInputLayout5, textInputLayout6, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, circularProgressIndicator);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92213d, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108311a;
    }
}
