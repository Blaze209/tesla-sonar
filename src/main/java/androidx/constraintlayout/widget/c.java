package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f6960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f6961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6962c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f6963d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f6964e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<d> f6965f = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f6967b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f6969d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f6968c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.Z8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7105a9) {
                    this.f6966a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6966a);
                } else if (index == i.f7117b9) {
                    this.f6968c = typedArrayObtainStyledAttributes.getResourceId(index, this.f6968c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6968c);
                    context.getResources().getResourceName(this.f6968c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6969d = dVar;
                        dVar.n(context, this.f6968c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f6967b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f6967b.size(); i11++) {
                if (this.f6967b.get(i11).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f6970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f6971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f6972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f6973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f6975f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f6970a = Float.NaN;
            this.f6971b = Float.NaN;
            this.f6972c = Float.NaN;
            this.f6973d = Float.NaN;
            this.f6974e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.E9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.F9) {
                    this.f6974e = typedArrayObtainStyledAttributes.getResourceId(index, this.f6974e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6974e);
                    context.getResources().getResourceName(this.f6974e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6975f = dVar;
                        dVar.n(context, this.f6974e);
                    }
                } else if (index == i.G9) {
                    this.f6973d = typedArrayObtainStyledAttributes.getDimension(index, this.f6973d);
                } else if (index == i.H9) {
                    this.f6971b = typedArrayObtainStyledAttributes.getDimension(index, this.f6971b);
                } else if (index == i.I9) {
                    this.f6972c = typedArrayObtainStyledAttributes.getDimension(index, this.f6972c);
                } else if (index == i.J9) {
                    this.f6970a = typedArrayObtainStyledAttributes.getDimension(index, this.f6970a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f11, float f12) {
            if (!Float.isNaN(this.f6970a) && f11 < this.f6970a) {
                return false;
            }
            if (!Float.isNaN(this.f6971b) && f12 < this.f6971b) {
                return false;
            }
            if (Float.isNaN(this.f6972c) || f11 <= this.f6972c) {
                return Float.isNaN(this.f6973d) || f12 <= this.f6973d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i11) {
        this.f6960a = constraintLayout;
        a(context, i11);
    }

    private void a(Context context, int i11) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f6964e.put(aVar2.f6966a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e12);
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.L(context, xmlPullParser);
                this.f6965f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i11, float f11, float f12) {
        int iB;
        int i12 = this.f6962c;
        if (i12 == i11) {
            a aVarValueAt = i11 == -1 ? this.f6964e.valueAt(0) : this.f6964e.get(i12);
            int i13 = this.f6963d;
            if ((i13 == -1 || !aVarValueAt.f6967b.get(i13).a(f11, f12)) && this.f6963d != (iB = aVarValueAt.b(f11, f12))) {
                d dVar = iB == -1 ? this.f6961b : aVarValueAt.f6967b.get(iB).f6975f;
                if (iB != -1) {
                    int i14 = aVarValueAt.f6967b.get(iB).f6974e;
                }
                if (dVar == null) {
                    return;
                }
                this.f6963d = iB;
                dVar.i(this.f6960a);
                return;
            }
            return;
        }
        this.f6962c = i11;
        a aVar = this.f6964e.get(i11);
        int iB2 = aVar.b(f11, f12);
        d dVar2 = iB2 == -1 ? aVar.f6969d : aVar.f6967b.get(iB2).f6975f;
        if (iB2 != -1) {
            int i15 = aVar.f6967b.get(iB2).f6974e;
        }
        if (dVar2 != null) {
            this.f6963d = iB2;
            dVar2.i(this.f6960a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f11 + ", " + f12);
    }
}
