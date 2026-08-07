package vs;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f119780a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f119781b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f119782c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f119783d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f119784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f119785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f119786g;

    public interface a {
        void a(float[] fArr, float f11);
    }

    public d(Display display, a... aVarArr) {
        this.f119784e = display;
        this.f119785f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f119781b);
        SensorManager.getOrientation(this.f119781b, this.f119783d);
        return this.f119783d[2];
    }

    private void b(float[] fArr, float f11) {
        for (a aVar : this.f119785f) {
            aVar.a(fArr, f11);
        }
    }

    private void c(float[] fArr) {
        if (!this.f119786g) {
            c.a(this.f119782c, fArr);
            this.f119786g = true;
        }
        float[] fArr2 = this.f119781b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f119781b, 0, this.f119782c, 0);
    }

    private void d(float[] fArr, int i11) {
        if (i11 != 0) {
            int i12 = EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
            int i13 = 1;
            if (i11 == 1) {
                i13 = 129;
                i12 = 2;
            } else if (i11 == 2) {
                i13 = 130;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                i12 = 130;
            }
            float[] fArr2 = this.f119781b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f119781b, i12, i13, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f119780a, sensorEvent.values);
        d(this.f119780a, this.f119784e.getRotation());
        float fA = a(this.f119780a);
        e(this.f119780a);
        c(this.f119780a);
        b(this.f119780a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
