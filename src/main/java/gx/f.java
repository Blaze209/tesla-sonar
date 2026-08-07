package gx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

/* JADX INFO: loaded from: classes5.dex */
public class f extends c<Polyline, a> implements GoogleMap.OnPolylineClickListener {

    public class a extends c.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnPolylineClickListener f70018c;

        public a() {
            super();
        }

        public Polyline d(PolylineOptions polylineOptions) {
            Polyline polylineAddPolyline = f.this.f70004a.addPolyline(polylineOptions);
            super.a(polylineAddPolyline);
            return polylineAddPolyline;
        }

        public boolean e(Polyline polyline) {
            return super.b(polyline);
        }

        public void f(GoogleMap.OnPolylineClickListener onPolylineClickListener) {
            this.f70018c = onPolylineClickListener;
        }
    }

    public f(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // gx.c
    void b() {
        GoogleMap googleMap = this.f70004a;
        if (googleMap != null) {
            googleMap.setOnPolylineClickListener(this);
        }
    }

    public a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gx.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Polyline polyline) {
        polyline.remove();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(@NonNull Polyline polyline) {
        a aVar = (a) this.f70006c.get(polyline);
        if (aVar == null || aVar.f70018c == null) {
            return;
        }
        aVar.f70018c.onPolylineClick(polyline);
    }
}
