package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "RNSVGRenderableModule")
class RNSVGRenderableManager extends NativeSvgRenderableModuleSpec {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;
    public static final String NAME = "RNSVGRenderableModule";

    RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(Double d11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z11 = readableMap.getBoolean("fill");
        boolean z12 = readableMap.getBoolean("stroke");
        boolean z13 = readableMap.getBoolean("markers");
        boolean z14 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f11 = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z11 && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z12 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z13 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z14 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", rectF.left / f11);
            writableMapCreateMap.putDouble("y", rectF.top / f11);
            writableMapCreateMap.putDouble(Snapshot.WIDTH, rectF.width() / f11);
            writableMapCreateMap.putDouble(Snapshot.HEIGHT, rectF.height() / f11);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(Double d11) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f11 = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        SvgView svgView = renderableViewByTag.getSvgView();
        if (svgView == null) {
            throw new RuntimeException("Did not find parent SvgView for view with tag: " + d11);
        }
        matrix.preConcat(svgView.mInvViewBoxMatrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", fArr[0]);
        writableMapCreateMap.putDouble("b", fArr[3]);
        writableMapCreateMap.putDouble("c", fArr[1]);
        writableMapCreateMap.putDouble(DateTokenConverter.CONVERTER_KEY, fArr[4]);
        writableMapCreateMap.putDouble("e", fArr[2] / f11);
        writableMapCreateMap.putDouble("f", fArr[5] / f11);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(Double d11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float f11 = (float) readableMap.getDouble("length");
            float f12 = renderableViewByTag.mScale;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f11 * f12, pathMeasure.getLength())), fArr, fArr2);
            double dAtan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", fArr[0] / f12);
            writableMapCreateMap.putDouble("y", fArr[1] / f12);
            writableMapCreateMap.putDouble("angle", dAtan2);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8);
                char[] cArr = new char[4096];
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i11 = inputStreamReader.read(cArr, 0, 4096);
                    if (i11 == -1) {
                        promise.resolve(sb2.toString());
                        try {
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    sb2.append(cArr, 0, i11);
                }
            } finally {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            promise.reject(e11);
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(Double d11) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.mCTM.getValues(fArr);
        float f11 = renderableViewByTag.mScale;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", fArr[0]);
        writableMapCreateMap.putDouble("b", fArr[3]);
        writableMapCreateMap.putDouble("c", fArr[1]);
        writableMapCreateMap.putDouble(DateTokenConverter.CONVERTER_KEY, fArr[4]);
        writableMapCreateMap.putDouble("e", fArr[2] / f11);
        writableMapCreateMap.putDouble("f", fArr[5] / f11);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalLength(Double d11) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return 0.0d;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0d;
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(Double d11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        float f11 = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble("x")) * f11, ((float) readableMap.getDouble("y")) * f11}) != -1;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(Double d11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d11.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d12 = renderableViewByTag.mScale;
            int i11 = (int) (readableMap.getDouble("x") * d12);
            int i12 = (int) (readableMap.getDouble("y") * d12);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i11, i12);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}
