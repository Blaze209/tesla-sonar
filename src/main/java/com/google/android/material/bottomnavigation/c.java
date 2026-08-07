package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.navigation.e;
import zs.d;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class c extends e {

    class a implements d0.d {
        a() {
        }

        @Override // com.google.android.material.internal.d0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull d0.e eVar) {
            eVar.f42331d += windowInsetsCompat.j();
            boolean z11 = ViewCompat.A(view) == 1;
            int iK = windowInsetsCompat.k();
            int iL = windowInsetsCompat.l();
            eVar.f42328a += z11 ? iL : iK;
            int i11 = eVar.f42330c;
            if (!z11) {
                iK = iL;
            }
            eVar.f42330c = i11 + iK;
            eVar.a(view);
            return windowInsetsCompat;
        }
    }

    @Deprecated
    public interface b extends e.b {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    @Deprecated
    public interface InterfaceC0658c extends e.c {
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private void g(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.b.getColor(context, d.f128607a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(zs.e.f128630g)));
        addView(view);
    }

    private void h() {
        d0.g(this, new a());
    }

    private int i(int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i11;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean j() {
        return false;
    }

    @Override // com.google.android.material.navigation.e
    @NonNull
    protected com.google.android.material.navigation.c c(@NonNull Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.e
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i(i12));
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.r() != z11) {
            bVar.setItemHorizontalTranslationEnabled(z11);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0658c interfaceC0658c) {
        setOnItemSelectedListener(interfaceC0658c);
    }

    public c(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128563e);
    }

    public c(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, l.f128803l);
    }

    public c(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2 = getContext();
        b1 b1VarJ = a0.j(context2, attributeSet, m.I0, i11, i12, new int[0]);
        setItemHorizontalTranslationEnabled(b1VarJ.a(m.L0, true));
        if (b1VarJ.s(m.J0)) {
            setMinimumHeight(b1VarJ.f(m.J0, 0));
        }
        if (b1VarJ.a(m.K0, true) && j()) {
            g(context2);
        }
        b1VarJ.w();
        h();
    }
}
