package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f6524h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f6525i = d.f6477f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f6526j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f6527k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f6528l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f6529m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f6530n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f6531o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f6532p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f6533q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6534r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6535s = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f6536a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6536a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.S5, 1);
            f6536a.append(androidx.constraintlayout.widget.i.Q5, 2);
            f6536a.append(androidx.constraintlayout.widget.i.Z5, 3);
            f6536a.append(androidx.constraintlayout.widget.i.O5, 4);
            f6536a.append(androidx.constraintlayout.widget.i.P5, 5);
            f6536a.append(androidx.constraintlayout.widget.i.W5, 6);
            f6536a.append(androidx.constraintlayout.widget.i.X5, 7);
            f6536a.append(androidx.constraintlayout.widget.i.R5, 9);
            f6536a.append(androidx.constraintlayout.widget.i.Y5, 8);
            f6536a.append(androidx.constraintlayout.widget.i.V5, 11);
            f6536a.append(androidx.constraintlayout.widget.i.U5, 12);
            f6536a.append(androidx.constraintlayout.widget.i.T5, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f6536a.get(index)) {
                    case 1:
                        if (p.f6635d1) {
                            int resourceId = typedArray.getResourceId(index, hVar.f6479b);
                            hVar.f6479b = resourceId;
                            if (resourceId == -1) {
                                hVar.f6480c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f6480c = typedArray.getString(index);
                        } else {
                            hVar.f6479b = typedArray.getResourceId(index, hVar.f6479b);
                        }
                        break;
                    case 2:
                        hVar.f6478a = typedArray.getInt(index, hVar.f6478a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.f6524h = typedArray.getString(index);
                        } else {
                            hVar.f6524h = b5.c.f16443c[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        hVar.f6537g = typedArray.getInteger(index, hVar.f6537g);
                        break;
                    case 5:
                        hVar.f6526j = typedArray.getInt(index, hVar.f6526j);
                        break;
                    case 6:
                        hVar.f6529m = typedArray.getFloat(index, hVar.f6529m);
                        break;
                    case 7:
                        hVar.f6530n = typedArray.getFloat(index, hVar.f6530n);
                        break;
                    case 8:
                        float f11 = typedArray.getFloat(index, hVar.f6528l);
                        hVar.f6527k = f11;
                        hVar.f6528l = f11;
                        break;
                    case 9:
                        hVar.f6533q = typedArray.getInt(index, hVar.f6533q);
                        break;
                    case 10:
                        hVar.f6525i = typedArray.getInt(index, hVar.f6525i);
                        break;
                    case 11:
                        hVar.f6527k = typedArray.getFloat(index, hVar.f6527k);
                        break;
                    case 12:
                        hVar.f6528l = typedArray.getFloat(index, hVar.f6528l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6536a.get(index));
                        break;
                }
            }
            if (hVar.f6478a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public h() {
        this.f6481d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, f5.d> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new h().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        h hVar = (h) dVar;
        this.f6524h = hVar.f6524h;
        this.f6525i = hVar.f6525i;
        this.f6526j = hVar.f6526j;
        this.f6527k = hVar.f6527k;
        this.f6528l = Float.NaN;
        this.f6529m = hVar.f6529m;
        this.f6530n = hVar.f6530n;
        this.f6531o = hVar.f6531o;
        this.f6532p = hVar.f6532p;
        this.f6534r = hVar.f6534r;
        this.f6535s = hVar.f6535s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.N5));
    }
}
