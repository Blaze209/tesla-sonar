package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.VirtualView;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected l1<V> mDelegate;
    protected final SVGClass svgClass;
    private static final com.facebook.react.uimanager.q.a sMatrixDecompositionContext = new com.facebook.react.uimanager.q.a();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45300a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            f45300a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45300a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45300a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45300a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45300a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45300a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45300a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45300a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45300a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45300a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45300a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45300a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45300a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45300a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45300a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45300a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45300a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45300a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f45300a[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f45300a[SVGClass.RNSVGFeBlend.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f45300a[SVGClass.RNSVGFeColorMatrix.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f45300a[SVGClass.RNSVGFeComposite.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f45300a[SVGClass.RNSVGFeFlood.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f45300a[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f45300a[SVGClass.RNSVGFeMerge.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f45300a[SVGClass.RNSVGFeOffset.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f45300a[SVGClass.RNSVGMarker.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f45300a[SVGClass.RNSVGForeignObject.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    static class c extends com.facebook.react.uimanager.m {
        c() {
        }

        @no.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", Snapshot.WIDTH, Snapshot.HEIGHT, "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i11, Dynamic dynamic) {
        }
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    static RenderableView getRenderableViewByTag(int i11) {
        return mTagToRenderableView.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v11) {
        SvgView svgView = v11.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v11 instanceof h1) {
            ((h1) v11).v().clearChildCache();
        }
    }

    static void runWhenViewIsAvailable(int i11, Runnable runnable) {
        mTagToRunnable.put(i11, runnable);
    }

    private static float sanitizeFloatPropertyValue(float f11) {
        if (f11 >= -3.4028235E38f && f11 <= Float.MAX_VALUE) {
            return f11;
        }
        if (f11 < -3.4028235E38f || f11 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f11 > Float.MAX_VALUE || f11 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f11)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalStateException("Invalid float property value: " + f11);
    }

    static void setRenderableView(int i11, RenderableView renderableView) {
        mTagToRenderableView.put(i11, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i11);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.m> getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "clipPath")
    public void setClipPath(V v11, String str) {
        v11.setClipPath(str);
    }

    @no.a(name = "clipRule")
    public void setClipRule(V v11, int i11) {
        v11.setClipRule(i11);
    }

    @no.a(name = "display")
    public void setDisplay(V v11, String str) {
        v11.setDisplay(str);
    }

    @no.a(name = "markerEnd")
    public void setMarkerEnd(V v11, String str) {
        v11.setMarkerEnd(str);
    }

    @no.a(name = "markerMid")
    public void setMarkerMid(V v11, String str) {
        v11.setMarkerMid(str);
    }

    @no.a(name = "markerStart")
    public void setMarkerStart(V v11, String str) {
        v11.setMarkerStart(str);
    }

    @no.a(name = "mask")
    public void setMask(V v11, String str) {
        v11.setMask(str);
    }

    @no.a(name = "matrix")
    public void setMatrix(V v11, Dynamic dynamic) {
        v11.setMatrix(dynamic);
    }

    @no.a(name = "name")
    public void setName(V v11, String str) {
        v11.setName(str);
    }

    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v11, float f11) {
        v11.setOpacity(f11);
    }

    @no.a(name = "pointerEvents")
    public void setPointerEvents(V v11, String str) {
        if (str == null) {
            v11.setPointerEvents(com.facebook.react.uimanager.x.AUTO);
        } else {
            v11.setPointerEvents(com.facebook.react.uimanager.x.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @no.a(name = "responsible")
    public void setResponsible(V v11, boolean z11) {
        v11.setResponsible(z11);
    }

    protected void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(com.facebook.react.uimanager.w.h(BitmapDescriptorFactory.HUE_RED));
            virtualView.setTranslationY(com.facebook.react.uimanager.w.h(BitmapDescriptorFactory.HUE_RED));
            virtualView.setRotation(BitmapDescriptorFactory.HUE_RED);
            virtualView.setRotationX(BitmapDescriptorFactory.HUE_RED);
            virtualView.setRotationY(BitmapDescriptorFactory.HUE_RED);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        com.facebook.react.uimanager.q.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        com.facebook.react.uimanager.y0.d(readableArray, dArr, virtualView.getWidth(), virtualView.getHeight(), null, false);
        com.facebook.react.uimanager.q.k(dArr, aVar);
        virtualView.setTranslationX(com.facebook.react.uimanager.w.h(sanitizeFloatPropertyValue((float) aVar.translation[0])));
        virtualView.setTranslationY(com.facebook.react.uimanager.w.h(sanitizeFloatPropertyValue((float) aVar.translation[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) aVar.scale[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) aVar.scale[1]));
        double[] dArr2 = aVar.perspective;
        if (dArr2.length > 2) {
            float f11 = (float) dArr2[2];
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = com.facebook.react.uimanager.d.c().density;
            virtualView.setCameraDistance(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(com.facebook.react.uimanager.v0 v0Var, VirtualView virtualView) {
        super.addEventEmitters(v0Var, virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(com.facebook.react.uimanager.v0 v0Var) {
        switch (b.f45300a[this.svgClass.ordinal()]) {
            case 1:
                return new c0(v0Var);
            case 2:
                return new k0(v0Var);
            case 3:
                return new com.horcrux.svg.b(v0Var);
            case 4:
                return new h(v0Var);
            case 5:
                return new e0(v0Var);
            case 6:
                return new r0(v0Var);
            case 7:
                return new h1(v0Var);
            case 8:
                return new u0(v0Var);
            case 9:
                return new v0(v0Var);
            case 10:
                return new d0(v0Var);
            case 11:
                return new com.horcrux.svg.c(v0Var);
            case 12:
                return new f(v0Var);
            case 13:
                return new i1(v0Var);
            case 14:
                return new t0(v0Var);
            case 15:
                return new f0(v0Var);
            case 16:
                return new q0(v0Var);
            case 17:
                return new l0(v0Var);
            case 18:
                return new h0(v0Var);
            case 19:
                return new x(v0Var);
            case 20:
                return new j(v0Var);
            case 21:
                return new k(v0Var);
            case 22:
                return new l(v0Var);
            case 23:
                return new m(v0Var);
            case 24:
                return new n(v0Var);
            case 25:
                return new o(v0Var);
            case 26:
                return new p(v0Var);
            case 27:
                return new g0(v0Var);
            case 28:
                return new z(v0Var);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v11, ReadableArray readableArray) {
        v11.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    @no.a(name = "transform")
    public void setTransform(V v11, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v11, dynamic.asArray());
    }
}
