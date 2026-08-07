package f5;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends b5.j {

    static class a extends d {
        a() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setAlpha(a(f11));
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f64391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f64392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f64393h;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f64391f = str.split(",")[1];
            this.f64392g = sparseArray;
        }

        @Override // b5.j
        public void b(int i11, float f11) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // b5.j
        public void d(int i11) {
            int size = this.f64392g.size();
            int iH = this.f64392g.valueAt(0).h();
            double[] dArr = new double[size];
            this.f64393h = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iH);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f64392g.keyAt(i12);
                androidx.constraintlayout.widget.a aVarValueAt = this.f64392g.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.f(this.f64393h);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f64393h;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
            }
            this.f16501a = b5.b.a(i11, dArr, dArr2);
        }

        @Override // f5.d
        public void g(View view, float f11) {
            this.f16501a.e(f11, this.f64393h);
            f5.a.b(this.f64392g.valueAt(0), view, this.f64393h);
        }

        public void h(int i11, androidx.constraintlayout.widget.a aVar) {
            this.f64392g.append(i11, aVar);
        }
    }

    static class c extends d {
        c() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setElevation(a(f11));
        }
    }

    static class e extends d {
        e() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setPivotX(a(f11));
        }
    }

    static class f extends d {
        f() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setPivotY(a(f11));
        }
    }

    static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f64394f = false;

        g() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            Method method;
            if (view instanceof p) {
                ((p) view).setProgress(a(f11));
                return;
            }
            if (this.f64394f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f64394f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f11)));
                } catch (IllegalAccessException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e("ViewSpline", "unable to setProgress", e12);
                }
            }
        }
    }

    static class h extends d {
        h() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setRotation(a(f11));
        }
    }

    static class i extends d {
        i() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setRotationX(a(f11));
        }
    }

    static class j extends d {
        j() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setRotationY(a(f11));
        }
    }

    static class k extends d {
        k() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setScaleX(a(f11));
        }
    }

    static class l extends d {
        l() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setScaleY(a(f11));
        }
    }

    static class m extends d {
        m() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setTranslationX(a(f11));
        }
    }

    static class n extends d {
        n() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setTranslationY(a(f11));
        }
    }

    static class o extends d {
        o() {
        }

        @Override // f5.d
        public void g(View view, float f11) {
            view.setTranslationZ(a(f11));
        }
    }

    public static d e(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static d f(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                return new g();
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new a();
            case "transformPivotX":
                return new e();
            case "transformPivotY":
                return new f();
            case "rotation":
                return new h();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new C1321d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f11);

    /* JADX INFO: renamed from: f5.d$d, reason: collision with other inner class name */
    public static class C1321d extends d {
        public void h(View view, float f11, double d11, double d12) {
            view.setRotation(a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // f5.d
        public void g(View view, float f11) {
        }
    }
}
