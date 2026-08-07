package jx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class n extends hx.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set<String> f84392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f84393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f84394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList<jx.b> f84395w;

    private class a extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f84396a;

        public a(String str) {
            this.f84396a = str;
            n.this.t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return n.this.u0(this.f84396a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f84396a);
            } catch (IOException e11) {
                Log.e("KmlRenderer", "Image [" + this.f84396a + "] download issue", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f84396a);
            } else {
                n.this.p(this.f84396a, bitmap);
                if (n.this.E()) {
                    n nVar = n.this;
                    nVar.j0(this.f84396a, nVar.y(), true);
                    n nVar2 = n.this;
                    nVar2.i0(this.f84396a, nVar2.f84395w, true);
                }
            }
            n.this.s();
        }
    }

    private class b extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f84398a;

        public b(String str) {
            this.f84398a = str;
            n.this.t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return n.this.u0(this.f84398a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f84398a);
            } catch (IOException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f84398a);
            } else {
                n.this.p(this.f84398a, bitmap);
                if (n.this.E()) {
                    n nVar = n.this;
                    nVar.o0(this.f84398a, nVar.u());
                    n nVar2 = n.this;
                    nVar2.f0(this.f84398a, nVar2.f84395w);
                }
            }
            n.this.s();
        }
    }

    n(GoogleMap googleMap, Context context, gx.d dVar, gx.e eVar, gx.f fVar, gx.b bVar, hx.h.b bVar2) {
        super(googleMap, context, dVar, eVar, fVar, bVar, bVar2);
        this.f84392t = new HashSet();
        this.f84393u = false;
        this.f84394v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(String str, Iterable<jx.b> iterable) {
        for (jx.b bVar : iterable) {
            o0(str, bVar.d());
            if (bVar.i()) {
                f0(str, bVar.a());
            }
        }
    }

    private void g0(Iterable<jx.b> iterable, boolean z11) {
        for (jx.b bVar : iterable) {
            boolean zV0 = v0(bVar, z11);
            if (bVar.h() != null) {
                I(bVar.h());
            }
            if (bVar.g() != null) {
                super.n(bVar.g(), D());
            }
            h0(bVar, zV0);
            if (bVar.i()) {
                g0(bVar.a(), zV0);
            }
        }
    }

    private void h0(jx.b bVar, boolean z11) {
        for (k kVar : bVar.c()) {
            boolean z12 = z11 && hx.h.B(kVar);
            if (kVar.a() != null) {
                k kVar2 = kVar;
                Object objE = e(kVar2, kVar.a(), A(kVar.b()), kVar2.g(), z12);
                bVar.k(kVar2, objE);
                F(objE, kVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str, Iterable<jx.b> iterable, boolean z11) {
        for (jx.b bVar : iterable) {
            boolean zV0 = v0(bVar, z11);
            j0(str, bVar.b(), zV0);
            if (bVar.i()) {
                i0(str, bVar.a(), zV0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str, HashMap<e, GroundOverlay> map, boolean z11) {
        BitmapDescriptor bitmapDescriptorV = v(str);
        for (e eVar : map.keySet()) {
            if (eVar.b().equals(str)) {
                GroundOverlay groundOverlayO = o(eVar.a().image(bitmapDescriptorV));
                if (!z11) {
                    groundOverlayO.setVisible(false);
                }
                map.put(eVar, groundOverlayO);
            }
        }
    }

    private void k0(HashMap<e, GroundOverlay> map) {
        for (e eVar : map.keySet()) {
            String strB = eVar.b();
            if (strB != null && eVar.c() != null) {
                if (v(strB) != null) {
                    j0(strB, map, true);
                } else {
                    this.f84392t.add(strB);
                }
            }
        }
    }

    private void l0(HashMap<e, GroundOverlay> map, Iterable<jx.b> iterable) {
        k0(map);
        for (jx.b bVar : iterable) {
            l0(bVar.b(), bVar.a());
        }
    }

    private void m0(String str, o oVar, o oVar2, hx.c cVar, Object obj) {
        if (cVar == null) {
            return;
        }
        if ("Point".equals(cVar.a())) {
            n0(str, oVar, oVar2, (Marker) obj);
        } else if ("MultiGeometry".equals(cVar.a())) {
            p0(str, oVar, oVar2, (hx.f) cVar, (List) obj);
        }
    }

    private void n0(String str, o oVar, o oVar2, Marker marker) {
        boolean z11 = false;
        boolean z12 = oVar2 != null && str.equals(oVar2.o());
        if (oVar != null && str.equals(oVar.o())) {
            z11 = true;
        }
        if (z12) {
            y0(oVar2, marker);
        } else if (z11) {
            y0(oVar, marker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str, HashMap<k, Object> map) {
        for (k kVar : map.keySet()) {
            m0(str, D().get(kVar.b()), kVar.g(), kVar.a(), map.get(kVar));
        }
    }

    private void p0(String str, o oVar, o oVar2, hx.f fVar, List<Object> list) {
        Iterator<hx.c> it = fVar.d().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            m0(str, oVar, oVar2, it.next(), it2.next());
        }
    }

    private void r0(HashMap<? extends hx.b, Object> map) {
        Iterator<? extends hx.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void s0() {
        this.f84394v = true;
        Iterator<String> it = this.f84392t.iterator();
        while (it.hasNext()) {
            new a(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void t0() {
        this.f84393u = true;
        Iterator<String> it = z().iterator();
        while (it.hasNext()) {
            new b(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap u0(String str) {
        return BitmapFactory.decodeStream(x0((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())));
    }

    static boolean v0(jx.b bVar, boolean z11) {
        return z11 && (!bVar.j("visibility") || Integer.parseInt(bVar.e("visibility")) != 0);
    }

    private InputStream x0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z11;
        HttpURLConnection httpURLConnection;
        int responseCode;
        int i11 = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = (httpURLConnection = (HttpURLConnection) uRLConnection).getResponseCode()) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z11 = false;
            } else {
                URL url = httpURLConnection.getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                httpURLConnection.disconnect();
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals("https")) || i11 >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
                i11++;
                z11 = true;
            }
        } while (z11);
        return inputStream;
    }

    private void y0(o oVar, Marker marker) {
        marker.setIcon(w(oVar.o(), oVar.n()));
    }

    void A0(HashMap<String, o> map, HashMap<String, String> map2, HashMap<k, Object> map3, ArrayList<jx.b> arrayList, HashMap<e, GroundOverlay> map4, HashMap<String, Bitmap> map5) {
        R(map, map2, map3, arrayList, map4);
        for (Map.Entry<String, Bitmap> entry : map5.entrySet()) {
            p(entry.getKey(), entry.getValue());
        }
    }

    public void q0() {
        P(true);
        this.f84395w = x();
        H();
        n(C(), D());
        l0(y(), this.f84395w);
        g0(this.f84395w, true);
        r0(u());
        if (!this.f84394v) {
            s0();
        }
        if (!this.f84393u) {
            t0();
        }
        q();
    }

    public Iterable<jx.b> w0() {
        return this.f84395w;
    }

    void z0(HashMap<String, o> map, HashMap<String, String> map2, HashMap<k, Object> map3, ArrayList<jx.b> arrayList, HashMap<e, GroundOverlay> map4) {
        R(map, map2, map3, arrayList, map4);
    }
}
