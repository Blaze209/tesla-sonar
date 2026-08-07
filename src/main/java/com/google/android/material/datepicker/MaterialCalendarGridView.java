package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f41914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41915b;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.v0(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i11, Rect rect) {
        if (i11 == 33) {
            setSelection(getAdapter().m());
        } else if (i11 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    private View c(int i11) {
        return getChildAt(i11 - getFirstVisiblePosition());
    }

    private static int d(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l11, Long l12, Long l13, Long l14) {
        return l11 == null || l12 == null || l13 == null || l14 == null || l13.longValue() > l12.longValue() || l14.longValue() < l11.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v getAdapter() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@NonNull Canvas canvas) {
        int iA;
        int iD;
        int iA2;
        int iD2;
        int width;
        int i11;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter = materialCalendarGridView.getAdapter();
        j<?> jVar = adapter.f42060b;
        c cVar = adapter.f42062d;
        int iMax = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (u5.d<Long, Long> dVar : jVar.O2()) {
            Long l11 = dVar.f115407a;
            if (l11 == null) {
                materialCalendarGridView = this;
            } else if (dVar.f115408b != null) {
                Long l12 = l11;
                long jLongValue = l12.longValue();
                Long l13 = dVar.f115408b;
                long jLongValue2 = l13.longValue();
                if (!e(item, item2, l12, l13)) {
                    boolean zM = com.google.android.material.internal.d0.m(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iD = adapter.h(iMax) ? 0 : !zM ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f41914a.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f41914a.get(5));
                        iD = d(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iD2 = adapter.i(iMin) ? materialCalendarGridView.getWidth() : !zM ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f41914a.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f41914a.get(5));
                        iD2 = d(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i12 = iMax;
                    int i13 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop() + cVar.f41941a.c();
                        v vVar = adapter;
                        int bottom = viewC.getBottom() - cVar.f41941a.b();
                        if (zM) {
                            int i14 = iA2 > numColumns2 ? 0 : iD2;
                            width = numColumns > iA ? getWidth() : iD;
                            i11 = i14;
                        } else {
                            i11 = numColumns > iA ? 0 : iD;
                            width = iA2 > numColumns2 ? getWidth() : iD2;
                        }
                        canvas.drawRect(i11, top, width, bottom, cVar.f41948h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = vVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i12;
                    iMin = i13;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (z11) {
            a(i11, rect);
        } else {
            super.onFocusChanged(false, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i11) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (!this.f41915b) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i11) {
        if (i11 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i11);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f41914a = c0.m();
        if (r.u(getContext())) {
            setNextFocusLeftId(zs.g.f128684a);
            setNextFocusRightId(zs.g.f128690d);
        }
        this.f41915b = r.w(getContext());
        ViewCompat.p0(this, new a());
    }
}
