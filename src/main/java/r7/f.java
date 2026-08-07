package r7;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f107108a = q0.N0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f107109b = q0.N0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f107110c = q0.N0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f107111d = q0.N0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f107112e = q0.N0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 1, iVar.b()));
        }
        for (k kVar : (k[]) spanned.getSpans(0, spanned.length(), k.class)) {
            arrayList.add(b(spanned, kVar, 2, kVar.b()));
        }
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 3, null));
        }
        for (l lVar : (l[]) spanned.getSpans(0, spanned.length(), l.class)) {
            arrayList.add(b(spanned, lVar, 4, lVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i11, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f107108a, spanned.getSpanStart(obj));
        bundle2.putInt(f107109b, spanned.getSpanEnd(obj));
        bundle2.putInt(f107110c, spanned.getSpanFlags(obj));
        bundle2.putInt(f107111d, i11);
        if (bundle != null) {
            bundle2.putBundle(f107112e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i11 = bundle.getInt(f107108a);
        int i12 = bundle.getInt(f107109b);
        int i13 = bundle.getInt(f107110c);
        int i14 = bundle.getInt(f107111d, -1);
        Bundle bundle2 = bundle.getBundle(f107112e);
        if (i14 == 1) {
            spannable.setSpan(i.a((Bundle) s7.a.f(bundle2)), i11, i12, i13);
            return;
        }
        if (i14 == 2) {
            spannable.setSpan(k.a((Bundle) s7.a.f(bundle2)), i11, i12, i13);
        } else if (i14 == 3) {
            spannable.setSpan(new g(), i11, i12, i13);
        } else {
            if (i14 != 4) {
                return;
            }
            spannable.setSpan(l.a((Bundle) s7.a.f(bundle2)), i11, i12, i13);
        }
    }
}
