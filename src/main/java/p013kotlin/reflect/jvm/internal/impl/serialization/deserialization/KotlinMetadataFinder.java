package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface KotlinMetadataFinder {
    InputStream findBuiltInsData(FqName fqName);
}
