package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6805a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f6809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g f6810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.widget.d.a f6811g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6815k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Context f6819o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6806b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6807c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6808d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6812h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6813i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6816l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f6817m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6818n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6820p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6821q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6822r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6823s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6824t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6825u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6826v = -1;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b5.c f6827a;

        a(b5.c cVar) {
            this.f6827a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f6827a.a(f11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f6831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        m f6832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6834f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        v f6836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Interpolator f6837i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f6839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f6840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f6841m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f6843o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        b5.d f6835g = new b5.d();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f6838j = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Rect f6842n = new Rect();

        b(v vVar, m mVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            this.f6843o = false;
            this.f6836h = vVar;
            this.f6832d = mVar;
            this.f6833e = i11;
            this.f6834f = i12;
            long jNanoTime = System.nanoTime();
            this.f6831c = jNanoTime;
            this.f6841m = jNanoTime;
            this.f6836h.b(this);
            this.f6837i = interpolator;
            this.f6829a = i14;
            this.f6830b = i15;
            if (i13 == 3) {
                this.f6843o = true;
            }
            this.f6840l = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            a();
        }

        void a() {
            if (this.f6838j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long jNanoTime = System.nanoTime();
            long j11 = jNanoTime - this.f6841m;
            this.f6841m = jNanoTime;
            float f11 = this.f6839k + (((float) (j11 * 1.0E-6d)) * this.f6840l);
            this.f6839k = f11;
            if (f11 >= 1.0f) {
                this.f6839k = 1.0f;
            }
            Interpolator interpolator = this.f6837i;
            float interpolation = interpolator == null ? this.f6839k : interpolator.getInterpolation(this.f6839k);
            m mVar = this.f6832d;
            boolean zU = mVar.u(mVar.f6605b, interpolation, jNanoTime, this.f6835g);
            if (this.f6839k >= 1.0f) {
                if (this.f6829a != -1) {
                    this.f6832d.s().setTag(this.f6829a, Long.valueOf(System.nanoTime()));
                }
                if (this.f6830b != -1) {
                    this.f6832d.s().setTag(this.f6830b, null);
                }
                if (!this.f6843o) {
                    this.f6836h.f(this);
                }
            }
            if (this.f6839k < 1.0f || zU) {
                this.f6836h.d();
            }
        }

        void c() {
            long jNanoTime = System.nanoTime();
            long j11 = jNanoTime - this.f6841m;
            this.f6841m = jNanoTime;
            float f11 = this.f6839k - (((float) (j11 * 1.0E-6d)) * this.f6840l);
            this.f6839k = f11;
            if (f11 < BitmapDescriptorFactory.HUE_RED) {
                this.f6839k = BitmapDescriptorFactory.HUE_RED;
            }
            Interpolator interpolator = this.f6837i;
            float interpolation = interpolator == null ? this.f6839k : interpolator.getInterpolation(this.f6839k);
            m mVar = this.f6832d;
            boolean zU = mVar.u(mVar.f6605b, interpolation, jNanoTime, this.f6835g);
            if (this.f6839k <= BitmapDescriptorFactory.HUE_RED) {
                if (this.f6829a != -1) {
                    this.f6832d.s().setTag(this.f6829a, Long.valueOf(System.nanoTime()));
                }
                if (this.f6830b != -1) {
                    this.f6832d.s().setTag(this.f6830b, null);
                }
                this.f6836h.f(this);
            }
            if (this.f6839k > BitmapDescriptorFactory.HUE_RED || zU) {
                this.f6836h.d();
            }
        }

        public void d(int i11, float f11, float f12) {
            if (i11 == 1) {
                if (this.f6838j) {
                    return;
                }
                e(true);
            } else {
                if (i11 != 2) {
                    return;
                }
                this.f6832d.s().getHitRect(this.f6842n);
                if (this.f6842n.contains((int) f11, (int) f12) || this.f6838j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z11) {
            int i11;
            this.f6838j = z11;
            if (z11 && (i11 = this.f6834f) != -1) {
                this.f6840l = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            }
            this.f6836h.d();
            this.f6841m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: IOException -> 0x0045, XmlPullParserException -> 0x0048, TryCatch #2 {IOException -> 0x0045, XmlPullParserException -> 0x0048, blocks: (B:3:0x002a, B:37:0x00cc, B:11:0x0039, B:18:0x004b, B:19:0x0053, B:36:0x0099, B:21:0x0057, B:26:0x0068, B:24:0x0060, B:27:0x0070, B:29:0x0076, B:30:0x007a, B:32:0x0082, B:33:0x008a, B:35:0x0092), top: B:42:0x002a }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0099, please report this as an issue */
    u(Context context, XmlPullParser xmlPullParser) {
        this.f6819o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(".xml:");
                                sb2.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb2.toString());
                            } else {
                                this.f6811g = androidx.constraintlayout.widget.d.m(context, xmlPullParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(".xml:");
                                sb3.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb3.toString());
                            } else {
                                this.f6810f = new g(context, xmlPullParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".xml:");
                                sb4.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb4.toString());
                            } else {
                                k(context, xmlPullParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".xml:");
                                sb5.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb5.toString());
                            } else {
                                androidx.constraintlayout.widget.a.i(context, xmlPullParser, this.f6811g.f6993g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(".xml:");
                                sb6.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb6.toString());
                            } else {
                                androidx.constraintlayout.widget.a.i(context, xmlPullParser, this.f6811g.f6993g);
                            }
                            break;
                        default:
                            Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(".xml:");
                            sb7.append(xmlPullParser.getLineNumber());
                            Log.e("ViewTransition", sb7.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ViewTransition", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ViewTransition", "Error parsing XML resource", e12);
        }
    }

    public static /* synthetic */ void a(u uVar, View[] viewArr) {
        if (uVar.f6820p != -1) {
            for (View view : viewArr) {
                view.setTag(uVar.f6820p, Long.valueOf(System.nanoTime()));
            }
        }
        if (uVar.f6821q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(uVar.f6821q, null);
            }
        }
    }

    private void k(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.K9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.L9) {
                this.f6805a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6805a);
            } else if (index == androidx.constraintlayout.widget.i.T9) {
                if (p.f6635d1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6814j);
                    this.f6814j = resourceId;
                    if (resourceId == -1) {
                        this.f6815k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f6815k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f6814j = typedArrayObtainStyledAttributes.getResourceId(index, this.f6814j);
                }
            } else if (index == androidx.constraintlayout.widget.i.U9) {
                this.f6806b = typedArrayObtainStyledAttributes.getInt(index, this.f6806b);
            } else if (index == androidx.constraintlayout.widget.i.X9) {
                this.f6807c = typedArrayObtainStyledAttributes.getBoolean(index, this.f6807c);
            } else if (index == androidx.constraintlayout.widget.i.V9) {
                this.f6808d = typedArrayObtainStyledAttributes.getInt(index, this.f6808d);
            } else if (index == androidx.constraintlayout.widget.i.P9) {
                this.f6812h = typedArrayObtainStyledAttributes.getInt(index, this.f6812h);
            } else if (index == androidx.constraintlayout.widget.i.Y9) {
                this.f6813i = typedArrayObtainStyledAttributes.getInt(index, this.f6813i);
            } else if (index == androidx.constraintlayout.widget.i.Z9) {
                this.f6809e = typedArrayObtainStyledAttributes.getInt(index, this.f6809e);
            } else if (index == androidx.constraintlayout.widget.i.S9) {
                int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f6818n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f6816l = -2;
                    }
                } else if (i12 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6817m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f6816l = -1;
                    } else {
                        this.f6818n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f6816l = -2;
                    }
                } else {
                    this.f6816l = typedArrayObtainStyledAttributes.getInteger(index, this.f6816l);
                }
            } else if (index == androidx.constraintlayout.widget.i.W9) {
                this.f6820p = typedArrayObtainStyledAttributes.getResourceId(index, this.f6820p);
            } else if (index == androidx.constraintlayout.widget.i.O9) {
                this.f6821q = typedArrayObtainStyledAttributes.getResourceId(index, this.f6821q);
            } else if (index == androidx.constraintlayout.widget.i.R9) {
                this.f6822r = typedArrayObtainStyledAttributes.getResourceId(index, this.f6822r);
            } else if (index == androidx.constraintlayout.widget.i.Q9) {
                this.f6823s = typedArrayObtainStyledAttributes.getResourceId(index, this.f6823s);
            } else if (index == androidx.constraintlayout.widget.i.N9) {
                this.f6825u = typedArrayObtainStyledAttributes.getResourceId(index, this.f6825u);
            } else if (index == androidx.constraintlayout.widget.i.M9) {
                this.f6824t = typedArrayObtainStyledAttributes.getInteger(index, this.f6824t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void m(r.b bVar, View view) {
        int i11 = this.f6812h;
        if (i11 != -1) {
            bVar.E(i11);
        }
        bVar.G(this.f6808d);
        bVar.F(this.f6816l, this.f6817m, this.f6818n);
        int id2 = view.getId();
        g gVar = this.f6810f;
        if (gVar != null) {
            ArrayList<d> arrayListD = gVar.d(-1);
            g gVar2 = new g();
            Iterator<d> it = arrayListD.iterator();
            while (it.hasNext()) {
                gVar2.c(it.next().clone().h(id2));
            }
            bVar.t(gVar2);
        }
    }

    void b(v vVar, p pVar, View view) {
        m mVar = new m(view);
        mVar.y(view);
        this.f6810f.a(mVar);
        mVar.F(pVar.getWidth(), pVar.getHeight(), this.f6812h, System.nanoTime());
        new b(vVar, mVar, this.f6812h, this.f6813i, this.f6806b, f(pVar.getContext()), this.f6820p, this.f6821q);
    }

    void c(v vVar, p pVar, int i11, androidx.constraintlayout.widget.d dVar, final View... viewArr) {
        if (this.f6807c) {
            return;
        }
        int i12 = this.f6809e;
        if (i12 == 2) {
            b(vVar, pVar, viewArr[0]);
            return;
        }
        if (i12 == 1) {
            for (int i13 : pVar.getConstraintSetIds()) {
                if (i13 != i11) {
                    androidx.constraintlayout.widget.d dVarJ0 = pVar.j0(i13);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.d.a aVarD = dVarJ0.D(view.getId());
                        androidx.constraintlayout.widget.d.a aVar = this.f6811g;
                        if (aVar != null) {
                            aVar.d(aVarD);
                            aVarD.f6993g.putAll(this.f6811g.f6993g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        dVar2.p(dVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.d.a aVarD2 = dVar2.D(view2.getId());
            androidx.constraintlayout.widget.d.a aVar2 = this.f6811g;
            if (aVar2 != null) {
                aVar2.d(aVarD2);
                aVarD2.f6993g.putAll(this.f6811g.f6993g);
            }
        }
        pVar.D0(i11, dVar2);
        pVar.D0(androidx.constraintlayout.widget.h.f7094b, dVar);
        pVar.setState(androidx.constraintlayout.widget.h.f7094b, -1, -1);
        r.b bVar = new r.b(-1, pVar.f6664z, androidx.constraintlayout.widget.h.f7094b, i11);
        for (View view3 : viewArr) {
            m(bVar, view3);
        }
        pVar.setTransition(bVar);
        pVar.x0(new Runnable() { // from class: androidx.constraintlayout.motion.widget.t
            @Override // java.lang.Runnable
            public final void run() {
                u.a(this.f6803a, viewArr);
            }
        });
    }

    boolean d(View view) {
        int i11 = this.f6822r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f6823s;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    int e() {
        return this.f6805a;
    }

    Interpolator f(Context context) {
        int i11 = this.f6816l;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f6818n);
        }
        if (i11 == -1) {
            return new a(b5.c.c(this.f6817m));
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.f6824t;
    }

    public int h() {
        return this.f6825u;
    }

    public int i() {
        return this.f6806b;
    }

    boolean j(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f6814j == -1 && this.f6815k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f6814j) {
            return true;
        }
        return this.f6815k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f6889c0) != null && str.matches(this.f6815k);
    }

    boolean l(int i11) {
        int i12 = this.f6806b;
        if (i12 == 1) {
            return i11 == 0;
        }
        if (i12 == 2) {
            return i11 == 1;
        }
        return i12 == 3 && i11 == 0;
    }

    public String toString() {
        return "ViewTransition(" + androidx.constraintlayout.motion.widget.a.c(this.f6819o, this.f6805a) + ")";
    }
}
