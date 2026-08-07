package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class m extends j0 {
    boolean mCollapsable;
    private final b mTempYogaValue = new b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23333a;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            f23333a = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23333a[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23333a[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23333a[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f23334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.facebook.yoga.w f23335b;

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f23335b = com.facebook.yoga.w.UNDEFINED;
                this.f23334a = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.f23335b = com.facebook.yoga.w.POINT;
                    this.f23334a = w.g(dynamic.asDouble());
                    return;
                } else {
                    this.f23335b = com.facebook.yoga.w.UNDEFINED;
                    this.f23334a = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                this.f23335b = com.facebook.yoga.w.AUTO;
                this.f23334a = Float.NaN;
            } else {
                if (strAsString.endsWith("%")) {
                    this.f23335b = com.facebook.yoga.w.PERCENT;
                    this.f23334a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    return;
                }
                qk.a.I("ReactNative", "Unknown value: " + strAsString);
                this.f23335b = com.facebook.yoga.w.UNDEFINED;
                this.f23334a = Float.NaN;
            }
        }

        private b() {
        }
    }

    private int maybeTransformLeftRightToStartEnd(int i11) {
        if (com.facebook.react.modules.i18nmanager.a.f().d(getThemedContext())) {
            if (i11 == 0) {
                return 4;
            }
            if (i11 == 2) {
                return 5;
            }
        }
        return i11;
    }

    @no.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignContent(com.facebook.yoga.a.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignContent(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignContent(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignContent(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignContent(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignContent(com.facebook.yoga.a.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(com.facebook.yoga.a.SPACE_EVENLY);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for alignContent: " + str);
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
        }
    }

    @no.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignItems(com.facebook.yoga.a.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignItems(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignItems(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignItems(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignItems(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignItems(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignItems(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for alignItems: " + str);
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
        }
    }

    @no.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignSelf(com.facebook.yoga.a.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignSelf(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignSelf(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignSelf(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignSelf(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for alignSelf: " + str);
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
        }
    }

    @no.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f11) {
        setStyleAspectRatio(f11);
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i11, float f11) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(u1.BORDER_SPACING_TYPES[i11]), w.h(f11));
    }

    @no.a(name = "collapsable")
    public void setCollapsable(boolean z11) {
        this.mCollapsable = z11;
    }

    @no.a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z11) {
    }

    @no.a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            setColumnGap(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setColumnGapPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "display")
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("flex")) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("none")) {
            setDisplay(com.facebook.yoga.i.NONE);
            return;
        }
        qk.a.I("ReactNative", "invalid value for display: " + str);
        setDisplay(com.facebook.yoga.i.FLEX);
    }

    @Override // com.facebook.react.uimanager.j0
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flex")
    public void setFlex(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f11);
    }

    @no.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setFlexBasis(this.mTempYogaValue.f23334a);
        } else if (i11 == 3) {
            setFlexBasisAuto();
        } else if (i11 == 4) {
            setFlexBasisPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexDirection(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(com.facebook.yoga.l.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
            case "row":
                setFlexDirection(com.facebook.yoga.l.ROW);
                break;
            case "column-reverse":
                setFlexDirection(com.facebook.yoga.l.COLUMN_REVERSE);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for flexDirection: " + str);
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.j0
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flexGrow")
    public void setFlexGrow(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f11);
    }

    @Override // com.facebook.react.uimanager.j0
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flexShrink")
    public void setFlexShrink(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f11);
    }

    @no.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexWrap(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
            case "wrap-reverse":
                setFlexWrap(com.facebook.yoga.x.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(com.facebook.yoga.x.WRAP);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for flexWrap: " + str);
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
        }
    }

    @no.a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            setGap(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setGapPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleHeight(this.mTempYogaValue.f23334a);
        } else if (i11 == 3) {
            setStyleHeightAuto();
        } else if (i11 == 4) {
            setStyleHeightPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @no.b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i11, Dynamic dynamic) {
    }

    @no.b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i11, Dynamic dynamic) {
    }

    @no.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setJustifyContent(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(com.facebook.yoga.n.CENTER);
                break;
            case "flex-start":
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
            case "space-between":
                setJustifyContent(com.facebook.yoga.n.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(com.facebook.yoga.n.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(com.facebook.yoga.n.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(com.facebook.yoga.n.SPACE_EVENLY);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for justifyContent: " + str);
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
        }
    }

    @no.b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i11, Dynamic dynamic) {
    }

    @no.b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i11, Dynamic dynamic) {
    }

    @no.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(u1.PADDING_MARGIN_SPACING_TYPES[i11]);
        this.mTempYogaValue.a(dynamic);
        int i12 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        } else if (i12 == 3) {
            setMarginAuto(iMaybeTransformLeftRightToStartEnd);
        } else if (i12 == 4) {
            setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleMaxHeight(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleMaxWidth(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleMinHeight(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleMinWidth(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "overflow")
    public void setOverflow(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setOverflow(com.facebook.yoga.u.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(com.facebook.yoga.u.HIDDEN);
                break;
            case "scroll":
                setOverflow(com.facebook.yoga.u.SCROLL);
                break;
            case "visible":
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
            default:
                qk.a.I("ReactNative", "invalid value for overflow: " + str);
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
        }
    }

    @no.b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i11, Dynamic dynamic) {
    }

    @no.b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i11, Dynamic dynamic) {
    }

    @no.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(u1.PADDING_MARGIN_SPACING_TYPES[i11]);
        this.mTempYogaValue.a(dynamic);
        int i12 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        } else if (i12 == 4) {
            setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "position")
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("absolute")) {
            setPositionType(com.facebook.yoga.v.ABSOLUTE);
            return;
        }
        qk.a.I("ReactNative", "invalid value for position: " + str);
        setPositionType(com.facebook.yoga.v.RELATIVE);
    }

    @no.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i11]);
        this.mTempYogaValue.a(dynamic);
        int i12 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        } else if (i12 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @no.a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            setRowGap(this.mTempYogaValue.f23334a);
        } else if (i11 == 4) {
            setRowGapPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.j0
    @no.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z11) {
        super.setShouldNotifyOnLayout(z11);
    }

    @no.a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z11) {
    }

    @no.a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z11) {
    }

    @no.a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z11) {
    }

    @no.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f23333a[this.mTempYogaValue.f23335b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setStyleWidth(this.mTempYogaValue.f23334a);
        } else if (i11 == 3) {
            setStyleWidthAuto();
        } else if (i11 == 4) {
            setStyleWidthPercent(this.mTempYogaValue.f23334a);
        }
        dynamic.recycle();
    }
}
