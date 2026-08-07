package hx;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ix.j;
import ix.l;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jx.k;
import jx.o;
import jx.r;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f73688r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final DecimalFormat f73689s = new DecimalFormat("#.####");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GoogleMap f73690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ix.a<hx.b> f73691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, o> f73692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, o> f73693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, String> f73694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ix.a<hx.b> f73695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<jx.e, GroundOverlay> f73696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<String> f73697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f73698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f73699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f73700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f73701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<jx.b> f73702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gx.d.a f73703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final gx.e.a f73704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final gx.f.a f73705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final gx.b.a f73706q;

    class a implements GoogleMap.InfoWindowAdapter {
        a() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoContents(@NonNull Marker marker) {
            View viewInflate = LayoutInflater.from(h.this.f73701l).inflate(fx.c.f66713a, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(fx.b.f66712a);
            if (marker.getSnippet() == null) {
                textView.setText(Html.fromHtml(marker.getTitle()));
                return viewInflate;
            }
            textView.setText(Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
            return viewInflate;
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoWindow(@NonNull Marker marker) {
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, Map<String, BitmapDescriptor>> f73708a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<String, BitmapDescriptor> f73709b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<String, Bitmap> f73710c = new HashMap();
    }

    public h(GoogleMap googleMap, Context context, gx.d dVar, gx.e eVar, gx.f fVar, gx.b bVar, b bVar2) {
        this(googleMap, new HashSet(), null, null, null, new ix.a(), dVar, eVar, fVar, bVar);
        this.f73701l = context;
        this.f73693d = new HashMap<>();
        this.f73698i = bVar2 == null ? new b() : bVar2;
    }

    protected static boolean B(hx.b bVar) {
        return (bVar.f("visibility") && Integer.parseInt(bVar.d("visibility")) == 0) ? false : true;
    }

    private void G(String str, String str2, BitmapDescriptor bitmapDescriptor) {
        Map<String, BitmapDescriptor> map = this.f73698i.f73708a.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.f73698i.f73708a.put(str, map);
        }
        map.put(str2, bitmapDescriptor);
    }

    private BitmapDescriptor K(Bitmap bitmap, double d11) {
        int i11;
        int i12 = (int) (((double) (this.f73701l.getResources().getDisplayMetrics().density * 32.0f)) * d11);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i11 = (int) ((height * i12) / width);
        } else if (width > height) {
            int i13 = (int) ((width * i12) / height);
            i11 = i12;
            i12 = i13;
        } else {
            i11 = i12;
        }
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, i12, i11, false));
    }

    private void L(ix.b bVar) {
        bVar.j();
        bVar.o(null);
        bVar.h();
        bVar.n(null);
        bVar.l();
        bVar.p(null);
    }

    private void M(PolylineOptions polylineOptions, o oVar) {
        PolylineOptions polylineOptionsR = oVar.r();
        if (oVar.z("outlineColor")) {
            polylineOptions.color(polylineOptionsR.getColor());
        }
        if (oVar.z(Snapshot.WIDTH)) {
            polylineOptions.width(polylineOptionsR.getWidth());
        }
        if (oVar.x()) {
            polylineOptions.color(o.g(polylineOptionsR.getColor()));
        }
    }

    private void N(MarkerOptions markerOptions, o oVar, o oVar2) {
        double dN;
        MarkerOptions markerOptionsP = oVar.p();
        if (oVar.z("heading")) {
            markerOptions.rotation(markerOptionsP.getRotation());
        }
        if (oVar.z("hotSpot")) {
            markerOptions.anchor(markerOptionsP.getAnchorU(), markerOptionsP.getAnchorV());
        }
        if (oVar.z("markerColor")) {
            markerOptions.icon(markerOptionsP.getIcon());
        }
        if (oVar.z("iconScale")) {
            dN = oVar.n();
        } else {
            dN = oVar2.z("iconScale") ? oVar2.n() : 1.0d;
        }
        if (oVar.z("iconUrl")) {
            g(oVar.o(), dN, markerOptions);
        } else if (oVar2.o() != null) {
            g(oVar2.o(), dN, markerOptions);
        }
    }

    private void O(PolygonOptions polygonOptions, o oVar) {
        PolygonOptions polygonOptionsQ = oVar.q();
        if (oVar.u() && oVar.z("fillColor")) {
            polygonOptions.fillColor(polygonOptionsQ.getFillColor());
        }
        if (oVar.v()) {
            if (oVar.z("outlineColor")) {
                polygonOptions.strokeColor(polygonOptionsQ.getStrokeColor());
            }
            if (oVar.z(Snapshot.WIDTH)) {
                polygonOptions.strokeWidth(polygonOptionsQ.getStrokeWidth());
            }
        }
        if (oVar.y()) {
            polygonOptions.fillColor(o.g(polygonOptionsQ.getFillColor()));
        }
    }

    private void Q(o oVar, Marker marker, k kVar) {
        boolean zF = kVar.f("name");
        boolean zF2 = kVar.f("description");
        boolean zT = oVar.t();
        boolean zContainsKey = oVar.l().containsKey("text");
        if (zT && zContainsKey) {
            marker.setTitle(r.a(oVar.l().get("text"), kVar));
            r();
            return;
        }
        if (zT && zF) {
            marker.setTitle(kVar.d("name"));
            r();
            return;
        }
        if (zF && zF2) {
            marker.setTitle(kVar.d("name"));
            marker.setSnippet(kVar.d("description"));
            r();
        } else if (zF2) {
            marker.setTitle(kVar.d("description"));
            r();
        } else if (zF) {
            marker.setTitle(kVar.d("name"));
            r();
        }
    }

    private ArrayList<Object> d(ix.b bVar, List<c> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c(bVar, it.next()));
        }
        return arrayList;
    }

    private Polyline f(PolylineOptions polylineOptions, e eVar) {
        polylineOptions.addAll(eVar.d());
        Polyline polylineD = this.f73705p.d(polylineOptions);
        polylineD.setClickable(polylineOptions.isClickable());
        return polylineD;
    }

    private void g(String str, double d11, MarkerOptions markerOptions) {
        BitmapDescriptor bitmapDescriptorW = w(str, d11);
        if (bitmapDescriptorW != null) {
            markerOptions.icon(bitmapDescriptorW);
        } else {
            this.f73697h.add(str);
        }
    }

    private ArrayList<Object> h(k kVar, jx.h hVar, o oVar, o oVar2, boolean z11) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<c> it = hVar.d().iterator();
        while (it.hasNext()) {
            k kVar2 = kVar;
            arrayList.add(e(kVar2, it.next(), oVar, oVar2, z11));
            kVar = kVar2;
        }
        return arrayList;
    }

    private ArrayList<Polyline> i(ix.e eVar, ix.f fVar) {
        ArrayList<Polyline> arrayList = new ArrayList<>();
        Iterator<ix.d> it = fVar.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        throw null;
    }

    private ArrayList<Marker> j(j jVar, ix.g gVar) {
        ArrayList<Marker> arrayList = new ArrayList<>();
        Iterator<ix.i> it = gVar.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        throw null;
    }

    private ArrayList<Polygon> k(l lVar, ix.h hVar) {
        ArrayList<Polygon> arrayList = new ArrayList<>();
        Iterator<ix.k> it = hVar.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        throw null;
    }

    private Marker l(MarkerOptions markerOptions, g gVar) {
        markerOptions.position(gVar.d());
        return this.f73703n.h(markerOptions);
    }

    private Polygon m(PolygonOptions polygonOptions, hx.a aVar) {
        polygonOptions.addAll(aVar.c());
        Iterator<List<LatLng>> it = aVar.b().iterator();
        while (it.hasNext()) {
            polygonOptions.addHole(it.next());
        }
        Polygon polygonD = this.f73704o.d(polygonOptions);
        polygonD.setClickable(polygonOptions.isClickable());
        return polygonD;
    }

    private void r() {
        this.f73703n.j(new a());
    }

    protected o A(String str) {
        return this.f73693d.get(str) != null ? this.f73693d.get(str) : this.f73693d.get(null);
    }

    protected HashMap<String, String> C() {
        return this.f73694e;
    }

    protected HashMap<String, o> D() {
        return this.f73693d;
    }

    public boolean E() {
        return this.f73700k;
    }

    protected void F(Object obj, hx.b bVar) {
        this.f73695f.put(bVar, obj);
    }

    protected void H() {
        this.f73693d.putAll(this.f73692c);
    }

    protected void I(HashMap<String, o> map) {
        this.f73693d.putAll(map);
    }

    protected void J(Object obj) {
        if (obj instanceof Marker) {
            this.f73703n.i((Marker) obj);
            return;
        }
        if (obj instanceof Polyline) {
            this.f73705p.e((Polyline) obj);
            return;
        }
        if (obj instanceof Polygon) {
            this.f73704o.e((Polygon) obj);
            return;
        }
        if (obj instanceof GroundOverlay) {
            this.f73706q.e((GroundOverlay) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                J(it.next());
            }
        }
    }

    protected void P(boolean z11) {
        this.f73700k = z11;
    }

    protected void R(HashMap<String, o> map, HashMap<String, String> map2, HashMap<k, Object> map3, ArrayList<jx.b> arrayList, HashMap<jx.e, GroundOverlay> map4) {
        this.f73692c = map;
        this.f73694e = map2;
        this.f73691b.putAll(map3);
        this.f73702m = arrayList;
        this.f73696g = map4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    protected void b(hx.b bVar) {
        h hVar;
        Object objC = f73688r;
        if (bVar instanceof ix.b) {
            L((ix.b) bVar);
        }
        if (this.f73700k) {
            if (this.f73691b.containsKey(bVar)) {
                J(this.f73691b.get(bVar));
            }
            if (!bVar.e()) {
                hVar = this;
            } else if (bVar instanceof k) {
                k kVar = (k) bVar;
                hVar = this;
                objC = hVar.e(kVar, bVar.a(), A(bVar.b()), kVar.g(), B(bVar));
            } else {
                hVar = this;
                objC = c(bVar, bVar.a());
            }
        } else {
            hVar = this;
        }
        hVar.f73691b.put(bVar, objC);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected Object c(hx.b bVar, c cVar) {
        String strA = cVar.a();
        strA.getClass();
        byte b11 = -1;
        switch (strA.hashCode()) {
            case -2116761119:
                if (strA.equals("MultiPolygon")) {
                    b11 = 0;
                }
                break;
            case -1065891849:
                if (strA.equals("MultiPoint")) {
                    b11 = 1;
                }
                break;
            case -627102946:
                if (strA.equals("MultiLineString")) {
                    b11 = 2;
                }
                break;
            case 77292912:
                if (strA.equals("Point")) {
                    b11 = 3;
                }
                break;
            case 1267133722:
                if (strA.equals("Polygon")) {
                    b11 = 4;
                }
                break;
            case 1806700869:
                if (strA.equals("LineString")) {
                    b11 = 5;
                }
                break;
            case 1950410960:
                if (strA.equals("GeometryCollection")) {
                    b11 = 6;
                }
                break;
        }
        MarkerOptions markerOptionsH = null;
        PolylineOptions polylineOptionsJ = null;
        PolygonOptions polygonOptionsI = null;
        switch (b11) {
            case 0:
                ((ix.b) bVar).l();
                return k(null, (ix.h) cVar);
            case 1:
                ((ix.b) bVar).j();
                return j(null, (ix.g) cVar);
            case 2:
                ((ix.b) bVar).h();
                return i(null, (ix.f) cVar);
            case 3:
                if (bVar instanceof ix.b) {
                    markerOptionsH = ((ix.b) bVar).i();
                } else if (bVar instanceof k) {
                    markerOptionsH = ((k) bVar).h();
                }
                return l(markerOptionsH, (ix.i) cVar);
            case 4:
                if (bVar instanceof ix.b) {
                    polygonOptionsI = ((ix.b) bVar).k();
                } else if (bVar instanceof k) {
                    polygonOptionsI = ((k) bVar).i();
                }
                return m(polygonOptionsI, (hx.a) cVar);
            case 5:
                if (bVar instanceof ix.b) {
                    polylineOptionsJ = ((ix.b) bVar).m();
                } else if (bVar instanceof k) {
                    polylineOptionsJ = ((k) bVar).j();
                }
                return f(polylineOptionsJ, (ix.d) cVar);
            case 6:
                return d((ix.b) bVar, ((ix.c) cVar).f());
            default:
                return null;
        }
    }

    protected Object e(k kVar, c cVar, o oVar, o oVar2, boolean z11) {
        String strA = cVar.a();
        boolean zF = kVar.f("drawOrder");
        byte b11 = 0;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (zF) {
            try {
                f11 = Float.parseFloat(kVar.d("drawOrder"));
            } catch (NumberFormatException unused) {
                zF = false;
            }
        }
        strA.getClass();
        switch (strA.hashCode()) {
            case 77292912:
                if (!strA.equals("Point")) {
                    b11 = -1;
                }
                break;
            case 89139371:
                b11 = !strA.equals("MultiGeometry") ? (byte) -1 : (byte) 1;
                break;
            case 1267133722:
                b11 = !strA.equals("Polygon") ? (byte) -1 : (byte) 2;
                break;
            case 1806700869:
                b11 = !strA.equals("LineString") ? (byte) -1 : (byte) 3;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                MarkerOptions markerOptionsP = oVar.p();
                if (oVar2 != null) {
                    N(markerOptionsP, oVar2, oVar);
                } else if (oVar.o() != null) {
                    g(oVar.o(), oVar.n(), markerOptionsP);
                }
                Marker markerL = l(markerOptionsP, (jx.l) cVar);
                markerL.setVisible(z11);
                Q(oVar, markerL, kVar);
                if (zF) {
                    markerL.setZIndex(f11);
                }
                return markerL;
            case 1:
                return h(kVar, (jx.h) cVar, oVar, oVar2, z11);
            case 2:
                PolygonOptions polygonOptionsQ = oVar.q();
                if (oVar2 != null) {
                    O(polygonOptionsQ, oVar2);
                } else if (oVar.y()) {
                    polygonOptionsQ.fillColor(o.g(polygonOptionsQ.getFillColor()));
                }
                Polygon polygonM = m(polygonOptionsQ, (hx.a) cVar);
                polygonM.setVisible(z11);
                if (zF) {
                    polygonM.setZIndex(f11);
                }
                return polygonM;
            case 3:
                PolylineOptions polylineOptionsR = oVar.r();
                if (oVar2 != null) {
                    M(polylineOptionsR, oVar2);
                } else if (oVar.x()) {
                    polylineOptionsR.color(o.g(polylineOptionsR.getColor()));
                }
                Polyline polylineF = f(polylineOptionsR, (e) cVar);
                polylineF.setVisible(z11);
                if (zF) {
                    polylineF.setZIndex(f11);
                }
                return polylineF;
            default:
                return null;
        }
    }

    public void n(HashMap<String, String> map, HashMap<String, o> map2) {
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    protected GroundOverlay o(GroundOverlayOptions groundOverlayOptions) {
        return this.f73706q.d(groundOverlayOptions);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(String str, Bitmap bitmap) {
        this.f73698i.f73710c.put(str, bitmap);
    }

    protected void q() {
        b bVar;
        if (this.f73699j != 0 || (bVar = this.f73698i) == null || bVar.f73710c.isEmpty()) {
            return;
        }
        this.f73698i.f73710c.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        this.f73699j--;
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        this.f73699j++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HashMap<? extends hx.b, Object> u() {
        return this.f73691b;
    }

    protected BitmapDescriptor v(String str) {
        Bitmap bitmap;
        BitmapDescriptor bitmapDescriptor = this.f73698i.f73709b.get(str);
        if (bitmapDescriptor != null || (bitmap = this.f73698i.f73710c.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
        this.f73698i.f73709b.put(str, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    protected BitmapDescriptor w(String str, double d11) {
        Bitmap bitmap;
        String str2 = f73689s.format(d11);
        Map<String, BitmapDescriptor> map = this.f73698i.f73708a.get(str);
        BitmapDescriptor bitmapDescriptor = map != null ? map.get(str2) : null;
        if (bitmapDescriptor != null || (bitmap = this.f73698i.f73710c.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorK = K(bitmap, d11);
        G(str, str2, bitmapDescriptorK);
        return bitmapDescriptorK;
    }

    protected ArrayList<jx.b> x() {
        return this.f73702m;
    }

    public HashMap<jx.e, GroundOverlay> y() {
        return this.f73696g;
    }

    protected Set<String> z() {
        return this.f73697h;
    }

    private h(GoogleMap googleMap, Set<String> set, j jVar, ix.e eVar, l lVar, ix.a<hx.b> aVar, gx.d dVar, gx.e eVar2, gx.f fVar, gx.b bVar) {
        this.f73691b = new ix.a<>();
        this.f73699j = 0;
        this.f73690a = googleMap;
        this.f73700k = false;
        this.f73697h = set;
        this.f73695f = aVar;
        if (googleMap != null) {
            this.f73703n = (dVar == null ? new gx.d(googleMap) : dVar).c();
            this.f73704o = (eVar2 == null ? new gx.e(googleMap) : eVar2).c();
            this.f73705p = (fVar == null ? new gx.f(googleMap) : fVar).c();
            this.f73706q = (bVar == null ? new gx.b(googleMap) : bVar).c();
            return;
        }
        this.f73703n = null;
        this.f73704o = null;
        this.f73705p = null;
        this.f73706q = null;
    }
}
