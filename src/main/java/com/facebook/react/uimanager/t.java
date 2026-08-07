package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class t {
    private static final String TAG = "t";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final mo.a mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final ro.e mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final p1 mViewManagers;

    class a implements ro.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f23384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f23386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f23387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23388e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i11) {
            this.f23384a = viewGroupManager;
            this.f23385b = viewGroup;
            this.f23386c = view;
            this.f23387d = set;
            this.f23388e = i11;
        }

        @Override // ro.f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f23384a.removeView(this.f23385b, this.f23386c);
            t.this.dropView(this.f23386c);
            this.f23387d.remove(Integer.valueOf(this.f23386c.getId()));
            if (this.f23387d.isEmpty()) {
                t.this.mPendingDeletionsForTag.remove(Integer.valueOf(this.f23388e));
            }
        }
    }

    public t(p1 p1Var) {
        this(p1Var, new RootViewManager());
    }

    private boolean arrayContains(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        this.mBoundingBox.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, j1[] j1VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i11 = 0; viewGroupManager.getChildAt(viewGroup, i11) != null; i11 += 16) {
                int i12 = 0;
                while (true) {
                    int i13 = i11 + i12;
                    if (viewGroupManager.getChildAt(viewGroup, i13) == null || i12 >= 16) {
                        break;
                    }
                    sb2.append(viewGroupManager.getChildAt(viewGroup, i13).getId() + ",");
                    i12++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i14 = 0; i14 < iArr.length; i14 += 16) {
                int i15 = 0;
                while (true) {
                    int i16 = i14 + i15;
                    if (i16 >= iArr.length || i15 >= 16) {
                        break;
                    }
                    sb2.append(iArr[i16] + ",");
                    i15++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (j1VarArr != null) {
            sb2.append("  viewsToAdd(" + j1VarArr.length + "): [\n");
            for (int i17 = 0; i17 < j1VarArr.length; i17 += 16) {
                int i18 = 0;
                while (true) {
                    int i19 = i17 + i18;
                    if (i19 >= j1VarArr.length || i18 >= 16) {
                        break;
                    }
                    sb2.append("[" + j1VarArr[i19].f23319b + "," + j1VarArr[i19].f23318a + "],");
                    i18++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i21 = 0; i21 < iArr2.length; i21 += 16) {
                int i22 = 0;
                while (true) {
                    int i23 = i21 + i22;
                    if (i23 >= iArr2.length || i22 >= 16) {
                        break;
                    }
                    sb2.append(iArr2[i23] + ",");
                    i22++;
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        j1[] j1VarArr = new j1[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            j1VarArr[i11] = new j1(readableArray.getInt(i11), i11);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, j1VarArr, null);
    }

    private Set<Integer> getPendingDeletionsForTag(int i11) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i11))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i11), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i11));
    }

    private v0 getReactContextForView(int i11) {
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            return (v0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i11);
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void addRootView(int i11, View view) {
        addRootViewGroup(i11, view);
    }

    protected final synchronized void addRootViewGroup(int i11, View view) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i11), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                qk.a.m(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i11, view);
            this.mTagsToViewManagers.put(i11, this.mRootViewManager);
            this.mRootTags.put(i11, true);
            view.setId(i11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(v0 v0Var, int i11, String str, k0 k0Var) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.e(TAG, "createView[%d]: %s %s", Integer.valueOf(i11), str, k0Var != null ? k0Var.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ep.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i11).b("className", str).c();
            try {
                ViewManager viewManagerC = this.mViewManagers.c(str);
                this.mTagsToViews.put(i11, viewManagerC.createView(i11, v0Var, k0Var, null, this.mJSResponderHandler));
                this.mTagsToViewManagers.put(i11, viewManagerC);
                ep.a.i(0L);
            } catch (Throwable th2) {
                ep.a.i(0L);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.e(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i11), Integer.valueOf(i12), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i11);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i11 + "] and command " + i12);
            }
            resolveViewManager(i11).receiveCommand(view, i12, readableArray);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void dropView(View view) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.c(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        qk.a.m(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int findTargetTagForTouch(int i11, float f11, float f12) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                qk.a.e(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i11), Float.valueOf(f11), Float.valueOf(f12));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i11);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return w0.d(f11, f12, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i11) {
        Long l11;
        View view = this.mTagsToViews.get(i11);
        if (view == null) {
            throw new IllegalViewOperationException("Unable to find view for tag: " + i11);
        }
        l11 = (Long) view.getTag(com.facebook.react.m.I);
        if (l11 == null) {
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i11);
        }
        return l11.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i11, int[] iArr, j1[] j1VarArr, int[] iArr2) throws Throwable {
        Throwable th2;
        int i12;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        qk.a.f(TAG, "createView[%d]: %s %s %s", Integer.valueOf(i11), iArr != null ? iArr.toString() : "<null>", j1VarArr != null ? j1VarArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                Set<Integer> pendingDeletionsForTag = getPendingDeletionsForTag(i11);
                ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i11);
                ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i11);
                if (viewGroup == null) {
                    throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i11 + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i13 = iArr[length];
                        if (i13 < 0) {
                            throw new IllegalViewOperationException("Trying to remove a negative view index:" + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                        }
                        if (viewGroupManager.getChildAt(viewGroup, i13) == null) {
                            if (this.mRootTags.get(i11) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                return;
                            }
                            throw new IllegalViewOperationException("Trying to remove a view index above child count " + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                        }
                        if (i13 >= childCount) {
                            throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i13);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i13);
                        }
                        length--;
                        childCount = i13;
                    }
                }
                if (iArr2 != null) {
                    int i14 = 0;
                    while (i14 < iArr2.length) {
                        int i15 = iArr2[i14];
                        View view = this.mTagsToViews.get(i15);
                        if (view == null) {
                            throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i15 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                        }
                        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                            pendingDeletionsForTag.add(Integer.valueOf(i15));
                            i12 = i11;
                            this.mLayoutAnimator.deleteView(view, new a(viewGroupManager, viewGroup, view, pendingDeletionsForTag, i12));
                        } else {
                            i12 = i11;
                            dropView(view);
                        }
                        i14++;
                        i11 = i12;
                    }
                }
                int i16 = i11;
                if (j1VarArr != null) {
                    for (j1 j1Var : j1VarArr) {
                        View view2 = this.mTagsToViews.get(j1Var.f23318a);
                        if (view2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + j1Var.f23318a + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, j1VarArr, iArr2));
                        }
                        int i17 = j1Var.f23319b;
                        if (!pendingDeletionsForTag.isEmpty()) {
                            i17 = 0;
                            int i18 = 0;
                            while (i17 < viewGroup.getChildCount() && i18 != j1Var.f23319b) {
                                if (!pendingDeletionsForTag.contains(Integer.valueOf(viewGroup.getChildAt(i17).getId()))) {
                                    i18++;
                                }
                                i17++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i17);
                    }
                }
                if (pendingDeletionsForTag.isEmpty()) {
                    this.mPendingDeletionsForTag.remove(Integer.valueOf(i16));
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    public synchronized void measure(int i11, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.c(TAG, "measure[%d]", Integer.valueOf(i11));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i11);
            if (view == null) {
                throw new NoSuchNativeViewException("No native view for " + i11 + " currently exists");
            }
            View view2 = (View) r0.a(view);
            if (view2 == null) {
                throw new NoSuchNativeViewException("Native view " + i11 + " is no longer on screen");
            }
            computeBoundingBox(view2, iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            computeBoundingBox(view, iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void measureInWindow(int i11, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i11));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i11);
            if (view == null) {
                throw new NoSuchNativeViewException("No native view for " + i11 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void removeRootView(int i11) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.c(TAG, "removeRootView[%d]", Integer.valueOf(i11));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i11)) {
                SoftAssertions.assertUnreachable("View with tag " + i11 + " is not registered as a root view");
            }
            dropView(this.mTagsToViews.get(i11));
            this.mRootTags.delete(i11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized View resolveView(int i11) {
        View view;
        view = this.mTagsToViews.get(i11);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i11 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i11) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i11);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i11 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i11, int i12) {
        View view = this.mTagsToViews.get(i11);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i11);
        }
        view.sendAccessibilityEvent(i12);
    }

    public synchronized void setChildren(int i11, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i11);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i11);
            for (int i12 = 0; i12 < readableArray.size(); i12++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i12));
                if (view == null) {
                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i12) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
                }
                viewGroupManager.addView(viewGroup, view, i12);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i11, int i12, boolean z11) {
        try {
            if (!z11) {
                this.mJSResponderHandler.d(i12, null);
                return;
            }
            View view = this.mTagsToViews.get(i11);
            if (i12 != i11 && (view instanceof ViewParent)) {
                this.mJSResponderHandler.d(i12, (ViewParent) view);
                return;
            }
            if (this.mRootTags.get(i11)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i11 + " that is a root view");
            }
            this.mJSResponderHandler.d(i12, view.getParent());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setLayoutAnimationEnabled(boolean z11) {
        this.mLayoutAnimationEnabled = z11;
    }

    public synchronized void updateInstanceHandle(int i11, long j11) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i11), j11);
        } catch (IllegalViewOperationException e11) {
            qk.a.n(TAG, "Unable to update properties for view tag " + i11, e11);
        }
    }

    @Deprecated
    public void updateLayout(int i11, int i12, int i13, int i14, int i15) throws Throwable {
        updateLayout(i11, i11, i12, i13, i14, i15, com.facebook.yoga.h.INHERIT);
    }

    public synchronized void updateProperties(int i11, k0 k0Var) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i11), k0Var.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager viewManagerResolveViewManager = resolveViewManager(i11);
                View viewResolveView = resolveView(i11);
                if (k0Var != null) {
                    viewManagerResolveViewManager.updateProperties(viewResolveView, k0Var);
                }
            } catch (IllegalViewOperationException e11) {
                qk.a.n(TAG, "Unable to update properties for view tag " + i11, e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void updateViewExtraData(int i11, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i11), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i11).updateExtraData(resolveView(i11), obj);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t(p1 p1Var, RootViewManager rootViewManager) {
        ln.a aVar = ln.a.f90481a;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new mo.a();
        this.mLayoutAnimator = new ro.e();
        this.mBoundingBox = new RectF();
        this.mViewManagers = p1Var;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public synchronized void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16, com.facebook.yoga.h hVar) throws Throwable {
        Throwable th2;
        Throwable th3;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        qk.a.h(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                ep.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i11).a("tag", i12).c();
                try {
                    View viewResolveView = resolveView(i12);
                    viewResolveView.setLayoutDirection(l.a(hVar));
                    viewResolveView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                    ViewParent parent = viewResolveView.getParent();
                    if (parent instanceof q0) {
                        try {
                            parent.requestLayout();
                        } catch (Throwable th5) {
                            th3 = th5;
                            ep.a.i(0L);
                            throw th3;
                        }
                    }
                    if (this.mRootTags.get(i11)) {
                        try {
                            updateLayout(viewResolveView, i13, i14, i15, i16);
                        } catch (Throwable th6) {
                            th = th6;
                            th3 = th;
                            ep.a.i(0L);
                            throw th3;
                        }
                    } else {
                        NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i11);
                        if (!(nativeModule instanceof i)) {
                            throw new IllegalViewOperationException("Trying to use view with tag " + i11 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        i iVar = (i) nativeModule;
                        if (iVar != null && !iVar.needsCustomLayoutForChildren()) {
                            updateLayout(viewResolveView, i13, i14, i15, i16);
                        }
                    }
                    ep.a.i(0L);
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    private void updateInstanceHandle(View view, long j11) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(com.facebook.react.m.I, Long.valueOf(j11));
    }

    public synchronized void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                qk.a.e(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i11), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i11);
            if (view != null) {
                resolveViewManager(i11).receiveCommand(view, str, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i11 + "] and command " + str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void updateLayout(View view, int i11, int i12, int i13, int i14) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i11, i12, i13, i14);
        } else {
            view.layout(i11, i12, i11 + i13, i12 + i14);
        }
    }
}
