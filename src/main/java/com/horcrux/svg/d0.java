package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.events.SvgLoadEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class d0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f45355j;

    class a extends qm.b {
        a() {
        }

        @Override // qm.b
        public void a(Bitmap bitmap) {
            d0 d0Var = d0.this;
            EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c(d0Var.mContext, d0Var.getId());
            int iF = com.facebook.react.uimanager.b1.f(d0.this);
            int id2 = d0.this.getId();
            d0 d0Var2 = d0.this;
            eventDispatcherC.h(new SvgLoadEvent(iF, id2, d0Var2.mContext, d0Var2.f45350e, bitmap.getWidth(), bitmap.getHeight()));
            d0.this.f45355j.set(false);
            SvgView svgView = d0.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }

        @Override // com.facebook.datasource.b
        public void onFailureImpl(com.facebook.datasource.c<tk.a<um.e>> cVar) {
            d0.this.f45355j.set(false);
            qk.a.L("ReactNative", cVar.b(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }
    }

    public d0(ReactContext reactContext) {
        super(reactContext);
        this.f45355j = new AtomicBoolean(false);
    }

    private void j(Canvas canvas, Paint paint, Bitmap bitmap, float f11) {
        if (this.f45351f == 0 || this.f45352g == 0) {
            this.f45351f = bitmap.getWidth();
            this.f45352g = bitmap.getHeight();
        }
        RectF rectFK = k();
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f45351f, this.f45352g);
        j1.a(rectF, rectFK, this.f45353h, this.f45354i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f11 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF k() {
        double dRelativeOnWidth = relativeOnWidth(this.f45346a);
        double dRelativeOnHeight = relativeOnHeight(this.f45347b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f45348c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f45349d);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f45351f * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f45352g * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void l(pm.t tVar, com.facebook.imagepipeline.request.a aVar) {
        this.f45355j.set(true);
        tVar.k(aVar, this.mContext).c(new a(), nk.i.h());
    }

    private void m(pm.t tVar, com.facebook.imagepipeline.request.a aVar, Canvas canvas, Paint paint, float f11) {
        com.facebook.datasource.c<tk.a<um.e>> cVarO = tVar.o(aVar, this.mContext);
        try {
            try {
                tk.a<um.e> result = cVarO.getResult();
                try {
                    if (result == null) {
                        cVarO.close();
                        return;
                    }
                    try {
                        um.e eVarH = result.H();
                        if (!(eVarH instanceof um.d)) {
                            tk.a.C(result);
                            cVarO.close();
                            return;
                        }
                        Bitmap bitmapT3 = ((um.d) eVarH).t3();
                        if (bitmapT3 == null) {
                            tk.a.C(result);
                            cVarO.close();
                        } else {
                            j(canvas, paint, bitmapT3, f11);
                            tk.a.C(result);
                            cVarO.close();
                        }
                    } catch (Exception e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (Throwable th2) {
                    tk.a.C(result);
                    throw th2;
                }
            } catch (Exception e12) {
                throw new IllegalStateException(e12);
            }
        } catch (Throwable th3) {
            cVarO.close();
            throw th3;
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f45355j.get()) {
            return;
        }
        pm.t tVarA = el.d.a();
        com.facebook.imagepipeline.request.a aVarA = com.facebook.imagepipeline.request.a.a(new yo.a(this.mContext, this.f45350e).getUri());
        if (tVarA.u(aVarA)) {
            m(tVarA, aVarA, canvas, paint, f11 * this.mOpacity);
        } else {
            l(tVarA, aVarA);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(k(), Path.Direction.CW);
        return this.mPath;
    }

    public void setAlign(String str) {
        this.f45353h = str;
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.f45349d = SVGLength.b(dynamic);
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f45354i = i11;
        invalidate();
    }

    public void setSrc(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f45350e = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey(Snapshot.WIDTH) && readableMap.hasKey(Snapshot.HEIGHT)) {
                this.f45351f = readableMap.getInt(Snapshot.WIDTH);
                this.f45352g = readableMap.getInt(Snapshot.HEIGHT);
            } else {
                this.f45351f = 0;
                this.f45352g = 0;
            }
            if (Uri.parse(this.f45350e).getScheme() == null) {
                yo.c.d().g(this.mContext, this.f45350e);
            }
        }
    }

    public void setWidth(Dynamic dynamic) {
        this.f45348c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45346a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45347b = SVGLength.b(dynamic);
        invalidate();
    }
}
