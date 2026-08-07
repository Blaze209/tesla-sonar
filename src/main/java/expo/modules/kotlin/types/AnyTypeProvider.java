package expo.modules.kotlin.types;

import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.typedarray.BigInt64Array;
import expo.modules.kotlin.typedarray.BigUint64Array;
import expo.modules.kotlin.typedarray.Float32Array;
import expo.modules.kotlin.typedarray.Float64Array;
import expo.modules.kotlin.typedarray.Int16Array;
import expo.modules.kotlin.typedarray.Int32Array;
import expo.modules.kotlin.typedarray.Int8Array;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.typedarray.Uint16Array;
import expo.modules.kotlin.typedarray.Uint32Array;
import expo.modules.kotlin.typedarray.Uint8Array;
import expo.modules.kotlin.typedarray.Uint8ClampedArray;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\u0006\b\u0000\u0010\u0004\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007R<\u0010\f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u00050\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/types/AnyTypeProvider;", "", "<init>", "()V", "T", "Lexpo/modules/kotlin/types/AnyType;", "cachedAnyType", "()Lexpo/modules/kotlin/types/AnyType;", "", "Lkotlin/Pair;", "Lco0/d;", "", "typesMap", "Ljava/util/Map;", "getTypesMap", "()Ljava/util/Map;", "getTypesMap$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnyTypeProvider {
    public static final AnyTypeProvider INSTANCE = new AnyTypeProvider();
    private static final Map<Pair<co0.d<?>, Boolean>, AnyType> typesMap;

    static {
        Map mapC = v0.c();
        for (co0.d dVar : v.p(o0.b(Integer.TYPE), o0.b(Float.TYPE), o0.b(Double.TYPE), o0.b(Long.TYPE), o0.b(Boolean.TYPE), o0.b(String.class), o0.b(byte[].class), o0.b(long[].class), o0.b(int[].class), o0.b(boolean[].class), o0.b(float[].class), o0.b(double[].class), o0.b(JavaScriptValue.class), o0.b(JavaScriptObject.class), o0.b(TypedArray.class), o0.b(Int8Array.class), o0.b(Int16Array.class), o0.b(Int32Array.class), o0.b(Uint8Array.class), o0.b(Uint8ClampedArray.class), o0.b(Uint16Array.class), o0.b(Uint32Array.class), o0.b(Float32Array.class), o0.b(Float64Array.class), o0.b(BigInt64Array.class), o0.b(BigUint64Array.class), o0.b(ReadableArray.class), o0.b(ReadableMap.class), o0.b(URL.class), o0.b(Uri.class), o0.b(URI.class), o0.b(File.class), o0.b(Object.class), o0.b(h0.class), o0.b(ReadableArguments.class))) {
            mapC.put(x.a(dVar, Boolean.FALSE), new AnyType(new EmptyKType(dVar, false), null, 2, null));
            mapC.put(x.a(dVar, Boolean.TRUE), new AnyType(new EmptyKType(dVar, true), null, 2, null));
        }
        typesMap = v0.b(mapC);
    }

    private AnyTypeProvider() {
    }

    public static /* synthetic */ void getTypesMap$annotations() {
    }

    public final /* synthetic */ <T> AnyType cachedAnyType() {
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        return getTypesMap().get(new Pair(dVarB, false));
    }

    public final Map<Pair<co0.d<?>, Boolean>, AnyType> getTypesMap() {
        return typesMap;
    }
}
