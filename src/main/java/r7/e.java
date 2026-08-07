package r7;

import android.os.Bundle;
import com.google.common.collect.r0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r0<a> f107102c = r0.f().j(new ou.h() { // from class: r7.b
        @Override // ou.h
        public final Object apply(Object obj) {
            return Integer.valueOf(((a) obj).f107083r);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f107103d = new e(x.r(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f107104e = q0.N0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f107105f = q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<a> f107106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f107107b;

    public e(List<a> list, long j11) {
        this.f107106a = x.y(f107102c, list);
        this.f107107b = j11;
    }

    private static x<a> b(List<a> list) {
        x.a aVarK = x.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).f107069d == null) {
                aVarK.a(list.get(i11));
            }
        }
        return aVarK.k();
    }

    public static e c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f107104e);
        return new e(parcelableArrayList == null ? x.r() : s7.i.d(new d(), parcelableArrayList), bundle.getLong(f107105f));
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f107104e, s7.i.h(b(this.f107106a), new ou.h() { // from class: r7.c
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((a) obj).c();
            }
        }));
        bundle.putLong(f107105f, this.f107107b);
        return bundle;
    }
}
