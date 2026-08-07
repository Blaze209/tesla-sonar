package jx;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class o extends hx.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f84404h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f84402f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f84403g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f84406j = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, String> f84400d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f84401e = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f84405i = 1.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f84410n = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f84407k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f84408l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f84409m = false;

    o() {
    }

    public static int g(int i11) {
        Random random = new Random();
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static String h(String str) {
        String strTrim = str.trim();
        if (strTrim.length() <= 6) {
            return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
        }
        return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
    }

    private static MarkerOptions i(MarkerOptions markerOptions, boolean z11, float f11) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z11) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(m(g((int) f11))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions j(PolygonOptions polygonOptions, boolean z11, boolean z12) {
        float strokeWidth;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z11) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z12) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            strokeWidth = polygonOptions.getStrokeWidth();
        } else {
            strokeWidth = BitmapDescriptorFactory.HUE_RED;
        }
        polygonOptions2.strokeWidth(strokeWidth);
        polygonOptions2.clickable(polygonOptions.isClickable());
        return polygonOptions2;
    }

    private static PolylineOptions k(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.clickable(polylineOptions.isClickable());
        return polylineOptions2;
    }

    private static float m(int i11) {
        float[] fArr = new float[3];
        Color.colorToHSV(i11, fArr);
        return fArr[0];
    }

    public void A(boolean z11) {
        this.f84402f = z11;
    }

    void B(String str) {
        e(Color.parseColor("#" + h(str)));
        this.f84401e.add("fillColor");
    }

    void C(float f11) {
        d(f11);
        this.f84401e.add("heading");
    }

    void D(float f11, float f12, String str, String str2) {
        c(f11, f12, str, str2);
        this.f84401e.add("hotSpot");
    }

    void E(String str) {
        this.f84407k = str.equals("random");
        this.f84401e.add("iconColorMode");
    }

    void F(double d11) {
        this.f84405i = d11;
        this.f84401e.add("iconScale");
    }

    void G(String str) {
        this.f84404h = str;
        this.f84401e.add("iconUrl");
    }

    void H(String str) {
        this.f84400d.put("text", str);
    }

    void I(String str) {
        this.f84408l = str.equals("random");
        this.f84401e.add("lineColorMode");
    }

    void J(String str) {
        float fM = m(Color.parseColor("#" + h(str)));
        this.f84410n = fM;
        this.f73711a.icon(BitmapDescriptorFactory.defaultMarker(fM));
        this.f84401e.add("markerColor");
    }

    void K(boolean z11) {
        this.f84403g = z11;
        this.f84401e.add("outline");
    }

    void L(String str) {
        this.f73712b.color(Color.parseColor("#" + h(str)));
        this.f73713c.strokeColor(Color.parseColor("#" + h(str)));
        this.f84401e.add("outlineColor");
    }

    void M(String str) {
        this.f84409m = str.equals("random");
        this.f84401e.add("polyColorMode");
    }

    void N(String str) {
        this.f84406j = str;
    }

    void O(Float f11) {
        b(f11.floatValue());
        f(f11.floatValue());
        this.f84401e.add(Snapshot.WIDTH);
    }

    public HashMap<String, String> l() {
        return this.f84400d;
    }

    public double n() {
        return this.f84405i;
    }

    public String o() {
        return this.f84404h;
    }

    public MarkerOptions p() {
        return i(this.f73711a, w(), this.f84410n);
    }

    public PolygonOptions q() {
        return j(this.f73713c, this.f84402f, this.f84403g);
    }

    public PolylineOptions r() {
        return k(this.f73712b);
    }

    String s() {
        return this.f84406j;
    }

    public boolean t() {
        return this.f84400d.size() > 0;
    }

    public String toString() {
        return "Style{\n balloon options=" + this.f84400d + ",\n fill=" + this.f84402f + ",\n outline=" + this.f84403g + ",\n icon url=" + this.f84404h + ",\n scale=" + this.f84405i + ",\n style id=" + this.f84406j + "\n}\n";
    }

    public boolean u() {
        return this.f84402f;
    }

    public boolean v() {
        return this.f84403g;
    }

    boolean w() {
        return this.f84407k;
    }

    public boolean x() {
        return this.f84408l;
    }

    public boolean y() {
        return this.f84409m;
    }

    public boolean z(String str) {
        return this.f84401e.contains(str);
    }
}
