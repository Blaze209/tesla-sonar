package com.rnmaps.maps;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public class l extends h {
    private boolean A;
    private boolean B;
    private final MapMarkerManager C;
    private String D;
    private final pl.b<?> E;
    private com.facebook.datasource.c<tk.a<um.e>> F;
    private final il.d<um.m> G;
    private Bitmap H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MarkerOptions f49187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Marker f49188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LatLng f49192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f49194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f49196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f49197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f f49198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f49199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f49200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f49201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BitmapDescriptor f49202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Bitmap f49203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f49204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f49207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f49208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f49209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f49210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f49211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f49212z;

    class a extends il.c<um.m> {
        a() {
        }

        @Override // il.c, il.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void p(String str, um.m mVar, Animatable animatable) throws Throwable {
            tk.a aVar;
            Throwable th2;
            Bitmap bitmapT3;
            try {
                aVar = (tk.a) l.this.F.getResult();
                if (aVar != null) {
                    try {
                        um.e eVar = (um.e) aVar.H();
                        if ((eVar instanceof um.f) && (bitmapT3 = ((um.f) eVar).t3()) != null) {
                            Bitmap bitmapCopy = bitmapT3.copy(Bitmap.Config.ARGB_8888, true);
                            l.this.f49203q = bitmapCopy;
                            l.this.f49202p = BitmapDescriptorFactory.fromBitmap(bitmapCopy);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        l.this.F.close();
                        if (aVar != null) {
                            tk.a.C(aVar);
                        }
                        throw th2;
                    }
                }
                l.this.F.close();
                if (aVar != null) {
                    tk.a.C(aVar);
                }
                if (l.this.C != null && l.this.D != null) {
                    l.this.C.getSharedIcon(l.this.D).e(l.this.f49202p, l.this.f49203q);
                }
                l.this.z(true);
            } catch (Throwable th4) {
                aVar = null;
                th2 = th4;
            }
        }
    }

    class b implements TypeEvaluator<LatLng> {
        b() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LatLng evaluate(float f11, LatLng latLng, LatLng latLng2) {
            return l.this.x(f11, latLng, latLng2);
        }
    }

    public l(Context context, MapMarkerManager mapMarkerManager) {
        super(context);
        this.f49201o = BitmapDescriptorFactory.HUE_RED;
        this.f49204r = BitmapDescriptorFactory.HUE_RED;
        this.f49205s = false;
        this.f49206t = false;
        this.f49207u = 0;
        this.f49208v = 1.0f;
        this.f49212z = true;
        this.A = false;
        this.B = false;
        this.G = new a();
        this.H = null;
        this.f49200n = context;
        this.C = mapMarkerManager;
        pl.b<?> bVarC = pl.b.c(t(), context);
        this.E = bVarC;
        bVarC.i();
    }

    private void C() {
        boolean z11 = this.f49212z && this.B && this.f49188b != null;
        if (z11 == this.A) {
            return;
        }
        this.A = z11;
        if (z11) {
            y.f().e(this);
        } else {
            y.f().g(this);
            B();
        }
    }

    private void D() {
        f fVar = this.f49198l;
        if (fVar == null || fVar.getChildCount() == 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f49200n);
        linearLayout.setOrientation(1);
        f fVar2 = this.f49198l;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(fVar2.f49140b, fVar2.f49141c, BitmapDescriptorFactory.HUE_RED));
        LinearLayout linearLayout2 = new LinearLayout(this.f49200n);
        linearLayout2.setOrientation(0);
        f fVar3 = this.f49198l;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(fVar3.f49140b, fVar3.f49141c, BitmapDescriptorFactory.HUE_RED));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.f49198l);
        this.f49199m = linearLayout;
    }

    private BitmapDescriptor getIcon() {
        if (!this.B) {
            BitmapDescriptor bitmapDescriptor = this.f49202p;
            return bitmapDescriptor != null ? bitmapDescriptor : BitmapDescriptorFactory.defaultMarker(this.f49201o);
        }
        if (this.f49202p == null) {
            return BitmapDescriptorFactory.fromBitmap(s());
        }
        Bitmap bitmapS = s();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(this.f49203q.getWidth(), bitmapS.getWidth()), Math.max(this.f49203q.getHeight(), bitmapS.getHeight()), this.f49203q.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.f49203q, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.drawBitmap(bitmapS, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }

    private void r() {
        this.H = null;
    }

    private Bitmap s() {
        int i11 = this.f49189c;
        if (i11 <= 0) {
            i11 = 100;
        }
        int i12 = this.f49190d;
        int i13 = i12 > 0 ? i12 : 100;
        buildDrawingCache();
        Bitmap bitmapCreateBitmap = this.H;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != i11 || bitmapCreateBitmap.getHeight() != i13) {
            bitmapCreateBitmap = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
            this.H = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private ml.a t() {
        return new ml.b(getResources()).v(ll.s.f90217e).y(0).a();
    }

    private MarkerOptions u(MarkerOptions markerOptions) {
        markerOptions.position(this.f49192f);
        if (this.f49195i) {
            markerOptions.anchor(this.f49196j, this.f49197k);
        }
        if (this.f49211y) {
            markerOptions.infoWindowAnchor(this.f49209w, this.f49210x);
        }
        markerOptions.title(this.f49193g);
        markerOptions.snippet(this.f49194h);
        markerOptions.rotation(this.f49204r);
        markerOptions.flat(this.f49205s);
        markerOptions.draggable(this.f49206t);
        markerOptions.zIndex(this.f49207u);
        markerOptions.alpha(this.f49208v);
        markerOptions.icon(getIcon());
        return markerOptions;
    }

    private BitmapDescriptor v(String str) {
        return BitmapDescriptorFactory.fromResource(w(str));
    }

    private int w(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public boolean A() {
        if (!this.A) {
            return false;
        }
        B();
        return true;
    }

    public void B() {
        Marker marker = this.f49188b;
        if (marker == null) {
            return;
        }
        marker.setIcon(getIcon());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        super.addView(view, i11);
        if (!(view instanceof f)) {
            this.B = true;
            C();
        }
        z(true);
    }

    public View getCallout() {
        if (this.f49198l == null) {
            return null;
        }
        if (this.f49199m == null) {
            D();
        }
        if (this.f49198l.getTooltip()) {
            return this.f49199m;
        }
        return null;
    }

    public f getCalloutView() {
        return this.f49198l;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49188b;
    }

    public String getIdentifier() {
        return this.f49191e;
    }

    public View getInfoContents() {
        if (this.f49198l == null) {
            return null;
        }
        if (this.f49199m == null) {
            D();
        }
        if (this.f49198l.getTooltip()) {
            return null;
        }
        return this.f49199m;
    }

    public MarkerOptions getMarkerOptions() {
        if (this.f49187a == null) {
            this.f49187a = new MarkerOptions();
        }
        u(this.f49187a);
        return this.f49187a;
    }

    public LatLng getPosition() {
        return this.f49192f;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        Marker marker = this.f49188b;
        if (marker == null) {
            return;
        }
        ((gx.d.a) obj).i(marker);
        this.f49188b = null;
        C();
    }

    public void p(Object obj) {
        this.f49188b = ((gx.d.a) obj).h(getMarkerOptions());
        C();
    }

    public void q(LatLng latLng, Integer num) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f49188b, (Property<Marker, V>) Property.of(Marker.class, LatLng.class, "position"), new b(), latLng);
        objectAnimatorOfObject.setDuration(num.intValue());
        objectAnimatorOfObject.start();
    }

    @Override // com.facebook.react.views.view.e, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getChildCount() == 0 && this.B) {
            this.B = false;
            r();
            C();
            z(true);
        }
    }

    public void setAnchor(double d11, double d12) {
        this.f49195i = true;
        float f11 = (float) d11;
        this.f49196j = f11;
        float f12 = (float) d12;
        this.f49197k = f12;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setAnchor(f11, f12);
        }
        z(false);
    }

    public void setCalloutAnchor(double d11, double d12) {
        this.f49211y = true;
        float f11 = (float) d11;
        this.f49209w = f11;
        float f12 = (float) d12;
        this.f49210x = f12;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setInfoWindowAnchor(f11, f12);
        }
        z(false);
    }

    public void setCalloutView(f fVar) {
        this.f49198l = fVar;
    }

    public void setCoordinate(ReadableMap readableMap) {
        LatLng latLng = new LatLng(readableMap.getDouble(OrcaKeys.LATITUDE), readableMap.getDouble(OrcaKeys.LONGITUDE));
        this.f49192f = latLng;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setPosition(latLng);
        }
        z(false);
    }

    public void setDraggable(boolean z11) {
        this.f49206t = z11;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setDraggable(z11);
        }
        z(false);
    }

    public void setFlat(boolean z11) {
        this.f49205s = z11;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setFlat(z11);
        }
        z(false);
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.f49203q = bitmap;
    }

    public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
        this.f49202p = bitmapDescriptor;
        this.f49203q = bitmap;
        z(true);
    }

    public void setIdentifier(String str) {
        this.f49191e = str;
        z(false);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public void setImage(String str) {
        boolean zD;
        MapMarkerManager mapMarkerManager = this.C;
        if (mapMarkerManager == null) {
            zD = true;
        } else {
            String str2 = this.D;
            if (str2 != null) {
                mapMarkerManager.getSharedIcon(str2).c(this);
                this.C.removeSharedIconIfEmpty(this.D);
            }
            if (str != null) {
                MapMarkerManager.a sharedIcon = this.C.getSharedIcon(str);
                sharedIcon.a(this);
                zD = sharedIcon.d();
            } else {
                zD = true;
            }
        }
        this.D = str;
        if (zD) {
            if (str == null) {
                this.f49202p = null;
                z(true);
                return;
            }
            if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("asset://") || str.startsWith("data:")) {
                com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.x(Uri.parse(str)).a();
                this.F = el.d.a().k(aVarA, this);
                this.E.n(el.d.f().D(aVarA).C(this.G).a(this.E.e()).build());
                return;
            }
            this.f49202p = v(str);
            int iW = w(str);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), iW);
            this.f49203q = bitmapDecodeResource;
            if (bitmapDecodeResource == null) {
                Drawable drawable = getResources().getDrawable(iW);
                this.f49203q = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(new Canvas(this.f49203q));
            }
            MapMarkerManager mapMarkerManager2 = this.C;
            if (mapMarkerManager2 != null) {
                mapMarkerManager2.getSharedIcon(str).e(this.f49202p, this.f49203q);
            }
            z(true);
        }
    }

    public void setMarkerHue(float f11) {
        this.f49201o = f11;
        z(false);
    }

    public void setOpacity(float f11) {
        this.f49208v = f11;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setAlpha(f11);
        }
        z(false);
    }

    @Override // android.view.View
    public void setRotation(float f11) {
        this.f49204r = f11;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setRotation(f11);
        }
        z(false);
    }

    public void setSnippet(String str) {
        this.f49194h = str;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setSnippet(str);
        }
        z(false);
    }

    public void setTitle(String str) {
        this.f49193g = str;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setTitle(str);
        }
        z(false);
    }

    public void setTracksViewChanges(boolean z11) {
        this.f49212z = z11;
        C();
    }

    public void setZIndex(int i11) {
        this.f49207u = i11;
        Marker marker = this.f49188b;
        if (marker != null) {
            marker.setZIndex(i11);
        }
        z(false);
    }

    public LatLng x(float f11, LatLng latLng, LatLng latLng2) {
        double d11 = latLng2.latitude;
        double d12 = latLng.latitude;
        double d13 = f11;
        double d14 = ((d11 - d12) * d13) + d12;
        double d15 = latLng2.longitude;
        double d16 = latLng.longitude;
        return new LatLng(d14, ((d15 - d16) * d13) + d16);
    }

    public void y(int i11, int i12) {
        this.f49189c = i11;
        this.f49190d = i12;
        z(true);
    }

    public void z(boolean z11) {
        if (this.f49188b == null) {
            return;
        }
        if (z11) {
            B();
        }
        if (this.f49195i) {
            this.f49188b.setAnchor(this.f49196j, this.f49197k);
        } else {
            this.f49188b.setAnchor(0.5f, 1.0f);
        }
        if (this.f49211y) {
            this.f49188b.setInfoWindowAnchor(this.f49209w, this.f49210x);
        } else {
            this.f49188b.setInfoWindowAnchor(0.5f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public l(Context context, MarkerOptions markerOptions, MapMarkerManager mapMarkerManager) {
        super(context);
        this.f49201o = BitmapDescriptorFactory.HUE_RED;
        this.f49204r = BitmapDescriptorFactory.HUE_RED;
        this.f49205s = false;
        this.f49206t = false;
        this.f49207u = 0;
        this.f49208v = 1.0f;
        this.f49212z = true;
        this.A = false;
        this.B = false;
        this.G = new a();
        this.H = null;
        this.f49200n = context;
        this.C = mapMarkerManager;
        pl.b<?> bVarC = pl.b.c(t(), context);
        this.E = bVarC;
        bVarC.i();
        this.f49192f = markerOptions.getPosition();
        setAnchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        setCalloutAnchor(markerOptions.getInfoWindowAnchorU(), markerOptions.getInfoWindowAnchorV());
        setTitle(markerOptions.getTitle());
        setSnippet(markerOptions.getSnippet());
        setRotation(markerOptions.getRotation());
        setFlat(markerOptions.isFlat());
        setDraggable(markerOptions.isDraggable());
        setZIndex(Math.round(markerOptions.getZIndex()));
        setAlpha(markerOptions.getAlpha());
        this.f49202p = markerOptions.getIcon();
    }
}
