package p013kotlin.reflect.jvm.internal.impl.resolve.sam;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<Object> f88496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CacheWithNullableValues<ClassDescriptor, SimpleType> f88497b;

    public SamConversionResolverImpl(StorageManager storageManager, Iterable<? extends Object> samWithReceiverResolvers) {
        s.k(storageManager, "storageManager");
        s.k(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f88496a = samWithReceiverResolvers;
        this.f88497b = storageManager.createCacheWithNullableValues();
    }
}
