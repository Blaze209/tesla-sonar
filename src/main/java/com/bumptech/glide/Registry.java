package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jj.o;
import jj.p;
import jj.q;

/* JADX INFO: loaded from: classes3.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tj.a f20444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tj.e f20445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tj.f f20446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f20447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qj.f f20448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tj.b f20449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final tj.d f20450h = new tj.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final tj.c f20451i = new tj.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u5.f<List<Throwable>> f20452j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m11, @NonNull List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m11);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        u5.f<List<Throwable>> fVarE = yj.a.e();
        this.f20452j = fVarE;
        this.f20443a = new q(fVarE);
        this.f20444b = new tj.a();
        this.f20445c = new tj.e();
        this.f20446d = new tj.f();
        this.f20447e = new com.bumptech.glide.load.data.f();
        this.f20448f = new qj.f();
        this.f20449g = new tj.b();
        s(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    @NonNull
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f20445c.d(cls, cls2)) {
            for (Class cls5 : this.f20448f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f20445c.b(cls, cls4), this.f20448f.a(cls4, cls5), this.f20452j));
            }
        }
        return arrayList;
    }

    @NonNull
    public <Data> Registry a(@NonNull Class<Data> cls, @NonNull dj.d<Data> dVar) {
        this.f20444b.a(cls, dVar);
        return this;
    }

    @NonNull
    public <TResource> Registry b(@NonNull Class<TResource> cls, @NonNull dj.k<TResource> kVar) {
        this.f20446d.a(cls, kVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull dj.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<Model, Data> pVar) {
        this.f20443a.a(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull dj.j<Data, TResource> jVar) {
        this.f20445c.a(str, jVar, cls, cls2);
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f20449g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.q<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVarA = this.f20451i.a(cls, cls2, cls3);
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVar = null;
        if (this.f20451i.c(qVarA)) {
            return null;
        }
        if (qVarA != null) {
            return qVarA;
        }
        List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            qVar = new com.bumptech.glide.load.engine.q<>(cls4, cls5, cls6, listF, this.f20452j);
        }
        this.f20451i.d(cls4, cls5, cls6, qVar);
        return qVar;
    }

    @NonNull
    public <Model> List<o<Model, ?>> i(@NonNull Model model) {
        return this.f20443a.d(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listA = this.f20450h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f20443a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f20445c.d(it.next(), cls2)) {
                    if (!this.f20448f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f20450h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    @NonNull
    public <X> dj.k<X> k(@NonNull fj.c<X> cVar) {
        dj.k<X> kVarB = this.f20446d.b(cVar.a());
        if (kVarB != null) {
            return kVarB;
        }
        throw new NoResultEncoderAvailableException(cVar.a());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.e<X> l(@NonNull X x11) {
        return this.f20447e.a(x11);
    }

    @NonNull
    public <X> dj.d<X> m(@NonNull X x11) {
        dj.d<X> dVarB = this.f20444b.b(x11.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new NoSourceEncoderAvailableException(x11.getClass());
    }

    public boolean n(@NonNull fj.c<?> cVar) {
        return this.f20446d.b(cVar.a()) != null;
    }

    @NonNull
    public Registry o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f20449g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public Registry p(@NonNull com.bumptech.glide.load.data.e.a<?> aVar) {
        this.f20447e.b(aVar);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry q(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull qj.e<TResource, Transcode> eVar) {
        this.f20448f.c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry r(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.f20443a.f(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public final Registry s(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f20445c.e(arrayList);
        return this;
    }
}
