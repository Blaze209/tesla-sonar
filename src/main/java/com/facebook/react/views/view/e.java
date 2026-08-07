package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.m;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.k1;
import com.facebook.react.uimanager.o0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.z;
import com.facebook.react.w0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Set;
import so.n;
import so.p;

/* JADX INFO: loaded from: classes4.dex */
public class e extends ViewGroup implements mo.d, z, f0, mo.c, o0, e0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private boolean mBackfaceVisible;
    private b mChildrenLayoutChangeListener;
    private Set<Integer> mChildrenRemovedWhileTransitioning;
    private Rect mClippingRect;
    private k1 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private volatile boolean mInSubviewClippingLoop;
    private boolean mNeedsOffscreenAlphaCompositing;
    private mo.b mOnInterceptTouchEventListener;
    private p mOverflow;
    private final Rect mOverflowInset;
    private x mPointerEvents;
    private int mRecycleCount;
    private boolean mRemoveClippedSubviews;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23869a;

        static {
            int[] iArr = new int[p.values().length];
            f23869a = iArr;
            try {
                iArr[p.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23869a[p.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23869a[p.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f23870a;

        public void a() {
            this.f23870a = null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            e eVar = this.f23870a;
            if (eVar == null || !eVar.getRemoveClippedSubviews()) {
                return;
            }
            this.f23870a.updateSubviewClipStatus(view);
        }

        private b(e eVar) {
            this.f23870a = eVar;
        }
    }

    public e(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        this.mRecycleCount = 0;
        this.mPointerEvents = x.AUTO;
        initView();
    }

    private void addInArray(View view, int i11) {
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i11 == i12) {
            if (length == i12) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i13 = this.mAllChildrenCount;
            this.mAllChildrenCount = i13 + 1;
            viewArr[i13] = view;
            return;
        }
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index=" + i11 + " count=" + i12);
        }
        if (length == i12) {
            View[] viewArr3 = new View[length + 12];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i11);
            System.arraycopy(viewArr, i11, this.mAllChildren, i11 + 1, i12 - i11);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i11, viewArr, i11 + 1, i12 - i11);
        }
        viewArr[i11] = view;
        this.mAllChildrenCount++;
    }

    private void checkViewClippingTag(View view, Boolean bool) {
        if (this.mInSubviewClippingLoop) {
            Object tag = view.getTag(m.H);
            if (!bool.equals(tag)) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_ON_VIEW_REMOVED, new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + bool));
            }
        }
        if (this.mRemoveClippedSubviews) {
            view.setTag(m.H, bool);
        }
    }

    private boolean customDrawOrderDisabled() {
        return getId() != -1 && oo.a.a(getId()) == 2;
    }

    private k1 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new k1(this);
        }
        return this.mDrawingOrderHelper;
    }

    private int indexOfChildInAllChildren(View view) {
        int i11 = this.mAllChildrenCount;
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        for (int i12 = 0; i12 < i11; i12++) {
            if (viewArr[i12] == view) {
                return i12;
            }
        }
        return -1;
    }

    private void initView() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mInSubviewClippingLoop = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = p.VISIBLE;
        this.mPointerEvents = x.AUTO;
        this.mChildrenLayoutChangeListener = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisible = true;
        this.mChildrenRemovedWhileTransitioning = null;
    }

    private boolean isChildRemovedWhileTransitioning(View view) {
        Set<Integer> set = this.mChildrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(view.getId()));
    }

    private boolean isViewClipped(View view, Integer num) {
        Object tag = view.getTag(m.H);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zIsChildRemovedWhileTransitioning = isChildRemovedWhileTransitioning(view);
        if (num != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("View missing clipping tag: index=");
            sb2.append(num);
            sb2.append(" parentNull=");
            sb2.append(parent == null);
            sb2.append(" parentThis=");
            sb2.append(parent == this);
            sb2.append(" transitioning=");
            sb2.append(zIsChildRemovedWhileTransitioning);
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_IS_VIEW_CLIPPED, new ReactNoCrashSoftException(sb2.toString()));
        }
        if (parent == null || zIsChildRemovedWhileTransitioning) {
            return true;
        }
        gn.a.a(parent == this);
        return false;
    }

    private void removeFromArray(int i11) {
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        if (i11 == i12 - 1) {
            int i13 = i12 - 1;
            this.mAllChildrenCount = i13;
            viewArr[i13] = null;
        } else {
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i11 + 1, viewArr, i11, (i12 - i11) - 1);
            int i14 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i14;
            viewArr[i14] = null;
        }
    }

    private static void setViewClipped(View view, boolean z11) {
        view.setTag(m.H, Boolean.valueOf(z11));
    }

    private void trackChildViewTransition(int i11) {
        if (this.mChildrenRemovedWhileTransitioning == null) {
            this.mChildrenRemovedWhileTransitioning = new HashSet();
        }
        this.mChildrenRemovedWhileTransitioning.add(Integer.valueOf(i11));
    }

    private void updateClippingToRect(Rect rect) {
        gn.a.c(this.mAllChildren);
        this.mInSubviewClippingLoop = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            try {
                updateSubviewClipStatus(rect, i12, i11);
                if (isViewClipped(this.mAllChildren[i12], Integer.valueOf(i12))) {
                    i11++;
                }
            } catch (IndexOutOfBoundsException e11) {
                HashSet hashSet = new HashSet();
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    i13 += isViewClipped(this.mAllChildren[i14], null) ? 1 : 0;
                    hashSet.add(this.mAllChildren[i14]);
                }
                throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.mAllChildrenCount + " recycleCount=" + this.mRecycleCount + " realClippedSoFar=" + i13 + " uniqueViewsCount=" + hashSet.size(), e11);
            }
        }
        this.mInSubviewClippingLoop = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateSubviewClipStatus(Rect rect, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        GLSurfaceView gLSurfaceView = ((View[]) gn.a.c(this.mAllChildren))[i11];
        boolean zIntersects = rect.intersects(gLSurfaceView.getLeft(), gLSurfaceView.getTop(), gLSurfaceView.getRight(), gLSurfaceView.getBottom());
        Animation animation = gLSurfaceView.getAnimation();
        boolean z11 = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && !isViewClipped(gLSurfaceView, Integer.valueOf(i11)) && !z11) {
            setViewClipped(gLSurfaceView, true);
            removeViewInLayout(gLSurfaceView);
        } else if (zIntersects && isViewClipped(gLSurfaceView, Integer.valueOf(i11))) {
            int i13 = i11 - i12;
            gn.a.a(i13 >= 0);
            setViewClipped(gLSurfaceView, false);
            addViewInLayout(gLSurfaceView, i13, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (gLSurfaceView instanceof z) {
            z zVar = (z) gLSurfaceView;
            if (zVar.getRemoveClippedSubviews()) {
                zVar.updateClippingRect();
            }
        }
    }

    void addViewWithSubviewClippingEnabled(View view, int i11) {
        addViewWithSubviewClippingEnabled(view, i11, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.mOverflow != p.VISIBLE || getTag(m.f22664n) != null) {
            com.facebook.react.uimanager.a.a(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (x.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e11) {
            qk.a.n("ReactNative", "NullPointerException when executing dispatchProvideStructure", e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT < 29 || oo.a.c(this) != 2 || !com.facebook.react.uimanager.c.a(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        Canvas canvas2;
        BlendMode blendModeA;
        boolean z11 = view.getElevation() > BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            com.facebook.react.views.view.a.a(canvas, true);
        }
        if (Build.VERSION.SDK_INT >= 29 && oo.a.c(this) == 2 && com.facebook.react.uimanager.c.a(this)) {
            blendModeA = w0.a(view.getTag(m.f22668r));
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                Rect overflowInset = getOverflowInset();
                float f11 = overflowInset.left;
                float f12 = overflowInset.top;
                float width = getWidth() + (-overflowInset.right);
                float height = getHeight() + (-overflowInset.bottom);
                canvas2 = canvas;
                canvas2.saveLayer(f11, f12, width, height, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeA = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j11);
        if (blendModeA != null) {
            canvas2.restore();
        }
        if (z11) {
            com.facebook.react.views.view.a.a(canvas2, false);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        Set<Integer> set = this.mChildrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    View getChildAtWithSubviewClippingEnabled(int i11) {
        if (i11 < 0 || i11 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) gn.a.c(this.mAllChildren))[i11];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().a(i11, i12) : i12;
    }

    @Override // com.facebook.react.uimanager.z
    public void getClippingRect(Rect rect) {
        rect.set((Rect) gn.a.f(this.mClippingRect, "Fix in Kotlin"));
    }

    @Override // mo.c
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    @Override // com.facebook.react.uimanager.d0
    public String getOverflow() {
        int i11 = a.f23869a[this.mOverflow.ordinal()];
        if (i11 == 1) {
            return "hidden";
        }
        if (i11 == 2) {
            return "scroll";
        }
        if (i11 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.e0
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.f0
    public x getPointerEvents() {
        return this.mPointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.o0
    public int getZIndexMappedChildIndex(int i11) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || !getDrawingOrderHelper().d()) ? i11 : getDrawingOrderHelper().a(getChildCount(), i11);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return ReactFeatureFlags.dispatchPointerEvents ? x.canBeTouchTarget(this.mPointerEvents) : super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mo.b bVar = this.mOnInterceptTouchEventListener;
        if ((bVar == null || !bVar.a(this, motionEvent)) && x.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        r.a(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return x.canBeTouchTarget(this.mPointerEvents);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(view, Boolean.FALSE);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().b(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(view, Boolean.TRUE);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().c(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        }
        if (view.getParent() != null) {
            trackChildViewTransition(view.getId());
        }
        super.onViewRemoved(view);
    }

    void recycleView() {
        b bVar;
        this.mRecycleCount++;
        if (this.mAllChildren != null && (bVar = this.mChildrenLayoutChangeListener) != null) {
            bVar.a();
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
        }
        initView();
        this.mOverflowInset.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    void removeAllViewsWithSubviewClippingEnabled() {
        gn.a.a(this.mRemoveClippedSubviews);
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
            viewArr[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        gn.a.a(this.mRemoveClippedSubviews);
        gn.a.c(this.mClippingRect);
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (!isViewClipped(viewArr[iIndexOfChildInAllChildren], Integer.valueOf(iIndexOfChildInAllChildren))) {
            int i11 = 0;
            for (int i12 = 0; i12 < iIndexOfChildInAllChildren; i12++) {
                if (isViewClipped(viewArr[i12], Integer.valueOf(i12))) {
                    i11++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i11, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    void resetPointerEvents() {
        this.mPointerEvents = x.AUTO;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisible = "visible".equals(str);
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisible) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        com.facebook.react.uimanager.a.o(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, Integer num) {
        com.facebook.react.uimanager.a.q(this, n.values()[i11], num);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f11) {
        setBorderRadius(f11, so.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        com.facebook.react.uimanager.a.s(this, str == null ? null : so.f.fromString(str));
    }

    public void setBorderWidth(int i11, float f11) {
        com.facebook.react.uimanager.a.t(this, n.values()[i11], Float.valueOf(w.f(f11)));
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z11) {
        this.mNeedsOffscreenAlphaCompositing = z11;
    }

    @Override // mo.d
    public void setOnInterceptTouchEventListener(mo.b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    public void setOpacityIfPossible(float f11) {
        this.mBackfaceOpacity = f11;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = p.VISIBLE;
        } else {
            p pVarFromString = p.fromString(str);
            if (pVarFromString == null) {
                pVarFromString = p.VISIBLE;
            }
            this.mOverflow = pVarFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.e0
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        if (com.facebook.react.uimanager.c.a(this)) {
            Rect rect = this.mOverflowInset;
            if (rect.left != i11 || rect.top != i12 || rect.right != i13 || rect.bottom != i14) {
                invalidate();
            }
        }
        this.mOverflowInset.set(i11, i12, i13, i14);
    }

    public void setPointerEvents(x xVar) {
        this.mPointerEvents = xVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z11;
        this.mChildrenRemovedWhileTransitioning = null;
        if (!z11) {
            gn.a.c(this.mClippingRect);
            gn.a.c(this.mAllChildren);
            gn.a.c(this.mChildrenLayoutChangeListener);
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
            return;
        }
        Rect rect = new Rect();
        this.mClippingRect = rect;
        a0.a(this, rect);
        int childCount = getChildCount();
        this.mAllChildrenCount = childCount;
        this.mAllChildren = new View[Math.max(12, childCount)];
        this.mChildrenLayoutChangeListener = new b();
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            View childAt = getChildAt(i12);
            this.mAllChildren[i12] = childAt;
            childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            setViewClipped(childAt, false);
        }
        updateClippingRect();
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        com.facebook.react.uimanager.a.w(this, drawable);
    }

    void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.facebook.react.uimanager.z
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            gn.a.c(this.mClippingRect);
            gn.a.c(this.mAllChildren);
            a0.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.o0
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().e();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        invalidate();
    }

    void addViewWithSubviewClippingEnabled(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        gn.a.a(this.mRemoveClippedSubviews);
        setViewClipped(view, true);
        addInArray(view, i11);
        Rect rect = (Rect) gn.a.c(this.mClippingRect);
        View[] viewArr = (View[]) gn.a.c(this.mAllChildren);
        this.mInSubviewClippingLoop = true;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (isViewClipped(viewArr[i13], Integer.valueOf(i13))) {
                i12++;
            }
        }
        updateSubviewClipStatus(rect, i11, i12);
        this.mInSubviewClippingLoop = false;
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f11, int i11) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, com.facebook.react.uimanager.p.POINT));
    }

    public void setBorderRadius(so.d dVar, LengthPercentage lengthPercentage) {
        com.facebook.react.uimanager.a.r(this, dVar, lengthPercentage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        gn.a.c(this.mClippingRect);
        gn.a.c(this.mAllChildren);
        if (this.mClippingRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != (!isViewClipped(view, null))) {
            this.mInSubviewClippingLoop = true;
            int i11 = 0;
            for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
                View view2 = this.mAllChildren[i12];
                if (view2 == view) {
                    updateSubviewClipStatus(this.mClippingRect, i12, i11);
                    break;
                } else {
                    if (isViewClipped(view2, Integer.valueOf(i12))) {
                        i11++;
                    }
                }
            }
            this.mInSubviewClippingLoop = false;
        }
    }
}
