package com.facebook.react.uimanager;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b.\u0010/J\u001f\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u00101J\u001f\u00103\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u00101J\u001f\u00104\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u00101J'\u00105\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b5\u00106J/\u00108\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u00101J\u001f\u0010<\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b<\u00101J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u00101J\u001f\u0010=\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b=\u00101J\u001f\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u00101¨\u0006>"}, d2 = {"Lcom/facebook/react/uimanager/q;", "", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "", "o", "(D)Z", "", "out", "a", "b", "Ljn0/h0;", "p", "([D[D[D)V", Snapshot.TRANSFORM_MATRIX, "Lcom/facebook/react/uimanager/q$a;", "ctx", "k", "([DLcom/facebook/react/uimanager/q$a;)V", "matrix", "m", "([D)D", "n", "([D)[D", "t", "v", "result", "q", "x", "vector", "norm", "y", "([DD)[D", "w", "([D[D)D", "aScale", "bScale", "u", "([D[DDD)[D", "([D[D)[D", "s", "(D)D", "degrees", "l", "r", "([D)V", "perspective", "([DD)V", "factor", "e", "f", IntegerTokenConverter.CONVERTER_KEY, "([DDD)V", "z", "j", "([DDDD)V", "radians", "g", "h", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f23356a = new q();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\f\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/uimanager/q$a;", "", "<init>", "()V", "Ljn0/h0;", "a", "", "[D", "perspective", "b", "scale", "c", "skew", DateTokenConverter.CONVERTER_KEY, "translation", "e", "rotationDegrees", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C0456a f23357f = new C0456a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public double[] perspective = new double[4];

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public double[] scale = new double[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public double[] skew = new double[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public double[] translation = new double[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public double[] rotationDegrees = new double[3];

        /* JADX INFO: renamed from: com.facebook.react.uimanager.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/q$a$a;", "", "<init>", "()V", "", "arr", "Ljn0/h0;", "b", "([D)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class C0456a {
            public /* synthetic */ C0456a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(double[] arr) {
                int length = arr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    arr[i11] = 0.0d;
                }
            }

            private C0456a() {
            }
        }

        public final void a() {
            C0456a c0456a = f23357f;
            c0456a.b(this.perspective);
            c0456a.b(this.scale);
            c0456a.b(this.skew);
            c0456a.b(this.translation);
            c0456a.b(this.rotationDegrees);
        }
    }

    private q() {
    }

    public static final void a(double[] m11, double perspective) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[11] = ((double) (-1)) / perspective;
    }

    public static final void b(double[] m11, double radians) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[5] = Math.cos(radians);
        m11[6] = Math.sin(radians);
        m11[9] = -Math.sin(radians);
        m11[10] = Math.cos(radians);
    }

    public static final void c(double[] m11, double radians) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[0] = Math.cos(radians);
        m11[2] = -Math.sin(radians);
        m11[8] = Math.sin(radians);
        m11[10] = Math.cos(radians);
    }

    public static final void d(double[] m11, double radians) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[0] = Math.cos(radians);
        m11[1] = Math.sin(radians);
        m11[4] = -Math.sin(radians);
        m11[5] = Math.cos(radians);
    }

    public static final void e(double[] m11, double factor) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[0] = factor;
    }

    public static final void f(double[] m11, double factor) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[5] = factor;
    }

    public static final void g(double[] m11, double radians) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[4] = Math.tan(radians);
    }

    public static final void h(double[] m11, double radians) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[1] = Math.tan(radians);
    }

    public static final void i(double[] m11, double x11, double y11) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[12] = x11;
        m11[13] = y11;
    }

    public static final void j(double[] m11, double x11, double y11, double z11) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        m11[12] = x11;
        m11[13] = y11;
        m11[14] = z11;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[LOOP:3: B:36:0x00ce->B:37:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[LOOP:4: B:39:0x00dd->B:40:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[LOOP:5: B:42:0x00e8->B:43:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193 A[LOOP:6: B:47:0x0191->B:48:0x0193, LOOP_END] */
    public static final void k(double[] transformMatrix, a ctx) {
        char c11;
        int i11;
        double[][] dArr;
        int i12;
        int i13;
        double[] dArrY;
        int i14;
        p013kotlin.jvm.internal.s.k(transformMatrix, "transformMatrix");
        p013kotlin.jvm.internal.s.k(ctx, "ctx");
        gn.a.a(transformMatrix.length == 16);
        double[] dArr2 = ctx.perspective;
        double[] dArr3 = ctx.scale;
        double[] dArr4 = ctx.skew;
        double[] dArr5 = ctx.translation;
        double[] dArr6 = ctx.rotationDegrees;
        if (f23356a.o(transformMatrix[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i15 = 0; i15 < 4; i15++) {
            dArr7[i15] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i16 = 0; i16 < 4; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                int i18 = (i16 * 4) + i17;
                double d11 = transformMatrix[i18] / transformMatrix[15];
                dArr7[i16][i17] = d11;
                if (i17 == 3) {
                    d11 = 0.0d;
                }
                dArr8[i18] = d11;
            }
        }
        dArr8[15] = 1.0d;
        q qVar = f23356a;
        if (qVar.o(m(dArr8))) {
            return;
        }
        if (qVar.o(dArr7[0][3])) {
            c11 = 2;
            if (qVar.o(dArr7[1][3]) && qVar.o(dArr7[2][3])) {
                dArr2[2] = 0.0d;
                dArr2[1] = 0.0d;
                dArr2[0] = 0.0d;
                dArr2[3] = 1.0d;
            }
            for (i11 = 0; i11 < 3; i11++) {
                dArr5[i11] = dArr7[3][i11];
            }
            dArr = new double[3][];
            for (i12 = 0; i12 < 3; i12++) {
                dArr[i12] = new double[3];
            }
            for (i13 = 0; i13 < 3; i13++) {
                double[] dArr9 = dArr[i13];
                double[] dArr10 = dArr7[i13];
                dArr9[0] = dArr10[0];
                dArr9[1] = dArr10[1];
                dArr9[c11] = dArr10[c11];
            }
            double dX = x(dArr[0]);
            dArr3[0] = dX;
            double[] dArrY2 = y(dArr[0], dX);
            dArr[0] = dArrY2;
            double dW = w(dArrY2, dArr[1]);
            dArr4[0] = dW;
            double[] dArrU = u(dArr[1], dArr[0], 1.0d, -dW);
            dArr[1] = dArrU;
            double dX2 = x(dArrU);
            dArr3[1] = dX2;
            dArr[1] = y(dArr[1], dX2);
            dArr4[0] = dArr4[0] / dArr3[1];
            double dW2 = w(dArr[0], dArr[c11]);
            dArr4[1] = dW2;
            double[] dArrU2 = u(dArr[c11], dArr[0], 1.0d, -dW2);
            dArr[c11] = dArrU2;
            double dW3 = w(dArr[1], dArrU2);
            dArr4[c11] = dW3;
            double[] dArrU3 = u(dArr[c11], dArr[1], 1.0d, -dW3);
            dArr[c11] = dArrU3;
            double dX3 = x(dArrU3);
            dArr3[c11] = dX3;
            dArrY = y(dArr[c11], dX3);
            dArr[c11] = dArrY;
            double d12 = dArr4[1];
            double d13 = dArr3[c11];
            dArr4[1] = d12 / d13;
            dArr4[c11] = dArr4[c11] / d13;
            if (w(dArr[0], v(dArr[1], dArrY)) < 0.0d) {
                for (i14 = 0; i14 < 3; i14++) {
                    dArr3[i14] = dArr3[i14] * (-1.0d);
                    double[] dArr11 = dArr[i14];
                    dArr11[0] = dArr11[0] * (-1.0d);
                    dArr11[1] = dArr11[1] * (-1.0d);
                    dArr11[c11] = dArr11[c11] * (-1.0d);
                }
            }
            double[] dArr12 = dArr[c11];
            dArr6[0] = s((-Math.atan2(dArr12[1], dArr12[c11])) * 57.29577951308232d);
            double[] dArr13 = dArr[c11];
            double d14 = -dArr13[0];
            double d15 = dArr13[1];
            double d16 = dArr13[c11];
            dArr6[1] = s((-Math.atan2(d14, Math.sqrt((d15 * d15) + (d16 * d16)))) * 57.29577951308232d);
            dArr6[c11] = s((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
        }
        c11 = 2;
        double d17 = dArr7[0][3];
        double d18 = dArr7[1][3];
        double d19 = dArr7[c11][3];
        double d21 = dArr7[3][3];
        double[] dArr14 = new double[4];
        dArr14[0] = d17;
        dArr14[1] = d18;
        dArr14[c11] = d19;
        dArr14[3] = d21;
        q(dArr14, t(n(dArr8)), dArr2);
        while (i11 < 3) {
            dArr5[i11] = dArr7[3][i11];
        }
        dArr = new double[3][];
        while (i12 < 3) {
            dArr[i12] = new double[3];
        }
        while (i13 < 3) {
            double[] dArr15 = dArr[i13];
            double[] dArr16 = dArr7[i13];
            dArr15[0] = dArr16[0];
            dArr15[1] = dArr16[1];
            dArr15[c11] = dArr16[c11];
        }
        double dX4 = x(dArr[0]);
        dArr3[0] = dX4;
        double[] dArrY3 = y(dArr[0], dX4);
        dArr[0] = dArrY3;
        double dW4 = w(dArrY3, dArr[1]);
        dArr4[0] = dW4;
        double[] dArrU4 = u(dArr[1], dArr[0], 1.0d, -dW4);
        dArr[1] = dArrU4;
        double dX5 = x(dArrU4);
        dArr3[1] = dX5;
        dArr[1] = y(dArr[1], dX5);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dW5 = w(dArr[0], dArr[c11]);
        dArr4[1] = dW5;
        double[] dArrU5 = u(dArr[c11], dArr[0], 1.0d, -dW5);
        dArr[c11] = dArrU5;
        double dW6 = w(dArr[1], dArrU5);
        dArr4[c11] = dW6;
        double[] dArrU6 = u(dArr[c11], dArr[1], 1.0d, -dW6);
        dArr[c11] = dArrU6;
        double dX6 = x(dArrU6);
        dArr3[c11] = dX6;
        dArrY = y(dArr[c11], dX6);
        dArr[c11] = dArrY;
        double d110 = dArr4[1];
        double d111 = dArr3[c11];
        dArr4[1] = d110 / d111;
        dArr4[c11] = dArr4[c11] / d111;
        if (w(dArr[0], v(dArr[1], dArrY)) < 0.0d) {
            while (i14 < 3) {
                dArr3[i14] = dArr3[i14] * (-1.0d);
                double[] dArr17 = dArr[i14];
                dArr17[0] = dArr17[0] * (-1.0d);
                dArr17[1] = dArr17[1] * (-1.0d);
                dArr17[c11] = dArr17[c11] * (-1.0d);
            }
        }
        double[] dArr18 = dArr[c11];
        dArr6[0] = s((-Math.atan2(dArr18[1], dArr18[c11])) * 57.29577951308232d);
        double[] dArr19 = dArr[c11];
        double d112 = -dArr19[0];
        double d113 = dArr19[1];
        double d114 = dArr19[c11];
        dArr6[1] = s((-Math.atan2(d112, Math.sqrt((d113 * d113) + (d114 * d114)))) * 57.29577951308232d);
        dArr6[c11] = s((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
    }

    public static final double l(double degrees) {
        return (degrees * 3.141592653589793d) / ((double) 180);
    }

    public static final double m(double[] matrix) {
        p013kotlin.jvm.internal.s.k(matrix, "matrix");
        double d11 = matrix[0];
        double d12 = matrix[1];
        double d13 = matrix[2];
        double d14 = matrix[3];
        double d15 = matrix[4];
        double d16 = matrix[5];
        double d17 = matrix[6];
        double d18 = matrix[7];
        double d19 = matrix[8];
        double d21 = matrix[9];
        double d22 = matrix[10];
        double d23 = matrix[11];
        double d24 = matrix[12];
        double d25 = matrix[13];
        double d26 = matrix[14];
        double d27 = matrix[15];
        double d28 = d14 * d17;
        double d29 = d13 * d18;
        double d31 = d14 * d16;
        double d32 = d12 * d18;
        double d33 = d13 * d16;
        double d34 = d12 * d17;
        double d35 = d14 * d15;
        double d36 = d18 * d11;
        double d37 = d13 * d15;
        double d38 = d17 * d11;
        double d39 = d12 * d15;
        double d41 = d11 * d16;
        return ((((((((((((((((((((((((d28 * d21) * d24) - ((d29 * d21) * d24)) - ((d31 * d22) * d24)) + ((d32 * d22) * d24)) + ((d33 * d23) * d24)) - ((d34 * d23) * d24)) - ((d28 * d19) * d25)) + ((d29 * d19) * d25)) + ((d35 * d22) * d25)) - ((d36 * d22) * d25)) - ((d37 * d23) * d25)) + ((d38 * d23) * d25)) + ((d31 * d19) * d26)) - ((d32 * d19) * d26)) - ((d35 * d21) * d26)) + ((d36 * d21) * d26)) + ((d39 * d23) * d26)) - ((d23 * d41) * d26)) - ((d33 * d19) * d27)) + ((d34 * d19) * d27)) + ((d37 * d21) * d27)) - ((d38 * d21) * d27)) - ((d39 * d22) * d27)) + (d41 * d22 * d27);
    }

    public static final double[] n(double[] matrix) {
        p013kotlin.jvm.internal.s.k(matrix, "matrix");
        double dM = m(matrix);
        if (f23356a.o(dM)) {
            return matrix;
        }
        double d11 = matrix[0];
        double d12 = matrix[1];
        double d13 = matrix[2];
        double d14 = matrix[3];
        double d15 = matrix[4];
        double d16 = matrix[5];
        double d17 = matrix[6];
        double d18 = matrix[7];
        double d19 = matrix[8];
        double d21 = matrix[9];
        double d22 = matrix[10];
        double d23 = matrix[11];
        double d24 = matrix[12];
        double d25 = matrix[13];
        double d26 = matrix[14];
        double d27 = matrix[15];
        double d28 = d17 * d23;
        double d29 = d18 * d22;
        double d31 = d18 * d21;
        double d32 = d16 * d23;
        double d33 = d17 * d21;
        double d34 = d16 * d22;
        double d35 = d14 * d22;
        double d36 = d13 * d23;
        double d37 = d14 * d21;
        double d38 = d12 * d23;
        double d39 = d13 * d21;
        double d41 = d12 * d22;
        double d42 = d13 * d18;
        double d43 = d14 * d17;
        double d44 = d14 * d16;
        double d45 = d12 * d18;
        double d46 = d13 * d16;
        double d47 = d12 * d17;
        double d48 = (d29 * d24) - (d28 * d24);
        double d49 = d18 * d19;
        double d51 = d15 * d23;
        double d52 = d17 * d19;
        double d53 = d15 * d22;
        double d54 = (d36 * d24) - (d35 * d24);
        double d55 = d14 * d19;
        double d56 = d11 * d23;
        double d57 = d13 * d19;
        double d58 = d11 * d22;
        double d59 = d14 * d15;
        double d61 = d18 * d11;
        double d62 = d13 * d15;
        double d63 = d17 * d11;
        double d64 = (((d32 * d24) - (d31 * d24)) + (d49 * d25)) - (d51 * d25);
        double d65 = d16 * d19;
        double d66 = d15 * d21;
        double d67 = (((d37 * d24) - (d38 * d24)) - (d55 * d25)) + (d56 * d25);
        double d68 = d12 * d19;
        double d69 = d11 * d21;
        double d71 = d12 * d15;
        double d72 = d11 * d16;
        return new double[]{((((((d28 * d25) - (d29 * d25)) + (d31 * d26)) - (d32 * d26)) - (d33 * d27)) + (d34 * d27)) / dM, ((((((d35 * d25) - (d36 * d25)) - (d37 * d26)) + (d38 * d26)) + (d39 * d27)) - (d41 * d27)) / dM, ((((((d42 * d25) - (d43 * d25)) + (d44 * d26)) - (d45 * d26)) - (d46 * d27)) + (d47 * d27)) / dM, ((((((d43 * d21) - (d42 * d21)) - (d44 * d22)) + (d45 * d22)) + (d46 * d23)) - (d47 * d23)) / dM, ((((d48 - (d49 * d26)) + (d51 * d26)) + (d52 * d27)) - (d53 * d27)) / dM, ((((d54 + (d55 * d26)) - (d56 * d26)) - (d57 * d27)) + (d58 * d27)) / dM, ((((((d43 * d24) - (d42 * d24)) - (d59 * d26)) + (d61 * d26)) + (d62 * d27)) - (d63 * d27)) / dM, ((((((d42 * d19) - (d43 * d19)) + (d59 * d22)) - (d61 * d22)) - (d62 * d23)) + (d63 * d23)) / dM, ((d64 - (d65 * d27)) + (d66 * d27)) / dM, ((d67 + (d68 * d27)) - (d69 * d27)) / dM, ((((((d45 * d24) - (d44 * d24)) + (d59 * d25)) - (d61 * d25)) - (d71 * d27)) + (d27 * d72)) / dM, ((((((d44 * d19) - (d45 * d19)) - (d59 * d21)) + (d61 * d21)) + (d71 * d23)) - (d23 * d72)) / dM, ((((((d33 * d24) - (d34 * d24)) - (d52 * d25)) + (d53 * d25)) + (d65 * d26)) - (d66 * d26)) / dM, ((((((d41 * d24) - (d39 * d24)) + (d57 * d25)) - (d58 * d25)) - (d68 * d26)) + (d69 * d26)) / dM, ((((((d46 * d24) - (d24 * d47)) - (d62 * d25)) + (d25 * d63)) + (d71 * d26)) - (d26 * d72)) / dM, ((((((d47 * d19) - (d46 * d19)) + (d62 * d21)) - (d63 * d21)) - (d71 * d22)) + (d72 * d22)) / dM};
    }

    private final boolean o(double d11) {
        return !Double.isNaN(d11) && Math.abs(d11) < 1.0E-5d;
    }

    public static final void p(double[] out, double[] a11, double[] b11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        p013kotlin.jvm.internal.s.k(a11, "a");
        p013kotlin.jvm.internal.s.k(b11, "b");
        double d11 = a11[0];
        double d12 = a11[1];
        double d13 = a11[2];
        double d14 = a11[3];
        double d15 = a11[4];
        double d16 = a11[5];
        double d17 = a11[6];
        double d18 = a11[7];
        double d19 = a11[8];
        double d21 = a11[9];
        double d22 = a11[10];
        double d23 = a11[11];
        double d24 = a11[12];
        double d25 = a11[13];
        double d26 = a11[14];
        double d27 = a11[15];
        double d28 = b11[0];
        double d29 = b11[1];
        double d31 = b11[2];
        double d32 = b11[3];
        out[0] = (d28 * d11) + (d29 * d15) + (d31 * d19) + (d32 * d24);
        out[1] = (d28 * d12) + (d29 * d16) + (d31 * d21) + (d32 * d25);
        out[2] = (d28 * d13) + (d29 * d17) + (d31 * d22) + (d32 * d26);
        out[3] = (d28 * d14) + (d29 * d18) + (d31 * d23) + (d32 * d27);
        double d33 = b11[4];
        double d34 = b11[5];
        double d35 = b11[6];
        double d36 = b11[7];
        out[4] = (d33 * d11) + (d34 * d15) + (d35 * d19) + (d36 * d24);
        out[5] = (d33 * d12) + (d34 * d16) + (d35 * d21) + (d36 * d25);
        out[6] = (d33 * d13) + (d34 * d17) + (d35 * d22) + (d36 * d26);
        out[7] = (d33 * d14) + (d34 * d18) + (d35 * d23) + (d36 * d27);
        double d37 = b11[8];
        double d38 = b11[9];
        double d39 = b11[10];
        double d41 = b11[11];
        out[8] = (d37 * d11) + (d38 * d15) + (d39 * d19) + (d41 * d24);
        out[9] = (d37 * d12) + (d38 * d16) + (d39 * d21) + (d41 * d25);
        out[10] = (d37 * d13) + (d38 * d17) + (d39 * d22) + (d41 * d26);
        out[11] = (d37 * d14) + (d38 * d18) + (d39 * d23) + (d41 * d27);
        double d42 = b11[12];
        double d43 = b11[13];
        double d44 = b11[14];
        double d45 = b11[15];
        out[12] = (d11 * d42) + (d15 * d43) + (d19 * d44) + (d24 * d45);
        out[13] = (d12 * d42) + (d16 * d43) + (d21 * d44) + (d25 * d45);
        out[14] = (d13 * d42) + (d17 * d43) + (d22 * d44) + (d26 * d45);
        out[15] = (d42 * d14) + (d43 * d18) + (d44 * d23) + (d45 * d27);
    }

    public static final void q(double[] v11, double[] m11, double[] result) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        p013kotlin.jvm.internal.s.k(m11, "m");
        p013kotlin.jvm.internal.s.k(result, "result");
        double d11 = v11[0];
        double d12 = v11[1];
        double d13 = v11[2];
        double d14 = v11[3];
        result[0] = (m11[0] * d11) + (m11[4] * d12) + (m11[8] * d13) + (m11[12] * d14);
        result[1] = (m11[1] * d11) + (m11[5] * d12) + (m11[9] * d13) + (m11[13] * d14);
        result[2] = (m11[2] * d11) + (m11[6] * d12) + (m11[10] * d13) + (m11[14] * d14);
        result[3] = (d11 * m11[3]) + (d12 * m11[7]) + (d13 * m11[11]) + (d14 * m11[15]);
    }

    public static final void r(double[] matrix) {
        p013kotlin.jvm.internal.s.k(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    public static final double s(double n11) {
        return Math.round(n11 * 1000.0d) * 0.001d;
    }

    public static final double[] t(double[] m11) {
        p013kotlin.jvm.internal.s.k(m11, "m");
        return new double[]{m11[0], m11[4], m11[8], m11[12], m11[1], m11[5], m11[9], m11[13], m11[2], m11[6], m11[10], m11[14], m11[3], m11[7], m11[11], m11[15]};
    }

    public static final double[] u(double[] a11, double[] b11, double aScale, double bScale) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        p013kotlin.jvm.internal.s.k(b11, "b");
        return new double[]{(a11[0] * aScale) + (b11[0] * bScale), (a11[1] * aScale) + (b11[1] * bScale), (aScale * a11[2]) + (bScale * b11[2])};
    }

    public static final double[] v(double[] a11, double[] b11) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        p013kotlin.jvm.internal.s.k(b11, "b");
        double d11 = a11[1];
        double d12 = b11[2];
        double d13 = a11[2];
        double d14 = b11[1];
        double d15 = b11[0];
        double d16 = a11[0];
        return new double[]{(d11 * d12) - (d13 * d14), (d13 * d15) - (d12 * d16), (d16 * d14) - (d11 * d15)};
    }

    public static final double w(double[] a11, double[] b11) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        p013kotlin.jvm.internal.s.k(b11, "b");
        return (a11[0] * b11[0]) + (a11[1] * b11[1]) + (a11[2] * b11[2]);
    }

    public static final double x(double[] a11) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        double d11 = a11[0];
        double d12 = a11[1];
        double d13 = (d11 * d11) + (d12 * d12);
        double d14 = a11[2];
        return Math.sqrt(d13 + (d14 * d14));
    }

    public static final double[] y(double[] vector, double norm) {
        p013kotlin.jvm.internal.s.k(vector, "vector");
        double d11 = 1;
        if (f23356a.o(norm)) {
            norm = x(vector);
        }
        double d12 = d11 / norm;
        return new double[]{vector[0] * d12, vector[1] * d12, vector[2] * d12};
    }
}
