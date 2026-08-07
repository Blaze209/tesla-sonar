package expo.modules.kotlin.activityresult;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\u0004\b\u0019\u0010\u0015J#\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\b¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/activityresult/DataPersistor;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "retrieveData", "()Landroid/os/Bundle;", "", Action.KEY_ATTRIBUTE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "addStringArrayList", "(Ljava/lang/String;Ljava/util/ArrayList;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveStringArrayList", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "", "addStringToIntMap", "(Ljava/lang/String;Ljava/util/Map;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveStringToIntMap", "(Ljava/lang/String;)Ljava/util/Map;", "Ljava/io/Serializable;", "addStringToSerializableMap", "retrieveStringToSerializableMap", "addBundle", "(Ljava/lang/String;Landroid/os/Bundle;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveBundle", "(Ljava/lang/String;)Landroid/os/Bundle;", "addSerializable", "(Ljava/lang/String;Ljava/io/Serializable;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveSerializable", "(Ljava/lang/String;)Ljava/io/Serializable;", "Ljn0/h0;", "persist", "()V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "accumulator", "Landroid/os/Bundle;", "retrievedData$delegate", "Lkotlin/Lazy;", "getRetrievedData", "retrievedData", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataPersistor {
    private final Bundle accumulator;

    /* JADX INFO: renamed from: retrievedData$delegate, reason: from kotlin metadata */
    private final Lazy retrievedData;
    private final SharedPreferences sharedPreferences;

    public DataPersistor(Context context) {
        s.k(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        s.j(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
        this.accumulator = new Bundle();
        this.retrievedData = m.b(new wn0.a() { // from class: expo.modules.kotlin.activityresult.d
            @Override // wn0.a
            public final Object invoke() {
                return this.f63340a.retrieveData();
            }
        });
    }

    private final Bundle getRetrievedData() {
        return (Bundle) this.retrievedData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle retrieveData() {
        String string;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (this.sharedPreferences.getLong(DataPersistorKt.EXPIRE_KEY, 0L) > new Date().getTime() && (string = this.sharedPreferences.getString("bundle", null)) != null && (bundle = DataPersistorKt.toBundle(string)) != null) {
            bundle2 = bundle;
        }
        this.sharedPreferences.edit().clear().apply();
        return bundle2;
    }

    public final DataPersistor addBundle(String key, Bundle value) {
        s.k(key, "key");
        s.k(value, "value");
        this.accumulator.putBundle(key, value);
        return this;
    }

    public final DataPersistor addSerializable(String key, Serializable value) {
        s.k(key, "key");
        s.k(value, "value");
        this.accumulator.putSerializable(key, value);
        return this;
    }

    public final DataPersistor addStringArrayList(String key, ArrayList<String> value) {
        s.k(key, "key");
        s.k(value, "value");
        this.accumulator.putStringArrayList(key, value);
        return this;
    }

    public final DataPersistor addStringToIntMap(String key, Map<String, Integer> value) {
        s.k(key, "key");
        s.k(value, "value");
        Bundle bundle = this.accumulator;
        Pair[] pairArr = (Pair[]) v0.F(value).toArray(new Pair[0]);
        bundle.putBundle(key, q5.d.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final DataPersistor addStringToSerializableMap(String key, Map<String, ? extends Serializable> value) {
        s.k(key, "key");
        s.k(value, "value");
        Bundle bundle = this.accumulator;
        Pair[] pairArr = (Pair[]) v0.F(value).toArray(new Pair[0]);
        bundle.putBundle(key, q5.d.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void persist() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("bundle", DataPersistorKt.toBase64(this.accumulator));
        editorEdit.putLong(DataPersistorKt.EXPIRE_KEY, new Date().getTime() + DataPersistorKt.EXPIRATION_TIME);
        editorEdit.commit();
    }

    public final Bundle retrieveBundle(String key) {
        s.k(key, "key");
        return getRetrievedData().getBundle(key);
    }

    public final Serializable retrieveSerializable(String key) {
        s.k(key, "key");
        Bundle retrievedData = getRetrievedData();
        return Build.VERSION.SDK_INT >= 33 ? retrievedData.getSerializable(key, Serializable.class) : retrievedData.getSerializable(key);
    }

    public final ArrayList<String> retrieveStringArrayList(String key) {
        s.k(key, "key");
        return getRetrievedData().getStringArrayList(key);
    }

    public final Map<String, Integer> retrieveStringToIntMap(String key) {
        s.k(key, "key");
        Bundle bundle = getRetrievedData().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        s.h(setKeySet);
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, Integer.valueOf(bundle.getInt((String) obj)));
        }
        return linkedHashMap;
    }

    public final Map<String, Serializable> retrieveStringToSerializableMap(String key) {
        s.k(key, "key");
        Bundle bundle = getRetrievedData().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        s.j(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(set, 10)), 16));
        for (Object obj : set) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                throw new IllegalStateException("For a key '" + str + "' there should be a serializable class available");
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
