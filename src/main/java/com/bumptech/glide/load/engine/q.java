package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Data> f20723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.f<List<Throwable>> f20724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f20725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20726d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, u5.f<List<Throwable>> fVar) {
        this.f20723a = cls;
        this.f20724b = fVar;
        this.f20725c = (List) xj.k.c(list);
        this.f20726d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private fj.c<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @NonNull dj.h hVar, int i11, int i12, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f20725c.size();
        fj.c<Transcode> cVarA = null;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                cVarA = this.f20725c.get(i13).a(eVar, i11, i12, hVar, aVar);
            } catch (GlideException e11) {
                list.add(e11);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f20726d, new ArrayList(list));
    }

    public fj.c<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, @NonNull dj.h hVar, int i11, int i12, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) xj.k.d(this.f20724b.b());
        try {
            return b(eVar, hVar, i11, i12, aVar, list);
        } finally {
            this.f20724b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f20725c.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
