package aj0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import mi0.UiStepBottomSheet;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Laj0/l1;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Loi0/w4;", "sheetComponent", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "g", "(Loi0/w4;La30/a0;)V", "f", "()V", "a", "Landroid/view/ViewGroup;", "Lmi0/j;", "b", "Lmi0/j;", "currentBottomSheet", "c", "Loi0/w4;", DateTokenConverter.CONVERTER_KEY, "()Loi0/w4;", "setCurrentSheetComponent", "(Loi0/w4;)V", "currentSheetComponent", "Lmi0/h;", "e", "()Lmi0/h;", "uiScreenGenerationResult", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private UiStepBottomSheet currentBottomSheet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private oi0.w4 currentSheetComponent;

    public l1(ViewGroup contentView) {
        p013kotlin.jvm.internal.s.k(contentView, "contentView");
        this.contentView = contentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(p013kotlin.jvm.internal.n0 n0Var) {
        ((wn0.a) n0Var.f86529a).invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(oi0.w4 w4Var, l1 l1Var, View view) {
        w4Var.y0(true);
        w4Var.d1(false);
        l1Var.contentView.removeView(view);
        l1Var.currentSheetComponent = null;
        l1Var.currentBottomSheet = null;
        return jn0.h0.f84049a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final oi0.w4 getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    public final mi0.h e() {
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            return uiStepBottomSheet.getUiScreenGenerationResult();
        }
        return null;
    }

    public final void f() {
        BottomSheetBehavior<?> bottomSheetBehaviorG;
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null && (bottomSheetBehaviorG = uiStepBottomSheet.g()) != null) {
            bottomSheetBehaviorG.Y0(5);
        }
        this.currentSheetComponent = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, aj0.i1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, aj0.k1] */
    public final void g(final oi0.w4 sheetComponent, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(sheetComponent, "sheetComponent");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        final p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        n0Var.f86529a = new wn0.a() { // from class: aj0.i1
            @Override // wn0.a
            public final Object invoke() {
                return l1.h();
            }
        };
        UiStepBottomSheet uiStepBottomSheet = new UiStepBottomSheet(sheetComponent.getScreen(), p013kotlin.collections.v.m(), new wn0.a() { // from class: aj0.j1
            @Override // wn0.a
            public final Object invoke() {
                return l1.i(n0Var);
            }
        }, null, sheetComponent.getHideWhenTappedOutside());
        this.currentBottomSheet = uiStepBottomSheet;
        a30.c0<UiStepBottomSheet> c0VarA = uiStepBottomSheet.a();
        Context context = this.contentView.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        final View viewA = c0VarA.a(uiStepBottomSheet, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewA);
        a30.g0.h(viewA);
        n0Var.f86529a = new wn0.a() { // from class: aj0.k1
            @Override // wn0.a
            public final Object invoke() {
                return l1.j(sheetComponent, this, viewA);
            }
        };
    }
}
