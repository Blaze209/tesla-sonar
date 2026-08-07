package d8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f59770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f59771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f59772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f59773f;

    public a(long j11, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f59768a = j11;
        this.f59769b = i11;
        this.f59770c = Collections.unmodifiableList(list);
        this.f59771d = Collections.unmodifiableList(list2);
        this.f59772e = Collections.unmodifiableList(list3);
        this.f59773f = Collections.unmodifiableList(list4);
    }
}
