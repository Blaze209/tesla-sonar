package gx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

/* JADX INFO: loaded from: classes5.dex */
public class e extends c<Polygon, a> implements GoogleMap.OnPolygonClickListener {

    public class a extends c.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnPolygonClickListener f70016c;

        public a() {
            super();
        }

        public Polygon d(PolygonOptions polygonOptions) {
            Polygon polygonAddPolygon = e.this.f70004a.addPolygon(polygonOptions);
            super.a(polygonAddPolygon);
            return polygonAddPolygon;
        }

        public boolean e(Polygon polygon) {
            return super.b(polygon);
        }

        public void f(GoogleMap.OnPolygonClickListener onPolygonClickListener) {
            this.f70016c = onPolygonClickListener;
        }
    }

    public e(GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // gx.c
    void b() {
        GoogleMap googleMap = this.f70004a;
        if (googleMap != null) {
            googleMap.setOnPolygonClickListener(this);
        }
    }

    public a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gx.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Polygon polygon) {
        polygon.remove();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(@NonNull Polygon polygon) {
        a aVar = (a) this.f70006c.get(polygon);
        if (aVar == null || aVar.f70016c == null) {
            return;
        }
        aVar.f70016c.onPolygonClick(polygon);
    }
}
