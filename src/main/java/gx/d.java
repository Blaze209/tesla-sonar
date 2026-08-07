package gx;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes5.dex */
public class d extends c<Marker, a> implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter, GoogleMap.OnInfoWindowLongClickListener {

    public class a extends c.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnInfoWindowClickListener f70010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private GoogleMap.OnInfoWindowLongClickListener f70011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private GoogleMap.OnMarkerClickListener f70012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private GoogleMap.OnMarkerDragListener f70013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private GoogleMap.InfoWindowAdapter f70014g;

        public a() {
            super();
        }

        public Marker h(MarkerOptions markerOptions) {
            Marker markerAddMarker = d.this.f70004a.addMarker(markerOptions);
            super.a(markerAddMarker);
            return markerAddMarker;
        }

        public boolean i(Marker marker) {
            return super.b(marker);
        }

        public void j(GoogleMap.InfoWindowAdapter infoWindowAdapter) {
            this.f70014g = infoWindowAdapter;
        }

        public void k(GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.f70010c = onInfoWindowClickListener;
        }

        public void l(GoogleMap.OnMarkerClickListener onMarkerClickListener) {
            this.f70012e = onMarkerClickListener;
        }

        public void m(GoogleMap.OnMarkerDragListener onMarkerDragListener) {
            this.f70013f = onMarkerDragListener;
        }
    }

    public d(GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // gx.c
    void b() {
        GoogleMap googleMap = this.f70004a;
        if (googleMap != null) {
            googleMap.setOnInfoWindowClickListener(this);
            this.f70004a.setOnInfoWindowLongClickListener(this);
            this.f70004a.setOnMarkerClickListener(this);
            this.f70004a.setOnMarkerDragListener(this);
            this.f70004a.setInfoWindowAdapter(this);
        }
    }

    public a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gx.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Marker marker) {
        marker.remove();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70014g == null) {
            return null;
        }
        return aVar.f70014g.getInfoContents(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70014g == null) {
            return null;
        }
        return aVar.f70014g.getInfoWindow(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70010c == null) {
            return;
        }
        aVar.f70010c.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70011d == null) {
            return;
        }
        aVar.f70011d.onInfoWindowLongClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70012e == null) {
            return false;
        }
        return aVar.f70012e.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70013f == null) {
            return;
        }
        aVar.f70013f.onMarkerDrag(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70013f == null) {
            return;
        }
        aVar.f70013f.onMarkerDragEnd(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(@NonNull Marker marker) {
        a aVar = (a) this.f70006c.get(marker);
        if (aVar == null || aVar.f70013f == null) {
            return;
        }
        aVar.f70013f.onMarkerDragStart(marker);
    }
}
