package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<DataType> f20641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<? extends dj.j<DataType, ResourceType>> f20642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj.e<ResourceType, Transcode> f20643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u5.f<List<Throwable>> f20644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20645e;

    interface a<ResourceType> {
        @NonNull
        fj.c<ResourceType> a(@NonNull fj.c<ResourceType> cVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends dj.j<DataType, ResourceType>> list, qj.e<ResourceType, Transcode> eVar, u5.f<List<Throwable>> fVar) {
        this.f20641a = cls;
        this.f20642b = list;
        this.f20643c = eVar;
        this.f20644d = fVar;
        this.f20645e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    private fj.c<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull dj.h hVar) {
        List<Throwable> list = (List) xj.k.d(this.f20644d.b());
        try {
            return c(eVar, i11, i12, hVar, list);
        } finally {
            this.f20644d.a(list);
        }
    }

    @NonNull
    private fj.c<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull dj.h hVar, List<Throwable> list) throws GlideException {
        int size = this.f20642b.size();
        fj.c<ResourceType> cVarA = null;
        for (int i13 = 0; i13 < size; i13++) {
            dj.j<DataType, ResourceType> jVar = this.f20642b.get(i13);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    cVarA = jVar.a(eVar.a(), i11, i12, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e11);
                }
                list.add(e11);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f20645e, new ArrayList(list));
    }

    public fj.c<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull dj.h hVar, a<ResourceType> aVar) {
        return this.f20643c.a(aVar.a(b(eVar, i11, i12, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f20641a + ", decoders=" + this.f20642b + ", transcoder=" + this.f20643c + CoreConstants.CURLY_RIGHT;
    }
}
