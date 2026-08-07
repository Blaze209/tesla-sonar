package gx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;

/* JADX INFO: loaded from: classes5.dex */
public class a extends c<Circle, C1443a> implements GoogleMap.OnCircleClickListener {

    /* JADX INFO: renamed from: gx.a$a, reason: collision with other inner class name */
    public class C1443a extends c.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnCircleClickListener f70000c;

        public C1443a() {
            super();
        }

        public Circle d(CircleOptions circleOptions) {
            Circle circleAddCircle = a.this.f70004a.addCircle(circleOptions);
            super.a(circleAddCircle);
            return circleAddCircle;
        }

        public boolean e(Circle circle) {
            return super.b(circle);
        }
    }

    public a(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // gx.c
    void b() {
        GoogleMap googleMap = this.f70004a;
        if (googleMap != null) {
            googleMap.setOnCircleClickListener(this);
        }
    }

    public C1443a c() {
        return new C1443a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gx.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Circle circle) {
        circle.remove();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(@NonNull Circle circle) {
        C1443a c1443a = (C1443a) this.f70006c.get(circle);
        if (c1443a == null || c1443a.f70000c == null) {
            return;
        }
        c1443a.f70000c.onCircleClick(circle);
    }
}
