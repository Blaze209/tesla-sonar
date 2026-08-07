package f5;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b5.e {

    static class a extends c {
        a() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setAlpha(a(f11));
        }
    }

    static class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f64388h = new float[1];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f64389i;

        b() {
        }

        @Override // b5.e
        protected void b(Object obj) {
            this.f64389i = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // f5.c
        public void i(View view, float f11) {
            this.f64388h[0] = a(f11);
            f5.a.b(this.f64389i, view, this.f64388h);
        }
    }

    /* JADX INFO: renamed from: f5.c$c, reason: collision with other inner class name */
    static class C1320c extends c {
        C1320c() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setElevation(a(f11));
        }
    }

    static class e extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f64390h = false;

        e() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            Method method;
            if (view instanceof p) {
                ((p) view).setProgress(a(f11));
                return;
            }
            if (this.f64390h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f64390h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f11)));
                } catch (IllegalAccessException e11) {
                    Log.e("ViewOscillator", "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e("ViewOscillator", "unable to setProgress", e12);
                }
            }
        }
    }

    static class f extends c {
        f() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setRotation(a(f11));
        }
    }

    static class g extends c {
        g() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setRotationX(a(f11));
        }
    }

    static class h extends c {
        h() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setRotationY(a(f11));
        }
    }

    static class i extends c {
        i() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setScaleX(a(f11));
        }
    }

    static class j extends c {
        j() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setScaleY(a(f11));
        }
    }

    static class k extends c {
        k() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setTranslationX(a(f11));
        }
    }

    static class l extends c {
        l() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setTranslationY(a(f11));
        }
    }

    static class m extends c {
        m() {
        }

        @Override // f5.c
        public void i(View view, float f11) {
            view.setTranslationZ(a(f11));
        }
    }

    public static c h(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new C1320c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void i(View view, float f11);

    public static class d extends c {
        public void j(View view, float f11, double d11, double d12) {
            view.setRotation(a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // f5.c
        public void i(View view, float f11) {
        }
    }
}
