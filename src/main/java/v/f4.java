package v;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f4 {
    @NonNull
    public static List<androidx.camera.core.impl.d3> a(int i11, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i11 == 0 || i11 == 1 || i11 == 3) {
            arrayList.addAll(h());
        }
        if (i11 == 1 || i11 == 3) {
            arrayList.addAll(e());
        }
        if (z11) {
            arrayList.addAll(j());
        }
        if (z12 && i11 == 0) {
            arrayList.addAll(c());
        }
        if (i11 == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> b() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.RECORD;
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar3));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar3));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar3));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar3, aVar3));
        arrayList.add(d3Var8);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> c() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var3);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> d() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.YUV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.s1440p;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.PRIV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.s720p;
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var8);
        androidx.camera.core.impl.d3 d3Var9 = new androidx.camera.core.impl.d3();
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var9);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> e() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var4.a(androidx.camera.core.impl.e3.a(androidx.camera.core.impl.e3.b.JPEG, aVar2));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.VGA;
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var6);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> f() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.YUV;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var8);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> g() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.VGA;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.RAW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar3, aVar3));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        d3Var2.a(androidx.camera.core.impl.e3.a(androidx.camera.core.impl.e3.b.JPEG, aVar3));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar3, aVar3));
        arrayList.add(d3Var2);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> h() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.RECORD;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar2));
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar3, androidx.camera.core.impl.e3.a.MAXIMUM));
        arrayList.add(d3Var6);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> i() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.s1440p;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar3));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var8);
        androidx.camera.core.impl.d3 d3Var9 = new androidx.camera.core.impl.d3();
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar, aVar3));
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var9);
        androidx.camera.core.impl.d3 d3Var10 = new androidx.camera.core.impl.d3();
        d3Var10.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        d3Var10.a(androidx.camera.core.impl.e3.a(bVar2, aVar));
        arrayList.add(d3Var10);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> j() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.RAW;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.YUV;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        androidx.camera.core.impl.e3.b bVar4 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar3, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var8);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> k() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.s1440p;
        d3Var.a(androidx.camera.core.impl.e3.b(bVar, aVar, 4L));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.YUV;
        d3Var2.a(androidx.camera.core.impl.e3.b(bVar2, aVar, 4L));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.RECORD;
        d3Var3.a(androidx.camera.core.impl.e3.b(bVar, aVar2, 3L));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.b(bVar2, aVar2, 3L));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var5.a(androidx.camera.core.impl.e3.b(bVar3, aVar3, 2L));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.b(bVar2, aVar3, 2L));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.a aVar4 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var7.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var7.a(androidx.camera.core.impl.e3.b(bVar3, aVar3, 2L));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var8.a(androidx.camera.core.impl.e3.b(bVar2, aVar3, 2L));
        arrayList.add(d3Var8);
        androidx.camera.core.impl.d3 d3Var9 = new androidx.camera.core.impl.d3();
        d3Var9.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var9.a(androidx.camera.core.impl.e3.b(bVar, aVar2, 3L));
        arrayList.add(d3Var9);
        androidx.camera.core.impl.d3 d3Var10 = new androidx.camera.core.impl.d3();
        d3Var10.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var10.a(androidx.camera.core.impl.e3.b(bVar2, aVar2, 3L));
        arrayList.add(d3Var10);
        androidx.camera.core.impl.d3 d3Var11 = new androidx.camera.core.impl.d3();
        d3Var11.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var11.a(androidx.camera.core.impl.e3.b(bVar2, aVar4, 1L));
        arrayList.add(d3Var11);
        androidx.camera.core.impl.d3 d3Var12 = new androidx.camera.core.impl.d3();
        d3Var12.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var12.a(androidx.camera.core.impl.e3.b(bVar, aVar2, 3L));
        d3Var12.a(androidx.camera.core.impl.e3.b(bVar3, aVar2, 2L));
        arrayList.add(d3Var12);
        androidx.camera.core.impl.d3 d3Var13 = new androidx.camera.core.impl.d3();
        d3Var13.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var13.a(androidx.camera.core.impl.e3.b(bVar2, aVar2, 3L));
        d3Var13.a(androidx.camera.core.impl.e3.b(bVar3, aVar2, 2L));
        arrayList.add(d3Var13);
        androidx.camera.core.impl.d3 d3Var14 = new androidx.camera.core.impl.d3();
        d3Var14.a(androidx.camera.core.impl.e3.b(bVar, aVar4, 1L));
        d3Var14.a(androidx.camera.core.impl.e3.b(bVar2, aVar4, 1L));
        d3Var14.a(androidx.camera.core.impl.e3.b(bVar3, aVar3, 2L));
        arrayList.add(d3Var14);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> l() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.JPEG_R;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        d3Var2.a(androidx.camera.core.impl.e3.a(androidx.camera.core.impl.e3.b.PRIV, androidx.camera.core.impl.e3.a.PREVIEW));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        arrayList.add(d3Var2);
        return arrayList;
    }

    @NonNull
    public static List<androidx.camera.core.impl.d3> m() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.d3 d3Var = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar = androidx.camera.core.impl.e3.b.YUV;
        androidx.camera.core.impl.e3.a aVar = androidx.camera.core.impl.e3.a.ULTRA_MAXIMUM;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        androidx.camera.core.impl.e3.b bVar2 = androidx.camera.core.impl.e3.b.PRIV;
        androidx.camera.core.impl.e3.a aVar2 = androidx.camera.core.impl.e3.a.PREVIEW;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        androidx.camera.core.impl.e3.a aVar3 = androidx.camera.core.impl.e3.a.RECORD;
        d3Var.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        arrayList.add(d3Var);
        androidx.camera.core.impl.d3 d3Var2 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar3 = androidx.camera.core.impl.e3.b.JPEG;
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var2.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        arrayList.add(d3Var2);
        androidx.camera.core.impl.d3 d3Var3 = new androidx.camera.core.impl.d3();
        androidx.camera.core.impl.e3.b bVar4 = androidx.camera.core.impl.e3.b.RAW;
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var3.a(androidx.camera.core.impl.e3.a(bVar2, aVar3));
        arrayList.add(d3Var3);
        androidx.camera.core.impl.d3 d3Var4 = new androidx.camera.core.impl.d3();
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        androidx.camera.core.impl.e3.a aVar4 = androidx.camera.core.impl.e3.a.MAXIMUM;
        d3Var4.a(androidx.camera.core.impl.e3.a(bVar3, aVar4));
        arrayList.add(d3Var4);
        androidx.camera.core.impl.d3 d3Var5 = new androidx.camera.core.impl.d3();
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var5.a(androidx.camera.core.impl.e3.a(bVar3, aVar4));
        arrayList.add(d3Var5);
        androidx.camera.core.impl.d3 d3Var6 = new androidx.camera.core.impl.d3();
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var6.a(androidx.camera.core.impl.e3.a(bVar3, aVar4));
        arrayList.add(d3Var6);
        androidx.camera.core.impl.d3 d3Var7 = new androidx.camera.core.impl.d3();
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var7.a(androidx.camera.core.impl.e3.a(bVar, aVar4));
        arrayList.add(d3Var7);
        androidx.camera.core.impl.d3 d3Var8 = new androidx.camera.core.impl.d3();
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var8.a(androidx.camera.core.impl.e3.a(bVar, aVar4));
        arrayList.add(d3Var8);
        androidx.camera.core.impl.d3 d3Var9 = new androidx.camera.core.impl.d3();
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var9.a(androidx.camera.core.impl.e3.a(bVar, aVar4));
        arrayList.add(d3Var9);
        androidx.camera.core.impl.d3 d3Var10 = new androidx.camera.core.impl.d3();
        d3Var10.a(androidx.camera.core.impl.e3.a(bVar, aVar));
        d3Var10.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var10.a(androidx.camera.core.impl.e3.a(bVar4, aVar4));
        arrayList.add(d3Var10);
        androidx.camera.core.impl.d3 d3Var11 = new androidx.camera.core.impl.d3();
        d3Var11.a(androidx.camera.core.impl.e3.a(bVar3, aVar));
        d3Var11.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var11.a(androidx.camera.core.impl.e3.a(bVar4, aVar4));
        arrayList.add(d3Var11);
        androidx.camera.core.impl.d3 d3Var12 = new androidx.camera.core.impl.d3();
        d3Var12.a(androidx.camera.core.impl.e3.a(bVar4, aVar));
        d3Var12.a(androidx.camera.core.impl.e3.a(bVar2, aVar2));
        d3Var12.a(androidx.camera.core.impl.e3.a(bVar4, aVar4));
        arrayList.add(d3Var12);
        return arrayList;
    }
}
