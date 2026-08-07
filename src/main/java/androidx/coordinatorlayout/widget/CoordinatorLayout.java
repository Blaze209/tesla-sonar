package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.k;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.core.view.z;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements x, y {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final u5.f<Rect> sRectPool;
    private a0 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final z mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempList1;

    class a implements a0 {
        a() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect, boolean z11) {
            return false;
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        }

        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
            return false;
        }

        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                return D(coordinatorLayout, v11, view, view2, i11);
            }
            return false;
        }

        @Deprecated
        public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
            if (i11 == 0) {
                F(coordinatorLayout, v11, view);
            }
        }

        public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return h(coordinatorLayout, v11) > BitmapDescriptorFactory.HUE_RED;
        }

        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect) {
            return false;
        }

        public int g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return -16777216;
        }

        public float h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void k(@NonNull f fVar) {
        }

        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public void n() {
        }

        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
            return false;
        }

        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
            return false;
        }

        public boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12, boolean z11) {
            return false;
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12) {
            return false;
        }

        @Deprecated
        public void t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        }

        public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
            if (i13 == 0) {
                t(coordinatorLayout, v11, view, i11, i12, iArr);
            }
        }

        @Deprecated
        public void v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14) {
        }

        @Deprecated
        public void w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                v(coordinatorLayout, v11, view, i11, i12, i13, i14);
            }
        }

        public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            w(coordinatorLayout, v11, view, i11, i12, i13, i14, i15);
        }

        @Deprecated
        public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
        }

        public void z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                y(coordinatorLayout, v11, view, view2, i11);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fN = ViewCompat.N(view);
            float fN2 = ViewCompat.N(view2);
            if (fN > fN2) {
                return -1;
            }
            return fN < fN2 ? 1 : 0;
        }
    }

    static {
        Package r11 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r11 != null ? r11.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new i();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new u5.g(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect rectB = sRectPool.b();
        return rectB == null ? new Rect() : rectB;
    }

    private void cancelInterceptBehaviors() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                cVarF.o(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int clamp(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    private void constrainChildRect(f fVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i11 + iMax, i12 + iMax2);
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowInsetsCompat) {
        c cVarF;
        if (windowInsetsCompat.p()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (ViewCompat.x(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = cVarF.j(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.p()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(int i11, Rect rect, Rect rect2, f fVar, int i12, int i13) {
        int iWidth;
        int iHeight;
        int iB = k.b(resolveAnchoredChildGravity(fVar.f7405c), i11);
        int iB2 = k.b(resolveGravity(fVar.f7406d), i11);
        int i14 = iB & 7;
        int i15 = iB & 112;
        int i16 = iB2 & 7;
        int i17 = iB2 & 112;
        if (i16 != 1) {
            iWidth = i16 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            iHeight = i17 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i14 == 1) {
            iWidth -= i12 / 2;
        } else if (i14 != 5) {
            iWidth -= i12;
        }
        if (i15 == 16) {
            iHeight -= i13 / 2;
        } else if (i15 != 80) {
            iHeight -= i13;
        }
        rect2.set(iWidth, iHeight, i12 + iWidth, i13 + iHeight);
    }

    private int getKeyline(int i11) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        }
        if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        }
        Log.e(TAG, "Keyline index " + i11 + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.k(view);
    }

    private void layoutChild(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null && ViewCompat.x(this) && !ViewCompat.x(view)) {
            rectAcquireTempRect.left += this.mLastInsets.k();
            rectAcquireTempRect.top += this.mLastInsets.m();
            rectAcquireTempRect.right -= this.mLastInsets.l();
            rectAcquireTempRect.bottom -= this.mLastInsets.j();
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        k.a(resolveGravity(fVar.f7405c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i11);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i11) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i11, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i11, int i12) {
        int i13;
        f fVar = (f) view.getLayoutParams();
        int iB = k.b(resolveKeylineGravity(fVar.f7405c), i12);
        int i14 = iB & 7;
        int i15 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int keyline = getKeyline(i11) - measuredWidth;
        if (i14 == 1) {
            keyline += measuredWidth / 2;
        } else if (i14 == 5) {
            keyline += measuredWidth;
        }
        if (i15 != 16) {
            i13 = i15 != 80 ? 0 : measuredHeight;
        } else {
            i13 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent obtainCancelEvent(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void offsetChildByInset(View view, Rect rect, int i11) {
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        if (ViewCompat.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int iB = k.b(fVar.f7410h, i11);
            boolean z13 = true;
            if ((iB & 48) != 48 || (i16 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f7412j) >= (i17 = rect.top)) {
                z11 = false;
            } else {
                setInsetOffsetY(view, i17 - i16);
                z11 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f7412j) < (i15 = rect.bottom)) {
                setInsetOffsetY(view, height - i15);
                z11 = true;
            }
            if (!z11) {
                setInsetOffsetY(view, 0);
            }
            if ((iB & 3) != 3 || (i13 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f7411i) >= (i14 = rect.left)) {
                z12 = false;
            } else {
                setInsetOffsetX(view, i14 - i13);
                z12 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f7411i) >= (i12 = rect.right)) {
                z13 = z12;
            } else {
                setInsetOffsetX(view, width - i12);
            }
            if (!z13) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + CoreConstants.DOT + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e11) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e11);
        }
    }

    private boolean performEvent(c cVar, View view, MotionEvent motionEvent, int i11) {
        if (i11 == 0) {
            return cVar.o(this, view, motionEvent);
        }
        if (i11 == 1) {
            return cVar.H(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean performIntercept(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtainCancelEvent = null;
        boolean zPerformEvent = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zPerformEvent || z11) || actionMasked == 0) {
                if (!z11 && !zPerformEvent && cVarF != null && (zPerformEvent = performEvent(cVarF, view, motionEvent, i11))) {
                    this.mBehaviorTouchView = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i13 = 0; i13 < i12; i13++) {
                            View view2 = list.get(i13);
                            c cVarF2 = ((f) view2.getLayoutParams()).f();
                            if (cVarF2 != null) {
                                if (motionEventObtainCancelEvent == null) {
                                    motionEventObtainCancelEvent = obtainCancelEvent(motionEvent);
                                }
                                performEvent(cVarF2, view2, motionEventObtainCancelEvent, i11);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z11 = zI && !zC;
                if (zI && !z11) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtainCancelEvent == null) {
                    motionEventObtainCancelEvent = obtainCancelEvent(motionEvent);
                }
                performEvent(cVarF, view, motionEventObtainCancelEvent, i11);
            }
        }
        list.clear();
        if (motionEventObtainCancelEvent != null) {
            motionEventObtainCancelEvent.recycle();
        }
        return zPerformEvent;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.c();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.d(this, childAt);
            this.mChildDag.b(childAt);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i11) {
                    View childAt2 = getChildAt(i12);
                    if (resolvedLayoutParams.b(this, childAt, childAt2)) {
                        if (!this.mChildDag.d(childAt2)) {
                            this.mChildDag.b(childAt2);
                        }
                        this.mChildDag.a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.j());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void resetTouchBehaviors() {
        View view = this.mBehaviorTouchView;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                cVarF.H(this, this.mBehaviorTouchView, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    private static int resolveGravity(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    private static int resolveKeylineGravity(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    private void setInsetOffsetX(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f7411i;
        if (i12 != i11) {
            ViewCompat.Z(view, i11 - i12);
            fVar.f7411i = i11;
        }
    }

    private void setInsetOffsetY(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f7412j;
        if (i12 != i11) {
            ViewCompat.a0(view, i11 - i12);
            fVar.f7412j = i11;
        }
    }

    private void setupForInsets() {
        if (!ViewCompat.x(this)) {
            ViewCompat.E0(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        ViewCompat.E0(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        ArrayList<View> arrayListH = this.mChildDag.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < arrayListH.size(); i11++) {
            View view2 = arrayListH.get(i11);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z11 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left && rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                z11 = true;
            }
            return z11;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f7403a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > BitmapDescriptorFactory.HUE_RED) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f7403a.g(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (hasDependencies(getChildAt(i11))) {
                z11 = true;
                break;
            }
        }
        if (z11 != this.mNeedsPreDrawListener) {
            if (z11) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    void getChildRect(View view, boolean z11, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List<View> listI = this.mChildDag.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List<View> listG = this.mChildDag.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    void getDescendantRect(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i11, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(i11, rect, rect2, fVar, measuredWidth, measuredHeight);
        constrainChildRect(fVar, rect2, measuredWidth, measuredHeight);
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f7404b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f7404b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e11) {
                    Log.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e11);
                }
            }
            fVar.f7404b = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i11, int i12) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i11, i12);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    void offsetChildToAnchor(View view, int i11) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f7413k != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(fVar.f7413k, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(i11, rectAcquireTempRect, rectAcquireTempRect3, fVar, measuredWidth, measuredHeight);
            boolean z11 = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(fVar, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i12 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i13 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i12 != 0) {
                ViewCompat.Z(view, i12);
            }
            if (i13 != 0) {
                ViewCompat.a0(view, i13);
            }
            if (z11 && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.f7413k);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ViewCompat.x(this)) {
            ViewCompat.m0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void onChildViewsChanged(int i11) {
        int i12;
        c cVarF;
        boolean zL;
        int iA = ViewCompat.A(this);
        int size = this.mDependencySortedChildren.size();
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.mDependencySortedChildren.get(i13);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (fVar.f7414l == this.mDependencySortedChildren.get(i14)) {
                        offsetChildToAnchor(view, iA);
                    }
                }
                getChildRect(view, true, rectAcquireTempRect2);
                if (fVar.f7409g != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int iB = k.b(fVar.f7409g, iA);
                    int i15 = iB & 112;
                    if (i15 == 48) {
                        rectAcquireTempRect.top = Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i15 == 80) {
                        rectAcquireTempRect.bottom = Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i16 = iB & 7;
                    if (i16 == 3) {
                        rectAcquireTempRect.left = Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i16 == 5) {
                        rectAcquireTempRect.right = Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (fVar.f7410h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, rectAcquireTempRect, iA);
                }
                if (i11 != 2) {
                    getLastChildRect(view, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view, rectAcquireTempRect2);
                        for (i12 = i13 + 1; i12 < size; i12++) {
                            View view2 = this.mDependencySortedChildren.get(i12);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarF = fVar2.f();
                            if (cVarF == null && cVarF.i(this, view2, view)) {
                                if (i11 == 0 && fVar2.g()) {
                                    fVar2.k();
                                } else {
                                    if (i11 != 2) {
                                        zL = cVarF.l(this, view2, view);
                                    } else {
                                        cVarF.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i11 == 1) {
                                        fVar2.p(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i12 < size) {
                        View view3 = this.mDependencySortedChildren.get(i12);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarF = fVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
        if (iM > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors();
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        c cVarF;
        int iA = ViewCompat.A(this);
        int size = this.mDependencySortedChildren.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = this.mDependencySortedChildren.get(i15);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iA))) {
                onLayoutChild(view, iA);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f7413k;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i11);
            return;
        }
        int i12 = fVar.f7407e;
        if (i12 >= 0) {
            layoutChildWithKeyline(view, i12, i11);
        } else {
            layoutChild(view, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        View view;
        int i24;
        int i25;
        boolean zQ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iA = ViewCompat.A(coordinatorLayout);
        boolean z11 = iA == 1;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z12 = coordinatorLayout.mLastInsets != null && ViewCompat.x(coordinatorLayout);
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        while (i28 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i28);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i18 = size3;
                i14 = i28;
                i19 = paddingLeft;
                i16 = iA;
                suggestedMinimumWidth = i29;
                i24 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i31 = fVar.f7407e;
                if (i31 < 0 || mode == 0) {
                    i13 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i31);
                    int iB = k.b(resolveKeylineGravity(fVar.f7405c), iA) & 7;
                    i13 = suggestedMinimumHeight;
                    if ((iB != 3 || z11) && !(iB == 5 && z11)) {
                        if ((iB == 5 && !z11) || (iB == 3 && z11)) {
                            iMax = Math.max(0, keyline - paddingLeft);
                        }
                        if (z12 || ViewCompat.x(view2)) {
                            iMakeMeasureSpec = i11;
                            iMakeMeasureSpec2 = i12;
                        } else {
                            int iK = coordinatorLayout.mLastInsets.k() + coordinatorLayout.mLastInsets.l();
                            int iM = coordinatorLayout.mLastInsets.m() + coordinatorLayout.mLastInsets.j();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iK, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM, mode2);
                        }
                        cVarF = fVar.f();
                        if (cVarF != null) {
                            i18 = size3;
                            int i32 = iMakeMeasureSpec;
                            view = view2;
                            int i33 = i13;
                            i16 = iA;
                            i17 = i33;
                            i19 = paddingLeft;
                            i21 = i29;
                            i24 = paddingRight;
                            i25 = iCombineMeasuredStates;
                            int i34 = iMakeMeasureSpec2;
                            zQ = cVarF.q(this, view, i32, i15, i34, 0);
                            i23 = i32;
                            i22 = i34;
                            if (zQ) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i35 = i13;
                            i16 = iA;
                            i17 = i35;
                            i18 = size3;
                            i19 = paddingLeft;
                            i21 = i29;
                            i22 = iMakeMeasureSpec2;
                            i23 = iMakeMeasureSpec;
                            view = view2;
                            i24 = paddingRight;
                            i25 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.onMeasureChild(view3, i23, i15, i22, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - keyline);
                    }
                    int i36 = i28;
                    i15 = iMax;
                    i14 = i36;
                    if (z12) {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    } else {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    }
                    cVarF = fVar.f();
                    if (cVarF != null) {
                        i18 = size3;
                        int i37 = iMakeMeasureSpec;
                        view = view2;
                        int i38 = i13;
                        i16 = iA;
                        i17 = i38;
                        i19 = paddingLeft;
                        i21 = i29;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                        int i39 = iMakeMeasureSpec2;
                        zQ = cVarF.q(this, view, i37, i15, i39, 0);
                        i23 = i37;
                        i22 = i39;
                        if (zQ) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i310 = i13;
                        i16 = iA;
                        i17 = i310;
                        i18 = size3;
                        i19 = paddingLeft;
                        i21 = i29;
                        i22 = iMakeMeasureSpec2;
                        i23 = iMakeMeasureSpec;
                        view = view2;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view4, i23, i15, i22, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i14 = i28;
                i15 = 0;
                if (z12) {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                } else {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                }
                cVarF = fVar.f();
                if (cVarF != null) {
                    i18 = size3;
                    int i311 = iMakeMeasureSpec;
                    view = view2;
                    int i312 = i13;
                    i16 = iA;
                    i17 = i312;
                    i19 = paddingLeft;
                    i21 = i29;
                    i24 = paddingRight;
                    i25 = iCombineMeasuredStates;
                    int i313 = iMakeMeasureSpec2;
                    zQ = cVarF.q(this, view, i311, i15, i313, 0);
                    i23 = i311;
                    i22 = i313;
                    if (zQ) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i314 = i13;
                    i16 = iA;
                    i17 = i314;
                    i18 = size3;
                    i19 = paddingLeft;
                    i21 = i29;
                    i22 = iMakeMeasureSpec2;
                    i23 = iMakeMeasureSpec;
                    view = view2;
                    i24 = paddingRight;
                    i25 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view5, i23, i15, i22, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i28 = i14 + 1;
            paddingLeft = i19;
            paddingRight = i24;
            iA = i16;
            size3 = i18;
        }
        int i41 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i11, (-16777216) & i41), View.resolveSizeAndState(suggestedMinimumHeight, i12, i41 << 16));
    }

    public void onMeasureChild(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        c cVarF;
        View view2;
        float f13;
        float f14;
        boolean z12;
        int childCount = getChildCount();
        int i11 = 0;
        boolean zR = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f13 = f11;
                f14 = f12;
                z12 = z11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    z12 = z11;
                    zR |= cVarF.r(this, childAt, view2, f13, f14, z12);
                } else {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    z12 = z11;
                }
            }
            i11++;
            view = view2;
            f11 = f13;
            f12 = f14;
            z11 = z12;
        }
        if (zR) {
            onChildViewsChanged(1);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        c cVarF;
        View view2;
        float f13;
        float f14;
        int childCount = getChildCount();
        int i11 = 0;
        boolean zS = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f13 = f11;
                f14 = f12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    zS |= cVarF.s(this, childAt, view2, f13, f14);
                } else {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                }
            }
            i11++;
            view = view2;
            f11 = f13;
            f12 = f14;
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        onNestedPreScroll(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        onNestedScrollAccepted(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f7422c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c cVarF = getResolvedLayoutParams(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        hVar.f7422c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return onStartNestedScroll(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPerformIntercept;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.mBehaviorTouchView;
        boolean z11 = false;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            zPerformIntercept = cVarF != null ? cVarF.H(this, this.mBehaviorTouchView, motionEvent) : false;
        } else {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (actionMasked != 0 && zPerformIntercept) {
                z11 = true;
            }
        }
        if (this.mBehaviorTouchView == null || actionMasked == 3) {
            zPerformIntercept |= super.onTouchEvent(motionEvent);
        } else if (z11) {
            MotionEvent motionEventObtainCancelEvent = obtainCancelEvent(motionEvent);
            super.onTouchEvent(motionEventObtainCancelEvent);
            motionEventObtainCancelEvent.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return zPerformIntercept;
    }

    void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!z11 || this.mDisallowInterceptReset) {
            return;
        }
        if (this.mBehaviorTouchView == null) {
            cancelInterceptBehaviors();
        }
        resetTouchBehaviors();
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                l5.a.m(this.mStatusBarBackground, ViewCompat.A(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ViewCompat.g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? androidx.core.content.b.getDrawable(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z11) {
            return;
        }
        this.mStatusBarBackground.setVisible(z11, false);
    }

    final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (u5.c.a(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z11 = false;
        boolean z12 = windowInsetsCompat != null && windowInsetsCompat.m() > 0;
        this.mDrawStatusBarBackground = z12;
        if (!z12 && getBackground() == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatDispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g5.a.f67331a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        c cVarF;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i13) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i11, i12, iArr2, i13);
                    iMax = i11 > 0 ? Math.max(iMax, this.mBehaviorConsumed[0]) : Math.min(iMax, this.mBehaviorConsumed[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, this.mBehaviorConsumed[1]) : Math.min(iMax2, this.mBehaviorConsumed[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i11, i12, i13, i14, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        c cVarF;
        View view3;
        View view4;
        int i13;
        int i14;
        this.mNestedScrollingParentHelper.c(view, view2, i11, i12);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i12) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
                cVarF.z(this, childAt, view3, view4, i13, i14);
            } else {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
            }
            i15++;
            view = view3;
            view2 = view4;
            i11 = i13;
            i12 = i14;
        }
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i11, i12);
                    z11 |= zE;
                    fVar.r(i12, zE);
                } else {
                    fVar.r(i12, false);
                }
            }
        }
        return z11;
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(View view, int i11) {
        this.mNestedScrollingParentHelper.e(view, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i11);
                }
                fVar.l(i11);
                fVar.k();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i11);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.a<>();
        this.mTempList1 = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new z(this);
        if (i11 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5.c.f67333a, 0, g5.b.f67332a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5.c.f67333a, i11, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i11 == 0) {
            coordinatorLayout = this;
            context2 = context;
            ViewCompat.n0(coordinatorLayout, context2, g5.c.f67333a, attributeSet, typedArray, 0, g5.b.f67332a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            ViewCompat.n0(coordinatorLayout, context2, g5.c.f67333a, attributeSet, typedArray, i11, 0);
        }
        int resourceId = typedArray.getResourceId(g5.c.f67334b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f11 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr = coordinatorLayout.mKeylines;
                iArr[i12] = (int) (iArr[i12] * f11);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(g5.c.f67335c);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new e());
        if (ViewCompat.y(this) == 0) {
            ViewCompat.z0(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        c cVarF;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i15) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    if (i13 > 0) {
                        iMin = Math.max(i16, this.mBehaviorConsumed[0]);
                    } else {
                        iMin = Math.min(i16, this.mBehaviorConsumed[0]);
                    }
                    i16 = iMin;
                    if (i14 > 0) {
                        iMin2 = Math.max(i17, this.mBehaviorConsumed[1]);
                    } else {
                        iMin2 = Math.min(i17, this.mBehaviorConsumed[1]);
                    }
                    i17 = iMin2;
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i16;
        iArr[1] = iArr[1] + i17;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    protected static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray<Parcelable> f7422c;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i11 = parcel.readInt();
            int[] iArr = new int[i11];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f7422c = new SparseArray<>(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                this.f7422c.append(iArr[i12], parcelableArray[i12]);
            }
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            SparseArray<Parcelable> sparseArray = this.f7422c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = this.f7422c.keyAt(i12);
                parcelableArr[i12] = this.f7422c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f7403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f7408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7410h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f7411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f7412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f7413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f7414l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f7415m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f7416n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f7417o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f7418p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f7419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7420r;

        public f(int i11, int i12) {
            super(i11, i12);
            this.f7404b = false;
            this.f7405c = 0;
            this.f7406d = 0;
            this.f7407e = -1;
            this.f7408f = -1;
            this.f7409g = 0;
            this.f7410h = 0;
            this.f7419q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f7408f);
            this.f7413k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f7414l = null;
                    this.f7413k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f7408f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f7414l = null;
                this.f7413k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f7414l = null;
                    this.f7413k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f7414l = viewFindViewById;
        }

        private boolean s(View view, int i11) {
            int iB = k.b(((f) view.getLayoutParams()).f7409g, i11);
            return iB != 0 && (k.b(this.f7410h, i11) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f7413k.getId() != this.f7408f) {
                return false;
            }
            View view2 = this.f7413k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f7414l = null;
                    this.f7413k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f7414l = view2;
            return true;
        }

        boolean a() {
            return this.f7413k == null && this.f7408f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f7414l || s(view2, ViewCompat.A(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f7403a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f7403a == null) {
                this.f7415m = false;
            }
            return this.f7415m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f7408f == -1) {
                this.f7414l = null;
                this.f7413k = null;
                return null;
            }
            if (this.f7413k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f7413k;
        }

        public int e() {
            return this.f7408f;
        }

        public c f() {
            return this.f7403a;
        }

        boolean g() {
            return this.f7418p;
        }

        Rect h() {
            return this.f7419q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11 = this.f7415m;
            if (z11) {
                return true;
            }
            c cVar = this.f7403a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z11;
            this.f7415m = zE;
            return zE;
        }

        boolean j(int i11) {
            if (i11 == 0) {
                return this.f7416n;
            }
            if (i11 != 1) {
                return false;
            }
            return this.f7417o;
        }

        void k() {
            this.f7418p = false;
        }

        void l(int i11) {
            r(i11, false);
        }

        void m() {
            this.f7415m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f7403a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f7403a = cVar;
                this.f7420r = null;
                this.f7404b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z11) {
            this.f7418p = z11;
        }

        void q(Rect rect) {
            this.f7419q.set(rect);
        }

        void r(int i11, boolean z11) {
            if (i11 == 0) {
                this.f7416n = z11;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f7417o = z11;
            }
        }

        f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7404b = false;
            this.f7405c = 0;
            this.f7406d = 0;
            this.f7407e = -1;
            this.f7408f = -1;
            this.f7409g = 0;
            this.f7410h = 0;
            this.f7419q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5.c.f67336d);
            this.f7405c = typedArrayObtainStyledAttributes.getInteger(g5.c.f67337e, 0);
            this.f7408f = typedArrayObtainStyledAttributes.getResourceId(g5.c.f67338f, -1);
            this.f7406d = typedArrayObtainStyledAttributes.getInteger(g5.c.f67339g, 0);
            this.f7407e = typedArrayObtainStyledAttributes.getInteger(g5.c.f67343k, -1);
            this.f7409g = typedArrayObtainStyledAttributes.getInt(g5.c.f67342j, 0);
            this.f7410h = typedArrayObtainStyledAttributes.getInt(g5.c.f67341i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g5.c.f67340h);
            this.f7404b = zHasValue;
            if (zHasValue) {
                this.f7403a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(g5.c.f67340h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f7403a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f7404b = false;
            this.f7405c = 0;
            this.f7406d = 0;
            this.f7407e = -1;
            this.f7408f = -1;
            this.f7409g = 0;
            this.f7410h = 0;
            this.f7419q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7404b = false;
            this.f7405c = 0;
            this.f7406d = 0;
            this.f7407e = -1;
            this.f7408f = -1;
            this.f7409g = 0;
            this.f7410h = 0;
            this.f7419q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7404b = false;
            this.f7405c = 0;
            this.f7406d = 0;
            this.f7407e = -1;
            this.f7408f = -1;
            this.f7409g = 0;
            this.f7410h = 0;
            this.f7419q = new Rect();
        }
    }
}
