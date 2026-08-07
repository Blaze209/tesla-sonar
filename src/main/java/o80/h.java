package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f96863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f96864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ThreeDS2HeaderTextView f96865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThreeDS2Button f96867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThreeDS2Button f96868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RadioButton f96869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RadioGroup f96870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RadioButton f96871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96872j;

    private h(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ThreeDS2HeaderTextView threeDS2HeaderTextView, @NonNull ThreeDS2TextView threeDS2TextView, @NonNull ThreeDS2Button threeDS2Button, @NonNull ThreeDS2Button threeDS2Button2, @NonNull RadioButton radioButton, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton2, @NonNull ThreeDS2TextView threeDS2TextView2) {
        this.f96863a = view;
        this.f96864b = frameLayout;
        this.f96865c = threeDS2HeaderTextView;
        this.f96866d = threeDS2TextView;
        this.f96867e = threeDS2Button;
        this.f96868f = threeDS2Button2;
        this.f96869g = radioButton;
        this.f96870h = radioGroup;
        this.f96871i = radioButton2;
        this.f96872j = threeDS2TextView2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = n80.d.f93636e;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = n80.d.f93637f;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) gb.b.a(view, i11);
            if (threeDS2HeaderTextView != null) {
                i11 = n80.d.f93638g;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) gb.b.a(view, i11);
                if (threeDS2TextView != null) {
                    i11 = n80.d.f93639h;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) gb.b.a(view, i11);
                    if (threeDS2Button != null) {
                        i11 = n80.d.f93640i;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) gb.b.a(view, i11);
                        if (threeDS2Button2 != null) {
                            i11 = n80.d.f93641j;
                            RadioButton radioButton = (RadioButton) gb.b.a(view, i11);
                            if (radioButton != null) {
                                i11 = n80.d.f93642k;
                                RadioGroup radioGroup = (RadioGroup) gb.b.a(view, i11);
                                if (radioGroup != null) {
                                    i11 = n80.d.f93643l;
                                    RadioButton radioButton2 = (RadioButton) gb.b.a(view, i11);
                                    if (radioButton2 != null) {
                                        i11 = n80.d.f93644m;
                                        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) gb.b.a(view, i11);
                                        if (threeDS2TextView2 != null) {
                                            return new h(view, frameLayout, threeDS2HeaderTextView, threeDS2TextView, threeDS2Button, threeDS2Button2, radioButton, radioGroup, radioButton2, threeDS2TextView2);
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
    public static h b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(n80.e.f93665h, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f96863a;
    }
}
