package f5;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import b5.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends o {

    static class a extends f {
        a() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setAlpha(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f64400l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f64401m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SparseArray<float[]> f64402n = new SparseArray<>();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f64403o;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f64400l = str.split(",")[1];
            this.f64401m = sparseArray;
        }

        @Override // b5.o
        public void b(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // b5.o
        public void e(int i11) {
            int size = this.f64401m.size();
            int iH = this.f64401m.valueAt(0).h();
            double[] dArr = new double[size];
            int i12 = iH + 2;
            this.f64403o = new float[i12];
            this.f16541g = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.f64401m.keyAt(i13);
                androidx.constraintlayout.widget.a aVarValueAt = this.f64401m.valueAt(i13);
                float[] fArrValueAt = this.f64402n.valueAt(i13);
                dArr[i13] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.f(this.f64403o);
                int i14 = 0;
                while (true) {
                    float[] fArr = this.f64403o;
                    if (i14 < fArr.length) {
                        dArr2[i13][i14] = fArr[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[iH] = fArrValueAt[0];
                dArr3[iH + 1] = fArrValueAt[1];
            }
            this.f16535a = b5.b.a(i11, dArr, dArr2);
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            this.f16535a.e(f11, this.f64403o);
            float[] fArr = this.f64403o;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.f16543i;
            if (Float.isNaN(this.f16544j)) {
                float fA = dVar.a(view, this.f64400l, 0);
                this.f16544j = fA;
                if (Float.isNaN(fA)) {
                    this.f16544j = BitmapDescriptorFactory.HUE_RED;
                }
            }
            float f14 = (float) ((((double) this.f16544j) + ((j12 * 1.0E-9d) * ((double) f12))) % 1.0d);
            this.f16544j = f14;
            this.f16543i = j11;
            float fA2 = a(f14);
            this.f16542h = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f16541g;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f16542h;
                float f15 = this.f64403o[i11];
                this.f16542h = z11 | (((double) f15) != 0.0d);
                fArr2[i11] = (f15 * fA2) + f13;
                i11++;
            }
            f5.a.b(this.f64401m.valueAt(0), view, this.f16541g);
            if (f12 != BitmapDescriptorFactory.HUE_RED) {
                this.f16542h = true;
            }
            return this.f16542h;
        }

        public void j(int i11, androidx.constraintlayout.widget.a aVar, float f11, int i12, float f12) {
            this.f64401m.append(i11, aVar);
            this.f64402n.append(i11, new float[]{f11, f12});
            this.f16536b = Math.max(this.f16536b, i12);
        }
    }

    static class c extends f {
        c() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setElevation(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    public static class d extends f {
        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            return this.f16542h;
        }

        public boolean j(View view, b5.d dVar, float f11, long j11, double d11, double d12) {
            view.setRotation(f(f11, j11, view, dVar) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.f16542h;
        }
    }

    static class e extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f64404l = false;

        e() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            e eVar;
            Method method;
            if (view instanceof p) {
                eVar = this;
                ((p) view).setProgress(f(f11, j11, view, dVar));
            } else {
                eVar = this;
                if (eVar.f64404l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    eVar.f64404l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(eVar.f(f11, j11, view, dVar)));
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e12);
                    }
                }
            }
            return eVar.f16542h;
        }
    }

    /* JADX INFO: renamed from: f5.f$f, reason: collision with other inner class name */
    static class C1322f extends f {
        C1322f() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setRotation(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class g extends f {
        g() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setRotationX(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class h extends f {
        h() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setRotationY(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class i extends f {
        i() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setScaleX(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class j extends f {
        j() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setScaleY(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class k extends f {
        k() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setTranslationX(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class l extends f {
        l() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setTranslationY(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    static class m extends f {
        m() {
        }

        @Override // f5.f
        public boolean i(View view, float f11, long j11, b5.d dVar) {
            view.setTranslationZ(f(f11, j11, view, dVar));
            return this.f16542h;
        }
    }

    public static f g(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static f h(String str, long j11) {
        f gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C1322f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j11);
        return gVar;
    }

    public float f(float f11, long j11, View view, b5.d dVar) {
        this.f16535a.e(f11, this.f16541g);
        float[] fArr = this.f16541g;
        float f12 = fArr[1];
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            this.f16542h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f16544j)) {
            float fA = dVar.a(view, this.f16540f, 0);
            this.f16544j = fA;
            if (Float.isNaN(fA)) {
                this.f16544j = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f13 = (float) ((((double) this.f16544j) + (((j11 - this.f16543i) * 1.0E-9d) * ((double) f12))) % 1.0d);
        this.f16544j = f13;
        dVar.b(view, this.f16540f, 0, f13);
        this.f16543i = j11;
        float f14 = this.f16541g[0];
        float fA2 = (a(this.f16544j) * f14) + this.f16541g[2];
        this.f16542h = (f14 == BitmapDescriptorFactory.HUE_RED && f12 == BitmapDescriptorFactory.HUE_RED) ? false : true;
        return fA2;
    }

    public abstract boolean i(View view, float f11, long j11, b5.d dVar);
}
