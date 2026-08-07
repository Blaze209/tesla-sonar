package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.collection.a;
import androidx.collection.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k11, @NonNull V v11, @NonNull K k12, @NonNull V v12, @NonNull K k13, @NonNull V v13) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k11, v11);
        mapZzb.put(k12, v12);
        mapZzb.put(k13, v13);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb2.append("Key and values array lengths not equal: ");
            sb2.append(length);
            sb2.append(" != ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i11 = 0; i11 < kArr.length; i11++) {
            mapZzb.put(kArr[i11], vArr[i11]);
        }
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i11) {
        return i11 == 0 ? new b() : zza(i11, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t11, @NonNull T t12, @NonNull T t13) {
        Set setZza = zza(3, false);
        setZza.add(t11);
        setZza.add(t12);
        setZza.add(t13);
        return Collections.unmodifiableSet(setZza);
    }

    private static Set zza(int i11, boolean z11) {
        if (i11 <= (true != z11 ? 256 : 128)) {
            return new b(i11);
        }
        return new HashSet(i11, true != z11 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i11, boolean z11) {
        return i11 <= 256 ? new a(i11) : new HashMap(i11, 1.0f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t11) {
        return Collections.singletonList(t11);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k11, @NonNull V v11, @NonNull K k12, @NonNull V v12, @NonNull K k13, @NonNull V v13, @NonNull K k14, @NonNull V v14, @NonNull K k15, @NonNull V v15, @NonNull K k16, @NonNull V v16) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k11, v11);
        mapZzb.put(k12, v12);
        mapZzb.put(k13, v13);
        mapZzb.put(k14, v14);
        mapZzb.put(k15, v15);
        mapZzb.put(k16, v16);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t11 = tArr[0];
            T t12 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t11);
            setZza.add(t12);
            return Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return Collections.unmodifiableSet(setZza2);
        }
        T t13 = tArr[0];
        T t14 = tArr[1];
        T t15 = tArr[2];
        T t16 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t13);
        setZza3.add(t14);
        setZza3.add(t15);
        setZza3.add(t16);
        return Collections.unmodifiableSet(setZza3);
    }
}
