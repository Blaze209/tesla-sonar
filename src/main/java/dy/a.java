package dy;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f61055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61056b;

    public static class c extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f61063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f61064f;

        c(@NonNull zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", matrix);
            this.f61063e = zzvjVar.zzb();
            this.f61064f = zzvjVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f61065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f61066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Point[] f61067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f61068d;

        d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f61065a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                xx.b.e(rect2, matrix);
            }
            this.f61066b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                pointArr[i11] = new Point((Point) list.get(i11));
            }
            if (matrix != null) {
                xx.b.b(pointArr, matrix);
            }
            this.f61067c = pointArr;
            this.f61068d = str2;
        }

        public Rect a() {
            return this.f61066b;
        }

        @NonNull
        public String b() {
            return this.f61068d;
        }

        @NonNull
        protected final String c() {
            String str = this.f61065a;
            return str == null ? "" : str;
        }
    }

    public a(@NonNull zzvf zzvfVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f61055a = arrayList;
        this.f61056b = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new zzu() { // from class: dy.e
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new a.e((zzuz) obj, matrix);
            }
        }));
    }

    @NonNull
    public String a() {
        return this.f61056b;
    }

    @NonNull
    public List<e> b() {
        return Collections.unmodifiableList(this.f61055a);
    }

    public a(@NonNull String str, @NonNull List list) {
        ArrayList arrayList = new ArrayList();
        this.f61055a = arrayList;
        arrayList.addAll(list);
        this.f61056b = str;
    }

    public static class b extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f61060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f61061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f61062g;

        b(@NonNull zzvd zzvdVar, final Matrix matrix, float f11, float f12) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.f61060e = zzbu.zza(zzvdVar.zzg(), new zzu() { // from class: dy.g
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new a.C1246a((zzvb) obj, matrix);
                }
            });
            this.f61061f = f11;
            this.f61062g = f12;
        }

        @NonNull
        public String d() {
            return c();
        }

        public b(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, @NonNull List list2, float f11, float f12) {
            super(str, rect, list, str2, matrix);
            this.f61060e = list2;
            this.f61061f = f11;
            this.f61062g = f12;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f61069e;

        e(@NonNull zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
            this.f61069e = zzbu.zza(zzuzVar.zze(), new zzu() { // from class: dy.h
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new a.b(zzvdVar, matrix, zzvdVar.zzb(), zzvdVar.zza());
                }
            });
        }

        @NonNull
        public synchronized List<b> d() {
            return this.f61069e;
        }

        @NonNull
        public String e() {
            return c();
        }

        public e(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.f61069e = list2;
        }
    }

    /* JADX INFO: renamed from: dy.a$a, reason: collision with other inner class name */
    public static class C1246a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f61057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f61058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f61059g;

        C1246a(@NonNull zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
            this.f61058f = zzvbVar.zzb();
            this.f61059g = zzvbVar.zza();
            List listZzg = zzvbVar.zzg();
            this.f61057e = zzbu.zza(listZzg == null ? new ArrayList() : listZzg, new zzu() { // from class: dy.f
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new a.c((zzvj) obj, matrix);
                }
            });
        }

        public C1246a(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, float f11, float f12, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.f61058f = f11;
            this.f61059g = f12;
            this.f61057e = list2;
        }
    }
}
