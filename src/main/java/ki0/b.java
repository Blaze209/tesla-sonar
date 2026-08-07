package ki0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lkotlin/Function0;", "Ljn0/h0;", "onCancel", "Landroid/view/View;", "bottomSheet", "contentContainer", "tintView", "b", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lwn0/a;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ki0/b$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f86128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f86129b;

        a(wn0.a<h0> aVar, View view) {
            this.f86128a = aVar;
            this.f86129b = view;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            View view;
            p013kotlin.jvm.internal.s.k(bottomSheet, "bottomSheet");
            if (slideOffset > BitmapDescriptorFactory.HUE_RED && (view = this.f86129b) != null) {
                view.setVisibility(0);
            }
            View view2 = this.f86129b;
            if (view2 != null) {
                view2.setAlpha(bo0.n.e(slideOffset, BitmapDescriptorFactory.HUE_RED));
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            p013kotlin.jvm.internal.s.k(bottomSheet, "bottomSheet");
            if (newState == 4 || newState == 5) {
                this.f86128a.invoke();
                View view = this.f86129b;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    public static final void b(BottomSheetBehavior<?> bottomSheetBehavior, wn0.a<h0> onCancel, final View bottomSheet, View view, View view2) {
        p013kotlin.jvm.internal.s.k(bottomSheetBehavior, "<this>");
        p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
        p013kotlin.jvm.internal.s.k(bottomSheet, "bottomSheet");
        bottomSheetBehavior.c0(new a(onCancel, view2));
        bottomSheetBehavior.X0(true);
        if (view != null) {
            bottomSheet = view;
        }
        f.g(bottomSheet, new wn0.l() { // from class: ki0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b.c(bottomSheet, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(View view, WindowInsetsCompat insets) {
        p013kotlin.jvm.internal.s.k(insets, "insets");
        k5.e eVarG = insets.g(WindowInsetsCompat.n.h());
        p013kotlin.jvm.internal.s.j(eVarG, "getInsetsIgnoringVisibility(...)");
        k5.e eVarF = insets.f(WindowInsetsCompat.n.c());
        p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), Integer.max(eVarG.f84927d, eVarF.f84927d));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = eVarG.f84925b;
        view.setLayoutParams(marginLayoutParams);
        return h0.f84049a;
    }
}
