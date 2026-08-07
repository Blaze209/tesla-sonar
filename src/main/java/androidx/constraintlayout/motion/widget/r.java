package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6732a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MotionEvent f6744m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p.f f6747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final v f6749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f6750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f6751t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.k f6733b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f6734c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6735d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<b> f6736e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f6737f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<b> f6738g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f6739h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f6740i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseIntArray f6741j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6742k = 400;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6743l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6745n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6746o = false;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b5.c f6752a;

        a(b5.c cVar) {
            this.f6752a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f6752a.a(f11);
        }
    }

    r(Context context, p pVar, int i11) {
        this.f6732a = pVar;
        this.f6749r = new v(pVar);
        J(context, i11);
        this.f6739h.put(androidx.constraintlayout.widget.h.f7093a, new androidx.constraintlayout.widget.d());
        this.f6740i.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.h.f7093a));
    }

    private boolean H(int i11) {
        int i12 = this.f6741j.get(i11);
        int size = this.f6741j.size();
        while (i12 > 0) {
            if (i12 == i11) {
                return true;
            }
            int i13 = size - 1;
            if (size < 0) {
                return true;
            }
            i12 = this.f6741j.get(i12);
            size = i13;
        }
        return false;
    }

    private boolean I() {
        return this.f6747p != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void J(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                K(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f6764k.add(gVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                M(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                this.f6749r.a(new u(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                ArrayList<b> arrayList = this.f6736e;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f6734c == null && !bVar.f6755b) {
                                    this.f6734c = bVar;
                                    if (bVar.f6765l != null) {
                                        this.f6734c.f6765l.x(this.f6748q);
                                    }
                                }
                                if (bVar.f6755b) {
                                    if (bVar.f6756c == -1) {
                                        this.f6737f = bVar;
                                    } else {
                                        this.f6738g.add(bVar);
                                    }
                                    this.f6736e.remove(bVar);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && bVar != null && !this.f6732a.isInEditMode()) {
                                bVar.u(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i11) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (bVar != null) {
                                    bVar.f6765l = new s(context, this.f6732a, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                N(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f6733b = new androidx.constraintlayout.widget.k(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                M(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e11);
        } catch (XmlPullParserException e12) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e12);
        }
    }

    private int K(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.Y(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iQ = -1;
        int iQ2 = -1;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iQ2 = q(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        dVar.f6983e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                dVar.f6983e = 4;
                                break;
                            case "left":
                                dVar.f6983e = 2;
                                break;
                            case "none":
                                dVar.f6983e = 0;
                                break;
                            case "right":
                                dVar.f6983e = 1;
                                break;
                            case "x_right":
                                dVar.f6983e = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iQ = q(context, attributeValue);
                    this.f6740i.put(Z(attributeValue), Integer.valueOf(iQ));
                    dVar.f6980b = androidx.constraintlayout.motion.widget.a.c(context, iQ);
                    break;
                case "stateLabels":
                    dVar.c0(attributeValue);
                    break;
            }
        }
        if (iQ != -1) {
            if (this.f6732a.W != 0) {
                dVar.d0(true);
            }
            dVar.L(context, xmlPullParser);
            if (iQ2 != -1) {
                this.f6741j.put(iQ, iQ2);
            }
            this.f6739h.put(iQ, dVar);
        }
        return iQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (IOException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e11);
            return -1;
        } catch (XmlPullParserException e12) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e12);
            return -1;
        }
    }

    private void M(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f7106aa);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.f7118ba) {
                L(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f7315t8);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.f7326u8) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f6742k);
                this.f6742k = i12;
                if (i12 < 8) {
                    this.f6742k = 8;
                }
            } else if (index == androidx.constraintlayout.widget.i.f7337v8) {
                this.f6743l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void R(int i11, p pVar) {
        androidx.constraintlayout.widget.d dVar = this.f6739h.get(i11);
        dVar.f6981c = dVar.f6980b;
        int i12 = this.f6741j.get(i11);
        if (i12 > 0) {
            R(i12, pVar);
            androidx.constraintlayout.widget.d dVar2 = this.f6739h.get(i12);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.a.c(this.f6732a.getContext(), i12));
                return;
            }
            dVar.f6981c += "/" + dVar2.f6981c;
            dVar.T(dVar2);
        } else {
            dVar.f6981c += "  layout";
            dVar.S(pVar);
        }
        dVar.h(dVar);
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int q(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    private int x(int i11) {
        int iC;
        androidx.constraintlayout.widget.k kVar = this.f6733b;
        return (kVar == null || (iC = kVar.c(i11, -1, -1)) == -1) ? i11 : iC;
    }

    float A() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.m();
    }

    float B() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.n();
    }

    float C() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.o();
    }

    public float D() {
        b bVar = this.f6734c;
        return bVar != null ? bVar.f6762i : BitmapDescriptorFactory.HUE_RED;
    }

    int E() {
        b bVar = this.f6734c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f6757d;
    }

    public b F(int i11) {
        for (b bVar : this.f6736e) {
            if (bVar.f6754a == i11) {
                return bVar;
            }
        }
        return null;
    }

    public List<b> G(int i11) {
        int iX = x(i11);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f6736e) {
            if (bVar.f6757d == iX || bVar.f6756c == iX) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    void O(float f11, float f12) {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return;
        }
        this.f6734c.f6765l.u(f11, f12);
    }

    void P(float f11, float f12) {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return;
        }
        this.f6734c.f6765l.v(f11, f12);
    }

    void Q(MotionEvent motionEvent, int i11, p pVar) {
        p.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f6747p == null) {
            this.f6747p = this.f6732a.p0();
        }
        this.f6747p.a(motionEvent);
        if (i11 != -1) {
            int action = motionEvent.getAction();
            boolean z11 = false;
            if (action == 0) {
                this.f6750s = motionEvent.getRawX();
                this.f6751t = motionEvent.getRawY();
                this.f6744m = motionEvent;
                this.f6745n = false;
                if (this.f6734c.f6765l != null) {
                    RectF rectFF = this.f6734c.f6765l.f(this.f6732a, rectF);
                    if (rectFF != null && !rectFF.contains(this.f6744m.getX(), this.f6744m.getY())) {
                        this.f6744m = null;
                        this.f6745n = true;
                        return;
                    }
                    RectF rectFP = this.f6734c.f6765l.p(this.f6732a, rectF);
                    if (rectFP == null || rectFP.contains(this.f6744m.getX(), this.f6744m.getY())) {
                        this.f6746o = false;
                    } else {
                        this.f6746o = true;
                    }
                    this.f6734c.f6765l.w(this.f6750s, this.f6751t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f6745n) {
                float rawY = motionEvent.getRawY() - this.f6751t;
                float rawX = motionEvent.getRawX() - this.f6750s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f6744m) == null) {
                    return;
                }
                b bVarH = h(i11, rawX, rawY, motionEvent2);
                if (bVarH != null) {
                    pVar.setTransition(bVarH);
                    RectF rectFP2 = this.f6734c.f6765l.p(this.f6732a, rectF);
                    if (rectFP2 != null && !rectFP2.contains(this.f6744m.getX(), this.f6744m.getY())) {
                        z11 = true;
                    }
                    this.f6746o = z11;
                    this.f6734c.f6765l.y(this.f6750s, this.f6751t);
                }
            }
        }
        if (this.f6745n) {
            return;
        }
        b bVar = this.f6734c;
        if (bVar != null && bVar.f6765l != null && !this.f6746o) {
            this.f6734c.f6765l.s(motionEvent, this.f6747p, i11, this);
        }
        this.f6750s = motionEvent.getRawX();
        this.f6751t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f6747p) == null) {
            return;
        }
        fVar.recycle();
        this.f6747p = null;
        int i12 = pVar.E;
        if (i12 != -1) {
            g(pVar, i12);
        }
    }

    void S(p pVar) {
        for (int i11 = 0; i11 < this.f6739h.size(); i11++) {
            int iKeyAt = this.f6739h.keyAt(i11);
            if (H(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            R(iKeyAt, pVar);
        }
    }

    public void T(int i11, androidx.constraintlayout.widget.d dVar) {
        this.f6739h.put(i11, dVar);
    }

    public void U(int i11) {
        b bVar = this.f6734c;
        if (bVar != null) {
            bVar.E(i11);
        } else {
            this.f6742k = i11;
        }
    }

    public void V(boolean z11) {
        this.f6748q = z11;
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return;
        }
        this.f6734c.f6765l.x(this.f6748q);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0075 A[SYNTHETIC] */
    void W(int i11, int i12) {
        int iC;
        int iC2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        androidx.constraintlayout.widget.k kVar = this.f6733b;
        if (kVar != null) {
            iC = kVar.c(i11, -1, -1);
            if (iC == -1) {
                iC = i11;
            }
            iC2 = this.f6733b.c(i12, -1, -1);
            if (iC2 == -1) {
            }
            bVar = this.f6734c;
            if (bVar == null && bVar.f6756c == i12 && this.f6734c.f6757d == i11) {
                return;
            }
            it = this.f6736e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f6737f;
                    for (b bVar4 : this.f6738g) {
                        if (bVar4.f6756c == i12) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f6757d = iC;
                    bVar3.f6756c = iC2;
                    if (iC != -1) {
                        this.f6736e.add(bVar3);
                    }
                    this.f6734c = bVar3;
                    return;
                }
                next = it.next();
                if ((next.f6756c != iC2 && next.f6757d == iC) || (next.f6756c == i12 && next.f6757d == i11)) {
                    break;
                }
            }
            this.f6734c = next;
            if (next != null || next.f6765l == null) {
            }
            this.f6734c.f6765l.x(this.f6748q);
            return;
        }
        iC = i11;
        iC2 = i12;
        bVar = this.f6734c;
        if (bVar == null) {
        }
        it = this.f6736e.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f6737f;
                while (r3.hasNext()) {
                    if (bVar4.f6756c == i12) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f6757d = iC;
                bVar3.f6756c = iC2;
                if (iC != -1) {
                    this.f6736e.add(bVar3);
                }
                this.f6734c = bVar3;
                return;
            }
            next = it.next();
            if (next.f6756c != iC2) {
            }
        }
        this.f6734c = next;
        if (next != null) {
        }
    }

    public void X(b bVar) {
        this.f6734c = bVar;
        if (bVar == null || bVar.f6765l == null) {
            return;
        }
        this.f6734c.f6765l.x(this.f6748q);
    }

    void Y() {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return;
        }
        this.f6734c.f6765l.z();
    }

    boolean a0() {
        Iterator<b> it = this.f6736e.iterator();
        while (it.hasNext()) {
            if (it.next().f6765l != null) {
                return true;
            }
        }
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? false : true;
    }

    public void b0(int i11, View... viewArr) {
        this.f6749r.h(i11, viewArr);
    }

    public void f(p pVar, int i11) {
        for (b bVar : this.f6736e) {
            if (bVar.f6766m.size() > 0) {
                Iterator it = bVar.f6766m.iterator();
                while (it.hasNext()) {
                    ((b.a) it.next()).c(pVar);
                }
            }
        }
        for (b bVar2 : this.f6738g) {
            if (bVar2.f6766m.size() > 0) {
                Iterator it2 = bVar2.f6766m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(pVar);
                }
            }
        }
        for (b bVar3 : this.f6736e) {
            if (bVar3.f6766m.size() > 0) {
                Iterator it3 = bVar3.f6766m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).a(pVar, i11, bVar3);
                }
            }
        }
        for (b bVar4 : this.f6738g) {
            if (bVar4.f6766m.size() > 0) {
                Iterator it4 = bVar4.f6766m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).a(pVar, i11, bVar4);
                }
            }
        }
    }

    boolean g(p pVar, int i11) {
        b bVar;
        if (I() || this.f6735d) {
            return false;
        }
        for (b bVar2 : this.f6736e) {
            if (bVar2.f6767n != 0 && ((bVar = this.f6734c) != bVar2 || !bVar.D(2))) {
                if (i11 == bVar2.f6757d && (bVar2.f6767n == 4 || bVar2.f6767n == 2)) {
                    p.j jVar = p.j.FINISHED;
                    pVar.setState(jVar);
                    pVar.setTransition(bVar2);
                    if (bVar2.f6767n == 4) {
                        pVar.w0();
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                    } else {
                        pVar.setProgress(1.0f);
                        pVar.c0(true);
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                        pVar.setState(jVar);
                        pVar.q0();
                    }
                    return true;
                }
                if (i11 == bVar2.f6756c && (bVar2.f6767n == 3 || bVar2.f6767n == 1)) {
                    p.j jVar2 = p.j.FINISHED;
                    pVar.setState(jVar2);
                    pVar.setTransition(bVar2);
                    if (bVar2.f6767n == 3) {
                        pVar.y0();
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                    } else {
                        pVar.setProgress(BitmapDescriptorFactory.HUE_RED);
                        pVar.c0(true);
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                        pVar.setState(jVar2);
                        pVar.q0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i11, float f11, float f12, MotionEvent motionEvent) {
        if (i11 == -1) {
            return this.f6734c;
        }
        List<b> listG = G(i11);
        RectF rectF = new RectF();
        float f13 = BitmapDescriptorFactory.HUE_RED;
        b bVar = null;
        for (b bVar2 : listG) {
            if (!bVar2.f6768o && bVar2.f6765l != null) {
                bVar2.f6765l.x(this.f6748q);
                RectF rectFP = bVar2.f6765l.p(this.f6732a, rectF);
                if (rectFP == null || motionEvent == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFF = bVar2.f6765l.f(this.f6732a, rectF);
                    if (rectFF == null || motionEvent == null || rectFF.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f6765l.a(f11, f12);
                        if (bVar2.f6765l.f6786l && motionEvent != null) {
                            float x11 = motionEvent.getX() - bVar2.f6765l.f6783i;
                            float y11 = motionEvent.getY() - bVar2.f6765l.f6784j;
                            fA = ((float) (Math.atan2(f12 + y11, f11 + x11) - Math.atan2(x11, y11))) * 10.0f;
                        }
                        float f14 = fA * (bVar2.f6756c == i11 ? -1.0f : 1.1f);
                        if (f14 > f13) {
                            bVar = bVar2;
                            f13 = f14;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int i() {
        b bVar = this.f6734c;
        if (bVar != null) {
            return bVar.f6769p;
        }
        return -1;
    }

    int j() {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return 0;
        }
        return this.f6734c.f6765l.d();
    }

    androidx.constraintlayout.widget.d k(int i11) {
        return l(i11, -1, -1);
    }

    androidx.constraintlayout.widget.d l(int i11, int i12, int i13) {
        int iC;
        androidx.constraintlayout.widget.k kVar = this.f6733b;
        if (kVar != null && (iC = kVar.c(i11, i12, i13)) != -1) {
            i11 = iC;
        }
        if (this.f6739h.get(i11) != null) {
            return this.f6739h.get(i11);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.a.c(this.f6732a.getContext(), i11) + " In MotionScene");
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f6739h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] m() {
        int size = this.f6739h.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f6739h.keyAt(i11);
        }
        return iArr;
    }

    public ArrayList<b> n() {
        return this.f6736e;
    }

    public int o() {
        b bVar = this.f6734c;
        return bVar != null ? bVar.f6761h : this.f6742k;
    }

    int p() {
        b bVar = this.f6734c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f6756c;
    }

    public Interpolator r() {
        int i11 = this.f6734c.f6758e;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(this.f6732a.getContext(), this.f6734c.f6760g);
        }
        if (i11 == -1) {
            return new a(b5.c.c(this.f6734c.f6759f));
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

    public void s(m mVar) {
        b bVar = this.f6734c;
        if (bVar != null) {
            Iterator it = bVar.f6764k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(mVar);
            }
        } else {
            b bVar2 = this.f6737f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f6764k.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(mVar);
                }
            }
        }
    }

    float t() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.g();
    }

    float u() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.h();
    }

    boolean v() {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return false;
        }
        return this.f6734c.f6765l.i();
    }

    float w(float f11, float f12) {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.j(f11, f12);
    }

    int y() {
        b bVar = this.f6734c;
        if (bVar == null || bVar.f6765l == null) {
            return 0;
        }
        return this.f6734c.f6765l.k();
    }

    float z() {
        b bVar = this.f6734c;
        return (bVar == null || bVar.f6765l == null) ? BitmapDescriptorFactory.HUE_RED : this.f6734c.f6765l.l();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f6759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6761h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f6762i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final r f6763j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ArrayList<g> f6764k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private s f6765l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ArrayList<a> f6766m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f6767n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f6768o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6769p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f6770q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f6771r;

        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f6772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f6773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f6774c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f6773b = -1;
                this.f6774c = 17;
                this.f6772a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f7359x8);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i11 = 0; i11 < indexCount; i11++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i11);
                    if (index == androidx.constraintlayout.widget.i.f7381z8) {
                        this.f6773b = typedArrayObtainStyledAttributes.getResourceId(index, this.f6773b);
                    } else if (index == androidx.constraintlayout.widget.i.f7370y8) {
                        this.f6774c = typedArrayObtainStyledAttributes.getInt(index, this.f6774c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(p pVar, int i11, b bVar) {
                boolean z11;
                View viewFindViewById;
                int i12 = this.f6773b;
                View view = pVar;
                if (i12 != -1) {
                    viewFindViewById = pVar.findViewById(i12);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + this.f6773b);
                    return;
                }
                int i13 = bVar.f6757d;
                int i14 = bVar.f6756c;
                if (i13 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i15 = this.f6774c;
                boolean z12 = false;
                if ((i15 & 1) == 0 || i11 != i13) {
                    view = viewFindViewById;
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z13 = ((i15 & 1) != 0 && i11 == i13) | z11 | ((i15 & 256) != 0 && i11 == i13) | ((i15 & 16) != 0 && i11 == i14);
                if ((i15 & 4096) != 0 && i11 == i14) {
                    z12 = true;
                }
                if (z13 || z12) {
                    view.setOnClickListener(this);
                }
            }

            boolean b(b bVar, p pVar) {
                b bVar2 = this.f6772a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i11 = bVar2.f6756c;
                int i12 = this.f6772a.f6757d;
                if (i12 == -1) {
                    return pVar.E != i11;
                }
                int i13 = pVar.E;
                return i13 == i12 || i13 == i11;
            }

            public void c(p pVar) {
                int i11 = this.f6773b;
                if (i11 == -1) {
                    return;
                }
                View viewFindViewById = pVar.findViewById(i11);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f6773b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p pVar = this.f6772a.f6763j.f6732a;
                if (pVar.o0()) {
                    if (this.f6772a.f6757d == -1) {
                        int currentState = pVar.getCurrentState();
                        if (currentState == -1) {
                            pVar.z0(this.f6772a.f6756c);
                            return;
                        }
                        b bVar = new b(this.f6772a.f6763j, this.f6772a);
                        bVar.f6757d = currentState;
                        bVar.f6756c = this.f6772a.f6756c;
                        pVar.setTransition(bVar);
                        pVar.w0();
                        return;
                    }
                    b bVar2 = this.f6772a.f6763j.f6734c;
                    int i11 = this.f6774c;
                    boolean z11 = false;
                    boolean z12 = ((i11 & 1) == 0 && (i11 & 256) == 0) ? false : true;
                    boolean z13 = ((i11 & 16) == 0 && (i11 & 4096) == 0) ? false : true;
                    if (z12 && z13) {
                        b bVar3 = this.f6772a.f6763j.f6734c;
                        b bVar4 = this.f6772a;
                        if (bVar3 != bVar4) {
                            pVar.setTransition(bVar4);
                        }
                        if (pVar.getCurrentState() != pVar.getEndState() && pVar.getProgress() <= 0.5f) {
                            z13 = false;
                            z11 = z12;
                        }
                    } else {
                        z11 = z12;
                    }
                    if (b(bVar2, pVar)) {
                        if (z11 && (this.f6774c & 1) != 0) {
                            pVar.setTransition(this.f6772a);
                            pVar.w0();
                            return;
                        }
                        if (z13 && (this.f6774c & 16) != 0) {
                            pVar.setTransition(this.f6772a);
                            pVar.y0();
                        } else if (z11 && (this.f6774c & 256) != 0) {
                            pVar.setTransition(this.f6772a);
                            pVar.setProgress(1.0f);
                        } else {
                            if (!z13 || (this.f6774c & 4096) == 0) {
                                return;
                            }
                            pVar.setTransition(this.f6772a);
                            pVar.setProgress(BitmapDescriptorFactory.HUE_RED);
                        }
                    }
                }
            }
        }

        b(r rVar, b bVar) {
            this.f6754a = -1;
            this.f6755b = false;
            this.f6756c = -1;
            this.f6757d = -1;
            this.f6758e = 0;
            this.f6759f = null;
            this.f6760g = -1;
            this.f6761h = 400;
            this.f6762i = BitmapDescriptorFactory.HUE_RED;
            this.f6764k = new ArrayList<>();
            this.f6765l = null;
            this.f6766m = new ArrayList<>();
            this.f6767n = 0;
            this.f6768o = false;
            this.f6769p = -1;
            this.f6770q = 0;
            this.f6771r = 0;
            this.f6763j = rVar;
            this.f6761h = rVar.f6742k;
            if (bVar != null) {
                this.f6769p = bVar.f6769p;
                this.f6758e = bVar.f6758e;
                this.f6759f = bVar.f6759f;
                this.f6760g = bVar.f6760g;
                this.f6761h = bVar.f6761h;
                this.f6764k = bVar.f6764k;
                this.f6762i = bVar.f6762i;
                this.f6770q = bVar.f6770q;
            }
        }

        private void v(r rVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f7338v9) {
                    this.f6756c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6756c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.K(context, this.f6756c);
                        rVar.f6739h.append(this.f6756c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f6756c = rVar.L(context, this.f6756c);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f7349w9) {
                    this.f6757d = typedArray.getResourceId(index, this.f6757d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f6757d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.K(context, this.f6757d);
                        rVar.f6739h.append(this.f6757d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f6757d = rVar.L(context, this.f6757d);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f7382z9) {
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f6760g = resourceId;
                        if (resourceId != -1) {
                            this.f6758e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        this.f6759f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f6760g = typedArray.getResourceId(index, -1);
                                this.f6758e = -2;
                            } else {
                                this.f6758e = -1;
                            }
                        }
                    } else {
                        this.f6758e = typedArray.getInteger(index, this.f6758e);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f7360x9) {
                    int i13 = typedArray.getInt(index, this.f6761h);
                    this.f6761h = i13;
                    if (i13 < 8) {
                        this.f6761h = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.i.B9) {
                    this.f6762i = typedArray.getFloat(index, this.f6762i);
                } else if (index == androidx.constraintlayout.widget.i.f7327u9) {
                    this.f6767n = typedArray.getInteger(index, this.f6767n);
                } else if (index == androidx.constraintlayout.widget.i.f7316t9) {
                    this.f6754a = typedArray.getResourceId(index, this.f6754a);
                } else if (index == androidx.constraintlayout.widget.i.C9) {
                    this.f6768o = typedArray.getBoolean(index, this.f6768o);
                } else if (index == androidx.constraintlayout.widget.i.A9) {
                    this.f6769p = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.i.f7371y9) {
                    this.f6770q = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.i.D9) {
                    this.f6771r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f6757d == -1) {
                this.f6755b = true;
            }
        }

        private void w(r rVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7305s9);
            v(rVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f6757d;
        }

        public s B() {
            return this.f6765l;
        }

        public boolean C() {
            return !this.f6768o;
        }

        public boolean D(int i11) {
            return (i11 & this.f6771r) != 0;
        }

        public void E(int i11) {
            this.f6761h = Math.max(i11, 8);
        }

        public void F(int i11, String str, int i12) {
            this.f6758e = i11;
            this.f6759f = str;
            this.f6760g = i12;
        }

        public void G(int i11) {
            this.f6769p = i11;
        }

        public void t(g gVar) {
            this.f6764k.add(gVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.f6766m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.f6767n;
        }

        public int y() {
            return this.f6756c;
        }

        public int z() {
            return this.f6770q;
        }

        public b(int i11, r rVar, int i12, int i13) {
            this.f6754a = -1;
            this.f6755b = false;
            this.f6756c = -1;
            this.f6757d = -1;
            this.f6758e = 0;
            this.f6759f = null;
            this.f6760g = -1;
            this.f6761h = 400;
            this.f6762i = BitmapDescriptorFactory.HUE_RED;
            this.f6764k = new ArrayList<>();
            this.f6765l = null;
            this.f6766m = new ArrayList<>();
            this.f6767n = 0;
            this.f6768o = false;
            this.f6769p = -1;
            this.f6770q = 0;
            this.f6771r = 0;
            this.f6754a = i11;
            this.f6763j = rVar;
            this.f6757d = i12;
            this.f6756c = i13;
            this.f6761h = rVar.f6742k;
            this.f6770q = rVar.f6743l;
        }

        b(r rVar, Context context, XmlPullParser xmlPullParser) {
            this.f6754a = -1;
            this.f6755b = false;
            this.f6756c = -1;
            this.f6757d = -1;
            this.f6758e = 0;
            this.f6759f = null;
            this.f6760g = -1;
            this.f6761h = 400;
            this.f6762i = BitmapDescriptorFactory.HUE_RED;
            this.f6764k = new ArrayList<>();
            this.f6765l = null;
            this.f6766m = new ArrayList<>();
            this.f6767n = 0;
            this.f6768o = false;
            this.f6769p = -1;
            this.f6770q = 0;
            this.f6771r = 0;
            this.f6761h = rVar.f6742k;
            this.f6770q = rVar.f6743l;
            this.f6763j = rVar;
            w(rVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
