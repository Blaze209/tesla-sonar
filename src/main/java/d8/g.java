package d8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f59816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f> f59817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f59818e;

    public g(String str, long j11, List<a> list, List<f> list2) {
        this(str, j11, list, list2, null);
    }

    public int a(int i11) {
        int size = this.f59816c.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f59816c.get(i12).f59769b == i11) {
                return i12;
            }
        }
        return -1;
    }

    public g(String str, long j11, List<a> list, List<f> list2, e eVar) {
        this.f59814a = str;
        this.f59815b = j11;
        this.f59816c = Collections.unmodifiableList(list);
        this.f59817d = Collections.unmodifiableList(list2);
        this.f59818e = eVar;
    }
}
