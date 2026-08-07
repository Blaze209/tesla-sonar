package ml;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ll.s;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static Drawable a(Context context, TypedArray typedArray, int i11) {
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    private static e b(b bVar) {
        if (bVar.s() == null) {
            bVar.J(new e());
        }
        return bVar.s();
    }

    public static s c(TypedArray typedArray, int i11) {
        switch (typedArray.getInt(i11, -2)) {
            case -1:
                return null;
            case 0:
                return s.f90213a;
            case 1:
                return s.f90216d;
            case 2:
                return s.f90217e;
            case 3:
                return s.f90218f;
            case 4:
                return s.f90219g;
            case 5:
                return s.f90220h;
            case 6:
                return s.f90221i;
            case 7:
                return s.f90222j;
            case 8:
                return s.f90223k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static b d(Context context, AttributeSet attributeSet) throws Throwable {
        if (bn.b.d()) {
            bn.b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        b bVarE = e(new b(context.getResources()), context, attributeSet);
        if (bn.b.d()) {
            bn.b.b();
        }
        return bVarE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static b e(b bVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, dl.a.f60711a);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i13 = 0;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z21 = true;
                boolean z22 = true;
                boolean z23 = true;
                boolean z24 = true;
                int dimensionPixelSize = 0;
                while (i13 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i13);
                        if (index == dl.a.f60712b) {
                            bVar.v(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60718h) {
                            bVar.C(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60720j) {
                            bVar.E(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60722l) {
                            bVar.F(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60714d) {
                            bVar.y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == dl.a.D) {
                            bVar.x(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                        } else if (index == dl.a.f60719i) {
                            bVar.D(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60724n) {
                            bVar.H(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60725o) {
                            bVar.I(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60715e) {
                            bVar.z(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60716f) {
                            bVar.A(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60723m) {
                            bVar.G(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60721k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == dl.a.f60713c) {
                            bVar.w(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60717g) {
                            bVar.B(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == dl.a.f60726p) {
                            b(bVar).t(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == dl.a.f60736z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i14 = dimensionPixelSize;
                            if (index == dl.a.f60732v) {
                                z16 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                            } else if (index == dl.a.f60733w) {
                                z18 = typedArrayObtainStyledAttributes.getBoolean(index, z18);
                            } else if (index == dl.a.f60728r) {
                                z23 = typedArrayObtainStyledAttributes.getBoolean(index, z23);
                            } else if (index == dl.a.f60729s) {
                                z21 = typedArrayObtainStyledAttributes.getBoolean(index, z21);
                            } else if (index == dl.a.f60734x) {
                                z17 = typedArrayObtainStyledAttributes.getBoolean(index, z17);
                            } else if (index == dl.a.f60731u) {
                                z19 = typedArrayObtainStyledAttributes.getBoolean(index, z19);
                            } else if (index == dl.a.f60730t) {
                                z24 = typedArrayObtainStyledAttributes.getBoolean(index, z24);
                            } else {
                                if (index == dl.a.f60727q) {
                                    z22 = typedArrayObtainStyledAttributes.getBoolean(index, z22);
                                } else if (index == dl.a.f60735y) {
                                    dimensionPixelSize = i14;
                                    b(bVar).q(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i14;
                                    if (index == dl.a.C) {
                                        b(bVar).n(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == dl.a.A) {
                                        b(bVar).m(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == dl.a.B) {
                                        b(bVar).r(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                }
                                i13++;
                                context2 = context;
                            }
                            dimensionPixelSize = i14;
                        }
                        i13++;
                        context2 = context;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z25 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z15 = z16 && z19;
                    z11 = z18 && z17;
                    z12 = z21 && z24;
                    if (z23 && z22) {
                        z25 = true;
                    }
                } else {
                    z15 = z16 && z17;
                    z11 = z18 && z19;
                    z12 = z21 && z22;
                    if (z23 && z24) {
                        z25 = true;
                    }
                }
                z14 = z25;
                i11 = integer;
                z13 = z15;
                i12 = dimensionPixelSize;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            z11 = true;
            i11 = 0;
            z12 = true;
            z13 = true;
            z14 = true;
            i12 = 0;
        }
        if (bVar.n() != null && i11 > 0) {
            bVar.F(new ll.b(bVar.n(), i11));
        }
        if (i12 > 0) {
            b(bVar).o(z13 ? i12 : BitmapDescriptorFactory.HUE_RED, z11 ? i12 : BitmapDescriptorFactory.HUE_RED, z12 ? i12 : BitmapDescriptorFactory.HUE_RED, z14 ? i12 : BitmapDescriptorFactory.HUE_RED);
        }
        return bVar;
    }
}
