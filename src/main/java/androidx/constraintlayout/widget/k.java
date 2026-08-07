package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f7385a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7386b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7387c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray<a> f7388d = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f7390b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7392d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f7391c = -1;
            this.f7392d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.Z8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7105a9) {
                    this.f7389a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7389a);
                } else if (index == i.f7117b9) {
                    this.f7391c = typedArrayObtainStyledAttributes.getResourceId(index, this.f7391c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7391c);
                    context.getResources().getResourceName(this.f7391c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f7392d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f7390b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f7390b.size(); i11++) {
                if (this.f7390b.get(i11).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f7393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f7396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7398f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f7393a = Float.NaN;
            this.f7394b = Float.NaN;
            this.f7395c = Float.NaN;
            this.f7396d = Float.NaN;
            this.f7397e = -1;
            this.f7398f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.E9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.F9) {
                    this.f7397e = typedArrayObtainStyledAttributes.getResourceId(index, this.f7397e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7397e);
                    context.getResources().getResourceName(this.f7397e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f7398f = true;
                    }
                } else if (index == i.G9) {
                    this.f7396d = typedArrayObtainStyledAttributes.getDimension(index, this.f7396d);
                } else if (index == i.H9) {
                    this.f7394b = typedArrayObtainStyledAttributes.getDimension(index, this.f7394b);
                } else if (index == i.I9) {
                    this.f7395c = typedArrayObtainStyledAttributes.getDimension(index, this.f7395c);
                } else if (index == i.J9) {
                    this.f7393a = typedArrayObtainStyledAttributes.getDimension(index, this.f7393a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f11, float f12) {
            if (!Float.isNaN(this.f7393a) && f11 < this.f7393a) {
                return false;
            }
            if (!Float.isNaN(this.f7394b) && f12 < this.f7394b) {
                return false;
            }
            if (Float.isNaN(this.f7395c) || f11 <= this.f7395c) {
                return Float.isNaN(this.f7396d) || f12 <= this.f7396d;
            }
            return false;
        }
    }

    public k(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f7129c9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == i.f7140d9) {
                this.f7385a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7385a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.f7388d.put(aVar.f7389a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e12);
        }
    }

    public int a(int i11, int i12, float f11, float f12) {
        a aVar = this.f7388d.get(i12);
        if (aVar == null) {
            return i12;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            b bVar = null;
            for (b bVar2 : aVar.f7390b) {
                if (bVar2.a(f11, f12)) {
                    if (i11 != bVar2.f7397e) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f7397e : aVar.f7391c;
        }
        if (aVar.f7391c != i11) {
            Iterator<b> it = aVar.f7390b.iterator();
            while (it.hasNext()) {
                if (i11 == it.next().f7397e) {
                }
            }
            return aVar.f7391c;
        }
        return i11;
    }

    public int c(int i11, int i12, int i13) {
        return d(-1, i11, i12, i13);
    }

    public int d(int i11, int i12, float f11, float f12) {
        int iB;
        if (i11 != i12) {
            a aVar = this.f7388d.get(i12);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f11, f12);
            return iB2 == -1 ? aVar.f7391c : aVar.f7390b.get(iB2).f7397e;
        }
        a aVarValueAt = i12 == -1 ? this.f7388d.valueAt(0) : this.f7388d.get(this.f7386b);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.f7387c == -1 || !aVarValueAt.f7390b.get(i11).a(f11, f12)) && i11 != (iB = aVarValueAt.b(f11, f12))) {
            return iB == -1 ? aVarValueAt.f7391c : aVarValueAt.f7390b.get(iB).f7397e;
        }
        return i11;
    }
}
