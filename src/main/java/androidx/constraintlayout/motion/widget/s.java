package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class s {
    private static final float[][] G = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p f6794t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6775a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6776b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6777c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6778d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6779e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6780f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6781g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6782h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f6783i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f6784j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6785k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f6786l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6787m = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6788n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6789o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f6790p = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f6791q = new int[2];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f6795u = 4.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f6796v = 1.2f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f6797w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6798x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f6799y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f6800z = 10.0f;
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.e {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        }
    }

    s(Context context, p pVar, XmlPullParser xmlPullParser) {
        this.f6794t = pVar;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.R8) {
                this.f6778d = typedArray.getResourceId(index, this.f6778d);
            } else if (index == androidx.constraintlayout.widget.i.S8) {
                int i12 = typedArray.getInt(index, this.f6775a);
                this.f6775a = i12;
                float[] fArr = G[i12];
                this.f6782h = fArr[0];
                this.f6781g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.i.C8) {
                int i13 = typedArray.getInt(index, this.f6776b);
                this.f6776b = i13;
                float[][] fArr2 = H;
                if (i13 < fArr2.length) {
                    float[] fArr3 = fArr2[i13];
                    this.f6787m = fArr3[0];
                    this.f6788n = fArr3[1];
                } else {
                    this.f6788n = Float.NaN;
                    this.f6787m = Float.NaN;
                    this.f6786l = true;
                }
            } else if (index == androidx.constraintlayout.widget.i.H8) {
                this.f6795u = typedArray.getFloat(index, this.f6795u);
            } else if (index == androidx.constraintlayout.widget.i.G8) {
                this.f6796v = typedArray.getFloat(index, this.f6796v);
            } else if (index == androidx.constraintlayout.widget.i.I8) {
                this.f6797w = typedArray.getBoolean(index, this.f6797w);
            } else if (index == androidx.constraintlayout.widget.i.D8) {
                this.f6798x = typedArray.getFloat(index, this.f6798x);
            } else if (index == androidx.constraintlayout.widget.i.E8) {
                this.f6800z = typedArray.getFloat(index, this.f6800z);
            } else if (index == androidx.constraintlayout.widget.i.T8) {
                this.f6779e = typedArray.getResourceId(index, this.f6779e);
            } else if (index == androidx.constraintlayout.widget.i.K8) {
                this.f6777c = typedArray.getInt(index, this.f6777c);
            } else if (index == androidx.constraintlayout.widget.i.J8) {
                this.f6799y = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.i.F8) {
                this.f6780f = typedArray.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.i.L8) {
                this.f6785k = typedArray.getResourceId(index, this.f6785k);
            } else if (index == androidx.constraintlayout.widget.i.N8) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == androidx.constraintlayout.widget.i.O8) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == androidx.constraintlayout.widget.i.P8) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == androidx.constraintlayout.widget.i.Q8) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == androidx.constraintlayout.widget.i.M8) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == androidx.constraintlayout.widget.i.B8) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.A8);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    float a(float f11, float f12) {
        return (f11 * this.f6787m) + (f12 * this.f6788n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.f6799y;
    }

    RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f6780f;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    float g() {
        return this.f6796v;
    }

    public float h() {
        return this.f6795u;
    }

    boolean i() {
        return this.f6797w;
    }

    float j(float f11, float f12) {
        this.f6794t.i0(this.f6778d, this.f6794t.getProgress(), this.f6782h, this.f6781g, this.f6790p);
        float f13 = this.f6787m;
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.f6790p;
            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                fArr[0] = 1.0E-7f;
            }
            return (f11 * f13) / fArr[0];
        }
        float[] fArr2 = this.f6790p;
        if (fArr2[1] == BitmapDescriptorFactory.HUE_RED) {
            fArr2[1] = 1.0E-7f;
        }
        return (f12 * this.f6788n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    RectF p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f6779e;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int q() {
        return this.f6779e;
    }

    boolean r() {
        return this.f6789o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void s(MotionEvent motionEvent, p.f fVar, int i11, r rVar) {
        char c11;
        int i12;
        char c12;
        float f11;
        char c13;
        if (this.f6786l) {
            t(motionEvent, fVar, i11, rVar);
            return;
        }
        fVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6792r = motionEvent.getRawX();
            this.f6793s = motionEvent.getRawY();
            this.f6789o = false;
            return;
        }
        if (action == 1) {
            this.f6789o = false;
            fVar.c(1000);
            float fD = fVar.d();
            float fB = fVar.b();
            float progress = this.f6794t.getProgress();
            int i13 = this.f6778d;
            if (i13 != -1) {
                this.f6794t.i0(i13, progress, this.f6782h, this.f6781g, this.f6790p);
                c11 = 0;
            } else {
                float fMin = Math.min(this.f6794t.getWidth(), this.f6794t.getHeight());
                float[] fArr = this.f6790p;
                fArr[1] = this.f6788n * fMin;
                c11 = 0;
                fArr[0] = fMin * this.f6787m;
            }
            float f12 = this.f6787m;
            float[] fArr2 = this.f6790p;
            float fAbs = f12 != BitmapDescriptorFactory.HUE_RED ? fD / fArr2[c11] : fB / fArr2[1];
            float f13 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f13 == BitmapDescriptorFactory.HUE_RED || f13 == 1.0f || (i12 = this.f6777c) == 3) {
                if (BitmapDescriptorFactory.HUE_RED >= f13 || 1.0f <= f13) {
                    this.f6794t.setState(p.j.FINISHED);
                    return;
                }
                return;
            }
            float f14 = ((double) f13) < 0.5d ? 0.0f : 1.0f;
            if (i12 == 6) {
                if (progress + fAbs < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(fAbs);
                }
                f14 = 1.0f;
            }
            if (this.f6777c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f14 = 0.0f;
            }
            this.f6794t.v0(this.f6777c, f14, fAbs);
            if (BitmapDescriptorFactory.HUE_RED >= progress || 1.0f <= progress) {
                this.f6794t.setState(p.j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f6793s;
        float rawX = motionEvent.getRawX() - this.f6792r;
        if (Math.abs((this.f6787m * rawX) + (this.f6788n * rawY)) > this.f6800z || this.f6789o) {
            float progress2 = this.f6794t.getProgress();
            if (!this.f6789o) {
                this.f6789o = true;
                this.f6794t.setProgress(progress2);
            }
            int i14 = this.f6778d;
            if (i14 != -1) {
                c12 = 1;
                c13 = 0;
                f11 = progress2;
                this.f6794t.i0(i14, f11, this.f6782h, this.f6781g, this.f6790p);
            } else {
                c12 = 1;
                f11 = progress2;
                c13 = 0;
                float fMin2 = Math.min(this.f6794t.getWidth(), this.f6794t.getHeight());
                float[] fArr3 = this.f6790p;
                fArr3[1] = this.f6788n * fMin2;
                fArr3[0] = fMin2 * this.f6787m;
            }
            float f15 = this.f6787m;
            float[] fArr4 = this.f6790p;
            if (Math.abs(((f15 * fArr4[c13]) + (this.f6788n * fArr4[c12])) * this.f6798x) < 0.01d) {
                float[] fArr5 = this.f6790p;
                fArr5[c13] = 0.01f;
                fArr5[c12] = 0.01f;
            }
            float fMax = Math.max(Math.min(f11 + (this.f6787m != BitmapDescriptorFactory.HUE_RED ? rawX / this.f6790p[c13] : rawY / this.f6790p[c12]), 1.0f), BitmapDescriptorFactory.HUE_RED);
            if (this.f6777c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f6777c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f6794t.getProgress();
            if (fMax != progress3) {
                if (progress3 == BitmapDescriptorFactory.HUE_RED || progress3 == 1.0f) {
                    this.f6794t.b0(progress3 == BitmapDescriptorFactory.HUE_RED ? c12 : c13);
                }
                this.f6794t.setProgress(fMax);
                fVar.c(1000);
                this.f6794t.C = this.f6787m != BitmapDescriptorFactory.HUE_RED ? fVar.d() / this.f6790p[c13] : fVar.b() / this.f6790p[c12];
            } else {
                this.f6794t.C = BitmapDescriptorFactory.HUE_RED;
            }
            this.f6792r = motionEvent.getRawX();
            this.f6793s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0276  */
    /* JADX WARN: Code duplicated, block: B:60:0x0290  */
    /* JADX WARN: Code duplicated, block: B:63:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x02bb  */
    void t(MotionEvent motionEvent, p.f fVar, int i11, r rVar) {
        float left;
        float f11;
        int top;
        int bottom;
        int i12;
        float degrees;
        float f12;
        int i13;
        float f13;
        fVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6792r = motionEvent.getRawX();
            this.f6793s = motionEvent.getRawY();
            this.f6789o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f6794t.getWidth() / 2.0f;
            float height = this.f6794t.getHeight() / 2.0f;
            int i14 = this.f6785k;
            if (i14 != -1) {
                View viewFindViewById = this.f6794t.findViewById(i14);
                this.f6794t.getLocationOnScreen(this.f6791q);
                float left2 = this.f6791q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f6791q[1];
                width = left2;
            } else {
                int i15 = this.f6778d;
                if (i15 != -1) {
                    View viewFindViewById2 = this.f6794t.findViewById(this.f6794t.k0(i15).h());
                    if (viewFindViewById2 == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        this.f6794t.getLocationOnScreen(this.f6791q);
                        width = this.f6791q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f6791q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f6793s - height, this.f6792r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f6789o) {
                float progress = this.f6794t.getProgress();
                if (!this.f6789o) {
                    this.f6789o = true;
                    this.f6794t.setProgress(progress);
                }
                int i16 = this.f6778d;
                if (i16 != -1) {
                    f13 = progress;
                    this.f6794t.i0(i16, f13, this.f6782h, this.f6781g, this.f6790p);
                    float[] fArr = this.f6790p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f13 = progress;
                    this.f6790p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f13 + ((fAtan2 * this.f6798x) / this.f6790p[1]), 1.0f), BitmapDescriptorFactory.HUE_RED);
                float progress2 = this.f6794t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == BitmapDescriptorFactory.HUE_RED || progress2 == 1.0f) {
                        this.f6794t.b0(progress2 == BitmapDescriptorFactory.HUE_RED);
                    }
                    this.f6794t.setProgress(fMax);
                    fVar.c(1000);
                    float fD = fVar.d();
                    double dB = fVar.b();
                    double d11 = fD;
                    this.f6794t.C = (float) Math.toDegrees((float) ((Math.hypot(dB, d11) * Math.sin(Math.atan2(dB, d11) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f6794t.C = BitmapDescriptorFactory.HUE_RED;
                }
                this.f6792r = motionEvent.getRawX();
                this.f6793s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f6789o = false;
        fVar.c(16);
        float fD2 = fVar.d();
        float fB = fVar.b();
        float progress3 = this.f6794t.getProgress();
        float width2 = this.f6794t.getWidth() / 2.0f;
        float height2 = this.f6794t.getHeight() / 2.0f;
        int i17 = this.f6785k;
        if (i17 == -1) {
            int i18 = this.f6778d;
            if (i18 != -1) {
                View viewFindViewById3 = this.f6794t.findViewById(this.f6794t.k0(i18).h());
                this.f6794t.getLocationOnScreen(this.f6791q);
                left = this.f6791q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f11 = this.f6791q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i12 = this.f6778d;
            if (i12 != -1) {
                this.f6794t.i0(i12, progress3, this.f6782h, this.f6781g, this.f6790p);
                float[] fArr2 = this.f6790p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f6790p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY2, fD2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f12 = progress3;
            } else {
                f12 = (((degrees * 3.0f) * this.f6798x) / this.f6790p[1]) + progress3;
            }
            if (f12 != BitmapDescriptorFactory.HUE_RED || f12 == 1.0f || (i13 = this.f6777c) == 3) {
                if (BitmapDescriptorFactory.HUE_RED < f12 || 1.0f <= f12) {
                    this.f6794t.setState(p.j.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f6798x) / this.f6790p[1];
            float f14 = ((double) f12) < 0.5d ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            if (i13 == 6) {
                if (progress3 + fAbs < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(fAbs);
                }
                f14 = 1.0f;
            }
            if (this.f6777c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f14 = BitmapDescriptorFactory.HUE_RED;
            }
            this.f6794t.v0(this.f6777c, f14, fAbs * 3.0f);
            if (BitmapDescriptorFactory.HUE_RED >= progress3 || 1.0f <= progress3) {
                this.f6794t.setState(p.j.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f6794t.findViewById(i17);
        this.f6794t.getLocationOnScreen(this.f6791q);
        left = this.f6791q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f11 = this.f6791q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        float f15 = left;
        height2 = ((top + bottom) / 2.0f) + f11;
        width2 = f15;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i12 = this.f6778d;
        if (i12 != -1) {
            this.f6794t.i0(i12, progress3, this.f6782h, this.f6781g, this.f6790p);
            float[] fArr3 = this.f6790p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f6790p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY3, fD2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f12 = (((degrees * 3.0f) * this.f6798x) / this.f6790p[1]) + progress3;
        } else {
            f12 = progress3;
        }
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
        }
        if (BitmapDescriptorFactory.HUE_RED < f12) {
        }
        this.f6794t.setState(p.j.FINISHED);
    }

    public String toString() {
        if (Float.isNaN(this.f6787m)) {
            return "rotation";
        }
        return this.f6787m + " , " + this.f6788n;
    }

    void u(float f11, float f12) {
        float progress = this.f6794t.getProgress();
        if (!this.f6789o) {
            this.f6789o = true;
            this.f6794t.setProgress(progress);
        }
        this.f6794t.i0(this.f6778d, progress, this.f6782h, this.f6781g, this.f6790p);
        float f13 = this.f6787m;
        float[] fArr = this.f6790p;
        if (Math.abs((f13 * fArr[0]) + (this.f6788n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f6790p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f14 = this.f6787m;
        float fMax = Math.max(Math.min(progress + (f14 != BitmapDescriptorFactory.HUE_RED ? (f11 * f14) / this.f6790p[0] : (f12 * this.f6788n) / this.f6790p[1]), 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (fMax != this.f6794t.getProgress()) {
            this.f6794t.setProgress(fMax);
        }
    }

    void v(float f11, float f12) {
        int i11;
        this.f6789o = false;
        float progress = this.f6794t.getProgress();
        this.f6794t.i0(this.f6778d, progress, this.f6782h, this.f6781g, this.f6790p);
        float f13 = this.f6787m;
        float[] fArr = this.f6790p;
        float f14 = fArr[0];
        float f15 = this.f6788n;
        float f16 = fArr[1];
        float f17 = BitmapDescriptorFactory.HUE_RED;
        float f18 = f13 != BitmapDescriptorFactory.HUE_RED ? (f11 * f13) / f14 : (f12 * f15) / f16;
        if (!Float.isNaN(f18)) {
            progress += f18 / 3.0f;
        }
        if (progress == BitmapDescriptorFactory.HUE_RED || progress == 1.0f || (i11 = this.f6777c) == 3) {
            return;
        }
        p pVar = this.f6794t;
        if (progress >= 0.5d) {
            f17 = 1.0f;
        }
        pVar.v0(i11, f17, f18);
    }

    void w(float f11, float f12) {
        this.f6792r = f11;
        this.f6793s = f12;
    }

    public void x(boolean z11) {
        if (z11) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.f6775a];
        this.f6782h = fArr5[0];
        this.f6781g = fArr5[1];
        int i11 = this.f6776b;
        float[][] fArr6 = H;
        if (i11 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i11];
        this.f6787m = fArr7[0];
        this.f6788n = fArr7[1];
    }

    void y(float f11, float f12) {
        this.f6792r = f11;
        this.f6793s = f12;
        this.f6789o = false;
    }

    void z() {
        View viewFindViewById;
        int i11 = this.f6778d;
        if (i11 != -1) {
            viewFindViewById = this.f6794t.findViewById(i11);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + androidx.constraintlayout.motion.widget.a.c(this.f6794t.getContext(), this.f6778d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }
}
