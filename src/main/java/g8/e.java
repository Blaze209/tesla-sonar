package g8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements l8.a<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f67469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67470c;

    protected e(String str, List<String> list, boolean z11) {
        this.f67468a = str;
        this.f67469b = Collections.unmodifiableList(list);
        this.f67470c = z11;
    }
}
