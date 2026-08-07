package um;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f116465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f116466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f116467e;

    public n(int i11, int i12, int i13, p pVar, Map<String, Object> map) {
        this.f116463a = i11;
        this.f116464b = i12;
        this.f116465c = i13;
        this.f116466d = pVar;
        this.f116467e = map;
    }

    @Override // um.l, am.a
    @NonNull
    public Map<String, Object> getExtras() {
        return this.f116467e;
    }

    @Override // um.m
    public int getHeight() {
        return this.f116464b;
    }

    @Override // um.m
    public int getWidth() {
        return this.f116463a;
    }
}
