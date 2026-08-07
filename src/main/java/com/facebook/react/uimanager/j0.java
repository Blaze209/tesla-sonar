package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class j0 implements i0<j0> {
    private static final com.facebook.yoga.c sYogaConfig = n0.f23343a.b();
    private ArrayList<j0> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private j0 mLayoutParent;
    private ArrayList<j0> mNativeChildren;
    private j0 mNativeParent;
    private final float[] mPadding;
    private j0 mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private v0 mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private com.facebook.yoga.r mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final t0 mDefaultPadding = new t0(BitmapDescriptorFactory.HUE_RED);

    public j0() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        com.facebook.yoga.r rVarB = w1.b().b();
        rVarB = rVarB == null ? com.facebook.yoga.s.a(sYogaConfig) : rVarB;
        this.mYogaNode = rVarB;
        rVarB.z(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).getHierarchyInfoWithIndentation(sb2, i11 + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        s nativeKind = getNativeKind();
        if (nativeKind == s.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == s.LEAF) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    private void updateNativeChildrenCountInParent(int i11) {
        if (getNativeKind() != s.PARENT) {
            for (j0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i11;
                if (parent.getNativeKind() == s.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void updatePadding() {
        for (int i11 = 0; i11 <= 8; i11++) {
            if (i11 == 0 || i11 == 2 || i11 == 4 || i11 == 5) {
                if (com.facebook.yoga.g.a(this.mPadding[i11]) && com.facebook.yoga.g.a(this.mPadding[6]) && com.facebook.yoga.g.a(this.mPadding[8])) {
                    this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mDefaultPadding.b(i11));
                } else if (this.mPaddingIsPercent[i11]) {
                    this.mYogaNode.e0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
                } else {
                    this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
                }
            } else if (i11 == 1 || i11 == 3) {
                if (com.facebook.yoga.g.a(this.mPadding[i11]) && com.facebook.yoga.g.a(this.mPadding[7]) && com.facebook.yoga.g.a(this.mPadding[8])) {
                    this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mDefaultPadding.b(i11));
                } else if (this.mPaddingIsPercent[i11]) {
                    this.mYogaNode.e0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
                } else {
                    this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
                }
            } else if (com.facebook.yoga.g.a(this.mPadding[i11])) {
                this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mDefaultPadding.b(i11));
            } else if (this.mPaddingIsPercent[i11]) {
                this.mYogaNode.e0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
            } else {
                this.mYogaNode.d0(com.facebook.yoga.j.fromInt(i11), this.mPadding[i11]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.i0
    public Iterable<? extends i0> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.i0
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.c();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public void dispatchUpdates(float f11, float f12, h1 h1Var, u uVar) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(h1Var);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f13 = f11 + layoutX;
            int iRound = Math.round(f13);
            float f14 = f12 + layoutY;
            int iRound2 = Math.round(f14);
            int iRound3 = Math.round(f13 + getLayoutWidth());
            int iRound4 = Math.round(f14 + getLayoutHeight());
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            int i11 = iRound3 - iRound;
            int i12 = iRound4 - iRound2;
            boolean z11 = (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i11 == this.mScreenWidth && i12 == this.mScreenHeight) ? false : true;
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = i11;
            this.mScreenHeight = i12;
            if (z11) {
                if (uVar != null) {
                    uVar.l(this);
                } else {
                    h1Var.P(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public boolean dispatchUpdatesWillChangeLayout(float f11, float f12) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f13 = f11 + layoutX;
        int iRound = Math.round(f13);
        float f14 = f12 + layoutY;
        int iRound2 = Math.round(f14);
        return (Math.round(layoutX) == this.mScreenX && Math.round(layoutY) == this.mScreenY && Math.round(f13 + getLayoutWidth()) - iRound == this.mScreenWidth && Math.round(f14 + getLayoutHeight()) - iRound2 == this.mScreenHeight) ? false : true;
    }

    @Override // com.facebook.react.uimanager.i0
    public void dispose() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.s();
            w1.b().a(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public final int getChildCount() {
        ArrayList<j0> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public float getFlex() {
        return this.mYogaNode.d();
    }

    @Override // com.facebook.react.uimanager.i0
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.i0
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.mYogaNode.f();
    }

    @Override // com.facebook.react.uimanager.i0
    public final float getLayoutHeight() {
        return this.mYogaNode.g();
    }

    @Override // com.facebook.react.uimanager.i0
    public final float getLayoutWidth() {
        return this.mYogaNode.i();
    }

    @Override // com.facebook.react.uimanager.i0
    public final float getLayoutX() {
        return this.mYogaNode.j();
    }

    @Override // com.facebook.react.uimanager.i0
    public final float getLayoutY() {
        return this.mYogaNode.k();
    }

    @Override // com.facebook.react.uimanager.i0
    public final int getNativeChildCount() {
        ArrayList<j0> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.i0
    public s getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return s.NONE;
        }
        return hoistNativeChildren() ? s.LEAF : s.PARENT;
    }

    public final float getPadding(int i11) {
        return this.mYogaNode.h(com.facebook.yoga.j.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.i0
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.i0
    public final int getRootTag() {
        gn.a.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.i0
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.i0
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.i0
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.i0
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.i0
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.e();
    }

    public final YogaValue getStylePadding(int i11) {
        return this.mYogaNode.l(com.facebook.yoga.j.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.i0
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.m();
    }

    @Override // com.facebook.react.uimanager.i0
    public final v0 getThemedContext() {
        return (v0) gn.a.c(this.mThemedContext);
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.i0
    public final String getViewClass() {
        return (String) gn.a.c(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.i0
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public final boolean hasNewLayout() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.n();
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.i0
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    public boolean hoistNativeChildren() {
        return false;
    }

    public final boolean isDirty() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.o();
    }

    @Override // com.facebook.react.uimanager.i0
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.p();
    }

    @Override // com.facebook.react.uimanager.i0
    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.q();
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        j0 parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.i0
    public void onBeforeLayout(u uVar) {
    }

    public void onCollectExtraUpdates(h1 h1Var) {
    }

    @Override // com.facebook.react.uimanager.i0
    public final void removeAllNativeChildren() {
        ArrayList<j0> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int totalNativeNodeContributionToParent = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.r(childCount);
            }
            j0 childAt = getChildAt(childCount);
            childAt.mParent = null;
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) gn.a.c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
    }

    public void setAlignContent(com.facebook.yoga.a aVar) {
        this.mYogaNode.t(aVar);
    }

    public void setAlignItems(com.facebook.yoga.a aVar) {
        this.mYogaNode.u(aVar);
    }

    public void setAlignSelf(com.facebook.yoga.a aVar) {
        this.mYogaNode.v(aVar);
    }

    public void setBaselineFunction(com.facebook.yoga.b bVar) {
        this.mYogaNode.x(bVar);
    }

    public void setBorder(int i11, float f11) {
        this.mYogaNode.y(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void setColumnGap(float f11) {
        this.mYogaNode.J(com.facebook.yoga.m.COLUMN, f11);
    }

    public void setColumnGapPercent(float f11) {
        this.mYogaNode.K(com.facebook.yoga.m.COLUMN, f11);
    }

    public void setDefaultPadding(int i11, float f11) {
        this.mDefaultPadding.c(i11, f11);
        updatePadding();
    }

    public void setDisplay(com.facebook.yoga.i iVar) {
        this.mYogaNode.B(iVar);
    }

    public void setFlex(float f11) {
        this.mYogaNode.C(f11);
    }

    public void setFlexBasis(float f11) {
        this.mYogaNode.D(f11);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.E();
    }

    public void setFlexBasisPercent(float f11) {
        this.mYogaNode.F(f11);
    }

    public void setFlexDirection(com.facebook.yoga.l lVar) {
        this.mYogaNode.G(lVar);
    }

    public void setFlexGrow(float f11) {
        this.mYogaNode.H(f11);
    }

    public void setFlexShrink(float f11) {
        this.mYogaNode.I(f11);
    }

    public void setFlexWrap(com.facebook.yoga.x xVar) {
        this.mYogaNode.l0(xVar);
    }

    public void setGap(float f11) {
        this.mYogaNode.J(com.facebook.yoga.m.ALL, f11);
    }

    public void setGapPercent(float f11) {
        this.mYogaNode.J(com.facebook.yoga.m.ALL, f11);
    }

    @Override // com.facebook.react.uimanager.i0
    public final void setIsLayoutOnly(boolean z11) {
        gn.a.b(getParent() == null, "Must remove from no opt parent first");
        gn.a.b(this.mNativeParent == null, "Must remove from native parent first");
        gn.a.b(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z11;
    }

    public void setJustifyContent(com.facebook.yoga.n nVar) {
        this.mYogaNode.O(nVar);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setLayoutDirection(com.facebook.yoga.h hVar) {
        this.mYogaNode.A(hVar);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setLocalData(Object obj) {
    }

    public void setMargin(int i11, float f11) {
        this.mYogaNode.P(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void setMarginAuto(int i11) {
        this.mYogaNode.Q(com.facebook.yoga.j.fromInt(i11));
    }

    public void setMarginPercent(int i11, float f11) {
        this.mYogaNode.R(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void setMeasureFunction(com.facebook.yoga.o oVar) {
        this.mYogaNode.X(oVar);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setMeasureSpecs(int i11, int i12) {
        this.mWidthMeasureSpec = Integer.valueOf(i11);
        this.mHeightMeasureSpec = Integer.valueOf(i12);
    }

    public void setOverflow(com.facebook.yoga.u uVar) {
        this.mYogaNode.c0(uVar);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setPadding(int i11, float f11) {
        this.mPadding[i11] = f11;
        this.mPaddingIsPercent[i11] = false;
        updatePadding();
    }

    public void setPaddingPercent(int i11, float f11) {
        this.mPadding[i11] = f11;
        this.mPaddingIsPercent[i11] = !com.facebook.yoga.g.a(f11);
        updatePadding();
    }

    public void setPosition(int i11, float f11) {
        this.mYogaNode.f0(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void setPositionPercent(int i11, float f11) {
        this.mYogaNode.g0(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void setPositionType(com.facebook.yoga.v vVar) {
        this.mYogaNode.h0(vVar);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setReactTag(int i11) {
        this.mReactTag = i11;
    }

    @Override // com.facebook.react.uimanager.i0
    public final void setRootTag(int i11) {
        this.mRootTag = i11;
    }

    public void setRowGap(float f11) {
        this.mYogaNode.J(com.facebook.yoga.m.ROW, f11);
    }

    public void setRowGapPercent(float f11) {
        this.mYogaNode.K(com.facebook.yoga.m.ROW, f11);
    }

    public void setShouldNotifyOnLayout(boolean z11) {
        this.mShouldNotifyOnLayout = z11;
    }

    public void setStyleAspectRatio(float f11) {
        this.mYogaNode.w(f11);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setStyleHeight(float f11) {
        this.mYogaNode.L(f11);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.M();
    }

    public void setStyleHeightPercent(float f11) {
        this.mYogaNode.N(f11);
    }

    public void setStyleMaxHeight(float f11) {
        this.mYogaNode.S(f11);
    }

    public void setStyleMaxHeightPercent(float f11) {
        this.mYogaNode.U(f11);
    }

    public void setStyleMaxWidth(float f11) {
        this.mYogaNode.V(f11);
    }

    public void setStyleMaxWidthPercent(float f11) {
        this.mYogaNode.W(f11);
    }

    public void setStyleMinHeight(float f11) {
        this.mYogaNode.Y(f11);
    }

    public void setStyleMinHeightPercent(float f11) {
        this.mYogaNode.Z(f11);
    }

    public void setStyleMinWidth(float f11) {
        this.mYogaNode.a0(f11);
    }

    public void setStyleMinWidthPercent(float f11) {
        this.mYogaNode.b0(f11);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setStyleWidth(float f11) {
        this.mYogaNode.i0(f11);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.j0();
    }

    public void setStyleWidthPercent(float f11) {
        this.mYogaNode.k0(f11);
    }

    @Override // com.facebook.react.uimanager.i0
    public void setThemedContext(v0 v0Var) {
        this.mThemedContext = v0Var;
    }

    @Override // com.facebook.react.uimanager.i0
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.i0
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.i0
    public final void updateProperties(k0 k0Var) {
        m1.g(this, k0Var);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.i0
    public void addChildAt(j0 j0Var, int i11) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i11, j0Var);
        j0Var.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            com.facebook.yoga.r rVar = j0Var.mYogaNode;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + j0Var.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(rVar, i11);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = j0Var.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.i0
    public final void addNativeChildAt(j0 j0Var, int i11) {
        gn.a.a(getNativeKind() == s.PARENT);
        gn.a.a(j0Var.getNativeKind() != s.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i11, j0Var);
        j0Var.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.i0
    public void calculateLayout(float f11, float f12) {
        this.mYogaNode.b(f11, f12);
    }

    @Override // com.facebook.react.uimanager.i0
    public final j0 getChildAt(int i11) {
        ArrayList<j0> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i11);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.i0
    public final j0 getLayoutParent() {
        j0 j0Var = this.mLayoutParent;
        return j0Var != null ? j0Var : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.i0
    public final int getNativeOffsetForChild(j0 j0Var) {
        int totalNativeNodeContributionToParent = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            j0 childAt = getChildAt(i11);
            if (j0Var == childAt) {
                return totalNativeNodeContributionToParent;
            }
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + j0Var.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.i0
    public final j0 getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.i0
    public final j0 getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.i0
    public final int indexOf(j0 j0Var) {
        ArrayList<j0> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(j0Var);
    }

    @Override // com.facebook.react.uimanager.i0
    public final int indexOfNativeChild(j0 j0Var) {
        gn.a.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(j0Var);
    }

    @Override // com.facebook.react.uimanager.i0
    public boolean isDescendantOf(j0 j0Var) {
        for (j0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == j0Var) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.i0
    public j0 removeChildAt(int i11) {
        ArrayList<j0> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
        }
        j0 j0VarRemove = arrayList.remove(i11);
        j0VarRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.r(i11);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = j0VarRemove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return j0VarRemove;
    }

    @Override // com.facebook.react.uimanager.i0
    public final j0 removeNativeChildAt(int i11) {
        gn.a.c(this.mNativeChildren);
        j0 j0VarRemove = this.mNativeChildren.remove(i11);
        j0VarRemove.mNativeParent = null;
        return j0VarRemove;
    }

    @Override // com.facebook.react.uimanager.i0
    public final void setLayoutParent(j0 j0Var) {
        this.mLayoutParent = j0Var;
    }
}
