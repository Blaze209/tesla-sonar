package gx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;

/* JADX INFO: loaded from: classes5.dex */
public class b extends c<GroundOverlay, a> implements GoogleMap.OnGroundOverlayClickListener {

    public class a extends c.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnGroundOverlayClickListener f70002c;

        public a() {
            super();
        }

        public GroundOverlay d(GroundOverlayOptions groundOverlayOptions) {
            GroundOverlay groundOverlayAddGroundOverlay = b.this.f70004a.addGroundOverlay(groundOverlayOptions);
            super.a(groundOverlayAddGroundOverlay);
            return groundOverlayAddGroundOverlay;
        }

        public boolean e(GroundOverlay groundOverlay) {
            return super.b(groundOverlay);
        }

        public void f(GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
            this.f70002c = onGroundOverlayClickListener;
        }
    }

    public b(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // gx.c
    void b() {
        GoogleMap googleMap = this.f70004a;
        if (googleMap != null) {
            googleMap.setOnGroundOverlayClickListener(this);
        }
    }

    public a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gx.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(GroundOverlay groundOverlay) {
        groundOverlay.remove();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(@NonNull GroundOverlay groundOverlay) {
        a aVar = (a) this.f70006c.get(groundOverlay);
        if (aVar == null || aVar.f70002c == null) {
            return;
        }
        aVar.f70002c.onGroundOverlayClick(groundOverlay);
    }
}
