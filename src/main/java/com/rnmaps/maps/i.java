package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<LatLng> f49150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f49151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f49152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f49153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GoogleMap f49154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TileOverlay f49155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Context f49156g;

    public class a implements TileProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final List<LatLng> f49157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int[] f49158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final float f49159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final float f49160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final int f49161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final mx.b f49162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected LatLng[] f49163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected kx.b[] f49164h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected kx.b[] f49165i;

        public a(Context context, List<LatLng> list, int[] iArr, float f11) {
            this.f49157a = list;
            this.f49158b = iArr;
            this.f49159c = f11;
            float f12 = context.getResources().getDisplayMetrics().density;
            this.f49160d = f12;
            this.f49161e = (int) (f12 * 256.0f);
            this.f49162f = new mx.b(256.0d);
            a();
        }

        public void a() {
            this.f49163g = new LatLng[this.f49157a.size()];
            this.f49164h = new kx.b[this.f49157a.size()];
            this.f49165i = new kx.b[Math.max(this.f49157a.size() - 1, 0)];
            for (int i11 = 0; i11 < this.f49157a.size(); i11++) {
                LatLng latLng = this.f49157a.get(i11);
                this.f49163g[i11] = latLng;
                this.f49164h[i11] = this.f49162f.a(latLng);
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f49165i[i12] = this.f49162f.a(fx.d.c(this.f49157a.get(i12), latLng, 0.5d));
                }
            }
        }

        public void b(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, b bVar, b bVar2, float f11, float f12) {
            if (f11 == f12) {
                c(canvas, paint2, bVar, bVar2, f11);
                return;
            }
            matrix.reset();
            matrix.preRotate((float) Math.toDegrees(Math.atan2(bVar2.f49168b - bVar.f49168b, bVar2.f49167a - bVar.f49167a)), (float) bVar.f49167a, (float) bVar.f49168b);
            matrix.preTranslate((float) bVar.f49167a, (float) bVar.f49168b);
            float fSqrt = (float) Math.sqrt(Math.pow(bVar2.f49167a - bVar.f49167a, 2.0d) + Math.pow(bVar2.f49168b - bVar.f49168b, 2.0d));
            matrix.preScale(fSqrt, fSqrt);
            float f13 = 1.0f / (f12 - f11);
            matrix.preScale(f13, f13);
            matrix.preTranslate(-f11, BitmapDescriptorFactory.HUE_RED);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawLine((float) bVar.f49167a, (float) bVar.f49168b, (float) bVar2.f49167a, (float) bVar2.f49168b, paint);
        }

        public void c(Canvas canvas, Paint paint, b bVar, b bVar2, float f11) {
            paint.setColor(i.k(this.f49158b, f11));
            canvas.drawLine((float) bVar.f49167a, (float) bVar.f49168b, (float) bVar2.f49167a, (float) bVar2.f49168b, paint);
        }

        public void d(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, float f11, int i11, int i12) {
            b bVar = new b();
            b bVar2 = new b();
            b bVar3 = new b();
            b bVar4 = new b();
            b bVar5 = new b();
            boolean z11 = true;
            if (this.f49157a.size() == 1) {
                bVar.a(this.f49164h[0], f11, i11, i12, this.f49161e);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i.k(this.f49158b, 1.0f));
                canvas.drawCircle((float) bVar.f49167a, (float) bVar.f49168b, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                return;
            }
            int i13 = 2;
            if (this.f49157a.size() == 2) {
                bVar.a(this.f49164h[0], f11, i11, i12, this.f49161e);
                bVar2.a(this.f49164h[1], f11, i11, i12, this.f49161e);
                c(canvas, paint2, bVar, bVar2, BitmapDescriptorFactory.HUE_RED);
                return;
            }
            a aVar = this;
            b bVar6 = bVar2;
            while (i13 < aVar.f49157a.size()) {
                int i14 = i13 - 2;
                b bVar7 = bVar;
                bVar7.a(aVar.f49164h[i14], f11, i11, i12, aVar.f49161e);
                int i15 = i13 - 1;
                kx.b bVar8 = aVar.f49164h[i15];
                boolean z12 = z11;
                int i16 = aVar.f49161e;
                int i17 = i13;
                a aVar2 = aVar;
                b bVar9 = bVar6;
                bVar9.a(bVar8, f11, i11, i12, i16);
                bVar3.a(aVar2.f49164h[i17], f11, i11, i12, aVar2.f49161e);
                bVar4.a(aVar2.f49165i[i14], f11, i11, i12, aVar2.f49161e);
                b bVar10 = bVar5;
                bVar10.a(aVar2.f49165i[i15], f11, i11, i12, aVar2.f49161e);
                float f12 = i17;
                float size = (f12 - 2.0f) / aVar2.f49157a.size();
                float size2 = (f12 - 1.0f) / aVar2.f49157a.size();
                float f13 = (size + size2) / 2.0f;
                Log.d("AirMapGradientPolyline", String.valueOf(f13));
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i.k(aVar2.f49158b, f13));
                canvas.drawCircle((float) bVar9.f49167a, (float) bVar9.f49168b, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                aVar2.b(canvas, matrix, paint, paint2, i14 == 0 ? bVar7 : bVar4, bVar9, size, f13);
                aVar2.b(canvas, matrix, paint, paint2, r6, i17 == aVar2.f49157a.size() + (-1) ? bVar3 : bVar10, f13, size2);
                i13 = i17 + 1;
                bVar6 = bVar9;
                bVar5 = bVar10;
                bVar = bVar7;
                z11 = z12;
                aVar = this;
            }
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i11, int i12, int i13) {
            int i14 = this.f49161e;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i14, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setStrokeWidth(this.f49159c);
            Paint.Cap cap = Paint.Cap.BUTT;
            paint.setStrokeCap(cap);
            Paint.Join join = Paint.Join.ROUND;
            paint.setStrokeJoin(join);
            paint.setFlags(1);
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, this.f49158b, (float[]) null, Shader.TileMode.CLAMP));
            paint.getShader().setLocalMatrix(matrix);
            Paint paint2 = new Paint();
            paint2.setStyle(style);
            paint2.setStrokeWidth(this.f49159c);
            paint2.setStrokeCap(cap);
            paint2.setStrokeJoin(join);
            paint2.setFlags(1);
            d(canvas, matrix, paint, paint2, (float) (Math.pow(2.0d, i13) * ((double) this.f49160d)), i11, i12);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int i15 = this.f49161e;
            return new Tile(i15, i15, byteArrayOutputStream.toByteArray());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f49167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f49168b;

        public b a(kx.b bVar, float f11, int i11, int i12, int i13) {
            double d11 = f11;
            this.f49167a = (bVar.f89443a * d11) - ((double) (i11 * i13));
            this.f49168b = (bVar.f89444b * d11) - ((double) (i12 * i13));
            return this;
        }
    }

    public i(Context context) {
        super(context);
        this.f49156g = context;
    }

    private TileOverlayOptions j() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f49152c);
        tileOverlayOptions.tileProvider(new a(this.f49156g, this.f49150a, this.f49151b, this.f49153d));
        return tileOverlayOptions;
    }

    public static int k(int[] iArr, float f11) {
        float length = f11 * (iArr.length - 1);
        int iRed = 0;
        int iGreen = 0;
        int iBlue = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float fMax = Math.max(1.0f - Math.abs(length - i11), BitmapDescriptorFactory.HUE_RED);
            iRed += (int) (Color.red(iArr[i11]) * fMax);
            iGreen += (int) (Color.green(iArr[i11]) * fMax);
            iBlue += (int) (Color.blue(iArr[i11]) * fMax);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49155f;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        this.f49155f.remove();
    }

    public void i(Object obj) {
        GoogleMap googleMap = (GoogleMap) obj;
        this.f49154e = googleMap;
        this.f49155f = googleMap.addTileOverlay(j());
    }

    public void setCoordinates(List<LatLng> list) {
        this.f49150a = list;
        TileOverlay tileOverlay = this.f49155f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f49154e;
        if (googleMap != null) {
            this.f49155f = googleMap.addTileOverlay(j());
        }
    }

    public void setStrokeColors(int[] iArr) {
        this.f49151b = iArr;
        TileOverlay tileOverlay = this.f49155f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f49154e;
        if (googleMap != null) {
            this.f49155f = googleMap.addTileOverlay(j());
        }
    }

    public void setWidth(float f11) {
        this.f49153d = f11;
        TileOverlay tileOverlay = this.f49155f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f49154e;
        if (googleMap != null) {
            this.f49155f = googleMap.addTileOverlay(j());
        }
    }

    public void setZIndex(float f11) {
        this.f49152c = f11;
        TileOverlay tileOverlay = this.f49155f;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}
