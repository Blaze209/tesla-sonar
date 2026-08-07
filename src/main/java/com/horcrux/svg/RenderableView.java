package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.ViewParent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RenderableView extends VirtualView implements mo.c {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private RenderableView mCaller;
    private int mCurrentColor;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45255a;

        static {
            int[] iArr = new int[p0.values().length];
            f45255a = iArr;
            try {
                iArr[p0.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45255a[p0.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45255a[p0.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = BitmapDescriptorFactory.HUE_RED;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(BitmapDescriptorFactory.HUE_RED);
        setPivotY(BitmapDescriptorFactory.HUE_RED);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f11, ReadableArray readableArray) {
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i11 = readableArray.getInt(0);
        if (i11 == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f11) * 255.0d : f11 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
                paint.setColor((Math.round((iIntValue >>> 24) * f11) << 24) | (iIntValue & 16777215));
                return;
            }
        }
        if (i11 == 1) {
            com.horcrux.svg.a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
            if (definedBrush != null) {
                definedBrush.i(paint, this.mBox, this.mScale, f11);
                return;
            }
            return;
        }
        if (i11 == 2) {
            int currentColor = getCurrentColor();
            paint.setColor((Math.round((currentColor >>> 24) * f11) << 24) | (currentColor & 16777215));
            return;
        }
        if (i11 != 3) {
            if (i11 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                return;
            }
            setupPaint(paint, f11, readableArray3);
            return;
        }
        RenderableView renderableView2 = contextElement;
        if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
            return;
        }
        setupPaint(paint, f11, readableArray2);
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        float f12 = f11 * this.mOpacity;
        boolean z11 = this.mPath == null;
        if (z11) {
            Path path = getPath(canvas, paint);
            this.mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z12 = this.vectorEffect == 1;
        Path path2 = this.mPath;
        if (z12) {
            path2 = new Path();
            this.mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z11 || path2 != this.mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f12)) {
            if (z11) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f12)) {
            if (z11) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f12);
    }

    int getCurrentColor() {
        int i11 = this.mCurrentColor;
        if (i11 != 0) {
            return i11;
        }
        RenderableView renderableView = this.mCaller;
        if (renderableView != null) {
            return renderableView.getCurrentColor();
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // com.facebook.react.views.view.e, mo.c
    public Rect getHitSlopRect() {
        if (((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.x.BOX_NONE) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    abstract Path getPath(Canvas canvas, Paint paint);

    Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (this.mPath == null || !this.mInvertible || ((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.x.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && this.mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            this.mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(this.mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    void mergeProperties(RenderableView renderableView) {
        this.mCaller = renderableView;
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                String str = attributeList.get(i11);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
        this.mLastMergedList = attributeList;
    }

    public void onReceiveNativeEvent() {
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), SvgOnLayoutEvent.EVENT_NAME, Arguments.createMap());
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f11) {
        RectF rectF;
        h0 h0Var = this.mMask != null ? (h0) getSvgView().getDefinedMask(this.mMask) : null;
        x xVar = this.mFilter != null ? (x) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (h0Var == null && xVar == null) {
            draw(canvas, paint, f11);
            return;
        }
        if (xVar != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f11);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof d0) && clientRect == null) {
                return;
            }
            Bitmap bitmapH = xVar.h(bitmapCreateBitmap, currentBitmap, clientRect);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapH, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint2);
            canvas.restoreToCount(iSave);
        } else {
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f11);
        }
        if (h0Var != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(null, paint3);
            if (h0Var.q() == h0.a.LUMINANCE) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2125f, 0.7154f, 0.0721f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (h0Var.r() == com.horcrux.svg.a.b.USER_SPACE_ON_USE) {
                float fRelativeOnWidth = (float) relativeOnWidth(h0Var.f45388f);
                float fRelativeOnHeight = (float) relativeOnHeight(h0Var.f45389g);
                rectF = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(h0Var.f45390h)) + fRelativeOnWidth, ((float) relativeOnHeight(h0Var.f45391i)) + fRelativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof d0) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float fRelativeOnFraction = (float) relativeOnFraction(h0Var.f45388f, clientRect2.width());
                float fRelativeOnFraction2 = (float) relativeOnFraction(h0Var.f45389g, clientRect2.height());
                float fRelativeOnFraction3 = (float) relativeOnFraction(h0Var.f45390h, clientRect2.width());
                float fRelativeOnFraction4 = (float) relativeOnFraction(h0Var.f45391i, clientRect2.height());
                float f12 = clientRect2.left;
                float f13 = clientRect2.top;
                rectF = new RectF(f12 + fRelativeOnFraction, f13 + fRelativeOnFraction2, f12 + fRelativeOnFraction + fRelativeOnFraction3, f13 + fRelativeOnFraction2 + fRelativeOnFraction4);
            }
            canvas.clipRect(rectF);
            h0Var.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF);
            h0Var.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    void renderMarkers(Canvas canvas, Paint paint, float f11) {
        g0 g0Var;
        g0 g0Var2 = (g0) getSvgView().getDefinedMarker(this.mMarkerStart);
        g0 g0Var3 = (g0) getSvgView().getDefinedMarker(this.mMarkerMid);
        g0 g0Var4 = (g0) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<i0> arrayList = this.elements;
        if (arrayList != null) {
            if (g0Var2 == null && g0Var3 == null && g0Var4 == null) {
                return;
            }
            contextElement = this;
            ArrayList<o0> arrayListH = o0.h(arrayList);
            SVGLength sVGLength = this.strokeWidth;
            float fRelativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            for (o0 o0Var : arrayListH) {
                int i11 = a.f45255a[o0Var.f45475a.ordinal()];
                if (i11 == 1) {
                    g0Var = g0Var2;
                } else if (i11 != 2) {
                    g0Var = i11 != 3 ? null : g0Var4;
                } else {
                    g0Var = g0Var3;
                }
                if (g0Var != null) {
                    Canvas canvas2 = canvas;
                    Paint paint2 = paint;
                    float f12 = f11;
                    g0Var.q(canvas2, paint2, f12, o0Var, fRelativeOnOther);
                    this.mMarkerPath.addPath(g0Var.getPath(canvas2, paint2), g0Var.f45383r);
                    canvas = canvas2;
                    paint = paint2;
                    f11 = f12;
                }
            }
            contextElement = null;
        }
    }

    void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
            this.mCaller = null;
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i11 = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d11 = Double.parseDouble(matcher.group());
                int i12 = i11 + 1;
                if (i11 < 3) {
                    d11 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d11);
                i11 = i12;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f11) {
        this.fillOpacity = f11;
        invalidate();
    }

    public void setFillRule(int i11) {
        if (i11 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i11 != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i11 + " unrecognized");
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i11) {
        super.setId(i11);
        VirtualViewManager.setRenderableView(i11, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                this.mPropList.add(readableArray.getString(i11));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i11 = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d11 = Double.parseDouble(matcher.group());
                int i12 = i11 + 1;
                if (i11 < 3) {
                    d11 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d11);
                i11 = i12;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList<SVGLength> arrayListA = SVGLength.a(dynamic);
        if (arrayListA != null) {
            if (arrayListA.size() % 2 == 1) {
                arrayListA.addAll(arrayListA);
            }
            this.strokeDasharray = (SVGLength[]) arrayListA.toArray(new SVGLength[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f11) {
        this.strokeDashoffset = f11 * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i11) {
        if (i11 == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i11 == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i11 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinecap " + i11 + " unrecognized");
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i11) {
        if (i11 == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i11 == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i11 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i11 + " unrecognized");
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f11) {
        this.strokeMiterlimit = f11;
        invalidate();
    }

    public void setStrokeOpacity(float f11) {
        this.strokeOpacity = f11;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new SVGLength(1.0d) : SVGLength.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i11) {
        this.vectorEffect = i11;
        invalidate();
    }

    boolean setupFillPaint(Paint paint, float f11) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f11, this.fill);
        return true;
    }

    boolean setupStrokePaint(Paint paint, float f11) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f11, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr[i11] = (float) relativeOnOther(this.strokeDasharray[i11]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i11 = readableMap.getInt("type");
        if (i11 == 0) {
            ReadableType type = readableMap.getType(StatusResponse.PAYLOAD);
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt(StatusResponse.PAYLOAD)));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.of(0, readableMap.getMap(StatusResponse.PAYLOAD));
            }
        } else if (i11 == 1) {
            this.fill = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.of(Integer.valueOf(i11));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i11 = readableMap.getInt("type");
        if (i11 == 0) {
            ReadableType type = readableMap.getType(StatusResponse.PAYLOAD);
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt(StatusResponse.PAYLOAD)));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.of(0, readableMap.getMap(StatusResponse.PAYLOAD));
            }
        } else if (i11 == 1) {
            this.stroke = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.of(Integer.valueOf(i11));
        }
        invalidate();
    }
}
