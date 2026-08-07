package wm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f122039a;

    public c(Set<e> set) {
        this.f122039a = new ArrayList(set.size());
        for (e eVar : set) {
            if (eVar != null) {
                this.f122039a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th2) {
        qk.a.n("ForwardingRequestListener", str, th2);
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void a(String str, String str2) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).a(str, str2);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // wm.e
    public void b(com.facebook.imagepipeline.request.a aVar, String str, boolean z11) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).b(aVar, str, z11);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void c(String str, String str2, Throwable th2, Map<String, String> map) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).c(str, str2, th2, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void d(String str, String str2, String str3) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).d(str, str2, str3);
            } catch (Exception e11) {
                l("InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // wm.e
    public void e(com.facebook.imagepipeline.request.a aVar, Object obj, String str, boolean z11) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).e(aVar, obj, str, z11);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean f(String str) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f122039a.get(i11).f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void g(String str, String str2, Map<String, String> map) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).g(str, str2, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void h(String str, String str2, Map<String, String> map) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).h(str, str2, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void i(String str, String str2, boolean z11) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).i(str, str2, z11);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // wm.e
    public void j(com.facebook.imagepipeline.request.a aVar, String str, Throwable th2, boolean z11) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).j(aVar, str, th2, z11);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestFailure", e11);
            }
        }
    }

    @Override // wm.e
    public void k(String str) {
        int size = this.f122039a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f122039a.get(i11).k(str);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    public c(e... eVarArr) {
        this.f122039a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f122039a.add(eVar);
            }
        }
    }
}
