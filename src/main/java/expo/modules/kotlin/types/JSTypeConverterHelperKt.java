package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co0.h;
import co0.l;
import co0.o;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u000b¢\u0006\u0004\b\u0004\u0010\f\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\r\u001a7\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0010\u001a1\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0011\u001a%\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0004\u0010\u0014\u001a%\u0010\t\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0016\u001a%\u0010\t\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0018\u001a\u0019\u0010\t\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u001a\u001a\u0019\u0010\t\u001a\u00020\u0015*\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u001c\u001a\u0019\u0010\t\u001a\u00020\u0015*\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u001e\u001a\u0019\u0010\t\u001a\u00020\u0015*\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010 \u001a\u0019\u0010\t\u001a\u00020\u0015*\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\"\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030#¢\u0006\u0004\b\t\u0010$\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020%¢\u0006\u0004\b\t\u0010&\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020'¢\u0006\u0004\b\t\u0010(\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020)¢\u0006\u0004\b\t\u0010*\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020+¢\u0006\u0004\b\t\u0010,\u001a!\u0010\t\u001a\u00020\u0015*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030-2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010.\u001a%\u00102\u001a\u000201*\u00020\b2\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00102\u001a\u000201*\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b2\u00104¨\u00065"}, d2 = {"Lexpo/modules/kotlin/records/Record;", "", "", "", "toJSValueExperimental", "(Lexpo/modules/kotlin/records/Record;)Ljava/util/Map;", "Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;", "containerProvider", "Lcom/facebook/react/bridge/WritableMap;", "toJSValue", "(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Ljava/util/Map;", "(Landroid/os/Bundle;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "K", "V", "(Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "T", "", "(Ljava/util/Collection;)Ljava/util/Collection;", "Lcom/facebook/react/bridge/WritableArray;", "(Ljava/util/Collection;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([ILexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([JLexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([FLexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([DLexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "([ZLexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "(Ljava/lang/Enum;)Ljava/lang/Object;", "Ljava/net/URL;", "(Ljava/net/URL;)Ljava/lang/String;", "Landroid/net/Uri;", "(Landroid/net/Uri;)Ljava/lang/String;", "Ljava/net/URI;", "(Ljava/net/URI;)Ljava/lang/String;", "Ljava/io/File;", "(Ljava/io/File;)Ljava/lang/String;", "Lkotlin/Pair;", "(Lkotlin/Pair;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "putGeneric", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;)V", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JSTypeConverterHelperKt {
    public static final void putGeneric(WritableMap writableMap, String key, Object obj) {
        s.k(writableMap, "<this>");
        s.k(key, "key");
        if (obj == null || (obj instanceof h0)) {
            writableMap.putNull(key);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(key, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final WritableMap toJSValue(Record record, JSTypeConverter.ContainerProvider containerProvider) {
        Object next;
        s.k(record, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        Collection<o> collectionE = do0.c.e(vn0.a.e(record.getClass()));
        ArrayList arrayList = new ArrayList(v.y(collectionE, 10));
        for (o oVar : collectionE) {
            Iterator<T> it = oVar.getAnnotations().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof Field));
            Field field = (Field) next;
            if (field != null) {
                String strKey = field.key();
                String name = s.f(strKey, "") ? null : strKey;
                if (name == null) {
                    name = oVar.getName();
                }
                eo0.a.b(oVar, true);
                putGeneric(writableMapCreateMap, name, JSTypeConverter.INSTANCE.legacyConvertToJSValue(oVar.get(record), containerProvider));
            }
            arrayList.add(h0.f84049a);
        }
        return writableMapCreateMap;
    }

    public static final Map<String, Object> toJSValueExperimental(Record record) {
        Object next;
        s.k(record, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<o> collectionE = do0.c.e(vn0.a.e(record.getClass()));
        ArrayList arrayList = new ArrayList(v.y(collectionE, 10));
        for (o oVar : collectionE) {
            Iterator<T> it = oVar.getAnnotations().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof Field));
            Field field = (Field) next;
            if (field != null) {
                String strKey = field.key();
                String name = s.f(strKey, "") ? null : strKey;
                if (name == null) {
                    name = oVar.getName();
                }
                eo0.a.b(oVar, true);
                linkedHashMap.put(name, JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, oVar.get(record), null, true, 2, null));
            }
            arrayList.add(h0.f84049a);
        }
        return linkedHashMap;
    }

    public static final void putGeneric(WritableArray writableArray, Object obj) {
        s.k(writableArray, "<this>");
        if (obj != null && !(obj instanceof h0)) {
            if (obj instanceof ReadableArray) {
                writableArray.pushArray((ReadableArray) obj);
                return;
            }
            if (obj instanceof ReadableMap) {
                writableArray.pushMap((ReadableMap) obj);
                return;
            }
            if (obj instanceof String) {
                writableArray.pushString((String) obj);
                return;
            }
            if (obj instanceof Integer) {
                writableArray.pushInt(((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                writableArray.pushLong(((Number) obj).longValue());
                return;
            }
            if (obj instanceof Number) {
                writableArray.pushDouble(((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Boolean) {
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
        }
        writableArray.pushNull();
    }

    public static final WritableMap toJSValue(Bundle bundle, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(bundle, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        for (String str : bundle.keySet()) {
            Object objLegacyConvertToJSValue = JSTypeConverter.INSTANCE.legacyConvertToJSValue(bundle.get(str), containerProvider);
            s.h(str);
            putGeneric(writableMapCreateMap, str, objLegacyConvertToJSValue);
        }
        return writableMapCreateMap;
    }

    public static final Map<String, Object> toJSValueExperimental(Bundle bundle) {
        s.k(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, bundle.get(str), null, true, 2, null));
        }
        return linkedHashMap;
    }

    public static final <K, V> WritableMap toJSValue(Map<K, ? extends V> map, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(map, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            putGeneric(writableMapCreateMap, String.valueOf(key), JSTypeConverter.INSTANCE.legacyConvertToJSValue(entry.getValue(), containerProvider));
        }
        return writableMapCreateMap;
    }

    public static final <T> Collection<Object> toJSValueExperimental(Collection<? extends T> collection) {
        s.k(collection, "<this>");
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList = new ArrayList(v.y(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, it.next(), null, true, 2, null));
        }
        return arrayList;
    }

    public static final <T> WritableArray toJSValue(Collection<? extends T> collection, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(collection, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            putGeneric(writableArrayCreateArray, JSTypeConverter.INSTANCE.legacyConvertToJSValue(it.next(), containerProvider));
        }
        return writableArrayCreateArray;
    }

    public static final <K, V> Map<String, Object> toJSValueExperimental(Map<K, ? extends V> map) {
        s.k(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            arrayList.add(x.a(String.valueOf(entry.getKey()), JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, entry.getValue(), null, true, 2, null)));
        }
        return v0.y(arrayList);
    }

    public static final <T> WritableArray toJSValue(T[] tArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(tArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (T t11 : tArr) {
            putGeneric(writableArrayCreateArray, JSTypeConverter.INSTANCE.legacyConvertToJSValue(t11, containerProvider));
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(int[] iArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(iArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (int i11 : iArr) {
            writableArrayCreateArray.pushInt(i11);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(long[] jArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(jArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (long j11 : jArr) {
            writableArrayCreateArray.pushLong(j11);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(float[] fArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(fArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (float f11 : fArr) {
            writableArrayCreateArray.pushDouble(f11);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(double[] dArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(dArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (double d11 : dArr) {
            writableArrayCreateArray.pushDouble(d11);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(boolean[] zArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(zArr, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (boolean z11 : zArr) {
            writableArrayCreateArray.pushBoolean(z11);
        }
        return writableArrayCreateArray;
    }

    public static final Object toJSValue(Enum<?> r11) {
        s.k(r11, "<this>");
        h hVarF = do0.c.f(o0.b(r11.getClass()));
        if (hVarF != null) {
            if (hVarF.getParameters().isEmpty()) {
                return r11.name();
            }
            if (hVarF.getParameters().size() == 1) {
                String name = ((l) v.o0(hVarF.getParameters())).getName();
                s.h(name);
                for (Object obj : do0.c.d(o0.b(r11.getClass()))) {
                    if (s.f(((o) obj).getName(), name)) {
                        s.i(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                        return ((o) obj).get(r11);
                    }
                }
                obj = null;
                s.i(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                return ((o) obj).get(r11);
            }
            throw new IllegalStateException("Enum '" + r11.getClass() + "' cannot be used as return type (incompatible with JS)");
        }
        throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
    }

    public static final String toJSValue(URL url) {
        s.k(url, "<this>");
        String string = url.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(Uri uri) {
        s.k(uri, "<this>");
        String string = uri.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(URI uri) {
        s.k(uri, "<this>");
        String string = uri.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(File file) {
        s.k(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        s.j(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final WritableArray toJSValue(Pair<?, ?> pair, JSTypeConverter.ContainerProvider containerProvider) {
        s.k(pair, "<this>");
        s.k(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        JSTypeConverter jSTypeConverter = JSTypeConverter.INSTANCE;
        Object objLegacyConvertToJSValue = jSTypeConverter.legacyConvertToJSValue(pair.e(), containerProvider);
        Object objLegacyConvertToJSValue2 = jSTypeConverter.legacyConvertToJSValue(pair.f(), containerProvider);
        putGeneric(writableArrayCreateArray, objLegacyConvertToJSValue);
        putGeneric(writableArrayCreateArray, objLegacyConvertToJSValue2);
        return writableArrayCreateArray;
    }
}
