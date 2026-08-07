package a0;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import b0.h;
import c0.n;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.r2;
import w.m0;

/* JADX INFO: loaded from: classes.dex */
public class a implements d0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final m0 f25a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Map<String, List<String>> f27c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private Set<Set<String>> f29e = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<d0.a.InterfaceC1210a> f26b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private List<n> f28d = new ArrayList();

    public a(@NonNull m0 m0Var) {
        this.f25a = m0Var;
        e();
    }

    private void e() {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = this.f25a.e();
        } catch (CameraAccessExceptionCompat unused) {
            y0.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (r2.a(this.f25a, str) && r2.a(this.f25a, str2)) {
                        this.f29e.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.f27c.containsKey(str)) {
                            this.f27c.put(str, new ArrayList());
                        }
                        if (!this.f27c.containsKey(str2)) {
                            this.f27c.put(str2, new ArrayList());
                        }
                        this.f27c.get(str).add((String) arrayList.get(1));
                        this.f27c.get(str2).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    y0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override // d0.a
    public String a(@NonNull String str) {
        if (!this.f27c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f27c.get(str)) {
            Iterator<n> it = this.f28d.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a(it.next()).c())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // d0.a
    public int b() {
        return this.f30f;
    }

    @Override // d0.a
    public void c(@NonNull d0.a.InterfaceC1210a interfaceC1210a) {
        this.f26b.add(interfaceC1210a);
    }

    @Override // d0.a
    public void d(int i11) {
        if (i11 != this.f30f) {
            Iterator<d0.a.InterfaceC1210a> it = this.f26b.iterator();
            while (it.hasNext()) {
                it.next().a(this.f30f, i11);
            }
        }
        if (this.f30f == 2 && i11 != 2) {
            this.f28d.clear();
        }
        this.f30f = i11;
    }

    @Override // d0.a
    public void shutdown() {
        this.f26b.clear();
        this.f27c.clear();
        this.f28d.clear();
        this.f29e.clear();
        this.f30f = 0;
    }
}
