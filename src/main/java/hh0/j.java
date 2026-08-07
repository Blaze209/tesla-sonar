package hh0;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements qj0.e<Set<JsonAdapterBinding<?>>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f72836a = new j();
    }

    public static j a() {
        return a.f72836a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) qj0.h.d(com.withpersona.sdk2.inquiry.internal.network.f.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}
